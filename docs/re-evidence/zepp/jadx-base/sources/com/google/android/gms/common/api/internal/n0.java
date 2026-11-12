package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes3.dex */
final class n0 implements Runnable {
    private final /* synthetic */ zak a;
    private final /* synthetic */ zace b;

    public n0(zace zaceVar, zak zakVar) {
        this.b = zaceVar;
        this.a = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c(this.a);
    }
}
