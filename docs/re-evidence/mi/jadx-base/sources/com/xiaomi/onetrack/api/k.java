package com.xiaomi.onetrack.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Number f13774b;
    final /* synthetic */ h c;

    public k(h hVar, String str, Number number) {
        this.c = hVar;
        this.f13773a = str;
        this.f13774b = number;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            this.c.f13768b.a(b.d, c.b(new JSONObject().put(this.f13773a, this.f13774b), this.c.f, this.c.h, this.c.f(b.d), this.c.i, this.c.j));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "userProfileIncrement single error:" + e.toString());
        }
    }
}
