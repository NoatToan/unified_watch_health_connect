package ll1;

import b21.j0;
import ca0.u0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import p006l2.v0;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e eVar, u0 u0Var, gl1.a aVar, gl1.b bVar, j0 j0Var, e23.a aVar2, p3.m mVar, int i14) {
        eVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(2022552018);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.r(u0Var) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(bVar) ? 2048 : 1024) | (o0VarE.r(j0Var) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(eVar.f113385f, o0VarE);
            a aVar3 = ((d) p1VarC.getF182175a()).f113379c;
            boolean zR = o0VarE.r(aVar3) | o0VarE.B(p1VarC) | ((i15 & 112) == 32) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | ((57344 & i15) == 16384);
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zR) {
                b bVar2 = new b(aVar3, u0Var, aVar, bVar, j0Var, p1VarC, null);
                o0VarE.K(bVar2);
                objQ = bVar2;
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    b bVar3 = new b(aVar3, u0Var, aVar, bVar, j0Var, p1VarC, null);
                    o0VarE.K(bVar3);
                    objQ = bVar3;
                }
            }
            l0.e((p) objQ, aVar3, o0VarE);
            String strQ = y.Q(o0VarE, R.string.lbl_activity_recording);
            boolean z14 = ((d) p1VarC.getF182175a()).f113377a;
            boolean z15 = ((d) p1VarC.getF182175a()).f113378b;
            boolean zR2 = o0VarE.r(eVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new v0(eVar, 12);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new v0(eVar, 12);
                    o0VarE.K(objQ2);
                }
            }
            h.b((i15 >> 6) & 7168, aVar2, (e23.a) objQ2, strQ, o0VarE, z14, z15);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.j(eVar, u0Var, aVar, bVar, j0Var, aVar2, i14);
        }
    }
}
