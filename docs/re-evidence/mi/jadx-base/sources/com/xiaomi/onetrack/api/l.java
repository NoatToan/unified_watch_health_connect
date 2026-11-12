package com.xiaomi.onetrack.api;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f13775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map f13776b;
    final /* synthetic */ h c;

    public l(h hVar, boolean z, Map map) {
        this.c = hVar;
        this.f13775a = z;
        this.f13776b = map;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            if (!this.f13775a) {
                JSONObject jSONObjectA = com.xiaomi.onetrack.util.r.a((Map<String, Object>) this.f13776b, false);
                if (!this.c.j) {
                    String strU = com.xiaomi.onetrack.util.aa.u();
                    String strW = com.xiaomi.onetrack.util.aa.w();
                    jSONObjectA.put("uid", strU);
                    jSONObjectA.put("uid_type", strW);
                }
                this.c.f13768b.a("ot_logout", c.d(jSONObjectA, this.c.f, this.c.h, this.c.f("ot_logout"), this.c.i, this.c.j));
            }
            com.xiaomi.onetrack.util.aa.v();
            com.xiaomi.onetrack.util.aa.x();
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "logout error:" + e.toString());
        }
    }
}
