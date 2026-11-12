package cn.hutool.crypto.symmetric;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.crypto.CryptoException;
import cn.hutool.crypto.Padding;
import defpackage.au3;
import defpackage.cid;
import defpackage.fql;
import defpackage.lio;
import defpackage.m7c;
import defpackage.nbj;
import defpackage.o12;
import defpackage.p8i;
import defpackage.qj1;
import defpackage.qk1;
import defpackage.tt3;
import defpackage.u0e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class SymmetricCrypto implements Serializable {
    private static final long serialVersionUID = 1;
    private Cipher cipher;
    private boolean isZeroPadding;
    private final Lock lock;
    private AlgorithmParameterSpec params;
    private SecretKey secretKey;

    public SymmetricCrypto(SymmetricAlgorithm symmetricAlgorithm) {
        this(symmetricAlgorithm, (byte[]) null);
    }

    private void copyForZeroPadding(CipherInputStream cipherInputStream, OutputStream outputStream, int i) throws IOException {
        int iMax = i * (8192 > i ? Math.max(1, 8192 / i) : 1);
        byte[] bArr = new byte[iMax];
        byte[] bArr2 = new byte[iMax];
        boolean z = true;
        int i2 = 0;
        while (true) {
            int i3 = cipherInputStream.read(bArr2);
            if (i3 == -1) {
                break;
            }
            if (z) {
                z = false;
            } else {
                outputStream.write(bArr, 0, i2);
            }
            qj1.p(bArr2, bArr, i3);
            i2 = i3;
        }
        int i4 = i2 - 1;
        while (i4 >= 0 && bArr[i4] == 0) {
            i4--;
        }
        outputStream.write(bArr, 0, i4 + 1);
        outputStream.flush();
    }

    private Cipher initCipher(int i) throws InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = this.cipher;
        AlgorithmParameterSpec algorithmParameterSpec = this.params;
        if (algorithmParameterSpec == null) {
            cipher.init(i, this.secretKey);
        } else {
            cipher.init(i, this.secretKey, algorithmParameterSpec);
        }
        return cipher;
    }

    private byte[] paddingDataWithZero(byte[] bArr, int i) {
        int length;
        int length2;
        return (!this.isZeroPadding || (length2 = (length = bArr.length) % i) <= 0) ? bArr : p8i.g(bArr, (length + i) - length2);
    }

    private byte[] removePadding(byte[] bArr, int i) {
        if (!this.isZeroPadding || i <= 0) {
            return bArr;
        }
        int length = bArr.length;
        if (length % i != 0) {
            return bArr;
        }
        int i2 = length - 1;
        while (i2 >= 0 && bArr[i2] == 0) {
            i2--;
        }
        return p8i.g(bArr, i2 + 1);
    }

    public byte[] decrypt(byte[] bArr) {
        this.lock.lock();
        try {
            try {
                Cipher cipherInitCipher = initCipher(2);
                int blockSize = cipherInitCipher.getBlockSize();
                byte[] bArrDoFinal = cipherInitCipher.doFinal(bArr);
                this.lock.unlock();
                return removePadding(bArrDoFinal, blockSize);
            } catch (Exception e) {
                throw new CryptoException(e);
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public String decryptStr(byte[] bArr, Charset charset) {
        return lio.F0(decrypt(bArr), charset);
    }

    public byte[] encrypt(byte[] bArr) {
        this.lock.lock();
        try {
            try {
                Cipher cipherInitCipher = initCipher(1);
                byte[] bArrDoFinal = cipherInitCipher.doFinal(paddingDataWithZero(bArr, cipherInitCipher.getBlockSize()));
                this.lock.unlock();
                return bArrDoFinal;
            } catch (Exception e) {
                throw new CryptoException(e);
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public String encryptBase64(byte[] bArr) {
        return o12.b(encrypt(bArr));
    }

    public String encryptHex(byte[] bArr) {
        return m7c.e(encrypt(bArr));
    }

    public Cipher getCipher() {
        return this.cipher;
    }

    public SecretKey getSecretKey() {
        return this.secretKey;
    }

    public SymmetricCrypto init(String str, SecretKey secretKey) {
        qk1.p(str, "'algorithm' must be not blank !", new Object[0]);
        this.secretKey = secretKey;
        if (str.startsWith("PBE")) {
            this.params = new PBEParameterSpec(nbj.e(8), 100);
        }
        Padding padding = Padding.ZeroPadding;
        if (str.contains(padding.name())) {
            str = tt3.W(str, padding.name(), Padding.NoPadding.name());
            this.isZeroPadding = true;
        }
        this.cipher = fql.a(str);
        return this;
    }

    public SymmetricCrypto setIv(IvParameterSpec ivParameterSpec) {
        setParams(ivParameterSpec);
        return this;
    }

    public SymmetricCrypto setParams(AlgorithmParameterSpec algorithmParameterSpec) {
        this.params = algorithmParameterSpec;
        return this;
    }

    public byte[] update(byte[] bArr) {
        this.lock.lock();
        try {
            try {
                Cipher cipherInitCipher = initCipher(1);
                byte[] bArrUpdate = cipherInitCipher.update(paddingDataWithZero(bArr, cipherInitCipher.getBlockSize()));
                this.lock.unlock();
                return bArrUpdate;
            } catch (Exception e) {
                throw new CryptoException(e);
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public String updateHex(byte[] bArr) {
        return m7c.e(update(bArr));
    }

    public SymmetricCrypto(String str) {
        this(str, (byte[]) null);
    }

    public String decryptStr(byte[] bArr) {
        return decryptStr(bArr, au3.f3449b);
    }

    public String encryptBase64(String str, String str2) {
        return o12.b(encrypt(str, str2));
    }

    public String encryptHex(String str, String str2) {
        return m7c.e(encrypt(str, str2));
    }

    public SymmetricCrypto setIv(byte[] bArr) {
        setIv(new IvParameterSpec(bArr));
        return this;
    }

    public SymmetricCrypto(SymmetricAlgorithm symmetricAlgorithm, byte[] bArr) {
        this(symmetricAlgorithm.getValue(), bArr);
    }

    public String decryptStr(String str, Charset charset) {
        return lio.F0(decrypt(str), charset);
    }

    public String encryptBase64(String str, Charset charset) {
        return o12.b(encrypt(str, charset));
    }

    public String encryptHex(String str, Charset charset) {
        return m7c.e(encrypt(str, charset));
    }

    public SymmetricCrypto(SymmetricAlgorithm symmetricAlgorithm, SecretKey secretKey) {
        this(symmetricAlgorithm.getValue(), secretKey);
    }

    public String decryptStr(String str) {
        return decryptStr(str, au3.f3449b);
    }

    public String encryptBase64(String str) {
        return o12.b(encrypt(str));
    }

    public String encryptHex(String str) {
        return m7c.e(encrypt(str));
    }

    public SymmetricCrypto(String str, byte[] bArr) {
        this(str, u0e.f(str, bArr));
    }

    public String decryptStr(InputStream inputStream, Charset charset) {
        return lio.F0(decrypt(inputStream), charset);
    }

    public String encryptBase64(InputStream inputStream) {
        return o12.b(encrypt(inputStream));
    }

    public String encryptHex(InputStream inputStream) {
        return m7c.e(encrypt(inputStream));
    }

    public SymmetricCrypto(String str, SecretKey secretKey) {
        this(str, secretKey, null);
    }

    public String decryptStr(InputStream inputStream) {
        return decryptStr(inputStream, au3.f3449b);
    }

    public SymmetricCrypto(String str, SecretKey secretKey, AlgorithmParameterSpec algorithmParameterSpec) {
        this.lock = new ReentrantLock();
        init(str, secretKey);
        if (algorithmParameterSpec != null) {
            setParams(algorithmParameterSpec);
        }
    }

    public void encrypt(InputStream inputStream, OutputStream outputStream, boolean z) throws Throwable {
        int blockSize;
        int i;
        this.lock.lock();
        CipherOutputStream cipherOutputStream = null;
        try {
            try {
                Cipher cipherInitCipher = initCipher(1);
                CipherOutputStream cipherOutputStream2 = new CipherOutputStream(outputStream, cipherInitCipher);
                try {
                    long jB = cid.b(inputStream, cipherOutputStream2);
                    if (this.isZeroPadding && (blockSize = cipherInitCipher.getBlockSize()) > 0 && (i = (int) (jB % ((long) blockSize))) > 0) {
                        cipherOutputStream2.write(new byte[blockSize - i]);
                        cipherOutputStream2.flush();
                    }
                    this.lock.unlock();
                    if (z) {
                        cid.a(inputStream);
                        cid.a(cipherOutputStream2);
                    }
                } catch (IORuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    e = e2;
                    throw new CryptoException(e);
                } catch (Throwable th) {
                    th = th;
                    cipherOutputStream = cipherOutputStream2;
                    this.lock.unlock();
                    if (z) {
                        cid.a(inputStream);
                        cid.a(cipherOutputStream);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IORuntimeException e3) {
        } catch (Exception e4) {
            e = e4;
        }
    }

    public void decrypt(InputStream inputStream, OutputStream outputStream, boolean z) throws Throwable {
        int blockSize;
        this.lock.lock();
        CipherInputStream cipherInputStream = null;
        try {
            try {
                Cipher cipherInitCipher = initCipher(2);
                CipherInputStream cipherInputStream2 = new CipherInputStream(inputStream, cipherInitCipher);
                try {
                    if (this.isZeroPadding && (blockSize = cipherInitCipher.getBlockSize()) > 0) {
                        copyForZeroPadding(cipherInputStream2, outputStream, blockSize);
                        this.lock.unlock();
                        if (z) {
                            cid.a(inputStream);
                            cid.a(cipherInputStream2);
                            return;
                        }
                        return;
                    }
                    cid.b(cipherInputStream2, outputStream);
                    this.lock.unlock();
                    if (z) {
                        cid.a(inputStream);
                        cid.a(cipherInputStream2);
                    }
                } catch (IORuntimeException e) {
                    throw e;
                } catch (IOException e2) {
                    e = e2;
                    throw new IORuntimeException(e);
                } catch (Exception e3) {
                    e = e3;
                    throw new CryptoException(e);
                } catch (Throwable th) {
                    th = th;
                    cipherInputStream = cipherInputStream2;
                    this.lock.unlock();
                    if (z) {
                        cid.a(inputStream);
                        cid.a(cipherInputStream);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IORuntimeException e4) {
        } catch (IOException e5) {
            e = e5;
        } catch (Exception e6) {
            e = e6;
        }
    }

    public byte[] encrypt(String str, String str2) {
        return encrypt(tt3.f(str, str2));
    }

    public byte[] encrypt(String str, Charset charset) {
        return encrypt(tt3.g(str, charset));
    }

    public byte[] encrypt(String str) {
        return encrypt(tt3.g(str, au3.f3449b));
    }

    public byte[] encrypt(InputStream inputStream) throws IORuntimeException {
        return encrypt(cid.k(inputStream));
    }

    public byte[] decrypt(String str) {
        return decrypt(fql.d(str));
    }

    public byte[] decrypt(InputStream inputStream) throws IORuntimeException {
        return decrypt(cid.k(inputStream));
    }
}
