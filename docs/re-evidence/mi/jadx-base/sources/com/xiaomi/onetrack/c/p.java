package com.xiaomi.onetrack.c;

/* JADX INFO: loaded from: classes11.dex */
class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f13856a;

    public p(m mVar) {
        this.f13856a = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f13856a.i.get()) {
            com.xiaomi.onetrack.b.e.b();
        }
        this.f13856a.i.set(true);
    }
}
