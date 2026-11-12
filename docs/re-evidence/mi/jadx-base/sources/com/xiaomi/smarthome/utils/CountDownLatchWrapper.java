package com.xiaomi.smarthome.utils;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public class CountDownLatchWrapper<T> extends CountDownLatch {
    private static final int COUNT = 1;
    private T mResult;

    public CountDownLatchWrapper(T t) {
        super(1);
        this.mResult = t;
    }

    public void exitBlock(T t) {
        this.mResult = t;
        countDown();
    }

    public T getResult() {
        return this.mResult;
    }
}
