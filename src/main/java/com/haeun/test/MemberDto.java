package com.haeun.test;

//Dto - 값(멤버변수)들을 한번에 저장할 데이터 구조(데이터 이동 객체)
public class MemberDto {
	
	private String name;
	private String id;
	private String pw;
	private String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}