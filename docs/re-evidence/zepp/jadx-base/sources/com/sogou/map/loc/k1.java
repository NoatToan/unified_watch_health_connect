package com.sogou.map.loc;

import android.os.Handler;

/* JADX INFO: loaded from: classes18.dex */
final class k1 implements Runnable {
    private /* synthetic */ f1 a;
    private final /* synthetic */ Handler b;

    public k1(f1 f1Var, Handler handler) {
        this.a = f1Var;
        this.b = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (f1.m) {
                this.a.b.removeUpdates(this.a.k);
                this.a.b.removeUpdates(this.a.l);
            }
        } catch (Exception unused) {
        }
        try {
            this.a.b.removeGpsStatusListener(this.a.j);
        } catch (Exception unused2) {
        }
        j0.i(this.b);
    }
}
