package Controller;

import domain.NewsVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewsController {

    @RequestMapping("/")
    public @ResponseBody NewsVO show() {
        NewsVO newsVO = new NewsVO();
        newsVO.setTitle("title 1");
        newsVO.setContent("content 1");
        newsVO.setCategory("category 1");
        return newsVO;
    }
}
