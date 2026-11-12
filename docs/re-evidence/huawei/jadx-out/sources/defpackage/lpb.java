package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import health.compact.a.GRSManager;
import java.util.Map;

/* JADX INFO: loaded from: classes37.dex */
public class lpb implements IRequest {

    @SerializedName(RecommendConstants.FILE_ID)
    private String d;

    @SerializedName("filePartMap")
    private Map<Integer, low> e;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/healthCare/upload/getMultipartInfo";
    }
}
