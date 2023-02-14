package com.wang.fried.store.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  /**
   * 存储
   * @return
   */
  @GetMapping("/hello")
  public String hello() {
    return "hello 。。";
  }

}
