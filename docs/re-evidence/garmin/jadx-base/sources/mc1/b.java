package mc1;

import a11.g0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import l72.x0;
import lh0.s;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final void a(Double d14, m mVar, int i14) {
        o0 o0VarE = mVar.E(1302683166);
        int i15 = (o0VarE.B(d14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (d14 != null) {
                o0VarE.C(-1090199874);
                gc1.a aVar = new gc1.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                x0 x0Var = x0.f111346a;
                r.a aVar2 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                x0Var.e(l.y(aVar2, j92.b.f97899b.f97920e), z3.f.c(-754088278, new ic1.a(aVar, d14, 1), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1089794332);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s(d14, i14, 1);
        }
    }

    public static final void b(dc1.a aVar, DateTime dateTime, tf0.i iVar, e23.l<? super Boolean, Unit> lVar, e23.l<? super DateTime, Unit> lVar2, e23.l<? super DateTime, Unit> lVar3, m mVar, int i14) {
        int i15;
        DateTime dateTime2;
        e23.l<? super Boolean, Unit> lVar4;
        e23.l<? super DateTime, Unit> lVar5;
        Double avgTomorrowSleepSpO2;
        Double avgSleepSpO2;
        LocalDate localDateG;
        iVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(249230279);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            dateTime2 = dateTime;
            i15 |= o0VarE.r(dateTime2) ? 32 : 16;
        } else {
            dateTime2 = dateTime;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            lVar4 = lVar;
            i15 |= o0VarE.r(lVar4) ? 2048 : 1024;
        } else {
            lVar4 = lVar;
        }
        if ((i14 & 24576) == 0) {
            lVar5 = lVar2;
            i15 |= o0VarE.r(lVar5) ? 16384 : 8192;
        } else {
            lVar5 = lVar2;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            boolean zG = g22.k.g(aVar != null ? aVar.g() : null, LocalDate.now());
            r rVarD = x2.d(r.S, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            a.a(aVar, zG, o0VarE, i16 & 14);
            d.a(aVar, dateTime2, iVar, lVar4, lVar5, o0VarE, (57344 & i16) | (i16 & 126) | (tf0.i.f164439d << 6) | (i16 & 896) | (i16 & 7168));
            if (zG) {
                o0VarE.C(1986553290);
                a(aVar != null ? aVar.getAverageSpO2() : null, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1986609989);
                o0VarE.g0(false);
            }
            f.a(b0Var, aVar != null ? aVar.r() : null, o0VarE, 6);
            DateTime dateTimeAtStartOfDay = (aVar == null || (localDateG = aVar.g()) == null) ? null : localDateG.toDateTimeAtStartOfDay();
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = (aVar == null || (avgSleepSpO2 = aVar.getAvgSleepSpO2()) == null) ? 0.0d : avgSleepSpO2.doubleValue();
            if (aVar != null && (avgTomorrowSleepSpO2 = aVar.getAvgTomorrowSleepSpO2()) != null) {
                dDoubleValue = avgTomorrowSleepSpO2.doubleValue();
            }
            i.a(dateTimeAtStartOfDay, dDoubleValue2, dDoubleValue, lVar3, o0VarE, (i16 >> 6) & 7168);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0((Object) aVar, (Object) dateTime, (Object) iVar, (e23.l) lVar, (e23.l) lVar2, (e23.l) lVar3, i14, 28);
        }
    }
}
