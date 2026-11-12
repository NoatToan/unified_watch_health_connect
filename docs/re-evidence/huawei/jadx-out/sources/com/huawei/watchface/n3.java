package com.huawei.watchface;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes20.dex */
public class n3 implements Runnable, Comparable {
    public static final AtomicLong d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30503a = d.getAndIncrement();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f30504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30505c;

    public n3(Runnable runnable, int i) {
        this.f30504b = runnable;
        this.f30505c = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Runnable runnable) {
        n3 n3Var;
        if (runnable instanceof n3) {
            n3Var = (n3) runnable;
        } else if (runnable instanceof m3) {
            Runnable runnable2 = ((m3) runnable).f30302a;
            if (runnable2 instanceof n3) {
                n3Var = (n3) runnable2;
            } else {
                n3Var = null;
            }
        } else {
            n3Var = null;
        }
        if (n3Var == null) {
            return 0;
        }
        int i = this.f30505c;
        int i2 = n3Var.f30505c;
        if (i != i2) {
            return i2 - i;
        }
        if (n3Var.f30504b != this.f30504b) {
            return this.f30503a < n3Var.f30503a ? -1 : 1;
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f30504b.run();
    }
}
