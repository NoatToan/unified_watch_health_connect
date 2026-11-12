package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Utils;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes34.dex */
public class x {
    public static final String e = "DnsInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15583b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15584c = 0;
    public final AtomicLong d = new AtomicLong(0);

    public long e() {
        return this.d.incrementAndGet();
    }

    public int d() {
        return this.f15582a;
    }

    public long c() {
        if (this.f15584c == 0) {
            this.f15584c = Utils.getCurrentTime(true);
        }
        return this.f15584c;
    }

    public long b() {
        return this.f15583b;
    }

    public void a(long j) {
        this.f15583b = j;
    }

    public void a(int i) {
        this.f15582a = i;
    }

    public void a() {
        this.d.set(0L);
        this.f15584c = 0L;
    }
}
