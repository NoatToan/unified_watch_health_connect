package com.unicom.online.account.kernel;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    h f31226a = null;

    public final void a(int i, int i2, String str, String str2, String str3) {
        aj.a("typeTokenUaid=".concat(String.valueOf(i)));
        try {
            if (this.f31226a == null) {
                return;
            }
            if (an.a(str3).booleanValue()) {
                str3 = i.g();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", i2);
            jSONObject.put("resultMsg", str);
            jSONObject.put("resultData", str2);
            jSONObject.put("seq", str3);
            this.f31226a.onResult(jSONObject.toString());
            this.f31226a = null;
        } catch (Exception e) {
            aj.a(e);
        }
    }
}
