package z21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import d53.u;
import e23.l;
import g02.i0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.x0;
import u1.w;
import vd0.f0;
import w51.n0;
import yg2.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202003a;

        static {
            int[] iArr = new int[a01.a.values().length];
            try {
                iArr[a01.a.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a01.a.TODAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a01.a.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f202003a = iArr;
        }
    }

    public static final void a(w01.a aVar, l<? super q22.b, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        int i15;
        lVar.getClass();
        o0 o0VarE = mVar.E(942858872);
        int i16 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (aVar == null) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e(aVar, lVar, i14, i17);
                    return;
                }
                return;
            }
            int i18 = aVar.f181006c;
            double d14 = aVar.f181005b;
            double d15 = aVar.f181004a;
            q22.b bVar = aVar.f181008e;
            c cVar = new c(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)));
            String strB = cVar.b(d15, bVar);
            String strA = cVar.a(d14, bVar, i18);
            String strB2 = cVar.b(d15, bVar);
            l22.b bVar2 = cVar.f201996a;
            oi0.b bVar3 = new oi0.b(bVar2, strB2);
            bVar3.D();
            bVar3.O();
            Unit unit = Unit.INSTANCE;
            String str = bVar3.f132238b;
            oi0.b bVar4 = new oi0.b(bVar2, cVar.a(d14, bVar, i18));
            bVar4.D();
            bVar4.O();
            String str2 = bVar4.f132238b;
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            LinkedHashMap linkedHashMap = c0235a.f16962a;
            linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, str);
            linkedHashMap.put("label_secondary", str2);
            b92.a aVarB = c0235a.b();
            b.f201986a.getClass();
            z3.e eVar = b.f201990e;
            z3.e eVarC = z3.f.c(1180738131, new e(aVar, lVar), o0VarE);
            l72.p2 p2Var = l72.p2.f111205a;
            int i19 = b92.a.f16960b;
            o0Var = o0VarE;
            i15 = 2;
            p2Var.h(strB, strA, null, null, aVarB, false, false, eVar, eVarC, null, null, o0Var, 113246208, 0, 1644);
        } else {
            o0Var = o0VarE;
            i15 = 2;
            o0Var.e();
        }
        p2 p2VarI1 = o0Var.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new e(aVar, lVar, i14, i15);
        }
    }

    public static final void b(boolean z14, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1412860120);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = y.Q(o0VarE, R.string.activity_details_nutrition_and_hydration);
            String strJ = z14 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -163421009, R.string.nutrition_and_hydration_save_state, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -163324382, R.string.nutrition_and_hydration_create_power_guide_note, o0VarE, false);
            b.f201986a.getClass();
            p2Var.h(strQ, strJ, null, null, null, false, false, b.f201988c, null, null, null, o0VarE, 12582912, 0, 1916);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i0(z14, i14);
        }
    }

    public static final void c(w01.d dVar, e23.a<Unit> aVar, m mVar, int i14) {
        String str;
        String strP;
        dVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(877891543);
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            c cVar = new c(new l22.a((Context) o0VarE.A(y3Var)));
            String strQ = y.Q(o0VarE, R.string.activity_details_nutrition_and_hydration);
            String strC = cVar.c(dVar);
            l3.a aVar2 = l3.f23124b;
            l22.a aVar3 = new l22.a((Context) o0VarE.A(y3Var));
            Double d14 = dVar.f181043f;
            double dDoubleValue = d14 != null ? d14.doubleValue() : Double.NaN;
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            aVar2.getClass();
            String strV0 = l3.a.V0(aVar3, dDoubleValue, zY);
            a01.a aVar4 = dVar.f181042e;
            int i16 = aVar4 == null ? -1 : a.f202003a[aVar4.ordinal()];
            if (i16 != -1) {
                if (i16 == 1) {
                    o0VarE.C(1211892653);
                    strP = y.P(R.string.nh_recommendation_footer_event, new Object[]{strV0}, o0VarE);
                    o0VarE.g0(false);
                } else if (i16 == 2) {
                    o0VarE.C(1212016653);
                    strP = y.P(R.string.nh_recommendation_footer_today, new Object[]{strV0}, o0VarE);
                    o0VarE.g0(false);
                } else {
                    if (i16 != 3) {
                        throw kg.f.h(o0VarE, 1840207228, false);
                    }
                    o0VarE.C(1212141676);
                    strP = y.P(R.string.nh_recommendation_footer_custom, new Object[]{strV0}, o0VarE);
                    o0VarE.g0(false);
                }
                str = strP;
            } else {
                o0VarE.C(1212251695);
                o0VarE.g0(false);
                str = null;
            }
            String strC2 = cVar.c(dVar);
            l22.b bVar = cVar.f201996a;
            oi0.b bVar2 = new oi0.b(bVar, strC2);
            bVar2.D();
            bVar2.O();
            bVar2.j();
            Unit unit = Unit.INSTANCE;
            String strV = u.v(bVar2.f132238b, bVar.getString(R.string.lbl_calories_abr), bVar.getString(R.string.lbl_calories), false);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", strV);
            b92.a aVarB = c0235a.b();
            b.f201986a.getClass();
            z3.e eVar = b.f201987b;
            r.a aVar5 = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar5, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            l72.p2 p2Var = l72.p2.f111205a;
            int i17 = b92.a.f16960b;
            p2Var.h(strQ, strC, null, null, aVarB, false, false, eVar, null, null, aVar, o0VarE, 12582912, (i15 >> 3) & 14, 876);
            if (str != null) {
                o0VarE.C(1010131392);
                d92.b.f58623a.getClass();
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar2 = j92.b.f97899b;
                c2.l.f(x2.h(aVar5, eVar2.f97918c), o0VarE);
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                bVar4.getClass();
                mh.c(str, c2.l.A(aVar5, eVar2.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1010409121);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xm0.h(dVar, aVar, i14, 26);
        }
    }

    public static final void d(e23.a<Unit> aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(537523845);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = y.Q(o0VarE, R.string.activity_details_nutrition_and_hydration);
            String strQ2 = y.Q(o0VarE, R.string.lbl_nutrition_hydration_weather_data_failed_to_load);
            b.f201986a.getClass();
            p2Var.h(strQ, strQ2, null, null, null, false, false, b.f201989d, null, null, aVar, o0VarE, 12582912, i15 & 14, 892);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n0(aVar, i14, 27);
        }
    }

    public static final void e(w01.f fVar, l<? super w01.e, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        int i15;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1864569804);
        int i16 = (o0VarE.r(fVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (fVar == null) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new d(fVar, lVar, i14, i17);
                    return;
                }
                return;
            }
            int i18 = fVar.f181051c;
            j23.g<Double> gVar = fVar.f181050b;
            j23.g<Double> gVar2 = fVar.f181049a;
            w01.e eVar = fVar.f181053e;
            c cVar = new c(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)));
            String strE = cVar.e(gVar2, eVar);
            String strD = cVar.d(gVar, eVar, i18);
            String strE2 = cVar.e(gVar2, eVar);
            l22.b bVar = cVar.f201996a;
            oi0.b bVar2 = new oi0.b(bVar, strE2);
            bVar2.j();
            Unit unit = Unit.INSTANCE;
            String strV = u.v(bVar2.f132238b, bVar.getString(R.string.lbl_calories_abr), bVar.getString(R.string.lbl_calories), false);
            oi0.b bVar3 = new oi0.b(bVar, cVar.d(gVar, eVar, i18));
            bVar3.j();
            String strV2 = u.v(bVar3.f132238b, bVar.getString(R.string.lbl_calories_abr), bVar.getString(R.string.lbl_calories), false);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            LinkedHashMap linkedHashMap = c0235a.f16962a;
            linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, strV);
            linkedHashMap.put("label_secondary", strV2);
            b92.a aVarB = c0235a.b();
            b.f201986a.getClass();
            z3.e eVar2 = b.f201991f;
            z3.e eVarC = z3.f.c(-1626690545, new d(fVar, lVar), o0VarE);
            l72.p2 p2Var = l72.p2.f111205a;
            int i19 = b92.a.f16960b;
            o0Var = o0VarE;
            i15 = 2;
            p2Var.h(strE, strD, null, null, aVarB, false, false, eVar2, eVarC, null, null, o0Var, 113246208, 0, 1644);
        } else {
            o0Var = o0VarE;
            i15 = 2;
            o0Var.e();
        }
        p2 p2VarI1 = o0Var.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new d(fVar, lVar, i14, i15);
        }
    }

    public static final void f(double d14, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1351332012);
        int i15 = (o0VarE.m(d14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            c cVar = new c(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)));
            String strQ = y.Q(o0VarE, R.string.lbl_power_guide_max_duration);
            String strF = cVar.f(d14);
            oi0.b bVar = new oi0.b(cVar.f201996a, cVar.f(d14));
            bVar.n();
            Unit unit = Unit.INSTANCE;
            String str = bVar.f132238b;
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", str);
            b92.a aVarB = c0235a.b();
            b.f201986a.getClass();
            z3.e eVar = b.f201992g;
            l72.p2 p2Var = l72.p2.f111205a;
            int i16 = b92.a.f16960b;
            o0Var = o0VarE;
            p2Var.h(strQ, strF, null, null, aVarB, false, false, eVar, null, null, null, o0Var, 12582912, 0, 1900);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k82.b(i14, 3, d14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(ArrayList arrayList, int i14, l lVar, m mVar, int i15) {
        o0 o0VarE = mVar.E(-319207407);
        int i16 = (o0VarE.r(arrayList) ? 4 : 2) | i15 | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            b3.b.a aVar3 = b3.b.a.f15503a;
            u4.d dVarA = d3.c.a();
            String strQ = y.Q(o0VarE, R.string.lbl_more);
            long jD = ds.e0.d(d92.b.f58623a, o0VarE);
            d92.b.f58625c.getClass();
            r rVarQ = x2.q(aVar, j92.b.f97901d.f97905d);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new l0(p1Var, 17);
                o0VarE.K(objQ2);
            }
            i7.b(dVarA, strQ, w.d(rVarQ, false, null, null, (e23.a) objQ2, 15), jD, o0VarE, 0, 0);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = e5.o(i14, o0VarE);
            }
            n1 n1Var = (n1) objQ3;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new l0(p1Var, 18);
                o0VarE.K(objQ4);
            }
            i3.u.a(zBooleanValue, (e23.a) objQ4, u1.n.e(aVar, v.h.t(o0VarE), m1.f128891a), 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-823731220, new f0((Object) arrayList, (Object) lVar, (Object) n1Var, p1Var, 11), o0VarE), o0VarE, 48, 48, 2040);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lw1.h(i14, i15, lVar, arrayList);
        }
    }

    public static final void h(a01.a aVar, Double d14, Double d15, e23.a<Unit> aVar2, m mVar, int i14) {
        String strV0;
        boolean z14;
        String strP;
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(523603228);
        int i15 = i14 | (o0VarE.k(aVar.ordinal()) ? 4 : 2) | (o0VarE.B(d14) ? 32 : 16) | (o0VarE.B(d15) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.weather_section_title);
            String strQ2 = y.Q(o0VarE, aVar.f55b);
            if (aVar != a01.a.CUSTOM) {
                o0VarE.C(-656999200);
                o0VarE.C(-656979732);
                l3.a aVar3 = l3.f23124b;
                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                l22.a aVar4 = new l22.a((Context) o0VarE.A(y3Var));
                double dDoubleValue = d14.doubleValue();
                boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                aVar3.getClass();
                strV0 = l3.a.V0(aVar4, dDoubleValue, zY);
                o0VarE.g0(false);
                o0VarE.C(-656607453);
                l22.a aVar5 = new l22.a((Context) o0VarE.A(y3Var));
                double dDoubleValue2 = d15.doubleValue();
                boolean zY2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                aVar3.getClass();
                String strV1 = l3.a.V0(aVar5, dDoubleValue2, zY2);
                z14 = false;
                o0VarE.g0(false);
                strP = y.P(R.string.bracket_pattern, new Object[]{y.P(R.string.string_space_string_pattern, new Object[]{g22.n.e(y.Q(o0VarE, R.string.lbl_feels_like)), strV1}, o0VarE)}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-655959832);
                o0VarE.C(-655911069);
                l3.a aVar6 = l3.f23124b;
                l22.a aVar7 = new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                double dDoubleValue3 = d15.doubleValue();
                boolean zY3 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                aVar6.getClass();
                strV0 = l3.a.V0(aVar7, dDoubleValue3, zY3);
                z14 = false;
                o0VarE.g0(false);
                o0VarE.g0(false);
                strP = "";
            }
            if (strV0.length() == 0 && strP.length() == 0) {
                o0VarE.C(-655453819);
            } else {
                o0VarE.C(-655409024);
                strQ2 = y.P(R.string.string_space_bullet_string_pattern, new Object[]{strQ2, y.P(R.string.string_space_string_pattern, new Object[]{strV0, strP}, o0VarE)}, o0VarE);
            }
            o0VarE.g0(z14);
            b.f201986a.getClass();
            l72.p2.f111205a.h(strQ, strQ2, null, null, null, false, false, b.f201993h, null, null, aVar2, o0VarE, 12607488, 6, 876);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(aVar, d14, d15, aVar2, i14, 18);
        }
    }
}
