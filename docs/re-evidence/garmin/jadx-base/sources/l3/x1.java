package l3;

import i3.gh;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class x1 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f109474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f109475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<Float> f109476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<o4.d0> f109477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f109478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x3<o4.d0> f109479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.q<gh, p3.m, Integer, Unit> f109480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e2 f109481h;

    /* JADX WARN: Multi-variable type inference failed */
    public x1(s5.x0 x0Var, s5.x0 x0Var2, x3<Float> x3Var, x3<o4.d0> x3Var2, boolean z14, x3<o4.d0> x3Var3, e23.q<? super gh, ? super p3.m, ? super Integer, Unit> qVar, e2 e2Var) {
        this.f109474a = x0Var;
        this.f109475b = x0Var2;
        this.f109476c = x3Var;
        this.f109477d = x3Var2;
        this.f109478e = z14;
        this.f109479f = x3Var3;
        this.f109480g = qVar;
        this.f109481h = e2Var;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        d6.l lVarA;
        float f14;
        float f15;
        w5.f0 f0Var;
        o4.q1 q1VarD;
        s5.a0 a0Var;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            float fFloatValue = this.f109476c.getF182175a().floatValue();
            s5.x0 x0Var = this.f109474a;
            s5.i0 i0Var = x0Var.f157322a;
            s5.x0 x0Var2 = this.f109475b;
            s5.i0 i0Var2 = x0Var2.f157322a;
            d6.l lVar = s5.j0.f157231d;
            d6.l lVar2 = i0Var.f157211a;
            d6.l lVar3 = i0Var2.f157211a;
            boolean z14 = lVar2 instanceof d6.b;
            if (!z14 && !(lVar3 instanceof d6.b)) {
                d6.l.a aVar = d6.l.f57772a;
                long jH = o4.f0.h(lVar2.getF57707b(), lVar3.getF57707b(), fFloatValue);
                aVar.getClass();
                lVarA = d6.l.a.b(jH);
            } else if (z14 && (lVar3 instanceof d6.b)) {
                d6.l.a aVar2 = d6.l.f57772a;
                d6.b bVar = (d6.b) lVar2;
                d6.b bVar2 = (d6.b) lVar3;
                o4.w wVar = (o4.w) s5.j0.b(bVar.f57705b, bVar2.f57705b, fFloatValue);
                float fJ = gl.b.J(bVar.f57706c, bVar2.f57706c, fFloatValue);
                aVar2.getClass();
                lVarA = d6.l.a.a(fJ, wVar);
            } else {
                lVarA = (d6.l) s5.j0.b(lVar2, lVar3, fFloatValue);
            }
            d6.l lVar4 = lVarA;
            w5.q qVar = (w5.q) s5.j0.b(i0Var.fontFamily, i0Var2.fontFamily, fFloatValue);
            long jC = s5.j0.c(i0Var.fontSize, i0Var2.fontSize, fFloatValue);
            w5.f0 f0Var2 = i0Var.fontWeight;
            if (f0Var2 == null) {
                w5.f0.f182097b.getClass();
                f0Var2 = w5.f0.f182102g;
            }
            w5.f0 f0Var3 = i0Var2.fontWeight;
            if (f0Var3 == null) {
                w5.f0.f182097b.getClass();
                f0Var3 = w5.f0.f182102g;
            }
            w5.f0 f0Var4 = new w5.f0(j23.t.e(gl.b.K(f0Var2.f182107a, f0Var3.f182107a, fFloatValue), 1, 1000));
            w5.b0 b0Var = (w5.b0) s5.j0.b(i0Var.fontStyle, i0Var2.fontStyle, fFloatValue);
            w5.c0 c0Var = (w5.c0) s5.j0.b(i0Var.fontSynthesis, i0Var2.fontSynthesis, fFloatValue);
            String str = (String) s5.j0.b(i0Var.fontFeatureSettings, i0Var2.fontFeatureSettings, fFloatValue);
            long jC2 = s5.j0.c(i0Var.letterSpacing, i0Var2.letterSpacing, fFloatValue);
            d6.a aVar3 = i0Var.baselineShift;
            if (aVar3 != null) {
                f14 = aVar3.f57704a;
            } else {
                d6.a.C1234a c1234a = d6.a.f57703b;
                f14 = 0.0f;
            }
            d6.a aVar4 = i0Var2.baselineShift;
            if (aVar4 != null) {
                f15 = aVar4.f57704a;
            } else {
                d6.a.C1234a c1234a2 = d6.a.f57703b;
                f15 = 0.0f;
            }
            float fJ2 = gl.b.J(f14, f15, fFloatValue);
            d6.a.C1234a c1234a3 = d6.a.f57703b;
            d6.m mVar3 = i0Var.textGeometricTransform;
            if (mVar3 == null) {
                d6.m.f57775c.getClass();
                mVar3 = d6.m.f57776d;
            }
            d6.m mVar4 = i0Var2.textGeometricTransform;
            if (mVar4 == null) {
                d6.m.f57775c.getClass();
                mVar4 = d6.m.f57776d;
            }
            d6.m mVar5 = new d6.m(gl.b.J(mVar3.f57777a, mVar4.f57777a, fFloatValue), gl.b.J(mVar3.f57778b, mVar4.f57778b, fFloatValue));
            z5.c cVar = (z5.c) s5.j0.b(i0Var.localeList, i0Var2.localeList, fFloatValue);
            long jH2 = o4.f0.h(i0Var.f157222l, i0Var2.f157222l, fFloatValue);
            d6.i iVar = (d6.i) s5.j0.b(i0Var.background, i0Var2.background, fFloatValue);
            o4.q1 q1Var = i0Var.shadow;
            o4.q1 q1Var2 = i0Var2.shadow;
            if (!s5.k.f157232a) {
                if (q1Var == null) {
                    q1Var = new o4.q1(0L, 0L, 0.0f, 7, null);
                }
                if (q1Var2 == null) {
                    q1Var2 = new o4.q1(0L, 0L, 0.0f, 7, null);
                }
                q1VarD = o4.l1.d(q1Var, q1Var2, fFloatValue);
                f0Var = f0Var4;
            } else if (q1Var == null && q1Var2 == null) {
                f0Var = f0Var4;
                q1VarD = null;
            } else if (q1Var == null) {
                q1Var2.getClass();
                f0Var = f0Var4;
                q1VarD = o4.l1.d(new o4.q1(o4.d0.c(0.0f, q1Var2.f128958a, 14), q1Var2.f128959b, q1Var2.f128960c, null), q1Var2, fFloatValue);
            } else {
                f0Var = f0Var4;
                q1VarD = q1Var2 == null ? o4.l1.d(q1Var, new o4.q1(o4.d0.c(0.0f, q1Var.f128958a, 14), q1Var.f128959b, q1Var.f128960c, null), fFloatValue) : o4.l1.d(q1Var, q1Var2, fFloatValue);
            }
            s5.b0 b0Var2 = i0Var.platformStyle;
            s5.b0 b0Var3 = i0Var2.platformStyle;
            if (b0Var2 == null && b0Var3 == null) {
                b0Var2 = null;
            } else {
                if (b0Var2 == null) {
                    s5.b0.f157134a.getClass();
                    b0Var2 = s5.b0.f157135b;
                }
                if (b0Var3 == null) {
                    s5.b0.f157134a.getClass();
                }
            }
            w5.f0 f0Var5 = f0Var;
            s5.i0 i0Var3 = new s5.i0(lVar4, jC, f0Var5, b0Var, c0Var, qVar, str, jC2, d6.a.a(fJ2), mVar5, cVar, jH2, iVar, q1VarD, b0Var2, (q4.g) s5.j0.b(i0Var.drawStyle, i0Var2.drawStyle, fFloatValue), (p005kotlin.jvm.internal.j) null);
            s5.w wVar2 = x0Var.f157323b;
            s5.w wVar3 = x0Var2.f157323b;
            int i14 = s5.x.f157319b;
            int i15 = ((d6.h) s5.j0.b(d6.h.a(wVar2.f157306a), d6.h.a(wVar3.f157306a), fFloatValue)).f57759a;
            int i16 = ((d6.j) s5.j0.b(d6.j.a(wVar2.f157307b), d6.j.a(wVar3.f157307b), fFloatValue)).f57771a;
            long jC3 = s5.j0.c(wVar2.f157308c, wVar3.f157308c, fFloatValue);
            d6.n nVar = wVar2.f157309d;
            if (nVar == null) {
                d6.n.f57779c.getClass();
                nVar = d6.n.f57780d;
            }
            d6.n nVar2 = wVar3.f157309d;
            if (nVar2 == null) {
                d6.n.f57779c.getClass();
                nVar2 = d6.n.f57780d;
            }
            d6.n nVar3 = new d6.n(s5.j0.c(nVar.f57781a, nVar2.f57781a, fFloatValue), s5.j0.c(nVar.f57782b, nVar2.f57782b, fFloatValue), null);
            s5.a0 a0Var2 = wVar2.f157310e;
            s5.a0 a0Var3 = wVar3.f157310e;
            if (a0Var2 == null && a0Var3 == null) {
                a0Var = null;
            } else {
                if (a0Var2 == null) {
                    s5.a0.f157123c.getClass();
                    a0Var2 = s5.a0.f157124d;
                }
                if (a0Var3 == null) {
                    s5.a0.f157123c.getClass();
                    a0Var3 = s5.a0.f157124d;
                }
                a0Var = a0Var2.f157125a == a0Var3.f157125a ? a0Var2 : new s5.a0(((s5.l) s5.j0.b(s5.l.a(a0Var2.f157126b), s5.l.a(a0Var3.f157126b), fFloatValue)).f157237a, ((Boolean) s5.j0.b(Boolean.valueOf(a0Var2.f157125a), Boolean.valueOf(a0Var3.f157125a), fFloatValue)).booleanValue(), (p005kotlin.jvm.internal.j) null);
            }
            s5.x0 x0Var3 = new s5.x0(i0Var3, new s5.w(i15, i16, jC3, nVar3, a0Var, (d6.f) s5.j0.b(wVar2.f157311f, wVar3.f157311f, fFloatValue), ((d6.e) s5.j0.b(d6.e.a(wVar2.f157312g), d6.e.a(wVar3.f157312g), fFloatValue)).f57714a, ((d6.d) s5.j0.b(d6.d.a(wVar2.f157313h), d6.d.a(wVar3.f157313h), fFloatValue)).f57711a, (d6.o) s5.j0.b(wVar2.f157314i, wVar3.f157314i, fFloatValue), (p005kotlin.jvm.internal.j) null));
            if (this.f109478e) {
                x0Var3 = s5.x0.a(x0Var3, this.f109479f.getF182175a().f128833a, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            }
            k2.b(this.f109477d.getF182175a().f128833a, x0Var3, z3.f.c(1157484991, new w1(this.f109480g, this.f109481h), mVar2), mVar2, 384);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
