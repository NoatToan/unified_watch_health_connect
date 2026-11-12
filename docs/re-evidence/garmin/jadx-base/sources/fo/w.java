package fo;

import am.x0;
import com.garmin.android.apps.connectmobile.R;
import java.util.Set;
import l72.l2;
import l72.q2;
import p13.a1;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class w {
    public static final void a(wo0.a aVar, boolean z14, e23.a aVar2, e23.a aVar3, h4.r rVar, p3.m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar2, aVar3, mVar, 159982040);
        int i15 = i14 | (o0VarP.B(aVar) ? 4 : 2) | (o0VarP.h(z14) ? 32 : 16) | (o0VarP.r(aVar2) ? 256 : 128) | (o0VarP.r(aVar3) ? 2048 : 1024);
        if (o0VarP.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Set setB = a1.b(new c92.b.a(c92.a.DELETE, gl1.y.Q(o0VarP, R.string.lbl_delete)));
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarP);
                o0VarP.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            q2 q2Var = q2.CARD;
            Object objQ2 = o0VarP.q();
            if (objQ2 == c2565a) {
                objQ2 = new fb1.d0(11);
                o0VarP.K(objQ2);
            }
            l2.a(setB, b0Var, false, q2Var, (e23.a) objQ2, z3.f.c(-921117297, new u(aVar, z14, aVar2, aVar3, rVar), o0VarP), z3.f.c(1625492880, new ak0.p(aVar3, 3), o0VarP), o0VarP, 1797120, 4);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(aVar, z14, aVar2, aVar3, rVar, i14);
        }
    }

    public static wo0.a b(String str) {
        return new wo0.a(0L, str, 0.0d, "2026-06-25 09:18:45", "2026-06-25 09:18:45", x0.f4308n, null, null, false);
    }
}
