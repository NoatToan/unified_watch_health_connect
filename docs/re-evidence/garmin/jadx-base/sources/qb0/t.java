package qb0;

import a3.a1;
import bd0.b0;
import ca0.u1;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import o4.d0;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.o2;

/* JADX INFO: loaded from: classes8.dex */
public final class t {
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i14, u1 u1Var, e23.a aVar, e23.l lVar, e23.l lVar2, p3.m mVar, b bVar) {
        bVar.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1624661787);
        int i15 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(u1Var) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = o0VarE.B(bVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = bVar.f143958a.f143495c;
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = bVar.f143958a.f143495c;
                    o0VarE.K(objQ);
                }
            }
            l90.b bVar2 = (l90.b) objQ;
            p1 p1VarC = s9.c.c(bVar.f143967j, o0VarE);
            z90.b bVar3 = ((sb0.b) p1VarC.getF182175a()).f158393d;
            boolean zB2 = o0VarE.B(p1VarC) | ((i15 & 112) == 32) | ((i15 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new q(p1VarC, aVar, lVar, null);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new q(p1VarC, aVar, lVar, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((e23.p) objQ2, bVar3, o0VarE);
            String str = bVar2.f111521f;
            o90.a aVar3 = bVar2.f111526k;
            float f14 = ((sb0.b) p1VarC.getF182175a()).f158391b;
            boolean zR = o0VarE.r(bVar) | ((i15 & 896) == 256);
            Object objQ3 = o0VarE.q();
            if (zR) {
                objQ3 = new p40.o0(24, bVar, u1Var);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new p40.o0(24, bVar, u1Var);
                    o0VarE.K(objQ3);
                }
            }
            b("firmware_update_progress_screen", str, aVar3, f14, lVar2, (e23.a) objQ3, o0VarE, (i15 & 57344) | 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(bVar, aVar, u1Var, lVar, lVar2, i14);
        }
    }

    public static final void b(String str, String str2, o90.a aVar, float f14, e23.l<? super Float, Unit> lVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        e23.a<Unit> aVar3;
        o0 o0Var;
        o0 o0VarE = mVar.E(-943637284);
        int i15 = i14 | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(aVar) ? 256 : 128) | (o0VarE.i(f14) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if ((i14 & 196608) == 0) {
            aVar3 = aVar2;
            i15 |= o0VarE.r(aVar3) ? 131072 : 65536;
        } else {
            aVar3 = aVar2;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            o0Var = o0VarE;
            da0.p.c(str, str2, aVar, y.Q(o0VarE, R.string.software_updating_title), false, null, Integer.valueOf(R.drawable.gcm2_cloud_download), d0.a(d92.b.a(o0VarE).f().a()), null, null, false, y.Q(o0VarE, R.string.lbl_continue), aVar3, true, null, null, false, false, null, lVar, null, null, z3.f.c(1221390907, new a1(f14, 6), o0VarE), o0Var, i15 & 1022, ((i15 >> 9) & 896) | 3072 | ((i15 << 15) & 1879048192), 3072, 7849776);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c02.g(str, str2, aVar, f14, lVar, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(v vVar, e23.a aVar, u1 u1Var, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        vVar.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1038081586);
        int i15 = i14 | (o0VarE.r(vVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(u1Var) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = o0VarE.B(vVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = vVar.f144026a.f143495c;
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = vVar.f144026a.f143495c;
                    o0VarE.K(objQ);
                }
            }
            l90.b bVar = (l90.b) objQ;
            p1 p1VarC = s9.c.c((o2) vVar.f144028c.getValue(), o0VarE);
            b0 b0Var = ((z90.d) p1VarC.getF182175a()).f203129c;
            boolean zB2 = ((i15 & 7168) == 2048) | o0VarE.B(p1VarC);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new r(p1VarC, lVar, null);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new r(p1VarC, lVar, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((e23.p) objQ2, b0Var, o0VarE);
            Boolean boolValueOf = Boolean.valueOf(((z90.d) p1VarC.getF182175a()).f203128b);
            boolean zB3 = o0VarE.B(p1VarC) | ((i15 & 112) == 32);
            Object objQ3 = o0VarE.q();
            if (zB3) {
                objQ3 = new s(aVar, p1VarC, null);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new s(aVar, p1VarC, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((e23.p) objQ3, boolValueOf, o0VarE);
            b("firmware_orca_update_progress_screen", bVar.f111521f, bVar.f111526k, ((z90.d) p1VarC.getF182175a()).f203127a, lVar2, u1Var, o0VarE, (57344 & i15) | 6 | ((i15 << 9) & 458752));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ob0.e((Object) vVar, (Object) aVar, (Object) u1Var, (o13.h) lVar, (o13.h) lVar2, i14, 14);
        }
    }
}
