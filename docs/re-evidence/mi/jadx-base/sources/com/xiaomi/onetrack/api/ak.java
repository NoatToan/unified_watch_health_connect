package com.xiaomi.onetrack.api;

/* JADX INFO: loaded from: classes11.dex */
class ak implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f13735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ aj f13736b;

    public ak(aj ajVar, int i) {
        this.f13736b = ajVar;
        this.f13735a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.xiaomi.onetrack.c.i.b() && this.f13735a == 2) {
            com.xiaomi.onetrack.c.q.a().a(0, true);
            com.xiaomi.onetrack.c.q.a().a(1, true);
            com.xiaomi.onetrack.a.c.b.a().b();
        }
    }
}
