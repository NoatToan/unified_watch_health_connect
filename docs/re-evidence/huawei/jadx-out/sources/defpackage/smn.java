package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.operation.utils.Constants;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes17.dex */
public class smn implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("timeZone")
    private String f48370a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(Constants.START_DATE)
    private String f48371c;

    @SerializedName("endDate")
    private String e;

    public void b(String str) {
        this.f48371c = str;
    }

    public void a(String str) {
        this.e = str;
    }

    public void d(String str) {
        this.f48370a = str;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/audio/audioWorkout/getWorkoutListHistory";
    }
}
