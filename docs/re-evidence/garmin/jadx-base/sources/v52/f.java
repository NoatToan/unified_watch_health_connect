package v52;

import android.content.Context;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import com.garmin.android.apps.connectmobile.workouts.data.model.v;
import d53.k;
import f12.l;
import g22.n;
import gl1.y;
import i3.e5;
import ig1.l0;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m52.j;
import o13.p;
import o62.u0;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f175771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f175772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f175773d;

        static {
            int[] iArr = new int[m52.a.values().length];
            try {
                iArr[m52.a.f116651g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.a.f116648d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m52.a.f116653i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m52.a.f116650f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m52.a.f116649e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m52.a.f116655k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m52.a.f116656l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m52.a.f116659o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m52.a.f116652h.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[m52.a.f116657m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f175770a = iArr;
            int[] iArr2 = new int[j0.c.values().length];
            try {
                iArr2[j0.c.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[j0.c.MODERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[j0.c.HEAVY.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[j0.c.VERY_HEAVY.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[j0.c.BODY_WEIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            f175771b = iArr2;
            int[] iArr3 = new int[j.values().length];
            try {
                iArr3[j.f116747g.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[j.f116746f.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[j.f116745e.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            f175772c = iArr3;
            int[] iArr4 = new int[m52.g.values().length];
            try {
                iArr4[m52.g.CADENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[m52.g.HEART_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[m52.g.SPEED.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[m52.g.PACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[m52.g.POWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[m52.g.POWER_CURVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[m52.g.SWIM_INSTRUCTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[m52.g.SWIM_CSS_OFFSET.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[m52.g.WALK_INSTRUCTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[m52.g.NONE.ordinal()] = 10;
            } catch (NoSuchFieldError unused28) {
            }
            f175773d = iArr4;
        }
    }

    public static final String a(Context context, j jVar, String str) {
        j jVar2 = j.f116747g;
        if (jVar == jVar2) {
            return context.getString(R.string.string_space_string_pattern, str, jVar2.b(context));
        }
        j jVar3 = j.f116748h;
        if (jVar != jVar3) {
            return str;
        }
        return context.getString(R.string.string_space_string_pattern, str, jVar3.b(context));
    }

    public static final int b(String str, ArrayList arrayList) {
        str.getClass();
        x0 x0Var = x0.f105818a;
        int i14 = 1;
        Pattern patternCompile = Pattern.compile(String.format("%s(?: \\((\\d+)\\))?", Arrays.copyOf(new Object[]{str}, 1)));
        HashSet hashSet = new HashSet(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Matcher matcher = patternCompile.matcher((String) it.next());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                if (strGroup != null) {
                    int i15 = Integer.parseInt(strGroup);
                    if (i15 > 1) {
                        hashSet.add(Integer.valueOf(i15));
                    }
                } else {
                    hashSet.add(1);
                }
            }
        }
        while (hashSet.contains(Integer.valueOf(i14))) {
            i14++;
        }
        return i14;
    }

    public static final String c(Context context, double d14) {
        context.getClass();
        return l3.a.H(l3.f23124b, new l22.a(context), d14, true);
    }

    public static final String d(Context context, double d14, j jVar) {
        int i14;
        context.getClass();
        if (Double.isNaN(d14)) {
            return "";
        }
        if (jVar == null) {
            jVar = s() ? j.f116746f : j.f116745e;
        }
        int i15 = a.f175772c[jVar.ordinal()];
        if (i15 == 1) {
            i14 = R.string.lbl_meter;
        } else if (i15 != 2) {
            i14 = R.string.lbl_mile;
            if (i15 != 3) {
                l3.f23124b.getClass();
            } else {
                l3.f23124b.getClass();
            }
            d14 /= 1609.344d;
        } else {
            l3.f23124b.getClass();
            d14 /= 1000.0d;
            i14 = R.string.lbl_km;
        }
        return e5.g(l3.f23137o.format(d14), StringUtils.SPACE, context.getString(i14));
    }

    public static final String e(Context context, double d14, String str) {
        context.getClass();
        x52.d.f189064c.getClass();
        x52.d dVarA = x52.d.a.a(context, str);
        String str2 = NumberFormat.getNumberInstance(Locale.getDefault()).format(d14) + StringUtils.SPACE + ((Object) context.getText(R.string.lbl_bpm));
        return dVarA != null ? e5.g(context.getString(dVarA.f189068a), StringUtils.SPACE, str2) : str2;
    }

    public static final String f(Context context, double d14, String str) {
        context.getClass();
        x52.d.f189064c.getClass();
        x52.d dVarA = x52.d.a.a(context, str);
        if (dVarA == null) {
            return null;
        }
        return e5.g(context.getString(dVarA.f189068a), StringUtils.SPACE, l3.a.F0(l3.f23124b, context, d14, true));
    }

    public static final String g(Context context, double d14, j jVar) {
        Collection collectionS0;
        context.getClass();
        List listG = new k("\\.").g(0, String.valueOf(d14));
        if (!listG.isEmpty()) {
            ListIterator listIterator = listG.listIterator(listG.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionS0 = p13.j0.f134944a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    collectionS0 = h0.S0(listG, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            collectionS0 = p13.j0.f134944a;
            break;
        }
        String[] strArr = (String[]) collectionS0.toArray(new String[0]);
        int i14 = 2;
        if (!(strArr.length == 0) && !s.g(strArr[1], "0") && s.g(strArr[1].subSequence(0, 2).toString(), "99")) {
            return a(context, jVar, String.valueOf(MathKt.b(d14)));
        }
        StringBuilder sb3 = new StringBuilder();
        if (d14 < 0.0d) {
            sb3.append('-');
            d14 = -d14;
        }
        long j8 = (long) d14;
        if (j8 != 0) {
            sb3.append(j8);
        }
        double d15 = d14 - j8;
        double dAbs = Math.abs(d15);
        int i15 = 1;
        while (true) {
            double d16 = i14;
            double dAbs2 = Math.abs(d15 - (((double) MathKt.b(d15 * d16)) / d16));
            if (dAbs2 < dAbs) {
                i15 = i14;
                dAbs = dAbs2;
            }
            if (i14 == 100) {
                break;
            }
            i14++;
        }
        if (i15 > 1) {
            sb3.append(' ');
            sb3.append(MathKt.b(d15 * ((double) i15)));
            sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb3.append(i15);
        }
        return a(context, jVar, sb3.toString());
    }

    public static final String h(Context context, long j8) {
        context.getClass();
        long j14 = DateTimeConstants.SECONDS_PER_DAY;
        int i14 = (int) (j8 / j14);
        int i15 = (int) (j8 % j14);
        int i16 = i15 / DateTimeConstants.SECONDS_PER_HOUR;
        int i17 = i15 % DateTimeConstants.SECONDS_PER_HOUR;
        int i18 = i17 / 60;
        int i19 = i17 % 60;
        StringBuilder sb3 = new StringBuilder();
        if (i14 > 0) {
            sb3.append(context.getResources().getQuantityString(R.plurals.lbl_duration_day, i14, Integer.valueOf(i14)));
            sb3.append(StringUtils.SPACE);
        }
        if (i16 > 0) {
            sb3.append(i16);
            sb3.append(StringUtils.SPACE);
            sb3.append(context.getString(R.string.lbl_hour));
            sb3.append(StringUtils.SPACE);
        }
        if (i18 > 0) {
            sb3.append(i18);
            sb3.append(StringUtils.SPACE);
            sb3.append(context.getString(R.string.common_min_abbreviated_without_period));
            sb3.append(StringUtils.SPACE);
        }
        if (i19 > 0) {
            sb3.append(i19);
            sb3.append(StringUtils.SPACE);
            sb3.append(context.getString(R.string.lbl_second));
        }
        String string = sb3.toString();
        int length = string.length() - 1;
        int i24 = 0;
        boolean z14 = false;
        while (i24 <= length) {
            boolean z15 = s.h(string.charAt(!z14 ? i24 : length), 32) <= 0;
            if (z14) {
                if (!z15) {
                    break;
                }
                length--;
            } else if (z15) {
                i24++;
            } else {
                z14 = true;
            }
        }
        return string.subSequence(i24, length + 1).toString();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String i(m52.k kVar, j jVar, j0 j0Var, Context context, boolean z14, p<Boolean, Double> pVar) {
        m52.a aVar;
        double d14;
        String strC;
        String str;
        String string;
        kVar.getClass();
        context.getClass();
        pVar.getClass();
        Double d15 = null;
        Object[] objArr = 0;
        if (j0Var == null || (aVar = j0Var.f48227l) == null) {
            return null;
        }
        double d16 = j0Var.f48229n;
        boolean z15 = j0Var.f48223i;
        j0.c cVar = j0Var.f48224j;
        String string2 = "";
        int i14 = 2;
        switch (a.f175770a[aVar.ordinal()]) {
            case 1:
                return oi0.d.a(context, c(context, d16), new l0(7));
            case 2:
                String string3 = context.getString(R.string.lbl_lab_button_press);
                string3.getClass();
                return string3;
            case 3:
                return oi0.d.a(context, e(context, d16, j0Var.f48230o), new l0(8));
            case 4:
                return kVar == m52.k.f116758r ? oi0.d.a(context, g(context, d16, jVar), new l0(9)) : d(context, d16, j0Var.f48231p);
            case 5:
                String strB = new oi0.h(context).b((long) d16);
                return cVar != null ? context.getString(R.string.text_dot_text_pattern, strB, k(context, cVar)) : strB;
            case 6:
                new oi0.h(context);
                String strE = oi0.h.e((long) d16);
                x52.c.f189053e.getClass();
                x52.c cVarA = x52.c.a.a(aVar);
                if (cVarA != null) {
                    string2 = context.getString(cVarA.f189060a);
                    string2.getClass();
                }
                x0 x0Var = x0.f105818a;
                Locale locale = Locale.getDefault();
                String string4 = context.getString(R.string.text_dot_text_pattern);
                string4.getClass();
                return String.format(locale, string4, Arrays.copyOf(new Object[]{string2, strE}, 2));
            case 7:
                new oi0.h(context);
                String strE2 = oi0.h.e((long) d16);
                String string5 = context.getString(R.string.lbl_workout_send_off_time);
                string5.getClass();
                x0 x0Var2 = x0.f105818a;
                Locale locale2 = Locale.getDefault();
                String string6 = context.getString(R.string.text_dot_text_pattern);
                string6.getClass();
                return String.format(locale2, string6, Arrays.copyOf(new Object[]{string5, strE2}, 2));
            case 8:
                String strE3 = u0.e(context, j0Var.f48229n, pVar.f128594a.booleanValue(), pVar.f128595b);
                String string7 = context.getString(R.string.lbl_workout_css_based_send_off_time);
                string7.getClass();
                x0 x0Var3 = x0.f105818a;
                Locale locale3 = Locale.getDefault();
                String string8 = context.getString(R.string.text_dot_text_pattern);
                string8.getClass();
                return String.format(locale3, string8, Arrays.copyOf(new Object[]{string7, strE3}, 2));
            case 9:
                return oi0.d.a(context, f(context, j0Var.f48229n, j0Var.f48230o), new l0(10));
            case 10:
                l3.f23124b.getClass();
                if (!Double.isNaN(d16) && d16 >= 1.0d) {
                    String strB2 = l3.a.B(d16);
                    if (z15) {
                        string = context.getString(R.string.string_space_string_pattern, strB2.concat(Marker.ANY_NON_NULL_MARKER), context.getString(R.string.lbl_repetitions));
                    } else {
                        string = d16 > 1.0d ? context.getString(R.string.lbl_repetitions_value, strB2) : context.getString(R.string.lbl_repetition_value, strB2);
                    }
                    string2 = string;
                    string2.getClass();
                }
                if (string2.length() > 0) {
                    Double dR = r(j0Var);
                    if (dR == null || dR.doubleValue() <= 0.0d) {
                        d14 = 0.0d;
                    } else {
                        h hVar = new h(context, false, i14, objArr == true ? 1 : 0);
                        d14 = 0.0d;
                        if (z14) {
                            strC = null;
                        } else {
                            double d17 = j0Var.M0;
                            if (d17 >= 1.0d) {
                                double dDoubleValue = dR.doubleValue();
                                strC = hVar.c(Double.valueOf(d17), Double.valueOf((d17 < 0.0d || dDoubleValue < 0.0d) ? 0.0d : (dDoubleValue * 100.0d) / d17));
                            } else {
                                strC = null;
                            }
                        }
                        String strA = oi0.d.a(context, hVar.a(dR, l3.f23130h), new l0(11));
                        if (strC == null || strC.length() == 0) {
                            x0 x0Var4 = x0.f105818a;
                            String string9 = context.getString(R.string.text_dot_text_pattern);
                            string9.getClass();
                            str = String.format(string9, Arrays.copyOf(new Object[]{string2, strA}, 2));
                        } else {
                            x0 x0Var5 = x0.f105818a;
                            String string10 = context.getString(R.string.text_dot_text_unit_pattern);
                            string10.getClass();
                            str = String.format(string10, Arrays.copyOf(new Object[]{string2, strA, strC}, 3));
                        }
                        string2 = str;
                    }
                    d15 = dR;
                } else {
                    d14 = 0.0d;
                }
                if (cVar == null || (d15 != null && d15.doubleValue() > d14)) {
                    return string2;
                }
                String string11 = context.getString(R.string.text_dot_text_pattern, string2, k(context, cVar));
                string11.getClass();
                return string11;
            default:
                return context.getString(R.string.lbl_none);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r3v11 */
    public static final String j(m52.k kVar, j jVar, j0 j0Var, Context context, boolean z14, p<Boolean, Double> pVar) {
        m52.a aVar;
        String string;
        String str;
        kVar.getClass();
        context.getClass();
        pVar.getClass();
        Double d14 = 0;
        strC = null;
        String strC = null;
        if (j0Var == null || (aVar = j0Var.f48227l) == null) {
            return null;
        }
        double d15 = j0Var.f48229n;
        boolean z15 = j0Var.f48223i;
        j0.c cVar = j0Var.f48224j;
        boolean z16 = false;
        int i14 = 2;
        switch (a.f175770a[aVar.ordinal()]) {
            case 1:
                return c(context, d15);
            case 2:
                String string2 = context.getString(R.string.lbl_lab_button_press);
                string2.getClass();
                return string2;
            case 3:
                return e(context, d15, j0Var.f48230o);
            case 4:
                if (kVar == m52.k.f116758r) {
                    return g(context, d15, jVar);
                }
                Double dValueOf = Double.valueOf(d15);
                j jVar2 = j0Var.f48231p;
                e eVar = e.f175761a;
                return e.a(context, dValueOf, false, m52.a.f116649e, jVar2, false, false, 64);
            case 5:
                String strC2 = e.c(context, Double.valueOf(d15), false, false);
                return cVar != null ? context.getString(R.string.text_dot_text_pattern, strC2, k(context, cVar)) : strC2;
            case 6:
                new oi0.h(context);
                String strE = oi0.h.e((long) d15);
                x52.c.f189053e.getClass();
                x52.c cVarA = x52.c.a.a(aVar);
                if (cVarA != null) {
                    string = context.getString(cVarA.f189060a);
                    string.getClass();
                } else {
                    string = "";
                }
                x0 x0Var = x0.f105818a;
                Locale locale = Locale.getDefault();
                String string3 = context.getString(R.string.text_dot_text_pattern);
                string3.getClass();
                return String.format(locale, string3, Arrays.copyOf(new Object[]{string, strE}, 2));
            case 7:
                new oi0.h(context);
                String strE2 = oi0.h.e((long) d15);
                String string4 = context.getString(R.string.lbl_workout_send_off);
                string4.getClass();
                x0 x0Var2 = x0.f105818a;
                Locale locale2 = Locale.getDefault();
                String string5 = context.getString(R.string.text_dot_text_pattern);
                string5.getClass();
                return String.format(locale2, string5, Arrays.copyOf(new Object[]{string4, strE2}, 2));
            case 8:
                String strE3 = u0.e(context, d15, pVar.f128594a.booleanValue(), pVar.f128595b);
                String string6 = context.getString(R.string.lbl_workout_send_off);
                string6.getClass();
                x0 x0Var3 = x0.f105818a;
                Locale locale3 = Locale.getDefault();
                String string7 = context.getString(R.string.text_dot_text_pattern);
                string7.getClass();
                return String.format(locale3, string7, Arrays.copyOf(new Object[]{string6, strE3}, 2));
            case 9:
                return f(context, j0Var.f48229n, j0Var.f48230o);
            case 10:
                l3.f23124b.getClass();
                String strQ0 = l3.a.Q0(d15, context, z15);
                if (strQ0.length() > 0) {
                    Double dR = r(j0Var);
                    if (dR != null && dR.doubleValue() > 0.0d) {
                        h hVar = new h(context, z16, i14, d14);
                        if (!z14) {
                            double d16 = j0Var.M0;
                            if (d16 >= 1.0d) {
                                double dDoubleValue = dR.doubleValue();
                                strC = hVar.c(Double.valueOf(d16), Double.valueOf((d16 < 0.0d || dDoubleValue < 0.0d) ? 0.0d : (dDoubleValue * 100.0d) / d16));
                            }
                        }
                        if (strC == null || strC.length() == 0) {
                            x0 x0Var4 = x0.f105818a;
                            str = String.format("%s · %s", Arrays.copyOf(new Object[]{strQ0, hVar.a(dR, l3.f23130h)}, 2));
                        } else {
                            x0 x0Var5 = x0.f105818a;
                            str = String.format("%s · %s (%s)", Arrays.copyOf(new Object[]{strQ0, hVar.a(dR, l3.f23130h), strC}, 3));
                        }
                        strQ0 = str;
                    }
                    d14 = dR;
                }
                if (cVar == null || (d14 != 0 && d14.doubleValue() > 0.0d)) {
                    return strQ0;
                }
                String string8 = context.getString(R.string.text_dot_text_pattern, strQ0, k(context, cVar));
                string8.getClass();
                return string8;
            default:
                return context.getString(R.string.lbl_none);
        }
    }

    public static final String k(Context context, j0.c cVar) {
        int i14;
        context.getClass();
        cVar.getClass();
        int i15 = a.f175771b[cVar.ordinal()];
        if (i15 == 1) {
            i14 = R.string.lbl_light_weight;
        } else if (i15 == 2) {
            i14 = R.string.lbl_moderate_weight;
        } else if (i15 == 3) {
            i14 = R.string.lbl_heavy_weight;
        } else if (i15 == 4) {
            i14 = R.string.lbl_very_heavy;
        } else {
            if (i15 != 5) {
                lc.u0.r();
                return null;
            }
            i14 = R.string.strength_body_weight;
        }
        String string = context.getString(i14);
        string.getClass();
        return string;
    }

    public static final String l(m52.k kVar, j0 j0Var, List<v> list, int i14, Context context, p<Boolean, Double> pVar, boolean z14) {
        kVar.getClass();
        j0Var.getClass();
        context.getClass();
        pVar.getClass();
        x52.f.f189078g.getClass();
        x52.f fVarB = x52.f.a.b(j0Var, kVar);
        double d14 = j0Var.f48233r;
        double d15 = j0Var.f48234t;
        double d16 = j0Var.D;
        m52.h hVar = j0Var.f48235v;
        int i15 = j0Var.C;
        return p(kVar, fVarB, d14, d15, d16, hVar, i14, i15 > 0, i15, j0Var.f48236w, j0Var.f48237x, j0Var.f48238y, list, context, null, pVar, z14, 16384);
    }

    public static final String m(m52.k kVar, j0 j0Var, List<v> list, int i14, Context context, p<Boolean, Double> pVar, boolean z14) {
        kVar.getClass();
        j0Var.getClass();
        context.getClass();
        pVar.getClass();
        x52.f.f189078g.getClass();
        x52.f fVarB = x52.f.a.b(j0Var, kVar);
        double d14 = j0Var.f48233r;
        double d15 = j0Var.f48234t;
        m52.h hVar = j0Var.f48235v;
        int i15 = j0Var.C;
        return q(kVar, fVarB, d14, d15, hVar, i14, i15 > 0, i15, j0Var.f48236w, j0Var.f48237x, j0Var.f48238y, list, context, null, pVar, z14, 8192);
    }

    public static final String n(m52.k kVar, j0 j0Var, List<v> list, int i14, Context context, j jVar, p<Boolean, Double> pVar) {
        kVar.getClass();
        j0Var.getClass();
        context.getClass();
        pVar.getClass();
        x52.f.f189078g.getClass();
        x52.f fVarA = x52.f.a.a(j0Var, kVar);
        double d14 = j0Var.F;
        double d15 = j0Var.I;
        double d16 = j0Var.D;
        m52.h hVar = j0Var.P;
        int i15 = j0Var.T;
        return p(kVar, fVarA, d14, d15, d16, hVar, i14, i15 > 0, i15, j0Var.f48239z, j0Var.A, j0Var.B, list, context, jVar, pVar, false, 131072);
    }

    public static final String o(m52.k kVar, j0 j0Var, List<v> list, int i14, Context context, j jVar, p<Boolean, Double> pVar) {
        kVar.getClass();
        j0Var.getClass();
        context.getClass();
        pVar.getClass();
        x52.f.f189078g.getClass();
        x52.f fVarA = x52.f.a.a(j0Var, kVar);
        double d14 = j0Var.F;
        double d15 = j0Var.I;
        m52.h hVar = j0Var.P;
        int i15 = j0Var.T;
        return q(kVar, fVarA, d14, d15, hVar, i14, i15 > 0, i15, j0Var.f48239z, j0Var.A, j0Var.B, list, context, jVar, pVar, false, 65536);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Multi-variable type inference failed */
    public static String p(m52.k kVar, x52.f fVar, double d14, double d15, double d16, m52.h hVar, int i14, boolean z14, int i15, int i16, int i17, int i18, List list, Context context, j jVar, p pVar, boolean z15, int i19) {
        Context context2;
        String string;
        int iV;
        int iB;
        int iT;
        CharSequence text;
        Boolean bool;
        int i24;
        j jVar2 = (i19 & 16384) != 0 ? null : jVar;
        boolean z16 = (i19 & 131072) != 0 ? false : z15;
        String string2 = context.getString(z16 ? R.string.workout_intensity_target : fVar.f189097b);
        string2.getClass();
        m52.g gVar = fVar.f189099d;
        int[] iArr = a.f175773d;
        String strH = "";
        switch (iArr[gVar.ordinal()]) {
            case 1:
                context2 = context;
                CharSequence text2 = context2.getText(R.string.lbl_spm);
                text2.getClass();
                if (kVar == m52.k.f116755o) {
                    text2 = context2.getText(R.string.lbl_rpm);
                    text2.getClass();
                }
                strH = ((int) d14) + " - " + ((int) d15) + StringUtils.SPACE + ((Object) text2);
                string = strH;
                break;
            case 2:
                context2 = context;
                if (!z14) {
                    string = ((int) d14) + " - " + ((int) d15) + StringUtils.SPACE + ((Object) context2.getText(R.string.lbl_bpm));
                } else {
                    x52.g.f189104d.getClass();
                    x52.g gVarA = x52.g.a.a(i15);
                    if (gVarA == null) {
                        string = null;
                    } else {
                        string = context2.getString(R.string.workout_hr_zone_x, Integer.valueOf(gVarA.f189113a));
                        string.getClass();
                    }
                }
                break;
            case 3:
                l3.a aVar = l3.f23124b;
                q3 q3Var = s() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                DecimalFormat decimalFormat = l3.f23126d;
                aVar.getClass();
                String strM0 = l3.a.M0(context, d14, q3Var, decimalFormat, false);
                String strM1 = l3.a.M0(context, d15, s() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR, l3.f23126d, true);
                String strM2 = l3.a.M0(context, d16, s() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR, l3.f23126d, true);
                context2 = context;
                x0 x0Var = x0.f105818a;
                Locale locale = Locale.getDefault();
                String string3 = context2.getString(R.string.text_dash_text_pattern);
                string3.getClass();
                strH = com.nimbusds.jose.shaded.gson.internal.a.h(strM2, " (", String.format(locale, string3, Arrays.copyOf(new Object[]{strM0, strM1}, 2)), ")");
                string = strH;
                break;
            case 4:
                if (kVar == m52.k.f116758r) {
                    boolean zBooleanValue = (jVar2 == null || (bool = jVar2.f116752c) == null) ? hVar != m52.h.YARD : bool.booleanValue();
                    l3.f23124b.getClass();
                    strH = l3.a.S0(new l22.a(context), l3.a.r(d14, zBooleanValue), Boolean.valueOf(zBooleanValue));
                    string2 = context.getString(x52.f.f189083l.f189097b);
                    string2.getClass();
                } else {
                    if (s()) {
                        l3.f23124b.getClass();
                        iV = l3.a.t(d14);
                        iT = l3.a.t(d15);
                        iB = MathKt.b(((((double) iT) + ((double) iV)) / ((double) 2)) / ((double) 5)) * 5;
                        text = context.getText(R.string.lbl_minute_per_km_without_period);
                        text.getClass();
                    } else {
                        l3.f23124b.getClass();
                        iV = l3.a.v(d14);
                        int iV2 = l3.a.v(d15);
                        CharSequence text3 = context.getText(R.string.lbl_pace_unit_mi);
                        text3.getClass();
                        iB = MathKt.b(((((double) iV2) + ((double) iV)) / ((double) 2)) / ((double) 5)) * 5;
                        iT = iV2;
                        text = text3;
                    }
                    l3.a aVar2 = l3.f23124b;
                    strH = aVar2.p0(iB, context) + StringUtils.SPACE + ((Object) text) + " (" + aVar2.p0(iV, context) + " - " + aVar2.p0(iT, context) + StringUtils.SPACE + ((Object) text) + ")";
                }
                context2 = context;
                string = strH;
                break;
            case 5:
                if (z14) {
                    x52.g.f189104d.getClass();
                    x52.g gVarA2 = x52.g.a.a(i15);
                    if (gVarA2 != null) {
                        string = gVarA2.a(context);
                    } else {
                        string = null;
                    }
                } else {
                    string = gl1.d.x(context, d14, d15, hVar, i14);
                }
                context2 = context;
                break;
            case 6:
                strH = y.m(i16, i17, i18, list, context);
                context2 = context;
                string = strH;
                break;
            case 7:
                if (d14 > 0.0d) {
                    x52.a.f189039c.getClass();
                    x52.a aVarA = x52.a.C3515a.a((int) d14);
                    if (aVarA != null) {
                        string = context.getString(aVarA.f189044b);
                    } else {
                        string = null;
                    }
                } else {
                    string = "";
                }
                context2 = context;
                break;
            case 8:
                strH = u0.e(context, d14, ((Boolean) pVar.f128594a).booleanValue(), (Double) pVar.f128595b);
                context2 = context;
                string = strH;
                break;
            case 9:
                if (d14 > 0.0d) {
                    l22.a aVar3 = new l22.a(context);
                    x52.b.f189045c.getClass();
                    x52.b bVarA = x52.b.a.a((int) d14);
                    if (bVarA != null) {
                        string = aVar3.getString(bVarA.f189052b);
                    } else {
                        string = null;
                    }
                } else {
                    string = "";
                }
                context2 = context;
                break;
            default:
                context2 = context;
                string = strH;
                break;
        }
        if (n.d(string) && (i24 = iArr[fVar.f189099d.ordinal()]) != 7 && i24 != 8) {
            if (i24 != 9) {
                String string4 = context2.getString(R.string.string_space_bullet_string_pattern, string2, string);
                string4.getClass();
                return string4;
            }
            if (z16) {
                string = context2.getString(R.string.string_space_bullet_string_pattern, string2, string);
            }
            string.getClass();
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Multi-variable type inference failed */
    public static String q(m52.k kVar, x52.f fVar, double d14, double d15, m52.h hVar, int i14, boolean z14, int i15, int i16, int i17, int i18, List list, Context context, j jVar, p pVar, boolean z15, int i19) {
        int iV;
        int iV2;
        CharSequence text;
        Boolean bool;
        Context context2;
        Context context3 = context;
        String string = null;
        j jVar2 = (i19 & 8192) != 0 ? null : jVar;
        boolean zBooleanValue = false;
        String string2 = context3.getString((i19 & 65536) != 0 ? false : z15 ? R.string.workout_intensity_target : fVar.f189097b);
        string2.getClass();
        String strS0 = "";
        switch (a.f175773d[fVar.f189099d.ordinal()]) {
            case 1:
                CharSequence text2 = context3.getText(R.string.lbl_strides_per_minutes);
                text2.getClass();
                if (kVar == m52.k.f116755o) {
                    text2 = context3.getText(R.string.lbl_revolutions_per_minute);
                    text2.getClass();
                }
                strS0 = ((int) d14) + " - " + ((int) d15) + StringUtils.SPACE + ((Object) text2);
                break;
            case 2:
                if (z14) {
                    x52.g.f189104d.getClass();
                    x52.g gVarA = x52.g.a.a(i15);
                    if (gVarA != null) {
                        string = context3.getString(R.string.workout_hr_zone_x, Integer.valueOf(gVarA.f189113a));
                        string.getClass();
                    }
                } else {
                    string = ((int) d14) + " - " + ((int) d15) + StringUtils.SPACE + ((Object) context3.getText(R.string.lbl_heart_rate_beats_per_minute));
                }
                strS0 = string;
                break;
            case 3:
                l3.a aVar = l3.f23124b;
                q3 q3Var = s() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                DecimalFormat decimalFormat = l3.f23126d;
                aVar.getClass();
                String strM0 = l3.a.M0(context3, d14, q3Var, decimalFormat, false);
                String strM1 = l3.a.M0(context, d15, s() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR, l3.f23126d, true);
                context3 = context;
                x0 x0Var = x0.f105818a;
                Locale locale = Locale.getDefault();
                String string3 = context3.getString(R.string.text_dash_text_pattern);
                string3.getClass();
                strS0 = String.format(locale, string3, Arrays.copyOf(new Object[]{strM0, strM1}, 2));
                break;
            case 4:
                if (kVar == m52.k.f116758r) {
                    if (jVar2 != null && (bool = jVar2.f116752c) != null) {
                        zBooleanValue = bool.booleanValue();
                    } else if (hVar != m52.h.YARD) {
                        zBooleanValue = true;
                    }
                    l3.f23124b.getClass();
                    strS0 = l3.a.S0(new l22.a(context3), l3.a.r(d14, true), Boolean.valueOf(zBooleanValue));
                    string2 = context3.getString(x52.f.f189083l.f189097b);
                    string2.getClass();
                } else {
                    if (s()) {
                        l3.f23124b.getClass();
                        iV = l3.a.t(d14);
                        iV2 = l3.a.t(d15);
                        text = context3.getText(R.string.lbl_minutes_per_kilometer);
                        text.getClass();
                    } else {
                        l3.f23124b.getClass();
                        iV = l3.a.v(d14);
                        iV2 = l3.a.v(d15);
                        text = context3.getText(R.string.lbl_minutes_per_mile);
                        text.getClass();
                    }
                    l3.a aVar2 = l3.f23124b;
                    strS0 = aVar2.p0(iV, context3) + " - " + aVar2.p0(iV2, context3) + StringUtils.SPACE + ((Object) text);
                }
                context3 = context3;
                break;
            case 5:
                if (z14) {
                    x52.g.f189104d.getClass();
                    x52.g gVarA2 = x52.g.a.a(i15);
                    string = gVarA2 != null ? gVarA2.a(context3) : null;
                    context2 = context3;
                } else {
                    context2 = context3;
                    string = gl1.d.x(context2, d14, d15, hVar, i14);
                }
                context3 = context2;
                strS0 = string;
                break;
            case 6:
                strS0 = oi0.d.a(context3, y.m(i16, i17, i18, list, context), new l0(6));
                break;
            case 7:
                if (d14 > 0.0d) {
                    x52.a.f189039c.getClass();
                    x52.a aVarA = x52.a.C3515a.a((int) d14);
                    if (aVarA != null) {
                        string = context3.getString(aVarA.f189044b);
                    }
                } else {
                    string = "";
                }
                strS0 = string;
                break;
            case 8:
                strS0 = u0.e(context3, d14, ((Boolean) pVar.f128594a).booleanValue(), (Double) pVar.f128595b);
                break;
            case 9:
                if (d14 > 0.0d) {
                    x52.b.f189045c.getClass();
                    x52.b bVarA = x52.b.a.a((int) d14);
                    if (bVarA != null) {
                        string = context3.getString(bVarA.f189052b);
                    }
                } else {
                    string = "";
                }
                strS0 = string;
                break;
        }
        return (strS0 == null || strS0.length() == 0) ? strS0 : context3.getString(R.string.string_space_bullet_string_pattern, string2, strS0);
    }

    public static final Double r(j0 j0Var) {
        Double dValueOf = j0Var != null ? Double.valueOf(j0Var.J0) : null;
        Double dValueOf2 = j0Var != null ? Double.valueOf(j0Var.N0) : null;
        Double dValueOf3 = j0Var != null ? Double.valueOf(j0Var.M0) : null;
        double d14 = 0.0d;
        if (dValueOf2 == null || dValueOf2.doubleValue() < 0.0d || dValueOf3 == null || dValueOf3.doubleValue() < 1.0d) {
            if (dValueOf == null || dValueOf.doubleValue() < 0.0d) {
                return null;
            }
            return dValueOf;
        }
        double dDoubleValue = dValueOf3.doubleValue();
        double dDoubleValue2 = dValueOf2.doubleValue();
        if (dDoubleValue >= 0.0d && dDoubleValue2 >= 0.0d) {
            d14 = (dDoubleValue * dDoubleValue2) / 100.0d;
        }
        return Double.valueOf(d14);
    }

    public static final boolean s() {
        return ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
    }
}
