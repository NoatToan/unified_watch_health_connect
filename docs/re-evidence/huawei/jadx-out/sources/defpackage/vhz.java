package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes43.dex */
public class vhz implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("category")
    private int f51136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("subCategory")
    private int f51137b;

    @SerializedName("userInfo")
    private vib d;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/simplefat/v1/getGoalDetail";
    }

    public vhz(int i, int i2, vib vibVar) {
        this.f51136a = i;
        this.f51137b = i2;
        this.d = vibVar;
    }
}
