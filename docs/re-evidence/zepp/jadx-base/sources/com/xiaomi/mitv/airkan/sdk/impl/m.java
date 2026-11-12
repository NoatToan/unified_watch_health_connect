package com.xiaomi.mitv.airkan.sdk.impl;

/* JADX INFO: loaded from: classes22.dex */
final class m implements Runnable {
    private /* synthetic */ byte[] a;
    private /* synthetic */ k b;

    public m(k kVar, byte[] bArr) {
        this.b = kVar;
        this.a = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.f(this.b, this.a);
    }
}
