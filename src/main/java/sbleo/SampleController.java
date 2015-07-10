package sbleo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("")
	@ResponseBody
	String home() {
		return home("");
	}
	
    @RequestMapping("/{name}")
    @ResponseBody
    String home(@PathVariable String name) {
        return "Hello World " + name;
    }
}
