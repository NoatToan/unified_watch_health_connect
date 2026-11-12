package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes27.dex */
public class efb {

    @SerializedName("standardIntakeUpper")
    private int d;

    @SerializedName("standardIntakeLower")
    private int e;

    public int d() {
        return this.e;
    }

    public int b() {
        return this.d;
    }

    public String toString() {
        return "NutritionAnalysisItem{mStandardIntakeLower=" + this.e + ", mStandardIntakeUpper=" + this.d + '}';
    }
}
