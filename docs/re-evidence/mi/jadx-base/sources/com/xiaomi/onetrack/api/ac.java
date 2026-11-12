package com.xiaomi.onetrack.api;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
class ac implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map f13720b;
    final /* synthetic */ h c;

    public ac(h hVar, String str, Map map) {
        this.c = hVar;
        this.f13719a = str;
        this.f13720b = map;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.c.d(this.f13719a)) {
                return;
            }
            this.c.f13768b.a(this.f13719a, c.a(this.f13719a, com.xiaomi.onetrack.util.r.a((Map<String, Object>) this.f13720b, true), this.c.f, this.c.h, this.c.f(this.f13719a), this.c.i, this.c.j));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "track map error: " + e.toString());
        }
    }
}
