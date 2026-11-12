package com.xiaomi.ai;

/* JADX INFO: loaded from: classes18.dex */
class l implements Runnable {
    public final /* synthetic */ c.e a;

    public l(c.e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.a.c()) {
            this.a.b();
        }
        this.a.b.clear();
    }
}
