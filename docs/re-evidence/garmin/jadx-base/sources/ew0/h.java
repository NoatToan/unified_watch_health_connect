package ew0;

import com.garmin.android.apps.connectmobile.R;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x010c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(k kVar, boolean z14, ug2.x xVar, ug2.x xVar2, e23.a aVar, p3.m mVar, int i14) {
        kVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-217018649);
        int i15 = i14 | (o0VarE.r(kVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(xVar) ? 256 : 128) | (o0VarE.r(xVar2) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(kVar.f66229d, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_lifestyle_logging);
            boolean z15 = ((i) p1VarC.getF182175a()).f66221a;
            boolean z16 = ((i) p1VarC.getF182175a()).f66222b;
            boolean zR = o0VarE.r(kVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new e40.d(kVar, 10);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e40.d(kVar, 10);
                    o0VarE.K(objQ);
                }
            }
            o53.f0.e(strQ, z15, z16, z14, aVar, (e23.a) objQ, o0VarE, ((i15 << 6) & 7168) | (i15 & 57344));
            Boolean bool = Boolean.TRUE;
            boolean zR2 = o0VarE.r(kVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new f(kVar, null);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f(kVar, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((e23.p) objQ2, bool, o0VarE);
            Boolean bool2 = ((i) p1VarC.getF182175a()).f66223c;
            boolean zB = o0VarE.B(p1VarC) | ((i15 & 7168) == 2048) | ((i15 & 896) == 256);
            Object objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new g(p1VarC, xVar2, xVar, null);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new g(p1VarC, xVar2, xVar, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((e23.p) objQ3, bool2, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(kVar, z14, xVar, xVar2, aVar, i14);
        }
    }
}
