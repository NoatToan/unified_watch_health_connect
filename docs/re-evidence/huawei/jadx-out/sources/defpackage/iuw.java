package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes9.dex */
public class iuw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    private int f38056a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("caloriesGap")
    private int f38057c;

    @SerializedName("activityCalories")
    private int d;

    public int d() {
        return this.d;
    }

    public int b() {
        return this.f38057c;
    }

    public int a() {
        return this.f38056a;
    }

    public String toString() {
        return "SimpleFatInfo{activityCalories=" + this.d + ", caloriesGap=" + this.f38057c + ", period=" + this.f38056a + '}';
    }
}
