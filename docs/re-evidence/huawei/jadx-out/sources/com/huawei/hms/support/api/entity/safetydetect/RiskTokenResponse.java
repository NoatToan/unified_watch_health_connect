package com.huawei.hms.support.api.entity.safetydetect;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class RiskTokenResponse {
    private String riskToken;

    public String getRiskToken() {
        return this.riskToken;
    }

    public RiskTokenResponse(String str) {
        this.riskToken = new JSONObject(str).getString("riskToken");
    }
}
