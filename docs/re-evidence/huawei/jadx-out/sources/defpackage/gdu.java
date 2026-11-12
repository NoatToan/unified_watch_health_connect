package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gdu implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("textScene")
    private String f34952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("texts")
    private List<String> f34953c;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/commonAbility/user/textRiskIdentify";
    }

    public void a(String str) {
        this.f34952b = str;
    }

    public void d(List<String> list) {
        this.f34953c = list;
    }
}
