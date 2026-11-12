package com.huawei.hms.framework.network.grs.g.j;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f13329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f13330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<String> f13331c = new HashSet();

    public Set<String> d() {
        return this.f13331c;
    }

    public String c() {
        return this.f13331c.size() == 0 ? e() : f();
    }

    public GrsBaseInfo b() {
        return this.f13329a;
    }

    public void a(String str) {
        this.f13331c.add(str);
    }

    public Context a() {
        return this.f13330b;
    }

    private String f() {
        Logger.v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f13331c.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private String e() {
        Set<String> setB = com.huawei.hms.framework.network.grs.f.b.a(this.f13330b.getPackageName()).b();
        if (setB.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = setB.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.d("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public c(GrsBaseInfo grsBaseInfo, Context context) {
        this.f13329a = grsBaseInfo;
        this.f13330b = context;
    }
}
