package com.xiaomi.smarthome.service;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public enum CardActive {
    instance;

    private AtomicInteger count = new AtomicInteger();

    CardActive() {
    }

    public void create() {
        this.count.incrementAndGet();
    }

    public void destory() {
        this.count.decrementAndGet();
    }

    public boolean isActive() {
        return this.count.get() > 0;
    }
}
