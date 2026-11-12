package com.huawei.hms.scankit.p;

import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f16411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16413c;
    private final List d;
    private final String e;
    private Integer f;
    private Integer g;
    private Object h;
    private final int i;
    private final int j;

    public x1(byte[] bArr, String str, List list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public byte[] c() {
        return this.f16411a;
    }

    public int a() {
        return this.f16412b;
    }

    public String d() {
        return this.f16413c;
    }

    public x1(byte[] bArr, String str, List list, String str2, int i, int i2) {
        this.f16411a = bArr;
        this.f16412b = bArr == null ? 0 : bArr.length * 8;
        this.f16413c = str;
        this.d = list;
        this.e = str2;
        this.i = i2;
        this.j = i;
    }

    public Object b() {
        return this.h;
    }

    public void a(Integer num) {
        this.g = num;
    }

    public void b(Integer num) {
        this.f = num;
    }

    public void a(int i) {
        this.f16412b = i;
    }

    public void a(Object obj) {
        this.h = obj;
    }
}
