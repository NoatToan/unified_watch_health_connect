package w63;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lw63/q;", "Lw63/g0;", "source", "<init>", "(Lw63/g0;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f183391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f183392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f183393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f183394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CRC32 f183395e;

    public q(g0 g0Var) {
        g0Var.getClass();
        b0 b0Var = new b0(g0Var);
        this.f183392b = b0Var;
        Inflater inflater = new Inflater(true);
        this.f183393c = inflater;
        this.f183394d = new r((g) b0Var, inflater);
        this.f183395e = new CRC32();
    }

    public static void a(int i14, int i15, String str) throws IOException {
        if (i15 == i14) {
            return;
        }
        StringBuilder sbI = sn.a.i(str, ": actual 0x");
        sbI.append(d53.w.M(8, b.d(i15)));
        sbI.append(" != expected 0x");
        sbI.append(d53.w.M(8, b.d(i14)));
        throw new IOException(sbI.toString());
    }

    public final void c(long j8, e eVar, long j14) {
        c0 c0Var = eVar.f183348a;
        c0Var.getClass();
        while (true) {
            long j15 = c0Var.f183338c - c0Var.f183337b;
            if (j8 < j15) {
                break;
            }
            j8 -= j15;
            c0Var = c0Var.f183341f;
            c0Var.getClass();
        }
        while (j14 > 0) {
            int i14 = (int) (((long) c0Var.f183337b) + j8);
            int iMin = (int) Math.min(c0Var.f183338c - i14, j14);
            this.f183395e.update(c0Var.f183336a, i14, iMin);
            j14 -= (long) iMin;
            c0Var = c0Var.f183341f;
            c0Var.getClass();
            j8 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f183394d.close();
    }

    @Override // w63.g0
    public final long read(e eVar, long j8) throws IOException {
        q qVar = this;
        eVar.getClass();
        if (j8 < 0) {
            vb.h.x(org.apache.commons.lang3.e.e(j8, "byteCount < 0: "));
            return 0L;
        }
        if (j8 == 0) {
            return 0L;
        }
        byte b14 = qVar.f183391a;
        CRC32 crc32 = qVar.f183395e;
        b0 b0Var = qVar.f183392b;
        if (b14 == 0) {
            b0Var.E3(10L);
            e eVar2 = b0Var.f183329b;
            byte bJ = eVar2.j(3L);
            boolean z14 = ((bJ >> 1) & 1) == 1;
            if (z14) {
                qVar.c(0L, b0Var.f183329b, 10L);
            }
            a(8075, b0Var.readShort(), "ID1ID2");
            b0Var.skip(8L);
            if (((bJ >> 2) & 1) == 1) {
                b0Var.E3(2L);
                if (z14) {
                    c(0L, b0Var.f183329b, 2L);
                }
                long jV = eVar2.v() & 65535;
                b0Var.E3(jV);
                if (z14) {
                    c(0L, b0Var.f183329b, jV);
                }
                b0Var.skip(jV);
            }
            if (((bJ >> 3) & 1) == 1) {
                long jA = b0Var.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == -1) {
                    vb.h.m();
                    return 0L;
                }
                if (z14) {
                    c(0L, b0Var.f183329b, jA + 1);
                }
                b0Var.skip(jA + 1);
            }
            if (((bJ >> 4) & 1) == 1) {
                long jA2 = b0Var.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    vb.h.m();
                    return 0L;
                }
                if (z14) {
                    qVar = this;
                    qVar.c(0L, b0Var.f183329b, jA2 + 1);
                } else {
                    qVar = this;
                }
                b0Var.skip(jA2 + 1);
            } else {
                qVar = this;
            }
            if (z14) {
                a(b0Var.f(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            qVar.f183391a = (byte) 1;
        }
        if (qVar.f183391a == 1) {
            long j14 = eVar.f183349b;
            long j15 = qVar.f183394d.read(eVar, j8);
            if (j15 != -1) {
                qVar.c(j14, eVar, j15);
                return j15;
            }
            qVar.f183391a = (byte) 2;
        }
        if (qVar.f183391a == 2) {
            a(b0Var.c(), (int) crc32.getValue(), "CRC");
            a(b0Var.c(), (int) qVar.f183393c.getBytesWritten(), "ISIZE");
            qVar.f183391a = (byte) 3;
            if (!b0Var.F1()) {
                vb.h.C("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // w63.g0
    /* JADX INFO: renamed from: timeout */
    public final h0 getTimeout() {
        return this.f183392b.f183328a.getTimeout();
    }
}
