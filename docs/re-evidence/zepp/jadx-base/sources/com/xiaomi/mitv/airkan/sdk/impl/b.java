package com.xiaomi.mitv.airkan.sdk.impl;

/* JADX INFO: loaded from: classes22.dex */
final class b implements Runnable {
    private /* synthetic */ int a;
    private /* synthetic */ a b;

    public b(a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.b(this.b, this.a);
    }
}
