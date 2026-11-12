package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.OneTrack;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class ai implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ OneTrack.UserIdType f13732b;
    final /* synthetic */ boolean c;
    final /* synthetic */ Map d;
    final /* synthetic */ h e;

    public ai(h hVar, String str, OneTrack.UserIdType userIdType, boolean z, Map map) {
        this.e = hVar;
        this.f13731a = str;
        this.f13732b = userIdType;
        this.c = z;
        this.d = map;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            com.xiaomi.onetrack.util.aa.g(this.f13731a);
            com.xiaomi.onetrack.util.aa.h(this.f13732b.getUserIdType());
            if (this.c) {
                return;
            }
            JSONObject jSONObjectA = com.xiaomi.onetrack.util.r.a((Map<String, Object>) this.d, false);
            if (!this.e.j) {
                jSONObjectA.put("uid", this.f13731a);
                jSONObjectA.put("uid_type", this.f13732b.getUserIdType());
            }
            this.e.f13768b.a("ot_login", c.c(jSONObjectA, this.e.f, this.e.h, this.e.f("ot_login"), this.e.i, this.e.j));
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "login error:" + e.toString());
        }
    }
}
