package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public final class iv0 implements k7d {
    public static final ThreadLocal<Cipher> d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f22116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22117b;
    public final int c;

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return pb8.f.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public iv0(byte[] bArr, int i) throws GeneralSecurityException {
        fnq.a(bArr.length);
        this.f22116a = new SecretKeySpec(bArr, "AES");
        int blockSize = d.get().getBlockSize();
        this.c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f22117b = i;
    }

    @Override // defpackage.k7d
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f22117b;
        if (length > Integer.MAX_VALUE - i) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f22117b));
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] bArrC = mbj.c(i);
        System.arraycopy(bArrC, 0, bArr2, 0, this.f22117b);
        c(bArr, 0, bArr.length, bArr2, this.f22117b, bArrC, true);
        return bArr2;
    }

    @Override // defpackage.k7d
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f22117b;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int length2 = bArr.length;
        int i2 = this.f22117b;
        byte[] bArr3 = new byte[length2 - i2];
        c(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final void c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = d.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f22117b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.f22116a, ivParameterSpec);
        } else {
            cipher.init(2, this.f22116a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
