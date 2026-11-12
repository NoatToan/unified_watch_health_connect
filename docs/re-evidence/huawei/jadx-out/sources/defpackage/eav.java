package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.feature.result.CommonConstant;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes7.dex */
public class eav {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("age")
    private int f32619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("conflictFlag")
    private int f32620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dateTime")
    private long f32621c;

    @SerializedName("fat")
    private double d;

    @SerializedName(CommonConstant.KEY_GENDER)
    private int e;

    @SerializedName("height")
    private int f;

    @SerializedName("hr")
    private double g;

    @SerializedName("Z13")
    private double h;

    @SerializedName("Z34_H")
    private double i;

    @SerializedName("Z34")
    private double j;

    @SerializedName("Z13_H")
    private double k;

    @SerializedName("Z14")
    private double l;

    @SerializedName("Z12")
    private double m;

    @SerializedName("Z12_H")
    private double n;

    @SerializedName("Z14_H")
    private double o;

    @SerializedName("Z23")
    private double p;

    @SerializedName("Z23_H")
    private double q;

    @SerializedName("Z24")
    private double r;

    @SerializedName("Z24_H")
    private double s;

    @SerializedName("uid")
    private String t;

    public String r() {
        return this.t;
    }

    public int a() {
        return this.e;
    }

    public int c() {
        return this.f32619a;
    }

    public int d() {
        return this.f;
    }

    public double n() {
        return this.m;
    }

    public double h() {
        return this.h;
    }

    public double o() {
        return this.l;
    }

    public double k() {
        return this.p;
    }

    public double t() {
        return this.r;
    }

    public double j() {
        return this.j;
    }

    public double m() {
        return this.n;
    }

    public double i() {
        return this.k;
    }

    public double l() {
        return this.o;
    }

    public double p() {
        return this.q;
    }

    public double q() {
        return this.s;
    }

    public double f() {
        return this.i;
    }

    public double b() {
        return this.d;
    }

    public double g() {
        return this.g;
    }

    public int e() {
        return this.f32620b;
    }

    public String toString() {
        return "ConflictUserInfo{mUid='" + CommonUtil.n(this.t) + "', mGender=" + this.e + ", mAge=" + this.f32619a + ", mHeight=" + this.f + ", mResLhrh=" + this.m + ", mResLhlf=" + this.h + ", mResLhrf=" + this.l + ", mResRhlf=" + this.p + ", mResRhrf=" + this.r + ", mResLfrf=" + this.j + ", mResLhrhHf=" + this.n + ", mResLhlfHf=" + this.k + ", mResLhrfHf=" + this.o + ", mResRhlfHf=" + this.q + ", mResRhrfHf=" + this.s + ", mResLfrfHf=" + this.i + ", mFat=" + this.d + ", mHr=" + this.g + ", mConflictFlag=" + this.f32620b + ", mDateTime=" + this.f32621c + '}';
    }
}
