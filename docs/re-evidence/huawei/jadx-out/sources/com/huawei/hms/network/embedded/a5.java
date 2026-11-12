package com.huawei.hms.network.embedded;

import com.huawei.hms.network.netdiag.info.SignalInfoMetrics;

/* JADX INFO: loaded from: classes34.dex */
public class a5 extends z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g5 f14560a = new f5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w4 f14561b = new v4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SignalInfoMetrics f14562c;
    public SignalInfoMetrics d;
    public c5 e;
    public int f;
    public int g;
    public int h;

    public String toString() {
        return "NetDiagInfoImpl{systemControlInfo=" + this.f14560a + ", allDetectInfo=" + this.f14561b + ", signalInfo=" + this.f14562c + ", networkInfo=" + this.e + '}';
    }

    @Override // com.huawei.hms.network.embedded.z4
    public int h() {
        return this.f;
    }

    @Override // com.huawei.hms.network.embedded.z4
    public g5 g() {
        return this.f14560a;
    }

    @Override // com.huawei.hms.network.embedded.z4
    public SignalInfoMetrics f() {
        return this.f14562c;
    }

    @Override // com.huawei.hms.network.embedded.z4
    public c5 e() {
        return this.e;
    }

    @Override // com.huawei.hms.network.embedded.z4
    public int d() {
        return this.h;
    }

    public void c(int i) {
        this.h = i;
    }

    @Override // com.huawei.hms.network.embedded.z4
    public SignalInfoMetrics c() {
        return this.d;
    }

    public void b(SignalInfoMetrics signalInfoMetrics) {
        if (signalInfoMetrics != null) {
            this.f14562c = signalInfoMetrics;
        }
    }

    public void b(int i) {
        this.f = i;
    }

    @Override // com.huawei.hms.network.embedded.z4
    public w4 b() {
        return this.f14561b;
    }

    public void a(SignalInfoMetrics signalInfoMetrics) {
        this.d = signalInfoMetrics;
    }

    public void a(w4 w4Var) {
        if (w4Var != null) {
            this.f14561b = w4Var;
        }
    }

    public void a(g5 g5Var) {
        if (g5Var != null) {
            this.f14560a = g5Var;
        }
    }

    public void a(c5 c5Var) {
        this.e = c5Var;
    }

    public void a(int i) {
        this.g = i;
    }

    @Override // com.huawei.hms.network.embedded.z4
    public int a() {
        return this.g;
    }

    public a5() {
        e5 e5Var = new e5();
        this.f14562c = e5Var;
        this.d = e5Var;
        this.e = new b5();
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }
}
