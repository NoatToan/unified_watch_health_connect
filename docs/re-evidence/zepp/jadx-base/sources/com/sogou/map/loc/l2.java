package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class l2 implements Runnable {
    private /* synthetic */ SGLocClient a;

    public l2(SGLocClient sGLocClient) {
        this.a = sGLocClient;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.tryRmvGpsKeeper();
        this.a.h.removeCallbacks(this.a.t);
        try {
            if (this.a.u != null) {
                this.a.u.f(new SGLocation(2, "WATCH_CLEAR"));
                this.a.u = null;
            }
        } catch (Throwable unused) {
        }
    }
}
