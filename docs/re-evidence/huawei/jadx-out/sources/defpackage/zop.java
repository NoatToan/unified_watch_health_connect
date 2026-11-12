package defpackage;

import java.util.Arrays;
import net.lingala.zip4j.crypto.Decrypter;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.enums.AesKeyStrength;

/* JADX INFO: loaded from: classes46.dex */
public class zop implements Decrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zor f54400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zol f54401b;
    private int d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f54402c = new byte[16];
    private byte[] e = new byte[16];

    public zop(zpp zppVar, char[] cArr, byte[] bArr, byte[] bArr2, boolean z) throws ZipException {
        c(bArr, bArr2, cArr, zppVar, z);
    }

    private void c(byte[] bArr, byte[] bArr2, char[] cArr, zpp zppVar, boolean z) throws ZipException {
        if (cArr == null || cArr.length <= 0) {
            throw new ZipException("empty or null password provided for AES decryption", ZipException.Type.WRONG_PASSWORD);
        }
        AesKeyStrength aesKeyStrengthA = zppVar.a();
        byte[] bArrA = zoo.a(bArr, cArr, aesKeyStrengthA, z);
        if (!Arrays.equals(bArr2, zoo.e(bArrA, aesKeyStrengthA))) {
            throw new ZipException("Wrong Password", ZipException.Type.WRONG_PASSWORD);
        }
        this.f54400a = zoo.c(bArrA, aesKeyStrengthA);
        this.f54401b = zoo.a(bArrA, aesKeyStrengthA);
    }

    @Override // net.lingala.zip4j.crypto.Decrypter
    public int decryptData(byte[] bArr, int i, int i2) throws ZipException {
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                return i2;
            }
            int i5 = i3 + 16;
            int i6 = i5 <= i4 ? 16 : i4 - i3;
            this.f54401b.b(bArr, i3, i6);
            zoo.e(this.f54402c, this.d);
            this.f54400a.c(this.f54402c, this.e);
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = i3 + i7;
                bArr[i8] = (byte) (bArr[i8] ^ this.e[i7]);
            }
            this.d++;
            i3 = i5;
        }
    }

    public byte[] c(int i) {
        return this.f54401b.c(i);
    }
}
