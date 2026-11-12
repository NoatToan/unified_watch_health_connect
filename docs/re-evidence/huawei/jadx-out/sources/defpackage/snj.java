package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class snj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultCode")
    private String f48414b;

    @SerializedName("workoutHistoryList")
    private List<snn> d;

    @SerializedName("resultDesc")
    private String e;

    public List<snn> c() {
        return this.d;
    }

    public String e() {
        return this.f48414b;
    }

    public String b() {
        return this.e;
    }

    public String toString() {
        return "AudioWorkoutListHistoryRsp{workoutHistoryList=" + this.d + ", resultCode='" + this.f48414b + "', resultDesc='" + this.e + "'}";
    }
}
