// package th.ac.ku.atm.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.ViewResolver;
// import org.springframework.web.servlet.config.annotation.EnableWebMvc;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
// import org.thymeleaf.spring5.SpringTemplateEngine;
// import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
// import org.thymeleaf.spring5.view.ThymeleafViewResolver;

// @Configuration
// @EnableWebMvc
// public class WebConfig implements WebMvcConfigurer {
    
//     @Bean
//     public ViewResolver viewResolver() {
//         ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//         resolver.setTemplateEngine(templateEngine());
//         resolver.setCharacterEncoding("UTF-8");
//         return resolver;
//     }

//     @Bean
//     public SpringResourceTemplateResolver templateResolver() {
//         SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
//         resolver.setPrefix("/");
//         resolver.setSuffix(".html");
//         resolver.setTemplateMode("HTML");
//         resolver.setCharacterEncoding("UTF-8");
//         return resolver;
//     }

//     @Bean
//     public SpringTemplateEngine templateEngine() {
//         SpringTemplateEngine engine = new SpringTemplateEngine();
//         engine.setTemplateResolver(templateResolver());
//         return engine;
//     }
// }
