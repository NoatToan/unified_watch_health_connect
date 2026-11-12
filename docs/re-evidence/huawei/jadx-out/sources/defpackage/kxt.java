package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kxt implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("monthItems")
    private List<String> f39597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("halfYearItems")
    private List<String> f39598b;

    public void d(List<String> list) {
        this.f39597a = list;
    }

    public void c(List<String> list) {
        this.f39598b = list;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/dataStat/healthTrends/getHealthTrend";
    }
}
