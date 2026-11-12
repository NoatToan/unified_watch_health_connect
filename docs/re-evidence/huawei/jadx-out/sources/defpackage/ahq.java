package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class ahq extends OutputStream {
    protected final ByteBuffer e;

    public ahq(ByteBuffer byteBuffer) {
        this.e = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.e.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.e.put(bArr, i, i2);
    }
}
