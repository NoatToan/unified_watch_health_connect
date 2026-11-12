package com.huawei.health.h5pro.vengine;

import com.huawei.health.h5pro.utils.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProVersionMeta {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7007c;
    private String d;
    private String e;

    public H5ProVersionMeta(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.d = jSONObject.optString("latest");
            this.e = jSONObject.optString("adMinAppVersion");
            this.f7007c = jSONObject.optString("minH5Version", "");
        } catch (JSONException e) {
            LogUtil.e("H5PRO_VersionMeta", "parse err: " + e.getMessage());
        }
    }

    public String getLatestVersion() {
        return this.d;
    }

    public String getMinAppVersion() {
        return this.e;
    }

    public String getMinH5Version() {
        return this.f7007c;
    }
}
