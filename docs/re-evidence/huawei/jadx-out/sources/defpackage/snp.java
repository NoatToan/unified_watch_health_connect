package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes17.dex */
public class snp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String f48429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("createTime")
    private long f48430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String f48431c;

    @SerializedName("subTitle")
    private String d;

    @SerializedName("title")
    private String e;

    public String e() {
        return this.e;
    }

    public String a() {
        return this.f48429a;
    }

    public String c() {
        return this.f48431c;
    }

    public long b() {
        return this.f48430b;
    }

    public String d() {
        return this.d;
    }

    public String toString() {
        return "AudioWorkoutRestBean{title='" + this.e + "', desc='" + this.f48429a + "', createTime=" + this.f48430b + ", workoutId='" + this.f48431c + "', subTitle='" + this.d + "'}";
    }
}
