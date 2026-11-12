package okhttp3.internal.http2;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes23.dex */
final class c implements Closeable {
    private static final Logger g = Logger.getLogger(Http2.class.getName());
    private final BufferedSink a;
    private final boolean b;
    private final Buffer c;
    private int d;
    private boolean e;
    public final a.b f;

    public c(BufferedSink bufferedSink, boolean z) {
        this.a = bufferedSink;
        this.b = z;
        Buffer buffer = new Buffer();
        this.c = buffer;
        this.f = new a.b(buffer);
        this.d = 16384;
    }

    private void i(int i, long j) throws IOException {
        while (j > 0) {
            int iMin = (int) Math.min(this.d, j);
            long j2 = iMin;
            j -= j2;
            c(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.a.write(this.c, j2);
        }
    }

    private static void j(BufferedSink bufferedSink, int i) throws IOException {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    public synchronized void a(Settings settings) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        this.d = settings.g(this.d);
        if (settings.d() != -1) {
            this.f.e(settings.d());
        }
        c(0, 0, (byte) 4, (byte) 1);
        this.a.flush();
    }

    public void b(int i, byte b, Buffer buffer, int i2) throws IOException {
        c(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.a.write(buffer, i2);
        }
    }

    public void c(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.b(false, i, i2, b, b2));
        }
        int i3 = this.d;
        if (i2 > i3) {
            throw Http2.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw Http2.c("reserved bit set: %s", Integer.valueOf(i));
        }
        j(this.a, i2);
        this.a.writeByte(b & 255);
        this.a.writeByte(b2 & 255);
        this.a.writeInt(i & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.e = true;
        this.a.close();
    }

    public synchronized void connectionPreface() throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        if (this.b) {
            Logger logger = g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Util.format(">> CONNECTION %s", Http2.a.hex()));
            }
            this.a.write(Http2.a.toByteArray());
            this.a.flush();
        }
    }

    public synchronized void d(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            throw Http2.c("errorCode.httpCode == -1", new Object[0]);
        }
        c(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.a.writeInt(i);
        this.a.writeInt(errorCode.httpCode);
        if (bArr.length > 0) {
            this.a.write(bArr);
        }
        this.a.flush();
    }

    public synchronized void data(boolean z, int i, Buffer buffer, int i2) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        b(i, z ? (byte) 1 : (byte) 0, buffer, i2);
    }

    public void e(boolean z, int i, List<Header> list) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        this.f.g(list);
        long size = this.c.size();
        int iMin = (int) Math.min(this.d, size);
        long j = iMin;
        byte b = size == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        c(i, iMin, (byte) 1, b);
        this.a.write(this.c, j);
        if (size > j) {
            i(i, size - j);
        }
    }

    public synchronized void f(int i, ErrorCode errorCode) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        c(i, 4, (byte) 3, (byte) 0);
        this.a.writeInt(errorCode.httpCode);
        this.a.flush();
    }

    public synchronized void flush() throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        this.a.flush();
    }

    public synchronized void g(Settings settings) throws IOException {
        int i;
        if (this.e) {
            throw new IOException("closed");
        }
        int i2 = 0;
        c(0, settings.l() * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (settings.i(i2)) {
                if (i2 == 4) {
                    i = 3;
                } else {
                    i = i2 == 7 ? 4 : i2;
                }
                this.a.writeShort(i);
                this.a.writeInt(settings.b(i2));
            }
            i2++;
        }
        this.a.flush();
    }

    public synchronized void h(boolean z, int i, int i2, List<Header> list) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        e(z, i, list);
    }

    public synchronized void headers(int i, List<Header> list) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        e(false, i, list);
    }

    public int maxDataLength() {
        return this.d;
    }

    public synchronized void ping(boolean z, int i, int i2) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        c(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.a.writeInt(i);
        this.a.writeInt(i2);
        this.a.flush();
    }

    public synchronized void pushPromise(int i, int i2, List<Header> list) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        this.f.g(list);
        long size = this.c.size();
        int iMin = (int) Math.min(this.d - 4, size);
        long j = iMin;
        c(i, iMin + 4, (byte) 5, size == j ? (byte) 4 : (byte) 0);
        this.a.writeInt(i2 & Integer.MAX_VALUE);
        this.a.write(this.c, j);
        if (size > j) {
            i(i, size - j);
        }
    }

    public synchronized void synReply(boolean z, int i, List<Header> list) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        e(z, i, list);
    }

    public synchronized void windowUpdate(int i, long j) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > ParserMinimalBase.MAX_INT_L) {
            throw Http2.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        c(i, 4, (byte) 8, (byte) 0);
        this.a.writeInt((int) j);
        this.a.flush();
    }
}
