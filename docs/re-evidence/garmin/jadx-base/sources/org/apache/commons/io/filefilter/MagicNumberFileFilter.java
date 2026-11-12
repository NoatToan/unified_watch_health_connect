package org.apache.commons.io.filefilter;

import am.j;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class MagicNumberFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = -547733176983104172L;
    private final long byteOffset;
    private final byte[] magicNumbers;

    public MagicNumberFileFilter(String str, long j8) {
        if (str == null) {
            h.s("The magic number cannot be null");
            throw null;
        }
        if (str.isEmpty()) {
            h.s("The magic number must contain at least one byte");
            throw null;
        }
        if (j8 < 0) {
            h.s("The offset cannot be negative");
            throw null;
        }
        this.magicNumbers = str.getBytes(Charset.defaultCharset());
        this.byteOffset = j8;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        if (file != null && file.isFile() && file.canRead()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
                try {
                    byte[] bArr = new byte[this.magicNumbers.length];
                    randomAccessFile.seek(this.byteOffset);
                    int i14 = randomAccessFile.read(bArr);
                    byte[] bArr2 = this.magicNumbers;
                    if (i14 != bArr2.length) {
                        randomAccessFile.close();
                        return false;
                    }
                    boolean zEquals = Arrays.equals(bArr2, bArr);
                    randomAccessFile.close();
                    return zEquals;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th5) {
                            th3.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder sb3 = new StringBuilder(super.toString());
        sb3.append("(");
        sb3.append(new String(this.magicNumbers, Charset.defaultCharset()));
        sb3.append(",");
        return j.i(this.byteOffset, ")", sb3);
    }

    public MagicNumberFileFilter(String str) {
        this(str, 0L);
    }

    public MagicNumberFileFilter(byte[] bArr) {
        this(bArr, 0L);
    }

    public MagicNumberFileFilter(byte[] bArr, long j8) {
        if (bArr != null) {
            if (bArr.length == 0) {
                h.s("The magic number must contain at least one byte");
                throw null;
            }
            if (j8 >= 0) {
                byte[] bArr2 = new byte[bArr.length];
                this.magicNumbers = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.byteOffset = j8;
                return;
            }
            h.s("The offset cannot be negative");
            throw null;
        }
        h.s("The magic number cannot be null");
        throw null;
    }
}
