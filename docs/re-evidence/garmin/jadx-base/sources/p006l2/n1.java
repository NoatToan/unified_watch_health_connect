package p006l2;

import c2.j;
import c2.l;
import c2.t;
import c2.x2;
import c2.y;
import c2.z;
import d92.b;
import e23.q;
import g6.c;
import g6.f;
import g6.o;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import kotlin.t1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p3.x3;
import s5.i0;
import s5.x0;
import s5.y0;
import v.h;
import w5.b0;
import w5.c0;
import w5.f0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108670a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f108671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f108672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f108673d;

    public /* synthetic */ n1(int i14, int i15, x0 x0Var) {
        this.f108671b = i14;
        this.f108672c = i15;
        this.f108673d = x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x025e  */
    /* JADX WARN: Code duplicated, block: B:59:0x027e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0286  */
    /* JADX WARN: Code duplicated, block: B:64:0x0291  */
    /* JADX WARN: Code duplicated, block: B:65:0x0294  */
    /* JADX WARN: Code duplicated, block: B:68:0x029e  */
    /* JADX WARN: Code duplicated, block: B:69:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x032b  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f0 f0Var;
        b0 b0Var;
        int i14;
        c0 c0Var;
        int i15;
        Object objValueOf;
        float fC1;
        float fC2;
        m mVar;
        x0 x0VarA;
        int i16 = this.f108670a;
        int i17 = this.f108672c;
        int i18 = this.f108671b;
        Object obj4 = this.f108673d;
        switch (i16) {
            case 0:
                x0 x0Var = (x0) obj4;
                m mVar2 = (m) obj2;
                ((Integer) obj3).getClass();
                mVar2.C(408240218);
                x1 x1Var = n.f135158a;
                o1.a(i18, i17);
                if (i18 == 1 && i17 == Integer.MAX_VALUE) {
                    r.a aVar = r.S;
                    mVar2.f();
                    return aVar;
                }
                c cVar = (c) mVar2.A(t1.f91490h);
                w5.q.b bVar = (w5.q.b) mVar2.A(t1.f91493k);
                o oVar = (o) mVar2.A(t1.f91496n);
                boolean zB = mVar2.B(x0Var) | mVar2.k(oVar.ordinal());
                Object objQ = mVar2.q();
                m.a aVar2 = m.f135153a;
                if (zB) {
                    objQ = y0.a(x0Var, oVar);
                    mVar2.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = y0.a(x0Var, oVar);
                        mVar2.K(objQ);
                    }
                }
                x0 x0Var2 = (x0) objQ;
                boolean zB2 = mVar2.B(bVar) | mVar2.B(x0Var2);
                Object objQ2 = mVar2.q();
                if (zB2) {
                    i0 i0Var = x0Var2.f157322a;
                    w5.q qVar = i0Var.fontFamily;
                    f0Var = i0Var.fontWeight;
                    if (f0Var == null) {
                        f0.f182097b.getClass();
                        f0Var = f0.f182102g;
                    }
                    b0Var = i0Var.fontStyle;
                    if (b0Var != null) {
                        i14 = b0Var.f182072a;
                    } else {
                        b0.f182070b.getClass();
                        i14 = 0;
                    }
                    c0Var = i0Var.fontSynthesis;
                    if (c0Var != null) {
                        i15 = c0Var.f182079a;
                    } else {
                        c0.f182075b.getClass();
                        i15 = c0.f182078e;
                    }
                    objQ2 = bVar.a(qVar, f0Var, i14, i15);
                    mVar2.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        i0 i0Var2 = x0Var2.f157322a;
                        w5.q qVar2 = i0Var2.fontFamily;
                        f0Var = i0Var2.fontWeight;
                        if (f0Var == null) {
                            f0.f182097b.getClass();
                            f0Var = f0.f182102g;
                        }
                        b0Var = i0Var2.fontStyle;
                        if (b0Var != null) {
                            i14 = b0Var.f182072a;
                        } else {
                            b0.f182070b.getClass();
                            i14 = 0;
                        }
                        c0Var = i0Var2.fontSynthesis;
                        if (c0Var != null) {
                            i15 = c0Var.f182079a;
                        } else {
                            c0.f182075b.getClass();
                            i15 = c0.f182078e;
                        }
                        objQ2 = bVar.a(qVar2, f0Var, i14, i15);
                        mVar2.K(objQ2);
                    }
                }
                x3 x3Var = (x3) objQ2;
                boolean zB3 = mVar2.B(x3Var.getF182175a()) | mVar2.B(cVar) | mVar2.B(bVar) | mVar2.B(x0Var) | mVar2.k(oVar.ordinal());
                Object objQ3 = mVar2.q();
                if (zB3) {
                    objValueOf = Integer.valueOf((int) (u2.a(x0Var2, cVar, bVar, u2.f108806a, 1) & 4294967295L));
                    mVar2.K(objValueOf);
                } else {
                    aVar2.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objValueOf = Integer.valueOf((int) (u2.a(x0Var2, cVar, bVar, u2.f108806a, 1) & 4294967295L));
                        mVar2.K(objValueOf);
                    } else {
                        objValueOf = objQ3;
                    }
                }
                int iIntValue = ((Number) objValueOf).intValue();
                boolean zB4 = mVar2.B(x3Var.getF182175a()) | mVar2.B(cVar) | mVar2.B(bVar) | mVar2.B(x0Var) | mVar2.k(oVar.ordinal());
                Object objQ4 = mVar2.q();
                if (zB4) {
                    StringBuilder sb3 = new StringBuilder();
                    String str = u2.f108806a;
                    sb3.append(str);
                    sb3.append('\n');
                    sb3.append(str);
                    objQ4 = Integer.valueOf((int) (u2.a(x0Var2, cVar, bVar, sb3.toString(), 2) & 4294967295L));
                    mVar2.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == m.a.f135155b) {
                        StringBuilder sb4 = new StringBuilder();
                        String str2 = u2.f108806a;
                        sb4.append(str2);
                        sb4.append('\n');
                        sb4.append(str2);
                        objQ4 = Integer.valueOf((int) (u2.a(x0Var2, cVar, bVar, sb4.toString(), 2) & 4294967295L));
                        mVar2.K(objQ4);
                    }
                }
                int iIntValue2 = ((Number) objQ4).intValue() - iIntValue;
                Integer numValueOf = i18 == 1 ? null : Integer.valueOf(((i18 - 1) * iIntValue2) + iIntValue);
                Integer numValueOf2 = i17 == 2147483647 ? null : Integer.valueOf(((i17 - 1) * iIntValue2) + iIntValue);
                r.a aVar3 = r.S;
                if (numValueOf != null) {
                    fC1 = cVar.c1(numValueOf.intValue());
                } else {
                    f.f75994b.getClass();
                    fC1 = f.f75996d;
                }
                if (numValueOf2 != null) {
                    fC2 = cVar.c1(numValueOf2.intValue());
                } else {
                    f.f75994b.getClass();
                    fC2 = f.f75996d;
                }
                r rVarI = x2.i(aVar3, fC1, fC2);
                mVar2.f();
                return rVarI;
            default:
                String str3 = (String) obj4;
                t tVar = (t) obj;
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(tVar) ? 4 : 2;
                }
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar4 = r.S;
                    d.f81522a.getClass();
                    r rVarC = tVar.c(aVar4, d.a.f81528f);
                    j.f22691a.getClass();
                    z zVarA = y.a(j.f22694d, d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    r rVarC2 = k.c(rVarC, mVar3);
                    g.V.getClass();
                    e0.a aVar5 = g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar5);
                    } else {
                        mVar3.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar3);
                    b4.c(g.a.f81809f, i2VarX, mVar3);
                    g.a.b bVar2 = g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar3, iHashCode, bVar2);
                    }
                    b4.c(g.a.f81807d, rVarC2, mVar3);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    if (str3 != null) {
                        mVar3.C(-810590600);
                        b.f58623a.getClass();
                        b.f58624b.getClass();
                        mh.c(str3, b0Var2.b(aVar4, d.a.f81537o), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, mVar3), mVar3, 0, 0, 131068);
                        mVar = mVar3;
                        mVar.f();
                    } else {
                        mVar = mVar3;
                        mVar.C(-810309058);
                        mVar.f();
                    }
                    if (i18 > 0) {
                        mVar.C(-810220336);
                        float f75992b = ((c) mVar.A(t1.f91490h)).getF75992b();
                        String strQ = gl1.y.Q(mVar, i17);
                        if (f75992b > 1.0f) {
                            mVar.C(-809995617);
                            b.f58623a.getClass();
                            b.f58624b.getClass();
                            x0VarA = x0.a(d92.c.f(j92.f.f97932i, mVar), 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(11), null, null, 16646143);
                            mVar.f();
                        } else {
                            mVar.C(-809768449);
                            b.f58623a.getClass();
                            b.f58624b.getClass();
                            x0VarA = x0.a(d92.c.f(j92.f.f97932i, mVar), 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(14), null, null, 16646143);
                            mVar.f();
                        }
                        x0 x0Var3 = x0VarA;
                        d6.h.f57752b.getClass();
                        int i19 = d6.h.f57755e;
                        f.a aVar6 = f.f75994b;
                        mh.c(strQ, l.C(x2.f(b0Var2.b(aVar4, d.a.f81537o), 0.8f), 0.0f, 2, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, true, 2, 0, null, x0Var3, mVar, 0, 27648, 105468);
                        mVar.f();
                    } else {
                        mVar.C(-809069058);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n1(String str, int i14, int i15) {
        this.f108673d = str;
        this.f108671b = i14;
        this.f108672c = i15;
    }
}
