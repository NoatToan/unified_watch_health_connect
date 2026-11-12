package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class epf extends r63<epf> {
    public byte[] d;

    public epf(int i) {
        this(new byte[i], 0);
    }

    @Override // defpackage.r63
    public int b(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.d, i, i2);
        return i2;
    }

    @Override // defpackage.r63
    public int e(int i) {
        return this.d[i];
    }

    @Override // defpackage.r63
    public int f(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.d, i, bArr, i2, i3);
        return i3;
    }

    @Override // defpackage.r63
    public int g(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(bArr, i2, this.d, i, i3);
        return i3;
    }

    @Override // defpackage.r63
    public void h(int i, byte b2) {
        this.d[i] = b2;
    }

    public epf(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public epf(byte[] bArr, int i) {
        super(i, bArr.length);
        this.d = bArr;
    }
}
