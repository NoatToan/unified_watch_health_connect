package q4;

import android.graphics.Paint;
import ch.qos.logback.core.CoreConstants;
import g6.o;
import lc.u0;
import o4.d0;
import o4.d1;
import o4.e0;
import o4.e1;
import o4.f1;
import o4.g1;
import o4.o0;
import o4.q;
import o4.u1;
import o4.v0;
import o4.v1;
import o4.w;
import o4.w1;
import o4.y;
import o4.z0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lq4/a;", "Lq4/f;", "<init>", "()V", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2680a f142542a = new C2680a(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f142543b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o4.h f142544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o4.h f142545d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"q4/a$b", "Lq4/d;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q4.b f142550a = new q4.b(this);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r4.c f142551b;

        public b() {
        }

        @Override // q4.d
        public final y a() {
            return a.this.f142542a.f142548c;
        }

        @Override // q4.d
        public final long b() {
            return a.this.f142542a.f142549d;
        }

        @Override // q4.d
        public final void c(long j8) {
            a.this.f142542a.f142549d = j8;
        }

        public final g6.c d() {
            return a.this.f142542a.f142546a;
        }

        public final o e() {
            return a.this.f142542a.f142547b;
        }

        public final void f(y yVar) {
            a.this.f142542a.f142548c = yVar;
        }

        public final void g(g6.c cVar) {
            a.this.f142542a.f142546a = cVar;
        }

        public final void h(o oVar) {
            a.this.f142542a.f142547b = oVar;
        }
    }

    public static d1 e(a aVar, long j8, g gVar, float f14, e0 e0Var, int i14) {
        f.f142555o0.getClass();
        int i15 = f.a.f142558c;
        d1 d1VarR = aVar.r(gVar);
        if (f14 != 1.0f) {
            j8 = d0.c(d0.e(j8) * f14, j8, 14);
        }
        o4.h hVar = (o4.h) d1VarR;
        if (!d0.d(hVar.b(), j8)) {
            hVar.e(j8);
        }
        if (hVar.f128859c != null) {
            hVar.g(null);
        }
        if (!s.g(hVar.f128860d, e0Var)) {
            hVar.d(e0Var);
        }
        int i16 = hVar.f128858b;
        q.a aVar2 = q.f128930b;
        if (i16 != i14) {
            hVar.k(i14);
        }
        int iH = hVar.h();
        o0.a aVar3 = o0.f128897b;
        if (iH == i15) {
            return d1VarR;
        }
        hVar.l(i15);
        return d1VarR;
    }

    public static d1 o(a aVar, w wVar, g gVar, float f14, e0 e0Var, int i14) {
        f.f142555o0.getClass();
        return aVar.f(wVar, gVar, f14, e0Var, i14, f.a.f142558c);
    }

    @Override // q4.f
    public final void H(long j8, float f14, long j14, g gVar, int i14) {
        this.f142542a.f142548c.b(f14, j14, e(this, j8, gVar, 1.0f, null, i14));
    }

    @Override // q4.f
    public final void I(f1 f1Var, long j8, float f14, g gVar, int i14) {
        this.f142542a.f142548c.r(f1Var, e(this, j8, gVar, f14, null, i14));
    }

    @Override // q4.f
    public final void K1(v0 v0Var, long j8, g gVar, e0 e0Var, int i14) {
        this.f142542a.f142548c.d(v0Var, j8, o(this, null, gVar, 1.0f, e0Var, i14));
    }

    @Override // q4.f
    public final void L0(v0 v0Var, long j8, long j14, long j15, long j16, float f14, g gVar, e0 e0Var, int i14, int i15) {
        this.f142542a.f142548c.p(v0Var, j8, j14, j15, j16, f(null, gVar, f14, e0Var, i14, i15));
    }

    @Override // q4.f
    public final void L1(f1 f1Var, w wVar, float f14, g gVar, int i14) {
        this.f142542a.f142548c.r(f1Var, o(this, wVar, gVar, f14, null, i14));
    }

    @Override // q4.f
    public final void M(long j8, long j14, long j15, float f14, int i14, g1 g1Var, int i15) {
        y yVar = this.f142542a.f142548c;
        v1.f129019b.getClass();
        f.f142555o0.getClass();
        int i16 = f.a.f142558c;
        d1 d1VarP = p();
        o4.h hVar = (o4.h) d1VarP;
        Paint paint = hVar.f128857a;
        if (!d0.d(hVar.b(), j8)) {
            hVar.e(j8);
        }
        if (hVar.f128859c != null) {
            hVar.g(null);
        }
        if (!s.g(hVar.f128860d, null)) {
            hVar.d(null);
        }
        int i17 = hVar.f128858b;
        q.a aVar = q.f128930b;
        if (i17 != i15) {
            hVar.k(i15);
        }
        if (paint.getStrokeWidth() != f14) {
            hVar.q(f14);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            hVar.p(4.0f);
        }
        int i18 = hVar.i();
        u1.a aVar2 = u1.f129010b;
        if (i18 != i14) {
            hVar.n(i14);
        }
        if (hVar.j() != 0) {
            hVar.o(0);
        }
        if (!s.g(hVar.f128861e, g1Var)) {
            hVar.m(g1Var);
        }
        int iH = hVar.h();
        o0.a aVar3 = o0.f128897b;
        if (iH != i16) {
            hVar.l(i16);
        }
        yVar.v(j14, j15, d1VarP);
    }

    @Override // q4.f
    public final void N(long j8, float f14, float f15, long j14, long j15, float f16, k kVar, int i14) {
        int i15 = (int) (j14 >> 32);
        int i16 = (int) (j14 & 4294967295L);
        this.f142542a.f142548c.m(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat((int) (j15 >> 32)) + Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (j15 & 4294967295L)) + Float.intBitsToFloat(i16), f14, f15, e(this, j8, kVar, f16, null, i14));
    }

    @Override // q4.f
    public final void R0(w1 w1Var, float f14, long j8, long j14, g gVar, int i14) {
        int i15 = (int) (j8 >> 32);
        int i16 = (int) (j8 & 4294967295L);
        this.f142542a.f142548c.m(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat(i16), 0.0f, f14, o(this, w1Var, gVar, 1.0f, null, i14));
    }

    @Override // q4.f
    /* JADX INFO: renamed from: S, reason: from getter */
    public final b getF142543b() {
        return this.f142543b;
    }

    @Override // q4.f
    public final void U(long j8, long j14, long j15, long j16, g gVar, int i14) {
        int i15 = (int) (j14 >> 32);
        int i16 = (int) (j14 & 4294967295L);
        this.f142542a.f142548c.o(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat((int) (j15 >> 32)) + Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (j15 & 4294967295L)) + Float.intBitsToFloat(i16), Float.intBitsToFloat((int) (j16 >> 32)), Float.intBitsToFloat((int) (j16 & 4294967295L)), e(this, j8, gVar, 1.0f, null, i14));
    }

    public final d1 f(w wVar, g gVar, float f14, e0 e0Var, int i14, int i15) {
        d1 d1VarR = r(gVar);
        if (wVar != null) {
            wVar.a(f14, b(), d1VarR);
        } else {
            o4.h hVar = (o4.h) d1VarR;
            if (hVar.f128859c != null) {
                hVar.g(null);
            }
            long jB = hVar.b();
            d0.f128823b.getClass();
            long j8 = d0.f128824c;
            if (!d0.d(jB, j8)) {
                hVar.e(j8);
            }
            if (hVar.a() != f14) {
                hVar.c(f14);
            }
        }
        o4.h hVar2 = (o4.h) d1VarR;
        if (!s.g(hVar2.f128860d, e0Var)) {
            hVar2.d(e0Var);
        }
        int i16 = hVar2.f128858b;
        q.a aVar = q.f128930b;
        if (i16 != i14) {
            hVar2.k(i14);
        }
        int iH = hVar2.h();
        o0.a aVar2 = o0.f128897b;
        if (iH == i15) {
            return d1VarR;
        }
        hVar2.l(i15);
        return d1VarR;
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF75991a() {
        return this.f142542a.f142546a.getF75991a();
    }

    @Override // q4.f
    public final o getLayoutDirection() {
        return this.f142542a.f142547b;
    }

    public final d1 p() {
        o4.h hVar = this.f142545d;
        if (hVar != null) {
            return hVar;
        }
        o4.h hVar2 = new o4.h();
        e1.f128845b.getClass();
        hVar2.r(e1.f128846c);
        this.f142545d = hVar2;
        return hVar2;
    }

    @Override // q4.f
    public final void q1(w wVar, long j8, long j14, long j15, float f14, g gVar, int i14) {
        int i15 = (int) (j8 >> 32);
        int i16 = (int) (j8 & 4294967295L);
        this.f142542a.f142548c.o(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat(i16), Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & 4294967295L)), o(this, wVar, gVar, f14, null, i14));
    }

    public final d1 r(g gVar) {
        if (s.g(gVar, j.f142560a)) {
            o4.h hVar = this.f142544c;
            if (hVar != null) {
                return hVar;
            }
            o4.h hVar2 = new o4.h();
            e1.f128845b.getClass();
            hVar2.r(0);
            this.f142544c = hVar2;
            return hVar2;
        }
        if (!(gVar instanceof k)) {
            u0.r();
            return null;
        }
        d1 d1VarP = p();
        o4.h hVar3 = (o4.h) d1VarP;
        Paint paint = hVar3.f128857a;
        float strokeWidth = paint.getStrokeWidth();
        k kVar = (k) gVar;
        g1 g1Var = kVar.f142566e;
        float f14 = kVar.f142562a;
        if (strokeWidth != f14) {
            hVar3.q(f14);
        }
        int i14 = hVar3.i();
        int i15 = kVar.f142564c;
        if (i14 != i15) {
            hVar3.n(i15);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f15 = kVar.f142563b;
        if (strokeMiter != f15) {
            hVar3.p(f15);
        }
        int iJ = hVar3.j();
        int i16 = kVar.f142565d;
        if (iJ != i16) {
            hVar3.o(i16);
        }
        if (!s.g(hVar3.f128861e, g1Var)) {
            hVar3.m(g1Var);
        }
        return d1VarP;
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF75992b() {
        return this.f142542a.f142546a.getF75992b();
    }

    @Override // q4.f
    public final void r1(long j8, long j14, long j15, float f14, g gVar, e0 e0Var, int i14) {
        int i15 = (int) (j14 >> 32);
        int i16 = (int) (j14 & 4294967295L);
        this.f142542a.f142548c.k(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat((int) (j15 >> 32)) + Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (j15 & 4294967295L)) + Float.intBitsToFloat(i16), e(this, j8, gVar, f14, e0Var, i14));
    }

    @Override // q4.f
    public final void y0(w wVar, long j8, long j14, float f14, float f15, int i14) {
        y yVar = this.f142542a.f142548c;
        v1.f129019b.getClass();
        f.f142555o0.getClass();
        int i15 = f.a.f142558c;
        d1 d1VarP = p();
        if (wVar != null) {
            wVar.a(f15, b(), d1VarP);
        } else {
            o4.h hVar = (o4.h) d1VarP;
            if (hVar.a() != f15) {
                hVar.c(f15);
            }
        }
        o4.h hVar2 = (o4.h) d1VarP;
        Paint paint = hVar2.f128857a;
        if (!s.g(hVar2.f128860d, null)) {
            hVar2.d(null);
        }
        int i16 = hVar2.f128858b;
        q.a aVar = q.f128930b;
        if (i16 != i14) {
            hVar2.k(i14);
        }
        if (paint.getStrokeWidth() != f14) {
            hVar2.q(f14);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            hVar2.p(4.0f);
        }
        int i17 = hVar2.i();
        u1.a aVar2 = u1.f129010b;
        if (i17 != 0) {
            hVar2.n(0);
        }
        if (hVar2.j() != 0) {
            hVar2.o(0);
        }
        if (!s.g(hVar2.f128861e, null)) {
            hVar2.m(null);
        }
        int iH = hVar2.h();
        o0.a aVar3 = o0.f128897b;
        if (iH != i15) {
            hVar2.l(i15);
        }
        yVar.v(j8, j14, d1VarP);
    }

    @Override // q4.f
    public final void y1(z0 z0Var, float f14, long j8, g gVar, int i14) {
        this.f142542a.f142548c.b(f14, j8, o(this, z0Var, gVar, 1.0f, null, i14));
    }

    @Override // q4.f
    public final void z(w wVar, long j8, long j14, float f14, g gVar, int i14) {
        int i15 = (int) (j8 >> 32);
        int i16 = (int) (j8 & 4294967295L);
        this.f142542a.f142548c.k(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat(i15), Float.intBitsToFloat((int) (4294967295L & j14)) + Float.intBitsToFloat(i16), o(this, wVar, gVar, f14, null, i14));
    }

    /* JADX INFO: renamed from: q4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lq4/a$a;", "", "Lg6/c;", "density", "Lg6/o;", "layoutDirection", "Lo4/y;", "canvas", "Ln4/g;", "size", "<init>", "(Lg6/c;Lg6/o;Lo4/y;JLkotlin/jvm/internal/j;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class C2680a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g6.c f142546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o f142547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y f142548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f142549d;

        /* JADX WARN: Illegal instructions before constructor call */
        public C2680a(g6.c cVar, o oVar, y yVar, long j8, int i14, p005kotlin.jvm.internal.j jVar) {
            g6.c cVar2 = (i14 & 1) != 0 ? e.f142554a : cVar;
            o oVar2 = (i14 & 2) != 0 ? o.Ltr : oVar;
            y yVar2 = (i14 & 4) != 0 ? i.f142559a : yVar;
            if ((i14 & 8) != 0) {
                n4.g.f123559b.getClass();
                j8 = 0;
            }
            this(cVar2, oVar2, yVar2, j8, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2680a)) {
                return false;
            }
            C2680a c2680a = (C2680a) obj;
            return s.g(this.f142546a, c2680a.f142546a) && this.f142547b == c2680a.f142547b && s.g(this.f142548c, c2680a.f142548c) && n4.g.c(this.f142549d, c2680a.f142549d);
        }

        public final int hashCode() {
            int iHashCode = (this.f142548c.hashCode() + ((this.f142547b.hashCode() + (this.f142546a.hashCode() * 31)) * 31)) * 31;
            long j8 = this.f142549d;
            n4.g.a aVar = n4.g.f123559b;
            return Long.hashCode(j8) + iHashCode;
        }

        public final String toString() {
            return "DrawParams(density=" + this.f142546a + ", layoutDirection=" + this.f142547b + ", canvas=" + this.f142548c + ", size=" + ((Object) n4.g.i(this.f142549d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ C2680a(g6.c cVar, o oVar, y yVar, long j8, p005kotlin.jvm.internal.j jVar) {
            this(cVar, oVar, yVar, j8);
        }

        private C2680a(g6.c cVar, o oVar, y yVar, long j8) {
            this.f142546a = cVar;
            this.f142547b = oVar;
            this.f142548c = yVar;
            this.f142549d = j8;
        }
    }
}
