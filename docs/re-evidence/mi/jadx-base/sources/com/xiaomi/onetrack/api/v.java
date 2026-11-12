package com.xiaomi.onetrack.api;

/* JADX INFO: loaded from: classes11.dex */
class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13794b;

    public v(h hVar, String str) {
        this.f13794b = hVar;
        this.f13793a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.xiaomi.onetrack.util.o.a().a(this.f13793a);
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "setInstanceId error: " + e.toString());
        }
    }
}
