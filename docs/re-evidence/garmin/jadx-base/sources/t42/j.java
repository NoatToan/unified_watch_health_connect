package t42;

import android.content.Context;
import android.os.Parcelable;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.z;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import o53.f0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import q42.w;
import q42.y;
import s70.j1;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    public static final void a(l42.b bVar, e23.l<? super b63.o, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        Double dValueOf;
        double dP1;
        Double weightDelta;
        Double weight;
        o0 o0VarE = mVar.E(2015628605);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            new q42.h(context);
            String strA = new pi0.e(context).a(bVar.d(), qi0.a.WEEKDAY);
            DateTime dateTimeD = bVar.d();
            context.getClass();
            String strB = j0.b(dateTimeD, "MMM d, yyyy", null);
            k42.b.f102880a.getClass();
            if (k42.b.r()) {
                if (bVar.getNumberOfWeightEntries() > 1) {
                    strB = context.getString(R.string.string_space_bullet_string_pattern, strB, context.getString(R.string.lbl_weigh_ins, String.valueOf(bVar.getNumberOfWeightEntries())));
                } else {
                    l42.c cVarF = bVar.f();
                    Long lValueOf = cVarF != null ? Long.valueOf(cVarF.m()) : null;
                    if (lValueOf != null && lValueOf.longValue() > 0) {
                        strB = context.getString(R.string.string_at_string_pattern, strB, DateFormat.getTimeFormat(context).format(new Date(lValueOf.longValue())));
                    }
                }
            }
            l42.c cVarF2 = bVar.f();
            int iP = k42.b.p(cVarF2 != null ? cVarF2.getWeightDelta() : null);
            l42.c cVarF3 = bVar.f();
            if (cVarF3 == null || (weight = cVarF3.getWeight()) == null) {
                dValueOf = null;
            } else {
                double dDoubleValue = weight.doubleValue();
                l3.f23124b.getClass();
                dValueOf = Double.valueOf(l3.a.P1(dDoubleValue));
            }
            String strI = k42.b.i(context, dValueOf);
            l42.c cVarF4 = bVar.f();
            if (cVarF4 == null || (weightDelta = cVarF4.getWeightDelta()) == null) {
                dP1 = 0.0d;
            } else {
                double dDoubleValue2 = weightDelta.doubleValue();
                l3.f23124b.getClass();
                dP1 = l3.a.P1(dDoubleValue2);
            }
            String strI2 = k42.b.i(context, Double.valueOf(Math.abs(dP1)));
            l42.c cVarF5 = bVar.f();
            String strO = k42.b.o(context, cVarF5 != null ? cVarF5.getWeightDelta() : null, strI2);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new t21.u(15);
                o0VarE.K(objQ);
            }
            String strA2 = oi0.c.A(context, (e23.l) objQ, strO);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            h4.r rVarZ = c2.l.z(aVar, f14, eVar.f97918c);
            z3.e eVarC = z3.f.c(-1487729463, new i(iP, 0, strI, strA2, strI2), o0VarE);
            boolean z14 = ((i15 & 112) == 32) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(bVar)));
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new j1(20, lVar, bVar);
                o0VarE.K(objQ2);
            }
            l72.l.d(strA, strB, eVarC, rVarZ, null, false, (e23.a) objQ2, o0VarE, 384, 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(bVar, lVar, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x039c  */
    /* JADX WARN: Code duplicated, block: B:135:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x0215 A[EDGE_INSN: B:83:0x0215->B:84:0x021d BREAK  A[LOOP:1: B:72:0x01dd->B:150:0x01dd]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    public static final void b(y yVar, DateTime dateTime, DateTime dateTime2, e23.l<? super b63.o, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        p1 p1Var;
        q42.g gVar;
        l42.k kVar;
        q42.g gVar2;
        zk0.g gVar3;
        q42.g gVar4;
        ?? r14;
        ?? r15;
        y yVar2;
        o0 o0Var2;
        v60.a aVar;
        Object obj;
        String strJ;
        Double dValueOf;
        String string;
        String strJ2;
        boolean z14;
        String strJ3;
        String string2;
        yVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(967088314);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(yVar) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(dateTime2) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarG = f0.G(yVar.f142757m, o0VarE);
            p1 p1VarC = s9.c.c(yVar.f142752h, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA = c2.y.a(kVar2, aVar3, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                p1Var = p1VarC;
            } else {
                p1Var = p1VarC;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                gVar = (q42.g) p1Var.getF182175a();
                if (gVar != null) {
                    kVar = gVar.f142641a;
                } else {
                    kVar = null;
                }
                gVar2 = (q42.g) p1Var.getF182175a();
                if (gVar2 != null) {
                    gVar3 = gVar2.f142642b;
                } else {
                    gVar3 = null;
                }
                o0VarE.C(1931834090);
                gVar4 = (q42.g) p1Var.getF182175a();
                if (gVar4 != null || kVar == null || gVar3 == null) {
                    r14 = 1;
                    r15 = 0;
                    yVar2 = yVar;
                    o0Var2 = o0VarE;
                } else {
                    Parcelable.Creator<l42.k> creator = l42.k.CREATOR;
                    o0 o0Var3 = o0VarE;
                    yVar2 = yVar;
                    o.a(yVar2, dateTime, dateTime2, gVar4, o0Var3, (i15 & 14) | 3072 | (i15 & 112) | (i15 & 896) | 32768);
                    h4.r rVarE = u1.n.e(aVar2, tn.k.b(d92.b.f58623a, o0Var3), m1.f128891a);
                    z zVarA2 = c2.y.a(kVar2, aVar3, o0Var3, 0);
                    int iHashCode2 = Long.hashCode(o0Var3.U);
                    i2 i2VarA1 = o0Var3.a0();
                    h4.r rVarC2 = h4.k.c(rVarE, o0Var3);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var3.z();
                    if (o0Var3.T) {
                        o0Var3.M(aVar4);
                    } else {
                        o0Var3.c();
                    }
                    b4.c(eVar, zVarA2, o0Var3);
                    b4.c(c1623g, i2VarA1, o0Var3);
                    if (o0Var3.T || !p005kotlin.jvm.internal.s.g(o0Var3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0Var3, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0Var3);
                    Double weight = kVar.getTotalAverage().getWeight();
                    if (weight != null) {
                        o0Var3.C(-1679834948);
                        o0Var3.g0(false);
                        l3.a aVar5 = l3.f23124b;
                        double dDoubleValue = weight.doubleValue();
                        aVar5.getClass();
                        strJ = k42.b.j(context, k42.b.c(l3.a.P1(dDoubleValue)), false, l3.f23130h);
                    } else {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0Var3, -1679616987, R.string.no_value, o0Var3, false);
                    }
                    String str = strJ;
                    if (kVar.getTotalAverage().getBmi() != null && !p005kotlin.jvm.internal.s.c(kVar.getTotalAverage().getBmi(), 0.0d)) {
                        dValueOf = kVar.getTotalAverage().getBmi();
                        break;
                    }
                    k42.b bVar2 = k42.b.f102880a;
                    List<l42.b> listB = kVar.b();
                    bVar2.getClass();
                    if (listB == null) {
                        dValueOf = kVar.getTotalAverage().getBmi();
                        break;
                    }
                    Iterator<l42.b> it = listB.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            dValueOf = kVar.getTotalAverage().getBmi();
                            break;
                        }
                        l42.c latestWeight = it.next().getLatestWeight();
                        if (latestWeight != null && !"INDEX_SCALE".equals(latestWeight.getSourceType())) {
                            l3.a aVar6 = l3.f23124b;
                            double dDoubleValue2 = weight != null ? weight.doubleValue() : 0.0d;
                            aVar6.getClass();
                            dValueOf = Double.valueOf(k42.b.b(l3.a.P1(dDoubleValue2)));
                            break;
                        }
                    }
                    String strQ = gl1.y.Q(o0Var3, R.string.no_value);
                    l3.f23124b.getClass();
                    String strD = k42.b.d(dValueOf, strQ, l3.f23130h);
                    Double bodyFat = kVar.getTotalAverage().getBodyFat();
                    if (bodyFat == null || bodyFat.doubleValue() <= 0.0d) {
                        string = null;
                    } else {
                        k42.b.f102880a.getClass();
                        string = context.getString(R.string.lbl_value_percent, k42.b.g(bodyFat));
                    }
                    if (kVar.getTotalAverage().getMuscleMass() != null) {
                        Integer muscleMass = kVar.getTotalAverage().getMuscleMass();
                        muscleMass.getClass();
                        strJ2 = k42.b.j(context, k42.b.c(l3.a.P1(muscleMass.intValue())), false, l3.f23130h);
                    } else {
                        strJ2 = null;
                    }
                    if (kVar.getTotalAverage().getBoneMass() != null) {
                        Integer boneMass = kVar.getTotalAverage().getBoneMass();
                        boneMass.getClass();
                        z14 = false;
                        strJ3 = k42.b.j(context, k42.b.c(l3.a.P1(boneMass.intValue())), false, l3.f23130h);
                    } else {
                        z14 = false;
                        strJ3 = null;
                    }
                    Double bodyWater = kVar.getTotalAverage().getBodyWater();
                    if (bodyWater != null) {
                        double dDoubleValue3 = bodyWater.doubleValue();
                        k42.b bVar3 = k42.b.f102880a;
                        Double dValueOf2 = Double.valueOf(dDoubleValue3);
                        bVar3.getClass();
                        string2 = context.getString(R.string.lbl_value_percent, k42.b.g(dValueOf2));
                    } else {
                        string2 = null;
                    }
                    k42.b.f102880a.getClass();
                    String strQ2 = k42.b.q(context);
                    String str2 = strJ2;
                    boolean z15 = z14;
                    r14 = 1;
                    s.b(str, strQ2, strD, string, str2, strJ3, string2, o0Var3, 0);
                    o0Var3.g0(true);
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC3 = c2.l.C(aVar7, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = c2.y.a(kVar3, h4.d.a.f81536n, o0Var3, z15 ? 1 : 0);
                    x1 x1Var2 = p3.n.f135158a;
                    int iHashCode3 = Long.hashCode(o0Var3.U);
                    i2 i2VarA2 = o0Var3.a0();
                    h4.r rVarC4 = h4.k.c(rVarC3, o0Var3);
                    h5.g.V.getClass();
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var3.z();
                    if (o0Var3.T) {
                        o0Var3.M(aVar8);
                    } else {
                        o0Var3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, o0Var3);
                    b4.c(h5.g.a.f81809f, i2VarA2, o0Var3);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (o0Var3.T || !p005kotlin.jvm.internal.s.g(o0Var3.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, o0Var3, iHashCode3, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, o0Var3);
                    b0 b0Var2 = b0.f22601a;
                    o0Var3.C(-792285506);
                    Iterator<T> it3 = kVar.b().iterator();
                    while (it3.hasNext()) {
                        a((l42.b) it3.next(), lVar, o0Var3, l42.b.f109915f | ((i15 >> 6) & 112));
                    }
                    o0Var3.g0(z15);
                    o0Var3.g0(true);
                    Unit unit = Unit.INSTANCE;
                    r15 = z15;
                    o0Var2 = o0Var3;
                }
                o0Var2.g0(r15);
                aVar = (v60.a) p1VarG.getF182175a();
                if (aVar == null && aVar.f175792a == r14) {
                    o0Var2.C(-238869996);
                    v60.a aVar9 = (v60.a) p1VarG.getF182175a();
                    String str3 = aVar9 != null ? aVar9.f175793b : null;
                    boolean zR = o0Var2.r(yVar2);
                    Object objQ = o0Var2.q();
                    if (zR) {
                        obj = objQ;
                        w wVar = new w(yVar2, r14);
                        o0Var2.K(wVar);
                        obj = wVar;
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj = objQ;
                            w wVar2 = new w(yVar2, r14);
                            o0Var2.K(wVar2);
                            obj = wVar2;
                        }
                    }
                    obj = objQ;
                    g.a(r15, (e23.a) obj, str3, o0Var2);
                    o0Var2.g0(r15);
                } else {
                    o0Var2.C(-238718158);
                    o0Var2.g0(r15);
                }
                o0Var2.g0(r14);
                x1 x1Var3 = p3.n.f135158a;
                o0Var = o0Var2;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            b0 b0Var3 = b0.f22601a;
            gVar = (q42.g) p1Var.getF182175a();
            if (gVar != null) {
                kVar = gVar.f142641a;
            } else {
                kVar = null;
            }
            gVar2 = (q42.g) p1Var.getF182175a();
            if (gVar2 != null) {
                gVar3 = gVar2.f142642b;
            } else {
                gVar3 = null;
            }
            o0VarE.C(1931834090);
            gVar4 = (q42.g) p1Var.getF182175a();
            if (gVar4 != null) {
                r14 = 1;
                r15 = 0;
                yVar2 = yVar;
                o0Var2 = o0VarE;
            } else {
                r14 = 1;
                r15 = 0;
                yVar2 = yVar;
                o0Var2 = o0VarE;
            }
            o0Var2.g0(r15);
            aVar = (v60.a) p1VarG.getF182175a();
            if (aVar == null) {
                o0Var2.C(-238718158);
                o0Var2.g0(r15);
            } else {
                o0Var2.C(-238718158);
                o0Var2.g0(r15);
            }
            o0Var2.g0(r14);
            x1 x1Var4 = p3.n.f135158a;
            o0Var = o0Var2;
        } else {
            o0 o0Var4 = o0VarE;
            o0Var4.e();
            o0Var = o0Var4;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(yVar, dateTime, dateTime2, lVar, i14, 0);
        }
    }
}
