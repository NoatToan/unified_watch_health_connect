package com.xiaomi.onetrack.f;

/* JADX INFO: loaded from: classes11.dex */
final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13888b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;

    public f(String str, String str2, String str3, String str4) {
        this.f13887a = str;
        this.f13888b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.onetrack.c.c.a().a(com.xiaomi.onetrack.e.b.b(this.f13887a, this.f13888b, this.c, this.d));
    }
}
