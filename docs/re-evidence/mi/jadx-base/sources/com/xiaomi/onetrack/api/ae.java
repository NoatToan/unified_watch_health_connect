package com.xiaomi.onetrack.api;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class ae implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13724b;

    public ae(h hVar, String str) {
        this.f13724b = hVar;
        this.f13723a = str;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            JSONArray jSONArray = new JSONArray(this.f13723a);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has(c.f13756b) && jSONObjectOptJSONObject.has(c.f13755a)) {
                    d dVar = new d(jSONObjectOptJSONObject.optJSONObject(c.f13756b));
                    if (!this.f13724b.e(dVar.a())) {
                        this.f13724b.f13768b.a(dVar.a(), c.a(dVar, jSONObjectOptJSONObject.optJSONObject(c.f13755a), this.f13724b.f, this.f13724b.h, this.f13724b.f(dVar.a()), this.f13724b.i, this.f13724b.j));
                    }
                } else {
                    com.xiaomi.onetrack.util.p.a("OneTrackImp", "h5 json is empty or has no \"H\" or \"B\" ");
                }
            }
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "trackEventFromH5 error: " + e.toString());
        }
    }
}
