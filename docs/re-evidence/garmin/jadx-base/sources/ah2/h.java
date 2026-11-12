package ah2;

import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.Arrays;
import java.util.Locale;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public interface h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lah2/h$a;", "", "<init>", "(Ljava/lang/String;I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        INT,
        TWO_DECIMALS
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lah2/h$b;", "", "<init>", "(Ljava/lang/String;I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        METERS,
        KILO_METERS,
        MILES;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3301a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.METERS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.KILO_METERS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.MILES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3301a = iArr;
            }
        }

        public final String a(m mVar) {
            int i14;
            int i15;
            x1 x1Var = n.f135158a;
            int i16 = a.f3301a[ordinal()];
            if (i16 == 1) {
                i14 = 1086188142;
                i15 = R.string.lbl_m;
            } else if (i16 == 2) {
                i14 = 1086190127;
                i15 = R.string.lbl_km;
            } else {
                if (i16 != 3) {
                    throw n23.j.m(mVar, 1086187038);
                }
                i14 = 1086191953;
                i15 = R.string.lbl_mile;
            }
            return sn.a.h(mVar, i14, i15, mVar);
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3303b;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.METERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.KILO_METERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.MILES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3302a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.TWO_DECIMALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f3303b = iArr2;
        }
    }

    String A(Float f14, boolean z14, boolean z15);

    String a(Float f14, boolean z14);

    default String b(Float f14) {
        String strValueOf = String.valueOf(f14.floatValue());
        return strValueOf == null ? "--" : strValueOf;
    }

    String c(Float f14);

    String d(Float f14);

    String e(Float f14);

    String f(Float f14);

    String g(Float f14);

    default String h(Integer num) {
        String strValueOf;
        return (num == null || (strValueOf = String.valueOf(num.intValue())) == null) ? "--" : strValueOf;
    }

    String i(Float f14);

    String j(boolean z14, Integer num);

    String k(Float f14);

    String l(Float f14);

    String m(Float f14);

    String n(Float f14);

    String o(Float f14, boolean z14, boolean z15);

    String p(Float f14);

    String q(Float f14);

    String r(Float f14, boolean z14);

    String s(Float f14);

    String t(Float f14);

    String u(Float f14);

    String v(Float f14);

    String w(Float f14);

    String x(Float f14);

    default String y(Float f14, b bVar, a aVar, boolean z14) {
        float fFloatValue;
        String str;
        String str2;
        float fFloatValue2;
        float f15;
        bVar.getClass();
        aVar.getClass();
        if (f14 == null) {
            return "--";
        }
        int[] iArr = c.f3302a;
        int i14 = iArr[bVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                fFloatValue2 = f14.floatValue();
                f15 = 1000.0f;
            } else {
                if (i14 != 3) {
                    u0.r();
                    return null;
                }
                fFloatValue2 = f14.floatValue();
                f15 = 1609.344f;
            }
            fFloatValue = fFloatValue2 / f15;
        } else {
            fFloatValue = f14.floatValue();
        }
        x0 x0Var = x0.f105818a;
        Locale locale = Locale.getDefault();
        int i15 = c.f3303b[aVar.ordinal()];
        if (i15 == 1) {
            str = "%,.0f";
        } else {
            if (i15 != 2) {
                u0.r();
                return null;
            }
            str = "%,.2f";
        }
        String str3 = String.format(locale, str, Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1));
        if (!z14) {
            return str3;
        }
        int i16 = iArr[bVar.ordinal()];
        if (i16 == 1) {
            str2 = "m";
        } else if (i16 == 2) {
            str2 = "km";
        } else {
            if (i16 != 3) {
                u0.r();
                return null;
            }
            str2 = "mi";
        }
        return e5.g(str3, StringUtils.SPACE, str2);
    }

    default String z(Float f14, boolean z14) {
        if (Float.isNaN(f14.floatValue())) {
            return "--";
        }
        float fFloatValue = z14 ? f14.floatValue() : f14.floatValue() * 3.28084f;
        x0 x0Var = x0.f105818a;
        return e5.g(String.format(Locale.getDefault(), "%,.0f", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1)), StringUtils.SPACE, z14 ? "m" : "ft");
    }
}
