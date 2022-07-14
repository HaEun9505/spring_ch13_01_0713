package com.haeun.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//Dispatcher에서 전달된 요청을 처리
@Controller
public class FormController {
	@RequestMapping("/login")
	//요청 처리 메소드
	public String login() {
		return "login";	//view의 이름
	}
	
//	@RequestMapping("/loginOk")
//	//request(파라미터 값 받을 객체),	Model(데이터를 담아 view로 전달하는 객체)
//	public String loginOk(HttpServletRequest request, Model model) {	
//		
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		
//		model.addAttribute("id", "tiger");
//		model.addAttribute("pw", "12345");
//		
//		return "loginOk";	//view의 이름
//	}
	
	@RequestMapping("/loginOk")
	//@RequestParam(데이터 객체) 어노테이션을 이용해서 데이터를 전송
	public String loginOk(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {	
		
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
		
		model.addAttribute("id", "tiger");
		model.addAttribute("pw", "12345");
		
		return "loginOk";	//view 이름
	}
	@RequestMapping("/join")
	public String join() {
		return "join";
	}
	
//	@RequestMapping("/joinOk")
//	//@RequestParam(데이터 객체) 어노테이션을 이용해서 데이터를 전송
//	public String joinOk(@RequestParam("name") String name, 
//			@RequestParam("id") String id, @RequestParam("pw") String pw,
//			@RequestParam("email") String email, Model model) {
//		return "joinOk";
//	}
	
	@RequestMapping("/joinOk")	//JoinOk가 오면
	//MemberDto로 만든 데이터 객체 view(jsp)에 전달
	public String joinOk(MemberDto memberDto) {
		
		//model 생략 가능
//		model.addAttribute("memberDto", memberDto);
		
		return "joinOk";
	}
	@RequestMapping("/member/{memberNum}")
	public String memberNumber(@PathVariable String memberNum, Model model) {
		model.addAttribute("membernum", memberNum);
		return "memberNumber";
	}
}