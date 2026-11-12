package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes9.dex */
public class iuu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("subCategory")
    private int f38051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("fatInfo")
    private iuw f38052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("startDay")
    private int f38053c;

    @SerializedName("lastCaloriesGapWeight")
    private double d;

    @SerializedName("category")
    private int e;

    @SerializedName("updateTime")
    private long h;

    @SerializedName("weightManagerType")
    private int j;

    public iuw d() {
        return this.f38052b;
    }

    public long b() {
        return this.h;
    }

    public String toString() {
        return "GoalDetail{mCategory=" + this.e + ", mSubCategory=" + this.f38051a + ", mLastCaloriesGapWeight=" + this.d + ", mWeightManagerType=" + this.j + ", mStartDay=" + this.f38053c + ", mSimpleFatInfo=" + this.f38052b + ", mUpdateTime=" + this.h + '}';
    }
}
