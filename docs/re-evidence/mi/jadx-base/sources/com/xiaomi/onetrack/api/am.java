package com.xiaomi.onetrack.api;

/* JADX INFO: loaded from: classes11.dex */
class am implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ al f13739a;

    public am(al alVar) {
        this.f13739a = alVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.xiaomi.onetrack.c.i.b()) {
            this.f13739a.b();
        }
    }
}
