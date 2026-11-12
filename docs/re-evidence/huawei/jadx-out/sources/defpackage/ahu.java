package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class ahu extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ByteBuffer f430a;

    public ahu(ByteBuffer byteBuffer) {
        this.f430a = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f430a.remaining();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f430a.hasRemaining()) {
            return this.f430a.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f430a.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, this.f430a.remaining());
        this.f430a.get(bArr, i, iMin);
        return iMin;
    }
}
