package org.comstudy.Member.controller;

import org.comstudy.model.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
	// 회원가입 페이지 출력 요청
	
	
	@GetMapping("/member/save")
	public String saveForm() {
		return "save";
	}
	
	@PostMapping("/member/save")
	public String save (@ModelAttribute MemberDTO memberDto){
		
		//System.out.println(">>>>>>. MemberController.save");
		System.out.println(">>>>>> MemberDTO : " + memberDto);
		
		return "index";
	}
}
