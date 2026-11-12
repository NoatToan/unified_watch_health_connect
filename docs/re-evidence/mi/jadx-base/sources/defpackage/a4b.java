package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class a4b extends r63<a4b> {
    public byte[] d;

    public a4b() {
        super(0, Integer.MAX_VALUE, true);
        this.d = new byte[256];
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
        o(i + i3);
        System.arraycopy(bArr, i2, this.d, i, i3);
        return i3;
    }

    @Override // defpackage.r63
    public void h(int i, byte b2) {
        o(i + 1);
        this.d[i] = b2;
    }

    public final void o(int i) {
        byte[] bArr = this.d;
        if (i <= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[Math.max(i, bArr.length * 2)];
        byte[] bArr3 = this.d;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        this.d = bArr2;
    }
}
