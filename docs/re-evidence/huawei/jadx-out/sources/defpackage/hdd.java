package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes9.dex */
public class hdd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("unit")
    private String f36447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("unitValue")
    private int f36448b;

    @SerializedName("unitId")
    private String d;

    @SerializedName("eatValue")
    private double e;

    public String b() {
        return this.f36447a;
    }

    public int a() {
        return this.f36448b;
    }

    public String toString() {
        return "FoodExtensionUnits{mUnit=" + this.f36447a + ", mUnitValue=" + this.f36448b + ", mEatValue=" + this.e + ", mUnitId=" + this.d + "}";
    }
}
