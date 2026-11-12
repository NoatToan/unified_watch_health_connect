package s70;

import com.garmin.android.apps.connectmobile.R;
import p3.p2;
import v62.s8;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 {
    public static final void a(int i14, e23.a aVar, h4.r rVar, p3.m mVar) {
        p3.o0 o0VarE = mVar.E(1492349446);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVar, f14, eVar.f97920e, f15, 0.0f, 8);
            l72.s.b bVar2 = l72.s.b.INFO;
            s62.a.f157643a.getClass();
            sVar.d(rVarC, bVar2, s8.a(t62.b.f162798a), gl1.y.Q(o0VarE, R.string.sync_reminder_title), gl1.y.Q(o0VarE, R.string.sync_no_data_message), null, null, aVar, o0VarE, ((i15 << 21) & 234881024) | 48, 224);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.w(rVar, aVar, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    public static final void b(androidx.lifecycle.n0 n0Var, e23.p pVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1628662580);
        int i15 = i14 | 2 | (o0VarE.r(pVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                n0Var = (androidx.lifecycle.n0) o0VarE.A(s9.j.f158018a);
            } else {
                o0VarE.e();
            }
            int i16 = i15 & (-15);
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            boolean zR = o0VarE.r(n0Var) | ((i16 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new rk0.g(24, n0Var, pVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rk0.g(24, n0Var, pVar);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.a(n0Var, (e23.l) objQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rk0.a1(n0Var, pVar, i14, 10);
        }
    }
}
