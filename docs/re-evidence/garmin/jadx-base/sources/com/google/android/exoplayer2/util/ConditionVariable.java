package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes14.dex */
public class ConditionVariable {
    private final Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
        this(Clock.DEFAULT);
    }

    public synchronized boolean block(long j8) {
        try {
            if (j8 <= 0) {
                return this.isOpen;
            }
            long jElapsedRealtime = this.clock.elapsedRealtime();
            long j14 = j8 + jElapsedRealtime;
            if (j14 < jElapsedRealtime) {
                block();
            } else {
                while (!this.isOpen && jElapsedRealtime < j14) {
                    wait(j14 - jElapsedRealtime);
                    jElapsedRealtime = this.clock.elapsedRealtime();
                }
            }
            return this.isOpen;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z14 = false;
        while (!this.isOpen) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z14 = true;
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean close() {
        boolean z14;
        z14 = this.isOpen;
        this.isOpen = false;
        return z14;
    }

    public synchronized boolean isOpen() {
        return this.isOpen;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public ConditionVariable(Clock clock) {
        this.clock = clock;
    }

    public synchronized void block() {
        while (!this.isOpen) {
            wait();
        }
    }
}
