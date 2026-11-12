package com.huawei.hms.support.api.safetydetect.p001default;

import android.util.Log;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.tencent.connect.common.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class x extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Packed
    private String f16570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Packed
    private String f16571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Packed
    private String f16572c;

    @Packed
    private String d;

    @Packed
    private String[] e;

    @Packed
    private String f;

    public void e(String str) {
        this.f16572c = str;
    }

    public void d(String str) {
        this.f16570a = str;
    }

    public void c(String str) {
        this.f16571b = str;
    }

    public void b(String str) {
        this.d = str;
    }

    public void a(String[] strArr) {
        this.e = strArr == null ? null : (String[]) strArr.clone();
    }

    public void a(String str) {
        this.f = str;
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.NONCE, this.f16570a);
            jSONObject.put("appId", this.f16571b);
            jSONObject.put("alg", this.f);
            jSONObject.put("packageName", this.f16572c);
            jSONObject.put("apkDigestSha256", this.d);
            JSONArray jSONArray = new JSONArray();
            String[] strArr = this.e;
            if (strArr != null) {
                for (String str : strArr) {
                    jSONArray.put(str);
                }
            }
            jSONObject.put("apkCertificateDigestSha256", jSONArray);
        } catch (JSONException e) {
            Log.e("SysIntegrityReq", "Json conversion exception! " + e.getMessage());
        }
        return jSONObject.toString();
    }
}
