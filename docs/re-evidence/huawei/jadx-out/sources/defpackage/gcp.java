package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes29.dex */
public class gcp implements IRequest {

    @SerializedName("pathId")
    private String e;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataAnalyse/inner/deleteFeedbackByPathId";
    }

    public String toString() {
        return "DeleteFeedbackByPathIdReq{pathId='" + this.e + "'}";
    }
}
