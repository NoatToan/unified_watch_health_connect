package c40;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.o3;
import c2.t2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import i3.e5;
import java.util.Map;
import l72.x0;
import o13.p;
import o53.f0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p006l2.q1;
import p13.t0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.y;
import s5.z;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, q1> f24332a;

    static {
        long jB = f0.B(4);
        long jB2 = f0.B(0);
        z.f157329b.getClass();
        y yVar = new y(jB, jB2, z.f157336i, null);
        c.f24313a.getClass();
        f24332a = t0.b(new p("spaceBetweenMetricAndUnit", new q1(yVar, c.f24314b)));
    }

    public static final void a(final t2 t2Var, final String str, final double d14, final double d15, final boolean z14, m mVar, final int i14) {
        int i15;
        t2Var.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(1639643047);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.m(d14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.m(d15) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            s20.e.f156007a.getClass();
            String str2 = l3.f23126d.format(d14);
            str2.getClass();
            String strP = gl1.y.P(R.string.lbl_value_percent, new Object[]{str2}, o0VarE);
            String strB = s20.e.b(d15, context, z14);
            if (strB == null) {
                strB = "";
            }
            String strQ = gl1.y.Q(o0VarE, z14 ? R.string.lbl_km : R.string.lbl_mile);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new o3(8);
                o0VarE.K(objQ);
            }
            String strO = am.j.o(StringUtils.SPACE, oi0.c.B(strQ, (l) objQ, o0VarE), e5.l(str, ", ", strP, ", ", strB));
            x0 x0Var = x0.f111346a;
            z3.e eVarC = z3.f.c(2065727047, new i(strB, strQ, 0), o0VarE);
            int i16 = b92.a.f16960b;
            x0Var.a(((i15 << 3) & 896) | (i15 & 14) | 196608 | (x0.f111348c << 24), 44, wz1.a.a(strO), t2Var, eVarC, null, strP, str, null, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: c40.j
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    k.a(t2Var, str, d14, d15, z14, (m) obj, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
