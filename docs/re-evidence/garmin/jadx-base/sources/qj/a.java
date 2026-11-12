package qj;

import com.google.common.primitives.UnsignedBytes;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference<byte[]> f144956a = new AtomicReference<>();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f144959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f144960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f144961c;

        public b(byte[] bArr, int i14, int i15) {
            this.f144961c = bArr;
            this.f144959a = i14;
            this.f144960b = i15;
        }
    }

    private a() {
    }

    public static MappedByteBuffer a(File file) throws Throwable {
        Throwable th3;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return mappedByteBufferLoad;
                } catch (Throwable th4) {
                    th3 = th4;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th3;
                    }
                    try {
                        randomAccessFile.close();
                        throw th3;
                    } catch (IOException unused4) {
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                th3 = th5;
            }
        } catch (Throwable th6) {
            th3 = th6;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference<byte[]> atomicReference = f144956a;
        byte[] andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i14 = inputStream.read(andSet);
            if (i14 < 0) {
                atomicReference.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i14);
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static void d(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        c(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: qj.a$a, reason: collision with other inner class name */
    public static class C2733a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f144957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f144958b = -1;

        public C2733a(ByteBuffer byteBuffer) {
            this.f144957a = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f144957a.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i14) {
            this.f144958b = this.f144957a.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i14, int i15) {
            ByteBuffer byteBuffer = this.f144957a;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i15, byteBuffer.remaining());
            byteBuffer.get(bArr, i14, iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            int i14 = this.f144958b;
            if (i14 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f144957a.position(i14);
        }

        @Override // java.io.InputStream
        public final long skip(long j8) {
            ByteBuffer byteBuffer = this.f144957a;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j8, byteBuffer.remaining());
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.f144957a;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & UnsignedBytes.MAX_VALUE;
            }
            return -1;
        }
    }
}
