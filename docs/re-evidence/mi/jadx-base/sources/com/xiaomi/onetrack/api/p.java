package com.xiaomi.onetrack.api;

/* JADX INFO: loaded from: classes11.dex */
class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f13783b;
    final /* synthetic */ h c;

    public p(h hVar, String str, long j) {
        this.c = hVar;
        this.f13782a = str;
        this.f13783b = j;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (!this.c.f.isAutoTrackActivityAction()) {
                com.xiaomi.onetrack.util.p.a("OneTrackImp", "config.autoTrackActivityAction is false, ignore onetrack_pa pause event");
            } else {
                com.xiaomi.onetrack.util.aa.i(c.a(this.f13782a, b.g, this.f13783b, this.c.f, this.c.h, this.c.f(b.g), this.c.i, this.c.j));
            }
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "savePageEndData error:" + e.toString());
        }
    }
}
