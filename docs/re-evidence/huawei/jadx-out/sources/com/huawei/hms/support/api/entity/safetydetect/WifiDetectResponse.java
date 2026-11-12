package com.huawei.hms.support.api.entity.safetydetect;

import com.huawei.hms.support.api.entity.safetydetect.base.BaseResp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class WifiDetectResponse extends BaseResp {
    private int wifiDetectStatus;

    public void setWifiDetectStatus(int i) {
        this.wifiDetectStatus = i;
    }

    public int getWifiDetectStatus() {
        return this.wifiDetectStatus;
    }

    public WifiDetectResponse(String str) {
        this.wifiDetectStatus = new JSONObject(str).optInt("wifiDetectStatus");
    }
}
