package com.huawei.hianalytics;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11608c;
    public String d;
    public String e;
    public long f;

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("package_name", this.f11607b);
            jSONObject.put("dst_package_name", this.f11607b);
            jSONObject.put("dst_page_name", this.d);
            jSONObject.put("src_package_name", this.f11606a);
            jSONObject.put("src_page_name", this.f11608c);
            jSONObject.put("triggerTime", this.f);
            jSONObject.put("version", "v2");
            if (!TextUtils.isEmpty(this.e)) {
                jSONObject.put("lite_name", this.e);
                return jSONObject;
            }
        } catch (JSONException unused) {
            HiLog.w("CC3", "toJson error");
        }
        return jSONObject;
    }
}
