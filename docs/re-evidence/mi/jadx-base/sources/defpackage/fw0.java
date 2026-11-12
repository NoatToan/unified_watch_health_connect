package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public final class fw0 implements h06 {
    public static final Collection<Integer> c = Arrays.asList(64);
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8i f18306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18307b;

    public fw0(byte[] bArr) throws GeneralSecurityException {
        if (c.contains(Integer.valueOf(bArr.length))) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f18307b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f18306a = new j8i(bArrCopyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    @Override // defpackage.h06
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipherA = pb8.f.a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipherA.init(2, new SecretKeySpec(this.f18307b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipherA.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && zoo.b()) {
            bArrDoFinal = new byte[0];
        }
        if (b83.b(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // defpackage.h06
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipherA = pb8.f.a("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipherA.init(1, new SecretKeySpec(this.f18307b, "AES"), new IvParameterSpec(bArr3));
        return b83.a(bArrC, cipherA.doFinal(bArr));
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        if (bArr.length == 0) {
            return this.f18306a.a(e, 16);
        }
        byte[] bArrA = this.f18306a.a(d, 16);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = b83.e(jw0.b(bArrA), this.f18306a.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f18306a.a(bArr3.length >= 16 ? b83.f(bArr3, bArrA) : b83.e(jw0.a(bArr3), jw0.b(bArrA)), 16);
    }
}
