package yy1;

import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.mh;
import java.util.List;
import l72.c1;
import l72.r1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import yg2.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class w {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z14, Long l14, bb1.g gVar, Long l15, List<q51.e> list, e23.a<Unit> aVar, e23.l<? super Long, Unit> lVar, e23.p<? super Long, ? super Long, Unit> pVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        Object obj;
        o0 o0Var;
        e23.a<Unit> aVar3;
        int i16;
        boolean z15;
        boolean z16;
        aVar.getClass();
        lVar.getClass();
        pVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1182761151);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(l14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            obj = gVar;
            i15 |= o0VarE.B(obj) ? 256 : 128;
        } else {
            obj = gVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(l15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(list) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(pVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
        }
        int i17 = i15;
        if (o0VarE.n(i17 & 1, (i17 & 38347923) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar4, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (z14) {
                o0VarE.C(1826288065);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(aVar4, j92.b.f97899b.f97920e);
                String strQ = gl1.y.Q(o0VarE, R.string.msg_strategies_header);
                d92.b.f58624b.getClass();
                i16 = 67108864;
                z15 = true;
                mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                i16 = 67108864;
                z15 = true;
                o0Var.C(1826505561);
                o0Var.g0(false);
            }
            if (l14 != null) {
                o0Var.C(1826599739);
                r1.b(gl1.y.Q(o0Var, R.string.power_guide), z3.f.c(-248194564, new ug2.p(obj, pVar, l14, z14, aVar, 15), o0Var), o0Var, 48, 0);
                o0Var.g0(false);
            } else {
                o0Var.C(1828319929);
                o0Var.g0(false);
            }
            if (l15 != null) {
                o0Var.C(1828410139);
                Object objQ = o0Var.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0Var.K(objQ);
                }
                p1 p1Var = (p1) objQ;
                aVar3 = aVar2;
                r1.b(gl1.y.Q(o0Var, R.string.pacepro_title), z3.f.c(-114607653, new f(list, z14, aVar3, lVar, p1Var, 1), o0Var), o0Var, 48, 0);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0Var.C(1829364102);
                    c1 c1Var = c1.f110940a;
                    String strQ2 = gl1.y.Q(o0Var, R.string.pacepro_lbl_create_plan);
                    String strQ3 = gl1.y.Q(o0Var, R.string.create_pacepro_strategy_message);
                    String strQ4 = gl1.y.Q(o0Var, R.string.lbl_common_continue);
                    boolean z17 = (i17 & 234881024) == i16 ? z15 : false;
                    Object objQ2 = o0Var.q();
                    if (z17 || objQ2 == c2565a) {
                        objQ2 = new w52.p1(aVar3, p1Var, 9);
                        o0Var.K(objQ2);
                    }
                    e23.a<Unit> aVar6 = (e23.a) objQ2;
                    String strQ5 = gl1.y.Q(o0Var, R.string.lbl_cancel);
                    Object objQ3 = o0Var.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new l0(p1Var, 16);
                        o0Var.K(objQ3);
                    }
                    o0 o0Var2 = o0Var;
                    c1Var.a(false, strQ2, strQ3, null, null, strQ4, false, false, aVar6, strQ5, (e23.a) objQ3, o0Var2, 0, 6, 217);
                    o0Var = o0Var2;
                    z16 = false;
                    o0Var.g0(false);
                } else {
                    z16 = false;
                    o0Var.C(1829997401);
                    o0Var.g0(false);
                }
                o0Var.g0(z16);
            } else {
                aVar3 = aVar2;
                o0Var.C(1830007321);
                o0Var.g0(false);
            }
            o0Var.g0(z15);
        } else {
            o0Var = o0VarE;
            aVar3 = aVar2;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.v(z14, l14, gVar, l15, list, aVar, lVar, pVar, aVar3, i14);
        }
    }
}
