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
public final class lm extends lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private km f3065a;

    public lm() {
        this.f3065a = new ko();
    }

    public lm(lr lrVar) {
        super(lrVar);
        this.f3065a = new ko();
    }

    @Override // com.amap.api.col.p0003sl.lr
    protected final byte[] a(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        return this.f3065a.b(bArr);
    }
}
