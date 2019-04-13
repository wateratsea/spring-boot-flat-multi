package tools.ota.sample.secure.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping({"/", "/index"})
	public String index() {
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/success")
	public String success() {
		return "redirect:/main";
	}
	@RequestMapping("/logout")
	public String logout() {
		return "redirect:/index";
	}
}
