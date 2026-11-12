package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class xzo extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f39625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39626b;
    public int c;

    public xzo(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f39625a = bArr;
    }

    public final int a() {
        int i = this.f39626b;
        byte[] bArr = this.f39625a;
        if (i >= bArr.length) {
            return -1;
        }
        this.f39626b = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.c = this.f39626b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        return i != -1 ? i : a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f39626b = this.c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i4 < i2) {
            int iA = a();
            if (iA == -1) {
                break;
            }
            bArr[i + i4] = (byte) iA;
            i4++;
        }
        if (i4 > 0) {
            return i4;
        }
        return -1;
    }
}
