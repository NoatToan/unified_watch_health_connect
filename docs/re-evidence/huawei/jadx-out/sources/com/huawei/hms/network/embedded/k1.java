package com.huawei.hms.network.embedded;

/* JADX INFO: loaded from: classes34.dex */
public class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14991c;

    public String toString() {
        return "BandwidthInfo{receivedTime=" + this.f14989a + ", currentHost='" + this.f14990b + "', estimatedBandwidthBps=" + this.f14991c + '}';
    }

    public void setTime(long j) {
        this.f14989a = j;
    }

    public void setEstimatedBandwidthBps(long j) {
        this.f14991c = j;
    }

    public void setCurrentHost(String str) {
        this.f14990b = str;
    }

    public long getReceivedTime() {
        return this.f14989a;
    }

    public long getEstimatedBandwidthBps() {
        return this.f14991c;
    }

    public String getCurrentHost() {
        return this.f14990b;
    }

    public k1(long j, String str, long j2) {
        this.f14989a = j;
        this.f14990b = str;
        this.f14991c = j2;
    }

    public k1() {
        this.f14989a = 0L;
        this.f14990b = "unknown";
        this.f14991c = 0L;
    }
}
