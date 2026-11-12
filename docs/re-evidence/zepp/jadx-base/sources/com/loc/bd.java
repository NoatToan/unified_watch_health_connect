package com.loc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class bd extends bj {
    public ByteArrayOutputStream a;

    public bd() {
        this.a = new ByteArrayOutputStream();
    }

    public bd(bj bjVar) {
        super(bjVar);
        this.a = new ByteArrayOutputStream();
    }

    @Override // com.loc.bj
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

    @Override // com.loc.bj
    public final void b(byte[] bArr) {
        try {
            this.a.write(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
