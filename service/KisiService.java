package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Kisi;
import repository.KisiRepository;

@Service
public class KisiService {

	public static KisiRepository kisiRepository;
	
	// DI: Dependency Injection    olmazsa tightly coopling  siki sikiya bagli olursu
	 @Autowired // baslangicta olusturmaz, ihtiyac oldugunda olusturur, böylece bellek iyi olur
	public KisiService(KisiRepository kisiRepository) {
		this.kisiRepository = kisiRepository; 
	}
	 public List<Kisi> tumKisileriGetir() {
		 return kisiRepository.findAll();
	 }
}
