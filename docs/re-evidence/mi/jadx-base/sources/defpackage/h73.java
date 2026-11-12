package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes5.dex */
public final class h73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<SoftReference<byte[]>> f19768a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f19769b;
    public static final long c;

    static {
        Class<?> clsE = e("java.io.FileOutputStream");
        f19769b = clsE;
        c = b(clsE);
    }

    public static byte[] a() {
        SoftReference<byte[]> softReference = f19768a.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public static long b(Class<?> cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (ibq.G()) {
                return ibq.I(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static byte[] c(int i) {
        int iMax = Math.max(i, 1024);
        byte[] bArrA = a();
        if (bArrA == null || d(iMax, bArrA.length)) {
            bArrA = new byte[iMax];
            if (iMax <= 16384) {
                f(bArrA);
            }
        }
        return bArrA;
    }

    public static boolean d(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    public static Class<?> e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void f(byte[] bArr) {
        f19768a.set(new SoftReference<>(bArr));
    }

    public static void g(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!h(byteBuffer, outputStream)) {
                byte[] bArrC = c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = Math.min(byteBuffer.remaining(), bArrC.length);
                    byteBuffer.get(bArrC, 0, iMin);
                    outputStream.write(bArrC, 0, iMin);
                }
            }
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    public static boolean h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j = c;
        if (j < 0 || !f19769b.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) ibq.E(outputStream, j);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
