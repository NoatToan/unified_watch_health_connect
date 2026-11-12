package com.xiaomi.smarthome.device;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class WuGanDeviceStatus extends Device {
    private int status;

    public WuGanDeviceStatus(String str, int i) {
        this.model = str;
        this.status = i;
        this.canUseNotBind = true;
    }

    public String getDeviceName() {
        return this.name;
    }

    @Override // com.xiaomi.smarthome.device.Device
    public String getDid() {
        return this.did;
    }

    @Override // com.xiaomi.smarthome.device.Device
    public String getModel() {
        return this.model;
    }

    public int getStatus() {
        return this.status;
    }

    public boolean isAddFail() {
        return this.status == 3;
    }

    public boolean isAddSuccess() {
        return this.status == 2;
    }

    public boolean isAdding() {
        return this.status == 1;
    }

    public boolean isSent() {
        return this.status == 0;
    }

    public WuGanDeviceStatus(JSONObject jSONObject) {
        this.model = jSONObject.optString("model");
        this.name = jSONObject.optString("goods_name");
        this.status = jSONObject.optInt("status");
        this.did = jSONObject.optString("did");
        this.canUseNotBind = true;
    }
}
