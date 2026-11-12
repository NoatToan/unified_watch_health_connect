package com.huawei.hms.kit.awareness.barrier.internal.b;

/* JADX INFO: loaded from: classes34.dex */
public class o extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13963c;
    public final String d;
    public final String e;

    @Override // com.huawei.hms.kit.awareness.barrier.internal.b.f
    public boolean c() {
        return true;
    }

    public boolean f() {
        return this.f13963c == 2;
    }

    public boolean e() {
        return this.f13963c == 1;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.b.f
    public com.huawei.hms.kit.awareness.barrier.internal.type.f d() {
        return com.huawei.hms.kit.awareness.barrier.internal.type.f.WIFI;
    }

    public boolean b() {
        return this.f13962b == 4;
    }

    public boolean a() {
        return this.f13962b == 3;
    }

    public o(int i, int i2, String str, String str2) {
        this.f13962b = i;
        this.f13963c = i2;
        this.d = str;
        this.e = str2;
    }
}
