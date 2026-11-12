package com.xiaomi.onetrack.api;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
class ag implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f13727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13728b;

    public ag(h hVar, Map map) {
        this.f13728b = hVar;
        this.f13727a = map;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            this.f13728b.f13768b.a(b.c, c.a(com.xiaomi.onetrack.util.r.a((Map<String, Object>) this.f13727a, false), this.f13728b.f, this.f13728b.h, this.f13728b.f(b.c), this.f13728b.i, this.f13728b.j));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "setUserProfile map error:" + e.toString());
        }
    }
}
