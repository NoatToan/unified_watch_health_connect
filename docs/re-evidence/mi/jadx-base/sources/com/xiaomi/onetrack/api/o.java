package com.xiaomi.onetrack.api;

/* JADX INFO: loaded from: classes11.dex */
class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f13781b;
    final /* synthetic */ h c;

    public o(h hVar, String str, boolean z) {
        this.c = hVar;
        this.f13780a = str;
        this.f13781b = z;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (!this.c.f.isAutoTrackActivityAction()) {
                com.xiaomi.onetrack.util.p.a("OneTrackImp", "config.autoTrackActivityAction is false, ignore onetrack_pa resume event");
                return;
            }
            this.c.f13768b.a(b.g, c.a(this.f13780a, b.g, this.c.f, this.c.h, this.c.f(b.g), this.f13781b, this.c.i, this.c.j));
            if (com.xiaomi.onetrack.util.p.f13986a) {
                com.xiaomi.onetrack.util.p.a("OneTrackImp", "trackPageStartAuto");
            }
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "auto trackPageStartAuto error: " + e.toString());
        }
    }
}
