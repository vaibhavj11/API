package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Vendor;
import com.example.demo.Service.VendorService;

@RestController
public class VendorController {

	@Autowired
	VendorService vs;
	
	Vendor vendor;
	
    @GetMapping("/vendorInfo/{vid}")
	public Vendor getVendorInfo(Integer vid) {
		
		return new Vendor(11,"Vaibhav","Pune","8333565130"); 
	}
    
    @GetMapping("/get")
    public List<Vendor> getAllVendor(@RequestBody Vendor vendor){
    	
    	return this.vs.getAllVendors() ;
    }
    
    //This is another get mapping for retrieving the vendor details after post mapping
    
    @GetMapping("/getVendor/{vid}")
    public Vendor getVendor(Integer vid) {
    	
    	return vendor;
    }
    

    @PostMapping("/addVendor")
    public String addVendor(@RequestBody Vendor vendor) {
    	
    	this.vendor = vendor;
    	
    	vs.addVendor(vendor);
    	
    	return "Vendor Added Successfully !";
    }
	
    @PutMapping("/update")
    public String updateVendor(@RequestBody Vendor vendor) {
    	
    	this.vendor = vendor;
    	
    	this.vs.saveChange(vendor);
    	
    	return "Vendor details updated Successfully !";
    	
    }
    
}
