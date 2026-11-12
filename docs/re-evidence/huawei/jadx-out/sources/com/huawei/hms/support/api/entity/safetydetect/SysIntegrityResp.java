package com.huawei.hms.support.api.entity.safetydetect;

import com.huawei.hms.support.api.entity.safetydetect.base.BaseResp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class SysIntegrityResp extends BaseResp {
    private String result;

    public void setResult(String str) {
        this.result = str;
    }

    public String getResult() {
        return this.result;
    }

    public SysIntegrityResp(String str) {
        this.result = new JSONObject(str).optString("jwsResult");
    }

    public SysIntegrityResp() {
    }
}
