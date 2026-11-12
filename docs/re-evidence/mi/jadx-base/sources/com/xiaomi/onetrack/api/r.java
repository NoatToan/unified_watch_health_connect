package com.xiaomi.onetrack.api;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f13786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13787b;

    public r(h hVar, Map map) {
        this.f13787b = hVar;
        this.f13786a = map;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            JSONObject jSONObjectA = com.xiaomi.onetrack.util.r.a((Map<String, Object>) this.f13786a, true);
            String strA = com.xiaomi.onetrack.util.k.a(com.xiaomi.onetrack.util.r.a(this.f13787b.f));
            com.xiaomi.onetrack.util.k.a(com.xiaomi.onetrack.util.r.a(this.f13787b.f), com.xiaomi.onetrack.util.r.a(jSONObjectA, !TextUtils.isEmpty(strA) ? new JSONObject(strA) : null).toString());
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", " " + e.toString());
        }
    }
}
