package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class uu0 implements u68 {
    public static final byte[] v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nkh f36137b;
    public final okh c;
    public final String d;
    public String e;
    public snp f;
    public snp g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36138k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f36139r;
    public long s;
    public snp t;
    public long u;

    public uu0(boolean z) {
        this(z, null);
    }

    private boolean i(okh okhVar, byte[] bArr, int i) {
        int iMin = Math.min(okhVar.a(), i - this.i);
        okhVar.j(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    public static boolean m(int i) {
        return (i & 65526) == 65520;
    }

    @Override // defpackage.u68
    public void a(okh okhVar) throws ParserException {
        b();
        while (okhVar.a() > 0) {
            int i = this.h;
            if (i == 0) {
                j(okhVar);
            } else if (i == 1) {
                g(okhVar);
            } else if (i != 2) {
                if (i == 3) {
                    if (i(okhVar, this.f36137b.f28014a, this.f36138k ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    p(okhVar);
                }
            } else if (i(okhVar, this.c.d(), 10)) {
                o();
            }
        }
    }

    public final void b() {
        rk1.e(this.f);
        wlq.j(this.t);
        wlq.j(this.g);
    }

    @Override // defpackage.u68
    public void c() {
        q();
    }

    @Override // defpackage.u68
    public void d() {
    }

    @Override // defpackage.u68
    public void e(long j, int i) {
        this.s = j;
    }

    @Override // defpackage.u68
    public void f(kl8 kl8Var, i2q.d dVar) {
        dVar.a();
        this.e = dVar.b();
        snp snpVarD = kl8Var.d(dVar.c(), 1);
        this.f = snpVarD;
        this.t = snpVarD;
        if (!this.f36136a) {
            this.g = new p67();
            return;
        }
        dVar.a();
        snp snpVarD2 = kl8Var.d(dVar.c(), 5);
        this.g = snpVarD2;
        snpVarD2.b(new Format.b().S(dVar.b()).e0("application/id3").E());
    }

    public final void g(okh okhVar) {
        if (okhVar.a() == 0) {
            return;
        }
        this.f36137b.f28014a[0] = okhVar.d()[okhVar.e()];
        this.f36137b.p(2);
        int iH = this.f36137b.h(4);
        int i = this.n;
        if (i != -1 && iH != i) {
            q();
            return;
        }
        if (!this.l) {
            this.l = true;
            this.m = this.o;
            this.n = iH;
        }
        t();
    }

    public final boolean h(okh okhVar, int i) {
        okhVar.P(i + 1);
        if (!w(okhVar, this.f36137b.f28014a, 1)) {
            return false;
        }
        this.f36137b.p(4);
        int iH = this.f36137b.h(1);
        int i2 = this.m;
        if (i2 != -1 && iH != i2) {
            return false;
        }
        if (this.n != -1) {
            if (!w(okhVar, this.f36137b.f28014a, 1)) {
                return true;
            }
            this.f36137b.p(2);
            if (this.f36137b.h(4) != this.n) {
                return false;
            }
            okhVar.P(i + 2);
        }
        if (!w(okhVar, this.f36137b.f28014a, 4)) {
            return true;
        }
        this.f36137b.p(14);
        int iH2 = this.f36137b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrD = okhVar.d();
        int iF = okhVar.f();
        int i3 = i + iH2;
        if (i3 >= iF) {
            return true;
        }
        byte b2 = bArrD[i3];
        if (b2 == -1) {
            int i4 = i3 + 1;
            if (i4 == iF) {
                return true;
            }
            return l((byte) -1, bArrD[i4]) && ((bArrD[i4] & 8) >> 3) == iH;
        }
        if (b2 != 73) {
            return false;
        }
        int i5 = i3 + 1;
        if (i5 == iF) {
            return true;
        }
        if (bArrD[i5] != 68) {
            return false;
        }
        int i6 = i3 + 2;
        return i6 == iF || bArrD[i6] == 51;
    }

    public final void j(okh okhVar) {
        byte[] bArrD = okhVar.d();
        int iE = okhVar.e();
        int iF = okhVar.f();
        while (iE < iF) {
            int i = iE + 1;
            byte b2 = bArrD[iE];
            int i2 = b2 & 255;
            if (this.j == 512 && l((byte) -1, (byte) i2) && (this.l || h(okhVar, iE - 1))) {
                this.o = (b2 & 8) >> 3;
                this.f36138k = (b2 & 1) == 0;
                if (this.l) {
                    t();
                } else {
                    r();
                }
                okhVar.P(i);
                return;
            }
            int i3 = this.j;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.j = 768;
            } else if (i4 == 511) {
                this.j = 512;
            } else if (i4 == 836) {
                this.j = 1024;
            } else if (i4 == 1075) {
                u();
                okhVar.P(i);
                return;
            } else if (i3 != 256) {
                this.j = 256;
            }
            iE = i;
        }
        okhVar.P(iE);
    }

    public long k() {
        return this.q;
    }

    public final boolean l(byte b2, byte b3) {
        return m(((b2 & 255) << 8) | (b3 & 255));
    }

    public final void n() throws ParserException {
        this.f36137b.p(0);
        if (this.p) {
            this.f36137b.r(10);
        } else {
            int i = 2;
            int iH = this.f36137b.h(2) + 1;
            if (iH != 2) {
                StringBuilder sb = new StringBuilder(61);
                sb.append("Detected audio object type: ");
                sb.append(iH);
                sb.append(", but assuming AAC LC.");
                toe.h("AdtsReader", sb.toString());
            } else {
                i = iH;
            }
            this.f36137b.r(5);
            byte[] bArrB = C3515if.b(i, this.n, this.f36137b.h(3));
            C3515if.b bVarG = C3515if.g(bArrB);
            Format formatE = new Format.b().S(this.e).e0(MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE).I(bVarG.c).H(bVarG.f21073b).f0(bVarG.f21072a).T(Collections.singletonList(bArrB)).V(this.d).E();
            this.q = 1024000000 / ((long) formatE.z);
            this.f.b(formatE);
            this.p = true;
        }
        this.f36137b.r(4);
        int iH2 = this.f36137b.h(13);
        int i2 = iH2 - 7;
        if (this.f36138k) {
            i2 = iH2 - 9;
        }
        v(this.f, this.q, 0, i2);
    }

    public final void o() {
        this.g.d(this.c, 10);
        this.c.P(6);
        v(this.g, 0L, 10, this.c.C() + 10);
    }

    public final void p(okh okhVar) {
        int iMin = Math.min(okhVar.a(), this.f36139r - this.i);
        this.t.d(okhVar, iMin);
        int i = this.i + iMin;
        this.i = i;
        int i2 = this.f36139r;
        if (i == i2) {
            this.t.e(this.s, 1, i2, 0, null);
            this.s += this.u;
            s();
        }
    }

    public final void q() {
        this.l = false;
        s();
    }

    public final void r() {
        this.h = 1;
        this.i = 0;
    }

    public final void s() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    public final void t() {
        this.h = 3;
        this.i = 0;
    }

    public final void u() {
        this.h = 2;
        this.i = v.length;
        this.f36139r = 0;
        this.c.P(0);
    }

    public final void v(snp snpVar, long j, int i, int i2) {
        this.h = 4;
        this.i = i;
        this.t = snpVar;
        this.u = j;
        this.f36139r = i2;
    }

    public final boolean w(okh okhVar, byte[] bArr, int i) {
        if (okhVar.a() < i) {
            return false;
        }
        okhVar.j(bArr, 0, i);
        return true;
    }

    public uu0(boolean z, String str) {
        this.f36137b = new nkh(new byte[7]);
        this.c = new okh(Arrays.copyOf(v, 10));
        s();
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.f36136a = z;
        this.d = str;
    }
}
