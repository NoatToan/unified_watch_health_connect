package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public final class xv0 implements xu0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f39494b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f39495a;

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return pb8.f.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public xv0(byte[] bArr) throws GeneralSecurityException {
        fnq.a(bArr.length);
        this.f39495a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec c(byte[] bArr) throws GeneralSecurityException {
        return d(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec d(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        return (!zoo.b() || zoo.a() > 19) ? new GCMParameterSpec(128, bArr, i, i2) : new IvParameterSpec(bArr, i, i2);
    }

    @Override // defpackage.xu0
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrC = mbj.c(12);
        System.arraycopy(bArrC, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrC);
        ThreadLocal<Cipher> threadLocal = f39494b;
        threadLocal.get().init(1, this.f39495a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocal.get().updateAAD(bArr2);
        }
        int iDoFinal = threadLocal.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }

    @Override // defpackage.xu0
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecD = d(bArr, 0, 12);
        ThreadLocal<Cipher> threadLocal = f39494b;
        threadLocal.get().init(2, this.f39495a, algorithmParameterSpecD);
        if (bArr2 != null && bArr2.length != 0) {
            threadLocal.get().updateAAD(bArr2);
        }
        return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
    }
}
