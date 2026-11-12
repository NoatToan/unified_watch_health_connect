package j0;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class b extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f95908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteOrder f95909b;

    public b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f95908a = outputStream;
        this.f95909b = byteOrder;
    }

    public final void a(int i14) throws IOException {
        ByteOrder byteOrder = this.f95909b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f95908a;
        if (byteOrder == byteOrder2) {
            outputStream.write(i14 & 255);
            outputStream.write((i14 >>> 8) & 255);
            outputStream.write((i14 >>> 16) & 255);
            outputStream.write((i14 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((i14 >>> 24) & 255);
            outputStream.write((i14 >>> 16) & 255);
            outputStream.write((i14 >>> 8) & 255);
            outputStream.write(i14 & 255);
        }
    }

    public final void c(short s8) throws IOException {
        ByteOrder byteOrder = this.f95909b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f95908a;
        if (byteOrder == byteOrder2) {
            outputStream.write(s8 & 255);
            outputStream.write((s8 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s8 >>> 8) & 255);
            outputStream.write(s8 & 255);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f95908a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i14, int i15) throws IOException {
        this.f95908a.write(bArr, i14, i15);
    }
}
