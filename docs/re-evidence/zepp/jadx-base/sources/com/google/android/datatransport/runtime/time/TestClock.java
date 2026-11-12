package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class TestClock implements Clock {
    private final AtomicLong a;

    public TestClock(long j) {
        this.a = new AtomicLong(j);
    }

    public void advance(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("cannot advance time backwards.");
        }
        this.a.addAndGet(j);
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return this.a.get();
    }

    public void tick() {
        advance(1L);
    }
}
