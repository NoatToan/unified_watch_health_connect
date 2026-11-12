package com.xiaomi.push;

import defpackage.b4t;
import defpackage.r2t;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f14158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4t f14159b;
    public r2t c;

    public k(jz jzVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f14158a = byteArrayOutputStream;
        b4t b4tVar = new b4t(byteArrayOutputStream);
        this.f14159b = b4tVar;
        this.c = jzVar.a(b4tVar);
    }

    public byte[] a(jm jmVar) {
        this.f14158a.reset();
        jmVar.b(this.c);
        return this.f14158a.toByteArray();
    }
}
