package w2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s5.q0;
import s5.w0;
import v2.h2;
import v2.j1;
import v2.k2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lw2/d;", "", "Lv2/h2;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ls5/q0;", "textLayoutResult", "", "isFromSoftKeyboard", "", "visibleTextLayoutHeight", "Lw2/l;", "textPreparedSelectionState", "<init>", "(Lv2/h2;Ls5/q0;ZFLw2/l;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f181310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f181311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f181312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f181313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f181314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u2.e f181315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j1 f181316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f181317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k2 f181318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f181319j;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(h2 h2Var, q0 q0Var, boolean z14, float f14, l lVar) {
        this.f181310a = h2Var;
        this.f181311b = q0Var;
        this.f181312c = z14;
        this.f181313d = f14;
        this.f181314e = lVar;
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68733f = fVarA != null ? fVarA.getF68799i() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            u2.e eVarD = h2Var.d();
            this.f181315f = eVarD;
            this.f181316g = (j1) h2Var.f175042d.getF182175a();
            Unit unit = Unit.INSTANCE;
            f4.f.a.e(fVarA, fVarB, f68733f);
            this.f181317h = eVarD.f167840d;
            this.f181319j = eVarD.f167839c.toString();
        } catch (Throwable th3) {
            f4.f.a.e(fVarA, fVarB, f68733f);
            throw th3;
        }
    }

    public final void a() {
        if (this.f181319j.length() > 0) {
            u2.e eVar = this.f181315f;
            boolean zE = w0.e(eVar.f167840d);
            h2 h2Var = this.f181310a;
            if (zE) {
                h2.i(h2Var, "", og.a.l((int) (eVar.f167840d >> 32), (int) (this.f181317h & 4294967295L)), !this.f181312c, 4);
            } else {
                h2Var.c();
            }
            this.f181317h = this.f181310a.d().f167840d;
            this.f181318i = k2.Start;
        }
    }

    public final boolean b() {
        q0 q0Var = this.f181311b;
        if (q0Var == null) {
            return true;
        }
        long j8 = this.f181317h;
        w0.a aVar = w0.f157315b;
        d6.g gVarJ = q0Var.j((int) (j8 & 4294967295L));
        return gVarJ == null || gVarJ == d6.g.Ltr;
    }

    public final int c(q0 q0Var, int i14) {
        long j8 = this.f181317h;
        w0.a aVar = w0.f157315b;
        int i15 = (int) (j8 & 4294967295L);
        l lVar = this.f181314e;
        if (Float.isNaN(lVar.f181360a)) {
            lVar.f181360a = q0Var.c(i15).f123547a;
        }
        s5.o oVar = q0Var.f157281b;
        int iD = oVar.d(i15) + i14;
        if (iD < 0) {
            return Integer.MIN_VALUE;
        }
        if (iD >= oVar.f157257f) {
            return Integer.MAX_VALUE;
        }
        float fB = oVar.b(iD) - 1;
        float f14 = lVar.f181360a;
        if ((b() && f14 >= q0Var.h(iD)) || (!b() && f14 <= q0Var.g(iD))) {
            return oVar.c(iD, true);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
        n4.c.a aVar2 = n4.c.f123541b;
        return oVar.g(jFloatToRawIntBits);
    }

    public final int d(int i14) {
        long j8 = this.f181315f.f167840d;
        w0.a aVar = w0.f157315b;
        int i15 = (int) (j8 & 4294967295L);
        q0 q0Var = this.f181311b;
        if (q0Var != null) {
            s5.o oVar = q0Var.f157281b;
            float f14 = this.f181313d;
            if (!Float.isNaN(f14)) {
                n4.d dVarN = q0Var.c(i15).n(0.0f, f14 * i14);
                float f15 = dVarN.f123548b;
                float fB = oVar.b(oVar.e(f15));
                return Math.abs(f15 - fB) > Math.abs(dVarN.f123550d - fB) ? oVar.g(dVarN.i()) : oVar.g(dVarN.d());
            }
        }
        return i15;
    }

    public final void e() {
        q0 q0Var = this.f181311b;
        int iC = q0Var != null ? c(q0Var, 1) : Integer.MAX_VALUE;
        if (iC == Integer.MAX_VALUE) {
            this.f181314e.f181360a = Float.NaN;
        }
        String str = this.f181319j;
        if (str.length() > 0) {
            long j8 = this.f181317h;
            w0.a aVar = w0.f157315b;
            int i14 = (int) (j8 & 4294967295L);
            int length = str.length();
            if (iC > length) {
                iC = length;
            }
            long jA = h0.a(iC, i14, this.f181310a);
            int i15 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i15 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i15, i15);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void f() {
        if (this.f181319j.length() > 0) {
            long j8 = this.f181317h;
            w0.a aVar = w0.f157315b;
            int i14 = (int) (j8 & 4294967295L);
            long jA = h0.a(d(1), i14, this.f181310a);
            int i15 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i15 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i15, i15);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void g() {
        this.f181314e.f181360a = Float.NaN;
        String str = this.f181319j;
        if (str.length() > 0) {
            long j8 = this.f181317h;
            w0.a aVar = w0.f157315b;
            int i14 = (int) (j8 & 4294967295L);
            long jA = h0.a(ge1.b.u(i14, str), i14, this.f181310a);
            int i15 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i15 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i15, i15);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void h() {
        this.f181314e.f181360a = Float.NaN;
        String str = this.f181319j;
        if (str.length() > 0) {
            long j8 = this.f181317h;
            int i14 = (int) (4294967295L & j8);
            int iX = g8.i.x(w0.g(j8), str);
            if (iX == w0.g(this.f181317h) && iX != str.length()) {
                iX = g8.i.x(iX + 1, str);
            }
            long jA = h0.a(iX, i14, this.f181310a);
            int i15 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i15 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i15, i15);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void i() {
        int length;
        this.f181314e.f181360a = Float.NaN;
        String str = this.f181319j;
        if (str.length() > 0) {
            long j8 = this.f181317h;
            w0.a aVar = w0.f157315b;
            int i14 = (int) (j8 & 4294967295L);
            q0 q0Var = this.f181311b;
            if (q0Var != null) {
                int i15 = i14;
                while (true) {
                    u2.e eVar = this.f181315f;
                    if (i15 < eVar.f167839c.length()) {
                        int length2 = str.length() - 1;
                        if (i15 <= length2) {
                            length2 = i15;
                        }
                        long jL = q0Var.l(length2);
                        w0.a aVar2 = w0.f157315b;
                        int i16 = (int) (jL & 4294967295L);
                        if (i16 > i15) {
                            length = i16;
                            break;
                        }
                        i15++;
                    } else {
                        length = eVar.f167839c.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long jA = h0.a(length, i14, this.f181310a);
            int i17 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i17 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i17, i17);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void j() {
        this.f181314e.f181360a = Float.NaN;
        String str = this.f181319j;
        if (str.length() > 0) {
            long j8 = this.f181317h;
            w0.a aVar = w0.f157315b;
            int i14 = (int) (j8 & 4294967295L);
            long jA = h0.a(ge1.b.v(i14, str), i14, this.f181310a);
            int i15 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i15 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i15, i15);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void k() {
        this.f181314e.f181360a = Float.NaN;
        String str = this.f181319j;
        if (str.length() > 0) {
            long j8 = this.f181317h;
            int i14 = (int) (4294967295L & j8);
            int iY = g8.i.y(w0.h(j8), str);
            if (iY == w0.h(this.f181317h) && iY != 0) {
                iY = g8.i.y(iY - 1, str);
            }
            long jA = h0.a(iY, i14, this.f181310a);
            int i15 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i15 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i15, i15);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void l() {
        this.f181314e.f181360a = Float.NaN;
        String str = this.f181319j;
        if (str.length() > 0) {
            long j8 = this.f181317h;
            w0.a aVar = w0.f157315b;
            int i14 = (int) (j8 & 4294967295L);
            int i15 = 0;
            q0 q0Var = this.f181311b;
            if (q0Var != null) {
                for (int i16 = i14; i16 > 0; i16--) {
                    int length = str.length() - 1;
                    if (i16 <= length) {
                        length = i16;
                    }
                    long jL = q0Var.l(length);
                    w0.a aVar2 = w0.f157315b;
                    int i17 = (int) (jL >> 32);
                    if (i17 < i16) {
                        i15 = i17;
                        break;
                    }
                }
            }
            long jA = h0.a(i15, i14, this.f181310a);
            int i18 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i18 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i18, i18);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void m() {
        this.f181314e.f181360a = Float.NaN;
        String str = this.f181319j;
        if (str.length() > 0) {
            long j8 = this.f181317h;
            w0.a aVar = w0.f157315b;
            int i14 = (int) (j8 & 4294967295L);
            long jA = h0.a(str.length(), i14, this.f181310a);
            int i15 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i15 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i15, i15);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void n() {
        this.f181314e.f181360a = Float.NaN;
        if (this.f181319j.length() > 0) {
            long j8 = this.f181317h;
            w0.a aVar = w0.f157315b;
            int i14 = (int) (j8 & 4294967295L);
            long jA = h0.a(0, i14, this.f181310a);
            int i15 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i15 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i15, i15);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void o() {
        int length;
        this.f181314e.f181360a = Float.NaN;
        String str = this.f181319j;
        if (str.length() > 0) {
            long j8 = this.f181317h;
            w0.a aVar = w0.f157315b;
            int i14 = (int) (4294967295L & j8);
            q0 q0Var = this.f181311b;
            if (q0Var != null) {
                s5.o oVar = q0Var.f157281b;
                length = oVar.c(oVar.d(w0.g(j8)), true);
            } else {
                length = str.length();
            }
            long jA = h0.a(length, i14, this.f181310a);
            int i15 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i15 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i15, i15);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void p() {
        int i14;
        this.f181314e.f181360a = Float.NaN;
        if (this.f181319j.length() > 0) {
            long j8 = this.f181317h;
            w0.a aVar = w0.f157315b;
            int i15 = (int) (4294967295L & j8);
            q0 q0Var = this.f181311b;
            if (q0Var != null) {
                i14 = q0Var.i(q0Var.f157281b.d(w0.h(j8)));
            } else {
                i14 = 0;
            }
            long jA = h0.a(i14, i15, this.f181310a);
            int i16 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i16 != i15 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i16, i16);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void q() {
        q0 q0Var = this.f181311b;
        int iC = q0Var != null ? c(q0Var, -1) : Integer.MIN_VALUE;
        if (iC == Integer.MIN_VALUE) {
            this.f181314e.f181360a = Float.NaN;
        }
        if (this.f181319j.length() > 0) {
            long j8 = this.f181317h;
            w0.a aVar = w0.f157315b;
            int i14 = (int) (j8 & 4294967295L);
            if (iC < 0) {
                iC = 0;
            }
            long jA = h0.a(iC, i14, this.f181310a);
            int i15 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i15 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i15, i15);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void r() {
        if (this.f181319j.length() > 0) {
            long j8 = this.f181317h;
            w0.a aVar = w0.f157315b;
            int i14 = (int) (j8 & 4294967295L);
            long jA = h0.a(d(-1), i14, this.f181310a);
            int i15 = (int) (jA >> 32);
            k2 k2VarA = b.a(jA);
            if (i15 != i14 || !w0.e(this.f181317h)) {
                this.f181317h = og.a.l(i15, i15);
            }
            if (k2VarA != null) {
                this.f181318i = k2VarA;
            }
        }
    }

    public final void s() {
        if (this.f181319j.length() > 0) {
            long j8 = this.f181315f.f167840d;
            w0.a aVar = w0.f157315b;
            this.f181317h = og.a.l((int) (j8 >> 32), (int) (this.f181317h & 4294967295L));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw2/d$a;", "", "<init>", "()V", "", "NoCharacterFound", "I", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
