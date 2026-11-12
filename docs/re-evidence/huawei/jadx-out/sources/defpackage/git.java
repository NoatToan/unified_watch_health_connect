package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes29.dex */
public class git implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("value")
    private double f35227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("userCategory")
    private String f35228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("timestamp")
    private long f35229c;

    @SerializedName("rankCategory")
    private String d;

    public void b(String str) {
        this.d = str;
    }

    public void a(String str) {
        this.f35228b = str;
    }

    public void a(double d) {
        this.f35227a = d;
    }

    public void c(long j) {
        this.f35229c = j;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataRecommend/getUserRank";
    }
}
