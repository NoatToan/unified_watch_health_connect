package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Method f5723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected byte[] f5724b;
    protected String c;
    protected int d;
    protected String e;
    protected boolean f;

    public a(Method method, int i, String str, byte[] bArr, String str2, boolean z) {
        this.f5723a = method;
        this.d = i;
        this.c = str;
        this.f5724b = bArr;
        this.e = str2;
        this.f = z;
    }
}
