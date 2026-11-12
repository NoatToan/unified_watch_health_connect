package cn.hutool.crypto.digest;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.crypto.CryptoException;
import defpackage.au3;
import defpackage.cid;
import defpackage.fql;
import defpackage.jm9;
import defpackage.m7c;
import defpackage.p8i;
import defpackage.tt3;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

/* JADX INFO: loaded from: classes.dex */
public class Digester implements Serializable {
    private static final long serialVersionUID = 1;
    private MessageDigest digest;
    protected int digestCount;
    protected byte[] salt;
    protected int saltPosition;

    public Digester(DigestAlgorithm digestAlgorithm) {
        this(digestAlgorithm.getValue());
    }

    private byte[] digestWithSalt(InputStream inputStream, int i) throws IOException {
        if (this.saltPosition <= 0) {
            this.digest.update(this.salt);
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            int i3 = inputStream.read(bArr, 0, i);
            if (i3 <= -1) {
                break;
            }
            i2 += i3;
            int i4 = this.saltPosition;
            if (i4 <= 0 || i2 < i4) {
                this.digest.update(bArr, 0, i3);
            } else {
                if (i2 != i4) {
                    this.digest.update(bArr, 0, i2 - i4);
                }
                this.digest.update(this.salt);
                this.digest.update(bArr, i2 - this.saltPosition, i3);
            }
        }
        if (i2 < this.saltPosition) {
            this.digest.update(this.salt);
        }
        return this.digest.digest();
    }

    private byte[] digestWithoutSalt(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        while (true) {
            int i2 = inputStream.read(bArr, 0, i);
            if (i2 <= -1) {
                return this.digest.digest();
            }
            this.digest.update(bArr, 0, i2);
        }
    }

    private byte[] doDigest(byte[]... bArr) {
        for (byte[] bArr2 : bArr) {
            if (bArr2 != null) {
                this.digest.update(bArr2);
            }
        }
        return this.digest.digest();
    }

    private byte[] resetAndRepeatDigest(byte[] bArr) {
        int iMax = Math.max(1, this.digestCount);
        reset();
        for (int i = 0; i < iMax - 1; i++) {
            bArr = doDigest(bArr);
            reset();
        }
        return bArr;
    }

    public byte[] digest(String str, String str2) {
        return digest(str, au3.a(str2));
    }

    public String digestHex(String str, String str2) {
        return digestHex(str, au3.a(str2));
    }

    public MessageDigest getDigest() {
        return this.digest;
    }

    public int getDigestLength() {
        return this.digest.getDigestLength();
    }

    public Digester init(String str, Provider provider) {
        if (provider == null) {
            this.digest = fql.c(str);
        } else {
            try {
                this.digest = MessageDigest.getInstance(str, provider);
            } catch (NoSuchAlgorithmException e) {
                throw new CryptoException(e);
            }
        }
        return this;
    }

    public Digester reset() {
        this.digest.reset();
        return this;
    }

    public Digester setDigestCount(int i) {
        this.digestCount = i;
        return this;
    }

    public Digester setSalt(byte[] bArr) {
        this.salt = bArr;
        return this;
    }

    public Digester setSaltPosition(int i) {
        this.saltPosition = i;
        return this;
    }

    public Digester(String str) {
        this(str, (Provider) null);
    }

    public byte[] digest(String str, Charset charset) {
        return digest(tt3.g(str, charset));
    }

    public String digestHex(String str, Charset charset) {
        return m7c.e(digest(str, charset));
    }

    public Digester(DigestAlgorithm digestAlgorithm, Provider provider) {
        init(digestAlgorithm.getValue(), provider);
    }

    public byte[] digest(String str) {
        return digest(str, au3.f3449b);
    }

    public String digestHex(String str) {
        return digestHex(str, "UTF-8");
    }

    public byte[] digest(File file) throws Throwable {
        BufferedInputStream bufferedInputStreamS;
        try {
            bufferedInputStreamS = jm9.s(file);
            try {
                byte[] bArrDigest = digest(bufferedInputStreamS);
                cid.a(bufferedInputStreamS);
                return bArrDigest;
            } catch (Throwable th) {
                th = th;
                cid.a(bufferedInputStreamS);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStreamS = null;
        }
    }

    public String digestHex(File file) {
        return m7c.e(digest(file));
    }

    public Digester(String str, Provider provider) {
        init(str, provider);
    }

    public String digestHex(byte[] bArr) {
        return m7c.e(digest(bArr));
    }

    public String digestHex(InputStream inputStream) {
        return m7c.e(digest(inputStream));
    }

    public String digestHex(InputStream inputStream, int i) {
        return m7c.e(digest(inputStream, i));
    }

    public byte[] digest(byte[] bArr) {
        byte[] bArrDoDigest;
        int i = this.saltPosition;
        if (i <= 0) {
            bArrDoDigest = doDigest(this.salt, bArr);
        } else if (i >= bArr.length) {
            bArrDoDigest = doDigest(bArr, this.salt);
        } else if (p8i.e(this.salt)) {
            this.digest.update(bArr, 0, this.saltPosition);
            this.digest.update(this.salt);
            MessageDigest messageDigest = this.digest;
            int i2 = this.saltPosition;
            messageDigest.update(bArr, i2, bArr.length - i2);
            bArrDoDigest = this.digest.digest();
        } else {
            bArrDoDigest = doDigest(bArr);
        }
        return resetAndRepeatDigest(bArrDoDigest);
    }

    public byte[] digest(InputStream inputStream) {
        return digest(inputStream, 8192);
    }

    public byte[] digest(InputStream inputStream, int i) throws IORuntimeException {
        byte[] bArrDigestWithSalt;
        if (i < 1) {
            i = 8192;
        }
        try {
            if (p8i.c(this.salt)) {
                bArrDigestWithSalt = digestWithoutSalt(inputStream, i);
            } else {
                bArrDigestWithSalt = digestWithSalt(inputStream, i);
            }
            return resetAndRepeatDigest(bArrDigestWithSalt);
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }
}
