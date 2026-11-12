package e62;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import com.google.maps.android.compose.u;
import gl1.y;
import java.util.LinkedHashMap;
import l72.p2;
import o13.p;
import p005kotlin.Unit;
import p13.u0;
import p3.m;
import p3.n;
import p3.o0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    public static final void a(WorkoutDetailsDTO workoutDetailsDTO, h0 h0Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, e23.l<? super h0, Unit> lVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        workoutDetailsDTO.getClass();
        h0Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1647703214);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(workoutDetailsDTO) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(h0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p2 p2Var = p2.f111205a;
            String strQ = y.Q(o0VarE, h0Var.f48193h.f116769e);
            v52.g gVar = v52.g.f175774a;
            LinkedHashMap linkedHashMapF = cVar != null ? u0.f(new p(Integer.valueOf(h0Var.f48193h.f116766b), cVar)) : new LinkedHashMap();
            gVar.getClass();
            String strA = v52.g.a(context, workoutDetailsDTO, h0Var, linkedHashMapF);
            z3.e eVarC = z3.f.c(2007601724, new dh1.a(h0Var, 8), o0VarE);
            boolean zR = o0VarE.r(h0Var) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new dl0.g(10, lVar, h0Var);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new dl0.g(10, lVar, h0Var);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            p2Var.h(strQ, strA, null, null, null, false, false, eVarC, null, null, (e23.a) objQ, o0Var, 12582912, 0, 892);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(workoutDetailsDTO, h0Var, cVar, lVar, i14, 17);
        }
    }
}
