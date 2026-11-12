package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class y63 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f39826a;

    public y63(ByteBuffer byteBuffer) {
        this.f39826a = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f39826a.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f39826a.put(bArr, i, i2);
    }
}
