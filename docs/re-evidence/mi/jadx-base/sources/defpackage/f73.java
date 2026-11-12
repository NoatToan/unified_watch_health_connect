package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class f73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference<byte[]> f17479a = new AtomicReference<>();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17483b;
        public final byte[] c;

        public b(byte[] bArr, int i, int i2) {
            this.c = bArr;
            this.f17482a = i;
            this.f17483b = i2;
        }
    }

    public static ByteBuffer a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
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
            } catch (Throwable th) {
                th = th;
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
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f17479a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(andSet);
            if (i < 0) {
                f17479a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i);
        }
    }

    public static b c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static byte[] e(ByteBuffer byteBuffer) {
        b bVarC = c(byteBuffer);
        if (bVarC != null && bVarC.f17482a == 0 && bVarC.f17483b == bVarC.c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        d(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void f(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        d(byteBuffer);
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
            } catch (Throwable th) {
                th = th;
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
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static InputStream g(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    public static class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f17480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17481b = -1;

        public a(ByteBuffer byteBuffer) {
            this.f17480a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f17480a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f17481b = this.f17480a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f17480a.hasRemaining()) {
                return this.f17480a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i = this.f17481b;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f17480a.position(i);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.f17480a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, available());
            ByteBuffer byteBuffer = this.f17480a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (!this.f17480a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, available());
            this.f17480a.get(bArr, i, iMin);
            return iMin;
        }
    }
}
