package defpackage;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o6t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o6t f28805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f28806b = null;

    public o6t() {
    }

    public final byte[] a() throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        byte[] bArrB = b(this.f28806b);
        o6t o6tVar = this.f28805a;
        if (o6tVar == null) {
            return bArrB;
        }
        o6tVar.f28806b = bArrB;
        return o6tVar.a();
    }

    public abstract byte[] b(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException;

    public void c(byte[] bArr) {
    }

    public o6t(o6t o6tVar) {
        this.f28805a = o6tVar;
    }
}
