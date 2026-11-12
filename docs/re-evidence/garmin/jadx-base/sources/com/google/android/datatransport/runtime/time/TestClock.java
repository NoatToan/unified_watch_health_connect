package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public class TestClock implements Clock {
    private final AtomicLong timestamp;

    public TestClock(long j8) {
        this.timestamp = new AtomicLong(j8);
    }

    public void advance(long j8) {
        if (j8 >= 0) {
            this.timestamp.addAndGet(j8);
        } else {
            h.s("cannot advance time backwards.");
        }
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return this.timestamp.get();
    }

    public void tick() {
        advance(1L);
    }
}
