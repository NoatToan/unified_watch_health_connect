package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes29.dex */
public class gct implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("pathStartTime")
    private long f34909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(BleConstants.SPORT_TYPE)
    private int f34910c;

    @SerializedName("sourceType")
    private int d;

    @SerializedName("pathEndTime")
    private long e;

    public String toString() {
        return "ApiRequestParams{sportType='" + this.f34910c + "', sourceType='" + this.d + "', pathStartTime='" + this.f34909b + "', pathEndTime='" + this.e + "'}";
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataStat/v1/healthDatas/motionPaths/interpretations";
    }
}
