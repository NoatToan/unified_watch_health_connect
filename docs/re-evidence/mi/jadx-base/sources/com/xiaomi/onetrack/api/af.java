package com.xiaomi.onetrack.api;

/* JADX INFO: loaded from: classes11.dex */
class af implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13726b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ long f;
    final /* synthetic */ h g;

    public af(h hVar, String str, String str2, String str3, String str4, String str5, long j) {
        this.g = hVar;
        this.f13725a = str;
        this.f13726b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            this.g.f13768b.a("onetrack_bug_report", c.a(this.f13725a, this.f13726b, this.c, this.d, this.e, this.f, this.g.f, this.g.h, this.g.f("onetrack_bug_report"), this.g.i, this.g.j));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "trackException error: " + e.toString());
        }
    }
}
