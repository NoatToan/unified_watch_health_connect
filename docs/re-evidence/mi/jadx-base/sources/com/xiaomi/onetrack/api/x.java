package com.xiaomi.onetrack.api;

/* JADX INFO: loaded from: classes11.dex */
class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f13797a;

    public x(h hVar) {
        this.f13797a = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f13797a.f13768b.a(b.i, c.a(this.f13797a.f, this.f13797a.h, this.f13797a.i, this.f13797a.j));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "cta event error: " + e.toString());
        }
    }
}
