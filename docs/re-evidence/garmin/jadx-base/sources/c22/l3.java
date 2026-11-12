package c22;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.LocationTextPickerActivity;
import com.google.android.material.timepicker.TimeModel;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import org.joda.time.Duration;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lc22/l3;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f23124b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static DecimalFormat f23125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static DecimalFormat f23126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static DecimalFormat f23127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DecimalFormat f23128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static DecimalFormat f23129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static DecimalFormat f23130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static DecimalFormat f23131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final DecimalFormat f23132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final DecimalFormat f23133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final DecimalFormat f23134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final DecimalFormat f23135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DecimalFormat f23136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final DecimalFormat f23137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final DecimalFormat f23138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double f23139q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f23140a;

    static {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        f23125c = new DecimalFormat("#,###,##0.##");
        f23126d = new DecimalFormat("#,###,##0.#");
        f23127e = new DecimalFormat("#,###,##0.000");
        f23128f = new DecimalFormat("#,###,##0.###");
        f23129g = new DecimalFormat("#,###,##0.00");
        new DecimalFormat("#,###,##0.00", decimalFormatSymbols);
        f23130h = new DecimalFormat("#,###,##0.0");
        f23131i = new DecimalFormat("#,###,###");
        f23132j = new DecimalFormat("+##0;-##0");
        f23133k = new DecimalFormat("+##0.0;-##0.0");
        f23134l = new DecimalFormat("+##0.#;-##0.#");
        f23135m = new DecimalFormat("#######");
        f23136n = new DecimalFormat("#.#####");
        f23137o = new DecimalFormat("#.##");
        f23138p = new DecimalFormat("#.#");
        f23139q = 26.822400000000002d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l3(Context context) {
        this(new l22.a(context));
        context.getClass();
    }

    public static final String a(Context context, double d14, double d15, boolean z14) {
        f23124b.getClass();
        context.getClass();
        if (!Double.isNaN(d14) && !Double.isNaN(d15)) {
            l22.a aVar = new l22.a(context);
            return z14 ? a.G(aVar, Math.round(d15 - d14), false) : a.f0(aVar, Math.round(d15 - d14), true);
        }
        String string = context.getString(R.string.no_value);
        string.getClass();
        return string;
    }

    public static final double b(double d14) {
        f23124b.getClass();
        return d14 / ((double) 1000);
    }

    public static final String c(l22.b bVar, double d14, boolean z14) {
        f23124b.getClass();
        return a.G(bVar, d14, z14);
    }

    @o13.e
    public static final String d(boolean z14, String str, double d14) {
        f23124b.getClass();
        if (Double.isNaN(d14)) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder();
        if (z14) {
            sb3.append(f23131i.format(d14));
        } else {
            sb3.append(f23129g.format(d14));
        }
        return am.j.o(StringUtils.SPACE, str, sb3);
    }

    public static final String e(Context context, double d14) {
        f23124b.getClass();
        if (Double.isNaN(d14)) {
            return "";
        }
        if (context == null) {
            String str = f23131i.format(d14);
            str.getClass();
            return str;
        }
        String string = context.getString(R.string.string_space_string_pattern, f23131i.format(d14), context.getString(R.string.lbl_climbed));
        string.getClass();
        return string;
    }

    public static final String f(float f14, Context context, boolean z14) {
        f23124b.getClass();
        return a.m0(context, f14, z14, false);
    }

    public static final String g(double d14, Context context, boolean z14) {
        f23124b.getClass();
        context.getClass();
        if (!Double.isNaN(d14)) {
            l22.a aVar = new l22.a(context);
            return z14 ? a.G(aVar, Math.round(d14), false) : a.f0(aVar, Math.round(d14), true);
        }
        String string = context.getString(R.string.no_value);
        string.getClass();
        return string;
    }

    public static final String h(Context context, double d14, String str) {
        f23124b.getClass();
        if (d14 != 0.0d && !Double.isNaN(d14)) {
            return am.j.m(a.K(d14, 1), StringUtils.SPACE, str);
        }
        String string = context.getString(R.string.no_value);
        string.getClass();
        return string;
    }

    public static final String i(Context context, double d14) {
        f23124b.getClass();
        return a.D0(context, d14, true, "");
    }

    public static final String j(double d14, Context context, boolean z14) {
        f23124b.getClass();
        if (Double.isNaN(d14)) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((int) (d14 + 0.5d));
        if (z14) {
            sb3.append(StringUtils.SPACE);
            String string = context.getString(R.string.strength_training_reps);
            string.getClass();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase = string.toLowerCase(locale);
            lowerCase.getClass();
            sb3.append(lowerCase);
        }
        return sb3.toString();
    }

    public static final String l(double d14, Context context, boolean z14) {
        a aVar = f23124b;
        aVar.getClass();
        return a.C1(aVar, context, d14, z14, false, null, 56);
    }

    public static final DecimalFormat m() {
        f23124b.getClass();
        return f23131i;
    }

    public static final DecimalFormat n() {
        f23124b.getClass();
        return f23130h;
    }

    public static final long o(double d14, boolean z14) {
        f23124b.getClass();
        return a.R1(d14, z14);
    }

    public final String k(double d14, boolean z14) {
        if (Double.isNaN(d14)) {
            return "";
        }
        f23124b.getClass();
        String str = f23131i.format(d14);
        if (!z14) {
            str.getClass();
            return str;
        }
        str.getClass();
        return this.f23140a.a(R.string.common_abbrev_brpm, str);
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0014\u0010\"\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0014\u0010$\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0014\u0010%\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0014\u0010&\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0014\u0010'\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\fR\u0014\u0010(\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\fR\u0014\u0010*\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00100\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010+R\u0014\u00101\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010+R\u0014\u00102\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010+R\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010+R\u0014\u00105\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010+R\u0014\u00106\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010+R\u0014\u00107\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010+R\u0014\u00108\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010+R\u0014\u00109\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010+R\u0014\u0010:\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010+R\u0014\u0010;\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010+R\u0014\u0010<\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010+R\u0014\u0010=\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010+R\u0014\u0010>\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010+R\u0014\u0010?\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010+R\u0014\u0010@\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\fR\u0014\u0010A\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010+R\u0014\u0010B\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010+R\u0014\u0010D\u001a\u00020C8\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020C8\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010G\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010+R\u0014\u0010H\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010+R\u0014\u0010I\u001a\u00020)8\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010+R\u0014\u0010J\u001a\u00020C8\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010ER\u0014\u0010K\u001a\u00020C8\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010ER\u0014\u0010L\u001a\u00020C8\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010ER\u0014\u0010M\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010+R\u0014\u0010N\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010+R\u0014\u0010O\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010+R\u0014\u0010P\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010\u001cR\u0014\u0010Q\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010\f¨\u0006R"}, d2 = {"Lc22/l3$a;", "", "<init>", "()V", "", "CALORIE_TO_KILOJOULE", "F", "Ljava/text/DecimalFormatSymbols;", "US_SYMBOL", "Ljava/text/DecimalFormatSymbols;", "", "ONE_DECIMAL", "I", "TWO_DECIMALS", "Ljava/text/NumberFormat;", "OPTIONAL_TWO_DECIMAL_FORMAT", "Ljava/text/NumberFormat;", "Ljava/text/DecimalFormat;", "OPTIONAL_SINGLE_DECIMAL_FORMAT", "Ljava/text/DecimalFormat;", "THREE_DECIMAL_FORMAT", "TWO_DECIMAL_FORMAT", "PLAIN_INTEGER_FORMAT", "FIVE_DECIMAL_WITH_NO_TRAILING_ZERO", "TWO_DECIMAL_WITH_NO_TRAILING_ZERO", "ONE_DECIMAL_WITH_NO_TRAILING_ZERO", "", "HR_MIN_OR_MIN_SEC_FORMAT", "Ljava/lang/String;", "HR_MIN_SEC_FORMAT", "MIN_SEC_MILLIS_FORMAT", "HR_MIN_SEC_MILLIS_FORMAT", "MIN_ONLY_FORMAT", "HR_MIN_SEC_COLON_FORMAT", "HR_MIN_COLON_FORMAT", "MIN_SEC_COLON_FORMAT", "MIN_SEC_FRACTION_FORMAT", "HR_MIN_SEC_FRACTION_FORMAT", "MIN_SEC_MILLIS_FRACTION_FORMAT", "MAX_PACE_IN_SECOND", "KILO_UNIT_LIMIT", "", "M_TO_FT", "D", "FLR_TO_M", "MI_TO_M", "MI_TO_M_FLOAT", "NAUTICAL_TO_KM", "NAUTICAL_TO_M", "NAUTICAL_TO_MI", "KM_TO_M", "KM_TO_M_FLOAT", "YARD_TO_M", "YARD_TO_KM", "YARD_TO_MI", "MI_TO_FEET", "YARD_TO_FT", "MI_TO_KM", "HMPH_TO_MPS", "HUNDRED_YARDS_TO_METERS", "SPEED_TO_PACE_MIN_KM", "POUND_TO_KG", "STONE_TO_POUND", "STONE_TO_GRAM", "GRAM_TO_KILOGRAM", "GRAM_TO_POUND", "INCH_TO_CM", "", "SEC_TO_MS", "J", "DAY_TO_MIN", "MIN_TO_SEC", "HR_TO_MIN", "HR_TO_SEC", "MIN_TO_MS", "HR_TO_MS", "DAY_TO_MS", "RADIAN_TO_DEGREE", "MM_TO_IN", "KNOTS_TO_MPH", "UNICODE_DEGREE_SIGN", "MILLIMETER_TO_METER", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static double A(double d14) {
            return (d14 * 60.0d) / 3.048d;
        }

        public static String A0(Context context, double d14, int i14) {
            if (context != null) {
                return B0(new l22.a(context), d14, i14, null);
            }
            return null;
        }

        public static String A1(l22.b bVar, double d14, boolean z14) {
            if (Double.isNaN(d14)) {
                return "";
            }
            String str = l3.f23130h.format(d14);
            if (!z14 || bVar == null) {
                str.getClass();
                return str;
            }
            str.getClass();
            return bVar.a(R.string.lbl_value_percent, str);
        }

        public static String B(double d14) {
            if (Double.isNaN(d14)) {
                return "";
            }
            String str = l3.f23131i.format(d14);
            str.getClass();
            return str;
        }

        public static String B0(l22.b bVar, double d14, int i14, String str) {
            bVar.getClass();
            if (Double.isNaN(d14)) {
                return str;
            }
            BigDecimal scale = BigDecimal.valueOf(d14).setScale(i14, RoundingMode.HALF_UP);
            String strValueOf = i14 == 0 ? String.valueOf(scale.intValue()) : String.valueOf(scale.doubleValue());
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format(bVar.getString(R.string.lbl_value_percent), Arrays.copyOf(new Object[]{strValueOf}, 1));
        }

        public static String B1(l22.b bVar, double d14, boolean z14, boolean z15, NumberFormat numberFormat, boolean z16) {
            String str;
            String string;
            numberFormat.getClass();
            if (bVar == null || Double.isNaN(d14) || d14 < 0.0d) {
                return "";
            }
            if (!z16 && d14 == 0.0d) {
                return "";
            }
            if (z14) {
                str = numberFormat.format(d14);
                if (!z15) {
                    str.getClass();
                    return str;
                }
                string = bVar.getString(R.string.lbl_kg);
            } else {
                str = numberFormat.format(d14 * 2.20462d);
                if (!z15) {
                    str.getClass();
                    return str;
                }
                string = bVar.getString(R.string.lbl_lbs);
            }
            return e5.g(str, StringUtils.SPACE, string);
        }

        public static String C(double d14) {
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            roundingMode.getClass();
            if (Double.isNaN(d14)) {
                return "";
            }
            l3.f23131i.setRoundingMode(roundingMode);
            String str = l3.f23131i.format(d14);
            str.getClass();
            return str;
        }

        public static String C0(l22.b bVar, double d14) {
            bVar.getClass();
            if (Double.isNaN(d14)) {
                return "";
            }
            return l3.f23131i.format(d14) + StringUtils.SPACE + bVar.getString(R.string.lbl_mm);
        }

        public static String C1(a aVar, Context context, double d14, boolean z14, boolean z15, DecimalFormat decimalFormat, int i14) {
            if ((i14 & 8) != 0) {
                z15 = true;
            }
            if ((i14 & 16) != 0) {
                decimalFormat = l3.f23126d;
            }
            boolean z16 = (i14 & 32) == 0;
            aVar.getClass();
            decimalFormat.getClass();
            return B1(context != null ? new l22.a(context) : null, d14, z14, z15, decimalFormat, z16);
        }

        public static String D(double d14) {
            if (Double.isNaN(d14)) {
                return "";
            }
            String str = l3.f23130h.format(d14);
            str.getClass();
            return str;
        }

        public static String D0(Context context, double d14, boolean z14, String str) {
            str.getClass();
            return E0(context != null ? new l22.a(context) : null, d14, z14, str);
        }

        public static String D1(double d14, boolean z14) {
            if (Double.isNaN(d14)) {
                return "";
            }
            if (!z14) {
                return B(d14);
            }
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format("%s%s", Arrays.copyOf(new Object[]{l3.f23131i.format(Math.round(d14)), "%"}, 2));
        }

        public static String E(Context context, double d14, boolean z14, boolean z15) {
            return F(context != null ? new l22.a(context) : null, d14, z14, z15);
        }

        public static String E0(l22.b bVar, double d14, boolean z14, String str) {
            str.getClass();
            if (Double.isNaN(d14)) {
                return str;
            }
            StringBuilder sb3 = new StringBuilder(l3.f23131i.format(d14));
            if (z14 && bVar != null) {
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(R.string.lbl_watts));
            }
            return sb3.toString();
        }

        public static String E1(Context context, boolean z14, boolean z15) {
            context.getClass();
            return F1(new l22.a(context), z14, z15);
        }

        public static String F(l22.b bVar, double d14, boolean z14, boolean z15) {
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append((int) (d14 + 0.5d));
            if (z14 && bVar != null) {
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(z15 ? R.string.lbl_rpm : R.string.lbl_spm));
            }
            return sb3.toString();
        }

        public static /* synthetic */ String F0(a aVar, Context context, double d14, boolean z14) {
            aVar.getClass();
            return D0(context, d14, z14, "");
        }

        public static String F1(l22.b bVar, boolean z14, boolean z15) {
            int i14;
            bVar.getClass();
            if (z15) {
                i14 = z14 ? R.string.lbl_km : R.string.lbl_mile;
            } else {
                i14 = z14 ? R.string.lbl_meter : R.string.lbl_foot;
            }
            return bVar.getString(i14);
        }

        public static String G(l22.b bVar, double d14, boolean z14) {
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder(l3.f23131i.format(Math.round(d14)));
            if (z14 && bVar != null) {
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(R.string.calories_abbreviation));
            }
            return sb3.toString();
        }

        public static String G0(Context context, double d14, boolean z14, String str) {
            return H0(context != null ? new l22.a(context) : null, d14, z14, str);
        }

        public static String G1(Context context, gg1.o0 o0Var) {
            context.getClass();
            return H1(context, o0Var == gg1.o0.METRIC || o0Var == gg1.o0.STATUTE_UK);
        }

        public static /* synthetic */ String H(a aVar, l22.b bVar, double d14, boolean z14) {
            aVar.getClass();
            return G(bVar, d14, z14);
        }

        public static String H0(l22.b bVar, double d14, boolean z14, String str) {
            if (Double.isNaN(d14)) {
                return str;
            }
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            StringBuilder sb3 = new StringBuilder(String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d14)}, 1)));
            if (z14 && bVar != null) {
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(R.string.lbl_watt_kg));
            }
            return sb3.toString();
        }

        public static String H1(Context context, boolean z14) {
            context.getClass();
            return F1(new l22.a(context), z14, false);
        }

        public static String I(LocationTextPickerActivity locationTextPickerActivity, double d14) {
            if (!Double.isNaN(d14)) {
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                return String.format(Locale.getDefault(), "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(d14)}, 1));
            }
            String string = locationTextPickerActivity.getString(R.string.no_value);
            string.getClass();
            return string;
        }

        public static String I0(l22.b bVar, double d14, boolean z14, boolean z15) {
            if (Double.isNaN(d14) || bVar == null) {
                return "";
            }
            if (z15) {
                d14 = c(d14);
            }
            return com.nimbusds.jose.shaded.gson.internal.a.h(bVar.getString(z14 ? R.string.device_wrist_left : R.string.device_wrist_right), StringUtils.SPACE, l3.f23131i.format(d14), "°");
        }

        public static String J(l22.b bVar, double d14) {
            if (Double.isNaN(d14) || bVar == null) {
                return "";
            }
            double dAbs = Math.abs(((double) 100) - d14);
            DecimalFormat decimalFormat = l3.f23130h;
            return bVar.a(R.string.lbl_lr_cycling_metric, tn.k.g(decimalFormat.format(d14), "%"), tn.k.g(decimalFormat.format(dAbs), "%"));
        }

        /* JADX WARN: Code duplicated, block: B:18:0x003b  */
        /* JADX WARN: Code duplicated, block: B:21:0x005b  */
        public static String J0(l22.b bVar, int i14, o3 o3Var, boolean z14, boolean z15) {
            double d14;
            double dA;
            float fFloatValue;
            StringBuilder sb3;
            bVar.getClass();
            o3Var.getClass();
            o3 o3Var2 = z14 ? o3.BAR : o3.PSI;
            o3 o3Var3 = o3.BAR;
            if (o3Var != o3Var3 || z14) {
                o3 o3Var4 = o3.PSI;
                if (o3Var == o3Var4 && z14) {
                    d14 = i14;
                    o3.f23180d.getClass();
                    dA = o3.a.a(o3Var3, o3Var4);
                }
                fFloatValue = i14;
                if (!Float.isNaN(fFloatValue)) {
                    fFloatValue = new BigDecimal(String.valueOf(fFloatValue)).setScale(0, RoundingMode.HALF_UP).floatValue();
                }
                sb3 = new StringBuilder(String.valueOf((int) fFloatValue));
                if (z15) {
                    sb3.append(StringUtils.SPACE);
                    sb3.append(bVar.getString(o3Var2.f23186c));
                }
                return sb3.toString();
            }
            d14 = i14;
            o3.a aVar = o3.f23180d;
            o3 o3Var5 = o3.PSI;
            aVar.getClass();
            dA = o3.a.a(o3Var3, o3Var5);
            i14 = (int) (dA * d14);
            fFloatValue = i14;
            if (!Float.isNaN(fFloatValue)) {
                fFloatValue = new BigDecimal(String.valueOf(fFloatValue)).setScale(0, RoundingMode.HALF_UP).floatValue();
            }
            sb3 = new StringBuilder(String.valueOf((int) fFloatValue));
            if (z15) {
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(o3Var2.f23186c));
            }
            return sb3.toString();
        }

        public static String K(double d14, int i14) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setMaximumFractionDigits(i14);
            String str = decimalFormat.format(d14);
            str.getClass();
            return str;
        }

        public static int[] K1(float f14) {
            if (f14 <= 0.0f) {
                return null;
            }
            double dG = g(f14, m3.CENTIMETER, m3.INCH);
            double d14 = dG / 12.0d;
            double dRound = Math.round(dG % 12.0d);
            if (dRound == 12.0d) {
                d14 += (double) 1;
                dRound = 0.0d;
            }
            return new int[]{(int) d14, (int) dRound};
        }

        public static String L(double d14, int i14) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setMaximumFractionDigits(i14);
            decimalFormat.setMinimumFractionDigits(i14);
            String str = decimalFormat.format(d14);
            str.getClass();
            return str;
        }

        public static String L0(double d14, q3 q3Var, DecimalFormat decimalFormat) {
            q3Var.getClass();
            return O0(null, d14, q3Var, decimalFormat, false, null);
        }

        public static int L1(long j8) {
            return ((int) (j8 % 3600.0f)) / 60;
        }

        public static String M(Context context, double d14, boolean z14, boolean z15) {
            return O(context, d14, z14 ? m3.METER : m3.FOOT, l3.f23131i, z15);
        }

        public static String M0(Context context, double d14, q3 q3Var, DecimalFormat decimalFormat, boolean z14) {
            q3Var.getClass();
            return N0(context, d14, q3Var, decimalFormat, z14, null);
        }

        public static String N(double d14, m3 m3Var, NumberFormat numberFormat) {
            m3Var.getClass();
            return R(null, d14, m3Var, numberFormat, false, null);
        }

        public static String N0(Context context, double d14, q3 q3Var, NumberFormat numberFormat, boolean z14, String str) {
            q3Var.getClass();
            return O0(context != null ? new l22.a(context) : null, d14, q3Var, numberFormat, z14, str);
        }

        public static int N1(boolean z14) {
            return z14 ? R.string.lbl_pace_unit_km : R.string.lbl_pace_unit_mi;
        }

        public static String O(Context context, double d14, m3 m3Var, NumberFormat numberFormat, boolean z14) {
            m3Var.getClass();
            return P(context, d14, m3Var, numberFormat, z14, null);
        }

        public static String O0(l22.b bVar, double d14, q3 q3Var, NumberFormat numberFormat, boolean z14, String str) {
            q3Var.getClass();
            double dW = w(d14, q3.METERS_PER_SECOND, q3Var);
            if (Double.isNaN(dW) || dW == 0.0d) {
                return str == null ? "" : str;
            }
            StringBuilder sb3 = new StringBuilder(numberFormat != null ? numberFormat.format(dW) : String.valueOf(dW));
            if (z14 && bVar != null) {
                String string = bVar.getString(q3Var.f23223e);
                sb3.append(StringUtils.SPACE);
                sb3.append(string);
            }
            return sb3.toString();
        }

        public static int O1(boolean z14) {
            return z14 ? R.string.lbl_minute_100_meters : R.string.lbl_minute_100_yards;
        }

        public static String P(Context context, double d14, m3 m3Var, NumberFormat numberFormat, boolean z14, String str) {
            m3Var.getClass();
            return R(context != null ? new l22.a(context) : null, d14, m3Var, numberFormat, z14, str);
        }

        public static String P0(Context context, long j8, boolean z14) {
            context.getClass();
            Duration duration = new Duration(j8);
            if (duration.isShorterThan(new Duration(3600000L))) {
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                Locale locale = Locale.getDefault();
                String string = context.getString(R.string.social_relative_date_time_minutes);
                string.getClass();
                return String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(duration.toStandardMinutes().getMinutes())}, 1));
            }
            if (duration.toStandardSeconds().getSeconds() % DateTimeConstants.SECONDS_PER_HOUR == 0) {
                p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                Locale locale2 = Locale.getDefault();
                String string2 = context.getString(R.string.social_relative_date_time_hours);
                string2.getClass();
                return String.format(locale2, string2, Arrays.copyOf(new Object[]{Integer.valueOf(duration.toStandardHours().getHours())}, 1));
            }
            int minutes = duration.toStandardMinutes().getMinutes() % 60;
            if (!z14) {
                p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
                Locale locale3 = Locale.getDefault();
                String string3 = context.getString(R.string.power_guide_time_format_short);
                string3.getClass();
                return String.format(locale3, string3, Arrays.copyOf(new Object[]{Integer.valueOf(duration.toStandardHours().getHours()), Integer.valueOf(minutes)}, 2));
            }
            String string4 = context.getString(R.string.lbl_minutes_abbreviation);
            String strD = p6.b.d(context, R.string.lbl_hours_abbreviation, string4);
            return duration.toStandardHours().getHours() + strD + StringUtils.SPACE + minutes + string4;
        }

        public static double P1(double d14) {
            if (Double.isNaN(d14)) {
                return Double.NaN;
            }
            return d14 / ((double) 1000);
        }

        public static String Q(Context context, double d14, NumberFormat numberFormat, boolean z14, boolean z15) {
            return S(context != null ? new l22.a(context) : null, d14, numberFormat, z14, z15);
        }

        public static String Q0(double d14, Context context, boolean z14) {
            if (context == null || Double.isNaN(d14) || d14 < 1.0d) {
                return "";
            }
            String strB = B(d14);
            if (z14) {
                String string = context.getResources().getString(R.string.workout_reps_multiple_plus, strB);
                string.getClass();
                return string;
            }
            String string2 = d14 > 1.0d ? context.getResources().getString(R.string.strength_training_reps) : context.getResources().getString(R.string.strength_training_rep);
            string2.getClass();
            String string3 = context.getString(R.string.string_space_string_pattern, strB, string2);
            string3.getClass();
            return string3;
        }

        public static double Q1(long j8, boolean z14) {
            double d14 = j8;
            if (d14 <= 0.0d) {
                return 0.0d;
            }
            return z14 ? P1(d14) : d14 / 453.592d;
        }

        public static String R(l22.b bVar, double d14, m3 m3Var, NumberFormat numberFormat, boolean z14, String str) {
            String strValueOf;
            m3Var.getClass();
            StringBuilder sb3 = new StringBuilder();
            if (m3Var != m3.UNSPECIFIED) {
                d14 = g(d14, m3.METER, m3Var);
            }
            if (Double.isNaN(d14)) {
                if (str == null) {
                    str = "";
                }
                sb3.append(str);
            } else {
                if (numberFormat == null || (strValueOf = numberFormat.format(d14)) == null) {
                    strValueOf = String.valueOf(d14);
                }
                sb3.append(strValueOf);
            }
            if (z14 && bVar != null) {
                String string = bVar.getString(m3Var.f23164e);
                sb3.append(StringUtils.SPACE);
                sb3.append(string);
            }
            return sb3.toString();
        }

        public static String R0(l22.b bVar, double d14, boolean z14) {
            DecimalFormat decimalFormat = l3.f23129g;
            decimalFormat.getClass();
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(decimalFormat.format(d14));
            if (z14 && bVar != null) {
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(R.string.lbl_meter));
            }
            return sb3.toString();
        }

        public static long R1(double d14, boolean z14) {
            if (d14 <= 0.0d) {
                return 0L;
            }
            return Math.round(d14 * (z14 ? 1000 : 453.592d));
        }

        public static String S(l22.b bVar, double d14, NumberFormat numberFormat, boolean z14, boolean z15) {
            return z15 ? R(bVar, d14, m3.KILOMETER, numberFormat, z14, null) : R(bVar, d14, m3.MILE, numberFormat, z14, null);
        }

        public static String S0(l22.a aVar, double d14, Boolean bool) {
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(w0((int) d14));
            sb3.append(StringUtils.SPACE);
            sb3.append(aVar.getString(bool.booleanValue() ? R.string.lbl_per_100_meters : R.string.lbl_per_100_yards));
            return sb3.toString();
        }

        public static double S1(double d14) {
            return (d14 * 3.2808399d) / 3.0d;
        }

        @o13.e
        public static String T(double d14, Context context, boolean z14) {
            int i14;
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder();
            if (z14) {
                sb3.append(l3.f23129g.format(d14 / 1000.0d));
                i14 = R.string.lbl_km;
            } else {
                sb3.append(l3.f23129g.format((d14 * 3.2808399d) / 5280.0d));
                i14 = R.string.lbl_mile;
            }
            sb3.append(StringUtils.SPACE);
            sb3.append(context.getString(i14));
            return sb3.toString();
        }

        public static String T0(double d14, Context context, boolean z14) {
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder(l3.f23131i.format(d14));
            if (z14 && context != null) {
                sb3.append(StringUtils.SPACE);
                sb3.append(context.getString(R.string.common_abbrev_strokes_per_minute_string));
            }
            return sb3.toString();
        }

        public static double T1(double d14, int i14) {
            if (i14 >= 0) {
                double dPow = Math.pow(10.0d, i14);
                return Math.round(d14 * dPow) / dPow;
            }
            vb.h.s("Failed requirement.");
            return 0.0d;
        }

        public static String U(Double d14, DecimalFormat decimalFormat) {
            decimalFormat.getClass();
            return (d14 == null || Double.isNaN(d14.doubleValue())) ? "" : tn.k.g(decimalFormat.format(d14.doubleValue()), "°");
        }

        public static String U0(l22.b bVar, double d14, boolean z14, boolean z15, boolean z16) {
            if (Double.isNaN(d14) || bVar == null) {
                return "";
            }
            if (z14) {
                d14 = d(d14);
            }
            StringBuilder sb3 = new StringBuilder(l3.f23131i.format(d14));
            if (z16) {
                if (z15) {
                    sb3.append(StringUtils.SPACE);
                }
                sb3.append(bVar.getString(z14 ? R.string.lbl_fahrenheit : R.string.lbl_celsius));
            }
            return sb3.toString();
        }

        public static double U1(double d14) {
            DecimalFormat decimalFormat = new DecimalFormat("#.#");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            try {
                String str = decimalFormat.format(d14);
                str.getClass();
                return Double.parseDouble(str);
            } catch (NullPointerException | NumberFormatException unused) {
                return Double.NaN;
            }
        }

        public static String V(long j8, boolean z14) {
            long j14 = j8 / 3600;
            long j15 = j8 % 3600;
            long j16 = j15 / 60;
            long j17 = j15 % ((long) 60);
            if (j14 <= 0) {
                j14 = 0;
            }
            if (z14) {
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                return String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j14), Long.valueOf(j16), Long.valueOf(j17)}, 3));
            }
            if (j14 == 0) {
                p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                return String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j16)}, 1));
            }
            p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
            return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j14), Long.valueOf(j16)}, 2));
        }

        public static String V0(l22.b bVar, double d14, boolean z14) {
            if (Double.isNaN(d14)) {
                return "";
            }
            if (!z14) {
                d14 = d(d14);
            }
            return tn.k.g(l3.f23131i.format(d14), bVar.getString(R.string.lbl_degree_sign));
        }

        public static double V1(double d14) {
            int i14 = (int) d14;
            double d15 = i14;
            double d16 = d14 - d15;
            if (d16 < 0.25d) {
                return d15;
            }
            return d16 < 0.75d ? d15 + 0.5d : i14 + 1;
        }

        public static String W(long j8) {
            long j14 = j8 % 3600;
            long j15 = j14 / 60;
            long j16 = j14 % ((long) 60);
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j15), Long.valueOf(j16)}, 2));
        }

        public static String W0(double d14, Context context, boolean z14) {
            context.getClass();
            if (Double.isNaN(d14)) {
                return "";
            }
            return l3.f23131i.format(d14) + StringUtils.SPACE + H1(context, z14);
        }

        public static double W1(double d14, double d15) {
            return (((d15 / 14.0d) + d14) * 6350.0d) / ((double) 1000);
        }

        public static String X(double d14, boolean z14) {
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder();
            Math.round(d14);
            sb3.append(l3.f23126d.format(Math.round(d14 * (z14 ? 1.0d : 3.2808399d))));
            return sb3.toString();
        }

        public static String X0(Context context, double d14, q3 q3Var, DecimalFormat decimalFormat, String str) {
            q3Var.getClass();
            if (Double.isNaN(d14) || d14 == 0.0d) {
                return str == null ? "" : str;
            }
            StringBuilder sb3 = new StringBuilder(decimalFormat != null ? decimalFormat.format(d14) : String.valueOf(d14));
            if (context != null) {
                String string = context.getString(q3Var.f23223e);
                string.getClass();
                sb3.append(StringUtils.SPACE);
                sb3.append(string);
            }
            return sb3.toString();
        }

        public static String Y(Context context, double d14, gg1.o0 o0Var, boolean z14) {
            context.getClass();
            o0Var.getClass();
            if (Double.isNaN(d14)) {
                return "";
            }
            boolean z15 = o0Var == gg1.o0.METRIC || o0Var == gg1.o0.STATUTE_UK;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(l3.f23126d.format(Math.round(d14 * (z15 ? 1.0d : 3.2808399d))));
            if (z14) {
                sb3.append(StringUtils.SPACE);
                sb3.append(H1(context, z15));
            }
            return sb3.toString();
        }

        public static String Y0(double d14, Context context, boolean z14) {
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder(l3.f23131i.format(d14));
            if (context != null) {
                sb3.append(context.getString(z14 ? R.string.lbl_fahrenheit : R.string.lbl_celsius));
            }
            return sb3.toString();
        }

        public static String Z(Context context, double d14, gg1.o0 o0Var, boolean z14, DecimalFormat decimalFormat) {
            o0Var.getClass();
            decimalFormat.getClass();
            return b0(context != null ? new l22.a(context) : null, d14, o0Var, z14, decimalFormat);
        }

        public static String Z0(int i14) {
            String str = l3.f23131i.format(i14);
            str.getClass();
            return str;
        }

        public static int a(long j8, long j14) {
            if (j14 <= 0 || j8 <= 0) {
                return 0;
            }
            return (int) ((j14 * ((long) 100)) / j8);
        }

        public static String a0(Context context, double d14, gg1.o0 o0Var, boolean z14, boolean z15) {
            if (Double.isNaN(d14)) {
                return "";
            }
            boolean z16 = o0Var == gg1.o0.METRIC || o0Var == gg1.o0.STATUTE_UK;
            StringBuilder sb3 = new StringBuilder();
            long jRound = Math.round(d14);
            if (z15) {
                sb3.append(jRound >= 0 ? '+' : "");
            }
            sb3.append(l3.f23126d.format(Math.round(d14 * (z16 ? 1.0d : 3.2808399d))));
            if (z14 && context != null) {
                sb3.append(StringUtils.SPACE);
                sb3.append(G1(context, o0Var));
            }
            return sb3.toString();
        }

        public static String a1(double d14) {
            if (d14 <= 999.0d || d14 > 10000.0d) {
                return d14 > 10000.0d ? tn.k.g(l3.f23131i.format(Math.round(d14 / ((double) 1000.0f))), JWKParameterNames.OCT_KEY_VALUE) : Z0((int) d14);
            }
            return tn.k.g(l3.f23126d.format(d14 / ((double) 1000.0f)), JWKParameterNames.OCT_KEY_VALUE);
        }

        public static float b(float f14) {
            return (float) (((double) f14) / 100.0d);
        }

        public static String b0(l22.b bVar, double d14, gg1.o0 o0Var, boolean z14, NumberFormat numberFormat) {
            o0Var.getClass();
            numberFormat.getClass();
            if (Double.isNaN(d14)) {
                return "";
            }
            boolean z15 = o0Var == gg1.o0.METRIC || o0Var == gg1.o0.STATUTE_UK;
            StringBuilder sb3 = new StringBuilder();
            if (z14) {
                sb3.append(d14 < 0.0d ? '-' : '+');
            }
            sb3.append(numberFormat.format(d14 * (z15 ? 1.0d : 3.2808399d)));
            if (bVar != null) {
                sb3.append(StringUtils.SPACE);
                sb3.append(F1(bVar, z15, false));
            }
            return sb3.toString();
        }

        public static String b1(long j8) {
            long jRound = Math.round(j8 / 1000);
            if (jRound < 60) {
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{0, Integer.valueOf((int) jRound)}, 2));
            }
            if (jRound < 3600) {
                long j14 = 60;
                int i14 = (int) (jRound / j14);
                p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14), Integer.valueOf((int) (jRound % j14))}, 2));
            }
            long j15 = DateTimeConstants.SECONDS_PER_HOUR;
            int i15 = (int) (jRound / j15);
            int i16 = (int) (jRound % j15);
            int i17 = i16 / 60;
            p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
            return String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i15), Integer.valueOf(i17), Integer.valueOf(i16 % 60)}, 3));
        }

        public static float c(double d14) {
            return d14 <= 90.0d ? (int) (((double) 90) - d14) : (int) (((double) 360) - (d14 - ((double) 90)));
        }

        public static String c0(Context context, double d14, boolean z14, boolean z15, boolean z16) {
            context.getClass();
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder();
            if (z16 && d14 > 0.0d) {
                sb3.append('+');
            }
            sb3.append(l3.f23131i.format(d14 * (z14 ? 1.0d : 3.2808399d)));
            if (z15) {
                sb3.append(StringUtils.SPACE);
                sb3.append(H1(context, z14));
            }
            return sb3.toString();
        }

        public static String c1(Context context, long j8) {
            int i14 = (int) (j8 % ((long) DateTimeConstants.SECONDS_PER_DAY));
            int i15 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            int i16 = i14 % DateTimeConstants.SECONDS_PER_HOUR;
            int i17 = i16 / 60;
            int i18 = i16 % 60;
            StringBuilder sb3 = new StringBuilder();
            if (i15 > 0) {
                sb3.append(i15);
                sb3.append(StringUtils.SPACE);
                sb3.append(context.getString(R.string.lbl_hour));
                sb3.append(StringUtils.SPACE);
            }
            if (i17 > 0) {
                sb3.append(i17);
                sb3.append(StringUtils.SPACE);
                sb3.append(context.getString(R.string.common_min_abbreviated_without_period));
                sb3.append(StringUtils.SPACE);
            }
            if (i18 > 0) {
                sb3.append(i18);
                sb3.append(StringUtils.SPACE);
                sb3.append(context.getString(R.string.lbl_second));
            }
            String string = sb3.toString();
            int length = string.length() - 1;
            int i19 = 0;
            boolean z14 = false;
            while (i19 <= length) {
                boolean z15 = p005kotlin.jvm.internal.s.h(string.charAt(!z14 ? i19 : length), 32) <= 0;
                if (z14) {
                    if (!z15) {
                        break;
                    }
                    length--;
                } else if (z15) {
                    i19++;
                } else {
                    z14 = true;
                }
            }
            return string.subSequence(i19, length + 1).toString();
        }

        public static double d(double d14) {
            if (Double.isNaN(d14)) {
                return Double.NaN;
            }
            return ((d14 * ((double) 9)) / ((double) 5)) + ((double) 32);
        }

        public static String d0(double d14, Context context, boolean z14) {
            DecimalFormat decimalFormat = l3.f23126d;
            if (context == null) {
                if (Double.isNaN(d14)) {
                    return "";
                }
                String str = decimalFormat.format(d14);
                str.getClass();
                return str;
            }
            String string = Double.isNaN(d14) ? context.getString(R.string.no_value) : decimalFormat.format(d14);
            if (!z14) {
                string.getClass();
                return string;
            }
            String string2 = context.getString(R.string.string_space_string_pattern, string, context.getString(R.string.activities_floors_per_minute));
            string2.getClass();
            return string2;
        }

        public static String d1(int i14) {
            if (i14 < 0) {
                return null;
            }
            return q1(i14 * 60);
        }

        public static double e(double d14) {
            if (Double.isNaN(d14)) {
                return Double.NaN;
            }
            return ((d14 - ((double) 32)) * ((double) 5)) / ((double) 9);
        }

        public static String e0(Context context, double d14) {
            if (context == null) {
                return "";
            }
            if (Double.isNaN(d14)) {
                String string = context.getString(R.string.no_value);
                string.getClass();
                return string;
            }
            String str = l3.f23130h.format(d14);
            str.getClass();
            return str;
        }

        public static String e1(long j8) {
            if (j8 < 0) {
                return null;
            }
            return b1(j8 * 1000);
        }

        public static int[] f(long j8) {
            if (j8 < 0) {
                return null;
            }
            long j14 = (j8 % ((long) DateTimeConstants.SECONDS_PER_DAY)) / 60;
            return new int[]{(int) (j14 / 60), (int) (j14 % 60)};
        }

        public static String f0(l22.b bVar, double d14, boolean z14) {
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder(l3.f23131i.format(Math.round(d14)));
            if (z14 && bVar != null) {
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(R.string.lbl_unit_milliliter_abr));
            }
            return sb3.toString();
        }

        public static String f1(long j8, String str) {
            str.getClass();
            return j8 <= 0 ? str : b1(j8 * 1000);
        }

        public static double g(double d14, m3 m3Var, m3 m3Var2) {
            m3Var.getClass();
            m3Var2.getClass();
            if (Double.isNaN(d14) || m3Var == m3Var2) {
                return d14;
            }
            m3.f23147f.getClass();
            return m3.a.a(m3Var, m3Var2) * d14;
        }

        public static String g0(l22.b bVar, double d14, boolean z14, String str) {
            str.getClass();
            if (Double.isNaN(d14)) {
                return str;
            }
            StringBuilder sb3 = new StringBuilder(l3.f23131i.format(d14));
            if (z14 && bVar != null) {
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(R.string.lbl_newton_abbreviation));
            }
            return sb3.toString();
        }

        public static String g1(Long l14) {
            if (l14 == null) {
                return null;
            }
            return e1(l14.longValue());
        }

        public static double h(double d14, m3 m3Var) {
            m3Var.getClass();
            return g(d14, m3Var, m3.METER);
        }

        public static String h0(Context context, double d14) {
            if (context == null) {
                return "";
            }
            if (Double.isNaN(d14)) {
                String string = context.getString(R.string.no_value);
                string.getClass();
                return string;
            }
            String str = l3.f23130h.format(d14);
            str.getClass();
            return str;
        }

        public static String h1(int i14, Context context) {
            int i15;
            int i16;
            context.getClass();
            if (i14 < 3600) {
                i15 = i14 / 60;
                i16 = 0;
            } else {
                int i17 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
                i15 = (i14 % DateTimeConstants.SECONDS_PER_HOUR) / 60;
                i16 = i17;
            }
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            Locale locale = Locale.getDefault();
            String string = context.getString(R.string.sleep_time_format_short);
            string.getClass();
            return String.format(locale, string, Arrays.copyOf(new Object[]{NumberFormat.getInstance().format(i16), NumberFormat.getInstance().format(i15)}, 2));
        }

        public static double i(double d14, q3 q3Var) {
            q3Var.getClass();
            return w(d14, q3.METERS_PER_SECOND, q3Var);
        }

        public static String i0(l22.b bVar, double d14, boolean z14) {
            bVar.getClass();
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder(l3.f23131i.format(d14));
            if (z14) {
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(R.string.lbl_ms));
            }
            return sb3.toString();
        }

        public static String i1(int i14, Context context) {
            context.getClass();
            int i15 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            int i16 = i14 % DateTimeConstants.SECONDS_PER_HOUR;
            return j1(context, i15, i16 / 60, i16 % 60);
        }

        public static double j(double d14, m3 m3Var) {
            m3Var.getClass();
            return g(d14, m3.METER, m3Var);
        }

        public static String j0(l22.b bVar, double d14) {
            if (Double.isNaN(d14) || bVar == null) {
                return "";
            }
            double dAbs = Math.abs(((double) 100) - d14);
            DecimalFormat decimalFormat = l3.f23130h;
            return com.nimbusds.jose.shaded.gson.internal.a.h(decimalFormat.format(d14), "% / ", decimalFormat.format(dAbs), "%");
        }

        public static String j1(Context context, int i14, int i15, int i16) {
            context.getClass();
            if (i14 != 0) {
                String string = context.getString(R.string.duration_dlg_title, String.valueOf(i14), String.valueOf(i15), String.valueOf(i16));
                string.getClass();
                return string;
            }
            if (i15 == 0) {
                return org.apache.commons.lang3.e.d(i16, StringUtils.SPACE, context.getString(R.string.common_sec_abbreviated_without_period));
            }
            String string2 = context.getString(R.string.lbl_minute);
            String string3 = context.getString(R.string.common_sec_abbreviated_without_period);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i15);
            sb3.append(StringUtils.SPACE);
            sb3.append(string2);
            sb3.append(StringUtils.SPACE);
            sb3.append(i16);
            return am.j.o(StringUtils.SPACE, string3, sb3);
        }

        public static double k(double d14) {
            return d14 / 1000.0d;
        }

        public static String k0(l22.b bVar, double d14, boolean z14, String str) {
            str.getClass();
            if (Double.isNaN(d14) || d14 == -1.0d) {
                return str;
            }
            String strA = l3.f23131i.format(d14);
            if (!z14) {
                strA.getClass();
                return strA;
            }
            if (bVar != null) {
                strA.getClass();
                strA = bVar.a(R.string.lbl_heart_rate_zone_bpm, strA);
            }
            strA.getClass();
            return strA;
        }

        public static String k1(l22.b bVar, boolean z14, int i14) {
            String strA;
            String strA2;
            bVar.getClass();
            int i15 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            int i16 = i14 % DateTimeConstants.SECONDS_PER_HOUR;
            int i17 = i16 / 60;
            int i18 = i16 % 60;
            String strA3 = "";
            if (z14 && i15 == 0) {
                strA = "";
            } else {
                strA = i15 == 1 ? bVar.a(R.string.lbl_plural_one_hour, Integer.valueOf(i15)) : bVar.a(R.string.lbl_plural_more_than_one_hour, Integer.valueOf(i15));
            }
            if (z14 && i17 == 0) {
                strA2 = "";
            } else {
                strA2 = i17 == 1 ? bVar.a(R.string.lbl_plural_one_minute, Integer.valueOf(i17)) : bVar.a(R.string.lbl_plural_more_than_one_minute, Integer.valueOf(i17));
            }
            if (!z14 || i18 != 0 || (i15 == 0 && i17 == 0)) {
                strA3 = i18 == 1 ? bVar.a(R.string.lbl_plural_one_second, Integer.valueOf(i18)) : bVar.a(R.string.lbl_plural_more_than_one_second, Integer.valueOf(i18));
            }
            if (i15 != 0) {
                return j20.x.d(strA, StringUtils.SPACE, strA2, StringUtils.SPACE, strA3);
            }
            return i17 != 0 ? e5.g(strA2, StringUtils.SPACE, strA3) : strA3;
        }

        public static double l(double d14) {
            return d14 / 1609.344d;
        }

        public static /* synthetic */ String l0(a aVar, l22.b bVar, double d14, boolean z14) {
            aVar.getClass();
            return k0(bVar, d14, z14, "");
        }

        public static String l1(long j8) {
            int iRound = Math.round(j8 / 1000);
            int i14 = iRound / DateTimeConstants.SECONDS_PER_HOUR;
            int i15 = iRound % DateTimeConstants.SECONDS_PER_HOUR;
            int i16 = i15 / 60;
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14), Integer.valueOf(i16), Integer.valueOf(i15 % 60)}, 3));
        }

        public static double m(double d14, boolean z14) {
            if (d14 == 0.0d || Double.isNaN(d14)) {
                return 0.0d;
            }
            return (z14 ? 1000.0d : 1609.344d) / d14;
        }

        public static String m0(Context context, float f14, boolean z14, boolean z15) {
            if (context == null || f14 <= 0.0f) {
                return "";
            }
            if (z14) {
                String string = context.getString(R.string.string_space_string_pattern, NumberFormat.getNumberInstance(Locale.getDefault()).format(Math.round(f14)), context.getResources().getString(R.string.lbl_cm));
                string.getClass();
                return string;
            }
            int[] iArrK1 = K1(f14);
            if (iArrK1 == null) {
                return "";
            }
            if (z15) {
                String string2 = context.getString(R.string.string_space_string_pattern, androidx.core.view.j.f(iArrK1[0], "'"), androidx.core.view.j.f(iArrK1[1], "\""));
                string2.getClass();
                return string2;
            }
            String string3 = context.getString(R.string.string_space_string_pattern, androidx.core.view.j.f(iArrK1[0], context.getResources().getString(R.string.lbl_foot)), androidx.core.view.j.f(iArrK1[1], context.getResources().getString(R.string.lbl_inch)));
            string3.getClass();
            return string3;
        }

        public static String m1(long j8, l22.b bVar, boolean z14) {
            if (bVar == null) {
                return "";
            }
            if (j8 < 0 || (j8 == 0 && z14)) {
                return bVar.getString(R.string.no_value_card);
            }
            long j14 = j8 / ((long) DateTimeConstants.MILLIS_PER_HOUR);
            long j15 = 1000;
            long j16 = j8 - ((j14 * j15) * ((long) DateTimeConstants.SECONDS_PER_HOUR));
            long j17 = j16 / ((long) DateTimeConstants.MILLIS_PER_MINUTE);
            long j18 = (j16 - ((j17 * j15) * ((long) 60))) / j15;
            int iC = MathKt.c((j8 % j15) / 10.0f);
            if (j14 == 0) {
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                return String.format(Locale.getDefault(), "%02d:%02d.%02d", Arrays.copyOf(new Object[]{Long.valueOf(j17), Long.valueOf(j18), Integer.valueOf(iC)}, 3));
            }
            p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
            return String.format(Locale.getDefault(), "%d:%02d:%02d.%02d", Arrays.copyOf(new Object[]{Long.valueOf(j14), Long.valueOf(j17), Long.valueOf(j18), Integer.valueOf(iC)}, 4));
        }

        public static double n(int i14, boolean z14) {
            if (i14 > 0) {
                return (z14 ? 100.0d : 91.44d) / ((double) i14);
            }
            return 0.0d;
        }

        public static /* synthetic */ String n0(a aVar, Context context, float f14, boolean z14) {
            aVar.getClass();
            return m0(context, f14, z14, false);
        }

        public static String n1(int i14) {
            int i15 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            int i16 = i14 % DateTimeConstants.SECONDS_PER_HOUR;
            int i17 = i16 / 60;
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format(Locale.getDefault(), "%1$d:%2$02d:%3$02d", Arrays.copyOf(new Object[]{Integer.valueOf(i15), Integer.valueOf(i17), Integer.valueOf(i16 % 60)}, 3));
        }

        public static int o(double d14) {
            if (d14 == 0.0d || Double.isNaN(d14)) {
                return 0;
            }
            return (int) Math.round(1852.0d / d14);
        }

        public static String o0(l22.b bVar, double d14, boolean z14) {
            bVar.getClass();
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(Math.round(d14)));
            if (z14) {
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(R.string.lbl_reps_per_minute));
            }
            return sb3.toString();
        }

        public static String o1(long j8) {
            long j14 = DateTimeConstants.SECONDS_PER_HOUR;
            long j15 = j8 / j14;
            long j16 = j8 % j14;
            long j17 = 60;
            long j18 = j16 / j17;
            long j19 = j16 % j17;
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format(Locale.getDefault(), "%1$d:%2$02d:%3$02d", Arrays.copyOf(new Object[]{Long.valueOf(j15), Long.valueOf(j18), Long.valueOf(j19)}, 3));
        }

        public static int p(double d14, boolean z14) {
            if (d14 == 0.0d || Double.isNaN(d14)) {
                return 0;
            }
            return (int) (z14 ? Math.round(1000.0d / d14) : Math.round(1609.344d / d14));
        }

        public static String p1(double d14) {
            int i14 = (int) d14;
            int i15 = i14 % 60;
            if (d14 - ((double) i14) >= 0.5d) {
                i15++;
            }
            int i16 = (i14 / 60) % 60;
            if (i15 >= 60) {
                i16++;
            }
            int i17 = (int) (d14 / ((double) DateTimeConstants.SECONDS_PER_HOUR));
            if (i16 >= 60) {
                i17++;
                i16 -= 60;
            }
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format(Locale.getDefault(), "%1$d:%2$02d", Arrays.copyOf(new Object[]{Integer.valueOf(i17), Integer.valueOf(i16)}, 2));
        }

        public static int q(double d14) {
            if (d14 == 0.0d || Double.isNaN(d14)) {
                return 0;
            }
            return (int) Math.round(((double) 500) / d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static String q1(int i14) {
            o13.p pVar;
            if (i14 < 3600) {
                pVar = new o13.p(0, Integer.valueOf(i14 / 60));
            } else {
                pVar = new o13.p(Integer.valueOf(i14 / DateTimeConstants.SECONDS_PER_HOUR), Integer.valueOf((i14 % DateTimeConstants.SECONDS_PER_HOUR) / 60));
            }
            int iIntValue = ((Number) pVar.f128594a).intValue();
            int iIntValue2 = ((Number) pVar.f128595b).intValue();
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format(Locale.getDefault(), "%1$d:%2$02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 2));
        }

        public static int r(double d14, boolean z14) {
            if (d14 == 0.0d || Double.isNaN(d14)) {
                return 0;
            }
            return (int) Math.round((z14 ? 100.0d : 91.44d) / d14);
        }

        public static String r1(l22.b bVar, int i14) {
            String strA;
            bVar.getClass();
            int i15 = i14 % DateTimeConstants.SECONDS_PER_HOUR;
            int i16 = i15 / 60;
            int i17 = i15 % 60;
            String strA2 = "";
            if (i16 == 0) {
                strA = "";
            } else {
                strA = i16 == 1 ? bVar.a(R.string.lbl_plural_one_minute, Integer.valueOf(i16)) : bVar.a(R.string.lbl_plural_more_than_one_minute, Integer.valueOf(i16));
            }
            if (i17 != 0 || i16 == 0) {
                strA2 = i17 == 1 ? bVar.a(R.string.lbl_plural_one_second, Integer.valueOf(i17)) : bVar.a(R.string.lbl_plural_more_than_one_second, Integer.valueOf(i17));
            }
            return i16 == 0 ? strA2 : e5.g(strA, StringUtils.SPACE, strA2);
        }

        public static int s(int i14, double d14, boolean z14) {
            if (d14 == 0.0d || Double.isNaN(d14)) {
                return 0;
            }
            double d15 = i14;
            if (!z14) {
                d15 *= 0.9144d;
            }
            return (int) Math.round(d15 / d14);
        }

        public static String s1(double d14, String str) {
            int i14 = (int) d14;
            int i15 = i14 % 60;
            if (d14 - ((double) i14) >= 0.5d) {
                i15++;
            }
            int i16 = (i14 / 60) % 60;
            if (i15 >= 60) {
                i16++;
                i15 -= 60;
            }
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format(Locale.getDefault(), str, Arrays.copyOf(new Object[]{Integer.valueOf(i16), Integer.valueOf(i15)}, 2));
        }

        public static int t(double d14) {
            if (d14 == 0.0d) {
                return 0;
            }
            return (int) Math.round((16.666666666666668d / d14) * ((double) 60));
        }

        public static String t0(a aVar, l22.b bVar, int i14) {
            String string = bVar != null ? bVar.getString(R.string.no_duration_value) : "";
            aVar.getClass();
            return i14 > 3599 ? string : w0(i14);
        }

        public static /* synthetic */ String t1(a aVar, double d14) {
            aVar.getClass();
            return s1(d14, "%1$d:%2$02d");
        }

        public static int u(double d14, boolean z14) {
            if (d14 == 0.0d || Double.isNaN(d14)) {
                return 0;
            }
            return MathKt.b((z14 ? 1000.0d : 1609.344d) / d14);
        }

        public static String u0(double d14, String str, l22.b bVar, boolean z14, boolean z15, boolean z16) {
            int iU = u(d14, z14);
            if (iU > 3599) {
                if (!z16) {
                    str = bVar != null ? bVar.getString(R.string.no_duration_value) : null;
                }
                return str == null ? "" : str;
            }
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            StringBuilder sb3 = new StringBuilder(String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iU / 60), Integer.valueOf(iU % 60)}, 2)));
            if (z15 && bVar != null) {
                String string = bVar.getString(N1(z14));
                sb3.append(StringUtils.SPACE);
                sb3.append(string);
            }
            return sb3.toString();
        }

        public static String u1(Context context, int i14, String str) {
            int i15;
            String string;
            context.getClass();
            if (i14 == 0) {
                return str;
            }
            if (i14 < 3600) {
                i15 = i14 / 60;
                string = context.getString(R.string.sleep_my_day_minute_unit);
            } else {
                if (i14 % DateTimeConstants.SECONDS_PER_HOUR >= 60) {
                    return h1(i14, context);
                }
                i15 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
                string = context.getString(R.string.sleep_my_day_hour_unit);
            }
            return androidx.core.view.j.f(i15, lc.u0.j(string));
        }

        public static int v(double d14) {
            if (d14 == 0.0d) {
                return 0;
            }
            return (int) Math.round((l3.f23139q / d14) * ((double) 60));
        }

        public static String v0(a aVar, Context context, double d14, boolean z14, boolean z15, String str, int i14) {
            if ((i14 & 16) != 0) {
                str = null;
            }
            aVar.getClass();
            return u0(d14, str, context != null ? new l22.a(context) : null, z14, z15, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static String v1(Context context, int i14, String str) {
            if (i14 == 0) {
                return str;
            }
            if (i14 < 3600) {
                return org.apache.commons.lang3.e.d(i14 / 60, StringUtils.SPACE, lc.u0.j(context.getString(R.string.sleep_my_day_minute_unit)));
            }
            int i15 = i14 % DateTimeConstants.SECONDS_PER_HOUR;
            if (i15 < 60) {
                return org.apache.commons.lang3.e.d(i14 / DateTimeConstants.SECONDS_PER_HOUR, StringUtils.SPACE, lc.u0.j(context.getString(R.string.sleep_my_day_hour_unit)));
            }
            o13.p pVar = i14 < 3600 ? new o13.p(0, Integer.valueOf(i14 / 60)) : new o13.p(Integer.valueOf(i14 / DateTimeConstants.SECONDS_PER_HOUR), Integer.valueOf(i15 / 60));
            int iIntValue = ((Number) pVar.f128594a).intValue();
            int iIntValue2 = ((Number) pVar.f128595b).intValue();
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            Locale locale = Locale.getDefault();
            String string = context.getString(R.string.lbl_utils_hours_small_abbreviation_space);
            string.getClass();
            String str2 = String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
            Locale locale2 = Locale.getDefault();
            String string2 = context.getString(R.string.lbl_utils_minutes_small_abbreviated_space);
            string2.getClass();
            return e5.g(str2, StringUtils.SPACE, String.format(locale2, string2, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue2)}, 1)));
        }

        /* JADX WARN: Code duplicated, block: B:55:0x009e A[PHI: r1
          0x009e: PHI (r1v9 double) = (r1v3 double), (r1v5 double), (r1v6 double), (r1v10 double) binds: [B:107:0x011c, B:71:0x00c5, B:77:0x00d2, B:54:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
        public static double w(double d14, q3 q3Var, q3 q3Var2) {
            boolean z14;
            double d15;
            double d16;
            double d17;
            double d18;
            double d19;
            q3Var.getClass();
            q3Var2.getClass();
            if (Double.isNaN(d14) || q3Var == q3Var2 || d14 == 0.0d) {
                return d14;
            }
            q3.f23208f.getClass();
            q3 q3Var3 = q3.NAUTICAL_MILES_PER_HOUR;
            if (q3Var == q3Var3) {
                d15 = q3Var3.f23220b;
            } else if (q3Var2 != q3Var3) {
                q3 q3Var4 = q3.AVIATION_KNOTS;
                if (q3Var == q3Var4) {
                    d15 = q3Var4.f23220b;
                } else if (q3Var2 != q3Var4) {
                    boolean z15 = q3Var.f23219a;
                    boolean z16 = q3Var2.f23219a;
                    double d24 = 1.0d;
                    if (z15 != z16) {
                        double d25 = q3Var.f23222d * 1.0d;
                        q3Var = z16 ? q3.METERS_PER_SECOND : q3.FEET_PER_SECOND;
                        d24 = d25;
                    }
                    if (q3Var.ordinal() > q3Var2.ordinal()) {
                        z14 = false;
                    } else {
                        z14 = true;
                        q3Var2 = q3Var;
                        q3Var = q3Var2;
                    }
                    switch (q3.a.C0346a.f23224a[q3Var2.ordinal()]) {
                        case 1:
                            q3 q3Var5 = q3.METERS_PER_SECOND;
                            if (q3Var != q3Var5) {
                                d16 = d24 * (z14 ? q3Var5.f23221c : q3Var5.f23220b);
                                q3 q3Var6 = q3.METERS_PER_HOUR;
                                if (q3Var != q3Var6) {
                                    d17 = d16 * (z14 ? q3Var6.f23221c : q3Var6.f23220b);
                                    q3 q3Var7 = q3.KILOMETER_PER_HOUR;
                                    d18 = z14 ? q3Var7.f23221c : q3Var7.f23220b;
                                    d15 = d18 * d17;
                                } else {
                                    d15 = d16;
                                }
                            } else {
                                d15 = d24;
                            }
                            break;
                        case 2:
                            q3 q3Var8 = q3.METERS_PER_HOUR;
                            if (q3Var != q3Var8) {
                                d24 *= z14 ? q3Var8.f23221c : q3Var8.f23220b;
                                q3 q3Var9 = q3.KILOMETER_PER_HOUR;
                                d19 = z14 ? q3Var9.f23221c : q3Var9.f23220b;
                                d15 = d19 * d24;
                            } else {
                                d15 = d24;
                            }
                            break;
                        case 3:
                            q3 q3Var10 = q3.KILOMETER_PER_HOUR;
                            d19 = z14 ? q3Var10.f23221c : q3Var10.f23220b;
                            d15 = d19 * d24;
                            break;
                        case 4:
                            q3 q3Var11 = q3.FEET_PER_SECOND;
                            if (q3Var != q3Var11) {
                                d16 = d24 * (z14 ? q3Var11.f23221c : q3Var11.f23220b);
                                q3 q3Var12 = q3.FEET_PER_HOUR;
                                if (q3Var != q3Var12) {
                                    d16 *= z14 ? q3Var12.f23221c : q3Var12.f23220b;
                                    q3 q3Var13 = q3.YARDS_PER_HOUR;
                                    if (q3Var != q3Var13) {
                                        d17 = d16 * (z14 ? q3Var13.f23221c : q3Var13.f23220b);
                                        q3 q3Var14 = q3.MILE_PER_HOUR;
                                        d18 = z14 ? q3Var14.f23221c : q3Var14.f23220b;
                                        d15 = d18 * d17;
                                        break;
                                    }
                                }
                                d15 = d16;
                            } else {
                                d15 = d24;
                            }
                            break;
                        case 5:
                            q3 q3Var15 = q3.FEET_PER_HOUR;
                            if (q3Var != q3Var15) {
                                d16 = d24 * (z14 ? q3Var15.f23221c : q3Var15.f23220b);
                                q3 q3Var16 = q3.YARDS_PER_HOUR;
                                if (q3Var != q3Var16) {
                                    d17 = d16 * (z14 ? q3Var16.f23221c : q3Var16.f23220b);
                                    q3 q3Var17 = q3.MILE_PER_HOUR;
                                    d18 = z14 ? q3Var17.f23221c : q3Var17.f23220b;
                                    d15 = d18 * d17;
                                } else {
                                    d15 = d16;
                                }
                            } else {
                                d15 = d24;
                            }
                            break;
                        case 6:
                            q3 q3Var18 = q3.YARDS_PER_HOUR;
                            if (q3Var != q3Var18) {
                                d24 *= z14 ? q3Var18.f23221c : q3Var18.f23220b;
                                q3 q3Var19 = q3.MILE_PER_HOUR;
                                d19 = z14 ? q3Var19.f23221c : q3Var19.f23220b;
                                d15 = d19 * d24;
                            } else {
                                d15 = d24;
                            }
                            break;
                        case 7:
                            q3 q3Var20 = q3.MILE_PER_HOUR;
                            d19 = z14 ? q3Var20.f23221c : q3Var20.f23220b;
                            d15 = d19 * d24;
                            break;
                        default:
                            d15 = d24;
                            break;
                    }
                } else {
                    d15 = q3Var4.f23221c;
                }
            } else {
                d15 = q3Var3.f23221c;
            }
            return d14 * d15;
        }

        public static String w0(int i14) {
            int i15 = i14 / 60;
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i15), Integer.valueOf(i14 % 60)}, 2));
        }

        public static String w1(long j8, String str, boolean z14) {
            if (j8 >= 0 && (z14 || j8 != 0)) {
                DecimalFormat decimalFormat = l3.f23138p;
                try {
                    Number number = decimalFormat.parse(decimalFormat.format(j8 / 1000));
                    float fFloatValue = number != null ? number.floatValue() : 0.0f;
                    if (fFloatValue < 60.0f) {
                        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                        return String.format(Locale.getDefault(), "%d:%04.1f", Arrays.copyOf(new Object[]{0, Float.valueOf(fFloatValue)}, 2));
                    }
                    if (fFloatValue < 3600.0f) {
                        float f14 = 60;
                        int i14 = (int) (fFloatValue / f14);
                        float f15 = fFloatValue % f14;
                        p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                        return String.format(Locale.getDefault(), "%d:%04.1f", Arrays.copyOf(new Object[]{Integer.valueOf(i14), Float.valueOf(f15)}, 2));
                    }
                    float f16 = DateTimeConstants.SECONDS_PER_HOUR;
                    int i15 = (int) (fFloatValue / f16);
                    float f17 = fFloatValue % f16;
                    int i16 = ((int) f17) / 60;
                    float f18 = f17 % 60;
                    p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
                    return String.format(Locale.getDefault(), "%d:%02d:%04.1f", Arrays.copyOf(new Object[]{Integer.valueOf(i15), Integer.valueOf(i16), Float.valueOf(f18)}, 3));
                } catch (ParseException e4) {
                    e4.printStackTrace();
                }
            }
            return str;
        }

        public static double x(double d14, q3 q3Var) {
            q3Var.getClass();
            return w(d14, q3Var, q3.METERS_PER_SECOND);
        }

        public static String x0(Context context, double d14, boolean z14, boolean z15, String str) {
            context.getClass();
            l22.a aVar = new l22.a(context);
            StringBuilder sb3 = new StringBuilder();
            if (Double.isNaN(d14)) {
                sb3.append(str);
            } else {
                a aVar2 = l3.f23124b;
                int iB = MathKt.b(d14);
                aVar2.getClass();
                sb3.append(w0(iB));
            }
            if (z15) {
                sb3.append(StringUtils.SPACE);
                l3.f23124b.getClass();
                sb3.append(aVar.getString(N1(z14)));
            }
            return sb3.toString();
        }

        public static /* synthetic */ String x1(a aVar, long j8) {
            aVar.getClass();
            return w1(j8, null, true);
        }

        public static int y(int i14, int i15, int i16) {
            return fb1.c.d(i15, 60, i14 * DateTimeConstants.SECONDS_PER_HOUR, i16);
        }

        public static /* synthetic */ String y0(a aVar, Context context, double d14, boolean z14, boolean z15) {
            String string = context.getString(R.string.no_duration_value);
            string.getClass();
            aVar.getClass();
            return x0(context, d14, z14, z15, string);
        }

        public static String y1(l22.b bVar, double d14, boolean z14, String str) {
            str.getClass();
            if (bVar == null || Double.isNaN(d14) || d14 < 0.0d) {
                return str;
            }
            DecimalFormat decimalFormat = l3.f23131i;
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (z14) {
                return U(Double.valueOf(d14), decimalFormat);
            }
            String str2 = decimalFormat.format(d14);
            str2.getClass();
            return str2;
        }

        public static long z(int i14, int i15) {
            return TimeUnit.MINUTES.toSeconds(i15) + TimeUnit.HOURS.toSeconds(i14);
        }

        public static String z1(l22.b bVar, double d14, boolean z14) {
            if (Double.isNaN(d14)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder(l3.f23130h.format(d14));
            if (z14 && bVar != null) {
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(R.string.lbl_cm));
            }
            return sb3.toString();
        }

        public final String I1(double d14, String str, l22.b bVar, boolean z14, boolean z15, boolean z16) {
            str.getClass();
            if (Double.isNaN(d14)) {
                return s0(bVar, d14, z15, z16, str);
            }
            if (!z14) {
                return s0(bVar, p(d14, z15), z15, z16, str);
            }
            double dR = r(d14, z15);
            if (Double.isNaN(dR)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(w0((int) dR));
            if (z16) {
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(O1(z15)));
            }
            return sb3.toString();
        }

        public final String J1(Context context, double d14, boolean z14, boolean z15, boolean z16, String str) {
            context.getClass();
            str.getClass();
            return I1(d14, str, new l22.a(context), z14, z15, z16);
        }

        public final String K0(Context context, double d14, boolean z14, String str) {
            context.getClass();
            str.getClass();
            String strR0 = r0(context, d14, true, false, str);
            if (!z14) {
                return strR0;
            }
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format("%s %s", Arrays.copyOf(new Object[]{strR0, context.getString(R.string.lbl_minute_500_meters)}, 2));
        }

        public final String M1(Context context, double d14, boolean z14, boolean z15, String str) {
            context.getClass();
            l22.a aVar = new l22.a(context);
            if (Double.isNaN(d14)) {
                return s0(aVar, d14, z14, z15, str);
            }
            double dR = r(d14, z14);
            if (Double.isNaN(dR)) {
                return "";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(w0((int) dR));
            if (z15) {
                sb3.append(StringUtils.SPACE);
                sb3.append(aVar.getString(z14 ? R.string.lbl_per_100_meters : R.string.lbl_per_100_yards));
            }
            return sb3.toString();
        }

        public final String p0(int i14, Context context) {
            return t0(this, context != null ? new l22.a(context) : null, i14);
        }

        public final String q0(Context context, double d14, boolean z14, boolean z15) {
            context.getClass();
            return r0(context, d14, z14, z15, "");
        }

        public final String r0(Context context, double d14, boolean z14, boolean z15, String str) {
            context.getClass();
            str.getClass();
            return s0(new l22.a(context), d14, z14, z15, str);
        }

        public final String s0(l22.b bVar, double d14, boolean z14, boolean z15, String str) {
            bVar.getClass();
            StringBuilder sb3 = new StringBuilder();
            if (!Double.isNaN(d14)) {
                sb3.append(t0(this, bVar, (int) Math.round(d14)));
            } else {
                if (str == null) {
                    return "'";
                }
                sb3.append(str);
            }
            if (z15) {
                String string = bVar.getString(N1(z14));
                sb3.append(StringUtils.SPACE);
                sb3.append(string);
            }
            return sb3.toString();
        }

        public final String z0(l22.a aVar, double d14, boolean z14, boolean z15, String str) {
            StringBuilder sb3 = new StringBuilder();
            if (!Double.isNaN(d14)) {
                int iRound = (int) Math.round(d14);
                if (iRound / DateTimeConstants.SECONDS_PER_HOUR > 0) {
                    sb3.append(l1(((long) iRound) * 1000));
                } else {
                    sb3.append(t0(this, aVar, iRound));
                }
            } else {
                if (str == null) {
                    return aVar.getString(R.string.no_duration_value);
                }
                sb3.append(str);
            }
            if (z15) {
                String string = aVar.getString(N1(z14));
                sb3.append(StringUtils.SPACE);
                sb3.append(string);
            }
            return sb3.toString();
        }

        private a() {
        }
    }

    public l3(l22.b bVar) {
        bVar.getClass();
        this.f23140a = bVar;
    }
}
