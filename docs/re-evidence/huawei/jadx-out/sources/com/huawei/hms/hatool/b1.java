package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.hianalytics.core.storage.Event;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13412c;
    private String d;
    private String e;
    private String f;

    public void f(String str) {
        this.e = str;
    }

    public void e(String str) {
        this.f = str;
    }

    public void d(String str) {
        this.f13410a = str;
    }

    public JSONObject d() throws JSONException {
        JSONObject jSONObjectA = a();
        jSONObjectA.put(Event.EventConstants.PROPERTIES, n.b(this.f13412c, o0.d().a()));
        return jSONObjectA;
    }

    public void c(String str) {
        this.d = str;
    }

    public String c() {
        return this.f13410a;
    }

    public void b(String str) {
        this.f13411b = str;
    }

    public String b() {
        return this.d;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f13411b = jSONObject.optString("event");
        this.f13412c = n.a(jSONObject.optString(Event.EventConstants.PROPERTIES), o0.d().a());
        this.f13410a = jSONObject.optString("type");
        this.d = jSONObject.optString(Event.EventConstants.RECORD_TIME);
        this.e = jSONObject.optString(Event.EventConstants.SESSION_NAME);
        this.f = jSONObject.optString(Event.EventConstants.IS_FIRST_SESSION);
    }

    public void a(String str) {
        this.f13412c = str;
    }

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.f13410a);
        jSONObject.put(Event.EventConstants.RECORD_TIME, this.d);
        jSONObject.put("event", this.f13411b);
        jSONObject.put(Event.EventConstants.SESSION_NAME, this.e);
        jSONObject.put(Event.EventConstants.IS_FIRST_SESSION, this.f);
        if (TextUtils.isEmpty(this.f13412c)) {
            return null;
        }
        jSONObject.put(Event.EventConstants.PROPERTIES, new JSONObject(this.f13412c));
        return jSONObject;
    }
}
