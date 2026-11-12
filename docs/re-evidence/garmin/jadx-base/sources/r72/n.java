package r72;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import h4.r;
import h5.e0;
import i3.mh;
import l72.f0;
import l72.r1;
import l72.y0;
import li0.w;
import o4.m1;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class n {
    public static final void a(i iVar, m mVar, p3.m mVar2, int i14) {
        o0 o0VarE = mVar2.E(15703648);
        int i15 = (o0VarE.B(iVar) ? 4 : 2) | i14 | (o0VarE.r(mVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r1.b("Data Bricks", z3.f.c(1093478651, new k(iVar, mVar), o0VarE), o0VarE, 54, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(iVar, mVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x013d  */
    /* JADX WARN: Code duplicated, block: B:54:0x01da  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(int i14, final m mVar, p3.m mVar2, int i15) {
        final m mVar3;
        final int i16;
        boolean z14;
        final int i17 = i14;
        o0 o0VarE = mVar2.E(1714559775);
        int i18 = i15 | (o0VarE.k(i17) ? 4 : 2) | (o0VarE.r(mVar) ? 32 : 16);
        if (o0VarE.n(i18 & 1, (i18 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.g.b bVar2 = h4.d.a.f81534l;
            r rVarC2 = u2Var.c(aVar, bVar2);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97932i;
            mh.c("Pages loaded offscreen: ", rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 6, 0, 131068);
            f0 f0Var = f0.f110999a;
            int i19 = i18 & 112;
            int i24 = i18 & 14;
            boolean z15 = (i24 == 4) | (i19 == 32);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z15) {
                i16 = 0;
                objQ = new e23.a() { // from class: r72.j
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                int i25 = i17;
                                mVar.invoke(Integer.valueOf(i25 > 0 ? i25 - 1 : 0));
                                break;
                            default:
                                mVar.invoke(Integer.valueOf(i17 + 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i16 = 0;
                    objQ = new e23.a() { // from class: r72.j
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    int i25 = i17;
                                    mVar.invoke(Integer.valueOf(i25 > 0 ? i25 - 1 : 0));
                                    break;
                                default:
                                    mVar.invoke(Integer.valueOf(i17 + 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                } else {
                    i16 = 0;
                }
            }
            f0Var.k("-", null, false, (e23.a) objQ, o0VarE, 6, 6);
            String strValueOf = String.valueOf(i17);
            r rVarC3 = u2Var.c(aVar, bVar2);
            float f14 = 8;
            g6.f.a aVar4 = g6.f.f75994b;
            r rVarC4 = c2.l.C(rVarC3, f14, 0.0f, f14, 0.0f, 10);
            fVar.getClass();
            int i25 = i16;
            mh.c(strValueOf, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            int i26 = i19 == 32 ? 1 : i25;
            if (i24 == 4) {
                i25 = 1;
            }
            int i27 = i26 | i25;
            Object objQ2 = o0VarE.q();
            if (i27 == 0) {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    z14 = true;
                    i17 = i14;
                    mVar3 = mVar;
                    final char c14 = 1 == true ? 1 : 0;
                    objQ2 = new e23.a() { // from class: r72.j
                        @Override // e23.a
                        public final Object invoke() {
                            switch (c14) {
                                case 0:
                                    int i28 = i17;
                                    mVar3.invoke(Integer.valueOf(i28 > 0 ? i28 - 1 : 0));
                                    break;
                                default:
                                    mVar3.invoke(Integer.valueOf(i17 + 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                } else {
                    z14 = true;
                    i17 = i14;
                    mVar3 = mVar;
                }
            } else {
                z14 = true;
                i17 = i14;
                mVar3 = mVar;
                final int c15 = 1 == true ? 1 : 0;
                objQ2 = new e23.a() { // from class: r72.j
                    @Override // e23.a
                    public final Object invoke() {
                        switch (c15) {
                            case 0:
                                int i28 = i17;
                                mVar3.invoke(Integer.valueOf(i28 > 0 ? i28 - 1 : 0));
                                break;
                            default:
                                mVar3.invoke(Integer.valueOf(i17 + 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            }
            f0Var.k(Marker.ANY_NON_NULL_MARKER, null, false, (e23.a) objQ2, o0VarE, 6, 6);
            o0VarE.g0(z14);
        } else {
            mVar3 = mVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(i17, i15, mVar3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(i iVar, e23.l<? super i, Unit> lVar, p3.m mVar, int i14) {
        iVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-2055854561);
        int i15 = (o0VarE.B(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r0 r0Var = new r0();
            r0Var.f105810a = iVar;
            e2.c.b(u1.n.e(r.S, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a), null, null, null, null, null, false, null, new p90.h(iVar, 24, r0Var, lVar), o0VarE, 0, 510);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q72.f(iVar, lVar, i14, 25);
        }
    }

    public static final void d(boolean z14, m mVar, p3.m mVar2, int i14) {
        o0 o0VarE = mVar2.E(-428286035);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(mVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n(z14, o0VarE);
            }
            p1 p1Var = (p1) objQ;
            l72.p2 p2Var = l72.p2.f111205a;
            z3.e eVarC = z3.f.c(-943395720, new w(p1Var, 27), o0VarE);
            boolean z15 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z15 || objQ2 == c2565a) {
                objQ2 = new qn0.f(25, mVar, p1Var);
                o0VarE.K(objQ2);
            }
            p2Var.g("Show Banner", null, null, null, eVarC, false, false, (e23.a) objQ2, o0VarE, 24582, 238);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ap2.f(z14, mVar, i14, 16);
        }
    }

    public static final void e(boolean z14, m mVar, p3.m mVar2, int i14) {
        o0 o0VarE = mVar2.E(2023879010);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(mVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n(z14, o0VarE);
            }
            p1 p1Var = (p1) objQ;
            l72.p2 p2Var = l72.p2.f111205a;
            z3.e eVarC = z3.f.c(344694583, new w(p1Var, 26), o0VarE);
            boolean z15 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z15 || objQ2 == c2565a) {
                objQ2 = new qn0.f(24, mVar, p1Var);
                o0VarE.K(objQ2);
            }
            p2Var.g("Show Empty State", null, null, null, eVarC, false, false, (e23.a) objQ2, o0VarE, 24582, 238);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ap2.f(z14, mVar, i14, 15);
        }
    }
}
