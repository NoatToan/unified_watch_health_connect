package p21;

import a11.d0;
import b63.v;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h4.r;
import h5.e0;
import i3.fe;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import l72.r1;
import lc.u0;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import q21.p;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    public static final void a(int i14, r rVar, String str, m mVar) {
        o0 o0Var;
        r rVar2;
        o0 o0VarE = mVar.E(940367169);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | 48;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            r.a aVar = r.S;
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97917b;
            bVar.getClass();
            r rVarZ = c2.l.z(rVarF, eVar.f97920e, f14);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57757g;
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, i15 & 14, 0, 130044);
            rVar2 = aVar;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.g(str, rVar2, i14, 4);
        }
    }

    public static final void b(p pVar, fe feVar, v21.e eVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.a aVar, e23.a aVar2, e23.l lVar4, m mVar, int i14) {
        int i15;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        o0 o0Var;
        pVar.getClass();
        feVar.getClass();
        eVar.getClass();
        o0 o0VarE = mVar.E(1972151282);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(feVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            obj = eVar;
            i15 |= o0VarE.r(obj) ? 256 : 128;
        } else {
            obj = eVar;
        }
        if ((i14 & 3072) == 0) {
            obj2 = lVar;
            i15 |= o0VarE.r(obj2) ? 2048 : 1024;
        } else {
            obj2 = lVar;
        }
        if ((i14 & 24576) == 0) {
            obj3 = lVar2;
            i15 |= o0VarE.r(obj3) ? 16384 : 8192;
        } else {
            obj3 = lVar2;
        }
        if ((196608 & i14) == 0) {
            obj4 = lVar3;
            i15 |= o0VarE.r(obj4) ? 131072 : 65536;
        } else {
            obj4 = lVar3;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(lVar4) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = n.f135158a;
            o0Var = o0VarE;
            z02.d.a(pVar.f142269a, z3.f.c(2091547767, new mw1.b(aVar, 26, pVar, aVar2), o0VarE), z3.f.c(2006738296, new b(feVar, 2), o0VarE), null, null, z3.f.c(1752309883, new oy0.b(pVar, obj, obj2, obj3, obj4, lVar4, 3), o0VarE), o0Var, 197040, 24);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(pVar, feVar, eVar, lVar, lVar2, lVar3, aVar, aVar2, lVar4, i14);
        }
    }

    public static final void c(int i14, e23.a aVar, String str, String str2, String str3, m mVar, boolean z14) {
        o0 o0VarE = mVar.E(-1075665276);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.B(str3) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            a.f135000a.getClass();
            z3.e eVar = a.f135001b;
            r.a aVar2 = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar2, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            l72.p2.f111205a.h(str, str2, null, null, null, false, false, null, z14 ? eVar : null, null, aVar, o0VarE, i15 & 126, (i15 >> 12) & 14, 764);
            if (str3 != null) {
                o0VarE.C(1582960657);
                r rVarF = x2.f(aVar2, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97917b;
                bVar2.getClass();
                r rVarZ = c2.l.z(rVarF, eVar2.f97920e, f14);
                d6.h.f57752b.getClass();
                int i16 = d6.h.f57757g;
                d92.b.f58624b.getClass();
                mh.c(str3, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0VarE, (i15 >> 9) & 14, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1583361704);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(str, str2, z14, str3, aVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    public static final void d(List list, v21.e eVar, e23.l lVar, r rVar, m mVar, int i14) {
        r rVar2;
        String strL;
        o0 o0VarE = mVar.E(-1031064087);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            rVar2 = rVar;
            r rVarC = h4.k.c(rVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            r1.b(gl1.y.Q(o0VarE, R.string.meal_windows), null, o0VarE, 0, 2);
            o0VarE.C(1522107886);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o21.f fVar = (o21.f) it.next();
                b11.g.a aVar2 = b11.g.f14285c;
                String str = fVar.f128670b;
                aVar2.getClass();
                String strA = b11.g.a.a(str, o0VarE);
                String strZ = eVar.z(fVar.f128671c, fVar.f128672d);
                o21.a aVar3 = fVar.f128673e;
                boolean z15 = (aVar3 == null || aVar3.f128640a != z14) ? false : z14;
                Integer num = aVar3 != null ? aVar3.f128641b : null;
                if (num == null) {
                    o0VarE.C(1606010442);
                    o0VarE.g0(false);
                    strL = null;
                } else {
                    strL = u0.l(o0VarE, 1606010443, num, o0VarE, false);
                }
                boolean zR = ((i15 & 896) == 256) | o0VarE.r(fVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new oe.j(25, lVar, fVar);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new oe.j(25, lVar, fVar);
                        o0VarE.K(objQ);
                    }
                }
                c(0, (e23.a) objQ, strA, strZ, strL, o0VarE, z15);
                z14 = true;
            }
            o0VarE.g0(false);
            a(0, null, gl1.y.Q(o0VarE, R.string.msg_updating_your_meal_windows_warning), o0VarE);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a((Object) list, (Object) eVar, lVar, (Object) rVar2, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0154  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f6  */
    public static final void e(int i14, e23.l lVar, e23.l lVar2, r rVar, m mVar, s21.e0 e0Var, s21.e0 e0Var2, v21.e eVar, boolean z14) {
        o0 o0Var;
        String strQ;
        String str;
        boolean z15;
        boolean z16;
        String strQ2;
        o0 o0VarE = mVar.E(286764767);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(e0Var) ? 32 : 16) | (o0VarE.r(e0Var2) ? 256 : 128) | (o0VarE.r(eVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            r1.b(gl1.y.Q(o0VarE, R.string.lbl_timeline_segment_title), null, o0VarE, 0, 2);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_start_time);
            v vVar = e0Var.f156100a;
            o21.a aVar2 = e0Var.f156103d;
            String strK = eVar.K(vVar, z14);
            if ((aVar2 != null ? aVar2.f128641b : null) != null) {
                o0VarE.C(1260626759);
                strQ = gl1.y.Q(o0VarE, aVar2.f128641b.intValue());
                o0VarE.g0(false);
                str = null;
            } else {
                o0VarE.C(1260712629);
                o0VarE.g0(false);
                strQ = null;
                str = null;
            }
            v vVar2 = e0Var.f156100a;
            if (aVar2 != null) {
                z16 = true;
                z15 = aVar2.f128640a;
            } else {
                z15 = false;
                z16 = true;
            }
            String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_start_time);
            boolean z17 = (458752 & i15) == 131072 ? z16 : false;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z17) {
                objQ = new na0.l(lVar, 21);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new na0.l(lVar, 21);
                    o0VarE.K(objQ);
                }
            }
            boolean z18 = z16;
            String str2 = str;
            d0.a(false, strQ3, strK, z15, strQ, vVar2, strQ4, null, null, null, null, (e23.l) objQ, null, null, o0VarE, 6, 0, 14208);
            String strQ5 = gl1.y.Q(o0VarE, R.string.pregnancy_end_time);
            v vVar3 = e0Var2.f156100a;
            o21.a aVar4 = e0Var2.f156103d;
            String strK2 = eVar.K(vVar3, z14);
            if ((aVar4 != null ? aVar4.f128641b : str2) != null) {
                o0VarE.C(1261288392);
                strQ2 = gl1.y.Q(o0VarE, aVar4.f128641b.intValue());
                o0VarE.g0(false);
            } else {
                o0VarE.C(1261373301);
                o0VarE.g0(false);
                strQ2 = str2;
            }
            boolean z19 = (aVar4 == null || aVar4.f128640a != z18) ? false : z18;
            String str3 = strQ2;
            v vVar4 = e0Var2.f156100a;
            v vVar5 = e0Var2.f156101b;
            v vVar6 = e0Var2.f156102c;
            String strQ6 = gl1.y.Q(o0VarE, R.string.pregnancy_end_time);
            boolean z24 = (i15 & 3670016) == 1048576;
            Object objQ2 = o0VarE.q();
            if (z24) {
                objQ2 = new na0.l(lVar2, 22);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new na0.l(lVar2, 22);
                    o0VarE.K(objQ2);
                }
            }
            d0.a(false, strQ5, strK2, z19, str3, vVar4, strQ6, vVar5, vVar6, null, null, (e23.l) objQ2, null, null, o0VarE, 6, 0, 13824);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(i14, lVar, lVar2, rVar, e0Var, e0Var2, eVar, z14);
        }
    }
}
