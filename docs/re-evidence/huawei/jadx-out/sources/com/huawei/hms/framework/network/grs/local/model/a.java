package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f13345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, c> f13346c = new ConcurrentHashMap(16);

    public void b(String str) {
        this.f13344a = str;
    }

    public JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", TextUtils.isEmpty(this.f13344a) ? "" : this.f13344a);
        jSONObject.put("cacheControl", this.f13345b);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f13346c.keySet().iterator();
        while (it.hasNext()) {
            c cVar = this.f13346c.get(it.next());
            if (cVar != null) {
                jSONArray.put(cVar.c());
            }
        }
        Logger.i("ApplicationBean", "local config save to sp, services count:" + jSONArray.length());
        jSONObject.put("services", jSONArray);
        return jSONObject;
    }

    public void a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        this.f13346c.put(str, cVar);
    }

    public void a(long j) {
        this.f13345b = j;
    }

    public String a() {
        return this.f13344a;
    }

    public c a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f13346c.get(str);
        }
        Logger.w("ApplicationBean", "In getServing(String serviceName), the serviceName is Empty or null");
        return null;
    }
}
