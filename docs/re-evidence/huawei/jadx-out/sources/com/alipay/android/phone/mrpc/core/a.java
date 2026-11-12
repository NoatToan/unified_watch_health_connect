package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f1966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f1967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1968c;
    public int d;
    public String e;
    public boolean f;

    public a(Method method, int i, String str, byte[] bArr, String str2, boolean z) {
        this.f1966a = method;
        this.d = i;
        this.f1968c = str;
        this.f1967b = bArr;
        this.e = str2;
        this.f = z;
    }
}
