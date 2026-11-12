package d51;

import b21.l0;
import c2.k3;
import c2.m3;
import com.garmin.android.library.mapsdkadapter.i;
import com.garmin.android.library.mapsdkadapter.k;
import com.garmin.android.library.mapsdkadapter.r;
import com.google.maps.android.compose.clustering.d;
import com.google.maps.android.compose.u;
import d4.h;
import e23.l;
import i3.e9;
import i3.mc;
import o51.e;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static final void a(e eVar, l<? super Integer, Unit> lVar, l<? super i.d, Unit> lVar2, l<? super Boolean, Unit> lVar3, m mVar, int i14) {
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(2037087994);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(lVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new d(22);
                o0VarE.K(objQ2);
            }
            mc mcVarF = e9.f(true, (l) objQ2, o0VarE, 54, 0);
            ie2.n.f93149a.getClass();
            k kVarA = ie2.n.a();
            i.d dVar = eVar.f129228a;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new h(2);
                o0VarE.K(objQ3);
            }
            je2.b<?> bVarE = ((r) kVarA).e(dVar, null, (e23.a) objQ3, o0VarE, 432);
            a.f57557a.getClass();
            z3.e eVar2 = a.f57558b;
            int i16 = k3.f22728a;
            m3.f22753w.getClass();
            z02.d.a(false, eVar2, null, null, m3.a.c(o0VarE).f22769o, f.c(-796920431, new l0(mcVarF, eVar, lVar, lVar2, lVar3, bVarE, p1Var, 4), o0VarE), o0VarE, 196656, 13);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(eVar, lVar, lVar2, lVar3, i14, 6);
        }
    }
}
