package com.huami.tools.analytics.internal.utils;

/* JADX INFO: loaded from: classes15.dex */
public class DefaultClock implements Clock {
    private static final DefaultClock a = new DefaultClock();

    private DefaultClock() {
    }

    public static Clock get() {
        return a;
    }

    @Override // com.huami.tools.analytics.internal.utils.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
