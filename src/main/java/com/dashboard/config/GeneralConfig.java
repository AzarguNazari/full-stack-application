package com.dashboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

@Configuration
public class GeneralConfig {

//    @Bean
//    MultipartConfigElement multipartConfigElement() {
//        return new MultipartConfigElement("");
//    }

//    @Bean
//    ResourceAssembler<Employee, Resource<Employee>> userResourceAssembler() {
//        return (u) -> {
//            try {
//                String customersRel = "customers", photoRel = "photo";
//                Employee user = new Employee(u);
//                user.setPassword(null);
//                long userId = user.getId();
//                Collection<Link> links = new ArrayList<>();
//                links.add(linkTo(methodOn(EmployeeController.class).loadUser(userId)).withSelfRel());
//                links.add(linkTo(methodOn(EmployeeController.class).loadUserCustomers(userId)).withRel(customersRel));
//                return new Resource<>(user, links);
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        };
}
