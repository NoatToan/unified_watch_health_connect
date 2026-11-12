package com.huawei.hms.framework.network.grs.local.model;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f13354b;

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("countryGroup", this.f13353a);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f13354b.keySet()) {
            jSONObject2.put(str, this.f13354b.get(str));
        }
        jSONObject.put("addresses", jSONObject2);
        return jSONObject;
    }

    public String b() {
        return this.f13353a;
    }

    public void a(Map<String, String> map) {
        this.f13354b = map;
    }

    public void a(String str) {
        this.f13353a = str;
    }

    public Map<String, String> a() {
        return this.f13354b;
    }
}
