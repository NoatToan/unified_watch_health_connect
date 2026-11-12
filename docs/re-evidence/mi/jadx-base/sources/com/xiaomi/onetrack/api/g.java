package com.xiaomi.onetrack.api;

/* JADX INFO: loaded from: classes11.dex */
class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread f13765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Throwable f13766b;
    final /* synthetic */ f c;

    public g(f fVar, Thread thread, Throwable th) {
        this.c = fVar;
        this.f13765a = thread;
        this.f13766b = th;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        this.c.a(this.f13765a, this.f13766b);
    }
}
