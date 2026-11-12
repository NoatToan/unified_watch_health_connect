package bm;

import am.r1;
import am.x0;
import am.y0;
import am.z0;
import android.content.Context;
import android.text.TextUtils;
import c22.b1;
import c22.b2;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.data.Entry;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Stream;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class m {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18830a;

        static {
            int[] iArr = new int[x0.values().length];
            f18830a = iArr;
            try {
                iArr[x0.O1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18830a[x0.f4333t2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x054c A[PHI: r1 r2
      0x054c: PHI (r1v13 java.lang.String) = (r1v9 java.lang.String), (r1v17 java.lang.String) binds: [B:181:0x056a, B:169:0x0549] A[DONT_GENERATE, DONT_INLINE]
      0x054c: PHI (r2v6 double) = (r2v3 double), (r2v8 double) binds: [B:181:0x056a, B:169:0x0549] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static im.b a(ActivityDetailChartDTO activityDetailChartDTO, com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, Context context, fz.c cVar, String str) {
        String strH;
        im.b bVarA;
        boolean z14;
        im.b bVarA2;
        if (activityDetailChartDTO != null && hVar != null && str != null) {
            byte b14 = -1;
            switch (str.hashCode()) {
                case -2060876684:
                    if (str.equals("DIRECTELEVATION")) {
                        b14 = 0;
                    }
                    break;
                case -1976870870:
                    if (str.equals("WEIGHTEDMEANHEARTRATE")) {
                        b14 = 1;
                    }
                    break;
                case -1855127491:
                    if (str.equals("DIRECTHEARTRATE")) {
                        b14 = 2;
                    }
                    break;
                case 527600284:
                    if (str.equals("DIRECTPOWER")) {
                        b14 = 3;
                    }
                    break;
                case 530383326:
                    if (str.equals("DIRECTSPEED")) {
                        b14 = 4;
                    }
                    break;
                case 1800879400:
                    if (str.equals("DIRECTVERTICALSPEED")) {
                        b14 = 5;
                    }
                    break;
            }
            switch (b14) {
                case 0:
                    String str2 = hVar.C().f4358a;
                    z0 z0Var = z0.f4390a;
                    if (z0.b(x0.D, str2)) {
                        return null;
                    }
                    boolean zM = m(activityDetailChartDTO, "DIRECTELEVATION");
                    String str3 = cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE";
                    if (!zM) {
                        return null;
                    }
                    boolean zR = r1.r();
                    im.b bVarA3 = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 2, "DIRECTELEVATION", str3, null, zR ? null : c22.u.f23259d, cVar, null, false);
                    if (!n(bVarA3)) {
                        return null;
                    }
                    com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = hVar.f29460m;
                    double d14 = i0Var.f29532n;
                    double d15 = i0Var.f29535o;
                    int i14 = a.f18830a[hVar.C().ordinal()];
                    int i15 = R.string.lbl_foot;
                    if (i14 == 1) {
                        if (zR) {
                            i15 = R.string.lbl_meter;
                        }
                        strH = h(R.string.activity_details_altitude, i15, context);
                        if (!zR) {
                            d14 *= 3.2808399d;
                        }
                        if (!zR) {
                            d15 *= 3.2808399d;
                        }
                    } else if (i14 != 2) {
                        if (zR) {
                            i15 = R.string.lbl_meter;
                        }
                        strH = h(R.string.activity_details_elevation, i15, context);
                        if (!zR) {
                            d14 *= 3.2808399d;
                        }
                        if (!zR) {
                            d15 *= 3.2808399d;
                        }
                    } else {
                        if (zR) {
                            i15 = R.string.lbl_meter;
                        }
                        strH = h(R.string.activities_ascent_label, i15, context);
                        d14 = Double.NaN;
                        d15 = Double.NaN;
                    }
                    bVarA3.f94112c = strH;
                    bVarA3.f94119j = g(context, cVar);
                    bVarA3.f94127q = d14;
                    bVarA3.f94124n = d15;
                    bVarA3.f94116g = k(context, R.string.lbl_maximum);
                    return bVarA3;
                case 1:
                case 2:
                    boolean zM2 = m(activityDetailChartDTO, "DIRECTHEARTRATE");
                    boolean zM3 = m(activityDetailChartDTO, "WEIGHTEDMEANHEARTRATE");
                    String str4 = cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE";
                    if (!zM2 && !zM3) {
                        return null;
                    }
                    im.b bVarA4 = zM3 ? im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 3, "WEIGHTEDMEANHEARTRATE", str4, c22.u.f23256a, null, cVar, null, false) : im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 3, "DIRECTHEARTRATE", str4, null, cVar);
                    com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var2 = hVar.f29460m;
                    if (!n(bVarA4) || i0Var2 == null) {
                        return null;
                    }
                    bVarA4.m(h(R.string.lbl_heart_rate_cap, R.string.lbl_bpm, context));
                    bVarA4.q(g(context, cVar));
                    bVarA4.h(i0Var2.f29560x);
                    bVarA4.t(i0Var2.f29563y);
                    bVarA4.i(k(context, R.string.lbl_maximum));
                    return bVarA4;
                case 3:
                    boolean zM4 = m(activityDetailChartDTO, "DIRECTPOWER");
                    String str5 = cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE";
                    if (!zM4) {
                        return null;
                    }
                    im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 5, "DIRECTPOWER", str5, null, cVar);
                    com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var3 = hVar.f29460m;
                    boolean zH = z0.H(hVar.C().f4358a);
                    if (!n(bVarB) || i0Var3 == null) {
                        return null;
                    }
                    if (!b2.a(Double.valueOf(i0Var3.T), Double.valueOf(i0Var3.X)) && !zH) {
                        return null;
                    }
                    bVarB.f94119j = g(context, cVar);
                    bVarB.f94126p = i0Var3.T;
                    bVarB.f94127q = i0Var3.X;
                    bVarB.f94112c = h(R.string.lbl_power_cap, R.string.lbl_watts, context);
                    bVarB.f94116g = k(context, R.string.lbl_maximum);
                    bVarB.L0 = 9;
                    return bVarB;
                case 4:
                case 5:
                    if (m(activityDetailChartDTO, "DIRECTSPEED") || m(activityDetailChartDTO, "DIRECTVERTICALSPEED")) {
                        boolean zY = ((f12.l) KoinJavaComponent.get(f12.l.class)).y();
                        String str6 = cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE";
                        String str7 = hVar.C().f4358a;
                        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var4 = hVar.f29460m;
                        z0 z0Var2 = z0.f4390a;
                        if (z0.b(x0.f4308n, str7) || z0.b(x0.f4331t, str7) || z0.b(x0.f4320q, str7) || z0.U(str7) || z0.b(x0.F2, str7)) {
                            String str8 = str6;
                            if (zY) {
                                double d16 = i0Var4.f29538p;
                                l3.f23124b.getClass();
                                bVarA = im.d.a(activityDetailChartDTO, l3.a.p(d16, true), l3.a.p(i0Var4.f29544r, true), 1, "DIRECTSPEED", str8, null, c22.u.f23265j, cVar, null, false);
                            } else {
                                double d17 = i0Var4.f29538p;
                                l3.f23124b.getClass();
                                bVarA = im.d.a(activityDetailChartDTO, l3.a.p(d17, false), l3.a.p(i0Var4.f29544r, false), 1, "DIRECTSPEED", str8, null, c22.u.f23266k, cVar, null, false);
                            }
                            if (!n(bVarA) || i0Var4 == null || !b2.a(Double.valueOf(i0Var4.f29538p), Double.valueOf(i0Var4.f29544r))) {
                                return null;
                            }
                            double d18 = i0Var4.f29538p;
                            l3.f23124b.getClass();
                            bVarA.h(l3.a.p(d18, zY));
                            bVarA.t(l3.a.p(i0Var4.f29544r, zY));
                            bVarA.q(g(context, cVar));
                            bVarA.i(k(context, R.string.lbl_best));
                            int i16 = zY ? R.string.lbl_minute_per_km : R.string.lbl_minute_per_mile;
                            String strH2 = h(R.string.lbl_pace, i16, context);
                            bVarA.f94113d = k(context, i16);
                            bVarA.m(strH2);
                            bVarA.j(0);
                            return bVarA;
                        }
                        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var5 = hVar.f29460m;
                        if (i0Var5 != null) {
                            double d19 = i0Var5.f29505f1;
                            if (hVar.C() == x0.f4317p1 || (hVar.C() == x0.f4324r && (!b2.a(Double.valueOf(d19)) || d19 <= 0.0d))) {
                                String str9 = str6;
                                if (zY) {
                                    double d24 = i0Var4.f29538p;
                                    l3.f23124b.getClass();
                                    z14 = zY;
                                    bVarA2 = im.d.a(activityDetailChartDTO, l3.a.r(d24, true), l3.a.r(i0Var4.f29544r, true), 1, "DIRECTSPEED", str9, null, c22.u.f23268m, cVar, null, false);
                                } else {
                                    z14 = zY;
                                    double d25 = i0Var4.f29538p;
                                    l3.f23124b.getClass();
                                    bVarA2 = im.d.a(activityDetailChartDTO, l3.a.r(d25, false), l3.a.r(i0Var4.f29544r, false), 1, "DIRECTSPEED", str9, null, c22.u.f23269n, cVar, null, false);
                                }
                                if (!n(bVarA2) || i0Var4 == null || !b2.a(Double.valueOf(i0Var4.f29538p), Double.valueOf(i0Var4.f29544r))) {
                                    return null;
                                }
                                double d26 = i0Var4.f29538p;
                                l3.f23124b.getClass();
                                bVarA2.h(l3.a.r(d26, z14));
                                bVarA2.t(l3.a.r(i0Var4.f29544r, z14));
                                bVarA2.q(g(context, cVar));
                                bVarA2.i(k(context, R.string.lbl_best));
                                int iO1 = l3.a.O1(z14);
                                bVarA2.m(h(R.string.lbl_pace, iO1, context));
                                bVarA2.f94113d = k(context, iO1);
                                bVarA2.j(0);
                                return bVarA2;
                            }
                        }
                        if (z0.Q(str7)) {
                            double d27 = i0Var4.f29538p;
                            l3.f23124b.getClass();
                            im.b bVarA5 = im.d.a(activityDetailChartDTO, l3.a.q(d27), l3.a.q(i0Var4.f29544r), 1, "DIRECTSPEED", str6, null, c22.u.f23267l, cVar, null, false);
                            if (!n(bVarA5) || !b2.a(Double.valueOf(i0Var4.f29538p), Double.valueOf(i0Var4.f29544r))) {
                                return null;
                            }
                            bVarA5.f94126p = l3.a.q(i0Var4.f29538p);
                            bVarA5.f94127q = l3.a.q(i0Var4.f29544r);
                            bVarA5.f94119j = g(context, cVar);
                            bVarA5.f94116g = k(context, R.string.lbl_best);
                            bVarA5.f94112c = h(R.string.lbl_pace, R.string.lbl_minute_500_meters, context);
                            bVarA5.f94113d = k(context, R.string.lbl_minute_500_meters);
                            bVarA5.L0 = 0;
                            return bVarA5;
                        }
                        String str10 = str6;
                        if (z0.z(str7)) {
                            im.b bVarA6 = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 34, "DIRECTVERTICALSPEED", str10, null, c22.u.f23273r, cVar, null, false);
                            if (!n(bVarA6) || !b2.a(Double.valueOf(i0Var4.T1), Double.valueOf(i0Var4.U1))) {
                                return null;
                            }
                            double d28 = i0Var4.T1;
                            l3.f23124b.getClass();
                            bVarA6.f94126p = l3.a.A(d28);
                            bVarA6.f94127q = l3.a.A(i0Var4.U1);
                            bVarA6.f94119j = g(context, cVar);
                            bVarA6.f94116g = k(context, R.string.lbl_maximum);
                            bVarA6.f94112c = h(R.string.lbl_speed, R.string.activities_floors_per_minute, context);
                            bVarA6.f94113d = context.getString(R.string.string_space_string_bracket_pattern, k(context, R.string.lbl_speed), k(context, R.string.activities_floors_per_minute));
                            bVarA6.L0 = 1;
                            return bVarA6;
                        }
                        if (!z0.I(str7)) {
                            return b(activityDetailChartDTO, hVar, context, cVar, z0.H(str7));
                        }
                        im.b bVarA7 = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 0, "DIRECTSPEED", str10, null, c22.u.f23264i, cVar, null, false);
                        if (!n(bVarA7) || i0Var4 == null || !b2.a(Double.valueOf(i0Var4.f29538p), Double.valueOf(i0Var4.f29544r))) {
                            return null;
                        }
                        double d29 = i0Var4.f29538p;
                        l3.a aVar = l3.f23124b;
                        aVar.getClass();
                        q3 q3Var = q3.NAUTICAL_MILES_PER_HOUR;
                        bVarA7.f94126p = l3.a.i(d29, q3Var);
                        double d34 = i0Var4.f29544r;
                        aVar.getClass();
                        bVarA7.f94127q = l3.a.i(d34, q3Var);
                        bVarA7.f94119j = g(context, cVar);
                        bVarA7.f94116g = k(context, R.string.lbl_maximum);
                        bVarA7.f94112c = h(R.string.lbl_speed, R.string.lbl_nautical_speed_abr, context);
                        bVarA7.L0 = 0;
                        return bVarA7;
                    }
                default:
                    return null;
            }
        }
        return null;
    }

    public static im.b b(ActivityDetailChartDTO activityDetailChartDTO, com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, Context context, fz.c cVar, boolean z14) {
        fz.c cVar2;
        im.b bVarC;
        double dI;
        double dI2;
        if (!m(activityDetailChartDTO, "DIRECTSPEED") && !m(activityDetailChartDTO, "DIRECTVERTICALSPEED")) {
            return null;
        }
        boolean zY = ((f12.l) KoinJavaComponent.get(f12.l.class)).y();
        String str = cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE";
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = hVar.f29460m;
        if (zY) {
            cVar2 = cVar;
            bVarC = im.d.c(activityDetailChartDTO, 0, "DIRECTSPEED", str, null, c22.u.f23262g, cVar2);
        } else {
            cVar2 = cVar;
            bVarC = im.d.c(activityDetailChartDTO, 0, "DIRECTSPEED", str, null, c22.u.f23263h, cVar2);
        }
        if (!n(bVarC)) {
            return null;
        }
        if (!b2.a(Double.valueOf(i0Var.f29538p), Double.valueOf(i0Var.f29544r)) && !z14) {
            return null;
        }
        double d14 = i0Var.f29538p;
        if (zY) {
            l3.a aVar = l3.f23124b;
            aVar.getClass();
            q3 q3Var = q3.KILOMETER_PER_HOUR;
            dI = l3.a.i(d14, q3Var);
            double d15 = i0Var.f29544r;
            aVar.getClass();
            dI2 = l3.a.i(d15, q3Var);
        } else {
            l3.a aVar2 = l3.f23124b;
            aVar2.getClass();
            q3 q3Var2 = q3.MILE_PER_HOUR;
            dI = l3.a.i(d14, q3Var2);
            double d16 = i0Var.f29544r;
            aVar2.getClass();
            dI2 = l3.a.i(d16, q3Var2);
        }
        bVarC.h(dI);
        bVarC.t(dI2);
        bVarC.q(g(context, cVar2));
        bVarC.i(k(context, R.string.lbl_maximum));
        bVarC.m(h(R.string.lbl_speed, zY ? R.string.lbl_kmh : R.string.lbl_mph, context));
        bVarC.j(0);
        return bVarC;
    }

    public static LimitLine c(float f14, Context context) {
        LimitLine limitLine = new LimitLine(f14, "");
        limitLine.setLineColor(a7.b.getColor(context, R.color.gcm_chart_trim_limit_line));
        limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
        limitLine.setTypeface(h22.a.a("font/roboto_light.ttf", context));
        return limitLine;
    }

    public static Boolean d(String str) {
        return Boolean.valueOf(((y0) KoinJavaComponent.get(y0.class)).e(str));
    }

    public static o13.p<String, Long> e(List<Object> list) {
        List list2;
        List list3;
        String str = null;
        if (list.size() <= 1 || !(list.get(1) instanceof TreeMap)) {
            return null;
        }
        TreeMap treeMap = (TreeMap) list.get(1);
        if (treeMap.containsKey(FirebaseAnalytics.Param.LOCATION) && (treeMap.get(FirebaseAnalytics.Param.LOCATION) instanceof List) && (list3 = (List) treeMap.get(FirebaseAnalytics.Param.LOCATION)) != null && !list3.isEmpty() && list3.get(0) != null && (list3.get(0) instanceof String)) {
            str = (String) list3.get(0);
        }
        return new o13.p<>(str, Long.valueOf((!treeMap.containsKey("location-in-milliseconds") || !(treeMap.get("location-in-milliseconds") instanceof List) || (list2 = (List) treeMap.get("location-in-milliseconds")) == null || list2.isEmpty() || list2.get(0) == null || !(list2.get(0) instanceof String)) ? 1000L : Long.valueOf((String) list2.get(0)).longValue()));
    }

    public static List<String> f(String str) {
        String strSubstring;
        int iIndexOf;
        int iIndexOf2 = str.indexOf("status/");
        if (iIndexOf2 == -1 || (iIndexOf = (strSubstring = str.substring(iIndexOf2 + 7)).indexOf("/")) == -1) {
            return null;
        }
        return Arrays.asList(strSubstring.substring(0, iIndexOf), strSubstring.substring(iIndexOf + 1));
    }

    public static String g(Context context, fz.c cVar) {
        if (cVar == fz.c.TIME) {
            return k(context, R.string.lbl_time_h_m_s);
        }
        if (context == null) {
            return "";
        }
        return ((f12.l) KoinJavaComponent.get(f12.l.class)).y() ? context.getString(R.string.string_space_string_bracket_pattern, context.getString(R.string.txt_distance), context.getString(R.string.lbl_km)) : context.getString(R.string.string_space_string_bracket_pattern, context.getString(R.string.txt_distance), context.getString(R.string.lbl_mile));
    }

    public static String h(int i14, int i15, Context context) {
        if (context != null) {
            return context.getString(R.string.string_space_string_bracket_pattern, context.getString(i14), context.getString(i15));
        }
        return null;
    }

    public static Integer[] i(String str) {
        if (TextUtils.isEmpty(str)) {
            return new Integer[]{0, 0};
        }
        int iIndexOf = str.indexOf(b2.f23010b);
        return iIndexOf > 0 ? new Integer[]{Integer.valueOf(b1.c(str.substring(0, iIndexOf))), Integer.valueOf(b1.c(str.substring(iIndexOf + 1)))} : new Integer[]{Integer.valueOf(b1.c(str)), 0};
    }

    public static double j(double d14, double d15, double d16, double d17, double d18) {
        a2 a2Var = a2.ACTIVITIES;
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("InterpolatedValues: ", d14, ", ");
        sbA.append(d15);
        am.j.x(sbA, ", ", d16, ", ");
        sbA.append(d17);
        sbA.append(", ");
        sbA.append(d18);
        String string = sbA.toString();
        i2.f36769a.getClass();
        i2.a.k(a2Var, "AdvancedActivityEditingUtil", string);
        o oVar = new o(d14, d15, d16, d17);
        double d19 = oVar.f18842c;
        double d24 = 0.0d;
        double d25 = oVar.f18843d;
        double d26 = oVar.f18840a;
        if ((d19 != 0.0d || d26 != 0.0d) && d19 != d26) {
            d24 = (d25 - oVar.f18841b) / (d19 - d26);
        }
        return o2.c.b(d18, d19, d24, d25);
    }

    public static String k(Context context, int i14) {
        if (context != null) {
            return context.getString(i14);
        }
        return null;
    }

    public static ArrayList l(List list, int i14, int i15, int i16) {
        if ((i14 == 0 && list != null && i15 == list.size() - 1) || list == null) {
            return null;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i17 = 0; i17 < size; i17++) {
            if (i17 <= i14 || i17 >= i15) {
                arrayList.add(new Entry(Double.isNaN(((o20.a) list.get(i17)).D()) ? 0.0f : (float) ((o20.a) list.get(i17)).D(), i17));
            } else {
                arrayList.add(new Entry(gl1.y.B(i16) ? 10000.0f : 0.0f, i17));
            }
        }
        return arrayList;
    }

    public static boolean m(ActivityDetailChartDTO activityDetailChartDTO, String str) {
        return activityDetailChartDTO != null && activityDetailChartDTO.Z(str);
    }

    public static boolean n(im.b bVar) {
        List<o20.a> list;
        return (bVar == null || (list = bVar.f94122l) == null || list.isEmpty()) ? false : true;
    }

    public static boolean o(ActivityDetailChartDTO activityDetailChartDTO) {
        return (activityDetailChartDTO != null && m(activityDetailChartDTO, "DIRECTPOWER")) || m(activityDetailChartDTO, "DIRECTSPEED") || m(activityDetailChartDTO, "DIRECTVERTICALSPEED") || m(activityDetailChartDTO, "DIRECTHEARTRATE") || m(activityDetailChartDTO, "WEIGHTEDMEANHEARTRATE") || m(activityDetailChartDTO, "DIRECTELEVATION");
    }

    public static boolean p(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return false;
        }
        if (((f12.l) KoinJavaComponent.get(f12.l.class)).y()) {
            DecimalFormat decimalFormat = l3.f23137o;
            double dDoubleValue = d14.doubleValue();
            l3.f23124b.getClass();
            return b1.b(decimalFormat.format(dDoubleValue / 1000.0d)) > 0.0d;
        }
        DecimalFormat decimalFormat2 = l3.f23137o;
        double dDoubleValue2 = d14.doubleValue();
        l3.f23124b.getClass();
        return b1.b(decimalFormat2.format(dDoubleValue2 / 1609.344d)) > 0.0d;
    }

    public static boolean q(Double d14, ActivityDetailChartDTO activityDetailChartDTO) {
        return d14 != null && d14.doubleValue() > 0.0d && activityDetailChartDTO != null && p(d14) && activityDetailChartDTO.H("SUMDISTANCE") >= 0;
    }

    public static boolean r(List<String> list) {
        y0 y0Var = (y0) KoinJavaComponent.get(y0.class);
        Stream<String> stream = list.stream();
        Objects.requireNonNull(y0Var);
        return !list.isEmpty() && stream.allMatch(new a73.n(y0Var, 3));
    }

    public static boolean s(Double d14, ActivityDetailChartDTO activityDetailChartDTO) {
        List<Double> listC;
        if (d14 == null || d14.doubleValue() <= 0.0d || activityDetailChartDTO == null) {
            return false;
        }
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC2 = activityDetailChartDTO.C();
        int iH = activityDetailChartDTO.H("sumDuration");
        return (listC2 == null || listC2.isEmpty() || iH < 0 || (listC = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) com.airbnb.lottie.animation.keyframe.a.c(1, listC2)).C()) == null || listC.isEmpty() || listC.get(iH).doubleValue() <= 0.0d || activityDetailChartDTO.H("sumDuration") < 0) ? false : true;
    }
}
