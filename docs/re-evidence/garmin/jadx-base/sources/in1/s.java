package in1;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.a1;
import c2.b0;
import c2.t2;
import c2.u;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.e5;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import km1.v;
import kotlin.t1;
import l72.w1;
import l72.x0;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94554a;

        static {
            int[] iArr = new int[en1.d.values().length];
            try {
                iArr[en1.d.BREATHING_VARIATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[en1.d.RESTLESS_MOMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[en1.d.AVG_OVERNIGHT_HEART_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[en1.d.RESTING_HEART_RATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[en1.d.BODY_BATTERY_CHANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[en1.d.AVERAGE_SPO2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[en1.d.AVERAGE_RESPIRATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[en1.d.LOWEST_RESPIRATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[en1.d.AVERAGE_OVERNIGHT_HRV.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[en1.d.SEVEN_DAY_AVERAGE_HRV.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[en1.d.LOWEST_SPO2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[en1.d.SKIN_TEMPERATURE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f94554a = iArr;
        }
    }

    public static final void a(t2 t2Var, int i14, p3.m mVar, int i15) {
        int i16;
        t2Var.getClass();
        o0 o0VarE = mVar.E(-426084031);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            y00.a aVar = new y00.a(a0.s(o0VarE));
            String strQ = y.Q(o0VarE, i14);
            int i17 = i16;
            x0 x0Var = x0.f111346a;
            l22.b bVar = aVar.f192984a;
            String string = bVar.getString(R.string.lbl_7d_avg_hrv);
            strQ.getClass();
            b92.a aVarB = rn1.c.b(strQ.length() > 0 ? e5.g(strQ, StringUtils.SPACE, aVar.a()) : e5.g(aVar.a(), StringUtils.SPACE, bVar.getString(R.string.txt_empty_page_no_data)));
            int i18 = i17 & 14;
            int i19 = b92.a.f16960b;
            x0Var.a(i18 | (x0.f111348c << 24), 60, aVarB, t2Var, null, null, strQ, string, null, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(t2Var, i14, i15, 0);
        }
    }

    public static final void b(t2 t2Var, double d14, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-748107101);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(t2Var) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.m(d14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            w00.b bVar = new w00.b(a0.s(o0VarE));
            x0 x0Var = x0.f111346a;
            String strE = bVar.e(d14);
            String string = bVar.f180999a.getString(R.string.lbl_avg_overnight_heart_rate);
            String strJ = bVar.j();
            b92.a aVarB = rn1.c.b(bVar.b(d14));
            int i16 = b92.a.f16960b;
            x0Var.a((i15 & 14) | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strE, string, strJ, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(t2Var, d14, i14, 0);
        }
    }

    public static final void c(t2 t2Var, double d14, p3.m mVar, int i14) {
        int i15;
        t2Var.getClass();
        o0 o0VarE = mVar.E(1484940219);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(t2Var) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.m(d14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            a10.a aVar = new a10.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            x0 x0Var = x0.f111346a;
            String strD = aVar.d(Float.valueOf((float) d14), false, true);
            String str = d14 > 0.0d ? aVar.f244c : null;
            String string = aVar.f242a.getString(R.string.lbl_avg_respiration);
            b92.a aVarB = rn1.c.b(aVar.a(d14));
            int i16 = b92.a.f16960b;
            x0Var.a((i15 & 14) | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strD, string, str, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(t2Var, d14, i14, 2);
        }
    }

    public static final void d(t2 t2Var, int i14, p3.m mVar, int i15) {
        int i16;
        String strG;
        o0 o0VarE = mVar.E(702171635);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            v00.a aVar = new v00.a(a0.s(o0VarE));
            int i17 = i16;
            x0 x0Var = x0.f111346a;
            o0VarE.C(2056915560);
            v00.a aVar2 = new v00.a(a0.s(o0VarE));
            String string = i14 <= -100 ? aVar2.f174198a.getString(R.string.no_value) : aVar2.a(Integer.valueOf(i14));
            o0VarE.g0(false);
            String str = string;
            l22.b bVar = aVar.f174198a;
            String string2 = bVar.getString(R.string.lbl_body_battery_change);
            if (i14 >= -100) {
                strG = bVar.getString(i14 >= 0 ? R.string.lbl_plus : R.string.lbl_minus) + StringUtils.SPACE + i14 + StringUtils.SPACE + bVar.getString(R.string.lbl_body_battery_change);
            } else {
                strG = e5.g(bVar.getString(R.string.lbl_body_battery_change), StringUtils.SPACE, bVar.getString(R.string.txt_empty_page_no_data));
            }
            b92.a aVarB = rn1.c.b(strG);
            int i18 = i17 & 14;
            int i19 = b92.a.f16960b;
            x0Var.a(i18 | (x0.f111348c << 24), 60, aVarB, t2Var, null, null, str, string2, null, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(t2Var, i14, i15, 5);
        }
    }

    public static final void e(t2 t2Var, String str, p3.m mVar, int i14) {
        int i15;
        Object next;
        o0 o0VarE = mVar.E(-1509104026);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
            b10.b bVar = new b10.b((Context) o0VarE.A(y3Var));
            w13.c cVar = vl1.a.f178703i;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!((vl1.a) next).f178705b.contains(str));
            vl1.a aVar = (vl1.a) next;
            Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f178704a) : null;
            int i16 = i15;
            x0 x0Var = x0.f111346a;
            String strA = dVar.a(numValueOf);
            String string = dVar.f14215a.getString(R.string.lbl_breathing_variations);
            int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
            b10.d dVar2 = bVar.f14209c;
            b92.a aVarB = rn1.c.b(iIntValue > 0 ? com.nimbusds.jose.shaded.gson.internal.a.h(dVar2.a(Integer.valueOf(iIntValue)), StringUtils.SPACE, dVar2.f14215a.getString(R.string.lbl_breathing_variations), StringUtils.SPACE) : e5.g(dVar2.f14215a.getString(R.string.lbl_breathing_variations), StringUtils.SPACE, bVar.f14208b.getString(R.string.txt_empty_page_no_data)));
            int i17 = i16 & 14;
            int i18 = b92.a.f16960b;
            x0Var.a(i17 | (x0.f111348c << 24), 60, aVarB, t2Var, null, null, strA, string, null, null, o0VarE);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(t2Var, str, i14, 0);
        }
    }

    public static final void f(t2 t2Var, en1.d dVar, km1.c cVar, p3.m mVar, int i14) {
        int i15;
        String breathingDisruptionSeverity;
        v dailySleep;
        Integer restlessMomentsCount;
        v dailySleep2;
        Double avgHeartRate;
        Integer restingHeartRate;
        Integer bodyBatteryChange;
        v dailySleep3;
        Integer averageSpO2Value;
        v dailySleep4;
        Double averageRespirationValue;
        v dailySleep5;
        Double lowestRespirationValue;
        Integer avgOvernightHrv;
        v dailySleep6;
        Integer lowestSpO2Value;
        o0 o0VarE = mVar.E(41283631);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int iIntValue = -1;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(dVar == null ? -1 : dVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            double dDoubleValue = 0.0d;
            switch (dVar == null ? -1 : a.f94554a[dVar.ordinal()]) {
                case -1:
                    o0VarE.C(1521842705);
                    o0VarE.g0(false);
                    break;
                case 0:
                default:
                    throw kg.f.h(o0VarE, 1018868471, false);
                case 1:
                    o0VarE.C(1018869129);
                    if (cVar == null || (dailySleep = cVar.getDailySleep()) == null || (breathingDisruptionSeverity = dailySleep.getBreathingDisruptionSeverity()) == null) {
                        breathingDisruptionSeverity = "";
                    }
                    e(t2Var, breathingDisruptionSeverity, o0VarE, i15 & 14);
                    o0VarE.g0(false);
                    break;
                case 2:
                    o0VarE.C(1018873694);
                    if (cVar != null && (restlessMomentsCount = cVar.getRestlessMomentsCount()) != null) {
                        iIntValue = restlessMomentsCount.intValue();
                    }
                    k(t2Var, iIntValue, o0VarE, i15 & 14);
                    o0VarE.g0(false);
                    break;
                case 3:
                    o0VarE.C(1018878190);
                    if (cVar != null && (dailySleep2 = cVar.getDailySleep()) != null && (avgHeartRate = dailySleep2.getAvgHeartRate()) != null) {
                        dDoubleValue = avgHeartRate.doubleValue();
                    }
                    b(t2Var, dDoubleValue, o0VarE, i15 & 14);
                    o0VarE.g0(false);
                    break;
                case 4:
                    o0VarE.C(1018882966);
                    j(t2Var, (cVar == null || (restingHeartRate = cVar.getRestingHeartRate()) == null) ? 0 : restingHeartRate.intValue(), o0VarE, i15 & 14);
                    o0VarE.g0(false);
                    break;
                case 5:
                    o0VarE.C(1018887036);
                    d(t2Var, (cVar == null || (bodyBatteryChange = cVar.getBodyBatteryChange()) == null) ? -101 : bodyBatteryChange.intValue(), o0VarE, i15 & 14);
                    o0VarE.g0(false);
                    break;
                case 6:
                    o0VarE.C(1018891066);
                    p(t2Var, (cVar == null || (dailySleep3 = cVar.getDailySleep()) == null || (averageSpO2Value = dailySleep3.getAverageSpO2Value()) == null) ? 0 : averageSpO2Value.intValue(), o0VarE, i15 & 14);
                    o0VarE.g0(false);
                    break;
                case 7:
                    o0VarE.C(1018895275);
                    if (cVar != null && (dailySleep4 = cVar.getDailySleep()) != null && (averageRespirationValue = dailySleep4.getAverageRespirationValue()) != null) {
                        dDoubleValue = averageRespirationValue.doubleValue();
                    }
                    c(t2Var, dDoubleValue, o0VarE, i15 & 14);
                    o0VarE.g0(false);
                    break;
                case 8:
                    o0VarE.C(1018899980);
                    if (cVar != null && (dailySleep5 = cVar.getDailySleep()) != null && (lowestRespirationValue = dailySleep5.getLowestRespirationValue()) != null) {
                        dDoubleValue = lowestRespirationValue.doubleValue();
                    }
                    g(t2Var, dDoubleValue, o0VarE, i15 & 14);
                    o0VarE.g0(false);
                    break;
                case 9:
                    o0VarE.C(1018904777);
                    i(t2Var, (cVar == null || (avgOvernightHrv = cVar.getAvgOvernightHrv()) == null) ? 0 : avgOvernightHrv.intValue(), o0VarE, i15 & 14);
                    o0VarE.g0(false);
                    break;
                case 10:
                    o0VarE.C(1018908499);
                    a(t2Var, cVar != null ? cVar.k() : -1, o0VarE, i15 & 14);
                    o0VarE.g0(false);
                    break;
                case 11:
                    o0VarE.C(1018912223);
                    h(t2Var, (cVar == null || (dailySleep6 = cVar.getDailySleep()) == null || (lowestSpO2Value = dailySleep6.getLowestSpO2Value()) == null) ? 0 : lowestSpO2Value.intValue(), o0VarE, i15 & 14);
                    o0VarE.g0(false);
                    break;
                case 12:
                    o0VarE.C(1521643158);
                    if (cVar != null && cVar.A0()) {
                        o0VarE.C(1521698679);
                        o(t2Var, o0VarE, i15 & 14);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1521763934);
                        n(t2Var, cVar, o0VarE, ((i15 >> 3) & 112) | (i15 & 14) | (km1.c.B << 3));
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                    break;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(t2Var, dVar, cVar, i14, 16);
        }
    }

    public static final void g(t2 t2Var, double d14, p3.m mVar, int i14) {
        int i15;
        t2Var.getClass();
        o0 o0VarE = mVar.E(-643873202);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(t2Var) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.m(d14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            a10.a aVar = new a10.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            x0 x0Var = x0.f111346a;
            String strD = aVar.d(Float.valueOf((float) d14), false, true);
            String str = d14 > 0.0d ? aVar.f244c : null;
            l22.a aVar2 = aVar.f242a;
            String string = aVar2.getString(R.string.lbl_lowest_respiration);
            String string2 = aVar2.getString(R.string.lbl_lowest_respiration);
            b92.a aVarB = rn1.c.b(d14 > 0.0d ? e5.g(aVar.c(d14), StringUtils.SPACE, string2) : e5.g(string2, StringUtils.SPACE, aVar2.getString(R.string.txt_empty_page_no_data)));
            int i16 = b92.a.f16960b;
            x0Var.a((i15 & 14) | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strD, string, str, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(t2Var, d14, i14, 1);
        }
    }

    public static final void h(t2 t2Var, int i14, p3.m mVar, int i15) {
        int i16;
        t2Var.getClass();
        o0 o0VarE = mVar.E(1145515192);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            z00.a aVar = new z00.a(a0.s(o0VarE));
            int i17 = i16;
            x0 x0Var = x0.f111346a;
            String strR = r(o0VarE, i14);
            l22.b bVar = aVar.f200726a;
            String string = bVar.getString(R.string.lbl_lowest_spo2);
            String str = i14 > 0 ? "%" : null;
            b92.a aVarB = rn1.c.b(i14 > 0 ? org.apache.commons.lang3.e.d(i14, StringUtils.SPACE, bVar.a(R.string.lbl_level_peripheral_oxygen_saturation, bVar.getString(R.string.lbl_lowest))) : e5.g(bVar.a(R.string.lbl_level_peripheral_oxygen_saturation, bVar.getString(R.string.lbl_lowest)), StringUtils.SPACE, bVar.getString(R.string.txt_empty_page_no_data)));
            int i18 = i17 & 14;
            int i19 = b92.a.f16960b;
            x0Var.a(i18 | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strR, string, str, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(t2Var, i14, i15, 1);
        }
    }

    public static final void i(t2 t2Var, int i14, p3.m mVar, int i15) {
        int i16;
        String strG;
        t2Var.getClass();
        o0 o0VarE = mVar.E(-1715462226);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            y00.a aVar = new y00.a(a0.s(o0VarE));
            int i17 = i16;
            x0 x0Var = x0.f111346a;
            String strValueOf = String.valueOf(i14);
            l22.b bVar = aVar.f192984a;
            String string = bVar.getString(R.string.lbl_ms);
            String string2 = bVar.getString(R.string.lbl_avg_overnight_hrv);
            if (i14 > 0) {
                strG = i14 + StringUtils.SPACE + bVar.getString(R.string.lbl_milliseconds) + StringUtils.SPACE + aVar.b();
            } else {
                strG = e5.g(aVar.b(), StringUtils.SPACE, bVar.getString(R.string.txt_empty_page_no_data));
            }
            b92.a aVarB = rn1.c.b(strG);
            int i18 = i17 & 14;
            int i19 = b92.a.f16960b;
            x0Var.a(i18 | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strValueOf, string2, string, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(t2Var, i14, i15, 3);
        }
    }

    public static final void j(t2 t2Var, int i14, p3.m mVar, int i15) {
        int i16;
        String strG;
        o0 o0VarE = mVar.E(-449291362);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            w00.b bVar = new w00.b(a0.s(o0VarE));
            int i17 = i16;
            x0 x0Var = x0.f111346a;
            String strD = bVar.d(i14, false);
            l22.b bVar2 = bVar.f180999a;
            String string = bVar2.getString(R.string.hr_zones_lbl_resting_heart_rate);
            String strJ = bVar.j();
            if (i14 > 0) {
                strG = i14 + StringUtils.SPACE + bVar2.getString(R.string.lbl_heart_rate_beats_per_minute) + StringUtils.SPACE + bVar2.getString(R.string.hr_zones_lbl_resting_heart_rate);
            } else {
                strG = e5.g(bVar2.getString(R.string.hr_zones_lbl_resting_heart_rate), StringUtils.SPACE, bVar2.getString(R.string.txt_empty_page_no_data));
            }
            b92.a aVarB = rn1.c.b(strG);
            int i18 = i17 & 14;
            int i19 = b92.a.f16960b;
            x0Var.a(i18 | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strD, string, strJ, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(t2Var, i14, i15, 6);
        }
    }

    public static final void k(t2 t2Var, int i14, p3.m mVar, int i15) {
        int i16;
        String strG;
        o0 o0VarE = mVar.E(1728548136);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
            b10.b bVar = new b10.b((Context) o0VarE.A(y3Var));
            int i17 = i16;
            x0 x0Var = x0.f111346a;
            String strR = r(o0VarE, i14);
            String string = dVar.f14215a.getString(R.string.lbl_restless_moments);
            l22.a aVar = bVar.f14208b;
            if (i14 >= 0) {
                strG = i14 + StringUtils.SPACE + aVar.getString(R.string.lbl_restless_moments) + StringUtils.SPACE;
            } else {
                strG = e5.g(bVar.f14209c.f14215a.getString(R.string.lbl_restless_moments), StringUtils.SPACE, aVar.getString(R.string.txt_empty_page_no_data));
            }
            b92.a aVarB = rn1.c.b(strG);
            int i18 = i17 & 14;
            int i19 = b92.a.f16960b;
            x0Var.a(i18 | (x0.f111348c << 24), 60, aVarB, t2Var, null, null, strR, string, null, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(t2Var, i14, i15, 2);
        }
    }

    public static final void l(List<? extends en1.d> list, h4.r rVar, km1.c cVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1198700766);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            x0 x0Var = x0.f111346a;
            g6.f.a aVar = g6.f.f75994b;
            x0Var.e(c2.l.A(rVar, 0.0f, 16, 1), z3.f.c(105001513, new r(list, cVar, 1), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(list, rVar, cVar, i14, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    public static final void m(List list, km1.c cVar, w1 w1Var, l72.x1 x1Var, boolean z14, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(735722293);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(w1Var.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(x1Var.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.k(R.string.msg_see_skin_temp_after_wearing_device) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 1048576 : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var2 = p3.n.f135158a;
            Configuration configuration = (Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a);
            boolean z15 = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b() > 1.3f;
            w1 w1Var2 = z15 ? w1.TopStart : w1Var;
            int i16 = z15 ? configuration.screenWidthDp : configuration.screenWidthDp / 2;
            String strQ = y.Q(o0VarE, R.string.msg_see_skin_temp_after_wearing_device);
            Integer numValueOf = Integer.valueOf(i16);
            boolean z16 = (i15 & 3670016) == 1048576;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new ii0.h(aVar, 18);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ii0.h(aVar, 18);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            a1.a(strQ, w1Var2, x1Var, numValueOf, 0L, z14, (e23.a) objQ, z3.f.c(2031635088, new r(list, cVar, 0), o0VarE), o0Var, (i15 & 7168) | 100663296 | ((i15 << 3) & 3670016), 34);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(list, cVar, w1Var, x1Var, z14, aVar, i14, 12);
        }
    }

    public static final void n(t2 t2Var, km1.c cVar, p3.m mVar, int i14) {
        int i15;
        boolean zA;
        t2Var.getClass();
        o0 o0VarE = mVar.E(-587642797);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            on1.a aVar = new on1.a(a0.s(o0VarE));
            Double avgSkinTempDeviationC = null;
            boolean z14 = aVar.f133044b;
            if (z14) {
                if (cVar != null) {
                    avgSkinTempDeviationC = cVar.getAvgSkinTempDeviationF();
                }
            } else if (cVar != null) {
                avgSkinTempDeviationC = cVar.getAvgSkinTempDeviationC();
            }
            double dDoubleValue = avgSkinTempDeviationC != null ? avgSkinTempDeviationC.doubleValue() : -100.0d;
            if (z14) {
                em1.a aVar2 = em1.a.f64616a;
                Double dValueOf = Double.valueOf(dDoubleValue);
                aVar2.getClass();
                zA = em1.a.b(dValueOf);
            } else {
                em1.a aVar3 = em1.a.f64616a;
                Double dValueOf2 = Double.valueOf(dDoubleValue);
                aVar3.getClass();
                zA = em1.a.a(dValueOf2);
            }
            int i16 = i15;
            x0 x0Var = x0.f111346a;
            l22.b bVar = aVar.f133043a;
            x0Var.a((i16 & 14) | (x0.f111348c << 24), 124, null, t2Var, null, null, zA ? aVar.a(dDoubleValue) : bVar.getString(R.string.no_value), bVar.getString(R.string.lbl_avg_skin_temp_change), null, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(t2Var, cVar, i14, 1);
        }
    }

    public static final void o(t2 t2Var, p3.m mVar, int i14) {
        int i15;
        t2Var.getClass();
        o0 o0VarE = mVar.E(-427846258);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            on1.a aVar = new on1.a(a0.s(o0VarE));
            int i16 = i15;
            x0 x0Var = x0.f111346a;
            l22.b bVar = aVar.f133043a;
            x0Var.a((i16 & 14) | (x0.f111348c << 24), 124, null, t2Var, null, null, bVar.getString(R.string.lbl_calibrating), bVar.getString(R.string.lbl_avg_skin_temp_change), null, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(t2Var, i14, 0);
        }
    }

    public static final void p(t2 t2Var, int i14, p3.m mVar, int i15) {
        int i16;
        t2Var.getClass();
        o0 o0VarE = mVar.E(-1361434806);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            z00.a aVar = new z00.a(a0.s(o0VarE));
            int i17 = i16;
            x0 x0Var = x0.f111346a;
            String strR = r(o0VarE, i14);
            String string = aVar.f200726a.getString(R.string.pulse_ox_avg_spo2);
            String str = i14 > 0 ? "%" : null;
            b92.a aVarB = rn1.c.b(aVar.a(i14));
            int i18 = i17 & 14;
            int i19 = b92.a.f16960b;
            x0Var.a(i18 | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strR, string, str, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(t2Var, i14, i15, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0294  */
    /* JADX WARN: Code duplicated, block: B:105:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0266  */
    /* JADX WARN: Code duplicated, block: B:97:0x0272  */
    /* JADX WARN: Code duplicated, block: B:98:0x0275  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r6v0, types: [p3.m, p3.o0] */
    public static final void q(km1.c cVar, sm1.s sVar, p3.m mVar, int i14) {
        ?? r14;
        ?? r15;
        ?? r16;
        boolean z14;
        ?? r17;
        w1 w1Var;
        boolean zR;
        Object objQ;
        km1.c cVar2 = cVar;
        sVar.getClass();
        ?? E = mVar.E(1195198871);
        p3.c<?> cVar3 = E.f135177b;
        int i15 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? E.B(cVar2) : E.r(cVar2) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= E.r(sVar) ? 32 : 16;
        }
        int i16 = i15;
        if (E.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(sVar.f160188h, E);
            sn1.b bVar = sn1.b.f160414a;
            Integer num = ((sm1.a0) p1VarC.getF182175a()).f160097m;
            int iIntValue = num != null ? num.intValue() : 0;
            bVar.getClass();
            ArrayList arrayListA = sn1.b.a(cVar2, iIntValue);
            ArrayList arrayList = new ArrayList();
            if (arrayListA.contains(rl1.i.BREATHING_VARIATIONS)) {
                arrayList.add(en1.d.BREATHING_VARIATIONS);
            }
            if (sn1.b.g()) {
                arrayList.add(en1.d.RESTLESS_MOMENTS);
            }
            bv.b.f21239a.getClass();
            bv.b.a();
            if (k1.f37122a.n0()) {
                arrayList.add(en1.d.AVG_OVERNIGHT_HEART_RATE);
            }
            if (arrayListA.contains(rl1.i.RESTING_HEART_RATE)) {
                arrayList.add(en1.d.RESTING_HEART_RATE);
            }
            if (arrayListA.contains(rl1.i.BODY_BATTERY)) {
                arrayList.add(en1.d.BODY_BATTERY_CHANGE);
            }
            if (arrayListA.contains(rl1.i.PULSE_OX)) {
                arrayList.add(en1.d.AVERAGE_SPO2);
                arrayList.add(en1.d.LOWEST_SPO2);
            }
            if (arrayListA.contains(rl1.i.RESPIRATION) || arrayListA.contains(rl1.i.RESPIRATION_AVERAGES)) {
                arrayList.add(en1.d.AVERAGE_RESPIRATION);
                arrayList.add(en1.d.LOWEST_RESPIRATION);
            }
            if (arrayListA.contains(rl1.i.OVERNIGHT_HRV)) {
                arrayList.add(en1.d.AVERAGE_OVERNIGHT_HRV);
                arrayList.add(en1.d.SEVEN_DAY_AVERAGE_HRV);
            }
            if (arrayListA.contains(rl1.i.SKIN_TEMP)) {
                arrayList.add(en1.d.SKIN_TEMPERATURE);
            }
            if (arrayList.isEmpty()) {
                r15 = 0;
                E.C(893026219);
                E.g0(false);
            } else {
                E.C(891069623);
                h4.r.a aVar = h4.r.S;
                h4.r rVarB = h4.p.b(aVar, Float.MAX_VALUE);
                h4.d.f81522a.getClass();
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(E.U);
                i2 i2VarA0 = E.a0();
                h4.r rVarC = h4.k.c(rVarB, E);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (cVar3 == null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar2);
                } else {
                    E.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, z0VarD, E);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, E);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, E, iHashCode, bVar2);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, E);
                u uVar = u.f22885a;
                h4.r rVarE = u1.n.e(aVar, tn.k.b(d92.b.f58623a, E), m1.f128891a);
                float f14 = 16;
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarF = x2.f(c2.l.C(rVarE, f14, f14, f14, 0.0f, 8), 1.0f);
                c2.j.f22691a.getClass();
                z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, E, 0);
                int iHashCode2 = Long.hashCode(E.U);
                i2 i2VarA1 = E.a0();
                h4.r rVarC2 = h4.k.c(rVarF, E);
                if (cVar3 == null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar2);
                } else {
                    E.c();
                }
                b4.c(eVar, zVarA, E);
                b4.c(c1623g, i2VarA1, E);
                if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, E, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, E);
                b0 b0Var = b0.f22601a;
                String strQ = y.Q(E, R.string.lbl_sleep_metrics);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), E);
                h4.r rVarC3 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, f14, 7);
                ?? r18 = 0;
                mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, E, 48, 0, 131068);
                E.C(-382014767);
                for (List list : h0.i1(arrayList, 2, 2, true)) {
                    en1.d dVar = en1.d.SKIN_TEMPERATURE;
                    if (list.contains(dVar)) {
                        if (cVar != null) {
                            z14 = true;
                            if (cVar.A0()) {
                                r17 = 1;
                            }
                            if (r17 != 0) {
                                E.C(-135033608);
                                if (h0.d0(list) == dVar) {
                                    w1Var = w1.BottomStart;
                                } else {
                                    w1Var = w1.BottomCenter;
                                }
                                l72.x1 x1Var2 = l72.x1.Center;
                                boolean z15 = ((sm1.a0) p1VarC.getF182175a()).f160095k;
                                zR = E.r(sVar);
                                objQ = E.q();
                                if (zR) {
                                    objQ = new l(sVar, r18);
                                    E.K(objQ);
                                } else {
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new l(sVar, r18);
                                        E.K(objQ);
                                    }
                                }
                                r16 = r18;
                                m(list, cVar, w1Var, x1Var2, z15, (e23.a) objQ, E, (km1.c.B << 3) | 3072 | ((i16 << 3) & 112));
                                E.g0(r16);
                            }
                            r18 = r16;
                        } else {
                            z14 = true;
                        }
                        r17 = r18;
                        if (r17 != 0) {
                            E.C(-135033608);
                            if (h0.d0(list) == dVar) {
                                w1Var = w1.BottomStart;
                            } else {
                                w1Var = w1.BottomCenter;
                            }
                            l72.x1 x1Var3 = l72.x1.Center;
                            boolean z16 = ((sm1.a0) p1VarC.getF182175a()).f160095k;
                            zR = E.r(sVar);
                            objQ = E.q();
                            if (zR) {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new l(sVar, r18);
                                    E.K(objQ);
                                }
                            } else {
                                objQ = new l(sVar, r18);
                                E.K(objQ);
                            }
                            r16 = r18;
                            m(list, cVar, w1Var, x1Var3, z16, (e23.a) objQ, E, (km1.c.B << 3) | 3072 | ((i16 << 3) & 112));
                            E.g0(r16);
                        }
                        r18 = r16;
                    }
                    r16 = r18;
                    if (list.contains(en1.d.BREATHING_VARIATIONS)) {
                        E.C(-134080172);
                        l(list, h4.r.S, cVar, E, (km1.c.B << 6) | 48 | ((i16 << 6) & 896));
                        E.g0(r16);
                    } else {
                        E.C(965510574);
                        l(list, h4.r.S, cVar, E, (km1.c.B << 6) | 48 | ((i16 << 6) & 896));
                        E.g0(r16);
                    }
                    r18 = r16;
                }
                cVar2 = cVar;
                ?? r19 = r18;
                E.g0(r19);
                E.g0(true);
                E.g0(true);
                E.g0(r19);
                r15 = r19;
            }
            x1 x1Var4 = p3.n.f135158a;
            r14 = r15;
        } else {
            r14 = 0;
            E.e();
        }
        p2 p2VarI0 = E.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(cVar2, sVar, i14, r14);
        }
    }

    public static final String r(p3.m mVar, int i14) {
        String strValueOf;
        mVar.C(-1013315580);
        x1 x1Var = p3.n.f135158a;
        if (i14 <= 0) {
            mVar.C(1640743201);
            strValueOf = y.Q(mVar, R.string.no_value);
            mVar.f();
        } else {
            mVar.C(1640801822);
            mVar.f();
            strValueOf = String.valueOf(i14);
        }
        mVar.f();
        return strValueOf;
    }
}
