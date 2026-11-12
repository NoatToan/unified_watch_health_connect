package com.xiaomi.onetrack.api;

/* JADX INFO: loaded from: classes11.dex */
class ab implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f13717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13718b;

    public ab(h hVar, boolean z) {
        this.f13718b = hVar;
        this.f13717a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13718b.i.a(this.f13717a);
        com.xiaomi.onetrack.util.aa.a(com.xiaomi.onetrack.util.r.a(this.f13718b.f), this.f13717a);
    }
}
