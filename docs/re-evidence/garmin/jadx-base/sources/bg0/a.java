package bg0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import gg0.i;
import gg1.o0;
import java.text.DecimalFormat;
import java.util.Arrays;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lbg0/a;", "", "<init>", "()V", "b", "c", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0255a f17827a = new C0255a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbg0/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        METER,
        KILOMETER,
        MILE,
        YARD;

        /* JADX INFO: renamed from: bg0.a$b$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0256a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17833a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.KILOMETER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.MILE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.YARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.METER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f17833a = iArr;
            }
        }

        public static String c(Context context, Number number, int i14) {
            if (number == null) {
                String string = context.getString(R.string.no_value);
                string.getClass();
                return string;
            }
            if (i14 < 1) {
                x0 x0Var = x0.f105818a;
                return String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(number.doubleValue())}, 1));
            }
            String str = new DecimalFormat("0.00").format(number);
            str.getClass();
            return str;
        }

        public final String a(Context context) {
            context.getClass();
            int i14 = C0256a.f17833a[ordinal()];
            if (i14 == 1) {
                String string = context.getString(R.string.lbl_km);
                string.getClass();
                return string;
            }
            if (i14 == 2) {
                String string2 = context.getString(R.string.lbl_mile);
                string2.getClass();
                return string2;
            }
            if (i14 == 3) {
                String string3 = context.getString(R.string.lbl_yard);
                string3.getClass();
                return string3;
            }
            if (i14 == 4) {
                return k.g(context.getString(R.string.lbl_meter), StringUtils.SPACE);
            }
            u0.r();
            return null;
        }

        public final String b(Context context) {
            int i14 = C0256a.f17833a[ordinal()];
            if (i14 == 1) {
                String string = context.getString(R.string.unit_enum_kilo_meter);
                string.getClass();
                return string;
            }
            if (i14 == 2) {
                String string2 = context.getString(R.string.unit_enum_mile);
                string2.getClass();
                return string2;
            }
            if (i14 == 3) {
                String string3 = context.getString(R.string.unit_enum_yard);
                string3.getClass();
                return string3;
            }
            if (i14 != 4) {
                u0.r();
                return null;
            }
            String string4 = context.getString(R.string.unit_enum_meter);
            string4.getClass();
            return string4;
        }

        public final String d(Context context, Number number, Integer num) {
            int i14 = C0256a.f17833a[ordinal()];
            if (i14 == 1) {
                String string = context.getString(R.string.placeholder_text_with_unit, c(context, number, num != null ? num.intValue() : 2), context.getString(R.string.lbl_km));
                string.getClass();
                return string;
            }
            if (i14 == 2) {
                String string2 = context.getString(R.string.placeholder_text_with_unit, c(context, number, num != null ? num.intValue() : 2), context.getString(R.string.lbl_mile));
                string2.getClass();
                return string2;
            }
            if (i14 == 3) {
                String string3 = context.getString(R.string.placeholder_text_with_unit, c(context, number, num != null ? num.intValue() : 2), context.getString(R.string.lbl_yard));
                string3.getClass();
                return string3;
            }
            if (i14 != 4) {
                u0.r();
                return null;
            }
            String string4 = context.getString(R.string.common_abbrev_n_meters_label, c(context, number, num != null ? num.intValue() : 2));
            string4.getClass();
            return string4;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbg0/a$c;", "", "", "number", "Lbg0/a$b;", "unit", "<init>", "(Ljava/lang/Number;Lbg0/a$b;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Number f17834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f17835b;

        public c(Number number, b bVar) {
            bVar.getClass();
            this.f17834a = number;
            this.f17835b = bVar;
        }

        public static String a(c cVar, Context context) {
            return cVar.f17835b.d(context, cVar.f17834a, null);
        }
    }

    /* JADX INFO: renamed from: bg0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbg0/a$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0255a {
        public /* synthetic */ C0255a(j jVar) {
            this();
        }

        public static b a() {
            return e() ? b.KILOMETER : b.MILE;
        }

        public static String b(Context context) {
            context.getClass();
            String string = context.getString(e() ? R.string.lbl_minute_per_km : R.string.lbl_minute_per_mile);
            string.getClass();
            return string;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static b c(String str) {
            str.getClass();
            switch (str.hashCode()) {
                case 2366485:
                    if (str.equals("MILE")) {
                        return b.MILE;
                    }
                    break;
                case 2716474:
                    if (str.equals("YARD")) {
                        return b.YARD;
                    }
                    break;
                case 73249641:
                    if (str.equals("METER")) {
                        return b.METER;
                    }
                    break;
                case 1321759912:
                    if (str.equals("KILOMETER")) {
                        return b.KILOMETER;
                    }
                    break;
            }
            return a();
        }

        public static i d() {
            return e() ? i.KILOMETER : i.MILE;
        }

        public static boolean e() {
            return ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g() == o0.METRIC;
        }

        private C0255a() {
        }
    }
}
