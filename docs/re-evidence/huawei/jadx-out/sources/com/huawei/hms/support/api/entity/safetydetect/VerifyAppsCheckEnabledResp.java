package com.huawei.hms.support.api.entity.safetydetect;

import com.huawei.hms.support.api.entity.safetydetect.base.BaseResp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class VerifyAppsCheckEnabledResp extends BaseResp {
    private boolean result;

    public void setResult(boolean z) {
        this.result = z;
    }

    public boolean getResult() {
        return this.result;
    }

    public VerifyAppsCheckEnabledResp(String str) {
        this.result = new JSONObject(str).optBoolean("result");
    }
}
