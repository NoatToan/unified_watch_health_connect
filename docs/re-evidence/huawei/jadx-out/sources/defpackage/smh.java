package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes17.dex */
public class smh implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endTime")
    private long f48361a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("startTime")
    private long f48362c;

    public void c(long j) {
        this.f48362c = j;
    }

    public void a(long j) {
        this.f48361a = j;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/audio/audioWorkout/queryPlayStatic";
    }
}
