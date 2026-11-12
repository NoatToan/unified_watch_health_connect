package yr;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.a1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import java.util.ArrayList;
import java.util.List;
import l72.w1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 {
    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    public static final void a(nr.g.n nVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        List listB1;
        p3.o0 o0VarE = mVar.E(599419850);
        int i15 = (o0VarE.r(nVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            int i16 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).screenWidthDp;
            ExerciseSetsDTO exerciseSetsDTO = nVar.f127105a;
            List listB2 = null;
            com.garmin.android.apps.connectmobile.repcounting.model.e[] eVarArr = exerciseSetsDTO != null ? exerciseSetsDTO.f41089a : null;
            if (eVarArr != null) {
                ArrayList arrayList = new ArrayList();
                for (com.garmin.android.apps.connectmobile.repcounting.model.e eVar : eVarArr) {
                    List<String> list = eVar.f41124n;
                    if (list != null) {
                        arrayList.add(list);
                    }
                }
                listB1 = p13.h0.b1(p13.h0.f1(p13.y.s(arrayList)));
            } else {
                listB1 = null;
            }
            if (eVarArr != null) {
                ArrayList arrayList2 = new ArrayList();
                for (com.garmin.android.apps.connectmobile.repcounting.model.e eVar2 : eVarArr) {
                    List<String> list2 = eVar2.f41125o;
                    if (list2 != null) {
                        arrayList2.add(list2);
                    }
                }
                listB2 = p13.h0.b1(p13.h0.f1(p13.y.s(arrayList2)));
            }
            List list3 = listB2;
            String strQ = gl1.y.Q(o0VarE, R.string.msg_tap_for_muscle_details);
            w1 w1Var = w1.TopStart;
            List list4 = listB1;
            l72.x1 x1Var2 = l72.x1.Center;
            long j8 = (((long) (i16 / 4)) << 32) | (((long) 45) & 4294967295L);
            g6.k.a aVar = g6.k.f76003b;
            boolean z14 = nVar.f127106b;
            boolean zR = o0VarE.r(nVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new xn.r(nVar, 29);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xn.r(nVar, 29);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            a1.a(strQ, w1Var, x1Var2, 200, j8, z14, (e23.a) objQ, z3.f.c(2097949967, new vd0.f0(context, list4, list3, nVar, 10), o0VarE), o0Var, 100691328, 2);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(nVar, i14, 9);
        }
    }
}
