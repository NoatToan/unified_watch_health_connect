package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes4.dex */
final class c {
    private static final int a = 1024;
    private static final int b = 16384;
    private static final float c = 0.5f;
    private static final ThreadLocal<SoftReference<byte[]>> d = new ThreadLocal<>();
    private static final Class<?> e;
    private static final long f;

    static {
        Class<?> clsF = f("java.io.FileOutputStream");
        e = clsF;
        f = c(clsF);
    }

    private c() {
    }

    public static void a() {
        d.set(null);
    }

    private static byte[] b() {
        SoftReference<byte[]> softReference = d.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    private static long c(Class<?> cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (UnsafeUtil.S()) {
                return UnsafeUtil.W(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static byte[] d(int i) {
        int iMax = Math.max(i, 1024);
        byte[] bArrB = b();
        if (bArrB == null || e(iMax, bArrB.length)) {
            bArrB = new byte[iMax];
            if (iMax <= 16384) {
                g(bArrB);
            }
        }
        return bArrB;
    }

    private static boolean e(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    private static Class<?> f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void g(byte[] bArr) {
        d.set(new SoftReference<>(bArr));
    }

    public static void h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!i(byteBuffer, outputStream)) {
                byte[] bArrD = d(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = Math.min(byteBuffer.remaining(), bArrD.length);
                    byteBuffer.get(bArrD, 0, iMin);
                    outputStream.write(bArrD, 0, iMin);
                }
            }
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    private static boolean i(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        long j = f;
        if (j < 0 || !e.isInstance(outputStream)) {
            return false;
        }
        WritableByteChannel writableByteChannel = null;
        try {
            writableByteChannel = (WritableByteChannel) UnsafeUtil.O(outputStream, j);
        } catch (ClassCastException unused) {
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
