package com.google.android.exoplayer2.util;

import defpackage.wlq;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class PriorityTaskManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8442a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue<Integer> f8443b = new PriorityQueue<>(10, Collections.reverseOrder());
    public int c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i, int i2) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Priority too low [priority=");
            sb.append(i);
            sb.append(", highest=");
            sb.append(i2);
            sb.append("]");
            super(sb.toString());
        }
    }

    public void a(int i) {
        synchronized (this.f8442a) {
            this.f8443b.add(Integer.valueOf(i));
            this.c = Math.max(this.c, i);
        }
    }

    public void b(int i) throws PriorityTooLowException {
        synchronized (this.f8442a) {
            try {
                if (this.c != i) {
                    throw new PriorityTooLowException(i, this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(int i) {
        synchronized (this.f8442a) {
            this.f8443b.remove(Integer.valueOf(i));
            this.c = this.f8443b.isEmpty() ? Integer.MIN_VALUE : ((Integer) wlq.j(this.f8443b.peek())).intValue();
            this.f8442a.notifyAll();
        }
    }
}
