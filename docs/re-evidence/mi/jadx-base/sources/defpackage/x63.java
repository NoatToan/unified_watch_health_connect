package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class x63 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f38741a;

    public x63(ByteBuffer byteBuffer) {
        this.f38741a = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f38741a.remaining();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f38741a.hasRemaining()) {
            return this.f38741a.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f38741a.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, this.f38741a.remaining());
        this.f38741a.get(bArr, i, iMin);
        return iMin;
    }
}
