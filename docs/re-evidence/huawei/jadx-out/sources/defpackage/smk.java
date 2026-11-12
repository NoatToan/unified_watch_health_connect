package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes43.dex */
public class smk implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("lecturerId")
    private String f48368b;

    @SerializedName("ts")
    private long d;

    public void b(String str) {
        this.f48368b = str;
    }

    public void c(long j) {
        this.d = j;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/audio/audioWorkout/getLecturerInfo";
    }
}
