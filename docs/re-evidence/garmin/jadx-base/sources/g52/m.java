package g52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public static final void a(z42.i iVar, LocalDate localDate, LocalDate localDate2, int i14, p3.m mVar, int i15) {
        Throwable th3;
        String strJ;
        b92.a aVarA;
        int i16;
        int i17;
        o0 o0VarE = mVar.E(1817674031);
        int i18 = i15 | (o0VarE.r(iVar) ? 4 : 2) | (o0VarE.r(localDate) ? 32 : 16) | (o0VarE.r(localDate2) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024);
        if (o0VarE.n(i18 & 1, (i18 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new d52.e(context);
                o0VarE.K(objQ);
            }
            d52.e eVar = (d52.e) objQ;
            eVar.getClass();
            int iAbs = i14 == 6 ? 364 : Math.abs(Days.daysBetween(localDate, localDate2).getDays());
            int i19 = i14 == 6 ? 52 : 12;
            String strC = eVar.c(iVar != null ? iVar.d() : null);
            String strA = eVar.a(iVar != null ? iVar.b() : null);
            String strE = eVar.e(iVar != null ? iVar.b() : null);
            Integer numD = iVar != null ? iVar.d() : null;
            if (iVar != null && (i17 = iVar.f202405b) > 0) {
                iAbs = i17;
            }
            String strF = numD == null ? eVar.f() : d52.e.b(numD.intValue() / iAbs);
            Integer numD2 = iVar != null ? iVar.d() : null;
            if (iVar != null && (i16 = iVar.f202406c) > 0) {
                i19 = i16;
            }
            String strF2 = numD2 == null ? eVar.f() : d52.e.b(numD2.intValue() / i19);
            if (i14 == 13) {
                th3 = null;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -619358448, R.string.lbl_average_weekly, o0VarE, false);
            } else {
                th3 = null;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -619286001, R.string.lbl_average_monthly, o0VarE, false);
            }
            String str = strJ;
            if (i14 == 13) {
                aVarA = eVar.i(strF2);
            } else {
                Context context2 = eVar.f57568a;
                String strO = xy2.b.O(context2, strF2);
                aVarA = wz1.a.a(oi0.c.A(context2, new com.google.maps.android.compose.clustering.d(25), context2.getString(R.string.lbl_average_monthly)) + StringUtils.SPACE + strO);
            }
            b92.a aVar = aVarA;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            x0 x0Var = x0.f111346a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC2 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
            z3.e eVarC = z3.f.c(2007512320, new e52.e(strC, eVar, strA, strE), o0VarE);
            int i24 = (x0.f111348c << 6) | 48;
            x0Var.e(rVarC2, eVarC, o0VarE, i24, 0);
            x0Var.e(null, z3.f.c(-1794937559, new ak0.j(strF, eVar, strF2, str, aVar, 20), o0VarE), o0VarE, i24, 1);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(iVar, localDate, localDate2, i14, i15, 0);
        }
    }
}
