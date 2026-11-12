package com.huawei.hwcloudmodel.model.unite;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes10.dex */
public class GetLoadPeakReq implements IRequest {
    private static final String LOAD_PEAK_URL = "/dataQuery/report/getSampleReportByDay";

    @SerializedName("dataType")
    private int dataType;

    @SerializedName("deviceCode")
    private int deviceCode;

    @SerializedName("endDay")
    private long endDay;

    @SerializedName(ParsedFieldTag.RECORD_DAY)
    private int recordDay;

    @SerializedName("startDay")
    private long startDay;

    @SerializedName("type")
    private int type;

    public long getEndDay() {
        return this.endDay;
    }

    public void setEndDay(long j) {
        this.endDay = j;
    }

    public long getStartDay() {
        return this.startDay;
    }

    public void setStartDay(long j) {
        this.startDay = j;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public int getDataType() {
        return this.dataType;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public int getDeviceCode() {
        return this.deviceCode;
    }

    public void setDeviceCode(int i) {
        this.deviceCode = i;
    }

    public int getRecordDay() {
        return this.recordDay;
    }

    public void setRecordDay(int i) {
        this.recordDay = i;
    }

    public String toString() {
        return "GetLoadPeakReq{startDay=" + this.startDay + ", endDay=" + this.endDay + ", type=" + this.type + ", dataType=" + this.dataType + ", deviceCode=" + this.deviceCode + ", recordDay=" + this.recordDay + '}';
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + LOAD_PEAK_URL;
    }
}
