package defpackage;

import java.security.SecureRandom;
import net.lingala.zip4j.crypto.Encrypter;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.enums.AesKeyStrength;

/* JADX INFO: loaded from: classes20.dex */
public class zon implements Encrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f54397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f54398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f54399c;
    private zor d;
    private boolean e;
    private byte[] g;
    private zol h;
    private final SecureRandom j = new SecureRandom();
    private int i = 1;
    private int f = 0;

    public zon(char[] cArr, AesKeyStrength aesKeyStrength, boolean z) throws ZipException {
        if (cArr == null || cArr.length == 0) {
            throw new ZipException("input password is empty or null");
        }
        if (aesKeyStrength != AesKeyStrength.KEY_STRENGTH_128 && aesKeyStrength != AesKeyStrength.KEY_STRENGTH_256) {
            throw new ZipException("Invalid AES key strength");
        }
        this.e = false;
        this.f54399c = new byte[16];
        this.f54398b = new byte[16];
        d(cArr, aesKeyStrength, z);
    }

    private void d(char[] cArr, AesKeyStrength aesKeyStrength, boolean z) throws ZipException {
        byte[] bArrE = e(aesKeyStrength.getSaltLength());
        this.g = bArrE;
        byte[] bArrA = zoo.a(bArrE, cArr, aesKeyStrength, z);
        this.f54397a = zoo.e(bArrA, aesKeyStrength);
        this.d = zoo.c(bArrA, aesKeyStrength);
        this.h = zoo.a(bArrA, aesKeyStrength);
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] bArr) throws ZipException {
        if (bArr == null) {
            throw new ZipException("input bytes are null, cannot perform AES encryption");
        }
        return encryptData(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] bArr, int i, int i2) throws ZipException {
        int i3;
        if (this.e) {
            throw new ZipException("AES Encrypter is in finished state (A non 16 byte block has already been passed to encrypter)");
        }
        if (i2 % 16 != 0) {
            this.e = true;
        }
        int i4 = i;
        while (true) {
            int i5 = i + i2;
            if (i4 >= i5) {
                return i2;
            }
            int i6 = i4 + 16;
            this.f = i6 <= i5 ? 16 : i5 - i4;
            zoo.e(this.f54398b, this.i);
            this.d.c(this.f54398b, this.f54399c);
            int i7 = 0;
            while (true) {
                i3 = this.f;
                if (i7 < i3) {
                    int i8 = i4 + i7;
                    bArr[i8] = (byte) (bArr[i8] ^ this.f54399c[i7]);
                    i7++;
                }
            }
            this.h.b(bArr, i4, i3);
            this.i++;
            i4 = i6;
        }
    }

    private byte[] e(int i) throws ZipException {
        if (i != 8 && i != 16) {
            throw new ZipException("invalid salt size, cannot generate salt");
        }
        int i2 = i == 8 ? 2 : 4;
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i2; i3++) {
            int iNextInt = this.j.nextInt();
            int i4 = i3 * 4;
            bArr[i4] = (byte) (iNextInt >> 24);
            bArr[i4 + 1] = (byte) (iNextInt >> 16);
            bArr[i4 + 2] = (byte) (iNextInt >> 8);
            bArr[i4 + 3] = (byte) iNextInt;
        }
        return bArr;
    }

    public byte[] a() {
        byte[] bArr = new byte[10];
        System.arraycopy(this.h.d(), 0, bArr, 0, 10);
        return bArr;
    }

    public byte[] b() {
        return this.f54397a;
    }

    public byte[] e() {
        return this.g;
    }
}
