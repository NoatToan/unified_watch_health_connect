package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public class ConditionVariable {
    private final Clock a;
    private boolean b;

    public ConditionVariable() {
        this(Clock.DEFAULT);
    }

    public synchronized void block() throws InterruptedException {
        while (!this.b) {
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean close() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public synchronized boolean isOpen() {
        return this.b;
    }

    public synchronized boolean open() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public ConditionVariable(Clock clock) {
        this.a = clock;
    }

    public synchronized boolean block(long timeoutMs) throws InterruptedException {
        try {
            if (timeoutMs <= 0) {
                return this.b;
            }
            long jElapsedRealtime = this.a.elapsedRealtime();
            long j = timeoutMs + jElapsedRealtime;
            if (j < jElapsedRealtime) {
                block();
            } else {
                while (!this.b && jElapsedRealtime < j) {
                    wait(j - jElapsedRealtime);
                    jElapsedRealtime = this.a.elapsedRealtime();
                }
            }
            return this.b;
        } catch (Throwable th) {
            throw th;
        }
    }
}
