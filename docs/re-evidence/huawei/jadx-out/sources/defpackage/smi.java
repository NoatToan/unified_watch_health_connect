package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes43.dex */
public class smi implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("nowDate")
    private String f48363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("audioWorkoutId")
    private String f48364b;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/audio/audioWorkout/getAudioWorkoutInfo";
    }
}
