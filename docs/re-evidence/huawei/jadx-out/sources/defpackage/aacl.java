package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;

/* JADX INFO: loaded from: classes20.dex */
public class aacl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f127b = zzg.e(new SecureRandom(), 256);

    public static byte[] b(CipherSuite cipherSuite, SecretKey secretKey, SecretKey secretKey2, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = new byte[bArr2.length + Math.max(cipherSuite.getMacMessageBlockLength(), 256)];
        int recordIvLength = cipherSuite.getRecordIvLength();
        Cipher threadLocalCipher = cipherSuite.getThreadLocalCipher();
        int i = 0;
        threadLocalCipher.init(2, secretKey, new IvParameterSpec(bArr2, 0, recordIvLength));
        int iDoFinal = threadLocalCipher.doFinal(bArr2, recordIvLength, bArr2.length - recordIvLength, bArr3);
        System.arraycopy(f127b, 0, bArr3, iDoFinal, cipherSuite.getMacMessageBlockLength());
        int macLength = cipherSuite.getMacLength();
        int i2 = bArr3[iDoFinal - 1] & 255;
        int i3 = (iDoFinal - macLength) - 1;
        int i4 = i3 - i2;
        if (i4 < 0) {
            i4 = i3;
            i2 = 0;
        }
        if (d(i2, bArr3, i4 + macLength)) {
            i = i2;
            i3 = i4;
        }
        int length = bArr.length;
        bArr[length - 2] = (byte) ((i3 >> 8) & 255);
        bArr[length - 1] = (byte) (i3 & 255);
        MessageDigest threadLocalMacMessageDigest = cipherSuite.getThreadLocalMacMessageDigest();
        threadLocalMacMessageDigest.reset();
        byte[] bArrC = c(cipherSuite.getThreadLocalMac(), secretKey2, bArr, bArr3, i3);
        int macMessageLengthBytes = cipherSuite.getMacMessageLengthBytes();
        int macMessageBlockLength = cipherSuite.getMacMessageBlockLength();
        int length2 = bArr.length + i3 + macMessageLengthBytes;
        threadLocalMacMessageDigest.update(bArr3, i3, ((((i + length2) / macMessageBlockLength) - (length2 / macMessageBlockLength)) * macMessageBlockLength) + 1);
        threadLocalMacMessageDigest.reset();
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, i3, macLength + i3);
        boolean zIsEqual = MessageDigest.isEqual(bArrCopyOfRange, bArrC);
        zzg.a(bArrC);
        zzg.a(bArrCopyOfRange);
        byte[] bArrCopyOf = zIsEqual ? Arrays.copyOf(bArr3, i3) : null;
        zzg.a(bArr3);
        if (zIsEqual) {
            return bArrCopyOf;
        }
        throw new aaci();
    }

    public static byte[] e(CipherSuite cipherSuite, SecretKey secretKey, SecretKey secretKey2, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzl zzlVar = new zzl(bArr2.length + cipherSuite.getMacLength() + cipherSuite.getRecordIvLength(), true);
        zzlVar.a(bArr2);
        byte[] bArrC = c(cipherSuite.getThreadLocalMac(), secretKey2, bArr, bArr2, bArr2.length);
        zzlVar.a(bArrC);
        zzg.a(bArrC);
        int length = bArr2.length;
        int macLength = cipherSuite.getMacLength();
        int recordIvLength = cipherSuite.getRecordIvLength();
        int i = ((length + macLength) + 1) % recordIvLength;
        int i2 = i > 0 ? recordIvLength - i : 0;
        byte[] bArr3 = new byte[i2 + 1];
        Arrays.fill(bArr3, (byte) i2);
        zzlVar.a(bArr3);
        zzg.a(bArr3);
        Cipher threadLocalCipher = cipherSuite.getThreadLocalCipher();
        threadLocalCipher.init(1, secretKey);
        byte[] iv = threadLocalCipher.getIV();
        byte[] bArrD = zzlVar.d();
        zzlVar.b();
        byte[] bArrCopyOf = Arrays.copyOf(iv, iv.length + bArrD.length);
        threadLocalCipher.doFinal(bArrD, 0, bArrD.length, bArrCopyOf, iv.length);
        return bArrCopyOf;
    }

    public static byte[] c(Mac mac, SecretKey secretKey, byte[] bArr, byte[] bArr2, int i) throws InvalidKeyException {
        mac.init(secretKey);
        mac.update(bArr);
        mac.update(bArr2, 0, i);
        byte[] bArrDoFinal = mac.doFinal();
        mac.reset();
        return bArrDoFinal;
    }

    public static boolean d(int i, byte[] bArr, int i2) {
        if (bArr.length < i2 + 257) {
            throw new IllegalArgumentException("data must contain 257 bytes from offset on!");
        }
        byte b2 = (byte) i;
        byte b3 = 0;
        for (int i3 = 0; i3 <= i; i3++) {
            b3 = (byte) (b3 | (bArr[i2 + i3] ^ b2));
        }
        byte b4 = 0;
        for (int i4 = i + 1; i4 < 256; i4++) {
            b4 = (byte) (b4 | (bArr[i2 + i4] ^ b2));
        }
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] ^ b4);
        return b3 == 0;
    }
}
