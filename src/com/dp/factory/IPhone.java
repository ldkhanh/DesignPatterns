package com.dp.factory;

public class IPhone extends Phone {
    @Override
    protected void createPhone() {
        specifications.add(new IPhoneCamera());
        specifications.add(new IPhonePanel());
        specifications.add(new IPhoneProcessor());
    }
}
