package com.xiaomi.push;

import defpackage.f4t;
import defpackage.r2t;

/* JADX INFO: loaded from: classes11.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2t f14122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f4t f14123b;

    public j(jz jzVar) {
        f4t f4tVar = new f4t();
        this.f14123b = f4tVar;
        this.f14122a = jzVar.a(f4tVar);
    }

    public void a(jm jmVar, byte[] bArr) {
        try {
            this.f14123b.h(bArr);
            jmVar.a(this.f14122a);
        } finally {
            this.f14122a.I();
        }
    }
}
