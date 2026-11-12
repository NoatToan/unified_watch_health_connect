package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes37.dex */
public class loy implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("fileList")
    private List<lot> f40581b;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/healthCare/upload/initMultipart";
    }
}
