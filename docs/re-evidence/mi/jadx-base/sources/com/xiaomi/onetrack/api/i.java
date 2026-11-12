package com.xiaomi.onetrack.api;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f13770a;

    public i(h hVar) {
        this.f13770a = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.xiaomi.onetrack.c.a.a();
            if (com.xiaomi.onetrack.util.aa.B() == 0) {
                com.xiaomi.onetrack.util.aa.n(System.currentTimeMillis());
            }
            if (!TextUtils.isEmpty(this.f13770a.f.getInstanceId())) {
                com.xiaomi.onetrack.util.o.a().a(this.f13770a.f.getInstanceId());
            }
            this.f13770a.k();
            this.f13770a.j();
            com.xiaomi.onetrack.util.d.a();
            com.xiaomi.onetrack.c.i.c(false);
        } catch (Throwable th) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "init WorkerExecutor execute throwable:" + th.getMessage());
        }
    }
}
