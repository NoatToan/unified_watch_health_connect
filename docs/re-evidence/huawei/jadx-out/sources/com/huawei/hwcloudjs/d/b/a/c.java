package com.huawei.hwcloudjs.d.b.a;

import java.util.Map;

/* JADX INFO: loaded from: classes37.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17085b = -1;

    public abstract void a(String str, Map<String, String> map);

    public int c() {
        return this.f17084a;
    }

    public void b(int i) {
        this.f17084a = i;
    }

    public int b() {
        return this.f17085b;
    }

    public String[] a() {
        return new String[0];
    }

    public void a(int i) {
        this.f17085b = i;
    }
}
