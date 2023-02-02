package shop.mtcoding.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("board/writeForm")
    public String writeForm() {
        return "board/writeForm";
    }

    @GetMapping("/main")
    public String main() {
        return "board/main";
    }

    @GetMapping("board/detail")
    public String detail() {
        return "board/detail";
    }

    @GetMapping("board/updateForm")
    public String updateForm() {
        return "board/updateForm";
    }

}
