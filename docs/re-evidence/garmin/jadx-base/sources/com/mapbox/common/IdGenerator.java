package com.mapbox.common;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
class IdGenerator {
    private static final AtomicLong counter = new AtomicLong();

    public static long getNewId() {
        return counter.incrementAndGet();
    }
}
