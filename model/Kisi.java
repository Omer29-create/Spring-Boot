package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // tablo olacagi icin
@Table(name="kisiler")
@Data
@NoArgsConstructor
public class Kisi {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // otomatik Id vermesi icin
	private Integer id;
	private String ad;
	private String soyad;
	private int yas;
}
