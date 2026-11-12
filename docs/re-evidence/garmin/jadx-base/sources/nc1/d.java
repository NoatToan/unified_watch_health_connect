package nc1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.Iterator;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.Days;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r1.q2;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final void a(i53.c<dc1.c> cVar, DateTime dateTime, DateTime dateTime2, l<? super DateTime, Unit> lVar, m mVar, int i14) {
        boolean z14;
        Double d14;
        dc1.c cVar2;
        dc1.c next;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1487865591);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(dateTime2) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = Float.valueOf(c22.b.a(context));
                o0VarE.K(objQ);
            }
            float fFloatValue = ((Number) objQ).floatValue();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = Boolean.valueOf(fFloatValue >= 1.5f);
                o0VarE.K(objQ2);
            }
            boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
            r rVarE = u1.n.e(r.S, h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            float f15 = eVar.f97920e;
            org.apache.commons.lang3.e.j(bVar);
            r rVarB = c2.l.B(rVarE, f15, f14, f15, eVar.f97918c);
            j.i iVarG = q2.g(bVar, j.f22691a, f15);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarG, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarB, o0VarE);
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1280301659);
            int days = Days.daysBetween(dateTime, dateTime2).getDays();
            if (days >= 0) {
                int i16 = 0;
                while (true) {
                    DateTime dateTimeMinusDays = dateTime2.minusDays(i16);
                    if (cVar != null) {
                        Iterator<dc1.c> it = cVar.iterator();
                        do {
                            if (!it.hasNext()) {
                                d14 = null;
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                d14 = null;
                            }
                        } while (!next.f59140a.equals(dateTimeMinusDays.toString("yyyy-MM-dd")));
                        cVar2 = next;
                    } else {
                        d14 = null;
                        cVar2 = null;
                    }
                    r rVarF = x2.f(r.S, 1.0f);
                    dateTimeMinusDays.getClass();
                    int i17 = i16;
                    ic1.b.a(rVarF, dateTimeMinusDays, cVar2 != null ? Double.valueOf(cVar2.f59141b) : d14, true, zBooleanValue, lVar, o0VarE, (458752 & (i15 << 6)) | 27654);
                    if (i17 == days) {
                        break;
                    } else {
                        i16 = i17 + 1;
                    }
                }
                z14 = false;
            } else {
                z14 = false;
            }
            o0VarE.g0(z14);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a((Object) cVar, (Object) dateTime, (Object) dateTime2, (l) lVar, i14, 1);
        }
    }
}
