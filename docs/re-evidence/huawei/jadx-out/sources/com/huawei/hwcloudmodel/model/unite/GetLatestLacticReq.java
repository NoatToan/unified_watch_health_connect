package com.huawei.hwcloudmodel.model.unite;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes10.dex */
public class GetLatestLacticReq implements IRequest {
    private static final String LATEST_LACTIC_URL = "/dataQuery/health/getHealthDataLatest";

    @SerializedName("counts")
    private int counts;

    @SerializedName("dataType")
    private int dataType;

    @SerializedName("timestamp")
    private long timestamp;

    @SerializedName("type")
    private int type;

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

    public int getCounts() {
        return this.counts;
    }

    public void setCounts(int i) {
        this.counts = i;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public String toString() {
        return "GetLatestLacticReq{, timestamp=" + this.timestamp + ", type=" + this.type + ", dataType=" + this.dataType + ", counts=" + this.counts + '}';
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + LATEST_LACTIC_URL;
    }
}
