package k42;

import android.content.Context;
import c22.l3;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import d53.u;
import f12.l;
import gh2.i;
import i3.e5;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import l42.d;
import l42.g;
import l42.j;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk42/b;", "", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f102880a = new b();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102881a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BMI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.BODY_FAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.BODY_WATER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.MUSCLE_MASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.BONE_MASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f102881a = iArr;
        }
    }

    /* JADX INFO: renamed from: k42.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1972b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((d) t7).f109935a), Integer.valueOf(((d) t14).f109935a));
        }
    }

    private b() {
    }

    public static final String a(Context context, String str) {
        context.getClass();
        f102880a.getClass();
        return e5.g(str, StringUtils.SPACE, q(context));
    }

    public static final double b(double d14) {
        k42.a aVar = (k42.a) KoinJavaComponent.get$default(k42.a.class, null, null, 6, null);
        l3.a aVar2 = l3.f23124b;
        float fT = aVar.t();
        aVar2.getClass();
        double dB = l3.a.b(fT);
        if (dB <= 0.0d || Double.isNaN(d14)) {
            return -1.0d;
        }
        return d14 / (dB * dB);
    }

    public static final double c(double d14) {
        l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
        if (Double.isNaN(d14)) {
            return Double.NaN;
        }
        if (!lVar.C1()) {
            if (lVar.y()) {
                return d14;
            }
            l3.f23124b.getClass();
            return d14 * 2.20462d;
        }
        int iD = ((k42.a) KoinJavaComponent.get$default(k42.a.class, null, null, 6, null)).d();
        if (iD == 0) {
            return d14;
        }
        if (iD == 1) {
            l3.f23124b.getClass();
            return d14 * 2.20462d;
        }
        if (iD != 2) {
            l3.f23124b.getClass();
            return d14 * 2.20462d;
        }
        l3.f23124b.getClass();
        return (d14 / 6350.0d) * ((double) 1000);
    }

    public static final String d(Double d14, String str, NumberFormat numberFormat) {
        str.getClass();
        numberFormat.getClass();
        if (d14 == null || d14.doubleValue() <= 0.0d || Double.isNaN(d14.doubleValue())) {
            return str;
        }
        String str2 = numberFormat.format(d14.doubleValue());
        str2.getClass();
        return str2;
    }

    public static String e(Context context, double d14, NumberFormat numberFormat) {
        if (Double.isNaN(d14)) {
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }
        String str = numberFormat.format(t((d14 - Math.floor(d14)) * 14.0d).doubleValue());
        str.getClass();
        return str;
    }

    public static String f(double d14, DecimalFormat decimalFormat) {
        int iSignum = BigDecimal.valueOf(d14).signum();
        int i14 = (int) d14;
        String strV = decimalFormat.format(i14);
        if (i14 == 0 && iSignum == -1) {
            strV.getClass();
            strV = u.v(strV, Marker.ANY_NON_NULL_MARKER, "-", false);
        }
        strV.getClass();
        return strV;
    }

    public static String g(Double d14) {
        l3.f23124b.getClass();
        DecimalFormat decimalFormat = l3.f23130h;
        decimalFormat.getClass();
        if (d14 == null) {
            return null;
        }
        return decimalFormat.format(d14.doubleValue());
    }

    public static String h(Context context, double d14, boolean z14, NumberFormat numberFormat) {
        String string;
        if (Double.isNaN(d14)) {
            string = context.getString(R.string.no_value);
            string.getClass();
        } else {
            string = numberFormat.format(t(d14).doubleValue());
            string.getClass();
        }
        if (!z14) {
            return string;
        }
        String string2 = context.getString(R.string.string_space_string_pattern, string, q(context));
        string2.getClass();
        return string2;
    }

    public static String i(Context context, Double d14) {
        context.getClass();
        if (d14 != null) {
            double dC = c(d14.doubleValue());
            l3.f23124b.getClass();
            return j(context, dC, true, l3.f23130h);
        }
        String string = context.getString(R.string.lbl_dashes);
        string.getClass();
        return string;
    }

    public static final String j(Context context, double d14, boolean z14, NumberFormat numberFormat) {
        context.getClass();
        numberFormat.getClass();
        boolean zC1 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).C1();
        b bVar = f102880a;
        if (!zC1) {
            bVar.getClass();
            return h(context, d14, z14, numberFormat);
        }
        int iD = ((k42.a) KoinJavaComponent.get$default(k42.a.class, null, null, 6, null)).d();
        if (iD == 0 || iD == 1) {
            bVar.getClass();
            return h(context, d14, z14, numberFormat);
        }
        if (iD != 2) {
            bVar.getClass();
            return h(context, d14, z14, numberFormat);
        }
        bVar.getClass();
        if (Double.isNaN(d14)) {
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }
        l3.f23124b.getClass();
        String strF = f(d14, l3.f23131i);
        String strE = e(context, Math.abs(d14), numberFormat);
        x0 x0Var = x0.f105818a;
        String string2 = context.getString(z14 ? R.string.stone_pound_long : R.string.stone_pound_short);
        string2.getClass();
        return String.format(string2, Arrays.copyOf(new Object[]{strF, strE}, 2));
    }

    public static List k(g gVar) {
        ArrayList arrayListD = x.d(d.WEIGHT, d.BMI);
        Integer boneMass = gVar != null ? gVar.getBoneMass() : null;
        Double bodyWater = gVar != null ? gVar.getBodyWater() : null;
        Integer muscleMass = gVar != null ? gVar.getMuscleMass() : null;
        Double bodyFat = gVar != null ? gVar.getBodyFat() : null;
        if ((boneMass != null && boneMass.intValue() > 0) || ((bodyFat != null && bodyFat.doubleValue() > 0.0d) || ((muscleMass != null && muscleMass.intValue() > 0) || (bodyWater != null && bodyWater.doubleValue() > 0.0d)))) {
            arrayListD.add(d.BODY_FAT);
            arrayListD.add(d.MUSCLE_MASS);
            arrayListD.add(d.BONE_MASS);
            arrayListD.add(d.BODY_WATER);
        }
        return h0.N0(arrayListD, new C1972b());
    }

    public static int l() {
        l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
        if (lVar.C1()) {
            int iD = ((k42.a) KoinJavaComponent.get$default(k42.a.class, null, null, 6, null)).d();
            if (iD == 0) {
                return 0;
            }
            if (iD != 1 && iD == 2) {
                return 2;
            }
        } else if (lVar.y()) {
            return 0;
        }
        return 1;
    }

    public static int m(double d14) {
        BigDecimal bigDecimalT = t(d14);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(bigDecimalT.intValue());
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalSubtract = bigDecimalT.subtract(bigDecimalValueOf);
        bigDecimalSubtract.getClass();
        BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(new BigDecimal(10.0d));
        bigDecimalMultiply.getClass();
        return bigDecimalMultiply.intValue();
    }

    public static double n(j jVar, d dVar) {
        jVar.getClass();
        switch (dVar == null ? -1 : a.f102881a[dVar.ordinal()]) {
            case 1:
                Double weight = jVar.getWeight();
                if (weight != null) {
                    return s(weight.doubleValue()) ? c(weight.doubleValue() / ((double) 1000)) : weight.doubleValue();
                }
                return Double.NaN;
            case 2:
                Double bmi = jVar.getBmi();
                Double weight2 = jVar.getWeight();
                if (bmi != null && !s.c(bmi, 0.0d)) {
                    return bmi.doubleValue();
                }
                if (weight2 == null) {
                    return Double.NaN;
                }
                if ("INDEX_SCALE".equals(jVar.getSourceType()) && !(jVar instanceof g)) {
                    return Double.NaN;
                }
                l3.a aVar = l3.f23124b;
                double dDoubleValue = weight2.doubleValue();
                aVar.getClass();
                return b(l3.a.P1(dDoubleValue));
            case 3:
                Double bodyFat = jVar.getBodyFat();
                if (bodyFat != null) {
                    return bodyFat.doubleValue();
                }
                return Double.NaN;
            case 4:
                Double bodyWater = jVar.getBodyWater();
                if (bodyWater != null) {
                    return bodyWater.doubleValue();
                }
                return Double.NaN;
            case 5:
                Integer muscleMass = jVar.getMuscleMass();
                if (muscleMass == null) {
                    return Double.NaN;
                }
                double dIntValue = muscleMass.intValue();
                return s(dIntValue) ? c(dIntValue / ((double) 1000)) : dIntValue;
            case 6:
                Integer boneMass = jVar.getBoneMass();
                if (boneMass == null) {
                    return Double.NaN;
                }
                double dIntValue2 = boneMass.intValue();
                return s(dIntValue2) ? c(dIntValue2 / ((double) 1000)) : dIntValue2;
            default:
                return Double.NaN;
        }
    }

    public static final String o(Context context, Double d14, String str) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            String string = context.getString(R.string.lbl_trend_maintained);
            string.getClass();
            return string;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        double dC = c(l3.a.P1(dDoubleValue));
        if (dC < 0.05d && dC > -0.05d) {
            String string2 = context.getString(R.string.lbl_trend_maintained);
            string2.getClass();
            return string2;
        }
        if (dC > 0.0d) {
            String string3 = context.getString(R.string.lbl_trent_up, str);
            string3.getClass();
            return string3;
        }
        String string4 = context.getString(R.string.lbl_trent_down, str);
        string4.getClass();
        return string4;
    }

    public static final int p(Double d14) {
        if (d14 == null || Double.isNaN(d14.doubleValue())) {
            return 2131232768;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        double dC = c(l3.a.P1(dDoubleValue));
        if (dC >= 0.05d || dC <= -0.05d) {
            return dC > 0.0d ? 2131232769 : 2131232767;
        }
        return 2131232768;
    }

    public static String q(Context context) {
        context.getClass();
        l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
        if (!lVar.C1()) {
            if (lVar.y()) {
                String string = context.getString(R.string.lbl_kg);
                string.getClass();
                return string;
            }
            String string2 = context.getString(R.string.lbl_lbs);
            string2.getClass();
            return string2;
        }
        int iD = ((k42.a) KoinJavaComponent.get$default(k42.a.class, null, null, 6, null)).d();
        if (iD == 0) {
            String string3 = context.getString(R.string.lbl_kg);
            string3.getClass();
            return string3;
        }
        if (iD == 1) {
            String string4 = context.getString(R.string.lbl_lbs);
            string4.getClass();
            return string4;
        }
        if (iD != 2) {
            String string5 = context.getString(R.string.lbl_lbs);
            string5.getClass();
            return string5;
        }
        String string6 = context.getString(R.string.lbl_abbrev_stone);
        string6.getClass();
        return string6;
    }

    public static boolean r() {
        bv.b.f21239a.getClass();
        bv.b.a();
        k1 k1Var = k1.f37122a;
        s3.f23252a.getClass();
        if (s3.a("ROLE_MBTESTER")) {
            return true;
        }
        k1Var.getClass();
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return i.f77458c.a().f77477b.c("index2_mwpd");
    }

    public static final boolean s(double d14) {
        return (Double.isNaN(d14) || d14 == 0.0d) ? false : true;
    }

    public static BigDecimal t(double d14) {
        BigDecimal scale = new BigDecimal(String.valueOf(d14)).setScale(1, RoundingMode.HALF_EVEN);
        scale.getClass();
        return scale;
    }
}
