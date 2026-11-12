package com.xiaomi.onetrack.f;

/* JADX INFO: loaded from: classes11.dex */
final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13886b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;

    public e(String str, String str2, String str3, String str4) {
        this.f13885a = str;
        this.f13886b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.onetrack.c.c.a().a(com.xiaomi.onetrack.e.b.a(this.f13885a, this.f13886b, this.c, this.d));
    }
}
