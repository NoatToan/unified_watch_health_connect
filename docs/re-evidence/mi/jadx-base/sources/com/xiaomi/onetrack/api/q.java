package com.xiaomi.onetrack.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f13784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13785b;

    public q(h hVar, boolean z) {
        this.f13785b = hVar;
        this.f13784a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String strZ = com.xiaomi.onetrack.util.aa.z();
            if (TextUtils.isEmpty(strZ)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strZ);
            this.f13785b.f13768b.a(b.g, jSONObject.put(c.f13755a, jSONObject.optJSONObject(c.f13755a).put(b.u, this.f13784a)).toString());
            if (com.xiaomi.onetrack.util.p.f13986a) {
                com.xiaomi.onetrack.util.p.a("OneTrackImp", "trackPageEndAuto");
            }
            com.xiaomi.onetrack.util.aa.i("");
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "trackPageEndAuto error:" + e.toString());
        }
    }
}
