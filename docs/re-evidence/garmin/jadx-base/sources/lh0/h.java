package lh0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import kotlin.t1;
import kotlin.t3;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public static final void a(Double d14, Double d15, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-440762750);
        int i15 = (o0VarE.B(d14) ? 4 : 2) | i14 | (o0VarE.B(d15) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            ih0.i iVar = new ih0.i((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            n.f(c2.l.C(aVar, f14, 0.0f, f14, 0.0f, 10), z3.f.c(307629534, new d(d14, iVar, d15, 1), o0VarE), o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(i14, 1, d14, d15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
    public static final void b(r rVar, dh0.a aVar, p3.m mVar, int i14) {
        int i15;
        rVar.getClass();
        o0 o0VarE = mVar.E(-1775316037);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            dh0.d dVarA = ih0.g.a(aVar.f59546e, dh0.g.BODY_FAT);
            if (dVarA != null) {
                Double d14 = dVarA.f59566c;
                o0VarE.C(-212580486);
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                t3 t3Var = (t3) o0VarE.A(t1.f91501s);
                ih0.i iVar = new ih0.i(context);
                int i16 = i15 & 14;
                rVar.a(o0VarE, i16);
                h4.r.a aVar2 = h4.r.S;
                float f14 = 24;
                g6.f.a aVar3 = g6.f.f75994b;
                c2.l.f(c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
                a(d14, dVarA.f59565b, o0VarE, 0);
                c2.l.f(c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
                rVar.a(o0VarE, i16);
                String strP = y.P(R.string.msg_reducing_body_fat_help_lower_fitness_age, new Object[]{iVar.a(d14, true)}, o0VarE);
                int i17 = (i15 << 3) & 112;
                rVar.h(strP, o0VarE, i17);
                int id3 = xx0.a.EnumC3592a.AMERICAN_COUNCIL_ON_EXERCISE.getId();
                boolean zR = o0VarE.r(t3Var);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new by1.q(t3Var, 6);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new by1.q(t3Var, 6);
                        o0VarE.K(objQ);
                    }
                }
                int i18 = (i15 << 6) & 896;
                rVar.f((e23.a) objQ, id3, o0VarE, i18);
                rVar.k(R.string.title_body_fat_numbers, o0VarE, i17);
                rVar.i(R.string.msg_body_fat_percentage_metric, o0VarE, i18);
                rVar.i(R.string.msg_body_fat_availability, o0VarE, i18);
                c2.l.f(c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-211645433);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(rVar, aVar, i14, 0);
        }
    }
}
