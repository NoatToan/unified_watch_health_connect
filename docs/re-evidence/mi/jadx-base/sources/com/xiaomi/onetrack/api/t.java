package com.xiaomi.onetrack.api;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map f13790b;
    final /* synthetic */ String c;
    final /* synthetic */ h d;

    public t(h hVar, String str, Map map, String str2) {
        this.d = hVar;
        this.f13789a = str;
        this.f13790b = map;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (this.d.d(this.f13789a)) {
                return;
            }
            this.d.f13768b.a(this.f13789a, c.a(this.c, this.f13789a, com.xiaomi.onetrack.util.r.a((Map<String, Object>) this.f13790b, true), this.d.f, this.d.h, this.d.f(this.f13789a), this.d.i, this.d.j));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "track json error:" + e.toString());
        }
    }
}
