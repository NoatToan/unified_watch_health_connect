package com.huawei.hms.network.embedded;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes34.dex */
public final class kb implements zb {
    public static final byte f = 1;
    public static final byte g = 2;
    public static final byte h = 3;
    public static final byte i = 4;
    public static final byte j = 0;
    public static final byte k = 1;
    public static final byte l = 2;
    public static final byte m = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final db f15017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f15018c;
    public final nb d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15016a = 0;
    public final CRC32 e = new CRC32();

    @Override // com.huawei.hms.network.embedded.zb, com.huawei.hms.network.embedded.yb
    public ac timeout() {
        return this.f15017b.timeout();
    }

    @Override // com.huawei.hms.network.embedded.zb
    public long read(bb bbVar, long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (j2 == 0) {
            return 0L;
        }
        if (this.f15016a == 0) {
            b();
            this.f15016a = 1;
        }
        if (this.f15016a == 1) {
            long j3 = bbVar.f14653b;
            long j4 = this.d.read(bbVar, j2);
            if (j4 != -1) {
                a(bbVar, j3, j4);
                return j4;
            }
            this.f15016a = 2;
        }
        if (this.f15016a == 2) {
            c();
            this.f15016a = 3;
            if (!this.f15017b.i()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.huawei.hms.network.embedded.zb, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.huawei.hms.network.embedded.yb
    public void close() throws IOException {
        this.d.close();
    }

    private void c() throws IOException {
        a("CRC", this.f15017b.e(), (int) this.e.getValue());
        a("ISIZE", this.f15017b.e(), (int) this.f15018c.getBytesWritten());
    }

    private void b() throws IOException {
        this.f15017b.i(10L);
        byte bJ = this.f15017b.a().j(3L);
        boolean z = ((bJ >> 1) & 1) == 1;
        if (z) {
            a(this.f15017b.a(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f15017b.readShort());
        this.f15017b.skip(8L);
        if (((bJ >> 2) & 1) == 1) {
            this.f15017b.i(2L);
            if (z) {
                a(this.f15017b.a(), 0L, 2L);
            }
            long j2 = this.f15017b.a().j();
            this.f15017b.i(j2);
            if (z) {
                a(this.f15017b.a(), 0L, j2);
            }
            this.f15017b.skip(j2);
        }
        if (((bJ >> 3) & 1) == 1) {
            long jA = this.f15017b.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z) {
                a(this.f15017b.a(), 0L, jA + 1);
            }
            this.f15017b.skip(jA + 1);
        }
        if (((bJ >> 4) & 1) == 1) {
            long jA2 = this.f15017b.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z) {
                a(this.f15017b.a(), 0L, jA2 + 1);
            }
            this.f15017b.skip(jA2 + 1);
        }
        if (z) {
            a("FHCRC", this.f15017b.j(), (short) this.e.getValue());
            this.e.reset();
        }
    }

    private void a(String str, int i2, int i3) throws IOException {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    private void a(bb bbVar, long j2, long j3) {
        vb vbVar = bbVar.f14652a;
        while (true) {
            long j4 = vbVar.f15548c - vbVar.f15547b;
            if (j2 < j4) {
                break;
            }
            j2 -= j4;
            vbVar = vbVar.f;
        }
        while (j3 > 0) {
            int i2 = (int) (((long) vbVar.f15547b) + j2);
            int iMin = (int) Math.min(vbVar.f15548c - i2, j3);
            this.e.update(vbVar.f15546a, i2, iMin);
            j3 -= (long) iMin;
            vbVar = vbVar.f;
            j2 = 0;
        }
    }

    public kb(zb zbVar) {
        if (zbVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f15018c = inflater;
        db dbVarA = ob.a(zbVar);
        this.f15017b = dbVarA;
        this.d = new nb(dbVarA, inflater);
    }
}
