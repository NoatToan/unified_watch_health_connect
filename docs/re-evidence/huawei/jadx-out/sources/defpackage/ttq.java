package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.CloudParamKeys;

/* JADX INFO: loaded from: classes19.dex */
public class ttq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("country")
    private String f49650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("timestamp")
    private long f49651c;

    @SerializedName(CloudParamKeys.CLIENT_TYPE)
    private int d;

    @SerializedName("timeZone")
    private String e;

    public ttq() {
        b(lsl.q(System.currentTimeMillis()));
        d(System.currentTimeMillis());
        d(qrs.d());
        c(LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010));
    }

    public void d(long j) {
        this.f49651c = j;
    }

    public void b(String str) {
        this.e = str;
    }

    public void d(int i) {
        this.d = i;
    }

    public void c(String str) {
        this.f49650b = str;
    }
}
