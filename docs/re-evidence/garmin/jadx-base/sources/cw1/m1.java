package cw1;

import aq.j2;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import i3.e5;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import p3.y1;

/* JADX INFO: loaded from: classes10.dex */
public final class m1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, final boolean z14, final boolean z15, final bg0.a.b bVar, final List list, final e23.l lVar, final jv1.h hVar, final List list2, final double d14, final double d15, final e23.l lVar2, final e23.l lVar3, p3.m mVar, final int i14, final int i15) {
        e23.l lVar4;
        int i16;
        final h4.r rVar2;
        int i17;
        int i18;
        String strJ;
        p3.p1 p1Var;
        p3.p1 p1Var2;
        p3.p1 p1Var3;
        bVar.getClass();
        list.getClass();
        lVar.getClass();
        list2.getClass();
        lVar2.getClass();
        lVar3.getClass();
        p3.o0 o0VarE = mVar.E(-1359540154);
        int i19 = i14 | 6 | (o0VarE.h(z14) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i19 |= o0VarE.h(z15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i19 |= o0VarE.k(bVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i19 |= o0VarE.r(list) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            lVar4 = lVar;
            i19 |= o0VarE.r(lVar4) ? 131072 : 65536;
        } else {
            lVar4 = lVar;
        }
        double d16 = d14;
        int i24 = i19 | (o0VarE.r(hVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(list2) ? 8388608 : 4194304) | (o0VarE.m(d16) ? 67108864 : 33554432) | (o0VarE.m(d15) ? 536870912 : 268435456);
        e23.l lVar5 = lVar2;
        if ((i15 & 6) == 0) {
            i16 = i15 | (o0VarE.r(lVar5) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(lVar3) ? 32 : 16;
        }
        int i25 = i16;
        if (o0VarE.n(i24 & 1, ((i24 & 306783379) == 306783378 && (i25 & 19) == 18) ? false : true)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                jv1.g gVar = hVar instanceof jv1.g ? (jv1.g) hVar : null;
                objQ = p3.p0.n(gVar != null ? gVar.f101054c : null);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var4 = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                jv1.g gVar2 = hVar instanceof jv1.g ? (jv1.g) hVar : null;
                objQ2 = hb.a.n((gVar2 != null ? gVar2.f101054c : null) == vt1.n.OTHER, o0VarE);
            }
            p3.p1 p1Var5 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                jv1.g gVar3 = hVar instanceof jv1.g ? (jv1.g) hVar : null;
                objQ3 = p3.p0.n((gVar3 != null ? gVar3.f101054c : null) == vt1.n.OTHER ? gVar3.f101056e : null);
                o0VarE.K(objQ3);
            }
            final p3.p1 p1Var6 = (p3.p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = hb.a.n(hVar instanceof jv1.i, o0VarE);
            }
            p3.p1 p1Var7 = (p3.p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                jv1.i iVar = hVar instanceof jv1.i ? (jv1.i) hVar : null;
                y1 y1Var = new y1(iVar != null ? iVar.f101059c : 3600.0d);
                o0VarE.K(y1Var);
                objQ5 = y1Var;
            }
            p3.l1 l1Var = (p3.l1) objQ5;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(-585005781);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                final vt1.n nVar = (vt1.n) it.next();
                String strQ = gl1.y.Q(o0VarE, nVar.f180171a);
                boolean z16 = nVar == ((vt1.n) p1Var4.getF182175a());
                if (z16) {
                    i17 = 1879048192;
                    i18 = 234881024;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 677955329, R.string.selected, o0VarE, false);
                } else {
                    i17 = 1879048192;
                    i18 = 234881024;
                    o0VarE.C(-458133582);
                    o0VarE.g0(false);
                    strJ = "";
                }
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, e5.g(strQ, ". ", strJ));
                b92.a aVarB = c0235a.b();
                String strQ2 = gl1.y.Q(o0VarE, nVar.f180171a);
                boolean zK = o0VarE.k(nVar.ordinal()) | ((i24 & 7168) == 2048) | ((i24 & 896) == 256) | ((i25 & 112) == 32) | ((i24 & i18) == 67108864) | ((i24 & i17) == 536870912) | ((i25 & 14) == 4);
                Object objQ6 = o0VarE.q();
                if (zK || objQ6 == p3.m.a.f135155b) {
                    final e23.l lVar6 = lVar5;
                    final p3.p1 p1Var8 = p1Var7;
                    final p3.p1 p1Var9 = p1Var5;
                    final p3.p1 p1Var10 = p1Var4;
                    final double d17 = d16;
                    objQ6 = new e23.a() { // from class: cw1.k1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.a
                        public final Object invoke() {
                            gg0.i iVar2;
                            double d18;
                            double d19;
                            jv1.g gVar4;
                            p1Var8.setValue(Boolean.FALSE);
                            p3.p1 p1Var11 = p1Var10;
                            vt1.n nVar2 = nVar;
                            p1Var11.setValue(nVar2);
                            Boolean boolValueOf = Boolean.valueOf(nVar2 == vt1.n.OTHER);
                            p3.p1 p1Var12 = p1Var9;
                            p1Var12.setValue(boolValueOf);
                            boolean zBooleanValue = ((Boolean) p1Var12.getF182175a()).booleanValue();
                            boolean z17 = z15;
                            if (zBooleanValue) {
                                iVar2 = bVar == bg0.a.b.MILE ? gg0.i.MILE : gg0.i.KILOMETER;
                            } else {
                                iVar2 = z17 ? gg0.i.KILOMETER : gg0.i.MILE;
                            }
                            boolean zBooleanValue2 = ((Boolean) p1Var12.getF182175a()).booleanValue();
                            e23.l lVar7 = lVar3;
                            if (zBooleanValue2) {
                                p3.p1 p1Var13 = p1Var6;
                                lVar7.invoke(Boolean.valueOf(m1.b(d17, d15, (Double) p1Var13.getF182175a())));
                                gVar4 = new jv1.g(nVar2, iVar2, (Double) p1Var13.getF182175a());
                            } else {
                                lVar7.invoke(Boolean.TRUE);
                                int i26 = nVar2.f180173c;
                                if (z17) {
                                    d18 = i26;
                                    l3.f23124b.getClass();
                                    d19 = 1000.0d;
                                } else {
                                    d18 = i26;
                                    l3.f23124b.getClass();
                                    d19 = 1609.344d;
                                }
                                gVar4 = new jv1.g(nVar2, iVar2, Double.valueOf(d18 / d19));
                            }
                            lVar6.invoke(gVar4);
                            return Unit.INSTANCE;
                        }
                    };
                    p1Var = p1Var8;
                    p1Var2 = p1Var10;
                    p1Var3 = p1Var9;
                    o0VarE.K(objQ6);
                } else {
                    p1Var = p1Var7;
                    p1Var3 = p1Var5;
                    p1Var2 = p1Var4;
                }
                e23.a aVar3 = (e23.a) objQ6;
                int i26 = b92.a.f16960b;
                r.a(null, strQ2, aVarB, z16, false, aVar3, o0VarE, 0, 17);
                lVar5 = lVar2;
                p1Var4 = p1Var2;
                p1Var6 = p1Var6;
                p1Var7 = p1Var;
                it = it;
                d16 = d14;
                p1Var5 = p1Var3;
            }
            p3.p1 p1Var11 = p1Var7;
            p3.p1 p1Var12 = p1Var5;
            p3.p1 p1Var13 = p1Var4;
            p3.p1 p1Var14 = p1Var6;
            o0VarE.g0(false);
            if (((Boolean) p1Var12.getF182175a()).booleanValue()) {
                o0VarE.C(-953197592);
                h4.r.a aVar4 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC2 = c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                Double d18 = (Double) p1Var14.getF182175a();
                Object objQ7 = o0VarE.q();
                if (objQ7 == p3.m.a.f135155b) {
                    objQ7 = new a11.m(p1Var14, 11);
                    o0VarE.K(objQ7);
                }
                int i27 = 1572912 | (i24 & 7168) | (i24 & 57344) | (458752 & i24);
                int i28 = i24 >> 3;
                u.a(rVarC2, true, d18, bVar, list, lVar4, (e23.l) objQ7, d14, d15, lVar2, lVar3, o0VarE, (i28 & 234881024) | i27 | (29360128 & i28) | ((i25 << 27) & 1879048192), (i25 >> 3) & 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-952542190);
                o0VarE.g0(false);
            }
            if (z14) {
                o0VarE.C(-952445253);
                h4.r.a aVar5 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC3 = c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                boolean zBooleanValue = ((Boolean) p1Var11.getF182175a()).booleanValue();
                double doubleValue = l1Var.getDoubleValue();
                Object objQ8 = o0VarE.q();
                p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                if (objQ8 == c2565a2) {
                    objQ8 = new j2(l1Var, 2);
                    o0VarE.K(objQ8);
                }
                e23.l lVar7 = (e23.l) objQ8;
                boolean z17 = ((i25 & 112) == 32) | ((i25 & 14) == 4);
                Object objQ9 = o0VarE.q();
                if (z17 || objQ9 == c2565a2) {
                    objQ9 = new ck0.j(lVar3, lVar2, p1Var11, p1Var12, p1Var13, l1Var, 2);
                    o0VarE.K(objQ9);
                }
                b1.a(rVarC3, zBooleanValue, doubleValue, lVar7, lVar2, (e23.a) objQ9, o0VarE, ((i25 << 12) & 57344) | 3072);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-951767438);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: cw1.l1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    m1.a(rVar2, z14, z15, bVar, list, lVar, hVar, list2, d14, d15, lVar2, lVar3, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final boolean b(double d14, double d15, Double d16) {
        if (d16 == null) {
            return false;
        }
        double dDoubleValue = d16.doubleValue();
        og0.a.f131967a.getClass();
        double dA = og0.a.A(dDoubleValue, 2);
        if (d14 == 0.0d) {
            return dA > d14 && dA <= d15;
        }
        return d14 <= dA && dA <= d15;
    }
}
