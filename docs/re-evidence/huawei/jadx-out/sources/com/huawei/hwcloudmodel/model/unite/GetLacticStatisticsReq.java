package com.huawei.hwcloudmodel.model.unite;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes37.dex */
public class GetLacticStatisticsReq implements IRequest {
    private static final String LACTIC_STATISTICS_URL = "/dataQuery/health/getHealthStatistics";

    @SerializedName("endTime")
    private long endTime;

    @SerializedName("startTime")
    private long startTime;

    @SerializedName("types")
    private int[] types;

    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public int[] getType() {
        return this.types;
    }

    public void setType(int[] iArr) {
        this.types = iArr;
    }

    public String toString() {
        return "GetLacticStatisticsReq{startTime=" + this.startTime + ", endTime=" + this.endTime + ", types=" + this.types + '}';
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + LACTIC_STATISTICS_URL;
    }
}
