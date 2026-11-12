package sa0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.WifiSetup;
import ew1.v1;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.ia;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, WifiSetup.SecurityType securityType, e23.l<? super String, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-643432537);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.k(securityType.ordinal()) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n("");
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.TRUE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            int iC = hd0.a.c((String) p1Var.getF182175a(), securityType);
            String strQ = y.Q(o0VarE, R.string.wifi_enter_password);
            s62.a.f157643a.getClass();
            u4.d dVarA = ia.a(t62.b.f162798a);
            String strQ2 = y.Q(o0VarE, R.string.lbl_next);
            boolean z14 = (i15 & 896) == 256;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new v1(lVar, p1Var, 21);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            da0.p.b("wifi_add_password_screen", strQ, dVarA, null, null, strQ2, (e23.a) objQ3, iC == 0, null, null, false, null, null, false, false, aVar, null, null, null, null, null, z3.f.c(-1120312153, new e(str, p1Var, p1Var2), o0VarE), o0Var, 6, (i15 << 6) & 458752, 384, 4161304);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(str, securityType, lVar, aVar, i14, 1);
        }
    }

    public static final void b(String str, WifiSetup.SecurityType securityType, e23.l<? super String, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        str.getClass();
        securityType.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-382452988);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.k(securityType.ordinal()) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            a(str, securityType, lVar, aVar, o0VarE, i15 & 8190);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(str, securityType, lVar, aVar, i14, 0);
        }
    }
}
