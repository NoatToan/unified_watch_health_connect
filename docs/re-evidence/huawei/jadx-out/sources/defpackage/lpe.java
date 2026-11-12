package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes37.dex */
public class lpe implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("fileList")
    private List<lot> f40587a;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/healthCare/upload/getInfo";
    }

    public void b(List<lot> list) {
        this.f40587a = list;
    }

    public String toString() {
        return "UploadFileInfoReq{fileList=" + this.f40587a + '}';
    }
}
