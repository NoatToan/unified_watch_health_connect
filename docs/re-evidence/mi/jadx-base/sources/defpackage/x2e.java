package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class x2e implements u68 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f38609b;
    public final nkh c;
    public snp d;
    public String e;
    public Format f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f38610k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f38611r;
    public long s;
    public int t;
    public String u;

    public x2e(String str) {
        this.f38608a = str;
        okh okhVar = new okh(1024);
        this.f38609b = okhVar;
        this.c = new nkh(okhVar.d());
    }

    public static long b(nkh nkhVar) {
        return nkhVar.h((nkhVar.h(2) + 1) * 8);
    }

    @Override // defpackage.u68
    public void a(okh okhVar) throws ParserException {
        rk1.i(this.d);
        while (okhVar.a() > 0) {
            int i = this.g;
            if (i != 0) {
                if (i == 1) {
                    int iD = okhVar.D();
                    if ((iD & SportReportBaseParser.ReportType.avgFreq) == 224) {
                        this.j = iD;
                        this.g = 2;
                    } else if (iD != 86) {
                        this.g = 0;
                    }
                } else if (i == 2) {
                    int iD2 = ((this.j & (-225)) << 8) | okhVar.D();
                    this.i = iD2;
                    if (iD2 > this.f38609b.d().length) {
                        m(this.i);
                    }
                    this.h = 0;
                    this.g = 3;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(okhVar.a(), this.i - this.h);
                    okhVar.j(this.c.f28014a, this.h, iMin);
                    int i2 = this.h + iMin;
                    this.h = i2;
                    if (i2 == this.i) {
                        this.c.p(0);
                        g(this.c);
                        this.g = 0;
                    }
                }
            } else if (okhVar.D() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // defpackage.u68
    public void c() {
        this.g = 0;
        this.l = false;
    }

    @Override // defpackage.u68
    public void d() {
    }

    @Override // defpackage.u68
    public void e(long j, int i) {
        this.f38610k = j;
    }

    @Override // defpackage.u68
    public void f(kl8 kl8Var, i2q.d dVar) {
        dVar.a();
        this.d = kl8Var.d(dVar.c(), 1);
        this.e = dVar.b();
    }

    public final void g(nkh nkhVar) throws ParserException {
        if (!nkhVar.g()) {
            this.l = true;
            l(nkhVar);
        } else if (!this.l) {
            return;
        }
        if (this.m != 0) {
            throw new ParserException();
        }
        if (this.n != 0) {
            throw new ParserException();
        }
        k(nkhVar, j(nkhVar));
        if (this.p) {
            nkhVar.r((int) this.q);
        }
    }

    public final int h(nkh nkhVar) throws ParserException {
        int iB = nkhVar.b();
        C3515if.b bVarF = C3515if.f(nkhVar, true);
        this.u = bVarF.c;
        this.f38611r = bVarF.f21072a;
        this.t = bVarF.f21073b;
        return iB - nkhVar.b();
    }

    public final void i(nkh nkhVar) {
        int iH = nkhVar.h(3);
        this.o = iH;
        if (iH == 0) {
            nkhVar.r(8);
            return;
        }
        if (iH == 1) {
            nkhVar.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            nkhVar.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            nkhVar.r(1);
        }
    }

    public final int j(nkh nkhVar) throws ParserException {
        int iH;
        if (this.o != 0) {
            throw new ParserException();
        }
        int i = 0;
        do {
            iH = nkhVar.h(8);
            i += iH;
        } while (iH == 255);
        return i;
    }

    public final void k(nkh nkhVar, int i) {
        int iE = nkhVar.e();
        if ((iE & 7) == 0) {
            this.f38609b.P(iE >> 3);
        } else {
            nkhVar.i(this.f38609b.d(), 0, i * 8);
            this.f38609b.P(0);
        }
        this.d.d(this.f38609b, i);
        this.d.e(this.f38610k, 1, i, 0, null);
        this.f38610k += this.s;
    }

    public final void l(nkh nkhVar) throws ParserException {
        boolean zG;
        int iH = nkhVar.h(1);
        int iH2 = iH == 1 ? nkhVar.h(1) : 0;
        this.m = iH2;
        if (iH2 != 0) {
            throw new ParserException();
        }
        if (iH == 1) {
            b(nkhVar);
        }
        if (!nkhVar.g()) {
            throw new ParserException();
        }
        this.n = nkhVar.h(6);
        int iH3 = nkhVar.h(4);
        int iH4 = nkhVar.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw new ParserException();
        }
        if (iH == 0) {
            int iE = nkhVar.e();
            int iH5 = h(nkhVar);
            nkhVar.p(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            nkhVar.i(bArr, 0, iH5);
            Format formatE = new Format.b().S(this.e).e0(MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE).I(this.u).H(this.t).f0(this.f38611r).T(Collections.singletonList(bArr)).V(this.f38608a).E();
            if (!formatE.equals(this.f)) {
                this.f = formatE;
                this.s = 1024000000 / ((long) formatE.z);
                this.d.b(formatE);
            }
        } else {
            nkhVar.r(((int) b(nkhVar)) - h(nkhVar));
        }
        i(nkhVar);
        boolean zG2 = nkhVar.g();
        this.p = zG2;
        this.q = 0L;
        if (zG2) {
            if (iH == 1) {
                this.q = b(nkhVar);
            } else {
                do {
                    zG = nkhVar.g();
                    this.q = (this.q << 8) + ((long) nkhVar.h(8));
                } while (zG);
            }
        }
        if (nkhVar.g()) {
            nkhVar.r(8);
        }
    }

    public final void m(int i) {
        this.f38609b.L(i);
        this.c.n(this.f38609b.d());
    }
}
