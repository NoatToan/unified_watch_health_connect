package com.xiaomi.push;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes22.dex */
public class ek {
    private final ByteArrayOutputStream a;
    private final ew b;
    private ep c;

    public ek() {
        this(new el.a());
    }

    public ek(er erVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a = byteArrayOutputStream;
        ew ewVar = new ew(byteArrayOutputStream);
        this.b = ewVar;
        this.c = erVar.a(ewVar);
    }

    public byte[] a(ef efVar) {
        this.a.reset();
        efVar.b(this.c);
        return this.a.toByteArray();
    }
}
