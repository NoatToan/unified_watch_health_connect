package nw1;

import android.content.Context;
import c.q;
import c.w;
import c2.x2;
import e23.p;
import e23.r;
import g.h;
import g02.s0;
import i3.fe;
import kotlin.m3;
import lc.m0;
import lc.v;
import lw1.f;
import mt0.e0;
import o53.b0;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.x1;
import p3.x3;
import r1.l;
import t21.p0;
import u1.a2;
import u21.a0;
import ub1.g;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128138a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f128139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f128140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f128141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f128142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f128143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f128144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f128145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f128146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f128147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f128148k;

    public /* synthetic */ b(Context context, e23.a aVar, f fVar, b0 b0Var, x3 x3Var, m0 m0Var, String str, fe feVar, g gVar, e23.a aVar2) {
        this.f128141d = context;
        this.f128139b = aVar;
        this.f128142e = fVar;
        this.f128143f = b0Var;
        this.f128144g = x3Var;
        this.f128145h = m0Var;
        this.f128146i = str;
        this.f128147j = feVar;
        this.f128148k = gVar;
        this.f128140c = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:21:0x0116  */
    /* JADX WARN: Code duplicated, block: B:26:0x013f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0178  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object e0Var;
        Object c2456c;
        fe feVar;
        int i14 = this.f128138a;
        Object obj5 = this.f128148k;
        Object obj6 = this.f128147j;
        Object obj7 = this.f128146i;
        Object obj8 = this.f128145h;
        Object obj9 = this.f128144g;
        Object obj10 = this.f128143f;
        Object obj11 = this.f128142e;
        Object obj12 = this.f128141d;
        switch (i14) {
            case 0:
                Context context = (Context) obj12;
                f fVar = (f) obj11;
                b0 b0Var = (b0) obj10;
                x3 x3Var = (x3) obj9;
                m0 m0Var = (m0) obj8;
                String str = (String) obj7;
                fe feVar2 = (fe) obj6;
                g gVar = (g) obj5;
                m mVar = (m) obj3;
                ((Integer) obj4).getClass();
                ((l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var = n.f135158a;
                h hVar = new h();
                boolean zR = mVar.r(context);
                e23.a aVar = this.f128139b;
                boolean zB = zR | mVar.B(aVar) | mVar.r(fVar);
                Object objQ = mVar.q();
                m.a aVar2 = m.f135153a;
                if (zB) {
                    objQ = new ls0.h(context, 18, aVar, fVar);
                    mVar.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ls0.h(context, 18, aVar, fVar);
                        mVar.K(objQ);
                    }
                }
                q qVarC = w.c(hVar, (e23.l) objQ, mVar, 0);
                h hVar2 = new h();
                boolean zR2 = mVar.r(b0Var) | mVar.r(fVar) | mVar.B(x3Var) | mVar.r(m0Var);
                Object objQ2 = mVar.q();
                if (zR2) {
                    e0Var = new e0(b0Var, fVar, m0Var, x3Var, 6);
                    mVar.K(e0Var);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        e0Var = new e0(b0Var, fVar, m0Var, x3Var, 6);
                        mVar.K(e0Var);
                    } else {
                        e0Var = objQ2;
                    }
                }
                q qVarC2 = w.c(hVar2, (e23.l) e0Var, mVar, 0);
                Unit unit = Unit.INSTANCE;
                boolean zB2 = mVar.B(x3Var) | mVar.r(fVar);
                Object objQ3 = mVar.q();
                if (zB2) {
                    objQ3 = new c.b(fVar, x3Var, null);
                    mVar.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new c.b(fVar, x3Var, null);
                        mVar.K(objQ3);
                    }
                }
                l0.e((p) objQ3, unit, mVar);
                Boolean boolValueOf = Boolean.valueOf(((lw1.a) x3Var.getF182175a()).f115076b);
                boolean zB3 = mVar.B(x3Var) | mVar.B(str) | mVar.r(fVar);
                Object objQ4 = mVar.q();
                if (zB3) {
                    feVar = feVar2;
                    c2456c = new c.C2456c(feVar, str, fVar, x3Var, null);
                    fVar = fVar;
                    mVar.K(c2456c);
                } else {
                    aVar2.getClass();
                    if (objQ4 == m.a.f135155b) {
                        feVar = feVar2;
                        c2456c = new c.C2456c(feVar, str, fVar, x3Var, null);
                        fVar = fVar;
                        mVar.K(c2456c);
                    } else {
                        c2456c = objQ4;
                        feVar = feVar2;
                    }
                }
                l0.e((p) c2456c, boolValueOf, mVar);
                s0.a(null, ((lw1.a) x3Var.getF182175a()).f115075a, z3.f.c(985199611, new c42.d(feVar, fVar, x3Var, qVarC2, gVar, context, m0Var, qVarC, this.f128140c), mVar), mVar, 384, 1);
                return unit;
            default:
                a0 a0Var = (a0) obj12;
                l22.a aVar3 = (l22.a) obj11;
                v21.e eVar = (v21.e) obj10;
                p pVar = (p) obj9;
                e23.l lVar = (e23.l) obj8;
                m4.q qVar = (m4.q) obj7;
                m3 m3Var = (m3) obj6;
                e23.a aVar4 = (e23.a) obj5;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                m mVar2 = (m) obj3;
                ((Integer) obj4).getClass();
                ((l) obj).getClass();
                x1 x1Var2 = n.f135158a;
                if (zBooleanValue) {
                    mVar2.C(2043287875);
                    p0.a(this.f128139b, this.f128140c, a0Var, aVar3, eVar, pVar, lVar, qVar, m3Var, mVar2, 0);
                    mVar2.f();
                } else {
                    mVar2.C(2043835552);
                    p0.c(0, aVar4, a2.b(x2.f(h4.r.S, 1.0f), a2.a(mVar2), true), mVar2);
                    mVar2.f();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(e23.a aVar, e23.a aVar2, a0 a0Var, l22.a aVar3, v21.e eVar, p pVar, e23.l lVar, m4.q qVar, m3 m3Var, e23.a aVar4) {
        this.f128139b = aVar;
        this.f128140c = aVar2;
        this.f128141d = a0Var;
        this.f128142e = aVar3;
        this.f128143f = eVar;
        this.f128144g = pVar;
        this.f128145h = lVar;
        this.f128146i = qVar;
        this.f128147j = m3Var;
        this.f128148k = aVar4;
    }
}
