package org.conscrypt;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes3.dex */
class OpenSSLBIOInputStream extends FilterInputStream {
    private long ctx;

    public OpenSSLBIOInputStream(InputStream inputStream, boolean z14) {
        super(inputStream);
        this.ctx = NativeCrypto.create_BIO_InputStream(this, z14);
    }

    public long getBioContext() {
        return this.ctx;
    }

    public int gets(byte[] bArr) {
        int i14;
        int i15 = 0;
        if (bArr != null && bArr.length != 0) {
            while (i15 < bArr.length && (i14 = read()) != -1) {
                if (i14 != 10) {
                    bArr[i15] = (byte) i14;
                    i15++;
                } else if (i15 != 0) {
                    break;
                }
            }
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) throws IOException {
        if (i14 < 0 || i15 < 0 || i15 > bArr.length - i14) {
            e.v("Invalid bounds");
            return 0;
        }
        int i16 = 0;
        if (i15 == 0) {
            return 0;
        }
        do {
            int i17 = super.read(bArr, i14 + i16, (i15 - i16) - i14);
            if (i17 == -1) {
                break;
            }
            i16 += i17;
        } while (i14 + i16 < i15);
        if (i16 == 0) {
            return -1;
        }
        return i16;
    }

    public void release() {
        NativeCrypto.BIO_free_all(this.ctx);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
