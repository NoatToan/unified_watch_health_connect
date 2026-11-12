package t42;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
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
import q42.g0;
import q42.w;
import q42.y;
import s70.j1;

/* JADX INFO: loaded from: classes10.dex */
public final class t {
    public static final void a(l42.f fVar, e23.l<? super b63.o, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        Double dValueOf;
        double dP1;
        o0 o0VarE = mVar.E(163988187);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strL = new pi0.e(context).l(fVar.getStartDate(), fVar.b(), pi0.f.SHORT_MONTH_NO_WEEKDAY);
            Double weight = fVar.getWeightAverageDto().getWeight();
            String strI = null;
            if (weight != null) {
                double dDoubleValue = weight.doubleValue();
                l3.f23124b.getClass();
                dValueOf = Double.valueOf(l3.a.P1(dDoubleValue));
            } else {
                dValueOf = null;
            }
            if (dValueOf != null) {
                double dDoubleValue2 = dValueOf.doubleValue();
                k42.b bVar = k42.b.f102880a;
                Double dValueOf2 = Double.valueOf(dDoubleValue2);
                bVar.getClass();
                strI = k42.b.i(context, dValueOf2);
            }
            String str = strI;
            Double weightDelta = fVar.getWeightDelta();
            if (weightDelta != null) {
                double dDoubleValue3 = weightDelta.doubleValue();
                l3.f23124b.getClass();
                dP1 = l3.a.P1(dDoubleValue3);
            } else {
                dP1 = 0.0d;
            }
            k42.b bVar2 = k42.b.f102880a;
            Double dValueOf3 = Double.valueOf(Math.abs(dP1));
            bVar2.getClass();
            String strI2 = k42.b.i(context, dValueOf3);
            int iP = k42.b.p(fVar.getWeightDelta());
            String strO = k42.b.o(context, fVar.getWeightDelta(), strI2);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new t21.u(26);
                o0VarE.K(objQ);
            }
            String strA = oi0.c.A(context, (e23.l) objQ, strO);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar3.getClass();
            h4.r rVarZ = c2.l.z(aVar, f14, eVar.f97918c);
            z3.e eVarC = z3.f.c(691244903, new i(iP, 1, str, strA, strI2), o0VarE);
            boolean z15 = (i15 & 112) == 32;
            if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !o0VarE.r(fVar))) {
                z14 = false;
            }
            boolean z16 = z15 | z14;
            Object objQ2 = o0VarE.q();
            if (z16 || objQ2 == c2565a) {
                objQ2 = new j1(21, lVar, fVar);
                o0VarE.K(objQ2);
            }
            l72.l.d(strL, null, eVarC, rVarZ, null, false, (e23.a) objQ2, o0VarE, 384, 50);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(fVar, lVar, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x03ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v40 */
    public static final void b(y yVar, DateTime dateTime, DateTime dateTime2, e23.l<? super b63.o, Unit> lVar, p3.m mVar, int i14) {
        y yVar2;
        o0 o0Var;
        Double dValueOf;
        Double weight;
        boolean z14;
        String strJ;
        boolean z15;
        Double bodyWater;
        Integer boneMass;
        Integer muscleMass;
        o0 o0Var2;
        ?? r14;
        Object obj;
        l42.e eVar;
        l42.e eVar2;
        yVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-229781674);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(yVar) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(dateTime2) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarG = f0.G(yVar.f142757m, o0VarE);
            p1 p1VarC = s9.c.c(yVar.f142754j, o0VarE);
            g0 g0Var = (g0) p1VarC.getF182175a();
            l42.g weightAverageDto = (g0Var == null || (eVar2 = g0Var.f142643a) == null) ? null : eVar2.getWeightAverageDto();
            g0 g0Var2 = (g0) p1VarC.getF182175a();
            List<l42.f> listB = (g0Var2 == null || (eVar = g0Var2.f142643a) == null) ? null : eVar.b();
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            g0 g0Var3 = (g0) p1VarC.getF182175a();
            if (g0Var3 == null) {
                o0VarE.C(97656586);
                o0VarE.g0(false);
                r14 = 0;
                z15 = true;
                o0Var2 = o0VarE;
            } else {
                o0VarE.C(97656587);
                Parcelable.Creator<l42.e> creator = l42.e.CREATOR;
                v.a(yVar, dateTime, dateTime2, g0Var3, o0VarE, (i15 & 14) | 3072 | (i15 & 112) | (i15 & 896) | 32768);
                h4.r rVarE = u1.n.e(aVar, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
                l42.g gVar = weightAverageDto;
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                k42.b.f102880a.getClass();
                String strQ = k42.b.q(context);
                String strQ2 = gl1.y.Q(o0VarE, R.string.no_value);
                Double weight2 = gVar != null ? gVar.getWeight() : null;
                if (weight2 != null) {
                    l3.a aVar4 = l3.f23124b;
                    double dDoubleValue = weight2.doubleValue();
                    aVar4.getClass();
                    strQ2 = k42.b.j(context, k42.b.c(l3.a.P1(dDoubleValue)), false, l3.f23130h);
                }
                if ((gVar != null ? gVar.getBmi() : null) == null || p005kotlin.jvm.internal.s.c(gVar.getBmi(), 0.0d)) {
                    l3.a aVar5 = l3.f23124b;
                    double dDoubleValue2 = (gVar == null || (weight = gVar.getWeight()) == null) ? 0.0d : weight.doubleValue();
                    aVar5.getClass();
                    dValueOf = Double.valueOf(k42.b.b(l3.a.P1(dDoubleValue2)));
                } else {
                    dValueOf = gVar.getBmi();
                }
                String strQ3 = gl1.y.Q(o0VarE, R.string.no_value);
                l3.f23124b.getClass();
                String strD = k42.b.d(dValueOf, strQ3, l3.f23130h);
                Double bodyFat = gVar != null ? gVar.getBodyFat() : null;
                String string = (bodyFat == null || bodyFat.doubleValue() <= 0.0d) ? null : context.getString(R.string.lbl_value_percent, k42.b.g(bodyFat));
                String strJ2 = (gVar == null || (muscleMass = gVar.getMuscleMass()) == null) ? null : k42.b.j(context, k42.b.c(l3.a.P1(muscleMass.intValue())), false, l3.f23130h);
                if (gVar == null || (boneMass = gVar.getBoneMass()) == null) {
                    z14 = false;
                    strJ = null;
                } else {
                    z14 = false;
                    strJ = k42.b.j(context, k42.b.c(l3.a.P1(boneMass.intValue())), false, l3.f23130h);
                }
                String string2 = (gVar == null || (bodyWater = gVar.getBodyWater()) == null) ? null : context.getString(R.string.lbl_value_percent, k42.b.g(Double.valueOf(bodyWater.doubleValue())));
                o0 o0Var3 = o0VarE;
                z15 = true;
                String str = string;
                String str2 = strJ;
                boolean z16 = z14;
                s.b(strQ2, strQ, strD, str, strJ2, str2, string2, o0Var3, 0);
                o0Var3.g0(true);
                d92.b.f58625c.getClass();
                h4.r rVarC3 = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                z zVarA3 = c2.y.a(kVar, aVar2, o0Var3, z16 ? 1 : 0);
                int iHashCode3 = Long.hashCode(o0Var3.U);
                i2 i2VarA2 = o0Var3.a0();
                h4.r rVarC4 = h4.k.c(rVarC3, o0Var3);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var3.z();
                if (o0Var3.T) {
                    o0Var3.M(aVar3);
                } else {
                    o0Var3.c();
                }
                b4.c(eVar3, zVarA3, o0Var3);
                b4.c(c1623g, i2VarA2, o0Var3);
                if (o0Var3.T || !p005kotlin.jvm.internal.s.g(o0Var3.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0Var3, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC4, o0Var3);
                if (listB == null) {
                    o0Var3.C(-1202474431);
                    o0Var3.g0(z16);
                } else {
                    o0Var3.C(-1202474430);
                    Iterator it = listB.iterator();
                    while (it.hasNext()) {
                        a((l42.f) it.next(), lVar, o0Var3, l42.f.f109941g | ((i15 >> 6) & 112));
                    }
                    o0Var3.g0(z16);
                    Unit unit = Unit.INSTANCE;
                }
                o0Var3.g0(true);
                Unit unit2 = Unit.INSTANCE;
                o0Var3.g0(z16);
                r14 = z16;
                o0Var2 = o0Var3;
            }
            v60.a aVar6 = (v60.a) p1VarG.getF182175a();
            if (aVar6 == null || aVar6.f175792a != z15) {
                yVar2 = yVar;
                o0Var2.C(101332598);
                o0Var2.g0(r14);
            } else {
                o0Var2.C(101180760);
                v60.a aVar7 = (v60.a) p1VarG.getF182175a();
                String str3 = aVar7 != null ? aVar7.f175793b : null;
                yVar2 = yVar;
                boolean zR = o0Var2.r(yVar2);
                Object objQ = o0Var2.q();
                if (zR) {
                    obj = objQ;
                    w wVar = new w(yVar2, 3);
                    o0Var2.K(wVar);
                    obj = wVar;
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        obj = objQ;
                        w wVar2 = new w(yVar2, 3);
                        o0Var2.K(wVar2);
                        obj = wVar2;
                    }
                }
                obj = objQ;
                g.a(r14, (e23.a) obj, str3, o0Var2);
                o0Var2.g0(r14);
            }
            o0Var2.g0(z15);
            x1 x1Var2 = p3.n.f135158a;
            o0Var = o0Var2;
        } else {
            yVar2 = yVar;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(yVar2, dateTime, dateTime2, lVar, i14, 1);
        }
    }
}
