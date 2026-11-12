package com.xiaomi.hm.health.bt.model;

import java.util.ArrayList;
import java.util.Date;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes19.dex */
public class WeightSyncResult {
    public long startTs = -1;
    public long stopTs = -1;
    public int rebootCount = 0;
    public ArrayList<WeightAdvData> datas = new ArrayList<>();

    public void add(WeightAdvData data) {
        this.datas.add(data);
    }

    public boolean isValid() {
        ArrayList<WeightAdvData> arrayList = this.datas;
        return arrayList != null && arrayList.size() > 0;
    }

    public void setDeviceId(String deviceId, String macAddress) {
        ArrayList<WeightAdvData> arrayList = this.datas;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        for (WeightAdvData weightAdvData : this.datas) {
            weightAdvData.setDeviceId(deviceId);
            weightAdvData.setMacAddress(macAddress);
        }
    }

    public String toString() {
        return "<start:" + new Date(this.startTs).toString() + ",stop:" + new Date(this.stopTs).toString() + ",rebootCount:" + this.rebootCount + SearchCriteria.GT;
    }
}
