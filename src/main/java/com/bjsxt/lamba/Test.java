package com.bjsxt.lamba;

/**
 * @Auther: liuxw
 * @Date: 2021-03-28
 * @Description: com.bjsxt.lamba
 * @version: 1.0
 */
@FunctionalInterface
interface NoReturnNoParam{
    void method();

}

@FunctionalInterface
interface NoReturnOneParam{
    void method(int a);
}
/**
 * 无返回值，有多个参数
 */
@FunctionalInterface
interface NoReturnMultiParam{
    void method(int a,int b);
}
/**
 * 有返回值，无参数
 */
@FunctionalInterface
interface ReturnNoParam{
    int method();
}
/**
 * 有返回值，有一个参数
 */
@FunctionalInterface
interface ReturnOneParam{
    int method(int a);
}
/**
 * 有返回值，有多个参数
 */
@FunctionalInterface
interface ReturnMultiParam{
    int method(int a,int b);
}
public class Test {

    public static void main(String[] args) {
        /**
         * 无返回值，无参数
         */
        NoReturnNoParam noReturnNoParam = () ->{
            System.out.println("NoReturnNoParam");
        };
        noReturnNoParam.method();
        /**
         * 无返回值，有一个参数
         */
        NoReturnOneParam noReturnOneParam =(int a)->{
            System.out.println("noReturnOneParam"+a);
        };
        noReturnOneParam.method(10);

        /**
         * 无返回值，有多个参数
         */

        NoReturnMultiParam noReturnMultiParam = (int a,int b)->{
            System.out.println("noReturnMultiParam"+a+"\t"+b);
        };
        noReturnMultiParam.method(10,20);

        /**
         * 有返回值，无参数
         */

        ReturnNoParam returnNoParam = ()->{
            System.out.print("ReturnNoParam");
            return 10;
        };
        System.out.println(returnNoParam.method());

        /**
         * 有返回值，有一个参数
         */

        ReturnOneParam returnOneParam = (int a)->{
            System.out.print("returnOneParam");
            return a;
        };
        System.out.println(returnOneParam.method(10));

        /**
         * 有返回值，有多个参数
         */

        ReturnMultiParam returnMultiParam = (int a,int b)->{
            System.out.print("ReturnMultiParam");
            return a+b;
        };
        System.out.println(returnMultiParam.method(10,20));
    }
}
