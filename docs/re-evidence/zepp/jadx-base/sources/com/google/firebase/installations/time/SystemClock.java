package com.google.firebase.installations.time;

/* JADX INFO: loaded from: classes3.dex */
public class SystemClock implements Clock {
    private static SystemClock a;

    private SystemClock() {
    }

    public static SystemClock getInstance() {
        if (a == null) {
            a = new SystemClock();
        }
        return a;
    }

    @Override // com.google.firebase.installations.time.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
