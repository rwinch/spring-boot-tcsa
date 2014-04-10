@RestController
class HelloController {
	@RequestMapping("/")
	String hello(String name) {
		"Hello $name"
	}
}