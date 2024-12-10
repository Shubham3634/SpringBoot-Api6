package com.Tka.Api7.SpringBoot;

public class Country {

	private int cid;
	private String cname;

	public Country(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
