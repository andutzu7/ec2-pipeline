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
                "Они молчат, лишь видят мув, мой step стал большим " +
                "И с каждым днём жирнее грув, скажи мне, кто ты? " +
                "Пока за нас орут, кричат эти банкноты " +
                "Окей, настал мой час, и эта сука даёт горло " +
                "Тупой ублюдок любит нас, ведь это стало модно " +
                "И кто бы мог подумать? Новичок стал делать порно " +
                "Ха, hold up, сука знает, мой стилёк стал весить тонну " +
                "Back in stu', I mean it, 808 толкает волну " +
                "[Куплет] " +
                "Я, hello, мир, manera крутит мир " +
                "В дабл капе мои заны, а в другой держу свой bean " +
                "У, я, погоди, I'm swervin' shit один " +
                "И мне так похуй, я застрял средь этих паутин " +
                "М, м, они говорят мне, что я в норме " +
                "М, м, драги вроде молчат, но тоже помнят " +
                "М, м, я бы мог подумать, что я в норме " +
                "М, м, почему я просыпаюсь снова? " +
                "Снова человек, чьи чувства на Айфонах " +
                "Снова человек, к кому я чую холод " +
                "Снова человек, который хочет доллар " +
                "Снова человек, который чует холод " +
                "</p>";

    }
}
