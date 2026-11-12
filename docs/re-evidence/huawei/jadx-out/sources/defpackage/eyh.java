package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes28.dex */
public class eyh implements IRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("language")
    private String f33684c;

    @SerializedName("audioId")
    private String d;

    public void a(String str) {
        this.d = str;
    }

    public void c(String str) {
        this.f33684c = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/aiaudio/stopPlayback";
    }
}
