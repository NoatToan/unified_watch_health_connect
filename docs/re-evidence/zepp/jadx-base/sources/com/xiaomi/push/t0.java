package com.xiaomi.push;

/* JADX INFO: loaded from: classes22.dex */
class t0 implements Runnable {
    public final /* synthetic */ C1648r.b a;
    public final /* synthetic */ C1648r b;

    public t0(C1648r c1648r, C1648r.b bVar) {
        this.b = c1648r;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.a(this.a);
    }
}
