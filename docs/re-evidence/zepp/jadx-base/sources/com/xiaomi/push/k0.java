package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
class k0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ bz b;

    public k0(bz bzVar, String str) {
        this.b = bzVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        ak.a().a(this.a, true);
    }
}
