package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gcq implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("pathId")
    private String f34905c;

    @SerializedName("huids")
    private List<String> d;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataAnalyse/inner/deleteFeedbackInfo";
    }

    public String toString() {
        return "DeleteFeedbackInfoReq{pathId='" + this.f34905c + "', huids=" + this.d + '}';
    }
}
