package com.huawei.haf.common.dfx.memory;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryMonitorConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5884a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5885c;
    private final int d;
    private final int e;

    public MemoryMonitorConfig(int i, int i2) {
        this(i, i2, 5);
    }

    public MemoryMonitorConfig(int i, int i2, int i3) {
        this.f5885c = i;
        this.f5884a = i + i3;
        this.d = i2;
        this.e = i2 + i3;
    }

    public int e() {
        return this.f5885c;
    }

    public int b() {
        return this.f5884a;
    }

    public int a() {
        return this.d;
    }

    public int d() {
        return this.e;
    }
}
