/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author yanpa
 */
@Interceptor @Logger
public class LoggerInterceptor {
    @AroundInvoke
    public Object log(InvocationContext context)throws Exception{
        System.out.println("Before"+context.getMethod().getName());
        try {
            return context.proceed();
        } finally{
            System.out.println("After"+context.getMethod().getName());
        }
    }
}
