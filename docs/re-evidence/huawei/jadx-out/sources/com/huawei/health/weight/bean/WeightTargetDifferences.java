package com.huawei.health.weight.bean;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class WeightTargetDifferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("maintainTargetWeightRange")
    private int f10418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("targetDifferences")
    private double f10419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("targetBeginDate")
    private long f10420c;

    @SerializedName("targetFinishDate")
    private long d;

    /* JADX INFO: loaded from: classes9.dex */
    public enum WeightTargetType {
        WEIGHT_GAIN,
        WEIGHT_LOSS,
        WEIGHT_KEE
    }

    public WeightTargetDifferences(double d, long j, long j2, int i) {
        b(d);
        this.f10420c = j;
        this.d = j2;
        this.f10418a = i;
    }

    public void e(double d) {
        b(d);
    }

    private void b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return;
        }
        this.f10419b = d;
    }

    public double c() {
        return this.f10419b;
    }

    public long b() {
        return this.d;
    }

    public long a() {
        return this.f10420c;
    }

    public int d() {
        return this.f10418a;
    }

    public String toString() {
        return "WeightTargetDifferences{mTargetDifferences=" + this.f10419b + ", mTargetBeginDate=" + this.f10420c + ", mTargetFinishDate=" + this.d + ", mMaintainTargetWeightRange=" + this.f10418a + "}";
    }

    public WeightTargetType e() {
        double d = this.f10419b;
        if (d == 0.0d) {
            return WeightTargetType.WEIGHT_KEE;
        }
        if (d < 0.0d) {
            return WeightTargetType.WEIGHT_GAIN;
        }
        return WeightTargetType.WEIGHT_LOSS;
    }
}
