/** 
* @author  wangjiuyang 
* @date 2017年10月19日 下午11:10:56 
* @version 1.0 */

package com.example.demo.hello;



import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;;
  

@RestController
@EnableAutoConfiguration
public class HelloController {

	@RequestMapping("/")
	public String helloworld() {
		return "Hello world!";
	}
	
	@RequestMapping("/hello/{name}")
	public String hellName(@PathVariable String name) {
		return "Hello "+name;
	}
}
