package cw1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class g1 {
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    public static final void a(String str, int i14, String str2, e23.l lVar, String str3, e23.a aVar, p3.m mVar, int i15) {
        p3.o0 o0Var;
        String str4;
        String str5;
        String str6;
        String strH;
        String strQ;
        int i16;
        String strQ2;
        p3.o0 o0VarP = androidx.room.a0.p(lVar, aVar, mVar, -321811244);
        int i17 = i15 | 2 | (o0VarP.k(i14) ? 2048 : 1024) | 8192 | (o0VarP.r(lVar) ? 131072 : 65536) | 524288;
        if (o0VarP.n(i17 & 1, (4793491 & i17) != 4793490)) {
            o0VarP.G0();
            if ((i15 & 1) == 0 || o0VarP.o0()) {
                x1 x1Var = p3.n.f135158a;
                strH = com.nimbusds.jose.shaded.gson.internal.a.h(gl1.y.Q(o0VarP, R.string.activity_stats_details_total_time_label), " (", gl1.y.Q(o0VarP, R.string.hour_minute_second_format), ")");
                strQ = gl1.y.Q(o0VarP, R.string.lbl_done);
                i16 = i17 & (-3727375);
                strQ2 = gl1.y.Q(o0VarP, R.string.lbl_cancel);
            } else {
                o0VarP.e();
                i16 = i17 & (-3727375);
                strH = str;
                strQ = str2;
                strQ2 = str3;
            }
            o0VarP.h0();
            x1 x1Var2 = p3.n.f135158a;
            Object[] objArr = new Object[0];
            boolean z14 = (i16 & 7168) == 2048;
            Object objQ = o0VarP.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new a51.c(i14, 1);
                o0VarP.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a51.c(i14, 1);
                    o0VarP.K(objQ);
                }
            }
            p3.n1 n1Var = (p3.n1) d4.a.e(objArr, (e23.a) objQ, o0VarP, 0);
            l72.c1 c1Var = l72.c1.f110940a;
            z3.e eVarC = z3.f.c(-1893592528, new f1(i14, n1Var, 0), o0VarP);
            boolean zB = o0VarP.B(n1Var) | ((i16 & 458752) == 131072);
            Object objQ2 = o0VarP.q();
            if (zB) {
                objQ2 = new a11.f0(lVar, n1Var, 4);
                o0VarP.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a11.f0(lVar, n1Var, 4);
                    o0VarP.K(objQ2);
                }
            }
            e23.a<Unit> aVar3 = (e23.a) objQ2;
            o0Var = o0VarP;
            String str7 = strH;
            c1Var.a(true, str7, null, eVarC, null, strQ, false, false, aVar3, strQ2, aVar, o0Var, 3078, 6, 212);
            str4 = str7;
            str5 = strQ;
            str6 = strQ2;
        } else {
            o0Var = o0VarP;
            o0Var.e();
            str4 = str;
            str5 = str2;
            str6 = str3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(str4, i14, str5, lVar, str6, aVar, i15);
        }
    }
}
