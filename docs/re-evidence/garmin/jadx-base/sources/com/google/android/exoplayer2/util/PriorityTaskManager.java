package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes14.dex */
public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i14, int i15) {
            StringBuilder sb3 = new StringBuilder(60);
            sb3.append("Priority too low [priority=");
            sb3.append(i14);
            sb3.append(", highest=");
            sb3.append(i15);
            sb3.append("]");
            super(sb3.toString());
        }
    }

    public void add(int i14) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i14));
            this.highestPriority = Math.max(this.highestPriority, i14);
        }
    }

    public void proceed(int i14) {
        synchronized (this.lock) {
            while (this.highestPriority != i14) {
                try {
                    this.lock.wait();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public boolean proceedNonBlocking(int i14) {
        boolean z14;
        synchronized (this.lock) {
            z14 = this.highestPriority == i14;
        }
        return z14;
    }

    public void proceedOrThrow(int i14) {
        synchronized (this.lock) {
            try {
                int i15 = this.highestPriority;
                if (i15 != i14) {
                    throw new PriorityTooLowException(i14, i15);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void remove(int i14) {
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i14));
            this.highestPriority = this.queue.isEmpty() ? Integer.MIN_VALUE : ((Integer) Util.castNonNull(this.queue.peek())).intValue();
            this.lock.notifyAll();
        }
    }
}
