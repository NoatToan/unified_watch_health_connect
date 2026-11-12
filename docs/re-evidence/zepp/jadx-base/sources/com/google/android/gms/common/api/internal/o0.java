package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes3.dex */
final class o0 implements Runnable {
    private final /* synthetic */ zace a;

    public o0(zace zaceVar) {
        this.a = zaceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h.zaa(new ConnectionResult(4));
    }
}
