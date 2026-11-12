package com.amap.api.col.p0003sl;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    lr f3072c;
    byte[] d = null;

    protected abstract byte[] a(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException;

    public void b(byte[] bArr) {
    }

    lr() {
    }

    lr(lr lrVar) {
        this.f3072c = lrVar;
    }

    public final byte[] a() throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        byte[] bArrA = a(this.d);
        lr lrVar = this.f3072c;
        if (lrVar == null) {
            return bArrA;
        }
        lrVar.d = bArrA;
        return lrVar.a();
    }
}
