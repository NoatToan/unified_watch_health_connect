package e11;

import c2.n0;
import c2.n3;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import org.koin.java.KoinJavaComponent;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f11.j jVar, v21.e eVar, fe feVar, e23.p pVar, p3.m mVar, int i14) {
        int i15;
        e23.p pVar2;
        o0 o0Var;
        v21.e eVar2;
        int i16;
        v21.e eVar3;
        Object j0Var;
        p1 p1Var;
        p1 p1Var2;
        e23.p pVar3;
        f11.j jVar2 = jVar;
        jVar2.getClass();
        feVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-1759531604);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(jVar2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            int i17 = i14 & 1;
            p3.m.a aVar = p3.m.f135153a;
            if (i17 == 0 || o0VarE.o0()) {
                Object objQ = o0VarE.q();
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                    o0VarE.K(objQ);
                }
                i16 = i15 & (-113);
                eVar3 = (v21.e) objQ;
            } else {
                o0VarE.e();
                i16 = i15 & (-113);
                eVar3 = eVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(jVar2.f67973j, o0VarE);
            p1 p1VarC2 = s9.c.c(jVar2.f67975l, o0VarE);
            p1 p1VarC3 = s9.c.c(jVar2.f67977n, o0VarE);
            p1 p1VarC4 = s9.c.c(jVar2.f67978o, o0VarE);
            p1 p1VarC5 = s9.c.c(jVar2.f67979p, o0VarE);
            p1 p1VarC6 = s9.c.c(jVar2.f67980q, o0VarE);
            p1 p1VarC7 = s9.c.c(jVar2.f67981r, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_quick_add);
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var3 = (p1) objQ2;
            boolean z14 = !((i53.c) p1VarC7.getF182175a()).isEmpty();
            f11.j.c cVar = (f11.j.c) p1VarC2.getF182175a();
            boolean zB = o0VarE.B(p1VarC2) | ((i16 & 7168) == 2048) | o0VarE.r(jVar2) | o0VarE.B(p1VarC);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                p1Var = p1VarC;
                p1Var2 = p1VarC2;
                j0Var = new j0(pVar, jVar2, p1Var2, p1Var, null);
                pVar3 = pVar;
                jVar2 = jVar2;
                o0VarE.K(j0Var);
            } else {
                p1Var = p1VarC;
                pVar3 = pVar;
                j0Var = objQ3;
                p1Var2 = p1VarC2;
            }
            l0.e((e23.p) j0Var, cVar, o0VarE);
            boolean z15 = ((f11.j.c) p1Var2.getF182175a()) == f11.j.c.LOADING;
            z3.e eVarC = z3.f.c(-1901406415, new f0(pVar3, 0, jVar2, (Object) r25), o0VarE);
            z3.e eVarC2 = z3.f.c(-410837710, new ak0.o(feVar, 6), o0VarE);
            n0 n0Var = n3.f22788a;
            n0 n0Var2 = new n0(0, 0, 0, 0);
            p1 p1Var4 = p1Var;
            f11.j jVar3 = jVar2;
            pVar2 = pVar3;
            v21.e eVar4 = eVar3;
            p1 p1Var5 = p1Var2;
            z3.e eVarC3 = z3.f.c(-234098891, new ck0.i(p1Var4, p1VarC3, strQ, jVar3, eVar4, z14, p1Var5, p1Var3, p1VarC5, p1VarC4, p1VarC6, p1VarC7), o0VarE);
            o0Var = o0VarE;
            z02.d.a(z15, eVarC, eVarC2, null, n0Var2, eVarC3, o0Var, 197040, 8);
            r1.c0.e(((f11.j.c) p1Var5.getF182175a()) == f11.j.c.ERROR, null, null, null, null, z3.f.c(-1474086956, new a71.n(jVar3, 27), o0Var), o0Var, 196608, 30);
            r1.c0.e(((f11.j.c) p1Var5.getF182175a()) == f11.j.c.LOAD_FAILED, null, null, null, null, z3.f.c(1305144189, new c0(1, jVar3, pVar2), o0Var), o0Var, 196608, 30);
            eVar2 = eVar4;
        } else {
            pVar2 = pVar;
            o0Var = o0VarE;
            o0Var.e();
            eVar2 = eVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(jVar, eVar2, feVar, pVar2, i14, 15);
        }
    }
}
