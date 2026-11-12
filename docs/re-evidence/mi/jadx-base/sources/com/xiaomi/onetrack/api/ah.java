package com.xiaomi.onetrack.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class ah implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f13729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13730b;
    final /* synthetic */ h c;

    public ah(h hVar, Object obj, String str) {
        this.c = hVar;
        this.f13729a = obj;
        this.f13730b = str;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (!com.xiaomi.onetrack.util.r.b(this.f13729a)) {
                com.xiaomi.onetrack.util.r.a("OneTrackImp", this.f13730b);
                return;
            }
            this.c.f13768b.a(b.c, c.a(new JSONObject().put(this.f13730b, this.f13729a), this.c.f, this.c.h, this.c.f(b.c), this.c.i, this.c.j));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "setUserProfile single error:" + e.toString());
        }
    }
}
