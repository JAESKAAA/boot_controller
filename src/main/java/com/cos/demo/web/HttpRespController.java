package com.cos.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//파일을 리턴할 것이기 때문에 컨트롤러 어노테이션 사용
//view만 리턴하는 것으로 알고 있었는데, file을 리턴하는 것임 !!
@Controller
public class HttpRespController {

	@GetMapping("/txt")
	public String txt() {
		return "a.txt"; // 프레임워크는 파일구조가 정해져있음. 따라서 정적파일은 전부 resource/static으로!!
	}
	
	@GetMapping("/mus")
	public String mus() {
		return "b"; 
		//static폴더에 b.mustache로 놓으면 정적파일로 인식해 톰캣서버를 거치지 않음 -> 이는 브라우저는 .mustache라는 확장자를 읽을수없어 다운로드 처리됨
		//하지만, templates에 옮기면 현재 mustache 라이브러리를 등록 완료된 상태라 templates에서 mustache 파일을 자동으로 찾아 브라우저에 표출해줌(확장자 없어도 찾아감)
		//머스태치는 viewResolver 설정이 자동으로 되어있음 (스프링부트에서 디폴트로 설정되어있음)
	}
	
	@GetMapping("/jsp")
	public String jsp() {
		return "c";
		//jsp사용시 src/main/webapp 폴더가 디폴트 경로임
		//여기에 WEB-INF/views 하위에 jsp가 놓일 것이므로 설정할때 /WEB-INF부터 prefix로 설정해줘야 정상적으로 인식함
		//ex. /WEB-INF/views/c.jsp (ViewResolver)
		//jsp의 경우 스프링부트에서 지원을 안하기 때문에 커스텀으로 설정해줘야 하는 것임
	}
}
