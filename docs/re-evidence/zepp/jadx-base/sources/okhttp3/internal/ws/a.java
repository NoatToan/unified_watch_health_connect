package okhttp3.internal.ws;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes23.dex */
final class a {
    public final boolean a;
    public final Random b;
    public final BufferedSink c;
    public final Buffer d;
    public boolean e;
    public final Buffer f = new Buffer();
    public final C1192a g = new C1192a();
    public boolean h;
    private final byte[] i;
    private final Buffer.UnsafeCursor j;

    /* JADX INFO: renamed from: okhttp3.internal.ws.a$a, reason: collision with other inner class name */
    public final class C1192a implements Sink {
        public int a;
        public long b;
        public boolean c;
        public boolean d;

        public C1192a() {
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.d) {
                throw new IOException("closed");
            }
            a aVar = a.this;
            aVar.d(this.a, aVar.f.size(), this.c, true);
            this.d = true;
            a.this.h = false;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.d) {
                throw new IOException("closed");
            }
            a aVar = a.this;
            aVar.d(this.a, aVar.f.size(), this.c, false);
            this.c = false;
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return a.this.c.timeout();
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.d) {
                throw new IOException("closed");
            }
            a.this.f.write(buffer, j);
            boolean z = this.c && this.b != -1 && a.this.f.size() > this.b - PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            long jCompleteSegmentByteCount = a.this.f.completeSegmentByteCount();
            if (jCompleteSegmentByteCount <= 0 || z) {
                return;
            }
            a.this.d(this.a, jCompleteSegmentByteCount, this.c, false);
            this.c = false;
        }
    }

    public a(boolean z, BufferedSink bufferedSink, Random random) {
        Objects.requireNonNull(bufferedSink, "sink == null");
        Objects.requireNonNull(random, "random == null");
        this.a = z;
        this.c = bufferedSink;
        this.d = bufferedSink.buffer();
        this.b = random;
        this.i = z ? new byte[4] : null;
        this.j = z ? new Buffer.UnsafeCursor() : null;
    }

    private void c(int i, ByteString byteString) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        int size = byteString.size();
        if (size > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.d.writeByte(i | 128);
        if (this.a) {
            this.d.writeByte(size | 128);
            this.b.nextBytes(this.i);
            this.d.write(this.i);
            if (size > 0) {
                long size2 = this.d.size();
                this.d.write(byteString);
                this.d.readAndWriteUnsafe(this.j);
                this.j.seek(size2);
                WebSocketProtocol.b(this.j, this.i);
                this.j.close();
            }
        } else {
            this.d.writeByte(size);
            this.d.write(byteString);
        }
        this.c.flush();
    }

    public Sink a(int i, long j) {
        if (this.h) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.h = true;
        C1192a c1192a = this.g;
        c1192a.a = i;
        c1192a.b = j;
        c1192a.c = true;
        c1192a.d = false;
        return c1192a;
    }

    public void b(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                WebSocketProtocol.c(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            c(8, byteString2);
        } finally {
            this.e = true;
        }
    }

    public void d(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.d.writeByte(i);
        int i2 = this.a ? 128 : 0;
        if (j <= 125) {
            this.d.writeByte(((int) j) | i2);
        } else if (j <= WebSocketProtocol.s) {
            this.d.writeByte(i2 | 126);
            this.d.writeShort((int) j);
        } else {
            this.d.writeByte(i2 | 127);
            this.d.writeLong(j);
        }
        if (this.a) {
            this.b.nextBytes(this.i);
            this.d.write(this.i);
            if (j > 0) {
                long size = this.d.size();
                this.d.write(this.f, j);
                this.d.readAndWriteUnsafe(this.j);
                this.j.seek(size);
                WebSocketProtocol.b(this.j, this.i);
                this.j.close();
            }
        } else {
            this.d.write(this.f, j);
        }
        this.c.emit();
    }

    public void e(ByteString byteString) throws IOException {
        c(9, byteString);
    }

    public void f(ByteString byteString) throws IOException {
        c(10, byteString);
    }
}
