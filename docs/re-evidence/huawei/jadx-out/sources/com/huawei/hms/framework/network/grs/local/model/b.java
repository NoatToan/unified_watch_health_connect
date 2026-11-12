package com.huawei.hms.framework.network.grs.local.model;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f13349c;
    private String d;

    public void c(String str) {
        this.f13348b = str;
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f13347a);
        jSONObject.put("name", this.f13348b);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f13349c.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("countries", jSONArray);
        jSONObject.put("description", this.d);
        return jSONObject;
    }

    public void b(String str) {
        this.f13347a = str;
    }

    public String b() {
        return this.f13347a;
    }

    public void a(Set<String> set) {
        this.f13349c = set;
    }

    public void a(String str) {
        this.d = str;
    }

    public Set<String> a() {
        return this.f13349c;
    }
}
