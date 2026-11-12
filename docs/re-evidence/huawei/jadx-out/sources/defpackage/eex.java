package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class eex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("carbohydrate")
    private float f32858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("fat")
    private float f32859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("foodId")
    private String f32860c;

    @SerializedName("count")
    private int d;

    @SerializedName("extensionUnits")
    private List<efa> e;

    @SerializedName("kilocalorie")
    private int f;

    @SerializedName("protein")
    private float g;

    @SerializedName("gi")
    private float h;

    @SerializedName("imageUrl")
    private String i;

    @SerializedName("foodName")
    private String j;

    @SerializedName("unit")
    private String m;

    public String a() {
        return this.f32860c;
    }

    public String h() {
        return this.m;
    }

    public int d() {
        return this.d;
    }

    public float e() {
        return this.f32858a;
    }

    public float f() {
        return this.g;
    }

    public float c() {
        return this.f32859b;
    }

    public List<efa> b() {
        return this.e;
    }

    public String toString() {
        return "Food{mFoodId=" + this.f32860c + ", mFoodName=" + this.j + ", mImageUrl=" + this.i + ", mUnit=" + this.m + ", mCount=" + this.d + ", mKilocalorie=" + this.f + ", mCarbohydrate=" + this.f32858a + ", mProtein=" + this.g + ", mFat=" + this.f32859b + ", mGi=" + this.h + ", mExtensionUnits=" + this.e + '}';
    }
}
