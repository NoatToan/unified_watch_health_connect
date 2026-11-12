package di0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.google.maps.android.compose.u;
import h4.r;
import h5.e0;
import i3.e5;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:83:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(LocalDate localDate, LocalDate localDate2, sh0.a aVar, e23.l lVar, m mVar, int i14) {
        int i15;
        sh0.b bVar;
        Object next;
        String str;
        lVar.getClass();
        o0 o0VarE = mVar.E(-598085086);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(localDate) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(localDate2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        e23.l lVar2 = lVar;
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = p0.n(new xh0.c(context));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            r.a aVar2 = r.S;
            r rVarE = u1.n.e(x2.d(aVar2, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA = y.a(kVar, aVar3, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d.a(localDate, localDate2, aVar, (xh0.c) p1Var.getF182175a(), o0VarE, (i16 & 126) | (sh0.a.f159271b << 6) | (i16 & 896));
            sh0.a aVar5 = aVar;
            LocalDate localDate3 = localDate2;
            d92.b.f58625c.getClass();
            r rVarD = x2.d(c2.l.y(aVar2, j92.b.f97899b.f97920e), 1.0f);
            z zVarA2 = y.a(kVar, aVar3, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarD, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            o0VarE.C(1590099307);
            int days = Days.daysBetween(localDate, localDate2).getDays();
            if (days >= 0) {
                int i17 = 0;
                while (true) {
                    if (aVar5 == null) {
                        bVar = null;
                    } else {
                        List<sh0.b> list = aVar5.f159272a;
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                } else {
                                    next = it.next();
                                    str = ((sh0.b) next).f159273a;
                                }
                            } while (!s.g(str != null ? g22.k.v(str, "yyyy-MM-dd") : null, localDate3.minusDays(i17)));
                            bVar = (sh0.b) next;
                        } else {
                            bVar = null;
                        }
                    }
                    int i18 = i16 << 3;
                    o0 o0Var = o0VarE;
                    f.a(bVar != null ? bVar.f159274b : null, i17, localDate3, (xh0.c) p1Var.getF182175a(), lVar2, o0Var, sh0.b.d.f159276d | (i18 & 896) | (i18 & 57344));
                    o0VarE = o0Var;
                    if (i17 == days) {
                        break;
                    }
                    i17++;
                    localDate3 = localDate2;
                    aVar5 = aVar;
                    lVar2 = lVar;
                }
            }
            e5.u(o0VarE, false, true, true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(localDate, localDate2, aVar, lVar, i14, 10);
        }
    }
}
