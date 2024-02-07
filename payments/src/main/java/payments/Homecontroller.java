package payments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Homecontroller {

	
		@RequestMapping("/login")
		public ModelAndView getPage() {
			ModelAndView mv= new ModelAndView();
			mv.setViewName("login");
			return mv;
		}
		@RequestMapping("/register")
		public ModelAndView getPage1() {
			ModelAndView mv= new ModelAndView();
			mv.setViewName("Register");
			return mv;
		}
}
