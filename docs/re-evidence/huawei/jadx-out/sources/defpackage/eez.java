package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class eez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("carbohydratesSugRange")
    private int[] f32861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("carbohydrates")
    private int f32862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("fatSugRange")
    private int[] f32863c;

    @SerializedName("coefficient")
    private int d = 1;

    @SerializedName("fat")
    private int e;

    @SerializedName("proteinSugRange")
    private int[] g;

    @SerializedName("protein")
    private int j;

    public eez(int i, int i2, int i3) {
        this.f32862b = i;
        this.j = i2;
        this.e = i3;
    }

    public void c(int[] iArr) {
        this.f32861a = iArr;
    }

    public void b(int[] iArr) {
        this.g = iArr;
    }

    public void a(int[] iArr) {
        this.f32863c = iArr;
    }

    public String toString() {
        return "DeviceSyncDietAnalysis{mCoefficient=" + this.d + ", mCarbohydrates=" + this.f32862b + ", mProtein=" + this.j + ", mFat=" + this.e + ", mCarbohydratesSugRange=" + Arrays.toString(this.f32861a) + ", mProteinSugRange=" + Arrays.toString(this.g) + ", mFatSugRange=" + Arrays.toString(this.f32863c) + '}';
    }
}
