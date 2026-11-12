package cn.hutool.crypto.symmetric;

import cn.hutool.crypto.CryptoException;
import defpackage.au3;
import defpackage.fql;
import defpackage.lio;
import defpackage.m7c;
import defpackage.o12;
import defpackage.tt3;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class RC4 implements Serializable {
    private static final int KEY_MIN_LENGTH = 5;
    private static final int SBOX_LENGTH = 256;
    private static final long serialVersionUID = 1;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private int[] sbox;

    public RC4(String str) throws CryptoException {
        setKey(str);
    }

    private int[] initSBox(byte[] bArr) {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[i] = i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            i2 = (((i2 + iArr[i3]) + bArr[i3 % bArr.length]) & 255) % 256;
            swap(i3, i2, iArr);
        }
        return iArr;
    }

    private void swap(int i, int i2, int[] iArr) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public byte[] crypt(byte[] bArr) {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            int[] iArr = (int[]) this.sbox.clone();
            byte[] bArr2 = new byte[bArr.length];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < bArr.length; i3++) {
                i = (i + 1) % 256;
                i2 = (i2 + iArr[i]) % 256;
                swap(i, i2, iArr);
                bArr2[i3] = (byte) (iArr[(iArr[i] + iArr[i2]) % 256] ^ bArr[i3]);
            }
            lock.unlock();
            return bArr2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public String decrypt(byte[] bArr, Charset charset) throws CryptoException {
        return lio.F0(crypt(bArr), charset);
    }

    public byte[] encrypt(String str, Charset charset) throws CryptoException {
        return crypt(tt3.g(str, charset));
    }

    public String encryptBase64(byte[] bArr) {
        return o12.b(crypt(bArr));
    }

    public String encryptHex(byte[] bArr) {
        return m7c.e(crypt(bArr));
    }

    public void setKey(String str) throws CryptoException {
        int length = str.length();
        if (length < 5 || length >= 256) {
            throw new CryptoException("Key length has to be between {} and {}", 5, 255);
        }
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        writeLock.lock();
        try {
            this.sbox = initSBox(tt3.z0(str));
        } finally {
            writeLock.unlock();
        }
    }

    public String decrypt(byte[] bArr) throws CryptoException {
        return decrypt(bArr, au3.f3449b);
    }

    public byte[] encrypt(String str) throws CryptoException {
        return encrypt(str, au3.f3449b);
    }

    public String encryptBase64(String str, Charset charset) {
        return o12.b(encrypt(str, charset));
    }

    public String encryptHex(String str, Charset charset) {
        return m7c.e(encrypt(str, charset));
    }

    public String decrypt(String str) {
        return decrypt(fql.d(str));
    }

    public String encryptBase64(String str) {
        return o12.b(encrypt(str));
    }

    public String encryptHex(String str) {
        return m7c.e(encrypt(str));
    }

    public String decrypt(String str, Charset charset) {
        return lio.D0(decrypt(str), charset);
    }
}
