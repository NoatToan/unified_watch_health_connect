package rn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.t2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import ds.e0;
import h4.r;
import i3.e5;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import l72.x0;
import mg2.o;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153652a;

        static {
            int[] iArr = new int[rl1.i.values().length];
            try {
                iArr[rl1.i.RESTING_HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rl1.i.OVERNIGHT_HEART_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rl1.i.BODY_BATTERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rl1.i.PULSE_OX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rl1.i.RESPIRATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rl1.i.RESPIRATION_AVERAGES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rl1.i.SKIN_TEMP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f153652a = iArr;
        }
    }

    public static final void a(t2 t2Var, mm1.a aVar, p3.m mVar, int i14) {
        int i15;
        String strG;
        Double averageBodyBatteryChange;
        t2Var.getClass();
        o0 o0VarE = mVar.E(-1126590755);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            v00.a aVar2 = new v00.a(a0.s(o0VarE));
            int iB = (aVar == null || (averageBodyBatteryChange = aVar.getAverageBodyBatteryChange()) == null) ? -101 : MathKt.b(averageBodyBatteryChange.doubleValue());
            int i16 = i15;
            x0 x0Var = x0.f111346a;
            o0VarE.C(1217925278);
            v00.a aVar3 = new v00.a(a0.s(o0VarE));
            String string = iB <= -100 ? aVar3.f174198a.getString(R.string.no_value) : aVar3.a(Integer.valueOf(iB));
            o0VarE.g0(false);
            String str = string;
            l22.b bVar = aVar2.f174198a;
            String string2 = bVar.getString(R.string.lbl_avg_body_battery_change);
            if (iB >= -100) {
                strG = bVar.getString(iB >= 0 ? R.string.lbl_plus : R.string.lbl_minus) + StringUtils.SPACE + iB + StringUtils.SPACE + aVar2.b();
            } else {
                strG = e5.g(aVar2.b(), StringUtils.SPACE, bVar.getString(R.string.txt_empty_page_no_data));
            }
            b92.a aVarB = c.b(strG);
            int i17 = i16 & 14;
            int i18 = b92.a.f16960b;
            x0Var.a(i17 | (x0.f111348c << 24), 60, aVarB, t2Var, null, null, str, string2, null, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(t2Var, aVar, i14, 0);
        }
    }

    public static final void b(t2 t2Var, rl1.i iVar, mm1.a aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(2932015);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(iVar == null ? -1 : iVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (iVar != null) {
                o0VarE.C(1448455981);
                switch (a.f153652a[iVar.ordinal()]) {
                    case 1:
                        o0VarE.C(-1477294388);
                        f(t2Var, aVar, o0VarE, ((i15 >> 3) & 112) | (i15 & 14) | (mm1.a.f119613m << 3));
                        o0VarE.g0(false);
                        break;
                    case 2:
                        o0VarE.C(-1477291314);
                        c(t2Var, aVar, o0VarE, ((i15 >> 3) & 112) | (i15 & 14) | (mm1.a.f119613m << 3));
                        o0VarE.g0(false);
                        break;
                    case 3:
                        o0VarE.C(-1477288441);
                        a(t2Var, aVar, o0VarE, ((i15 >> 3) & 112) | (i15 & 14) | (mm1.a.f119613m << 3));
                        o0VarE.g0(false);
                        break;
                    case 4:
                        o0VarE.C(-1477285917);
                        d(t2Var, aVar, o0VarE, ((i15 >> 3) & 112) | (i15 & 14) | (mm1.a.f119613m << 3));
                        o0VarE.g0(false);
                        break;
                    case 5:
                    case 6:
                        o0VarE.C(-1477280953);
                        e(t2Var, aVar, o0VarE, ((i15 >> 3) & 112) | (i15 & 14) | (mm1.a.f119613m << 3));
                        o0VarE.g0(false);
                        break;
                    case 7:
                        o0VarE.C(-1477278396);
                        g(t2Var, aVar, o0VarE, ((i15 >> 3) & 112) | (i15 & 14) | (mm1.a.f119613m << 3));
                        o0VarE.g0(false);
                        break;
                    default:
                        o0VarE.C(-1477277057);
                        x0.f111346a.h(t2Var, o0VarE, (i15 & 14) | (x0.f111348c << 3));
                        o0VarE.g0(false);
                        break;
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(1449089683);
                x0.f111346a.h(t2Var, o0VarE, (i15 & 14) | (x0.f111348c << 3));
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(t2Var, iVar, aVar, i14, 24);
        }
    }

    public static final void c(t2 t2Var, mm1.a aVar, p3.m mVar, int i14) {
        int i15;
        Double meanAvgHeartRate;
        t2Var.getClass();
        o0 o0VarE = mVar.E(1079663470);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            w00.b bVar = new w00.b(a0.s(o0VarE));
            double dDoubleValue = (aVar == null || (meanAvgHeartRate = aVar.getMeanAvgHeartRate()) == null) ? 0.0d : meanAvgHeartRate.doubleValue();
            int i16 = i15;
            x0 x0Var = x0.f111346a;
            String strE = bVar.e(dDoubleValue);
            String string = bVar.f180999a.getString(R.string.lbl_avg_overnight_heart_rate);
            String strJ = bVar.j();
            b92.a aVarB = c.b(bVar.b(dDoubleValue));
            int i17 = b92.a.f16960b;
            x0Var.a((i16 & 14) | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strE, string, strJ, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(t2Var, aVar, i14, 2);
        }
    }

    public static final void d(t2 t2Var, mm1.a aVar, p3.m mVar, int i14) {
        int i15;
        Double averageSpO2;
        t2Var.getClass();
        o0 o0VarE = mVar.E(-2011567450);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        int iB = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            z00.a aVar2 = new z00.a(a0.s(o0VarE));
            if (aVar != null && (averageSpO2 = aVar.getAverageSpO2()) != null) {
                iB = MathKt.b(averageSpO2.doubleValue());
            }
            int i16 = i15;
            x0 x0Var = x0.f111346a;
            String strI = i(o0VarE, iB);
            String string = aVar2.f200726a.getString(R.string.pulse_ox_avg_spo2);
            String str = iB > 0 ? "%" : null;
            b92.a aVarB = c.b(aVar2.a(iB));
            int i17 = i16 & 14;
            int i18 = b92.a.f16960b;
            x0Var.a(i17 | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strI, string, str, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(t2Var, aVar, i14, 5);
        }
    }

    public static final void e(t2 t2Var, mm1.a aVar, p3.m mVar, int i14) {
        int i15;
        Double averageRespiration;
        t2Var.getClass();
        o0 o0VarE = mVar.E(-115668180);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            a10.a aVar2 = new a10.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            double dDoubleValue = (aVar == null || (averageRespiration = aVar.getAverageRespiration()) == null) ? 0.0d : averageRespiration.doubleValue();
            int i16 = i15;
            x0 x0Var = x0.f111346a;
            String strD = aVar2.d(Float.valueOf((float) dDoubleValue), false, true);
            String str = dDoubleValue > 0.0d ? aVar2.f244c : null;
            String string = aVar2.f242a.getString(R.string.lbl_avg_respiration);
            b92.a aVarB = c.b(aVar2.a(dDoubleValue));
            int i17 = b92.a.f16960b;
            x0Var.a((i16 & 14) | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strD, string, str, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(t2Var, aVar, i14, 1);
        }
    }

    public static final void f(t2 t2Var, mm1.a aVar, p3.m mVar, int i14) {
        int i15;
        String strG;
        Double averageRestingHeartRate;
        t2Var.getClass();
        o0 o0VarE = mVar.E(1315911224);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            w00.b bVar = new w00.b(a0.s(o0VarE));
            int iB = (aVar == null || (averageRestingHeartRate = aVar.getAverageRestingHeartRate()) == null) ? 0 : MathKt.b(averageRestingHeartRate.doubleValue());
            int i16 = i15;
            x0 x0Var = x0.f111346a;
            String strD = bVar.d(iB, false);
            l22.b bVar2 = bVar.f180999a;
            String string = bVar2.getString(R.string.lbl_avg_resting_heart_rate);
            String strJ = bVar.j();
            if (iB > 0) {
                strG = iB + StringUtils.SPACE + bVar2.getString(R.string.lbl_heart_rate_beats_per_minute) + StringUtils.SPACE + bVar.h();
            } else {
                strG = e5.g(bVar.h(), StringUtils.SPACE, bVar2.getString(R.string.txt_empty_page_no_data));
            }
            b92.a aVarB = c.b(strG);
            int i17 = b92.a.f16960b;
            x0Var.a((i16 & 14) | (x0.f111348c << 24), 52, aVarB, t2Var, null, null, strD, string, strJ, null, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(t2Var, aVar, i14, 4);
        }
    }

    public static final void g(t2 t2Var, mm1.a aVar, p3.m mVar, int i14) {
        int i15;
        boolean zA;
        t2Var.getClass();
        o0 o0VarE = mVar.E(1747030143);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            on1.a aVar2 = new on1.a(a0.s(o0VarE));
            Double averageSkinTempC = null;
            boolean z14 = aVar2.f133044b;
            if (z14) {
                if (aVar != null) {
                    averageSkinTempC = aVar.getAverageSkinTempF();
                }
            } else if (aVar != null) {
                averageSkinTempC = aVar.getAverageSkinTempC();
            }
            double dDoubleValue = averageSkinTempC != null ? averageSkinTempC.doubleValue() : -101.0d;
            if (z14) {
                em1.a aVar3 = em1.a.f64616a;
                Double dValueOf = Double.valueOf(dDoubleValue);
                aVar3.getClass();
                zA = em1.a.b(dValueOf);
            } else {
                em1.a aVar4 = em1.a.f64616a;
                Double dValueOf2 = Double.valueOf(dDoubleValue);
                aVar4.getClass();
                zA = em1.a.a(dValueOf2);
            }
            l22.b bVar = aVar2.f133043a;
            if (zA) {
                o0VarE.C(-638120757);
                x0.f111346a.a((i15 & 14) | (x0.f111348c << 24), 124, null, t2Var, null, null, aVar2.a(dDoubleValue), bVar.getString(R.string.lbl_avg_skin_temp_change), null, null, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-637932866);
                x0.f111346a.a((i15 & 14) | (x0.f111348c << 24), 124, null, t2Var, null, null, bVar.getString(R.string.no_value), bVar.getString(R.string.lbl_avg_skin_temp_change), null, null, o0VarE);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(t2Var, aVar, i14, 3);
        }
    }

    public static final void h(mm1.a aVar, Integer num, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1199481325);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.B(num) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            sn1.b.f160414a.getClass();
            ArrayList arrayList = new ArrayList(sn1.b.c(num));
            arrayList.remove(rl1.i.OVERNIGHT_HRV);
            if (arrayList.isEmpty()) {
                o0VarE.C(-377868811);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-379387191);
                r.a aVar2 = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                float f15 = eVar.f97920e;
                r rVarF = x2.f(u1.n.e(c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13), e0.f(o0VarE), m1.f128891a), 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = h4.k.c(rVarF, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
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
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_sleep_metric_averages);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                bVar.getClass();
                mh.c(strQ, c2.l.y(aVar2, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
                b10.b bVar3 = new b10.b((Context) o0VarE.A(y3Var));
                x0 x0Var = x0.f111346a;
                bVar.getClass();
                x0Var.e(c2.l.y(aVar2, f15), z3.f.c(13088707, new mw0.h(aVar, dVar, bVar3, arrayList, 13), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
                o0VarE.C(2143173061);
                for (List list : h0.i1(arrayList, 2, 2, true)) {
                    x0 x0Var2 = x0.f111346a;
                    r.a aVar4 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    x0Var2.e(c2.l.y(aVar4, j92.b.f97899b.f97920e), z3.f.c(1787849880, new o72.b(28, list, aVar), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
                }
                e5.u(o0VarE, false, true, false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(aVar, num, i14, 21);
        }
    }

    public static final String i(p3.m mVar, int i14) {
        String strValueOf;
        mVar.C(-530807750);
        x1 x1Var = p3.n.f135158a;
        if (i14 <= 0) {
            mVar.C(775967019);
            strValueOf = gl1.y.Q(mVar, R.string.no_value);
            mVar.f();
        } else {
            mVar.C(776025640);
            mVar.f();
            strValueOf = String.valueOf(i14);
        }
        mVar.f();
        return strValueOf;
    }
}
