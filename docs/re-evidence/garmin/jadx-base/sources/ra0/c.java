package ra0;

import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
import i3.e5;
import java.util.ArrayList;
import ng2.i;
import o72.a3;
import p3.l0;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p2;
import p3.x1;
import v62.n4;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final void a(int i14, ArrayList arrayList, String str, l lVar, e23.a aVar, e23.a aVar2, m mVar, int i15) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1714459063);
        int i16 = i15 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.r(arrayList) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(i14, o0VarE);
            }
            n1 n1Var = (n1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new a3(n1Var, 6);
                o0VarE.K(objQ2);
            }
            l lVar2 = (l) objQ2;
            Integer numValueOf = Integer.valueOf(n1Var.getIntValue());
            boolean zR = o0VarE.r(arrayList) | ((i16 & 7168) == 2048);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new b(arrayList, lVar, n1Var, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, numValueOf, o0VarE);
            String strQ = y.Q(o0VarE, R.string.startup_device_language_title);
            String strP = y.P(R.string.startup_device_language_message, new Object[]{str}, o0VarE);
            s62.a.f157643a.getClass();
            o0Var = o0VarE;
            da0.p.b("device_customization_language_selection_screen", strQ, n4.a(t62.b.f162798a), strP, null, y.Q(o0VarE, R.string.lbl_next), aVar, false, null, null, false, null, null, false, false, aVar2, null, null, null, null, null, f.c(-1108243273, new i(arrayList, 15, lVar2, n1Var), o0VarE), o0Var, ((i16 << 6) & 3670016) | 6, i16 & 458752, 384, 4161424);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(i14, arrayList, str, lVar, aVar, aVar2, i15, 1);
        }
    }

    public static final void b(int i14, ArrayList arrayList, String str, l lVar, e23.a aVar, e23.a aVar2, m mVar, int i15) {
        str.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1610430574);
        int i16 = i15 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.r(arrayList) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            a(i14, arrayList, str, lVar, aVar, aVar2, o0VarE, i16 & 524286);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(i14, arrayList, str, lVar, aVar, aVar2, i15, 0);
        }
    }
}
