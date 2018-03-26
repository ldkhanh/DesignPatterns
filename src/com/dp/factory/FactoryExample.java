package com.dp.factory;

public class FactoryExample {
    public static void main(String[] args) {
        Phone android = PhoneFactory.getPhone(PhoneType.ANDDROID);
        Phone iphone = PhoneFactory.getPhone(PhoneType.IPHONE);
        Phone iphone2 = PhoneFactory.getPhone(PhoneType.IPHONE);

        System.out.println(android);
        System.out.println(iphone);
        System.out.println(iphone2);

        /*  Example
        *  1. Calendar :
        *       Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        *  2. NumberFormat
        * */
    }
}
