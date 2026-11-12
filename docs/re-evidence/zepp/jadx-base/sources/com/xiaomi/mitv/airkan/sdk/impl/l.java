package com.xiaomi.mitv.airkan.sdk.impl;

import com.xiaomi.mitv.airkan.sdk.MiAirKan;

/* JADX INFO: loaded from: classes22.dex */
final class l implements Runnable {
    private /* synthetic */ MiAirKan.Callback a;
    private /* synthetic */ k b;

    public l(k kVar, MiAirKan.Callback callback) {
        this.b = kVar;
        this.a = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.e(this.b, this.a);
    }
}
