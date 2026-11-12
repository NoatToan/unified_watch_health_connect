package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class PriorityTaskManager {
    private final Object a = new Object();
    private final PriorityQueue<Integer> b = new PriorityQueue<>(10, Collections.reverseOrder());
    private int c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int priority, int highestPriority) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Priority too low [priority=");
            sb.append(priority);
            sb.append(", highest=");
            sb.append(highestPriority);
            sb.append("]");
            super(sb.toString());
        }
    }

    public void add(int priority) {
        synchronized (this.a) {
            this.b.add(Integer.valueOf(priority));
            this.c = Math.max(this.c, priority);
        }
    }

    public void proceed(int priority) throws InterruptedException {
        synchronized (this.a) {
            while (this.c != priority) {
                this.a.wait();
            }
        }
    }

    public boolean proceedNonBlocking(int priority) {
        boolean z;
        synchronized (this.a) {
            z = this.c == priority;
        }
        return z;
    }

    public void proceedOrThrow(int priority) throws PriorityTooLowException {
        synchronized (this.a) {
            if (this.c != priority) {
                throw new PriorityTooLowException(priority, this.c);
            }
        }
    }

    public void remove(int priority) {
        synchronized (this.a) {
            this.b.remove(Integer.valueOf(priority));
            this.c = this.b.isEmpty() ? Integer.MIN_VALUE : ((Integer) Util.castNonNull(this.b.peek())).intValue();
            this.a.notifyAll();
        }
    }
}
