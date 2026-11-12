package com.huawei.hms.network.embedded;

import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes34.dex */
public class b5 implements c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NetworkInfo.DetailedState f14599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14600c;

    public String toString() {
        return "NetworkInfoImpl{networkType=" + this.f14598a + ", networkDetailState=" + this.f14599b + ", networkTimeStamp=" + this.f14600c + '}';
    }

    @Override // com.huawei.hms.network.embedded.c5
    public int c() {
        return this.f14598a;
    }

    @Override // com.huawei.hms.network.embedded.c5
    public long b() {
        return this.f14600c;
    }

    public void a(NetworkInfo.DetailedState detailedState) {
        this.f14599b = detailedState;
    }

    public void a(long j) {
        this.f14600c = j;
    }

    public void a(int i) {
        this.f14598a = i;
    }

    @Override // com.huawei.hms.network.embedded.c5
    public NetworkInfo.DetailedState a() {
        return this.f14599b;
    }
}
