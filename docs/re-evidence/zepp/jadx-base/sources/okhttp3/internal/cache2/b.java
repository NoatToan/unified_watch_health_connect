package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes23.dex */
final class b {
    private static final int k = 1;
    private static final int l = 2;
    public static final ByteString m = ByteString.encodeUtf8("OkHttp cache v1\n");
    public static final ByteString n = ByteString.encodeUtf8("OkHttp DIRTY :(\n");
    private static final long o = 32;
    public RandomAccessFile a;
    public Thread b;
    public Source c;
    public long e;
    public boolean f;
    private final ByteString g;
    public final long i;
    public int j;
    public final Buffer d = new Buffer();
    public final Buffer h = new Buffer();

    public class a implements Source {
        private final Timeout a = new Timeout();
        private okhttp3.internal.cache2.a b;
        private long c;

        public a() {
            this.b = new okhttp3.internal.cache2.a(b.this.a.getChannel());
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.b = null;
            synchronized (b.this) {
                b bVar = b.this;
                int i = bVar.j - 1;
                bVar.j = i;
                if (i == 0) {
                    RandomAccessFile randomAccessFile2 = bVar.a;
                    bVar.a = null;
                    randomAccessFile = randomAccessFile2;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            long j2;
            char c;
            b bVar;
            if (this.b == null) {
                throw new IllegalStateException("closed");
            }
            synchronized (b.this) {
                while (true) {
                    long j3 = this.c;
                    b bVar2 = b.this;
                    j2 = bVar2.e;
                    if (j3 != j2) {
                        long size = j2 - bVar2.h.size();
                        long j4 = this.c;
                        if (j4 < size) {
                            c = 2;
                            break;
                        }
                        long jMin = Math.min(j, j2 - j4);
                        b.this.h.copyTo(buffer, this.c - size, jMin);
                        this.c += jMin;
                        return jMin;
                    }
                    if (!bVar2.f) {
                        if (bVar2.b == null) {
                            bVar2.b = Thread.currentThread();
                            c = 1;
                            break;
                        }
                        this.a.waitUntilNotified(bVar2);
                    } else {
                        return -1L;
                    }
                }
                if (c == 2) {
                    long jMin2 = Math.min(j, j2 - this.c);
                    this.b.a(this.c + 32, buffer, jMin2);
                    this.c += jMin2;
                    return jMin2;
                }
                try {
                    b bVar3 = b.this;
                    long j5 = bVar3.c.read(bVar3.d, bVar3.i);
                    if (j5 == -1) {
                        b.this.a(j2);
                        synchronized (b.this) {
                            b bVar4 = b.this;
                            bVar4.b = null;
                            bVar4.notifyAll();
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j5, j);
                    b.this.d.copyTo(buffer, 0L, jMin3);
                    this.c += jMin3;
                    this.b.b(j2 + 32, b.this.d.clone(), j5);
                    synchronized (b.this) {
                        b bVar5 = b.this;
                        bVar5.h.write(bVar5.d, j5);
                        long size2 = b.this.h.size();
                        b bVar6 = b.this;
                        if (size2 > bVar6.i) {
                            Buffer buffer2 = bVar6.h;
                            buffer2.skip(buffer2.size() - b.this.i);
                        }
                        bVar = b.this;
                        bVar.e += j5;
                    }
                    synchronized (bVar) {
                        b bVar7 = b.this;
                        bVar7.b = null;
                        bVar7.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th) {
                    synchronized (b.this) {
                        b bVar8 = b.this;
                        bVar8.b = null;
                        bVar8.notifyAll();
                        throw th;
                    }
                }
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.a;
        }
    }

    private b(RandomAccessFile randomAccessFile, Source source, long j, ByteString byteString, long j2) {
        this.a = randomAccessFile;
        this.c = source;
        this.f = source == null;
        this.e = j;
        this.g = byteString;
        this.i = j2;
    }

    public static b b(File file, Source source, ByteString byteString, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        b bVar = new b(randomAccessFile, source, 0L, byteString, j);
        randomAccessFile.setLength(0L);
        bVar.g(n, -1L, -1L);
        return bVar;
    }

    public static b f(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        okhttp3.internal.cache2.a aVar = new okhttp3.internal.cache2.a(randomAccessFile.getChannel());
        Buffer buffer = new Buffer();
        aVar.a(0L, buffer, 32L);
        ByteString byteString = m;
        if (!buffer.readByteString(byteString.size()).equals(byteString)) {
            throw new IOException("unreadable cache file");
        }
        long j = buffer.readLong();
        long j2 = buffer.readLong();
        Buffer buffer2 = new Buffer();
        aVar.a(j + 32, buffer2, j2);
        return new b(randomAccessFile, null, j, buffer2.readByteString(), 0L);
    }

    private void g(ByteString byteString, long j, long j2) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(byteString);
        buffer.writeLong(j);
        buffer.writeLong(j2);
        if (buffer.size() != 32) {
            throw new IllegalArgumentException();
        }
        new okhttp3.internal.cache2.a(this.a.getChannel()).b(0L, buffer, 32L);
    }

    private void h(long j) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(this.g);
        new okhttp3.internal.cache2.a(this.a.getChannel()).b(32 + j, buffer, this.g.size());
    }

    public void a(long j) throws IOException {
        h(j);
        this.a.getChannel().force(false);
        g(m, j, this.g.size());
        this.a.getChannel().force(false);
        synchronized (this) {
            this.f = true;
        }
        Util.closeQuietly(this.c);
        this.c = null;
    }

    public boolean c() {
        return this.a == null;
    }

    public ByteString d() {
        return this.g;
    }

    public Source e() {
        synchronized (this) {
            if (this.a == null) {
                return null;
            }
            this.j++;
            return new a();
        }
    }
}
