package lo;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import org.apache.commons.lang3.time.TimeZones;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public final class s3 {
    private s3() {
    }

    /* JADX WARN: Code duplicated, block: B:225:0x065e A[PHI: r12
      0x065e: PHI (r12v6 com.garmin.android.apps.connectmobile.activities.newmodel.i0) = 
      (r12v5 com.garmin.android.apps.connectmobile.activities.newmodel.i0)
      (r12v5 com.garmin.android.apps.connectmobile.activities.newmodel.i0)
      (r12v53 com.garmin.android.apps.connectmobile.activities.newmodel.i0)
      (r12v53 com.garmin.android.apps.connectmobile.activities.newmodel.i0)
      (r12v53 com.garmin.android.apps.connectmobile.activities.newmodel.i0)
     binds: [B:192:0x0591, B:193:0x0593, B:216:0x063b, B:218:0x0641, B:220:0x064b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:298:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:425:0x0bab  */
    public static com.garmin.android.apps.connectmobile.activities.newmodel.h a(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, f0 f0Var) {
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var;
        ps.a1 a1Var;
        HashMap<String, Double> map;
        ps.a1 a1Var2;
        String str;
        String str2;
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0VarI;
        ps.a1 a1Var3;
        ps.o1 o1Var;
        com.garmin.android.apps.connectmobile.activities.newmodel.s sVar;
        Object objA;
        boolean z14;
        ps.o1 o1Var2;
        boolean z15;
        String str3;
        if (hVar == null) {
            return new com.garmin.android.apps.connectmobile.activities.newmodel.h();
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = new com.garmin.android.apps.connectmobile.activities.newmodel.h();
        hVar2.f29448a = hVar.f29448a;
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var2 = hVar.f29460m;
        HashMap<String, String> map2 = f0Var.Y1;
        HashMap<String, Double> map3 = f0Var.Z1;
        HashMap<String, String> map4 = f0Var.Y1;
        String str4 = f0Var.f113802l2;
        String string = map2.get("name");
        String str5 = hVar.f29449b;
        c22.f3 f3Var = c22.f3.f23054a;
        if (!p005kotlin.jvm.internal.s.g(str5, string)) {
            if (string == null) {
                string = f0Var.f113775f.getContext().getString(R.string.txt_untitle);
                break;
            }
            int length = string.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    string = f0Var.f113775f.getContext().getString(R.string.txt_untitle);
                    break;
                }
                int iCodePointAt = string.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            hVar2.f29449b = string;
        }
        String str6 = map4.get("notes");
        if (!p005kotlin.jvm.internal.s.g(hVar.f29450c, str6)) {
            if (str6 == null) {
                str6 = "";
            }
            hVar2.f29450c = str6;
        }
        am.x0 x0Var = f0Var.J1;
        if (!x0Var.equals(hVar.C())) {
            am.z0 z0Var = am.z0.f4390a;
            hVar2.f29455h = ((am.y0) KoinJavaComponent.get$default(am.y0.class, null, null, 6, null)).f(x0Var);
        }
        ps.a1 a1Var4 = hVar.f29459l;
        ps.a1 a1Var5 = a1Var4 == null ? new ps.a1() : null;
        ps.s1 s1Var = hVar.f29458k;
        if (s1Var == null || TextUtils.isEmpty(s1Var.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String())) {
            Calendar calendar = f0Var.I1;
            c22.j0 j0Var = c22.j0.f23099a;
            calendar.getClass();
            String strF = c22.j0.f(calendar, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
            String strF2 = c22.j0.f(calendar, "yyyy-MM-dd'T'HH:mm:ss.SSS", TimeZone.getTimeZone(TimeZones.GMT_ID));
            com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var3 = new com.garmin.android.apps.connectmobile.activities.newmodel.i0();
            i0Var3.D();
            i0Var3.f29484a = strF;
            i0Var3.f29488b = strF2;
            i0Var = i0Var3;
        } else {
            Calendar calendar2 = f0Var.I1;
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTimeZone(TimeZone.getTimeZone(hVar.f29458k.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String()));
            calendar3.set(1, calendar2.get(1));
            calendar3.set(2, calendar2.get(2));
            calendar3.set(5, calendar2.get(5));
            calendar3.set(10, calendar2.get(10));
            calendar3.set(12, calendar2.get(12));
            calendar3.set(13, calendar2.get(13));
            calendar3.set(9, calendar2.get(9));
            calendar3.set(11, calendar2.get(11));
            calendar3.set(14, calendar2.get(14));
            String strF3 = c22.j0.f(calendar3, "yyyy-MM-dd'T'HH:mm:ss.SSS", calendar3.getTimeZone());
            if (i0Var2 == null || ((str3 = i0Var2.f29484a) != null && strF3.startsWith(str3))) {
                i0Var = null;
            } else {
                String strF4 = c22.j0.f(calendar3, "yyyy-MM-dd'T'HH:mm:ss.SSS", TimeZone.getTimeZone(TimeZones.GMT_ID));
                i0Var = new com.garmin.android.apps.connectmobile.activities.newmodel.i0();
                i0Var.D();
                i0Var.f29484a = strF3;
                i0Var.f29488b = strF4;
            }
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var4 = i0Var;
        if (i0Var2 != null) {
            double dC0 = f0Var.c0("calories");
            a1Var = a1Var4;
            map = map3;
            if (c22.b2.b(Double.valueOf(i0Var2.f29549t), Double.valueOf(dC0))) {
                com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0VarI2 = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0Var4);
                i0VarI2.f29549t = dC0;
                i0VarI = i0VarI2;
            } else {
                i0VarI = i0Var4;
            }
            double dC1 = f0Var.c0("average_heart_rate");
            str2 = "";
            if (c22.b2.b(Double.valueOf(i0Var2.f29560x), Double.valueOf(dC1))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29560x = dC1;
            }
            double dC2 = f0Var.c0("max_heart_rate");
            if (c22.b2.b(Double.valueOf(i0Var2.f29563y), Double.valueOf(dC2))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29563y = dC2;
            }
            double dC3 = f0Var.c0("recovery_heart_rate");
            if (c22.b2.b(Double.valueOf(i0Var2.U2), Double.valueOf(dC3))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.U2 = dC3;
            }
            double dC4 = f0Var.c0("average_respiration_rate");
            if (c22.b2.b(Double.valueOf(i0Var2.f29553u2), Double.valueOf(dC4))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29553u2 = dC4;
            }
            double dC5 = f0Var.c0("max_respiration_rate");
            if (c22.b2.b(Double.valueOf(i0Var2.f29551t2), Double.valueOf(dC5))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29551t2 = dC5;
            }
            double dC6 = f0Var.c0("floors_climbed");
            if (!Double.isNaN(dC6) && dC6 != i0Var2.R1) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.R1 = dC6;
            }
            double dC7 = f0Var.c0("average_temperature");
            if (c22.b2.b(Double.valueOf(i0Var2.F), Double.valueOf(dC7))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.F = dC7;
            }
            double dC8 = f0Var.c0("max_temperature");
            if (c22.b2.b(Double.valueOf(i0Var2.I), Double.valueOf(dC8))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.I = dC8;
            }
            double dC9 = f0Var.c0("min_temperature");
            if (c22.b2.b(Double.valueOf(i0Var2.P), Double.valueOf(dC9))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.P = dC9;
            }
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3 = f0Var.f113778f2;
            if (hVar3 != null ? ar.i.a(hVar3) : false) {
                int i14 = i0Var2.I2;
                int i15 = f0Var.B1;
                if (i14 != i15) {
                    i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI.G2 = i0Var2.G2;
                    i0VarI.I2 = i15;
                }
                int i16 = i0Var2.H2;
                int i17 = f0Var.A1;
                if (i16 != i17) {
                    i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI.G2 = i0Var2.G2;
                    i0VarI.H2 = i17;
                }
            }
            if (f0Var.t0()) {
                double dC10 = f0Var.c0("calories_burned");
                if (c22.b2.b(Double.valueOf(i0Var2.f29549t), Double.valueOf(dC10))) {
                    i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI.f29549t = dC10;
                }
                double dC11 = f0Var.c0("calories_consumed");
                if (c22.b2.b(Double.valueOf(i0Var2.f29546r2), Double.valueOf(dC11))) {
                    i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI.f29546r2 = dC11;
                }
                double dC12 = f0Var.c0("fluids_loss");
                if (c22.b2.b(Double.valueOf(i0Var2.f29559w2), Double.valueOf(dC12))) {
                    com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0VarI3 = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI3.f29559w2 = dC12;
                    i0VarI = i0VarI3;
                }
                double dC13 = f0Var.c0("fluids_consumed");
                if (c22.b2.b(Double.valueOf(i0Var2.f29562x2), Double.valueOf(dC13))) {
                    i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI.f29562x2 = dC13;
                }
            }
            ps.o1 o1VarD = tq.k.d(hVar);
            String str7 = f0Var.J1.f4358a;
            am.z0 z0Var2 = am.z0.f4390a;
            boolean zB = am.z0.b(am.x0.R0, str7);
            if (!zB || o1VarD == null) {
                double dC14 = f0Var.c0("max_speed");
                o1Var2 = o1VarD;
                z15 = zB;
                if (c22.b2.b(Double.valueOf(i0Var2.f29544r), Double.valueOf(dC14))) {
                    i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI.f29544r = dC14;
                }
            } else {
                o1Var2 = o1VarD;
                z15 = zB;
            }
            double dC15 = f0Var.c0("elevation_gain");
            if (c22.b2.b(Double.valueOf(i0Var2.f29526l), Double.valueOf(dC15))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29526l = dC15;
            }
            if (!z15 || o1Var2 == null) {
                double dC16 = f0Var.c0("elevation_loss");
                if (c22.b2.b(Double.valueOf(i0Var2.f29529m), Double.valueOf(dC16))) {
                    i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI.f29529m = dC16;
                }
            }
            double dG0 = f0Var.g0("average_power");
            if (c22.b2.b(Double.valueOf(i0Var2.T), Double.valueOf(dG0))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.T = dG0;
            }
            double dG1 = f0Var.g0("max_power");
            if (c22.b2.b(Double.valueOf(i0Var2.X), Double.valueOf(dG1))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.X = dG1;
            }
            double dG2 = f0Var.g0("max_average_power");
            if (c22.b2.b(Double.valueOf(i0Var2.Y), Double.valueOf(dG2))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.Y = dG2;
            }
            double dY = f0Var.y();
            if (c22.b2.b(Double.valueOf(i0Var2.f29566z), Double.valueOf(dY))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29566z = dY;
            }
            double dX = f0Var.x();
            if (c22.b2.b(Double.valueOf(i0Var2.B), Double.valueOf(dX))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.B = dX;
            }
            double dB0 = f0Var.b0();
            if (c22.b2.b(Double.valueOf(i0Var2.A), Double.valueOf(dB0))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.A = dB0;
            }
            String str8 = f0Var.J1.f4358a;
            am.x0 x0Var2 = am.x0.f4268a3;
            double dC17 = am.z0.b(x0Var2, str8) ? f0Var.c0("average_cadence") : Double.NaN;
            a1Var2 = a1Var5;
            str = "elevation_loss";
            if (c22.b2.b(Double.valueOf(i0Var2.O2), Double.valueOf(dC17))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.O2 = dC17;
            }
            double dC18 = am.z0.b(x0Var2, f0Var.J1.f4358a) ? f0Var.c0("max_cadence") : Double.NaN;
            if (c22.b2.b(Double.valueOf(i0Var2.P2), Double.valueOf(dC18))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.P2 = dC18;
            }
            double dA0 = f0Var.a0();
            if (c22.b2.b(Double.valueOf(i0Var2.C), Double.valueOf(dA0))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.C = dA0;
            }
            if (f0Var.J1 == am.x0.f4313o1) {
                double d14 = f0Var.M1;
                if (!Double.isNaN(d14)) {
                    i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI.f29501e1 = d14;
                }
                double d15 = f0Var.O1;
                if (d15 != i0Var2.f29505f1) {
                    i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI.f29505f1 = d15;
                }
                f0.e eVarA = f0.e.a(f0Var.N1, f0.e.METER);
                ps.z1 z1Var = i0Var2.f29509g1;
                int iIntValue = -1;
                if (z1Var != null && z1Var.getUnitId() != null) {
                    iIntValue = z1Var.getUnitId().intValue();
                }
                if (iIntValue != eVarA.f113855b) {
                    ps.z1 z1Var2 = new ps.z1(Double.valueOf(eVarA.f113856c), Integer.valueOf(eVarA.f113855b), eVarA.f113854a);
                    com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0VarI4 = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI4.f29509g1 = z1Var2;
                    i0VarI = i0VarI4;
                }
            } else {
                double dB = f0Var.b(i0Var2);
                if (c22.b2.b(Double.valueOf(i0Var2.f29538p), Double.valueOf(dB))) {
                    i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI.f29538p = dB;
                }
            }
            double d16 = f0Var.G1;
            if (c22.b2.b(Double.valueOf(i0Var2.f29516i), Double.valueOf(d16))) {
                com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0VarI5 = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI5.f29516i = d16;
                i0VarI = i0VarI5;
            }
            if ((!am.z0.P(f0Var.J1.t()) && !z15) || o1Var2 == null) {
                double dQ = f0Var.q();
                if (c22.b2.b(Double.valueOf(i0Var2.f29512h), Double.valueOf(dQ))) {
                    String buttonBottomLeftLabel = f0Var.f113771e.getButtonBottomLeftLabel();
                    c22.f3 f3Var2 = c22.f3.f23054a;
                    if (!p005kotlin.jvm.internal.s.g(str4, buttonBottomLeftLabel)) {
                        i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                        i0VarI.f29512h = dQ;
                    }
                }
            }
        } else {
            a1Var = a1Var4;
            map = map3;
            a1Var2 = a1Var5;
            str = "elevation_loss";
            str2 = "";
            i0VarI = i0Var4;
        }
        int iX = f0Var.X() == 0 ? 1 : f0Var.X();
        if (!am.z0.O(f0Var.w().t()) || i0Var2 == null) {
            a1Var3 = a1Var2;
        } else {
            String str9 = hVar.f29454g;
            String strY = f0Var.Y();
            c22.f3 f3Var3 = c22.f3.f23054a;
            if (!p005kotlin.jvm.internal.s.g(str9, strY)) {
                hVar2.f29454g = strY;
            }
            if (c22.b2.b(Double.valueOf(i0Var2.f29516i), Double.valueOf(f0Var.c0("elapsed_time")))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29516i = f0Var.c0("elapsed_time");
            }
            double dB2 = c22.l3.b(f0Var.A());
            if (c22.b2.b(Double.valueOf(i0Var2.G()), Double.valueOf(dB2))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.a0(dB2);
            }
            double dH0 = f0Var.h0();
            if (c22.b2.b(Double.valueOf(i0Var2.f29544r), Double.valueOf(dH0))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29544r = dH0;
            }
            double dQ2 = f0Var.q();
            if (!p005kotlin.jvm.internal.s.g(str4, f0Var.f113771e.getButtonBottomLeftLabel()) && (c22.b2.b(Double.valueOf(i0Var2.f29512h), Double.valueOf(dQ2)) || a1Var == null || a1Var.getLapCount() == null || iX != a1Var.getLapCount().intValue())) {
                com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0VarI6 = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI6.f29512h = dQ2 * ((double) iX);
                i0VarI = i0VarI6;
            }
            if (a1Var == null || a1Var.getLapCount() == null || iX == a1Var.getLapCount().intValue()) {
                a1Var3 = a1Var2;
            } else {
                a1Var3 = a1Var2 == null ? new ps.a1() : a1Var2;
                a1Var3.V0(Integer.valueOf(iX));
            }
        }
        if (am.z0.C(f0Var.w().t()) || am.z0.q(f0Var.w().t())) {
            ps.o1 o1VarD2 = tq.k.d(hVar);
            if (o1VarD2 == null) {
                o1Var = new ps.o1();
                o1Var.V1(qs.x.CLIMB_ACTIVE.getF147220a());
                ArrayList arrayList = new ArrayList();
                arrayList.add(o1Var);
                hVar2.a0(arrayList);
            } else {
                hVar2.a0(new ArrayList(hVar.f29464q));
                o1Var = o1VarD2;
            }
            o1Var.M1(Integer.valueOf((int) f0Var.E()));
            if (to.i.SIMPLE.getF165805a().equals(o1VarD2 != null ? o1VarD2.getMode() : str2)) {
                o1Var.v1(Double.valueOf(f0Var.z()));
                o1Var.F1(Double.valueOf(f0Var.Z()));
                o1Var.A1(Double.valueOf(f0Var.p0()));
            } else {
                o1Var.A1(Double.valueOf(f0Var.c0("elevation_gain")));
                o1Var.U1(Integer.valueOf((int) f0Var.F()));
                o1Var.S1(Integer.valueOf((int) f0Var.D()));
                o1Var.G1(am.v1.c(f0Var.J1.f4358a, map4.get("difficultyScale"), map4.get("max_difficulty")));
                if (i0VarI != null) {
                    i0VarI.f29526l = Double.NaN;
                }
            }
        }
        if (am.z0.Z(f0Var.w().t())) {
            ps.o1 o1VarD3 = tq.k.d(hVar);
            if (o1VarD3 == null) {
                o1VarD3 = new ps.o1();
            }
            o1VarD3.V1(qs.x.RUN_ACTIVE.getF147220a());
            o1VarD3.y1(Double.valueOf(f0Var.o()));
            ps.o1 o1VarB = fr.a.b(hVar);
            if (o1VarB == null) {
                o1VarB = new ps.o1();
            }
            o1VarB.V1(qs.x.RUN_REST.getF147220a());
            o1VarB.y1(Double.valueOf(f0Var.c0("restSplitsDuration")));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(o1VarD3);
            arrayList2.add(o1VarB);
            hVar2.a0(arrayList2);
        }
        boolean zP = am.z0.P(f0Var.w().t());
        boolean zB2 = am.z0.b(am.x0.R0, f0Var.w().t());
        if (zP || zB2) {
            if (a1Var != null && a1Var.getLapCount() != null && iX != a1Var.getLapCount().intValue()) {
                if (a1Var3 == null) {
                    a1Var3 = new ps.a1();
                }
                a1Var3.V0(Integer.valueOf(iX));
            }
            ps.o1 o1VarD4 = tq.k.d(hVar);
            if (o1VarD4 != null) {
                o1VarD4.J1(Double.valueOf(f0Var.c0("activeSplitsMovingDuration")));
                o1VarD4.y1(Double.valueOf(f0Var.p() + f0Var.c0("activeSplitsMovingDuration")));
                double dQ3 = f0Var.q();
                if (c22.b2.b(o1VarD4.getDistance(), Double.valueOf(dQ3))) {
                    String buttonBottomLeftLabel2 = f0Var.f113771e.getButtonBottomLeftLabel();
                    c22.f3 f3Var4 = c22.f3.f23054a;
                    if (!p005kotlin.jvm.internal.s.g(str4, buttonBottomLeftLabel2)) {
                        o1VarD4.x1(Double.valueOf(dQ3));
                    }
                }
                double dC19 = f0Var.c0("max_speed");
                if (c22.b2.b(o1VarD4.getMaxSpeed(), Double.valueOf(dC19))) {
                    o1VarD4.I1(Double.valueOf(dC19));
                }
                double dC20 = f0Var.c0(str);
                if (c22.b2.b(o1VarD4.getElevationLoss(), Double.valueOf(dC20))) {
                    o1VarD4.C1(Double.valueOf(dC20));
                }
            }
            ps.o1 o1VarB2 = fr.a.b(hVar);
            if (o1VarB2 != null) {
                double dC21 = f0Var.c0("restSplitsDuration");
                o1VarB2.y1(!Double.isNaN(dC21) ? Double.valueOf(dC21) : null);
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(o1VarD4);
            arrayList3.add(o1VarB2);
            hVar2.a0(arrayList3);
        }
        if (am.z0.B(f0Var.w().t())) {
            i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
            boolean z16 = a1Var != null && hVar.G();
            if (hVar.F()) {
                ExerciseSetsDTO exerciseSetsDTOD = hVar.D();
                exerciseSetsDTOD.getClass();
                if (new ArrayList(Arrays.asList(exerciseSetsDTOD.f41089a)).size() > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            if (i0Var2 == null || !(z14 || z16)) {
                i0VarI.f29516i = f0Var.G1;
            } else {
                i0VarI.f29519j = i0Var2.f29519j;
            }
        } else if (i0Var2 != null) {
            i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
            i0VarI.f29519j = i0Var2.f29519j;
        }
        am.z0 z0Var3 = am.z0.f4390a;
        if (xy2.b.C(z0Var3, f0Var.w().t()) || xy2.b.B(z0Var3, f0Var.w().t())) {
            boolean z17 = am.j.z(f12.l.f68084a);
            double dF0 = f0Var.f0();
            if (i0Var2 != null && c22.b2.b(Double.valueOf(i0Var2.H()), Double.valueOf(dF0))) {
                double dO = c22.l3.o(dF0, z17);
                if (dO >= 0.0d) {
                    i0VarI.f29495c3 = dO;
                } else {
                    i0VarI.f29495c3 = Double.NaN;
                }
            } else if (i0Var2 != null && Double.isNaN(dF0)) {
                i0VarI.f29495c3 = Double.NaN;
            }
        }
        if ((am.z0.X(f0Var.w().t()) || am.z0.a0(f0Var.w().t())) && i0Var2 != null) {
            String str10 = hVar.f29454g;
            String strY2 = f0Var.Y();
            c22.f3 f3Var5 = c22.f3.f23054a;
            if (!p005kotlin.jvm.internal.s.g(str10, strY2)) {
                hVar2.f29454g = strY2;
            }
            ps.o1 o1VarD5 = tq.k.d(hVar);
            if (o1VarD5 == null) {
                o1VarD5 = new ps.o1();
                o1VarD5.V1(qs.x.SURF_ACTIVE.getF147220a());
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(o1VarD5);
                hVar2.a0(arrayList4);
            } else {
                hVar2.a0(new ArrayList(hVar.f29464q));
            }
            o1VarD5.M1(Integer.valueOf((int) f0Var.l0()));
            o1VarD5.y1(Double.valueOf(f0Var.m0()));
            o1VarD5.I1(Double.valueOf(f0Var.n0()));
            double dC22 = f0Var.c0("splitsMaxDistance");
            c22.m3 m3Var = f0Var.f113770d2 ? c22.m3.METER : c22.m3.FOOT;
            c22.l3.f23124b.getClass();
            o1VarD5.D1(Double.valueOf(c22.l3.a.h(dC22, m3Var)));
        }
        if (am.z0.M(hVar.C().t()) && i0Var2 != null) {
            String str11 = hVar.f29454g;
            String strY3 = f0Var.Y();
            c22.f3 f3Var6 = c22.f3.f23054a;
            if (!p005kotlin.jvm.internal.s.g(str11, strY3)) {
                hVar2.f29454g = strY3;
            }
            if (c22.b2.b(Double.valueOf(i0Var2.f29516i), Double.valueOf(f0Var.B()))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29516i = f0Var.B();
            }
            double dC23 = f0Var.c0("totalSurfaceTime") + f0Var.B();
            if (c22.b2.b(Double.valueOf(i0Var2.f29522k), Double.valueOf(dC23))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29522k = dC23;
            }
            if (c22.b2.b(Double.valueOf(i0Var2.f29502e2), Double.valueOf(f0Var.B()))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29502e2 = f0Var.B();
            }
            double dC24 = f0Var.c0("max_depth");
            c22.m3 m3Var2 = am.j.z(f12.l.f68084a) ? c22.m3.METER : c22.m3.FOOT;
            c22.l3.f23124b.getClass();
            double dH = c22.l3.a.h(dC24, m3Var2);
            if (c22.b2.b(Double.valueOf(i0Var2.V1), Double.valueOf(dH))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.V1 = dH;
            }
            Double dU = f0Var.u();
            if (dU != null && c22.b2.b(Double.valueOf(i0Var2.f29496d), dU)) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29496d = dU.doubleValue();
            }
            Double dV = f0Var.v();
            if (dV != null && c22.b2.b(Double.valueOf(i0Var2.f29500e), dV)) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29500e = dV.doubleValue();
            }
            Double dR = f0Var.r();
            if (dR != null && c22.b2.b(Double.valueOf(i0Var2.f29504f), dR)) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29504f = dR.doubleValue();
            }
            Double dS = f0Var.s();
            if (dS != null && c22.b2.b(Double.valueOf(i0Var2.f29508g), dS)) {
                com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0VarI7 = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI7.f29508g = dS.doubleValue();
                i0VarI = i0VarI7;
            }
            com.garmin.android.apps.connectmobile.activities.newmodel.s sVar2 = hVar.f29461n;
            if (sVar2 != null) {
                b(sVar2, f0Var);
                com.garmin.android.apps.connectmobile.activities.newmodel.t tVar = f0Var.K1;
                if (tVar != null) {
                    sVar2.f29668m = tVar;
                }
                hVar2.f29461n = sVar2;
            }
            if (a1Var != null && a1Var.getLapCount() != null && iX != a1Var.getLapCount().intValue()) {
                if (a1Var3 == null) {
                    a1Var3 = new ps.a1();
                }
                a1Var3.V0(Integer.valueOf(iX));
            }
        } else if (am.z0.b(am.x0.D, hVar.C().t()) && i0Var2 != null) {
            String str12 = hVar.f29454g;
            String strY4 = f0Var.Y();
            c22.f3 f3Var7 = c22.f3.f23054a;
            if (!p005kotlin.jvm.internal.s.g(str12, strY4)) {
                hVar2.f29454g = strY4;
            }
            if (c22.b2.b(Double.valueOf(i0Var2.f29502e2), Double.valueOf(f0Var.B()))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29502e2 = f0Var.B();
            }
            if (c22.b2.b(Double.valueOf(i0Var2.f29516i), Double.valueOf(f0Var.B()))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29516i = f0Var.B();
            }
            double dC25 = f0Var.c0("totalSurfaceTime") + f0Var.B();
            if (c22.b2.b(Double.valueOf(i0Var2.f29522k), Double.valueOf(dC25))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29522k = dC25;
            }
            Boolean bool = i0Var2.f29494c2;
            if (!(bool == null ? false : bool.booleanValue()) || f0Var.q0()) {
                Boolean bool2 = i0Var2.f29494c2;
                if (!(bool2 == null ? false : bool2.booleanValue()) && f0Var.q0()) {
                    i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                    i0VarI.f29494c2 = Boolean.valueOf(f0Var.q0());
                }
            } else {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29494c2 = Boolean.valueOf(f0Var.q0());
            }
            c22.m3 m3Var3 = am.j.z(f12.l.f68084a) ? c22.m3.METER : c22.m3.FOOT;
            double dC26 = f0Var.c0("max_depth");
            c22.l3.a aVar = c22.l3.f23124b;
            aVar.getClass();
            double dH2 = c22.l3.a.h(dC26, m3Var3);
            if (c22.b2.b(Double.valueOf(i0Var2.V1), Double.valueOf(dH2))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.V1 = dH2;
            }
            double dH3 = f0Var.H();
            aVar.getClass();
            double dH4 = c22.l3.a.h(dH3, m3Var3);
            if (c22.b2.b(Double.valueOf(i0Var2.F()), Double.valueOf(dH4))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.Z(dH4);
            }
            double dO0 = f0Var.o0();
            if (c22.b2.b(Double.valueOf(i0Var2.M()), Double.valueOf(dO0))) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.c0(dO0);
            }
            Double dU2 = f0Var.u();
            if (dU2 != null && c22.b2.b(Double.valueOf(i0Var2.f29496d), dU2)) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29496d = dU2.doubleValue();
            }
            Double dV2 = f0Var.v();
            if (dV2 != null && c22.b2.b(Double.valueOf(i0Var2.f29500e), dV2)) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29500e = dV2.doubleValue();
            }
            Double dR2 = f0Var.r();
            if (dR2 != null && c22.b2.b(Double.valueOf(i0Var2.f29504f), dR2)) {
                i0VarI = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI.f29504f = dR2.doubleValue();
            }
            Double dS2 = f0Var.s();
            if (dS2 != null && c22.b2.b(Double.valueOf(i0Var2.f29508g), dS2)) {
                com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0VarI8 = com.garmin.android.apps.connectmobile.activities.newmodel.i0.I(i0VarI);
                i0VarI8.f29508g = dS2.doubleValue();
                i0VarI = i0VarI8;
            }
            com.garmin.android.apps.connectmobile.activities.newmodel.t tVar2 = f0Var.K1;
            if (tVar2 == null) {
                tVar2 = new com.garmin.android.apps.connectmobile.activities.newmodel.t();
            }
            if (am.z0.r(hVar2.C().t())) {
                tVar2.G(Double.valueOf(f0Var.e0()));
                tVar2.D(Double.valueOf(f0Var.d0()));
                HashMap<String, Double> map5 = map;
                double dDoubleValue = map5.get("po2HighPointDepth").doubleValue();
                aVar.getClass();
                tVar2.F(Double.valueOf(c22.l3.a.h(dDoubleValue, m3Var3)));
                double dDoubleValue2 = map5.get("po2LowPointDepth").doubleValue();
                aVar.getClass();
                tVar2.H(Double.valueOf(c22.l3.a.h(dDoubleValue2, m3Var3)));
            }
            com.garmin.android.apps.connectmobile.activities.newmodel.s sVar3 = hVar.f29461n;
            if (sVar3 != null) {
                b(sVar3, f0Var);
                sVar3.f29668m = tVar2;
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar4 = f0Var.f113778f2;
                sVar3.C((hVar4 == null || (sVar = hVar4.f29461n) == null) ? null : sVar.f29669n);
                hVar2.f29461n = sVar3;
            }
        }
        com.garmin.android.apps.connectmobile.courses.model.d dVar = f0Var.f113806m2;
        String str13 = dVar != null ? dVar.courseId : null;
        if (a1Var != null && str13 != null && !c22.f3.a(a1Var.getAssociatedCourseId(), str13)) {
            if (a1Var3 == null) {
                a1Var3 = new ps.a1();
            }
            a1Var3.Q0(str13);
        }
        if (bv.b.f21240b.l().H0() && f0Var.r0()) {
            boolean zW = f0Var.W();
            List<Long> listI = f0Var.I();
            boolean z18 = a1Var != null && Boolean.TRUE.equals(a1Var.getHasDog());
            List<Long> listS = (a1Var == null || a1Var.s() == null) ? Collections.EMPTY_LIST : a1Var.s();
            if (zW != z18 || !new HashSet(listI).equals(new HashSet(listS))) {
                if (a1Var3 == null) {
                    a1Var3 = new ps.a1();
                }
                a1Var3.S0(Boolean.valueOf(zW));
                if (!c22.s3.b()) {
                    if (!zW) {
                        listI = Collections.EMPTY_LIST;
                    }
                    a1Var3.R0(listI);
                }
            }
        }
        if (a1Var3 != null) {
            hVar2.M(a1Var3);
        }
        am.l lVarT = f0Var.t();
        ps.a aVar2 = hVar.f29457j;
        if (aVar2 != null) {
            String categoryAccessRule = aVar2.b().getCategoryAccessRule();
            am.l.f4047c.getClass();
            objA = am.l.a.a(categoryAccessRule, am.l.f4051g);
        } else {
            objA = am.l.f4051g;
        }
        if (!lVarT.equals(objA)) {
            hVar2.Z(lVarT);
        }
        qs.g gVarL = f0Var.L();
        if (hVar.f29456i.getTypeId() != null && gVarL.getF147084a() != hVar.f29456i.getTypeId().intValue()) {
            hVar2.I(new ps.p0(gVarL));
        }
        if (i0VarI != null) {
            hVar2.c0(i0VarI);
        }
        return hVar2;
    }

    public static void b(com.garmin.android.apps.connectmobile.activities.newmodel.s sVar, f0 f0Var) {
        double dC0 = f0Var.c0("weight");
        HashMap<String, String> map = f0Var.Y1;
        int i14 = (int) dC0;
        boolean z14 = f0Var.f113762b2;
        if (i14 != sVar.f29656a) {
            sVar.f29656a = i14;
            sVar.f29657b = new ps.z1(null, null, (z14 ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a);
        }
        double dC1 = (int) f0Var.c0("visibility");
        if (dC1 != sVar.f29660e) {
            sVar.f29660e = dC1;
            sVar.f29661f = new ps.z1(null, null, (f0Var.f113766c2 ? qs.y.UNIT_DISTANCE_METER : qs.y.UNIT_DISTANCE_FOOT).f147239a);
        }
        double dC2 = f0Var.c0("totalSurfaceTime");
        if (c22.b2.b(Double.valueOf(sVar.f29667l), Double.valueOf(dC2))) {
            sVar.f29667l = dC2;
        }
        String str = map.get("suit_type");
        if (str != null && !str.equals(sVar.f29658c)) {
            sVar.f29658c = str;
        }
        double dC3 = f0Var.c0("suit_thickness");
        if (c22.b2.b(Double.valueOf(sVar.f29659d), Double.valueOf(dC3))) {
            sVar.f29659d = dC3;
        }
        String str2 = map.get("surface_conditions");
        if (str2 != null && !str2.equals(sVar.f29662g)) {
            sVar.f29662g = str2;
        }
        String str3 = map.get("current");
        if (str3 != null && !str3.equals(sVar.f29663h)) {
            sVar.f29663h = str3;
        }
        String str4 = map.get("entry_type");
        if (str4 != null && !str4.equals(sVar.f29664i)) {
            sVar.f29664i = str4;
        }
        String str5 = map.get("equipment");
        if (str5 != null && !str5.equals(sVar.f29665j)) {
            sVar.f29665j = str5;
        }
        String str6 = map.get("buddy");
        if (str6 == null || str6.equals(sVar.f29666k)) {
            return;
        }
        sVar.f29666k = map.get("buddy");
    }
}
