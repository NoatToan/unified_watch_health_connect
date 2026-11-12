package rr0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import i3.ve;
import java.util.Locale;
import kotlin.t1;
import l72.c1;
import m4.b0;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class m {
    public static final void a(String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, String str2, Integer num, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        h4.r rVar2;
        o0 o0VarE = mVar.E(-2037347501);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | 48 | (o0VarE.B(str2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.j(o0VarE);
            }
            b0 b0Var = (b0) objQ;
            ve.a(aVar, null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(42483480, new k(str, b0Var, lVar, qVar, num, context, lVar2, str2 == null ? "" : str2, 0), o0VarE), o0VarE, 12582918, 122);
            Unit unit = Unit.INSTANCE;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new l(b0Var, null);
                o0VarE.K(objQ2);
            }
            l0.e((e23.p) objQ2, unit, o0VarE);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(str, rVar2, str2, num, lVar, lVar2, i14, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i14, e23.l<? super Integer, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i15) {
        o0 o0Var;
        int iC;
        o0 o0VarP = androidx.room.a0.p(lVar, aVar, mVar, -940214846);
        int i16 = (o0VarP.k(i14) ? 4 : 2) | i15 | (o0VarP.r(lVar) ? 32 : 16);
        if (o0VarP.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(o0VarP, R.string.no_value);
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                String strValueOf = String.valueOf(i14);
                int length = strValueOf.length() - 1;
                int i17 = 0;
                boolean z14 = false;
                while (i17 <= length) {
                    boolean z15 = p005kotlin.jvm.internal.s.h(strValueOf.charAt(!z14 ? i17 : length), 32) <= 0;
                    if (z14) {
                        if (!z15) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z15) {
                        i17++;
                    } else {
                        z14 = true;
                    }
                }
                objQ = p0.n(strValueOf.subSequence(i17, length + 1).toString());
                o0VarP.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            boolean zB = o0VarP.B((String) p1Var.getF182175a());
            Object objQ2 = o0VarP.q();
            if (zB || objQ2 == p3.m.a.f135155b) {
                String str = (String) p1Var.getF182175a();
                objQ2 = hb.a.n(!(!d(context, str) && 150 <= (iC = c(str)) && iC < 1000000), o0VarP);
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarP.q();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.TRUE);
                o0VarP.K(objQ3);
            }
            c1 c1Var = c1.f110940a;
            String strQ2 = gl1.y.Q(o0VarP, R.string.steps_step_goal_title);
            String strQ3 = gl1.y.Q(o0VarP, R.string.lbl_save);
            Locale locale = Locale.ROOT;
            String upperCase = strQ3.toUpperCase(locale);
            upperCase.getClass();
            String upperCase2 = gl1.y.Q(o0VarP, R.string.lbl_cancel).toUpperCase(locale);
            upperCase2.getClass();
            z3.e eVarC = z3.f.c(31870438, new ob0.e((p1) objQ3, context, strQ, p1Var, p1Var2, 20), o0VarP);
            boolean zB2 = o0VarP.B(p1Var2) | ((i16 & 112) == 32);
            Object objQ4 = o0VarP.q();
            if (zB2 || objQ4 == c2565a) {
                objQ4 = new lm0.o(lVar, p1Var2, p1Var, 3);
                o0VarP.K(objQ4);
            }
            e23.a<Unit> aVar2 = (e23.a) objQ4;
            Object objQ5 = o0VarP.q();
            if (objQ5 == c2565a) {
                objQ5 = new rk0.y(aVar, 7);
                o0VarP.K(objQ5);
            }
            o0Var = o0VarP;
            c1Var.a(false, strQ2, null, eVarC, null, upperCase, false, false, aVar2, upperCase2, (e23.a) objQ5, o0Var, 3078, 0, 212);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ma0.f(i14, lVar, aVar, i15);
        }
    }

    public static final int c(String str) {
        int length = str.length() - 1;
        int i14 = 0;
        boolean z14 = false;
        while (i14 <= length) {
            boolean z15 = p005kotlin.jvm.internal.s.h(str.charAt(!z14 ? i14 : length), 32) <= 0;
            if (z14) {
                if (!z15) {
                    break;
                }
                length--;
            } else if (z15) {
                i14++;
            } else {
                z14 = true;
            }
        }
        Integer numValueOf = Integer.valueOf(str.subSequence(i14, length + 1).toString());
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    public static final boolean d(Context context, String str) {
        String string = context.getString(R.string.no_value);
        string.getClass();
        return p005kotlin.jvm.internal.s.g(str, "0") || str.length() == 0 || p005kotlin.jvm.internal.s.g(str, string);
    }
}
