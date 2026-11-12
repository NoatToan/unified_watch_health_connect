package u70;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import l72.c1;
import lc.u0;
import nw0.l;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import tr2.o;
import ty1.f1;
import u1.q;
import u1.w;
import u1.y0;
import v62.e1;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f169422a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.INTERACTIVE_DUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.STATIC_SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.STATIC_DUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f169422a = iArr;
        }
    }

    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -2025843260);
        int i15 = i14 | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1.f110940a.a(false, y.Q(o0VarP, R.string.lbl_update_home_screen_confirmation), y.Q(o0VarP, R.string.msg_update_home_screen_confirmation), null, null, y.Q(o0VarP, R.string.lbl_update), false, false, aVar2, y.Q(o0VarP, R.string.lbl_cancel), aVar, o0VarP, ((i15 << 21) & 234881024) | 6, 6, 216);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(aVar, aVar2, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    public static final void b(final b.a aVar, u70.a aVar2, final e23.l<? super u70.a, Unit> lVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1559878804);
        int i15 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.k(aVar2 == null ? -1 : aVar2.ordinal()) ? 32 : 16);
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar3 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = c2.l.A(aVar3, eVar.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            bVar.getClass();
            r rVarC2 = c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            u70.a aVar5 = aVar.f169398h;
            boolean z14 = aVar2 == aVar5;
            int i18 = i15 & 14;
            boolean z15 = i18 == 4;
            Object objQ = o0VarE.q();
            m.a aVar6 = m.f135153a;
            if (z15) {
                objQ = new e23.l() { // from class: u70.d
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        a aVar7 = (a) obj;
                        switch (i16) {
                            case 0:
                                aVar7.getClass();
                                lVar.invoke(aVar.f169398h);
                                break;
                            default:
                                aVar7.getClass();
                                lVar.invoke(aVar.f169399i);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e23.l() { // from class: u70.d
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            a aVar7 = (a) obj;
                            switch (i16) {
                                case 0:
                                    aVar7.getClass();
                                    lVar.invoke(aVar.f169398h);
                                    break;
                                default:
                                    aVar7.getClass();
                                    lVar.invoke(aVar.f169399i);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            d(rVarC2, aVar5, z14, (e23.l) objQ, o0VarE, 0);
            bVar.getClass();
            r rVarC3 = c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            u70.a aVar7 = aVar.f169399i;
            boolean z16 = aVar2 == aVar7;
            i16 = i18 == 4 ? 1 : 0;
            Object objQ2 = o0VarE.q();
            if (i16 == 0) {
                aVar6.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new e23.l() { // from class: u70.d
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            a aVar8 = (a) obj;
                            switch (i17) {
                                case 0:
                                    aVar8.getClass();
                                    lVar.invoke(aVar.f169398h);
                                    break;
                                default:
                                    aVar8.getClass();
                                    lVar.invoke(aVar.f169399i);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new e23.l() { // from class: u70.d
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        a aVar8 = (a) obj;
                        switch (i17) {
                            case 0:
                                aVar8.getClass();
                                lVar.invoke(aVar.f169398h);
                                break;
                            default:
                                aVar8.getClass();
                                lVar.invoke(aVar.f169399i);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            }
            d(rVarC3, aVar7, z16, (e23.l) objQ2, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h(aVar, aVar2, lVar, i14, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(i iVar, h hVar, e23.a aVar, e23.a aVar2, e23.l lVar, m mVar, int i14) {
        o0 o0Var;
        Object aVar3;
        iVar.getClass();
        hVar.getClass();
        o0 o0VarE = mVar.E(1512570140);
        int i15 = i14 | (o0VarE.r(iVar) ? 4 : 2) | (o0VarE.k(hVar.ordinal()) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = p0.c(iVar.f169433e, o0VarE, 0);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            boolean z14 = (i15 & 112) == 32;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                int i16 = a.f169422a[hVar.ordinal()];
                if (i16 == 1) {
                    aVar3 = new b.a(null, null, 3, null);
                } else if (i16 == 2) {
                    aVar3 = new b.c(null, 1, null);
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return;
                    }
                    aVar3 = new b.C3169b(null, null, 3, null);
                }
                objQ3 = aVar3;
                o0VarE.K(objQ3);
            }
            b bVar = (b) objQ3;
            boolean zR = o0VarE.r(iVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new f1(iVar, 7);
                o0VarE.K(objQ4);
            }
            e23.a aVar4 = (e23.a) objQ4;
            boolean z15 = ((bVar instanceof b.a) && ((u70.a) p1Var.getF182175a()) == null) ? false : true;
            Unit unit = Unit.INSTANCE;
            boolean zR2 = o0VarE.r(iVar) | ((i15 & 7168) == 2048);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new e(iVar, aVar2, null);
                o0VarE.K(objQ5);
            }
            l0.e((p) objQ5, unit, o0VarE);
            z3.e eVarC = z3.f.c(1824496225, new c(bVar, aVar, 0), o0VarE);
            z3.e eVarC2 = z3.f.c(-407440027, new e11.n(aVar4, bVar, aVar, z15, p1VarC, lVar, p1Var2, p1Var), o0VarE);
            o0Var = o0VarE;
            z02.d.a(false, eVarC, null, null, null, eVarC2, o0Var, 196656, 29);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg2.g(iVar, hVar, aVar, aVar2, lVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    public static final void d(r rVar, u70.a aVar, boolean z14, e23.l lVar, m mVar, int i14) {
        float f14;
        long jA;
        boolean z15;
        o0 o0VarE = mVar.E(990805235);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.k(aVar.ordinal()) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar = j92.b.f97900c;
            r rVarB = l4.k.b(rVarF, k2.i.a(dVar.f97911c));
            if (z14) {
                bVar.getClass();
                f14 = dVar.f97909a;
            } else {
                f14 = 0;
                g6.f.a aVar2 = g6.f.f75994b;
            }
            if (z14) {
                o0VarE.C(-1318894885);
                jA = d92.b.a(o0VarE).j().e();
            } else {
                o0VarE.C(-1318893705);
                jA = d92.b.a(o0VarE).c().a();
            }
            o0VarE.g0(false);
            long j8 = jA;
            bVar.getClass();
            r rVarB2 = q.b(f14, j8, rVarB, k2.i.a(dVar.f97911c));
            boolean z16 = ((i15 & 112) == 32) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new tb0.d(23, lVar, aVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new tb0.d(23, lVar, aVar);
                    o0VarE.K(objQ);
                }
            }
            r rVarE = u1.n.e(w.d(rVarB2, false, null, null, (e23.a) objQ, 15), v.h.t(o0VarE), m1.f128891a);
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = c2.l.y(rVarE, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            String strJ = null;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar4 = r.S;
            r rVarB3 = b0Var.b(x2.f(aVar4, 1.0f), h4.d.a.f81537o);
            bVar.getClass();
            r rVarC2 = c2.l.C(rVarB3, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u uVar = u.f22885a;
            int i16 = aVar.f169389d;
            String str = aVar.f169390e;
            t4.d dVarA = n5.c.a(i16, o0VarE, 0);
            f5.k.f68985a.getClass();
            f5.k.a.e eVar3 = f5.k.a.f68988c;
            g6.f.a aVar5 = g6.f.f75994b;
            y0.a(dVarA, null, uVar.c(x2.r(aVar4, 88, (float) 181.5d), h4.d.a.f81528f), null, eVar3, 0.0f, null, o0VarE, 24624, 104);
            if (z14) {
                o0VarE.C(-217559497);
                s62.a.f157643a.getClass();
                u4.d dVarA2 = e1.a(t62.b.f162798a);
                String strQ = y.Q(o0VarE, R.string.selected);
                long jA2 = d92.b.a(o0VarE).j().a();
                bVar.getClass();
                i7.b(dVarA2, strQ, uVar.c(x2.q(aVar4, j92.b.f97901d.f97904c), h4.d.a.f81526d), jA2, o0VarE, 0, 0);
                z15 = false;
                o0VarE.g0(false);
            } else {
                z15 = false;
                o0VarE.C(-217211181);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            bVar.getClass();
            float f15 = eVar.f97917b;
            bVar.getClass();
            r rVarC4 = c2.l.C(aVar4, 0.0f, f15, 0.0f, eVar.f97916a, 5);
            boolean z17 = z15;
            String strG = g(aVar, o0VarE);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(strG, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 0, 0, 131068);
            int i17 = aVar.f169388c;
            if (str != null) {
                o0VarE.C(187281804);
                strJ = gl1.d.W(str);
                o0VarE.g0(z17);
            } else if (i17 != 0) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 187372696, i17, o0VarE, z17);
            } else {
                o0VarE.C(187417708);
                o0VarE.g0(z17);
            }
            if (strJ == null) {
                strJ = "";
            }
            fVar2.getClass();
            mh.c(strJ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(rVar, aVar, z14, lVar, i14, 13);
        }
    }

    public static final void e(b.C3169b c3169b, m mVar, int i14) {
        o0 o0VarE = mVar.E(396909814);
        int i15 = (o0VarE.B(c3169b) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarF = x2.f(x2.h(aVar, 375), 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = c2.l.A(rVarF, 0.0f, eVar.f97923h, 1);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            s2 s2VarA = q2.a(iVarI, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            c2.l.f(u2Var.a(aVar, 0.1f, true), o0VarE);
            r rVarA2 = u2Var.a(x2.c(aVar, 1.0f), 0.4f, true);
            u70.a aVar4 = c3169b.f169400h;
            u70.a aVar5 = c3169b.f169401i;
            t4.d dVarA = n5.c.a(aVar4.f169389d, o0VarE, 0);
            String strG = g(c3169b.f169400h, o0VarE);
            f5.k.f68985a.getClass();
            f5.k.a.e eVar2 = f5.k.a.f68988c;
            y0.a(dVarA, strG, rVarA2, null, eVar2, 0.0f, null, o0VarE, 24576, 104);
            s62.a.f157643a.getClass();
            i7.b(v62.p.a(t62.b.f162798a), null, u2Var.c(aVar, bVar2), 0L, o0VarE, 48, 8);
            o0VarE = o0VarE;
            y0.a(n5.c.a(aVar5.f169389d, o0VarE, 0), g(aVar5, o0VarE), u2Var.a(x2.c(aVar, 1.0f), 0.4f, true), null, eVar2, 0.0f, null, o0VarE, 24576, 104);
            c2.l.f(u2Var.a(aVar, 0.1f, true), o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(c3169b, i14, 2);
        }
    }

    public static final void f(b.c cVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-591556938);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97923h, 1);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar, o0VarE, 48);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            t4.d dVarA = n5.c.a(cVar.f169402h.f169389d, o0VarE, 0);
            String strG = g(cVar.f169402h, o0VarE);
            f5.k.f68985a.getClass();
            y0.a(dVarA, strG, null, null, f5.k.a.f68988c, 0.0f, null, o0VarE, 24576, 108);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(cVar, i14, 3);
        }
    }

    public static final String g(u70.a aVar, m mVar) {
        x1 x1Var = n.f135158a;
        if (aVar.f169387b != null) {
            mVar.C(978688993);
            String strW = gl1.d.W(aVar.f169387b);
            mVar.f();
            return strW;
        }
        mVar.C(978744297);
        String strQ = y.Q(mVar, aVar.f169386a);
        mVar.f();
        return strQ;
    }
}
