package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes43.dex */
public class smm implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("ts")
    private long f48369b;

    public void d(long j) {
        this.f48369b = j;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/audio/audioWorkout/userBehaviorList";
    }
}
