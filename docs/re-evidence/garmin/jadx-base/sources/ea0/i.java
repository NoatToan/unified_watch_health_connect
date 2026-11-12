package ea0;

import a42.z;
import as.s;
import ca0.u1;
import com.garmin.android.apps.connectmobile.R;
import da0.p;
import e23.l;
import gl1.y;
import lc.u0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    public static final void a(String str, o90.a aVar, gv.a aVar2, u1 u1Var, l lVar, m mVar, int i14) {
        gv.a aVar3;
        String strL;
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(768574800);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.k(aVar2.ordinal()) ? 256 : 128) | (o0VarE.r(u1Var) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            aVar3 = aVar2;
            Integer num = aVar3.f79150c;
            if (num == null) {
                o0VarE.C(141458089);
                o0VarE.g0(false);
                strL = null;
            } else {
                strL = u0.l(o0VarE, 141458090, num, o0VarE, false);
            }
            if (strL == null) {
                o0VarE.C(-133981749);
                strL = y.P(R.string.msg_device_ready_to_go, new Object[]{str}, o0VarE);
            } else {
                o0VarE.C(-133985407);
            }
            o0VarE.g0(false);
            b(str, aVar, strL, u1Var, lVar, o0VarE, i15 & 64638);
        } else {
            aVar3 = aVar2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z((Object) str, (Object) aVar, (Object) aVar3, (Object) u1Var, (Object) lVar, i14, 26);
        }
    }

    public static final void b(String str, o90.a aVar, String str2, u1 u1Var, l lVar, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1504734429);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.r(u1Var) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.safety_features_wizard_setup_complete);
            String strQ2 = y.Q(o0VarE, R.string.lbl_done);
            h4.d.f81522a.getClass();
            int i16 = i15 << 3;
            o0Var = o0VarE;
            p.c("ble_connection_setup_complete_screen", str, aVar, strQ, false, null, null, null, strQ2, u1Var, false, null, null, false, null, null, false, false, null, lVar, null, h4.d.a.f81537o, z3.f.c(-1802466622, new s(str2, 12), o0VarE), o0Var, (i16 & 896) | (i16 & 112) | 6 | ((i15 << 18) & 1879048192), (i15 << 15) & 1879048192, 3456, 3669232);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z((Object) str, (Object) aVar, (Object) str2, (Object) u1Var, (Object) lVar, i14, 27);
        }
    }
}
