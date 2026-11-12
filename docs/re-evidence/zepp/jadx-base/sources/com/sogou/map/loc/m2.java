package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class m2 implements Runnable {
    private /* synthetic */ SGLocClient a;

    public m2(SGLocClient sGLocClient) {
        this.a = sGLocClient;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.p = true;
            r0.b(this.a + ".singleRun.run()");
            this.a.g.a().a(new o2(this, new n2(this)));
        } catch (Throwable unused) {
        }
    }
}
