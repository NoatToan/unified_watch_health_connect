package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes28.dex */
public class eyi implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("control")
    private int f33685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("language")
    private String f33686c;

    @SerializedName("audioId")
    private String d;

    @SerializedName(ParsedFieldTag.CURRENT_TIMESTAMP)
    private long e;

    public void d(long j) {
        this.e = j;
    }

    public void e(String str) {
        this.d = str;
    }

    public void c(int i) {
        this.f33685b = i;
    }

    public void b(String str) {
        this.f33686c = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/aiaudio/playControl";
    }
}
