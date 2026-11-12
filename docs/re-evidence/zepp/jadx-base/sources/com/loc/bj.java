package com.loc;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes18.dex */
public abstract class bj {
    public bj c;
    public byte[] d = null;

    public bj() {
    }

    public bj(bj bjVar) {
        this.c = bjVar;
    }

    public final byte[] a() throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        bj bjVar = this;
        while (true) {
            byte[] bArrA = bjVar.a(bjVar.d);
            bjVar = bjVar.c;
            if (bjVar == null) {
                return bArrA;
            }
            bjVar.d = bArrA;
        }
    }

    public abstract byte[] a(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException;

    public void b(byte[] bArr) {
    }
}
