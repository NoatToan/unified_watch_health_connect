package com.sogou.map.loc;

import android.os.Build;
import android.os.Handler;

/* JADX INFO: loaded from: classes18.dex */
final class j1 implements Runnable {
    private /* synthetic */ f1 a;

    public j1(f1 f1Var) {
        this.a = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Handler handlerE = this.a.e();
            if (f1.m && handlerE != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    this.a.b.requestLocationUpdates("passive", 0L, 10.0f, this.a.k);
                    this.a.b.requestLocationUpdates("passive", 5000L, 5.0f, this.a.l, handlerE.getLooper());
                } else {
                    this.a.b.requestLocationUpdates("passive", 10800000L, 10.0f, this.a.k);
                    this.a.b.requestLocationUpdates("passive", 10800000L, 5.0f, this.a.l, handlerE.getLooper());
                }
            }
        } catch (Exception unused) {
        }
        try {
            this.a.b.addGpsStatusListener(this.a.j);
        } catch (Exception unused2) {
        }
    }
}
