package cn.wzbos.android.rudolph.annotations;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Route {

    String value() default "";

    String tag() default "";

    boolean export() default false;

    boolean singleton() default false;

    Class<?> clazz() default Object.class;
}
