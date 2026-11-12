package com.amap.api.col.p0003sl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ll extends lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f3064a;

    public ll() {
        this.f3064a = new ByteArrayOutputStream();
    }

    public ll(lr lrVar) {
        super(lrVar);
        this.f3064a = new ByteArrayOutputStream();
    }

    @Override // com.amap.api.col.p0003sl.lr
    protected final byte[] a(byte[] bArr) {
        byte[] byteArray = this.f3064a.toByteArray();
        try {
            this.f3064a.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f3064a = new ByteArrayOutputStream();
        return byteArray;
    }

    @Override // com.amap.api.col.p0003sl.lr
    public final void b(byte[] bArr) {
        try {
            this.f3064a.write(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
