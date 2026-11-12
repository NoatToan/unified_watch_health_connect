package v21;

import android.content.Context;
import android.text.format.DateFormat;
import b63.v;
import c22.g2;
import c22.l3;
import c22.x0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import d53.y;
import i3.e5;
import j20.x;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import uu.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lv21/e;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f175323i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f175324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.a f175325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pi0.e f175326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f175327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f175328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DecimalFormat f175329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DecimalFormat f175330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DecimalFormat f175331h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175332a;

        static {
            int[] iArr = new int[s21.a.values().length];
            try {
                iArr[s21.a.ACTIVE_CALORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s21.a.ACTIVITY_MULTIPLIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s21.a.CUSTOM_ACTIVE_CALORIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f175332a = iArr;
        }
    }

    static {
        new a(null);
    }

    public e(Context context) {
        context.getClass();
        this.f175324a = context;
        l22.a aVar = new l22.a(context);
        this.f175325b = aVar;
        this.f175326c = new pi0.e(context);
        this.f175327d = aVar.getString(R.string.no_value);
        this.f175328e = aVar.getString(R.string.txt_empty_page_no_data);
        DecimalFormat decimalFormat = new DecimalFormat("#,###,###");
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        decimalFormat.setRoundingMode(roundingMode);
        this.f175329f = decimalFormat;
        DecimalFormat decimalFormat2 = new DecimalFormat("#,###,##0.#");
        decimalFormat2.setRoundingMode(roundingMode);
        this.f175330g = decimalFormat2;
        DecimalFormat decimalFormat3 = new DecimalFormat("#,###,##0.##");
        decimalFormat3.setRoundingMode(roundingMode);
        this.f175331h = decimalFormat3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    public static String d(e eVar, Double d14, String str, int i14) {
        String str2;
        if ((i14 & 2) != 0) {
            str = null;
        }
        if (d14 != null) {
            eVar.getClass();
            if (Double.isNaN(d14.doubleValue()) || d14.doubleValue() < 0.0d) {
                str2 = eVar.f175327d;
            } else {
                DecimalFormat decimalFormat = eVar.f175329f;
                decimalFormat.setGroupingUsed(true);
                str2 = decimalFormat.format(d14.doubleValue());
                decimalFormat.setGroupingUsed(true);
            }
        } else {
            str2 = eVar.f175327d;
        }
        if (str == null) {
            str2.getClass();
            return str2;
        }
        l22.a aVar = eVar.f175325b;
        str2.getClass();
        return aVar.a(R.string.string_space_string_pattern, str2, str);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    public static String e(e eVar, Double d14, String str, boolean z14, boolean z15, int i14) {
        String str2;
        if ((i14 & 2) != 0) {
            str = null;
        }
        if ((i14 & 4) != 0) {
            z14 = true;
        }
        if ((i14 & 8) != 0) {
            z15 = false;
        }
        if (d14 != null) {
            eVar.getClass();
            if (!Double.isNaN(d14.doubleValue()) && d14.doubleValue() >= 0.0d) {
                DecimalFormat decimalFormat = eVar.f175331h;
                decimalFormat.setGroupingUsed(z14);
                str2 = decimalFormat.format(d14.doubleValue());
                decimalFormat.setGroupingUsed(true);
            } else if (z15) {
                str2 = eVar.f175328e;
            } else {
                str2 = eVar.f175327d;
            }
        } else if (z15) {
            str2 = eVar.f175328e;
        } else {
            str2 = eVar.f175327d;
        }
        if (str == null) {
            str2.getClass();
            return str2;
        }
        l22.a aVar = eVar.f175325b;
        str2.getClass();
        return aVar.a(R.string.string_space_string_pattern, str2, str);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    public static String f(e eVar, Double d14, int i14) {
        String str;
        boolean z14 = (i14 & 4) != 0;
        if (d14 != null) {
            eVar.getClass();
            if (Double.isNaN(d14.doubleValue()) || d14.doubleValue() < 0.0d) {
                str = eVar.f175327d;
            } else {
                DecimalFormat decimalFormat = eVar.f175330g;
                decimalFormat.setGroupingUsed(z14);
                str = decimalFormat.format(d14.doubleValue());
                decimalFormat.setGroupingUsed(true);
            }
        } else {
            str = eVar.f175327d;
        }
        str.getClass();
        return str;
    }

    public static String h(double d14) {
        l3.f23124b.getClass();
        String str = l3.f23128f.format(d14);
        str.getClass();
        return str;
    }

    public static /* synthetic */ String k(e eVar, Integer num, Integer num2, boolean z14, int i14) {
        if ((i14 & 2) != 0) {
            num2 = null;
        }
        if ((i14 & 4) != 0) {
            z14 = false;
        }
        return eVar.j(num, num2, z14);
    }

    public static String y(e eVar, Integer num, Double d14, Double d15, Double d16, int i14) {
        int i15 = (i14 & 16) != 0 ? R.string.string_new_line_string_pattern : R.string.string_space_bullet_string_pattern;
        boolean z14 = (i14 & 32) == 0;
        eVar.getClass();
        return eVar.f175325b.a(i15, k(eVar, num, null, z14, 2), eVar.x(d14, d15, d16, z14));
    }

    public final String A(Double d14, Double d15, String str, boolean z14) {
        String strD = d(this, d14, null, 6);
        String strD2 = d(this, d15, str, 4);
        l22.a aVar = this.f175325b;
        return z14 ? oi0.c.C(aVar.a(R.string.placeholder_out_of_placeholder, strD, strD2), aVar, new o(17)) : aVar.a(R.string.string_slash_string_pattern, strD, strD2);
    }

    public final String B(String str, Double d14, Double d15) {
        if (!zf.b.D(d14)) {
            d14 = null;
        }
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        boolean zD = zf.b.D(d15);
        l22.a aVar = this.f175325b;
        if (zD) {
            return dDoubleValue <= d15.doubleValue() ? aVar.a(R.string.value_remaining, d(this, Double.valueOf(d15.doubleValue() - dDoubleValue), str, 4)) : aVar.a(R.string.value_over_goal, d(this, Double.valueOf(dDoubleValue - d15.doubleValue()), str, 4));
        }
        return aVar.a(R.string.value_remaining, d(this, null, str, 4));
    }

    public final String C(s21.o oVar, boolean z14) {
        oVar.getClass();
        if (oVar.f156159a) {
            return h0.k0(oVar.f156160b, " • ", null, null, new as2.d(this, z14, 17), 30);
        }
        x0.f23314a.getClass();
        g2 g2VarB = g2.b(x0.Re);
        l22.a aVar = this.f175325b;
        aVar.getClass();
        return dh.b.A(aVar.f109162a, g2VarB);
    }

    public final String D(Double d14, Double d15, boolean z14, boolean z15) {
        String strD = d(this, d14, null, 6);
        String strM = M(d15, z14, z15);
        l22.a aVar = this.f175325b;
        if (!z15) {
            return aVar.a(R.string.string_slash_string_pattern, strD, strM);
        }
        String strA = aVar.a(R.string.placeholder_out_of_placeholder, strD, strM);
        aVar.getClass();
        oi0.b bVar = new oi0.b(aVar, strA);
        bVar.M();
        Unit unit = Unit.INSTANCE;
        return bVar.f132238b;
    }

    public final String E(Integer num, Integer num2, boolean z14) {
        return D(num != null ? Double.valueOf(num.intValue()) : null, num2 != null ? Double.valueOf(num2.intValue()) : null, false, z14);
    }

    public final String G(String str, String str2, String str3) {
        str3.getClass();
        return oi0.c.C(str + ", " + str2 + StringUtils.SPACE + str3, this.f175325b, new o(16));
    }

    public final String H(String str, String str2, boolean z14) {
        str.getClass();
        str2.getClass();
        l22.a aVar = this.f175325b;
        return z14 ? oi0.c.C(x.d(str, ", ", str2, StringUtils.SPACE, aVar.getString(R.string.lbl_grams_lowercase)), aVar, new o(14)) : oi0.c.C(e5.g(str, ", ", str2), aVar, new o(15));
    }

    public final String I(Double d14, Double d15, boolean z14) {
        String strD;
        boolean zD = zf.b.D(d15);
        l22.a aVar = this.f175325b;
        if (zD) {
            strD = D(d14, d15, false, z14);
        } else if (z14) {
            String strD2 = d(this, d14, null, 6);
            aVar.getClass();
            oi0.b bVar = new oi0.b(aVar, strD2);
            bVar.M();
            Unit unit = Unit.INSTANCE;
            strD = bVar.f132238b;
        } else {
            strD = d(this, d14, null, 6);
        }
        return aVar.a(R.string.string_space_string_pattern, strD, aVar.getString(z14 ? R.string.protein : R.string.protein_abbreviation));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String J(Float f14) {
        p pVar;
        k42.b.f102880a.getClass();
        int iL = k42.b.l();
        l22.a aVar = this.f175325b;
        if (iL == 0) {
            String string = aVar.getString(R.string.lbl_kg);
            f fVar = f.f175333a;
            i53.f<Float> fVar2 = d.f175322z;
            float fFloatValue = f14.floatValue();
            fVar.getClass();
            pVar = new p(string, Float.valueOf(f.l(fFloatValue, fVar2)));
        } else {
            String string2 = aVar.getString(R.string.lbl_lbs);
            f fVar3 = f.f175333a;
            i53.f<Float> fVar4 = d.A;
            float fFloatValue2 = f14.floatValue();
            fVar3.getClass();
            pVar = new p(string2, Float.valueOf(f.l(fFloatValue2, fVar4)));
        }
        return aVar.a(R.string.value_unit_per_week, String.valueOf(((Number) pVar.f128595b).floatValue()), (String) pVar.f128594a);
    }

    public final String K(v vVar, boolean z14) {
        vVar.getClass();
        LocalTime localTime = vVar.f16219a;
        if (!z14) {
            return r(vVar);
        }
        String strPrint = DateTimeFormat.forPattern(DateFormat.is24HourFormat(this.f175324a) ? "H" : "h a").print(new org.joda.time.LocalTime(localTime.getHour(), localTime.getMinute(), localTime.getSecond()));
        strPrint.getClass();
        return strPrint;
    }

    public final String L(String str, boolean z14) {
        str.getClass();
        return z14 ? e5.g(this.f175325b.getString(R.string.value_is_required), ". ", str) : Marker.ANY_MARKER.concat(str);
    }

    public final String M(Double d14, boolean z14, boolean z15) {
        l22.a aVar = this.f175325b;
        if (z14 && z15) {
            return oi0.c.C(aVar.a(R.string.value_grams, d(this, d14, null, 6)), aVar, new o(18));
        }
        if (z14) {
            return aVar.a(R.string.value_g, d(this, d14, null, 6));
        }
        return z15 ? oi0.c.C(d(this, d14, null, 6), aVar, new o(19)) : d(this, d14, null, 6);
    }

    public final String N(String str) {
        str.getClass();
        l22.a aVar = this.f175325b;
        aVar.getClass();
        oi0.b bVar = new oi0.b(aVar, str);
        bVar.a();
        Unit unit = Unit.INSTANCE;
        return bVar.f132238b;
    }

    public final String a(Double d14, String str, Integer num, Double d15, Double d16, Double d17, boolean z14) {
        ArrayList arrayList = new ArrayList();
        if (zf.b.D(d14) && str != null && !w.J(str)) {
            arrayList.add(i(z14, str, d14.doubleValue()));
        }
        arrayList.add(k(this, num, null, z14, 2));
        arrayList.add(I(d15, null, z14));
        arrayList.add(n(d16, null, z14));
        arrayList.add(m(d17, null, z14));
        return h0.k0(arrayList, " • ", null, null, null, 62);
    }

    public final String b(s21.a aVar, Integer num, Integer num2, l01.a aVar2, boolean z14) {
        l22.a aVar3 = this.f175325b;
        String string = aVar3.getString(R.string.lbl_active_calories);
        int i14 = z14 ? R.string.average_daily_active_calories_nutrition : R.string.lbl_avg_daily_active_calories;
        int i15 = aVar == null ? -1 : b.f175332a[aVar.ordinal()];
        if (i15 == 1) {
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue > 0) {
                return aVar3.a(i14, l3.a.H(l3.f23124b, aVar3, iIntValue, false));
            }
        } else if (i15 != 2) {
            if (i15 == 3) {
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                if (iIntValue2 > 0) {
                    return aVar3.a(i14, l3.a.H(l3.f23124b, aVar3, iIntValue2, false));
                }
            }
        } else if (aVar2 != null && aVar2 != l01.a.UNKNOWN) {
            return aVar3.getString(aVar2.f107837b);
        }
        return string;
    }

    public final String c(Integer num) {
        if (num == null || num.intValue() < 0.0d) {
            return this.f175327d;
        }
        String str = this.f175329f.format(num);
        str.getClass();
        return str;
    }

    public final String g(Double d14) {
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        l22.a aVar = this.f175325b;
        String str = String.format(aVar.getString(R.string.lbl_value_percent), Arrays.copyOf(new Object[]{this.f175327d}, 1));
        if (d14 != null && d14.doubleValue() >= 0.0d) {
            l3.a aVar2 = l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar2.getClass();
            String strB0 = l3.a.B0(aVar, dDoubleValue, 0, str);
            if (strB0 != null) {
                return strB0;
            }
        }
        return str;
    }

    public final String i(boolean z14, String str, double d14) {
        str.getClass();
        Character chQ0 = y.q0(str);
        l22.a aVar = this.f175325b;
        if (chQ0 == null || !Character.isDigit(chQ0.charValue())) {
            return aVar.a(R.string.string_space_string_pattern, h(d14), str);
        }
        return z14 ? aVar.a(R.string.num_servings_serving_size, h(d14), str) : aVar.a(R.string.value_times_value, h(d14), str);
    }

    public final String j(Integer num, Integer num2, boolean z14) {
        String strC;
        l22.a aVar = this.f175325b;
        if (num2 != null) {
            strC = E(num, num2, z14);
        } else if (z14) {
            String strC2 = c(num);
            aVar.getClass();
            if (strC2 == null) {
                strC = "";
            } else {
                oi0.b bVar = new oi0.b(aVar, strC2);
                bVar.M();
                Unit unit = Unit.INSTANCE;
                strC = bVar.f132238b;
            }
        } else {
            strC = c(num);
        }
        return aVar.a(R.string.string_space_string_pattern, strC, aVar.getString(z14 ? R.string.lbl_calories : R.string.calories_abbreviation));
    }

    public final String l(int i14) {
        DecimalFormat decimalFormat = this.f175329f;
        String str = decimalFormat.format((Object) 1);
        str.getClass();
        String str2 = decimalFormat.format((Object) 999999);
        str2.getClass();
        return this.f175325b.a(i14, str, str2);
    }

    public final String m(Double d14, Double d15, boolean z14) {
        String strD;
        boolean zD = zf.b.D(d15);
        l22.a aVar = this.f175325b;
        if (zD) {
            strD = D(d14, d15, false, z14);
        } else if (z14) {
            String strD2 = d(this, d14, null, 6);
            aVar.getClass();
            oi0.b bVar = new oi0.b(aVar, strD2);
            bVar.M();
            Unit unit = Unit.INSTANCE;
            strD = bVar.f132238b;
        } else {
            strD = d(this, d14, null, 6);
        }
        return aVar.a(R.string.string_space_string_pattern, strD, aVar.getString(z14 ? R.string.carbs : R.string.carbs_abbreviation));
    }

    public final String n(Double d14, Double d15, boolean z14) {
        String strD;
        boolean zD = zf.b.D(d15);
        l22.a aVar = this.f175325b;
        if (zD) {
            strD = D(d14, d15, false, z14);
        } else if (z14) {
            String strD2 = d(this, d14, null, 6);
            aVar.getClass();
            oi0.b bVar = new oi0.b(aVar, strD2);
            bVar.M();
            Unit unit = Unit.INSTANCE;
            strD = bVar.f132238b;
        } else {
            strD = d(this, d14, null, 6);
        }
        return aVar.a(R.string.string_space_string_pattern, strD, aVar.getString(z14 ? R.string.fat : R.string.fat_abbreviation));
    }

    public final String o(String str, String str2) {
        if (str == null || w.J(str)) {
            return this.f175327d;
        }
        if (str2 == null || w.J(str2)) {
            return str;
        }
        return this.f175325b.a(R.string.string_short_dash_line_string_pattern, str, str2);
    }

    public final String p(Double d14, Integer num, String str) {
        str.getClass();
        return this.f175325b.a(R.string.string_space_bullet_string_pattern, d(this, d14, str, 4), g(num != null ? Double.valueOf(num.intValue()) : null));
    }

    public final String q(Float f14, Boolean bool) {
        l22.a aVar = this.f175325b;
        if (f14 == null || bool == null) {
            return aVar.getString(R.string.no_value);
        }
        String strN0 = l3.a.n0(l3.f23124b, this.f175324a, f14.floatValue(), bool.booleanValue());
        return strN0.length() == 0 ? aVar.getString(R.string.no_value) : strN0;
    }

    public final String r(v vVar) {
        vVar.getClass();
        qi0.f fVar = qi0.f.RELATIVE_24H_AM_PM_TIME;
        pi0.e eVar = this.f175326c;
        eVar.getClass();
        fVar.getClass();
        LocalTime localTime = vVar.f16219a;
        return eVar.e(new org.joda.time.LocalTime(localTime.getHour(), localTime.getMinute(), localTime.getSecond()), fVar);
    }

    public final String s(String str, i53.f fVar) {
        fVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(". ");
        Iterator<E> it = fVar.iterator();
        while (it.hasNext()) {
            d82.a aVar = (d82.a) it.next();
            sb3.append(N(aVar.f58375a));
            sb3.append(". ");
            sb3.append(aVar.f58376b);
            String str2 = aVar.f58378d;
            l22.a aVar2 = this.f175325b;
            if (s.g(str2, aVar2.getString(R.string.unit_g))) {
                sb3.append(aVar2.getString(R.string.lbl_grams_lowercase));
            } else if (s.g(str2, aVar2.getString(R.string.calories_abbreviation))) {
                sb3.append(aVar2.getString(R.string.lbl_calories));
            }
        }
        return sb3.toString();
    }

    public final String t(Double d14, Double d15, boolean z14, boolean z15) {
        if (!zf.b.D(d14)) {
            d14 = null;
        }
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        boolean zD = zf.b.D(d15);
        l22.a aVar = this.f175325b;
        if (zD) {
            return dDoubleValue <= d15.doubleValue() ? aVar.a(R.string.value_remaining, M(Double.valueOf(d15.doubleValue() - dDoubleValue), z14, z15)) : aVar.a(R.string.value_over_goal, M(Double.valueOf(dDoubleValue - d15.doubleValue()), z14, z15));
        }
        return aVar.a(R.string.value_remaining, M(null, z14, z15));
    }

    public final String u(Integer num, int i14, boolean z14) {
        return t(num != null ? Double.valueOf(num.intValue()) : null, Double.valueOf(i14), false, z14);
    }

    public final String w(Double d14, boolean z14) {
        return z14 ? d(this, d14, null, 6) : f(this, d14, 30);
    }

    public final String x(Double d14, Double d15, Double d16, boolean z14) {
        l22.a aVar = this.f175325b;
        String string = z14 ? aVar.getString(R.string.lbl_grams_lowercase) : aVar.getString(R.string.unit_g);
        return aVar.a(R.string.string_bullet_string_bullet_string_pattern, aVar.a(R.string.string_colon_string_pattern, aVar.getString(z14 ? R.string.protein : R.string.protein_abbreviation), z14 ? oi0.c.C(d(this, d14, string, 4), aVar, new o(11)) : d(this, d14, string, 4)), aVar.a(R.string.string_colon_string_pattern, aVar.getString(z14 ? R.string.fat : R.string.fat_abbreviation), z14 ? oi0.c.C(d(this, d15, string, 4), aVar, new o(12)) : d(this, d15, string, 4)), aVar.a(R.string.string_colon_string_pattern, aVar.getString(z14 ? R.string.carbs : R.string.carbs_abbreviation), z14 ? oi0.c.C(d(this, d16, string, 4), aVar, new o(13)) : d(this, d16, string, 4)));
    }

    public final String z(v vVar, v vVar2) {
        vVar.getClass();
        vVar2.getClass();
        LocalTime localTime = vVar.f16219a;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(localTime.getHour(), localTime.getMinute(), localTime.getSecond());
        LocalTime localTime3 = vVar2.f16219a;
        return this.f175326c.h(localTime2, new org.joda.time.LocalTime(localTime3.getHour(), localTime3.getMinute(), localTime3.getSecond()), qi0.e.RELATIVE_24H_AM_PM_TIME);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lv21/e$a;", "", "<init>", "()V", "", "INTEGER_FORMAT_PATTERN", "Ljava/lang/String;", "OPTIONAL_SINGLE_DECIMAL_FORMAT_PATTERN", "OPTIONAL_TWO_DECIMAL_FORMAT_PATTERN", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
