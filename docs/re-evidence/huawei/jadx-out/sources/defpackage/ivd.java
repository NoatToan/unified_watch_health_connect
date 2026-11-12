package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ivd implements Serializable {
    private static final long serialVersionUID = 468976053049501463L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("caloricDeficitGoal")
    private int f38074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("activityCalGoal")
    private int f38075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("weightInit")
    private float f38076c;

    @SerializedName("fatLossRatio")
    private iux d;

    @SerializedName("onePointFull")
    private iuv e;

    @SerializedName("proportionMeal")
    private iuy f;

    @SerializedName("weightManagerType")
    private int g;

    public int i() {
        return this.g;
    }

    public void c(int i) {
        this.g = i;
    }

    public float c() {
        return this.f38076c;
    }

    public void d(float f) {
        this.f38076c = f;
    }

    public int e() {
        return this.f38074a;
    }

    public void e(int i) {
        this.f38074a = i;
    }

    public int b() {
        return this.f38075b;
    }

    public void a(int i) {
        this.f38075b = i;
    }

    public void a(iuy iuyVar) {
        this.f = iuyVar;
    }

    public iux d() {
        return this.d;
    }

    public void e(iux iuxVar) {
        this.d = iuxVar;
    }

    public iuv a() {
        return this.e;
    }

    public void c(iuv iuvVar) {
        this.e = iuvVar;
    }

    public String toString() {
        return "WeightManager{mWeightManagerType=" + this.g + ", mInitWeight=" + this.f38076c + ", mCaloricDeficitGoal=" + this.f38074a + ", mActivityCalGoal=" + this.f38075b + ", mProportionMeal=" + this.f + ", mFatLossRatio=" + this.d + ", mOnePointFull=" + this.e + '}';
    }
}
