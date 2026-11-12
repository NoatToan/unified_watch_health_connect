package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes29.dex */
public class gck implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("pathId")
    private String f34894c;

    @SerializedName("minTime")
    private long d;

    @SerializedName("motionPathStartTime")
    private long e;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataAnalyse/app/addHotPathParticipateInfo";
    }

    public String toString() {
        return "AddHotPathParticipateInfoReq{pathId='" + this.f34894c + "', motionPathStartTime=" + this.e + ", minTime=" + this.d + '}';
    }
}
