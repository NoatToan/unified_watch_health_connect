package com.huawei.hms.findnetwork.comm.request.result;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.findnetwork.comm.PlainLocation;

/* JADX INFO: loaded from: classes33.dex */
public class FindNetworkOfflineLocation extends PlainLocation {

    @SerializedName("broadcastTime")
    private long broadcastTime;

    @SerializedName("sn")
    private String sn;

    public void setSn(String str) {
        this.sn = str;
    }

    public void setBroadcastTime(long j) {
        this.broadcastTime = j;
    }

    public String getSn() {
        return this.sn;
    }

    public long getBroadcastTime() {
        return this.broadcastTime;
    }
}
