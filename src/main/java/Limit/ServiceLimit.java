package Limit;

/**
 * author: yujun.liu@luckincoffee.com
 * createBy: 2018/6/15 15:43
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解  限流
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public  @interface ServiceLimit {
    String description()  default "";
}
