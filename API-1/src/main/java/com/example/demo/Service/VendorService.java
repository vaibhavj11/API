package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.Vendor;
import com.example.demo.Repo.VendorRepo;

public interface VendorService {


	void addVendor(Vendor vendor);

	List<Vendor> getAllVendors();

	void saveChange(Vendor vendor);
	
	
}
