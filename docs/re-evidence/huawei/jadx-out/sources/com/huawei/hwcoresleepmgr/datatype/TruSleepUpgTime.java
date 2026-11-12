package com.huawei.hwcoresleepmgr.datatype;

import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;

/* JADX INFO: loaded from: classes10.dex */
public class TruSleepUpgTime {
    private String deviceMac;
    private String lastUpgEndTime;

    public String getDeviceMac() {
        return this.deviceMac;
    }

    public void setDeviceMac(String str) {
        this.deviceMac = str;
    }

    public String getLastUpgEndTime() {
        return this.lastUpgEndTime;
    }

    public void setLastUpgEndTime(String str) {
        this.lastUpgEndTime = str;
    }

    public String toString() {
        return "TruSleepUpgTime:deviceMac =" + BTDeviceMgrUtil.c().e(this.deviceMac) + ",lastUpgEndTime = " + this.lastUpgEndTime;
    }
}
