package com.huawei.hms.network.embedded;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes34.dex */
public class x4 implements y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15594c;
    public long d;
    public String e;

    public String toString() {
        return "DetectImpl{detectType=" + this.f15592a + ", statusCode=" + this.f15593b + ", totalTime=" + this.f15594c + ", detectStartTime=" + this.d + ", domain=" + this.e + '}';
    }

    @Override // com.huawei.hms.network.embedded.y4
    public long e() {
        return this.f15594c;
    }

    @Override // com.huawei.hms.network.embedded.y4
    public int d() {
        return this.f15592a;
    }

    @Override // com.huawei.hms.network.embedded.y4
    public int c() {
        return this.f15593b;
    }

    public void b(int i) {
        this.f15593b = i;
    }

    @Override // com.huawei.hms.network.embedded.y4
    public long b() {
        return this.d;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e = str;
    }

    public void a(long j) {
        this.f15594c = j;
    }

    public void a(int i) {
        this.f15592a = i;
    }

    @Override // com.huawei.hms.network.embedded.y4
    public String a() {
        return this.e;
    }

    public x4(int i) {
        this.e = "unknown";
        this.f15592a = i;
        this.d = System.currentTimeMillis();
    }

    public x4() {
        this.e = "unknown";
        this.f15592a = -1;
        this.d = System.currentTimeMillis();
    }
}
