import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        //route to take us to homepage
        get("/",(request,respond)->{
            Map<String,Object>model=new HashMap<>();
            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());


        //route for get started button to take us to about page
        get("/about",(request,respond)->{
            Map<String,Object>model=new HashMap<>();
            return new ModelAndView(model,"about.hbs");
        }, new HandlebarsTemplateEngine());


    }
}
