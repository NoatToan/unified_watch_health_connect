package sg0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import et1.g1;
import i3.e5;
import i3.mc;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ve2.e eVar, String str, mc mcVar, e23.q qVar, e23.l lVar, p3.m mVar, int i14) {
        p3.m.a.C2565a c2565a;
        boolean z14;
        p3.o0 o0Var;
        o53.b0 b0Var;
        mc mcVar2;
        eVar.getClass();
        qVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-1314552811);
        int i15 = i14 | (o0VarE.k(eVar.ordinal()) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(mcVar) ? 256 : 128) | (o0VarE.r(qVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var2 = (o53.b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ4;
            Integer numValueOf = Integer.valueOf(n1Var.getIntValue());
            Boolean bool = (Boolean) p1Var.getF182175a();
            bool.booleanValue();
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a2) {
                objQ5 = new b(p1Var, p1Var2, null);
                o0VarE.K(objQ5);
            }
            p3.l0.f(numValueOf, bool, (e23.p) objQ5, o0VarE);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                c2565a = c2565a2;
                z14 = false;
                o0Var = o0VarE;
                b0Var = b0Var2;
                mcVar2 = mcVar;
                o0Var.C(-328432179);
                o0Var.g0(false);
            } else {
                o0VarE.C(-330174472);
                l72.w wVar = l72.w.f111301a;
                z3.e eVarC = z3.f.c(-1107459382, new a(b0Var2, mcVar, 0), o0VarE);
                boolean zR = o0VarE.r(b0Var2) | ((((i15 & 896) ^ 384) > 256 && o0VarE.B(mcVar)) || (i15 & 384) == 256);
                Object objQ6 = o0VarE.q();
                if (zR || objQ6 == c2565a2) {
                    objQ6 = new nw0.n(b0Var2, mcVar, 9);
                    o0VarE.K(objQ6);
                }
                c2565a = c2565a2;
                o0Var = o0VarE;
                b0Var = b0Var2;
                wVar.c(eVarC, null, (e23.a) objQ6, mcVar, null, new s70.v(26), z3.f.c(-2014991844, new ak0.g(p1Var, eVar, str, b0Var2, mcVar, qVar, lVar, n1Var, 8), o0VarE), o0Var, ((i15 << 3) & 7168) | 1572870, 18);
                mcVar2 = mcVar;
                z14 = false;
                o0Var.g0(false);
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0Var.C(-328368195);
                boolean z15 = z14;
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(o0Var, R.string.loading_error);
                String strQ2 = gl1.y.Q(o0Var, R.string.lbl_error_occurred_try_again);
                String strQ3 = gl1.y.Q(o0Var, R.string.lbl_try_again);
                String strQ4 = gl1.y.Q(o0Var, R.string.common_cancel);
                Object objQ7 = o0Var.q();
                if (objQ7 == c2565a) {
                    objQ7 = new q42.v(p1Var2, 29, p1Var, n1Var);
                    o0Var.K(objQ7);
                }
                e23.a<Unit> aVar = (e23.a) objQ7;
                boolean zR2 = o0Var.r(b0Var) | (((((i15 & 896) ^ 384) <= 256 || !o0Var.B(mcVar2)) && (i15 & 384) != 256) ? z15 : true);
                Object objQ8 = o0Var.q();
                if (zR2 || objQ8 == c2565a) {
                    objQ8 = new nw0.n(b0Var, mcVar2, 10);
                    o0Var.K(objQ8);
                }
                o0VarE = o0Var;
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar, strQ4, (e23.a) objQ8, o0VarE, 100663302, 0, 216);
                o0VarE.g0(z15);
            } else {
                o0VarE = o0Var;
                o0VarE.C(-327793331);
                o0VarE.g0(z14);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ob0.e((Object) eVar, (Object) str, (Object) mcVar, (Object) qVar, lVar, i14, 27);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ve2.e eVar, String str, e23.a aVar, e23.q qVar, e23.l lVar, e23.a aVar2, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(2077651721);
        int i15 = i14 | (o0VarE.k(eVar.ordinal()) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(qVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            boolean zD = d92.b.d(o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(zD ? "GCM_ANDROID_DARK" : "GCM_ANDROID_LIGHT");
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            qi2.b bVar = new qi2.b(ui2.a.valueOf(eVar.name()), (String) p1Var.getF182175a(), str == null ? "" : str, false, 8, null);
            int i16 = 458752 & i15;
            boolean z14 = ((i15 & 7168) == 2048) | (i16 == 131072);
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new rp.b(qVar, aVar2, aVar, 13);
                o0VarE.K(objQ2);
            }
            e23.l lVar2 = (e23.l) objQ2;
            boolean z15 = ((i15 & 57344) == 16384) | (i16 == 131072);
            Object objQ3 = o0VarE.q();
            if (z15 || objQ3 == c2565a) {
                objQ3 = new g1(5, aVar2, lVar);
                o0VarE.K(objQ3);
            }
            wi2.b.b(bVar, rVarD, lVar2, (e23.l) objQ3, o0VarE, 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(eVar, str, aVar, qVar, lVar, aVar2, i14);
        }
    }
}
