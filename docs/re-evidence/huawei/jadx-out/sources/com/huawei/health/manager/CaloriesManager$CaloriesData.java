package com.huawei.health.manager;

import defpackage.lsl;

/* JADX INFO: loaded from: classes2.dex */
public class CaloriesManager$CaloriesData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8032a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f8033b = 0.0d;

    public long b() {
        return this.f8032a;
    }

    public void e(long j, double d) {
        this.f8032a = lsl.r(j);
        this.f8033b = d;
    }

    public void d() {
        this.f8032a = 0L;
        this.f8033b = 0.0d;
    }

    public void d(double d) {
        this.f8033b += d;
    }
}
