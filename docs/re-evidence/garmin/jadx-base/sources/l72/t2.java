package l72;

import com.garmin.android.apps.connectmobile.R;
import i3.h7;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class t2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(float f14, int i14, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) {
        e23.a aVar2;
        h4.r rVar2;
        p3.o0 o0Var;
        p3.p1 p1Var;
        Float f15;
        float f16 = f14;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(186692277);
        int i15 = i14 | (o0VarE.i(f16) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean z15 = Math.abs(f16 - 0.0f) < 0.1f;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n((z14 && z15) ? false : true, o0VarE);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(null);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var3 = (p3.p1) objQ2;
            Float fValueOf = Float.valueOf(f16);
            Boolean boolValueOf = Boolean.valueOf(z14);
            Float fValueOf2 = Float.valueOf(0.0f);
            boolean zH = o0VarE.h(z15) | ((i15 & 14) == 4);
            Object objQ3 = o0VarE.q();
            if (zH || objQ3 == c2565a) {
                boolean z16 = z15;
                p1Var = p1Var3;
                f15 = fValueOf2;
                r2 r2Var = new r2(z14, z16, p1Var, 2000L, f16, 0.0f, p1Var2, null);
                f16 = f16;
                o0VarE.K(r2Var);
                objQ3 = r2Var;
            } else {
                p1Var = p1Var3;
                f15 = fValueOf2;
            }
            p3.l0.g(fValueOf, boolValueOf, f15, (e23.p) objQ3, o0VarE);
            Unit unit = Unit.INSTANCE;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new ky0.k(p1Var, 11);
                o0VarE.K(objQ4);
            }
            p3.l0.a(unit, (e23.l) objQ4, o0VarE);
            aVar2 = aVar;
            rVar2 = rVar;
            o0Var = o0VarE;
            r1.c0.e(((Boolean) p1Var2.getF182175a()).booleanValue(), null, r1.u0.d(s1.l.d(300, 0, null, 6), 2), r1.u0.e(s1.l.d(300, 0, null, 6), 2), null, z3.f.c(-562919539, new bn1.d(f16, aVar2, rVar2, 2), o0VarE), o0Var, 200064, 18);
        } else {
            aVar2 = aVar;
            rVar2 = rVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h50.c(f14, i14, aVar2, rVar2, z14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    public static final void b(float f14, e23.a aVar, h4.r rVar, p3.m mVar, int i14) {
        e23.a aVar2;
        int i15;
        int i16;
        p3.o0 o0VarE = mVar.E(-1367487212);
        int i17 = (o0VarE.i(f14) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.i(0.0f) ? 256 : 128) | (o0VarE.B(rVar) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            float f15 = 360;
            float f16 = ((f14 % f15) + f15) % f15;
            if (f16 < 45.0f || f16 >= 315.0f) {
                i15 = -907385548;
                i16 = R.string.gak_lbl_compass_north;
            } else if (f16 < 135.0f) {
                i15 = -907382957;
                i16 = R.string.gak_lbl_compass_east;
            } else if (f16 < 225.0f) {
                i15 = -907380396;
                i16 = R.string.gak_lbl_compass_south;
            } else {
                i15 = -907378381;
                i16 = R.string.gak_lbl_compass_west;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
            String strD = j20.x.d(gl1.y.Q(o0VarE, R.string.gak_reset_map_orientation), gl.b.g(0.0f, o0VarE), ".", gl1.y.Q(o0VarE, R.string.gak_current_direction), gl.b.g(f14, o0VarE));
            g6.f.a aVar3 = g6.f.f75994b;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar = j92.b.f97900c;
            h4.r rVarA = l4.w.a(rVar, 4, k2.i.a(dVar.f97913e), false, 24);
            bVar.getClass();
            h4.r rVarE = u1.n.e(l4.k.b(rVarA, k2.i.a(dVar.f97913e)), ds.e0.f(o0VarE), o4.m1.f128891a);
            boolean zB = o0VarE.B(strD);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new n2(strD, 3);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new n2(strD, 3);
                    o0VarE.K(objQ);
                }
            }
            aVar2 = aVar;
            h7.a(aVar2, p5.v.b(rVarE, (e23.l) objQ), false, null, null, z3.f.c(-538316366, new d70.f(f14, strJ, 3), o0VarE), o0VarE, ((i17 >> 3) & 14) | 1572864, 60);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fx0.g(f14, aVar2, rVar, i14);
        }
    }
}
