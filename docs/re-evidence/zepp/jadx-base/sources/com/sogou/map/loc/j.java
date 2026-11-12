package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class j implements Runnable {
    private /* synthetic */ i a;

    public j(i iVar) {
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.g.e.n();
            this.a.i();
        } catch (Throwable unused) {
        }
    }
}
