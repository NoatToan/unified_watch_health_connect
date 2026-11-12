package com.huawei.hms.network.file.a;

import com.huawei.hms.network.file.api.RequestManager;
import com.huawei.hms.network.file.core.util.FLogger;

/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f15672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f15673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15674c;
    private int d;
    private volatile boolean e;
    private volatile boolean f;

    public String toString() {
        return "PerformanceInfo{availableRamStart=" + this.f15672a + ", availableRamMid=" + this.f15673b + ", cpuFreqStart=" + this.f15674c + ", cpuFreqMid=" + this.d + super.toString() + '}';
    }

    public int d() {
        return this.f15674c;
    }

    public int c() {
        return this.d;
    }

    public void b(Long l) {
        this.f15672a = l;
    }

    public void b(int i) {
        this.f15674c = i;
    }

    public Long b() {
        return this.f15672a;
    }

    public void a(Long l) {
        this.f15673b = l;
    }

    public void a(long j, long j2, int i) {
        if (!this.e) {
            b(Long.valueOf(com.huawei.hms.network.file.core.util.a.a(RequestManager.getAppContext())));
            b(com.huawei.hms.network.file.core.util.a.a());
            this.e = true;
            FLogger.d("PerformanceInfoCollect", "first data collect:availableRamStart_" + this.f15672a + ";cpuFreqStart_" + this.f15674c, new Object[0]);
        }
        if (j + ((long) i) < j2 / 2 || this.f) {
            return;
        }
        a(Long.valueOf(com.huawei.hms.network.file.core.util.a.a(RequestManager.getAppContext())));
        a(com.huawei.hms.network.file.core.util.a.a());
        this.f = true;
        FLogger.d("PerformanceInfoCollect", "middle data collect：availableRamMid_" + this.f15673b + ";cpuFreqMid_" + this.d, new Object[0]);
    }

    public void a(int i) {
        this.d = i;
    }

    public Long a() {
        return this.f15673b;
    }
}
