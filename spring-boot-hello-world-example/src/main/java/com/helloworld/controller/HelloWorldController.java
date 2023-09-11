package com.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String hello() {
        return "<h1> Congratulations. You have successfully deployed the sample Spring Boot Application. </h1>";
    }

    @RequestMapping("/fire")
    public String spitFire() {


        return "<p> " +
                "Они молчат, лишь видят мув, мой step стал большим<br> " +
                "И с каждым днём жирнее грув, скажи мне, кто ты? <br> " +
                "Пока за нас орут, кричат эти банкноты <br> " +
                "Окей, настал мой час, и эта сука даёт горло <br> " +
                "Тупой ублюдок любит нас, ведь это стало модно <br> " +
                "И кто бы мог подумать? Новичок стал делать порно <br> " +
                "Ха, hold up, сука знает, мой стилёк стал весить тонну <br> " +
                "Back in stu', I mean it, 808 толкает волну <br> " +
                "[Куплет] <br> " +
                "Я, hello, мир, manera крутит мир <br> " +
                "В дабл капе мои заны, а в другой держу свой bean <br> " +
                "У, я, погоди, I'm swervin' shit один <br> " +
                "И мне так похуй, я застрял средь этих паутин <br> " +
                "М, м, они говорят мне, что я в норме <br> " +
                "М, м, драги вроде молчат, но тоже помнят <br> " +
                "М, м, я бы мог подумать, что я в норме <br> " +
                "М, м, почему я просыпаюсь снова? <br> " +
                "Снова человек, чьи чувства на Айфонах <br> " +
                "Снова человек, к кому я чую холод <br> " +
                "Снова человек, который хочет доллар <br> " +
                "Снова человек, который чует холод <br> " +
                "</p>";

    }
}
