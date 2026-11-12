package ea0;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c2.b0;
import c2.j;
import c2.u;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e11.c0;
import e23.l;
import e23.p;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import kotlin.t1;
import kotlin.t3;
import l4.k;
import l72.c1;
import lc.u0;
import o4.m1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
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
import u1.q;
import u1.w;
import v62.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0160  */
    /* JADX WARN: Code duplicated, block: B:73:0x01da  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(long j8, g gVar, l lVar, m mVar, int i14) {
        final g gVar2;
        int i15;
        String strL;
        String strL2;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1874500214);
        int i16 = i14 | (o0VarE.l(j8) ? 4 : 2) | 16 | (o0VarE.r(lVar) ? 256 : 128);
        final int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            int i18 = i14 & 1;
            m.a aVar = m.f135153a;
            if (i18 == 0 || o0VarE.o0()) {
                boolean z14 = (i16 & 14) == 4;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new a90.b(j8, 2);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a90.b(j8, 2);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(g.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar2);
                o0VarE.g0(false);
                gVar2 = (g) u1VarResolveViewModel;
                i15 = i16 & (-113);
            } else {
                o0VarE.e();
                i15 = i16 & (-113);
                gVar2 = gVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            p1 p1VarB = s9.c.b(gVar2.f63617c, gv.a.SECURE, o0VarE, 48);
            p1 p1VarC = s9.c.c(gVar2.f63620f, o0VarE);
            p1 p1VarC2 = s9.c.c(gVar2.f63618d, o0VarE);
            t3 t3Var = (t3) o0VarE.A(t1.f91501s);
            String strQ = y.Q(o0VarE, R.string.connection_type_learn_more_link);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(gVar2) | ((i15 & 896) == 256);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new c(gVar2, lVar, null);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new c(gVar2, lVar, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((p) objQ2, unit, o0VarE);
            gv.a aVar3 = (gv.a) p1VarB.getF182175a();
            boolean zBooleanValue = ((Boolean) p1VarC.getF182175a()).booleanValue();
            boolean zR2 = o0VarE.r(gVar2);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new d(gVar2);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new d(gVar2);
                    o0VarE.K(objQ3);
                }
            }
            l lVar2 = (l) ((k23.g) objQ3);
            boolean zR3 = o0VarE.r(gVar2);
            Object objQ4 = o0VarE.q();
            if (zR3) {
                objQ4 = new e(gVar2);
                o0VarE.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new e(gVar2);
                    o0VarE.K(objQ4);
                }
            }
            e23.a aVar4 = (e23.a) ((k23.g) objQ4);
            boolean zR4 = o0VarE.r(t3Var) | o0VarE.B(strQ);
            Object objQ5 = o0VarE.q();
            if (zR4) {
                objQ5 = new dl0.g(11, t3Var, strQ);
                o0VarE.K(objQ5);
            } else {
                aVar.getClass();
                if (objQ5 == m.a.f135155b) {
                    objQ5 = new dl0.g(11, t3Var, strQ);
                    o0VarE.K(objQ5);
                }
            }
            b(aVar3, zBooleanValue, lVar2, aVar4, (e23.a) objQ5, o0VarE, 0);
            gv.a aVar5 = (gv.a) p1VarC2.getF182175a();
            if (aVar5 == null) {
                o0VarE.C(-69954206);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-69954205);
                c1 c1Var = c1.f110940a;
                Integer num = aVar5.f79148a;
                if (num == null) {
                    o0VarE.C(515264665);
                    o0VarE.g0(false);
                    strL = null;
                } else {
                    strL = u0.l(o0VarE, 515264666, num, o0VarE, false);
                }
                Integer num2 = aVar5.f79149b;
                if (num2 == null) {
                    o0VarE.C(515358905);
                    o0VarE.g0(false);
                    strL2 = null;
                } else {
                    strL2 = u0.l(o0VarE, 515358906, num2, o0VarE, false);
                }
                String strQ2 = y.Q(o0VarE, R.string.lbl_allow);
                String strQ3 = y.Q(o0VarE, R.string.lbl_cancel);
                boolean zR5 = o0VarE.r(gVar2);
                Object objQ6 = o0VarE.q();
                if (zR5) {
                    objQ6 = new e23.a() { // from class: ea0.b
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    g gVar3 = gVar2;
                                    gv.a aVar6 = (gv.a) gVar3.f63617c.getValue();
                                    gVar3.f63618d.setValue(null);
                                    gVar3.f63619e.k(null, Boolean.TRUE);
                                    ge1.b.T(v1.a(gVar3), null, null, new h(gVar3, aVar6, null), 3);
                                    break;
                                default:
                                    gVar2.f63618d.setValue(null);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == m.a.f135155b) {
                        objQ6 = new e23.a() { // from class: ea0.b
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        g gVar3 = gVar2;
                                        gv.a aVar6 = (gv.a) gVar3.f63617c.getValue();
                                        gVar3.f63618d.setValue(null);
                                        gVar3.f63619e.k(null, Boolean.TRUE);
                                        ge1.b.T(v1.a(gVar3), null, null, new h(gVar3, aVar6, null), 3);
                                        break;
                                    default:
                                        gVar2.f63618d.setValue(null);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ6);
                    }
                }
                e23.a<Unit> aVar6 = (e23.a) objQ6;
                boolean zR6 = o0VarE.r(gVar2);
                Object objQ7 = o0VarE.q();
                if (zR6) {
                    final int i19 = 1;
                    objQ7 = new e23.a() { // from class: ea0.b
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    g gVar3 = gVar2;
                                    gv.a aVar7 = (gv.a) gVar3.f63617c.getValue();
                                    gVar3.f63618d.setValue(null);
                                    gVar3.f63619e.k(null, Boolean.TRUE);
                                    ge1.b.T(v1.a(gVar3), null, null, new h(gVar3, aVar7, null), 3);
                                    break;
                                default:
                                    gVar2.f63618d.setValue(null);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == m.a.f135155b) {
                        final int i110 = 1;
                        objQ7 = new e23.a() { // from class: ea0.b
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i110) {
                                    case 0:
                                        g gVar3 = gVar2;
                                        gv.a aVar7 = (gv.a) gVar3.f63617c.getValue();
                                        gVar3.f63618d.setValue(null);
                                        gVar3.f63619e.k(null, Boolean.TRUE);
                                        ge1.b.T(v1.a(gVar3), null, null, new h(gVar3, aVar7, null), 3);
                                        break;
                                    default:
                                        gVar2.f63618d.setValue(null);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ7);
                    }
                }
                c1Var.a(false, strL, strL2, null, null, strQ2, false, false, aVar6, strQ3, (e23.a) objQ7, o0VarE, 6, 0, 216);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
            gVar2 = gVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.l0(j8, gVar2, lVar, i14, 3);
        }
    }

    public static final void b(gv.a aVar, boolean z14, l<? super gv.a, Unit> lVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        o0 o0Var;
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(2005912273);
        int i15 = i14 | (o0VarE.k(aVar.ordinal()) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.connection_type_title);
            s62.a.f157643a.getClass();
            int i16 = i15 << 9;
            o0Var = o0VarE;
            da0.p.b("ble_connection_type_setup_screen", strQ, h0.a(t62.b.f162798a), y.Q(o0VarE, R.string.msg_connection_type_description_title), null, y.Q(o0VarE, R.string.lbl_next), aVar2, false, null, null, false, y.Q(o0VarE, R.string.lbl_help_me_choose), aVar3, false, z14, null, null, null, null, null, null, z3.f.c(-1403424815, new c0(2, aVar, lVar), o0VarE), o0Var, (3670016 & i16) | 6, ((i15 >> 6) & 896) | (i16 & 57344), 384, 4171664);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(aVar, z14, lVar, aVar2, aVar3, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x0199  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x0229  */
    public static final void c(String str, String str2, boolean z14, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0Var;
        long jA;
        boolean z15;
        long jA2;
        int i15;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        o0 o0VarE = mVar.E(1642342871);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar = j92.b.f97900c;
            r rVarB = k.b(aVar2, k2.i.a(dVar.f97911c));
            float f14 = 2;
            g6.f.a aVar3 = g6.f.f75994b;
            if (z14) {
                o0VarE.C(2038513055);
                jA = d92.b.a(o0VarE).j().e();
            } else {
                o0VarE.C(2038514235);
                jA = d92.b.a(o0VarE).c().a();
            }
            o0VarE.g0(false);
            long j8 = jA;
            bVar.getClass();
            r rVarB2 = q.b(f14, j8, rVarB, k2.i.a(dVar.f97911c));
            if (z14) {
                o0VarE.C(2038519455);
                jA2 = d92.b.a(o0VarE).c().g();
                z15 = false;
            } else {
                z15 = false;
                o0VarE.C(2038520635);
                jA2 = d92.b.a(o0VarE).c().a();
            }
            o0VarE.g0(z15);
            r rVarE = u1.n.e(rVarB2, jA2, m1.f128891a);
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = c2.l.y(rVarE, eVar.f97920e);
            boolean z16 = (i16 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new e52.c(aVar, 3);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e52.c(aVar, 3);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarY, false, null, null, (e23.a) objQ, 15);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i15 = i16;
            } else {
                i15 = i16;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                u uVar = u.f22885a;
                j.f22691a.getClass();
                zVarA = c2.y.a(j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                bVar.getClass();
                r rVarC3 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                mh.c(str, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, i15 & 14, 0, 131068);
                o0Var = o0VarE;
                fVar2.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0Var), o0VarE, (i15 >> 3) & 14, 0, 131070);
                o0Var.g0(true);
                o0Var.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u uVar2 = u.f22885a;
            j.f22691a.getClass();
            zVarA = c2.y.a(j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            bVar.getClass();
            r rVarC4 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            mh.c(str, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, i15 & 14, 0, 131068);
            o0Var = o0VarE;
            fVar3.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0Var), o0VarE, (i15 >> 3) & 14, 0, 131070);
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(str, str2, z14, aVar, i14, 0);
        }
    }
}
