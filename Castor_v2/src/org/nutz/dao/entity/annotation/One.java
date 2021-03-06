package org.nutz.dao.entity.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在一个字段上声明一条一对一映射，这个声明需要你输入两个参数:
 * <ul>
 * <li><b>target</b>: 你的这个字段对应的实体类。通常，这个类得是你的字段的一个子类或者实现类。或者它能够顺利的通过 Nutz.castor
 * 转换成 你的字段
 * <li><b>field</b>: 参考字段名，这个字段为对应对象的 Java 字段名称。
 * </ul>
 * 
 * @author zozoh(zozohtnt@gmail.com)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface One {

	Class<?> target();

	String field();

}
