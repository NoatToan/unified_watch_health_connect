package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ky5 extends sfe {
    public static final byte[] e = new byte[0];
    public final int c;
    public int d;

    public ky5(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.c = i;
        this.d = i;
        if (i == 0) {
            b(true);
        }
    }

    @Override // defpackage.sfe
    public int a() {
        return this.d;
    }

    public byte[] c() throws IOException {
        int i = this.d;
        if (i == 0) {
            return e;
        }
        byte[] bArr = new byte[i];
        int iC = i - gjo.c(this.f33587a, bArr);
        this.d = iC;
        if (iC == 0) {
            b(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int i = this.f33587a.read();
        if (i >= 0) {
            int i2 = this.d - 1;
            this.d = i2;
            if (i2 == 0) {
                b(true);
            }
            return i;
        }
        throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f33587a.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            int i5 = this.d - i4;
            this.d = i5;
            if (i5 == 0) {
                b(true);
            }
            return i4;
        }
        throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
    }
}
