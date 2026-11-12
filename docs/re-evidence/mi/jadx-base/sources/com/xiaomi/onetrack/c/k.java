package com.xiaomi.onetrack.c;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.xiaomi.onetrack.api.e f13849a;

    public k(com.xiaomi.onetrack.api.e eVar) {
        this.f13849a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            List<JSONObject> listC = i.c();
            if (listC != null && listC.size() > 0) {
                for (JSONObject jSONObject : listC) {
                    this.f13849a.a(jSONObject.optString(i.d), jSONObject.optString("data"));
                }
            }
            i.c(true);
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("NetworkAccessManager", "cta event error: " + e.toString());
        }
        boolean unused = i.l = false;
    }
}
