package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes2.dex */
public class vfy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.GOAL)
    private float f51052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("activityCalGoal")
    private int f51053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("caloricDeficitGoal")
    private int f51054c;

    @SerializedName("consumption")
    private float d;

    @SerializedName("canTake")
    private float e;

    @SerializedName("inTake")
    private float f;

    @SerializedName("weekGoalDiff")
    private double g;

    @SerializedName("restingCaloriesBurned")
    private int h;

    @SerializedName("restingCalories")
    private float i;

    @SerializedName("updateTime")
    private long j;

    public vfy(float f, float f2, float f3, float f4) {
        this.f = f;
        this.d = f2;
        this.f51052a = f3;
        this.i = f4;
        this.e = Math.max(f3 - f, 0.0f);
    }

    public void e(float f) {
        float f2 = this.f + f;
        this.f = f2;
        float f3 = this.f51052a - f2;
        this.e = f3;
        this.e = Math.max(0.0f, f3);
    }

    public void b(float f) {
        this.f = f;
        float f2 = this.f51052a - f;
        this.e = f2;
        this.e = Math.max(0.0f, f2);
    }

    public float h() {
        return this.f;
    }

    public float d() {
        float f = this.f51052a - this.f;
        this.e = f;
        float fMax = Math.max(0.0f, f);
        this.e = fMax;
        return fMax;
    }

    public float a() {
        return this.d;
    }

    public float e() {
        return this.f51052a;
    }

    public float i() {
        return this.i;
    }

    public double j() {
        return this.g;
    }

    public void e(double d) {
        this.g = d;
    }

    public void a(float f) {
        this.d = f;
        float f2 = this.f51052a - this.f;
        this.e = f2;
        this.e = Math.max(0.0f, f2);
    }

    public void c(float f) {
        this.f51052a = f;
        float f2 = f - this.f;
        this.e = f2;
        this.e = Math.max(0.0f, f2);
    }

    public void d(float f) {
        this.i = f;
    }

    public int g() {
        if (this.h == 0) {
            this.h = (int) UnitUtil.d(((double) ((this.i / 24.0f) / 60.0f)) * ((System.currentTimeMillis() - lsl.r(System.currentTimeMillis())) / 60000.0d), 0);
        }
        return this.h;
    }

    public void a(int i) {
        this.h = i;
    }

    public int c() {
        return this.f51054c;
    }

    public void d(int i) {
        this.f51054c = i;
    }

    public int b() {
        return this.f51053b;
    }

    public void b(int i) {
        this.f51053b = i;
    }

    public long f() {
        return this.j;
    }

    public void b(long j) {
        this.j = j;
    }

    public String toString() {
        return "DietCalorieOverview{mInTake=" + this.f + ", mCanTake=" + this.e + ", mConsumption=" + this.d + ", mGoal=" + this.f51052a + ", mRestingCalories=" + this.i + ", mRestingCaloriesBurned=" + this.h + ", mWeekGoalDiff=" + this.g + ", mCaloricDeficitGoal=" + this.f51054c + ", mActivityCalGoal=" + this.f51053b + ", mUpdateTime=" + this.j + '}';
    }
}
