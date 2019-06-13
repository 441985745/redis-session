package com.example.redis.redissession;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;

        import javax.servlet.http.HttpServletRequest;
@Controller
public class TestController {
    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request){
        request.getSession().setAttribute("userid","2");
        return "ok";
    }

    @RequestMapping("/getUserId")
    @ResponseBody
    public String getUserId(HttpServletRequest request){
        System.out.println("=======================UserId:"+request.getSession().getAttribute("userid"));
        return (String) request.getSession().getAttribute("userid");
    }
}
