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
public abstract class m4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m4t f25755a;

    public m4t() {
    }

    public abstract byte[] a(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException;

    public final byte[] b(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException {
        m4t m4tVar = this.f25755a;
        if (m4tVar != null) {
            bArr = m4tVar.b(bArr);
        }
        return a(bArr);
    }

    public m4t(m4t m4tVar) {
        this.f25755a = m4tVar;
    }
}
