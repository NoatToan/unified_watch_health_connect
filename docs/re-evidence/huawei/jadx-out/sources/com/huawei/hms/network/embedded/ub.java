package com.huawei.hms.network.embedded;

import android.support.v4.media.session.PlaybackStateCompat;
import com.huawei.operation.utils.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class ub implements db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bb f15471a = new bb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zb f15472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15473c;

    public String toString() {
        return "buffer(" + this.f15472b + Constants.RIGHT_BRACKET_ONLY;
    }

    @Override // com.huawei.hms.network.embedded.zb, com.huawei.hms.network.embedded.yb
    public ac timeout() {
        return this.f15472b.timeout();
    }

    @Override // com.huawei.hms.network.embedded.db
    public void skip(long j) throws IOException {
        if (this.f15473c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            bb bbVar = this.f15471a;
            if (bbVar.f14653b == 0 && this.f15472b.read(bbVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.f15471a.B());
            this.f15471a.skip(jMin);
            j -= jMin;
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public short readShort() throws IOException {
        i(2L);
        return this.f15471a.readShort();
    }

    @Override // com.huawei.hms.network.embedded.db
    public long readLong() throws IOException {
        i(8L);
        return this.f15471a.readLong();
    }

    @Override // com.huawei.hms.network.embedded.db
    public int readInt() throws IOException {
        i(4L);
        return this.f15471a.readInt();
    }

    @Override // com.huawei.hms.network.embedded.db
    public void readFully(byte[] bArr) throws IOException {
        try {
            i(bArr.length);
            this.f15471a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                bb bbVar = this.f15471a;
                long j = bbVar.f14653b;
                if (j <= 0) {
                    throw e;
                }
                int i2 = bbVar.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public byte readByte() throws IOException {
        i(1L);
        return this.f15471a.readByte();
    }

    @Override // com.huawei.hms.network.embedded.zb
    public long read(bb bbVar, long j) throws IOException {
        if (bbVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f15473c) {
            throw new IllegalStateException("closed");
        }
        bb bbVar2 = this.f15471a;
        if (bbVar2.f14653b == 0 && this.f15472b.read(bbVar2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.f15471a.read(bbVar, Math.min(j, this.f15471a.f14653b));
    }

    @Override // com.huawei.hms.network.embedded.db
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = i2;
        cc.a(bArr.length, i, j);
        bb bbVar = this.f15471a;
        if (bbVar.f14653b == 0 && this.f15472b.read(bbVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f15471a.read(bArr, i, (int) Math.min(j, this.f15471a.f14653b));
    }

    @Override // com.huawei.hms.network.embedded.db
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        bb bbVar = this.f15471a;
        if (bbVar.f14653b == 0 && this.f15472b.read(bbVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f15471a.read(byteBuffer);
    }

    @Override // com.huawei.hms.network.embedded.db
    public eb r() throws IOException {
        this.f15471a.a(this.f15472b);
        return this.f15471a.r();
    }

    @Override // com.huawei.hms.network.embedded.db
    public byte[] q() throws IOException {
        this.f15471a.a(this.f15472b);
        return this.f15471a.q();
    }

    @Override // com.huawei.hms.network.embedded.db
    public db peek() {
        return ob.a(new qb(this));
    }

    @Override // com.huawei.hms.network.embedded.db
    public long p() throws IOException {
        i(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!h(i2)) {
                break;
            }
            byte bJ = this.f15471a.j(i);
            if ((bJ < 48 || bJ > 57) && !(i == 0 && bJ == 45)) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(bJ)));
            }
            i = i2;
        }
        return this.f15471a.p();
    }

    @Override // com.huawei.hms.network.embedded.db
    public String o() throws IOException {
        this.f15471a.a(this.f15472b);
        return this.f15471a.o();
    }

    @Override // com.huawei.hms.network.embedded.db
    public String n() throws IOException {
        return e(Long.MAX_VALUE);
    }

    @Override // com.huawei.hms.network.embedded.db
    public InputStream m() {
        return new a();
    }

    @Override // com.huawei.hms.network.embedded.db
    @Nullable
    public String l() throws IOException {
        long jA = a((byte) 10);
        if (jA != -1) {
            return this.f15471a.k(jA);
        }
        long j = this.f15471a.f14653b;
        if (j != 0) {
            return f(j);
        }
        return null;
    }

    @Override // com.huawei.hms.network.embedded.db
    public long k() throws IOException {
        i(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!h(i2)) {
                break;
            }
            byte bJ = this.f15471a.j(i);
            if ((bJ < 48 || bJ > 57) && ((bJ < 97 || bJ > 102) && (bJ < 65 || bJ > 70))) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bJ)));
            }
            i = i2;
        }
        return this.f15471a.k();
    }

    @Override // com.huawei.hms.network.embedded.db
    public short j() throws IOException {
        i(2L);
        return this.f15471a.j();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f15473c;
    }

    @Override // com.huawei.hms.network.embedded.db
    public boolean i() throws IOException {
        if (this.f15473c) {
            throw new IllegalStateException("closed");
        }
        return this.f15471a.i() && this.f15472b.read(this.f15471a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // com.huawei.hms.network.embedded.db
    public void i(long j) throws IOException {
        if (!h(j)) {
            throw new EOFException();
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public boolean h(long j) throws IOException {
        bb bbVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f15473c) {
            throw new IllegalStateException("closed");
        }
        do {
            bbVar = this.f15471a;
            if (bbVar.f14653b >= j) {
                return true;
            }
        } while (this.f15472b.read(bbVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // com.huawei.hms.network.embedded.db
    public int h() throws IOException {
        long j;
        i(1L);
        byte bJ = this.f15471a.j(0L);
        if ((bJ & 224) == 192) {
            j = 2;
        } else {
            if ((bJ & 240) != 224) {
                if ((bJ & 248) == 240) {
                    j = 4;
                }
                return this.f15471a.h();
            }
            j = 3;
        }
        i(j);
        return this.f15471a.h();
    }

    @Override // com.huawei.hms.network.embedded.db
    public byte[] g(long j) throws IOException {
        i(j);
        return this.f15471a.g(j);
    }

    @Override // com.huawei.hms.network.embedded.db
    public bb g() {
        return this.f15471a;
    }

    @Override // com.huawei.hms.network.embedded.db
    public String f(long j) throws IOException {
        i(j);
        return this.f15471a.f(j);
    }

    @Override // com.huawei.hms.network.embedded.db
    public long f() throws IOException {
        i(8L);
        return this.f15471a.f();
    }

    @Override // com.huawei.hms.network.embedded.db
    public String e(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jA = a((byte) 10, 0L, j2);
        if (jA != -1) {
            return this.f15471a.k(jA);
        }
        if (j2 < Long.MAX_VALUE && h(j2) && this.f15471a.j(j2 - 1) == 13 && h(1 + j2) && this.f15471a.j(j2) == 10) {
            return this.f15471a.k(j2);
        }
        bb bbVar = new bb();
        bb bbVar2 = this.f15471a;
        bbVar2.a(bbVar, 0L, Math.min(32L, bbVar2.B()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f15471a.B(), j) + " content=" + bbVar.r().d() + (char) 8230);
    }

    @Override // com.huawei.hms.network.embedded.db
    public int e() throws IOException {
        i(4L);
        return this.f15471a.e();
    }

    @Override // com.huawei.hms.network.embedded.db
    public eb d(long j) throws IOException {
        i(j);
        return this.f15471a.d(j);
    }

    @Override // com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
    public void close() throws IOException {
        if (this.f15473c) {
            return;
        }
        this.f15473c = true;
        this.f15472b.close();
        this.f15471a.s();
    }

    @Override // com.huawei.hms.network.embedded.db
    public long c(eb ebVar) throws IOException {
        return b(ebVar, 0L);
    }

    @Override // com.huawei.hms.network.embedded.db
    public long b(eb ebVar, long j) throws IOException {
        if (this.f15473c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jB = this.f15471a.b(ebVar, j);
            if (jB != -1) {
                return jB;
            }
            bb bbVar = this.f15471a;
            long j2 = bbVar.f14653b;
            if (this.f15472b.read(bbVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public long b(eb ebVar) throws IOException {
        return a(ebVar, 0L);
    }

    @Override // com.huawei.hms.network.embedded.db
    public boolean a(long j, eb ebVar, int i, int i2) throws IOException {
        if (this.f15473c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || ebVar.j() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = ((long) i3) + j;
            if (!h(1 + j2) || this.f15471a.j(j2) != ebVar.a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huawei.hms.network.embedded.db
    public boolean a(long j, eb ebVar) throws IOException {
        return a(j, ebVar, 0, ebVar.j());
    }

    @Override // com.huawei.hms.network.embedded.db
    public void a(bb bbVar, long j) throws IOException {
        try {
            i(j);
            this.f15471a.a(bbVar, j);
        } catch (EOFException e) {
            bbVar.a((zb) this.f15471a);
            throw e;
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public String a(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f15471a.a(this.f15472b);
        return this.f15471a.a(charset);
    }

    @Override // com.huawei.hms.network.embedded.db
    public String a(long j, Charset charset) throws IOException {
        i(j);
        if (charset != null) {
            return this.f15471a.a(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.huawei.hms.network.embedded.db, com.huawei.hms.network.embedded.cb
    public bb a() {
        return this.f15471a;
    }

    public class a extends InputStream {
        public String toString() {
            return ub.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (ub.this.f15473c) {
                throw new IOException("closed");
            }
            cc.a(bArr.length, i, i2);
            ub ubVar = ub.this;
            bb bbVar = ubVar.f15471a;
            if (bbVar.f14653b == 0 && ubVar.f15472b.read(bbVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return ub.this.f15471a.read(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            ub ubVar = ub.this;
            if (ubVar.f15473c) {
                throw new IOException("closed");
            }
            bb bbVar = ubVar.f15471a;
            if (bbVar.f14653b == 0 && ubVar.f15472b.read(bbVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return ub.this.f15471a.readByte() & 255;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            ub.this.close();
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            ub ubVar = ub.this;
            if (ubVar.f15473c) {
                throw new IOException("closed");
            }
            return (int) Math.min(ubVar.f15471a.f14653b, 2147483647L);
        }

        public a() {
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public long a(yb ybVar) throws IOException {
        if (ybVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j = 0;
        while (this.f15472b.read(this.f15471a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long jT = this.f15471a.t();
            if (jT > 0) {
                j += jT;
                ybVar.write(this.f15471a, jT);
            }
        }
        if (this.f15471a.B() <= 0) {
            return j;
        }
        long jB = j + this.f15471a.B();
        bb bbVar = this.f15471a;
        ybVar.write(bbVar, bbVar.B());
        return jB;
    }

    @Override // com.huawei.hms.network.embedded.db
    public long a(eb ebVar, long j) throws IOException {
        if (this.f15473c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jA = this.f15471a.a(ebVar, j);
            if (jA != -1) {
                return jA;
            }
            bb bbVar = this.f15471a;
            long j2 = bbVar.f14653b;
            if (this.f15472b.read(bbVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, (j2 - ((long) ebVar.j())) + 1);
        }
    }

    @Override // com.huawei.hms.network.embedded.db
    public long a(byte b2, long j, long j2) throws IOException {
        if (this.f15473c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        while (j < j2) {
            long jA = this.f15471a.a(b2, j, j2);
            if (jA != -1) {
                return jA;
            }
            bb bbVar = this.f15471a;
            long j3 = bbVar.f14653b;
            if (j3 >= j2 || this.f15472b.read(bbVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            j = Math.max(j, j3);
        }
        return -1L;
    }

    @Override // com.huawei.hms.network.embedded.db
    public long a(byte b2, long j) throws IOException {
        return a(b2, j, Long.MAX_VALUE);
    }

    @Override // com.huawei.hms.network.embedded.db
    public long a(byte b2) throws IOException {
        return a(b2, 0L, Long.MAX_VALUE);
    }

    @Override // com.huawei.hms.network.embedded.db
    public int a(pb pbVar) throws IOException {
        if (this.f15473c) {
            throw new IllegalStateException("closed");
        }
        do {
            int iA = this.f15471a.a(pbVar, true);
            if (iA == -1) {
                return -1;
            }
            if (iA != -2) {
                this.f15471a.skip(pbVar.f15209a[iA].j());
                return iA;
            }
        } while (this.f15472b.read(this.f15471a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    public ub(zb zbVar) {
        if (zbVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f15472b = zbVar;
    }
}
