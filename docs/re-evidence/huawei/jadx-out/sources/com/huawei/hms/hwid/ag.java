package com.huawei.hms.hwid;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f13546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13547b;

    public Integer a() {
        return this.f13546a;
    }

    public void a(Integer num) {
        this.f13546a = num;
    }

    public String b() {
        return this.f13547b;
    }

    public void a(String str) {
        this.f13547b = str;
    }

    public static ag b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ag();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Integer numValueOf = jSONObject.has("errorCode") ? Integer.valueOf(jSONObject.getInt("errorCode")) : null;
            String string = jSONObject.has("errorMsg") ? jSONObject.getString("errorMsg") : null;
            ag agVar = new ag();
            agVar.a(numValueOf);
            agVar.a(string);
            return agVar;
        } catch (JSONException unused) {
            ar.d("ReadSmsOutputBean", "ReadSmsOutputBean json parse falied", true);
            return new ag();
        }
    }
}
