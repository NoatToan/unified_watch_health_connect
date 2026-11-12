package com.huawei.operation.h5pro.jsmodules.common;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;

/* JADX INFO: loaded from: classes.dex */
public class RecordRenameInfo {

    @SerializedName("endTime")
    private long endTime;

    @SerializedName(BleConstants.SPORT_TYPE)
    private int sportType;

    @SerializedName("startTime")
    private long startTime;

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public int getSportType() {
        return this.sportType;
    }
}
