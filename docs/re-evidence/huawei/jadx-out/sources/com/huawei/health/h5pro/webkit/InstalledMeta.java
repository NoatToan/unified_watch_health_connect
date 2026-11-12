package com.huawei.health.h5pro.webkit;

import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class InstalledMeta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnvironmentHelper.BuildType f7031a;
    private long e;

    public InstalledMeta(long j, EnvironmentHelper.BuildType buildType) {
        this.e = j;
        this.f7031a = buildType;
    }

    public InstalledMeta(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.e = jSONObject.optLong("installTime");
            String strOptString = jSONObject.optString("buildType");
            for (EnvironmentHelper.BuildType buildType : EnvironmentHelper.BuildType.values()) {
                if (buildType.name().equals(strOptString)) {
                    this.f7031a = buildType;
                }
            }
        } catch (JSONException e) {
            LogUtil.e("H5PRO_InstalledMeta", "parse err: " + e.getMessage());
        }
    }

    public long getInstallTime() {
        return this.e;
    }

    public EnvironmentHelper.BuildType getBuildType() {
        return this.f7031a;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installTime", this.e);
            jSONObject.put("buildType", this.f7031a);
        } catch (JSONException e) {
            LogUtil.e("H5PRO_InstalledMeta", "toJSON err: " + e.getMessage());
        }
        return jSONObject.toString();
    }
}
