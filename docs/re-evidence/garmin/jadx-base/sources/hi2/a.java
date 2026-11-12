package hi2;

import com.mapbox.turf.TurfConstants;
import java.text.DecimalFormat;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhi2/a;", "", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1658a f83879a = new C1658a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f83880b = new d("Conversions", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DecimalFormat f83881c = new DecimalFormat("#.#");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DecimalFormat f83882d = new DecimalFormat("#.##");

    /* JADX INFO: renamed from: hi2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lhi2/a$a;", "", "<init>", "()V", "", "FT_TO_INCH", "I", "GM_TO_KGS", "", "INCH_TO_CM", "D", "KGS_TO_LBS", "MILLIMETRE_TO_METER", "ONE_HUNDRED_METERS", "ONE_MINUTE_TO_SECONDS", "Lhi2/d;", "logger", "Lhi2/d;", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1658a {

        /* JADX INFO: renamed from: hi2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhi2/a$a$a;", "", "", TurfConstants.UNIT_FEET, TurfConstants.UNIT_INCHES, "<init>", "(II)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class C1659a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f83883a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f83884b;

            public C1659a(int i14, int i15) {
                this.f83883a = i14;
                this.f83884b = i15;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1659a)) {
                    return false;
                }
                C1659a c1659a = (C1659a) obj;
                return this.f83883a == c1659a.f83883a && this.f83884b == c1659a.f83884b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f83884b) + (Integer.hashCode(this.f83883a) * 31);
            }

            public final String toString() {
                return am.j.g(this.f83883a, this.f83884b, "Height(feet=", ", inches=", ")");
            }
        }

        public /* synthetic */ C1658a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static long a(String str) {
            try {
                return (long) Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                d dVar = a.f83880b;
                str.concat(" cannot be converted to Long");
                dVar.getClass();
                return -1L;
            }
        }

        public static String b(String str, DecimalFormat decimalFormat) {
            decimalFormat.getClass();
            try {
                double d14 = Double.parseDouble(str);
                int i14 = (int) d14;
                if (d14 - ((double) i14) <= 0.0d) {
                    return String.valueOf(i14);
                }
                String str2 = decimalFormat.format(d14);
                str2.getClass();
                return str2;
            } catch (NumberFormatException unused) {
                d dVar = a.f83880b;
                str.concat(" is not a number");
                dVar.getClass();
                return str;
            }
        }

        public static C1659a c(double d14) {
            int iB = MathKt.b(d14 / 2.54d);
            int i14 = iB / 12;
            return new C1659a(i14, iB - (i14 * 12));
        }

        public static p d(Double d14) {
            if (d14 == null || Double.isNaN(d14.doubleValue())) {
                return null;
            }
            int iB = MathKt.b(((double) 100) / (d14.doubleValue() / ((double) 1000)));
            return new p(Integer.valueOf(iB / 60), Integer.valueOf(iB % 60));
        }

        public static String e(double d14) {
            String str = a.f83881c.format((d14 / ((double) 1000)) * 2.20462d);
            str.getClass();
            return str;
        }

        public static boolean f(String str) {
            if (str != null) {
                try {
                    return Boolean.parseBoolean(str);
                } catch (ClassCastException unused) {
                    d dVar = a.f83880b;
                    str.concat(" cannot be boolean");
                    dVar.getClass();
                }
            }
            return false;
        }

        public static Double g(String str) {
            try {
                return Double.valueOf(Double.parseDouble(str));
            } catch (NumberFormatException unused) {
                d dVar = a.f83880b;
                "Number format exception ".concat(str);
                dVar.getClass();
                return null;
            }
        }

        public static int h(String str) {
            if (str != null) {
                try {
                    String str2 = str.length() > 0 ? str : null;
                    if (str2 != null) {
                        C1658a c1658a = a.f83879a;
                        double d14 = Double.parseDouble(str2);
                        c1658a.getClass();
                        return (int) d14;
                    }
                } catch (NumberFormatException unused) {
                    d dVar = a.f83880b;
                    "Number format exception ".concat(str);
                    dVar.getClass();
                }
            }
            return -1;
        }

        public static String i(String str) {
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf((int) Double.parseDouble(str)).toString();
            } catch (NumberFormatException | Exception unused) {
                return str;
            } catch (NumberFormatException unused2) {
                return Double.valueOf(Double.parseDouble(str)).toString();
            }
        }

        private C1658a() {
        }
    }
}
