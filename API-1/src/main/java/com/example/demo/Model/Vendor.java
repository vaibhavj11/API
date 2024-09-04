package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vid;
	private String vname;
	private String vcity;
	private String vmob;
	
	public Vendor(int vid, String vname, String vcity, String vmob) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vcity = vcity;
		this.vmob = vmob;
	}

	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVcity() {
		return vcity;
	}

	public void setVcity(String vcity) {
		this.vcity = vcity;
	}

	public String getVmob() {
		return vmob;
	}

	public void setVmob(String vmob) {
		this.vmob = vmob;
	}

	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vname=" + vname + ", vcity=" + vcity + ", vmob=" + vmob + "]";
	}
	
	
	
}
