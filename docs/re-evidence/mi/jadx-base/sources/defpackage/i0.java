package defpackage;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f20635a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr3);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr3);
    }
}
