package com.xiaomi.onetrack.api;

/* JADX INFO: loaded from: classes11.dex */
class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f13779a;

    public n(h hVar) {
        this.f13779a = hVar;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (com.xiaomi.onetrack.util.ac.d(com.xiaomi.onetrack.util.aa.t())) {
                return;
            }
            com.xiaomi.onetrack.util.aa.m(System.currentTimeMillis());
            this.f13779a.f13768b.a("onetrack_dau", c.a(this.f13779a.f, this.f13779a.h, this.f13779a.f("onetrack_dau"), this.f13779a.i, this.f13779a.j));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "trackDau error  e:" + e.toString());
        }
    }
}
