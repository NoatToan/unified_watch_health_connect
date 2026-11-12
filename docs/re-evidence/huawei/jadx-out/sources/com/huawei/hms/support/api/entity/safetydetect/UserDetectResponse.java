package com.huawei.hms.support.api.entity.safetydetect;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class UserDetectResponse {
    private String responseToken;

    public String getResponseToken() {
        return this.responseToken;
    }

    public UserDetectResponse(String str) {
        this.responseToken = new JSONObject(str).getString("responseToken");
    }
}
