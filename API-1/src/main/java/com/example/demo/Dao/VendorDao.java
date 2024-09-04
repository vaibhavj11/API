package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Vendor;
import com.example.demo.Repo.VendorRepo;
import com.example.demo.Service.VendorService;

@Service
public class VendorDao implements VendorService{

	@Autowired
	VendorRepo vr;

	@Override
	public void addVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		vr.save(vendor);
	}

	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}

	public void saveChange(Vendor vendor) {
		// TODO Auto-generated method stub
		vr.save(vendor);
	}
	
}
