package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes23.dex */
public class ThresholdCircuitBreaker extends AbstractCircuitBreaker<Long> {
    private static final long d = 0;
    private final long b;
    private final AtomicLong c = new AtomicLong(0);

    public ThresholdCircuitBreaker(long j) {
        this.b = j;
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean checkState() throws CircuitBreakingException {
        return isOpen();
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public void close() {
        super.close();
        this.c.set(0L);
    }

    public long getThreshold() {
        return this.b;
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean incrementAndCheckState(Long l) throws CircuitBreakingException {
        if (this.b == 0) {
            open();
        }
        if (this.c.addAndGet(l.longValue()) > this.b) {
            open();
        }
        return checkState();
    }
}
