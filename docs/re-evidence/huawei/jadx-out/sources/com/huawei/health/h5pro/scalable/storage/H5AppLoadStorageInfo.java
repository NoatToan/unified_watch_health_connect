package com.huawei.health.h5pro.scalable.storage;

/* JADX INFO: loaded from: classes7.dex */
public class H5AppLoadStorageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6972a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6973c;
    private long d;
    private long e;

    public long getCount() {
        return this.d;
    }

    public long getLoadTime() {
        return this.e;
    }

    public String getName() {
        return this.f6973c;
    }

    public long getPreLoadTime() {
        return this.f6972a;
    }

    public void setCount(long j) {
        this.d = j;
    }

    public void setLoadTime(long j) {
        this.e = j;
    }

    public void setName(String str) {
        this.f6973c = str;
    }

    public void setPreLoadTime(long j) {
        this.f6972a = j;
    }

    public String toString() {
        return "H5AppLoadStorageInfo{name='" + this.f6973c + "', count=" + this.d + ", loadTime=" + this.e + ", preLoadTime=" + this.f6972a + '}';
    }
}
