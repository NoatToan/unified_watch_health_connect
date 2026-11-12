package w63;

import ch.qos.logback.core.CoreConstants;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw63/b0;", "Lw63/g;", "Lw63/g0;", "source", "<init>", "(Lw63/g0;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f183328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f183329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f183330c;

    public b0(g0 g0Var) {
        g0Var.getClass();
        this.f183328a = g0Var;
        this.f183329b = new e();
    }

    @Override // w63.g
    public final long E0(h hVar) {
        hVar.getClass();
        return x63.b.c(this, hVar, hVar.d(), Long.MAX_VALUE);
    }

    @Override // w63.g
    public final void E3(long j8) throws EOFException {
        if (b(j8)) {
            return;
        }
        vb.h.m();
    }

    @Override // w63.g
    public final boolean F1() {
        if (this.f183330c) {
            vb.h.z("closed");
            return false;
        }
        e eVar = this.f183329b;
        return eVar.F1() && this.f183328a.read(eVar, 8192L) == -1;
    }

    @Override // w63.g
    public final boolean F3(long j8, h hVar) {
        hVar.getClass();
        int iD = hVar.d();
        if (this.f183330c) {
            vb.h.z("closed");
            return false;
        }
        if (iD >= 0 && iD <= hVar.d()) {
            return iD == 0 || x63.b.c(this, hVar, iD, 1L) != -1;
        }
        return false;
    }

    @Override // w63.g
    public final long G1() throws EOFException {
        e eVar;
        E3(1L);
        long j8 = 0;
        while (true) {
            long j14 = j8 + 1;
            boolean zB = b(j14);
            eVar = this.f183329b;
            if (!zB) {
                break;
            }
            byte bJ = eVar.j(j8);
            if ((bJ < 48 || bJ > 57) && !(j8 == 0 && bJ == 45)) {
                if (j8 != 0) {
                    break;
                }
                d53.a.a(16);
                String string = Integer.toString(bJ, 16);
                string.getClass();
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            j8 = j14;
        }
        return eVar.G1();
    }

    @Override // w63.g
    public final byte[] J2() {
        g0 g0Var = this.f183328a;
        e eVar = this.f183329b;
        eVar.G3(g0Var);
        return eVar.s(eVar.f183349b);
    }

    @Override // w63.g
    public final long L0() throws EOFException {
        e eVar;
        E3(1L);
        int i14 = 0;
        while (true) {
            int i15 = i14 + 1;
            boolean zB = b(i15);
            eVar = this.f183329b;
            if (!zB) {
                break;
            }
            byte bJ = eVar.j(i14);
            if ((bJ < 48 || bJ > 57) && ((bJ < 97 || bJ > 102) && (bJ < 65 || bJ > 70))) {
                if (i14 != 0) {
                    break;
                }
                d53.a.a(16);
                String string = Integer.toString(bJ, 16);
                string.getClass();
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i14 = i15;
        }
        return eVar.L0();
    }

    @Override // w63.g
    public final String P2(Charset charset) {
        charset.getClass();
        g0 g0Var = this.f183328a;
        e eVar = this.f183329b;
        eVar.G3(g0Var);
        return eVar.w(eVar.f183349b, charset);
    }

    @Override // w63.g
    public final long V3(f0 f0Var) {
        e eVar;
        long j8 = 0;
        while (true) {
            g0 g0Var = this.f183328a;
            eVar = this.f183329b;
            if (g0Var.read(eVar, 8192L) == -1) {
                break;
            }
            long jC = eVar.c();
            if (jC > 0) {
                j8 += jC;
                f0Var.write(eVar, jC);
            }
        }
        long j14 = eVar.f183349b;
        if (j14 <= 0) {
            return j8;
        }
        long j15 = j8 + j14;
        f0Var.write(eVar, j14);
        return j15;
    }

    public final long a(byte b14, long j8, long j14) {
        if (this.f183330c) {
            vb.h.z("closed");
            return 0L;
        }
        if (0 > j14) {
            vb.h.x(org.apache.commons.lang3.e.e(j14, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j14) {
            byte b15 = b14;
            long j15 = j14;
            long jK = this.f183329b.k(b15, jMax, j15);
            if (jK != -1) {
                return jK;
            }
            e eVar = this.f183329b;
            long j16 = eVar.f183349b;
            if (j16 >= j15 || this.f183328a.read(eVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j16);
            b14 = b15;
            j14 = j15;
        }
        return -1L;
    }

    @Override // w63.g
    public final boolean b(long j8) {
        e eVar;
        if (j8 < 0) {
            vb.h.x(org.apache.commons.lang3.e.e(j8, "byteCount < 0: "));
            return false;
        }
        if (this.f183330c) {
            vb.h.z("closed");
            return false;
        }
        do {
            eVar = this.f183329b;
            if (eVar.f183349b >= j8) {
                return true;
            }
        } while (this.f183328a.read(eVar, 8192L) != -1);
        return false;
    }

    public final int c() throws EOFException {
        E3(4L);
        int i14 = this.f183329b.readInt();
        e.a aVar = b.f183326a;
        return ((i14 & 255) << 24) | (((-16777216) & i14) >>> 24) | ((16711680 & i14) >>> 8) | ((65280 & i14) << 8);
    }

    @Override // w63.g
    public final String c1(long j8) throws EOFException {
        if (j8 < 0) {
            vb.h.x(org.apache.commons.lang3.e.e(j8, "limit < 0: "));
            return null;
        }
        long j14 = j8 == Long.MAX_VALUE ? Long.MAX_VALUE : j8 + 1;
        long jA = a((byte) 10, 0L, j14);
        e eVar = this.f183329b;
        if (jA != -1) {
            return x63.a.c(eVar, jA);
        }
        if (j14 < Long.MAX_VALUE && b(j14) && eVar.j(j14 - 1) == 13 && b(j14 + 1) && eVar.j(j14) == 10) {
            return x63.a.c(eVar, j14);
        }
        e eVar2 = new e();
        eVar.f(0L, eVar2, Math.min(32, eVar.f183349b));
        throw new EOFException("\\n not found: limit=" + Math.min(eVar.f183349b, j8) + " content=" + eVar2.h0(eVar2.f183349b).e() + (char) 8230);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f183330c) {
            return;
        }
        this.f183330c = true;
        this.f183328a.close();
        this.f183329b.a();
    }

    @Override // w63.g
    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getF183329b() {
        return this.f183329b;
    }

    public final long e() throws EOFException {
        E3(8L);
        long j8 = this.f183329b.readLong();
        e.a aVar = b.f183326a;
        return ((j8 & 255) << 56) | (((-72057594037927936L) & j8) >>> 56) | ((71776119061217280L & j8) >>> 40) | ((280375465082880L & j8) >>> 24) | ((1095216660480L & j8) >>> 8) | ((4278190080L & j8) << 8) | ((16711680 & j8) << 24) | ((65280 & j8) << 40);
    }

    @Override // w63.g
    public final void e2(e eVar, long j8) throws EOFException {
        e eVar2 = this.f183329b;
        eVar.getClass();
        try {
            E3(j8);
            eVar2.e2(eVar, j8);
        } catch (EOFException e4) {
            eVar.G3(eVar2);
            throw e4;
        }
    }

    public final short f() throws EOFException {
        E3(2L);
        return this.f183329b.v();
    }

    @Override // w63.g
    public final h h0(long j8) throws EOFException {
        E3(j8);
        return this.f183329b.h0(j8);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f183330c;
    }

    public final String j(long j8) throws EOFException {
        E3(j8);
        e eVar = this.f183329b;
        eVar.getClass();
        return eVar.w(j8, d53.c.f57666b);
    }

    @Override // w63.g
    public final int j1(w wVar) throws EOFException {
        e eVar;
        wVar.getClass();
        if (this.f183330c) {
            vb.h.z("closed");
            return 0;
        }
        do {
            eVar = this.f183329b;
            int iD = x63.a.d(eVar, wVar, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                eVar.skip(wVar.f183404b[iD].d());
                return iD;
            }
        } while (this.f183328a.read(eVar, 8192L) != -1);
        return -1;
    }

    @Override // w63.g
    public final e j3() {
        return this.f183329b;
    }

    @Override // w63.g
    public final long o3(long j8, h hVar) {
        hVar.getClass();
        return x63.b.c(this, hVar, hVar.d(), j8);
    }

    @Override // w63.g
    public final b0 peek() {
        return new b0(new z(this));
    }

    @Override // w63.g0
    public final long read(e eVar, long j8) {
        eVar.getClass();
        if (j8 < 0) {
            vb.h.x(org.apache.commons.lang3.e.e(j8, "byteCount < 0: "));
            return 0L;
        }
        if (this.f183330c) {
            vb.h.z("closed");
            return 0L;
        }
        e eVar2 = this.f183329b;
        if (eVar2.f183349b == 0) {
            if (j8 == 0) {
                return 0L;
            }
            if (this.f183328a.read(eVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return eVar2.read(eVar, Math.min(j8, eVar2.f183349b));
    }

    @Override // w63.g
    public final byte readByte() throws EOFException {
        E3(1L);
        return this.f183329b.readByte();
    }

    @Override // w63.g
    public final void readFully(byte[] bArr) throws EOFException {
        e eVar = this.f183329b;
        bArr.getClass();
        try {
            E3(bArr.length);
            eVar.readFully(bArr);
        } catch (EOFException e4) {
            int i14 = 0;
            while (true) {
                long j8 = eVar.f183349b;
                if (j8 <= 0) {
                    throw e4;
                }
                int i15 = eVar.read(bArr, i14, (int) j8);
                if (i15 == -1) {
                    v.e0.l();
                    return;
                }
                i14 += i15;
            }
        }
    }

    @Override // w63.g
    public final int readInt() throws EOFException {
        E3(4L);
        return this.f183329b.readInt();
    }

    @Override // w63.g
    public final long readLong() throws EOFException {
        E3(8L);
        return this.f183329b.readLong();
    }

    @Override // w63.g
    public final short readShort() throws EOFException {
        E3(2L);
        return this.f183329b.readShort();
    }

    @Override // w63.g
    public final String s1() {
        return c1(Long.MAX_VALUE);
    }

    @Override // w63.g
    public final void skip(long j8) throws EOFException {
        if (this.f183330c) {
            vb.h.z("closed");
            return;
        }
        while (j8 > 0) {
            e eVar = this.f183329b;
            if (eVar.f183349b == 0 && this.f183328a.read(eVar, 8192L) == -1) {
                vb.h.m();
                return;
            } else {
                long jMin = Math.min(j8, eVar.f183349b);
                eVar.skip(jMin);
                j8 -= jMin;
            }
        }
    }

    @Override // w63.g
    public final long t1(h hVar) {
        hVar.getClass();
        if (this.f183330c) {
            vb.h.z("closed");
            return 0L;
        }
        long jMax = 0;
        while (true) {
            e eVar = this.f183329b;
            long jL = eVar.l(jMax, hVar);
            if (jL != -1) {
                return jL;
            }
            long j8 = eVar.f183349b;
            if (this.f183328a.read(eVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j8);
        }
    }

    @Override // w63.g0
    public final h0 timeout() {
        return this.f183328a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f183328a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // w63.g
    public final InputStream v4() {
        return new a();
    }

    @Override // w63.g
    public final h z0() {
        g0 g0Var = this.f183328a;
        e eVar = this.f183329b;
        eVar.G3(g0Var);
        return eVar.h0(eVar.f183349b);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"w63/b0$a", "Ljava/io/InputStream;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            b0 b0Var = b0.this;
            if (!b0Var.f183330c) {
                return (int) Math.min(b0Var.f183329b.f183349b, Integer.MAX_VALUE);
            }
            vb.h.C("closed");
            return 0;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            b0.this.close();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i14, int i15) throws IOException {
            bArr.getClass();
            b0 b0Var = b0.this;
            boolean z14 = b0Var.f183330c;
            e eVar = b0Var.f183329b;
            if (z14) {
                vb.h.C("closed");
                return 0;
            }
            b.b(bArr.length, i14, i15);
            if (eVar.f183349b == 0 && b0Var.f183328a.read(eVar, 8192L) == -1) {
                return -1;
            }
            return eVar.read(bArr, i14, i15);
        }

        public final String toString() {
            return b0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final long transferTo(OutputStream outputStream) throws IOException {
            outputStream.getClass();
            b0 b0Var = b0.this;
            boolean z14 = b0Var.f183330c;
            e eVar = b0Var.f183329b;
            if (z14) {
                vb.h.C("closed");
                return 0L;
            }
            long j8 = 0;
            long j14 = 0;
            while (true) {
                if (eVar.f183349b == j8 && b0Var.f183328a.read(eVar, 8192L) == -1) {
                    return j14;
                }
                long j15 = eVar.f183349b;
                j14 += j15;
                b.b(j15, 0L, j15);
                c0 c0Var = eVar.f183348a;
                while (j15 > j8) {
                    c0Var.getClass();
                    int iMin = (int) Math.min(j15, c0Var.f183338c - c0Var.f183337b);
                    outputStream.write(c0Var.f183336a, c0Var.f183337b, iMin);
                    int i14 = c0Var.f183337b + iMin;
                    c0Var.f183337b = i14;
                    long j16 = iMin;
                    eVar.f183349b -= j16;
                    j15 -= j16;
                    if (i14 == c0Var.f183338c) {
                        c0 c0VarA = c0Var.a();
                        eVar.f183348a = c0VarA;
                        d0.a(c0Var);
                        c0Var = c0VarA;
                    }
                    j8 = 0;
                }
            }
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            b0 b0Var = b0.this;
            boolean z14 = b0Var.f183330c;
            e eVar = b0Var.f183329b;
            if (z14) {
                vb.h.C("closed");
                return 0;
            }
            if (eVar.f183349b == 0 && b0Var.f183328a.read(eVar, 8192L) == -1) {
                return -1;
            }
            return eVar.readByte() & UnsignedBytes.MAX_VALUE;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        e eVar = this.f183329b;
        if (eVar.f183349b == 0 && this.f183328a.read(eVar, 8192L) == -1) {
            return -1;
        }
        return eVar.read(byteBuffer);
    }
}
