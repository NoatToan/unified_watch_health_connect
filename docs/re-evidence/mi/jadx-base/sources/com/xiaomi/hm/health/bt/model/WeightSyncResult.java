package com.xiaomi.hm.health.bt.model;

import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class WeightSyncResult {
    public long startTs = -1;
    public long stopTs = -1;
    public int rebootCount = 0;
    public ArrayList<WeightAdvData> datas = new ArrayList<>();

    public void add(WeightAdvData weightAdvData) {
        this.datas.add(weightAdvData);
    }

    public boolean isValid() {
        ArrayList<WeightAdvData> arrayList = this.datas;
        return arrayList != null && arrayList.size() > 0;
    }

    public void setDeviceId(String str, String str2) {
        ArrayList<WeightAdvData> arrayList = this.datas;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        for (WeightAdvData weightAdvData : this.datas) {
            weightAdvData.setDeviceId(str);
            weightAdvData.setMacAddress(str2);
        }
    }

    public String toString() {
        return "<start:" + new Date(this.startTs).toString() + ",stop:" + new Date(this.stopTs).toString() + ",rebootCount:" + this.rebootCount + ">";
    }
}
