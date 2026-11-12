package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public final class j8i implements i8i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f22526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f22527b;
    public byte[] c;

    public j8i(byte[] bArr) throws GeneralSecurityException {
        fnq.a(bArr.length);
        this.f22526a = new SecretKeySpec(bArr, "AES");
        b();
    }

    public static Cipher c() throws GeneralSecurityException {
        return pb8.f.a("AES/ECB/NoPadding");
    }

    @Override // defpackage.i8i
    public byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherC = c();
        cipherC.init(1, this.f22526a);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        byte[] bArrD = iMax * 16 == bArr.length ? b83.d(bArr, (iMax - 1) * 16, this.f22527b, 0, 16) : b83.e(jw0.a(Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length)), this.c);
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipherC.doFinal(b83.d(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipherC.doFinal(b83.e(bArrD, bArrDoFinal)), i);
    }

    public final void b() throws GeneralSecurityException {
        Cipher cipherC = c();
        cipherC.init(1, this.f22526a);
        byte[] bArrB = jw0.b(cipherC.doFinal(new byte[16]));
        this.f22527b = bArrB;
        this.c = jw0.b(bArrB);
    }
}
