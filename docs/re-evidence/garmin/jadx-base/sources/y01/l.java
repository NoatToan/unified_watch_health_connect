package y01;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.x0;
import f5.z0;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.z2;
import w2.a0;
import w5.f0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
public final class l {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, final List<b11.l> list, final Long l14, final e23.l<? super b11.l, Unit> lVar, p3.m mVar, final int i14, final int i15) {
        h4.r rVar2;
        int i16;
        final h4.r rVar3;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        Object next;
        h4.r rVar4;
        boolean z14;
        boolean z15;
        p1 p1Var;
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-129864692);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        }
        int i18 = i16 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.B(l14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i18 & 1, (i18 & 1171) != 1170)) {
            final h4.r rVar5 = i17 != 0 ? h4.r.S : rVar2;
            x1 x1Var = p3.n.f135158a;
            if (list.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i19 = 0;
                pVar = new e23.p(rVar5, list, l14, lVar, i14, i15, i19) { // from class: y01.i

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f193003a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h4.r f193004b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ List f193005c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ Long f193006d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ e23.l f193007e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f193008f;

                    {
                        this.f193003a = i19;
                        this.f193008f = i15;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f193003a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(1);
                                l.a(this.f193004b, this.f193005c, this.f193006d, this.f193007e, (p3.m) obj, iT, this.f193008f);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(1);
                                l.a(this.f193004b, this.f193005c, this.f193006d, this.f193007e, (p3.m) obj, iT2, this.f193008f);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                boolean z16 = list.size() > 1;
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1 p1Var2 = (p1) objQ;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    long j8 = ((b11.l) next).f14331a;
                    if (l14 != null && j8 == l14.longValue()) {
                        break;
                    }
                }
                b11.l lVar2 = (b11.l) next;
                if (lVar2 == null) {
                    lVar2 = (b11.l) h0.b0(list);
                }
                b11.l lVar3 = lVar2;
                h4.r rVarF = x2.f(rVar5, 1.0f);
                h4.d.f81522a.getClass();
                z0 z0VarD = c2.q.d(h4.d.a.f81529g, false);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarF, o0VarE);
                h5.g.V.getClass();
                e0.a aVar = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, z0VarD, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                h4.r rVar6 = h4.r.S;
                if (z16) {
                    o0VarE.C(-385355037);
                    Object objQ2 = o0VarE.q();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new x91.d(p1Var2, 10);
                        o0VarE.K(objQ2);
                    }
                    h4.r rVarD = u1.w.d(rVar6, false, null, null, (e23.a) objQ2, 15);
                    o0VarE.g0(false);
                    rVar6 = rVarD;
                } else {
                    o0VarE.C(-385353938);
                    o0VarE.g0(false);
                }
                rVar6.getClass();
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97920e;
                bVar2.getClass();
                h4.r rVarZ = c2.l.z(rVar6, f14, eVar2.f97917b);
                h4.g.b bVar3 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22693c, bVar3, o0VarE, 54);
                h4.r rVar7 = rVar5;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarZ, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                x0.f23314a.getClass();
                String strW = gl1.d.W(x0.f23414fe);
                s5.c.b bVarH = l2.h(o0VarE, 410317208, 0, 1, null);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                s5.x0 x0Var = j92.f.f97932i;
                int iJ = bVarH.j(d92.c.f(x0Var, o0VarE).f157322a);
                try {
                    bVarH.b(strW);
                    Unit unit = Unit.INSTANCE;
                    bVarH.f(iJ);
                    bVarH.b(StringUtils.SPACE);
                    o0VarE.C(410324041);
                    fVar2.getClass();
                    s5.x0 x0VarB = d92.c.b(x0Var, o0VarE);
                    f0.f182097b.getClass();
                    int iJ2 = bVarH.j(s5.x0.a(x0VarB, 0L, 0L, f0.f182105j, null, 0L, null, null, 0, 0L, null, null, 16777211).f157322a);
                    try {
                        bVarH.b(lVar3.a(a0.s(o0VarE)));
                        bVarH.f(iJ2);
                        o0VarE.g0(false);
                        s5.c cVarK = bVarH.k();
                        o0VarE.g0(false);
                        fVar2.getClass();
                        d6.p.f57793b.getClass();
                        int i24 = d6.p.f57795d;
                        d6.h.f57752b.getClass();
                        mh.d(cVarK, u2Var.a(rVar6, 1.0f, false), 0L, 0L, 0L, d6.h.a(d6.h.f57758h), 0L, i24, false, 1, 0, null, null, x0Var, o0VarE, 0, 24960, 240636);
                        o0VarE = o0VarE;
                        if (z16) {
                            o0VarE.C(-164359034);
                            s62.a.f157643a.getClass();
                            u4.d dVarA = z2.a(t62.b.f162798a);
                            long jB = d92.b.a(o0VarE).f().b();
                            bVar2.getClass();
                            rVar4 = rVar6;
                            h4.r rVarC3 = c2.l.C(rVar4, eVar2.f97917b, 0.0f, 0.0f, 0.0f, 14);
                            bVar2.getClass();
                            i7.b(dVarA, null, x2.q(rVarC3, j92.b.f97901d.f97904c), jB, o0VarE, 48, 0);
                            z14 = false;
                            o0VarE.g0(false);
                        } else {
                            rVar4 = rVar6;
                            z14 = false;
                            o0VarE.C(-164012640);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(true);
                        if (z16) {
                            o0VarE.C(940507092);
                            h4.r rVarC4 = uVar.c(rVar4, h4.d.a.f81532j);
                            z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, z14);
                            int iHashCode3 = Long.hashCode(o0VarE.U);
                            i2 i2VarA2 = o0VarE.a0();
                            h4.r rVarC5 = h4.k.c(rVarC4, o0VarE);
                            if (cVar == null) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                o0VarE.M(aVar);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(eVar, z0VarD2, o0VarE);
                            b4.c(c1623g, i2VarA2, o0VarE);
                            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                            }
                            b4.c(fVar, rVarC5, o0VarE);
                            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                            Object objQ3 = o0VarE.q();
                            if (objQ3 == p3.m.a.f135155b) {
                                p1Var = p1Var2;
                                objQ3 = new x91.d(p1Var, 11);
                                o0VarE.K(objQ3);
                            } else {
                                p1Var = p1Var2;
                            }
                            z15 = true;
                            i3.u.a(zBooleanValue, (e23.a) objQ3, u1.n.e(rVar4, v.h.t(o0VarE), m1.f128891a), 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-1013646720, new vd0.f0((Object) list, (e23.l) lVar, p1Var, (Object) lVar3, 7), o0VarE), o0VarE, 48, 48, 2040);
                            o0VarE.g0(true);
                            o0VarE.g0(false);
                        } else {
                            boolean z17 = z14;
                            z15 = true;
                            o0VarE.C(942605916);
                            o0VarE.g0(z17);
                        }
                        o0VarE.g0(z15);
                        rVar3 = rVar7;
                    } catch (Throwable th3) {
                        bVarH.f(iJ2);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    bVarH.f(iJ);
                    throw th4;
                }
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        rVar3 = rVar2;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i25 = 1;
            pVar = new e23.p(rVar3, list, l14, lVar, i14, i15, i25) { // from class: y01.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f193003a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h4.r f193004b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f193005c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Long f193006d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ e23.l f193007e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f193008f;

                {
                    this.f193003a = i25;
                    this.f193008f = i15;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f193003a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            l.a(this.f193004b, this.f193005c, this.f193006d, this.f193007e, (p3.m) obj, iT, this.f193008f);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            l.a(this.f193004b, this.f193005c, this.f193006d, this.f193007e, (p3.m) obj, iT2, this.f193008f);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
