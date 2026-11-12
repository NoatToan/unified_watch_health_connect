package com.sogou.map.loc;

import android.location.GpsStatus;

/* JADX INFO: loaded from: classes18.dex */
final class g1 implements GpsStatus.Listener {
    private /* synthetic */ f1 a;

    public g1(f1 f1Var) {
        this.a = f1Var;
    }

    @Override // android.location.GpsStatus.Listener
    public final void onGpsStatusChanged(int i) {
        if (i != 3) {
            return;
        }
        this.a.f = j0.q();
    }
}
