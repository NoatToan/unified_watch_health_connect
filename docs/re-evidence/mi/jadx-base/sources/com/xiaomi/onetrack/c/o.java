package com.xiaomi.onetrack.c;

/* JADX INFO: loaded from: classes11.dex */
class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f13855a;

    public o(n nVar) {
        this.f13855a = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13855a.f13854a.a();
        try {
            boolean zA = com.xiaomi.onetrack.g.c.a();
            com.xiaomi.onetrack.util.p.a("UploadTimer", "UploadTimer netReceiver, 网络是否可用=" + zA);
            if (zA) {
                int[] iArr = {0, 1, 2};
                for (int i = 0; i < 3; i++) {
                    int i2 = iArr[i];
                    int iA = com.xiaomi.onetrack.b.n.a(i2);
                    if (!this.f13855a.f13854a.hasMessages(i2)) {
                        this.f13855a.f13854a.sendEmptyMessageDelayed(i2, iA);
                    }
                }
            }
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.a("UploadTimer", "netReceiver: " + e);
        }
    }
}
