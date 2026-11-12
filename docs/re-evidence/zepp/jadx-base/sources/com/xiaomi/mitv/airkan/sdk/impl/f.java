package com.xiaomi.mitv.airkan.sdk.impl;

/* JADX INFO: loaded from: classes22.dex */
final class f implements Runnable {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ String c;
    private /* synthetic */ e d;

    public f(e eVar, int i, int i2, String str) {
        this.d = eVar;
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.f.onResult(this.a, this.b, this.c);
    }
}
