package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes3.dex */
final class b1 implements Runnable {
    private final /* synthetic */ c1 a;

    public b1(c1 c1Var) {
        this.a = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.m.lock();
        try {
            this.a.r();
        } finally {
            this.a.m.unlock();
        }
    }
}
