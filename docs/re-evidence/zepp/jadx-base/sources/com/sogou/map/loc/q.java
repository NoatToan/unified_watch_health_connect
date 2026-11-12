package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class q implements Runnable {
    private /* synthetic */ p a;

    public q(p pVar) {
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.d = true;
            if (this.a.e.h()) {
                return;
            }
            this.a.a.c(this.a.c);
        } catch (Throwable unused) {
        }
    }
}
