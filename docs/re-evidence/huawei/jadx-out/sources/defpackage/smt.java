package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes17.dex */
public class smt implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("playRecord")
    private long f48394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("type")
    private int f48395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("duration")
    private long f48396c;

    @SerializedName("timestamp")
    private long d;

    @SerializedName("timeZone")
    private String e;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String j;

    public void e(long j) {
        this.d = j;
    }

    public void c(int i) {
        this.f48395b = i;
    }

    public void a(String str) {
        this.j = str;
    }

    public void a(long j) {
        this.f48394a = j;
    }

    public void b(String str) {
        this.e = str;
    }

    public void d(long j) {
        this.f48396c = j;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/audio/audioWorkout/setWorkoutPlay";
    }
}
