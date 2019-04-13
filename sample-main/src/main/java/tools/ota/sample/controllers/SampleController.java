package tools.ota.sample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	@GetMapping("/main")
	public String getDefaultString(Model model){
		model.addAttribute("message", "this is the world.");
		return "main";
	}
}
