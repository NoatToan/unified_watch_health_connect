package rw1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.l;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h4.r;
import h5.e0;
import h5.g;
import java.util.ArrayList;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.Days;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import pw1.j;
import tn.k;
import tw1.m;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final void a(m mVar, int i14, p3.m mVar2, int i15) {
        int days;
        mVar.getClass();
        o0 o0VarE = mVar2.E(-132817871);
        int i16 = (o0VarE.r(mVar) ? 4 : 2) | i15 | (o0VarE.k(i14) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r rVarE = u1.n.e(x2.f(r.S, 1.0f), k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            r rVarY = l.y(rVarE, j92.b.f97899b.f97920e);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            g.V.getClass();
            e0.a aVar = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, z0VarD, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            int iA = vw1.c.a(mVar);
            int iB = vw1.c.b(mVar);
            int iE = vw1.c.e(mVar);
            if (mVar.getStartDate() != null) {
                DateTime startDate = mVar.getStartDate();
                DateTime dateTimeO = mVar.o();
                days = Days.daysBetween(startDate, (dateTimeO == null || !dateTimeO.isBeforeNow()) ? DateTime.now().withTimeAtStartOfDay() : mVar.o()).getDays() + 1;
            } else {
                days = 0;
            }
            int days2 = (mVar.getStartDate() == null || mVar.o() == null) ? 0 : Days.daysBetween(mVar.getStartDate(), mVar.o()).getDays() + 1;
            int iM = mVar.m();
            int iH = vw1.c.h(i14, mVar.getStartDate(), mVar.o());
            ArrayList arrayList = new ArrayList();
            mx.h hVar = new mx.h(uVar, new p005kotlin.jvm.internal.p0(), days2, arrayList);
            Integer numValueOf = Integer.valueOf(iA);
            String string = context.getString(R.string.itp_base_phase_name);
            string.getClass();
            hVar.invoke(numValueOf, string);
            Integer numValueOf2 = Integer.valueOf(iB);
            String string2 = context.getString(R.string.itp_build_phase_name);
            string2.getClass();
            hVar.invoke(numValueOf2, string2);
            Integer numValueOf3 = Integer.valueOf(iE);
            String string3 = context.getString(R.string.itp_peak_phase_name);
            string3.getClass();
            hVar.invoke(numValueOf3, string3);
            qw1.c.a(new qw1.b(days, iM, days2, iH, i53.a.j(arrayList)), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(mVar, i14, i15, 3);
        }
    }
}
