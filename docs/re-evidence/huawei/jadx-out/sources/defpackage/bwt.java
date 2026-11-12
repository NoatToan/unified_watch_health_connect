package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.GRSManager;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bwt extends bwg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("ids")
    private List<Integer> f1259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("weekNos")
    private List<Integer> f1260b;

    public void b(List<Integer> list) {
        this.f1259a = list;
    }

    public void a(List<Integer> list) {
        this.f1260b = list;
    }

    @Override // defpackage.bwg, com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("achievementUrl") + "/achievement/getHealthLifeStat";
    }
}
