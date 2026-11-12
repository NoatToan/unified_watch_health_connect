package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;

/* JADX INFO: loaded from: classes28.dex */
public class eym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("humidity")
    private int f33688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE)
    private int f33689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("windDir")
    private String f33690c;

    @SerializedName("realFeel")
    private int d;

    @SerializedName("weatherId")
    private int e;

    @SerializedName("windSpeed")
    private int i;

    public void c(int i) {
        this.e = i;
    }

    public void a(int i) {
        this.f33689b = i;
    }

    public void e(int i) {
        this.f33688a = i;
    }

    public void e(String str) {
        this.f33690c = str;
    }

    public void b(int i) {
        this.i = i;
    }

    public void d(int i) {
        this.d = i;
    }

    public String toString() {
        return "Weather{weatherId=" + this.e + ", temperature=" + this.f33689b + ", humidity=" + this.f33688a + ", windDir='" + this.f33690c + "', windSpeed=" + this.i + ", realFeel=" + this.d + '}';
    }
}
