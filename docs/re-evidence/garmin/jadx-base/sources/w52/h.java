package w52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.List;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    public static final void a(c62.y0 y0Var, String str, List list, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        str.getClass();
        p3.o0 o0VarE = mVar.E(1851308081);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.B(str) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(list) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(o0VarE, R.string.view_compatible_activities);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarA = s5.x0.a(j92.f.f97933j, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, eVar.f97920e, 0.0f, 2);
            bVar.getClass();
            float f14 = eVar.f97919d;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarA, 0.0f, f14, 0.0f, eVar.f97917b, 5);
            p5.l.f136032b.getClass();
            p5.l lVarA = p5.l.a(0);
            boolean zR = o0VarE.r(context) | ((i15 & 112) == 32) | o0VarE.r(list);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ug2.b0(context, 19, str, list);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ug2.b0(context, 19, str, list);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarC, false, null, lVarA, (e23.a) objQ, 11);
            o0Var = o0VarE;
            mh.c(strQ, rVarD, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l0(y0Var, str, list, i14, 23);
        }
    }
}
