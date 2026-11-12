package am;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f4179a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4180a;

        static {
            int[] iArr = new int[x0.values().length];
            f4180a = iArr;
            try {
                iArr[x0.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4180a[x0.f4308n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4180a[x0.f4312o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4180a[x0.f4331t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4180a[x0.f4304m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4180a[x0.C.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4180a[x0.f4324r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4180a[x0.D.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4180a[x0.I.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4180a[x0.P.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4180a[x0.X.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4180a[x0.T.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4180a[x0.Y.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4180a[x0.Z.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public r1(Context context) {
        this(new l22.a(context));
    }

    public static ArrayList a(Context context) {
        q1 q1VarN = n();
        Comparator<? super x0> comparatorComparing = Comparator.comparing(new a73.k(context, 1));
        ArrayList arrayListJ = z0.j();
        arrayListJ.sort(q1VarN);
        ArrayList arrayList = new ArrayList(arrayListJ);
        Iterator it = arrayListJ.iterator();
        while (it.hasNext()) {
            List<x0> listI = z0.i((x0) it.next());
            listI.sort(comparatorComparing);
            arrayList.addAll(listI);
        }
        return arrayList;
    }

    public static ArrayList b(List list) {
        y0 y0Var = (y0) KoinJavaComponent.get(y0.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x0 x0Var = (x0) it.next();
            if (!y0Var.i(x0Var) || x0Var == null) {
                arrayList.add(x0Var);
            }
        }
        return arrayList;
    }

    public static ArrayList c(x0 x0Var, List list) {
        y0 y0Var = (y0) KoinJavaComponent.get(y0.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x0 x0Var2 = (x0) it.next();
            if (!y0Var.i(x0Var2) || x0Var2 == x0Var) {
                if (!y0Var.m(x0Var2)) {
                    arrayList.add(x0Var2);
                }
            }
        }
        return arrayList;
    }

    public static com.garmin.android.apps.connectmobile.activities.newmodel.h0 d(int i14, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.garmin.android.apps.connectmobile.activities.newmodel.h0 h0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.h0) it.next();
            if (h0Var.d() == i14) {
                return h0Var;
            }
        }
        return null;
    }

    public static String f(x0 x0Var) {
        switch (a.f4180a[x0Var.ordinal()]) {
            case 1:
                return "steps";
            case 2:
                return "running";
            case 3:
                return "cycling";
            case 4:
                return "walking";
            case 5:
                return TtmlNode.COMBINE_ALL;
            case 6:
                return "multi_sport";
            case 7:
                return "swimming";
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return "diving";
            default:
                return "others";
        }
    }

    public static String g(Context context, Double d14, m3 m3Var, String str, int i14) {
        String string = context.getString(i14);
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            Locale.getDefault();
            return str + StringUtils.SPACE + string;
        }
        double dDoubleValue = d14.doubleValue();
        DecimalFormat decimalFormatM = l3.m();
        l3.f23124b.getClass();
        String strO = l3.a.O(context, dDoubleValue, m3Var, decimalFormatM, true);
        Locale.getDefault();
        return strO + StringUtils.SPACE + string;
    }

    public static String h(Context context, Double d14, String str) {
        if (!Double.isNaN(d14.doubleValue())) {
            str = new l3(context).k(d14.doubleValue(), false);
        }
        return context.getString(R.string.common_abbrev_brpm, str);
    }

    public static String i(Context context, String str, double d14, double d15) {
        String str2 = "";
        if (context == null) {
            return "";
        }
        Locale locale = Locale.getDefault();
        boolean zIsNaN = Double.isNaN(d14);
        boolean zIsNaN2 = Double.isNaN(d15);
        if (!zIsNaN && !zIsNaN2) {
            str2 = String.format(locale, context.getString(R.string.string_space_bullet_training_effect_stat_pattern), Double.valueOf(d14), Double.valueOf(d15));
        } else if (!zIsNaN) {
            str2 = String.format(locale, context.getString(R.string.string_space_bullet_training_effect_single_pattern), Double.valueOf(d14));
        }
        if (!TextUtils.isEmpty(str)) {
            qs.u.f147173f.getClass();
            qs.u uVarA = qs.u.a.a(str);
            if (uVarA != null) {
                return String.format(locale, context.getString(R.string.string_space_bullet_string_pattern), String.format(locale, context.getString(R.string.string_space_string_bracket_pattern), context.getString(uVarA.f147182b), context.getString(uVarA.f147185e)), str2);
            }
        }
        return str2;
    }

    public static String j(Context context, Double d14, String str) {
        if (d14 != null && !Double.isNaN(d14.doubleValue())) {
            double dDoubleValue = d14.doubleValue();
            l3.f23124b.getClass();
            if (Double.isNaN(dDoubleValue)) {
                str = "";
            } else {
                String str2 = dDoubleValue > 0.0d ? Marker.ANY_NON_NULL_MARKER : "";
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                str = String.format("%s%s", Arrays.copyOf(new Object[]{str2, l3.f23131i.format(Math.round(dDoubleValue))}, 2));
            }
        }
        Locale.getDefault();
        return e5.g(str, StringUtils.SPACE, context.getString(R.string.activity_details_stress_change));
    }

    public static String k(Context context, long j8, String str) {
        String string = context.getString(R.string.lbl_routes);
        if (j8 == 1) {
            return String.format(Locale.getDefault(), "%d %s", Long.valueOf(j8), context.getString(R.string.lbl_route));
        }
        if (j8 > 0) {
            return String.format(Locale.getDefault(), "%d %s", Long.valueOf(j8), string);
        }
        Locale.getDefault();
        return str + StringUtils.SPACE + string;
    }

    public static String l(Context context, long j8, String str) {
        String string = context.getString(R.string.lbl_activity_wakesports_runs);
        if (j8 == 1) {
            return context.getString(R.string.lbl_wakesports_single_run);
        }
        if (j8 > 0) {
            return String.format(Locale.getDefault(), "%d %s", Long.valueOf(j8), string);
        }
        Locale.getDefault();
        return str + StringUtils.SPACE + string;
    }

    public static String m(Context context, long j8, String str) {
        String string = context.getString(R.string.activities_waves_label);
        if (j8 == 1) {
            return context.getString(R.string.activities_one_wave_number_label);
        }
        if (j8 > 0) {
            return String.format(Locale.getDefault(), "%d %s", Long.valueOf(j8), string);
        }
        Locale.getDefault();
        return str + StringUtils.SPACE + string;
    }

    public static q1 n() {
        return new q1((y0) KoinJavaComponent.get(y0.class), o());
    }

    public static HashMap o() {
        HashMap map = new HashMap();
        map.put(x0.f4308n.f4358a, 0);
        map.put(x0.f4312o.f4358a, 1);
        map.put(x0.f4316p.f4358a, 2);
        map.put(x0.f4324r.f4358a, 3);
        map.put(x0.f4331t.f4358a, 4);
        map.put(x0.f4320q.f4358a, 5);
        map.put(x0.C.f4358a, 6);
        map.put(x0.D.f4358a, 7);
        map.put(x0.U1.f4358a, 8);
        map.put(x0.f4268a3.f4358a, 9);
        map.put(x0.f4350y.f4358a, 10);
        map.put(x0.f4277d3.f4358a, 11);
        map.put(x0.f4323q3.f4358a, 12);
        map.put(x0.f4346x.f4358a, 13);
        map.put(x0.A.f4358a, 14);
        map.put(x0.f4342w.f4358a, 15);
        map.put(x0.E.f4358a, 16);
        return map;
    }

    public static int[] p(Context context) {
        return new int[]{a7.b.getColor(context, R.color.racing_laptime_slow_80_100), a7.b.getColor(context, R.color.racing_laptime_slow_60_79), a7.b.getColor(context, R.color.racing_laptime_slow_40_59), a7.b.getColor(context, R.color.racing_laptime_slow_20_39), a7.b.getColor(context, R.color.racing_laptime_avg), a7.b.getColor(context, R.color.racing_laptime_avg), a7.b.getColor(context, R.color.racing_laptime_fast_20_39), a7.b.getColor(context, R.color.racing_laptime_fast_40_59), a7.b.getColor(context, R.color.racing_laptime_fast_60_79), a7.b.getColor(context, R.color.racing_laptime_fast_80_100)};
    }

    public static Intent q(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.addFlags(268435457);
        intent.putExtra("android.intent.extra.TEXT", str);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        intent.putExtra("Kdescription", str);
        return intent;
    }

    public static boolean r() {
        f12.l lVar = (f12.l) KoinJavaComponent.get(f12.l.class);
        return lVar.y() || lVar.C1();
    }

    @Deprecated
    public final String e(double d14, boolean z14) {
        int i14;
        StringBuilder sb3 = new StringBuilder();
        if (Double.isNaN(d14)) {
            return "";
        }
        if (!z14) {
            double d15 = d14 * 3.2808399d;
            if (d15 > 1000.0d) {
                sb3.append(l3.f23129g.format(d15 / 5280.0d));
                i14 = R.string.lbl_mile;
            } else {
                sb3.append(l3.m().format(d15));
                i14 = R.string.lbl_foot;
            }
        } else if (d14 >= 1000.0d) {
            sb3.append(l3.f23129g.format(d14 / 1000.0d));
            i14 = R.string.lbl_km;
        } else {
            sb3.append(l3.m().format(d14));
            i14 = R.string.lbl_meter;
        }
        sb3.append(StringUtils.SPACE);
        sb3.append(this.f4179a.getString(i14));
        return sb3.toString();
    }

    public r1(l22.b bVar) {
        this.f4179a = bVar;
    }
}
