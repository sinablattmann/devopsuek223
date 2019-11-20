package ch.noseryoung.blj.devops223;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @GetMapping("/")
  public ResponseEntity<String> helloWorld(){
    return new ResponseEntity<>("Hello World", HttpStatus.OK);
  }
}
