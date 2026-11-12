package com.xiaomi.onetrack.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13792b;

    public u(h hVar, String str) {
        this.f13792b = hVar;
        this.f13791a = str;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        try {
            String strA = com.xiaomi.onetrack.util.k.a(com.xiaomi.onetrack.util.r.a(this.f13792b.f));
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.remove(this.f13791a);
            com.xiaomi.onetrack.util.k.a(com.xiaomi.onetrack.util.r.a(this.f13792b.f), jSONObject.toString());
        } catch (Exception e) {
            com.xiaomi.onetrack.util.p.b("OneTrackImp", "removeCommonProperty error:" + e.toString());
        }
    }
}
