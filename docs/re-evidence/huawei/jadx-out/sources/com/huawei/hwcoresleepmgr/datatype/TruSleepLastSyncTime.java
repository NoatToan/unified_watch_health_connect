package com.huawei.hwcoresleepmgr.datatype;

import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;

/* JADX INFO: loaded from: classes10.dex */
public class TruSleepLastSyncTime {
    private String deviceMac;
    private String lastSyncTime;

    public String getDeviceMac() {
        return this.deviceMac;
    }

    public void setDeviceMac(String str) {
        this.deviceMac = str;
    }

    public String getLastSyncTime() {
        return this.lastSyncTime;
    }

    public void setLastSyncTime(String str) {
        this.lastSyncTime = str;
    }

    public String toString() {
        return "TruSleepLastSynctime:deviceMac = " + BTDeviceMgrUtil.c().e(this.deviceMac) + ",lastSyncTime = " + this.lastSyncTime;
    }
}
