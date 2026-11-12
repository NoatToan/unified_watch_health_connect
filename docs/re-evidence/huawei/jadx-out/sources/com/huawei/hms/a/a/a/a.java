package com.huawei.hms.a.a.a;

import com.huawei.hms.common.internal.bean.AbstractCpPickerClientInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a extends AbstractCpPickerClientInfo {
    public static a a(String str) throws JSONException {
        return new a().a(new JSONObject(str));
    }

    private a a(JSONObject jSONObject) {
        this.f13077a = jSONObject.optString("appId", null);
        this.f13078b = jSONObject.optString("packageName", null);
        this.f13079c = jSONObject.optLong("hmsSdkVersion");
        this.d = jSONObject.optString("subAppId", null);
        return this;
    }

    @Override // com.huawei.hms.common.internal.bean.AbstractCpPickerClientInfo
    public String toString() {
        return "CpClientInfo{appId='" + this.f13077a + "', packageName='" + this.f13078b + "', hmsSdkVersion=" + this.f13079c + "', subAppId=" + this.d + '}';
    }
}
