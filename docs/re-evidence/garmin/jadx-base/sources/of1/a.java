package of1;

import a7.b;
import android.content.Context;
import android.content.res.Resources;
import c22.j0;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.u;
import f12.l;
import gl.c;
import gl1.y;
import java.math.RoundingMode;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lof1/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f131711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f131712b;

    static {
        new C2501a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f131711a = context;
        Resources resources = context.getResources();
        resources.getClass();
        this.f131712b = resources;
    }

    public static String a(Float f14, m mVar) {
        String strValueOf;
        mVar.C(1220089106);
        x1 x1Var = n.f135158a;
        if (f14 == null || (strValueOf = String.valueOf(f14.floatValue())) == null) {
            mVar.f();
            return "--";
        }
        String strV = u.v(strValueOf, ".0", "", false);
        mVar.f();
        return strV;
    }

    public static Double b(Double d14) {
        m3 m3Var = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar.getClass();
        return Double.valueOf(l3.a.j(dDoubleValue, m3Var));
    }

    public static String d(m mVar, int i14) {
        x1 x1Var = n.f135158a;
        int iH = h();
        Double dB = b(Double.valueOf(i14));
        mVar.C(193893324);
        double dDoubleValue = dB.doubleValue();
        l3.f23124b.getClass();
        String str = l3.a.B(dDoubleValue) + StringUtils.SPACE + y.Q(mVar, iH);
        mVar.f();
        return str;
    }

    public static String e(int i14, Boolean bool, Boolean bool2, m mVar) {
        String strD;
        Boolean bool3 = Boolean.TRUE;
        x1 x1Var = n.f135158a;
        Boolean bool4 = Boolean.FALSE;
        double dDoubleValue = (!bool3.equals(bool4) ? b(Double.valueOf(i14)) : Double.valueOf(i14)).doubleValue();
        if (bool2.equals(bool3)) {
            l3.a aVar = l3.f23124b;
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            aVar.getClass();
            strD = l3.a.C(dDoubleValue);
        } else {
            l3.f23124b.getClass();
            strD = l3.a.D(dDoubleValue);
        }
        if (bool.equals(bool4)) {
            mVar.C(-1895446110);
            mVar.f();
        } else {
            mVar.C(-1895566235);
            int iH = h();
            mVar.C(-1169523702);
            y.Q(mVar, iH);
            mVar.f();
            mVar.f();
        }
        return u.v(strD, ".0", "", false);
    }

    public static String f(int i14) {
        double dDoubleValue = b(Double.valueOf(i14)).doubleValue();
        l3.f23124b.getClass();
        return u.v(l3.a.D(dDoubleValue), ".0", "", false);
    }

    public static long g(float f14, m mVar) {
        long jB;
        x1 x1Var = n.f135158a;
        if (f14 >= 1.0f) {
            mVar.C(-315832303);
            c.f77766a.getClass();
            jB = c.a(mVar).h();
        } else {
            mVar.C(-315831121);
            c.f77766a.getClass();
            jB = c.a(mVar).b();
        }
        mVar.f();
        return jB;
    }

    public static int h() {
        return ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? R.string.f28709km : R.string.f28711mi;
    }

    public final String c(String str, String str2) {
        if (str == null || str2 == null) {
            return "--";
        }
        try {
            LocalDate localDate = LocalDate.parse(str, DateTimeFormat.forPattern("yyyy-MM-dd"));
            String strB = j0.b(localDate.toDateTimeAtStartOfDay(), "MMM d", null);
            if (strB == null) {
                strB = "--";
            }
            String strB2 = j0.b(localDate.toDateTimeAtStartOfDay(), "MMM d, yyyy", null);
            if (strB2 == null) {
                strB2 = "--";
            }
            String strB3 = j0.b(localDate.toDateTimeAtStartOfDay(), "MMMM d, yyyy", null);
            if (strB3 == null) {
                strB3 = "";
            }
            LocalDate localDate2 = LocalDate.parse(str2, DateTimeFormat.forPattern("yyyy-MM-dd"));
            String strB4 = j0.b(localDate2.toDateTimeAtStartOfDay(), "MMM d", null);
            if (strB4 == null) {
                strB4 = "--";
            }
            String strB5 = j0.b(localDate2.toDateTimeAtStartOfDay(), "MMM d, yyyy", null);
            if (strB5 == null) {
                strB5 = "--";
            }
            String strB6 = j0.b(localDate2.toDateTimeAtStartOfDay(), "d", null);
            if (strB6 == null) {
                strB6 = "--";
            }
            j0.f23099a.getClass();
            DateTime dateTime = new DateTime(j0.x());
            boolean z14 = true;
            boolean z15 = localDate.getYear() < localDate2.getYear();
            boolean z16 = localDate.getYear() < dateTime.getYear();
            boolean z17 = localDate2.getYear() < dateTime.getYear();
            if (localDate2.getYear() != dateTime.getYear() || localDate.getYear() >= dateTime.getYear()) {
                z14 = z15;
            }
            if (localDate.equals(localDate2)) {
                return z16 ? strB3 : strB;
            }
            boolean zG = s.g(localDate.monthOfYear(), localDate2.monthOfYear());
            Context context = this.f131711a;
            try {
                if (zG) {
                    if (z17) {
                        x0 x0Var = x0.f105818a;
                        String string = b.getString(context, R.string.string_dash_string_nospace_comma_string);
                        string.getClass();
                        return String.format(string, Arrays.copyOf(new Object[]{strB, strB6, String.valueOf(localDate2.getYear())}, 3));
                    }
                    x0 x0Var2 = x0.f105818a;
                    String string2 = b.getString(context, R.string.range_of_days);
                    string2.getClass();
                    return String.format(string2, Arrays.copyOf(new Object[]{strB, strB6}, 2));
                }
                if (z14) {
                    x0 x0Var3 = x0.f105818a;
                    String string3 = b.getString(context, R.string.string_short_dash_line_string_pattern);
                    string3.getClass();
                    return String.format(string3, Arrays.copyOf(new Object[]{strB2, strB5}, 2));
                }
                if (z17) {
                    x0 x0Var4 = x0.f105818a;
                    String string4 = b.getString(context, R.string.string_short_dash_line_string_pattern);
                    string4.getClass();
                    return String.format(string4, Arrays.copyOf(new Object[]{strB, strB5}, 2));
                }
                x0 x0Var5 = x0.f105818a;
                String string5 = b.getString(context, R.string.string_short_dash_line_string_pattern);
                string5.getClass();
                return String.format(string5, Arrays.copyOf(new Object[]{strB, strB4}, 2));
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e14) {
            e = e14;
        }
        String strN = fb1.c.n("Date parsing failed: ", e.getLocalizedMessage());
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "RunningToleranceFormatter", strN);
        return "--";
    }

    /* JADX INFO: renamed from: of1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lof1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "SINGLE_DECIMAL_ENDING_WITH_ZERO", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2501a {
        public /* synthetic */ C2501a(j jVar) {
            this();
        }

        private C2501a() {
        }
    }
}
