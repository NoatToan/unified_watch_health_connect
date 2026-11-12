package com.amap.api.mapcore.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class jc extends ji {
    public ByteArrayOutputStream a;

    public jc() {
        this.a = new ByteArrayOutputStream();
    }

    @Override // com.amap.api.mapcore.util.ji
    public final byte[] a(byte[] bArr) {
        byte[] byteArray = this.a.toByteArray();
        try {
            this.a.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.a = new ByteArrayOutputStream();
        return byteArray;
    }

    @Override // com.amap.api.mapcore.util.ji
    public final void b(byte[] bArr) {
        try {
            this.a.write(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public jc(ji jiVar) {
        super(jiVar);
        this.a = new ByteArrayOutputStream();
    }
}
