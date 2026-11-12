package com.huawei.health.manager.util;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class TotalDetailStepsCacheBean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("intensityTime")
    private int f8147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("activeCount")
    private int f8148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("runningSteps")
    private int f8149c;

    @SerializedName("climbSteps")
    private int d;

    @SerializedName("sysClockTime")
    private long e;

    @SerializedName("timestamp")
    private long f;

    @SerializedName("todaySensorSteps")
    private int g;

    @SerializedName("walkSteps")
    private int i;

    public TotalDetailStepsCacheBean(Builder builder) {
        this.f = builder.j;
        this.g = builder.i;
        this.i = builder.g;
        this.f8149c = builder.f8150a;
        this.d = builder.d;
        this.e = builder.f8151b;
        this.f8147a = builder.e;
        this.f8148b = builder.f8152c;
    }

    public long h() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public int j() {
        return this.i;
    }

    public int c() {
        return this.f8149c;
    }

    public int e() {
        return this.d;
    }

    public long b() {
        return this.e;
    }

    public int d() {
        return this.f8147a;
    }

    public int a() {
        return this.f8148b;
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f8151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8152c;
        private int d;
        private int e;
        private int g;
        private int i;
        private long j;

        public Builder b(long j) {
            this.j = j;
            return this;
        }

        public Builder c(int i) {
            this.i = i;
            return this;
        }

        public Builder f(int i) {
            this.g = i;
            return this;
        }

        public Builder b(int i) {
            this.f8150a = i;
            return this;
        }

        public Builder a(int i) {
            this.d = i;
            return this;
        }

        public Builder e(long j) {
            this.f8151b = j;
            return this;
        }

        public Builder d(int i) {
            this.e = i;
            return this;
        }

        public Builder e(int i) {
            this.f8152c = i;
            return this;
        }

        public TotalDetailStepsCacheBean e() {
            return new TotalDetailStepsCacheBean(this);
        }
    }
}
