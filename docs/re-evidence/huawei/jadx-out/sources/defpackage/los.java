package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import health.compact.a.GRSManager;
import java.util.Map;

/* JADX INFO: loaded from: classes37.dex */
public class los implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("filePartComposeMap")
    private Map<Integer, lou> f40569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(RecommendConstants.FILE_ID)
    private String f40570b;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/healthCare/upload/composeMultipart";
    }
}
