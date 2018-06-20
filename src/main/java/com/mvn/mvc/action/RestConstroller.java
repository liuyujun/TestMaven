package com.mvn.mvc.action;

import Limit.ServiceLimit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName RestConstroller
 * @Description TODO
 * @author yujun.liu
 * @date 2017-7-6 上午11:39:20
 */
@Controller  
public class RestConstroller {  
    public RestConstroller() {}  
    @RequestMapping(value = "/login/{user}", method = RequestMethod.GET)  
    public ModelAndView myMethod(HttpServletRequest request,HttpServletResponse response,   
            @PathVariable("user") String user, ModelMap modelMap) throws Exception {  
        modelMap.put("loginUser", user);
        for (int i = 0; i < 20000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    startSeckil();
                }
            }).start();

        }
        return new ModelAndView("/login/hello", modelMap);  
    }  
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)  
    public String registPost() {  
        return "/welcome";  
    }

    @ServiceLimit
    public static String startSeckil() {
        return new String(Thread.currentThread().getName()+" success");
    }
} 
