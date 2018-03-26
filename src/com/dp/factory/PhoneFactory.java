package com.dp.factory;

public class PhoneFactory {
    public static Phone getPhone(PhoneType phoneType) {
        switch (phoneType) {
            case ANDDROID:
                return new AndroidPhone();
            case IPHONE:
                return new IPhone();
            default:
                return null;
        }
    }
}
