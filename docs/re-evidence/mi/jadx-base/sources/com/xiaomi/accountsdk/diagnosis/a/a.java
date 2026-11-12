package com.xiaomi.accountsdk.diagnosis.a;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10835b;

    public static a a(JSONObject jSONObject) {
        a aVar = new a();
        aVar.f10835b = jSONObject.optString("diagnosisDomain", null);
        aVar.f10834a = jSONObject.optString("dataCenterZone", null);
        return aVar;
    }
}
