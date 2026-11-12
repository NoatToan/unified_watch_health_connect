package c40;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l;
import c2.y;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.List;
import l72.x0;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public static final void a(e50.i iVar, m mVar, int i14) {
        int i15;
        char c14;
        z3.e eVarC;
        z3.e eVarC2;
        Throwable th3;
        z3.e eVarC3;
        Double d14 = iVar.f63038e;
        Double d15 = iVar.f63036c;
        o0 o0VarE = mVar.E(-33622865);
        int i16 = (o0VarE.B(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            l3.a aVar = l3.f23124b;
            boolean z14 = iVar.f63043j;
            aVar.getClass();
            String strH1 = l3.a.H1(context, z14);
            Integer num = iVar.f63035b;
            boolean z15 = (num == null || d15 == null || (num.intValue() <= 0 && d15.doubleValue() <= 0.0d)) ? false : true;
            Integer num2 = iVar.f63037d;
            boolean z16 = (num2 == null || d14 == null || (num2.intValue() <= 0 && d14.doubleValue() <= 0.0d)) ? false : true;
            z3.e eVarC4 = z3.f.c(1066859281, new d(context, iVar, strH1, 0), o0VarE);
            z3.e eVarC5 = z3.f.c(1316960560, new d(context, iVar, strH1, 1), o0VarE);
            z3.e eVarC6 = z3.f.c(1567061839, new d(context, iVar, strH1, 2), o0VarE);
            z3.e eVarC7 = z3.f.c(1817163118, new d(context, iVar, strH1, 3), o0VarE);
            if (z15) {
                o0VarE.C(-929565872);
                c14 = 4;
                eVarC = z3.f.c(1793616594, new e(iVar, 0), o0VarE);
                o0VarE.g0(false);
            } else {
                c14 = 4;
                o0VarE.C(-929217897);
                o0VarE.g0(false);
                eVarC = null;
            }
            if (z16) {
                o0VarE.C(-929145729);
                eVarC2 = z3.f.c(2043717873, new e(iVar, 1), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-928781417);
                o0VarE.g0(false);
                eVarC2 = null;
            }
            if (iVar.f63044k != null) {
                o0VarE.C(-928708877);
                th3 = null;
                eVarC3 = z3.f.c(-2001148144, new e(iVar, 2), o0VarE);
                o0VarE.g0(false);
            } else {
                th3 = null;
                o0VarE.C(-928486793);
                o0VarE.g0(false);
                eVarC3 = null;
            }
            q[] qVarArr = new q[7];
            qVarArr[0] = eVarC4;
            qVarArr[1] = eVarC5;
            qVarArr[2] = eVarC6;
            qVarArr[3] = eVarC7;
            qVarArr[c14] = eVarC;
            qVarArr[5] = eVarC2;
            qVarArr[6] = eVarC3;
            ArrayList arrayListC = u.C(qVarArr);
            if (arrayListC.size() % 2 != 0) {
                a.f24309a.getClass();
                arrayListC = h0.D0(arrayListC, a.f24310b);
            }
            r.a aVar2 = r.S;
            r rVarE = u1.n.e(aVar2, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = l.A(rVarE, 0.0f, eVar.f97918c, 1);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            ArrayList arrayList = arrayListC;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            x0 x0Var = x0.f111346a;
            bVar.getClass();
            float f14 = eVar.f97920e;
            bVar.getClass();
            x0Var.e(l.z(aVar2, f14, eVar.f97918c), z3.f.c(-906266114, new aa2.f(13, context, iVar), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
            o0VarE.C(-175368121);
            for (List list : h0.i1(arrayList, 2, 2, true)) {
                x0 x0Var2 = x0.f111346a;
                r.a aVar4 = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f15 = eVar2.f97920e;
                bVar3.getClass();
                x0Var2.e(l.z(aVar4, f15, eVar2.f97918c), z3.f.c(-1314105911, new a31.a(list, 3), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
            }
            i15 = 0;
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            i15 = 0;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(iVar, i14, i15);
        }
    }

    public static final String b(Context context, Double d14, boolean z14) {
        if (!zf.b.D(d14)) {
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        return l3.a.c0(context, dDoubleValue, z14, false, false);
    }
}
