package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class n implements Runnable {
    private /* synthetic */ m a;
    private final /* synthetic */ SGLocation b;

    public n(m mVar, SGLocation sGLocation) {
        this.a = mVar;
        this.b = sGLocation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a.a.c(this.b);
        } catch (Throwable unused) {
        }
    }
}
