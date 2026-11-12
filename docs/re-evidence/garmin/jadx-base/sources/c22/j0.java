package c22;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalInstantException;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/j0;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f23099a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f23100b = Pattern.compile("(?:Z|[+-](?:[01][0-9]:[0-5][0-9]))");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DateTimeFormatter f23101c = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").withZoneUTC();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DateTimeFormatter f23102d = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DateTimeFormatter f23103e = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss'.000Z'").withZoneUTC();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DateTimeFormatter f23104f = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").getParser(), DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").getParser(), DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.S").getParser()}).toFormatter();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DateTimeFormatter f23105g = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").getParser(), DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").getParser(), DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.S").getParser(), DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SS").getParser()}).toFormatter();

    private j0() {
    }

    public static DateTimeFormatter A(char c14) {
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern(new d53.k("(('[^']+')|[^\\u0041-\\u005A\\u0061-\\u007A']+)*G*y+(('[^']+')|[^\\u0041-\\u005A\\u0061-\\u007A']+)*").f(P(c14 + "-", Locale.getDefault()), ""));
        dateTimeFormatterForPattern.getClass();
        return dateTimeFormatterForPattern;
    }

    public static DateTime B(Long l14) {
        if (l14 == null) {
            return null;
        }
        return new DateTime(l14.longValue(), DateTimeZone.UTC);
    }

    public static String C(int i14, int i15) {
        if (!DateFormat.is24HourFormat(((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c())) {
            return u((((long) i14) * 60) + ((long) i15));
        }
        l3.f23124b.getClass();
        String strD1 = l3.a.d1((i14 * 60) + i15);
        return strD1 == null ? "" : strD1;
    }

    public static boolean D() {
        return DateFormat.is24HourFormat(((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c());
    }

    public static final boolean E(long j8, long j14) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j8);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j14);
        f23099a.getClass();
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static boolean F(DateTime dateTime, DateTime dateTime2) {
        return dateTime != null && dateTime2 != null && dateTime.getYear() == dateTime2.getYear() && dateTime.getMonthOfYear() == dateTime2.getMonthOfYear() && dateTime.getDayOfMonth() == dateTime2.getDayOfMonth();
    }

    public static boolean G(DateTime dateTime, DateTime dateTime2) {
        return dateTime != null && dateTime2 != null && dateTime.getYear() == dateTime2.getYear() && dateTime.getMonthOfYear() == dateTime2.getMonthOfYear();
    }

    public static boolean H(DateTime dateTime, DateTime dateTime2) {
        return (dateTime == null || dateTime2 == null || dateTime.getYear() != dateTime2.getYear()) ? false : true;
    }

    public static final DateTime I(String str) {
        if (str != null && str.length() != 0) {
            try {
                return new DateTime(str, DateTimeZone.UTC).withZoneRetainFields(DateTimeZone.getDefault());
            } catch (Throwable th3) {
                th3.getMessage();
            }
        }
        return null;
    }

    public static final long J(String str, DateTimeZone dateTimeZone) {
        if (str == null || dateTimeZone == null) {
            return 0L;
        }
        try {
            return new DateTime(str, dateTimeZone).getMillis();
        } catch (IllegalArgumentException e4) {
            e4.getLocalizedMessage();
            return 0L;
        }
    }

    public static final DateTime K(String str, String str2) {
        return L(str, str2, DateTimeZone.getDefault());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036 A[Catch: IllegalArgumentException -> 0x0040, TRY_LEAVE, TryCatch #1 {IllegalArgumentException -> 0x0040, blocks: (B:21:0x002c, B:23:0x0036), top: B:28:0x002c }] */
    public static final DateTime L(String str, String str2, DateTimeZone dateTimeZone) {
        LocalDateTime localDateTime;
        if (str != null && str.length() != 0 && str2.length() != 0 && dateTimeZone != null) {
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern(str2);
            try {
                return DateTime.parse(str, dateTimeFormatterForPattern.withZone(dateTimeZone));
            } catch (IllegalInstantException e4) {
                e4.getLocalizedMessage();
                try {
                    localDateTime = LocalDateTime.parse(str, dateTimeFormatterForPattern);
                    if (dateTimeZone.isLocalDateTimeGap(localDateTime)) {
                        return localDateTime.plusHours(1).toDateTime(dateTimeZone);
                    }
                } catch (IllegalArgumentException e14) {
                    e14.getLocalizedMessage();
                }
                return null;
            } catch (IllegalArgumentException e15) {
                e15.getLocalizedMessage();
                localDateTime = LocalDateTime.parse(str, dateTimeFormatterForPattern);
                if (dateTimeZone.isLocalDateTimeGap(localDateTime)) {
                    return localDateTime.plusHours(1).toDateTime(dateTimeZone);
                }
                return null;
            }
        }
        return null;
    }

    public static final DateTime M(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return f23100b.matcher(str).find() ? new DateTime(str) : new DateTime(str, DateTimeZone.UTC).withZoneRetainFields(DateTimeZone.getDefault());
        } catch (Throwable th3) {
            th3.getMessage();
            return null;
        }
    }

    public static final DateTime N(String str, boolean z14) {
        if (str != null && str.length() != 0) {
            DateTimeFormatter dateTimeFormatter = f23104f;
            try {
                return z14 ? dateTimeFormatter.withZoneUTC().parseDateTime(str).withZone(DateTimeZone.getDefault()) : dateTimeFormatter.parseDateTime(str);
            } catch (IllegalArgumentException e4) {
                e4.getMessage();
            }
        }
        return null;
    }

    public static String O(Locale locale) {
        String strPatternForStyle = DateTimeFormat.patternForStyle("F-", locale);
        strPatternForStyle.getClass();
        String strReplace = strPatternForStyle.replace('c', 'E');
        strReplace.getClass();
        String strReplace2 = strReplace.replace('L', 'M');
        strReplace2.getClass();
        return strReplace2;
    }

    public static String P(String str, Locale locale) {
        String strPatternForStyle = DateTimeFormat.patternForStyle(str, locale);
        if (!d53.u.y(str, "F", false)) {
            strPatternForStyle.getClass();
            return strPatternForStyle;
        }
        strPatternForStyle.getClass();
        String strReplace = strPatternForStyle.replace('c', 'E');
        strReplace.getClass();
        String strReplace2 = strReplace.replace('L', 'M');
        strReplace2.getClass();
        return strReplace2;
    }

    public static DateTime Q(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTimeWithTime = dateTime.dayOfMonth().withMaximumValue().withTime(23, 59, 59, 0);
        dateTimeWithTime.getClass();
        return dateTimeWithTime;
    }

    public static final DateTime R(DateTime dateTime) {
        DateTime dateTime2;
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        dateTimeZone.getClass();
        f23099a.getClass();
        if (dateTime == null) {
            DateTime dateTimeWithZone = new DateTime().withTimeAtStartOfDay().withZone(dateTimeZone);
            dateTimeWithZone.getClass();
            return dateTimeWithZone;
        }
        try {
            try {
                dateTime2 = new DateTime(dateTime.getYear(), dateTime.getMonthOfYear(), dateTime.getDayOfMonth(), 0, 0, 0, 0, dateTimeZone);
            } catch (IllegalInstantException unused) {
                dateTime2 = new DateTime(dateTime.getYear(), dateTime.getMonthOfYear(), dateTime.getDayOfMonth(), 1, 0, 0, 0, dateTimeZone);
            }
        } catch (IllegalInstantException unused2) {
            dateTime2 = null;
        }
        if (dateTime2 != null) {
            return dateTime2;
        }
        DateTime dateTimeWithZone2 = new DateTime().withTimeAtStartOfDay().withZone(dateTimeZone);
        dateTimeWithZone2.getClass();
        return dateTimeWithZone2;
    }

    public static DateTime S(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTimeWithTimeAtStartOfDay = dateTime.dayOfMonth().withMinimumValue().withTimeAtStartOfDay();
        dateTimeWithTimeAtStartOfDay.getClass();
        return dateTimeWithTimeAtStartOfDay;
    }

    public static final String a(DateTime dateTime, char c14) {
        Locale locale = Locale.getDefault();
        f23099a.getClass();
        String strPrint = DateTimeFormat.forPattern(P(c14 + "-", locale)).print(dateTime);
        strPrint.getClass();
        return strPrint;
    }

    public static final String b(DateTime dateTime, String str, DateTimeZone dateTimeZone) {
        if (dateTime == null) {
            return null;
        }
        try {
            return DateTimeFormat.forPattern(str).withZone(dateTimeZone).print(dateTime);
        } catch (IllegalArgumentException e4) {
            e4.getLocalizedMessage();
            dateTime.toString();
            return null;
        }
    }

    public static String c(String str, String str2, String str3, String str4) {
        if (str != null) {
            Locale locale = Locale.ENGLISH;
            try {
                Date date = new SimpleDateFormat(str2, locale).parse(str);
                if (date != null) {
                    String str5 = new SimpleDateFormat(str3, locale).format(date);
                    str5.getClass();
                    return str5;
                }
            } catch (ParseException unused) {
            }
        }
        return str4;
    }

    public static String d(String str, String str2) {
        str2.getClass();
        if (str == null) {
            return "";
        }
        try {
            Date date = new SimpleDateFormat("MM/dd/yy", Locale.getDefault()).parse(str);
            if (date == null) {
                return "";
            }
            String str3 = w(str2).format(date);
            str3.getClass();
            return str3;
        } catch (ParseException unused) {
            return "";
        }
    }

    public static final String e(String str, DateTimeZone dateTimeZone, String str2, DateTimeZone dateTimeZone2) {
        if (str == null) {
            return null;
        }
        try {
            return DateTimeFormat.forPattern(str2).withZone(dateTimeZone2).print(dateTimeZone != null ? new DateTime(str, dateTimeZone) : new DateTime(str));
        } catch (IllegalArgumentException e4) {
            e4.getLocalizedMessage();
            return null;
        }
    }

    public static final String f(Calendar calendar, String str, TimeZone timeZone) {
        calendar.getClass();
        Date time = calendar.getTime();
        time.getClass();
        return g(time, str, timeZone);
    }

    public static final String g(Date date, String str, TimeZone timeZone) {
        date.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern(str);
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        String str2 = simpleDateFormat.format(date);
        str2.getClass();
        return str2;
    }

    public static final String h(DateTime dateTime, DateTimeFormatter dateTimeFormatter) {
        dateTimeFormatter.getClass();
        if (dateTime == null) {
            return "";
        }
        String strPrint = dateTimeFormatter.print(dateTime);
        strPrint.getClass();
        return strPrint;
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        try {
            Date date = new SimpleDateFormat("HH:mm", Locale.getDefault()).parse(str);
            if (date == null) {
                return null;
            }
            return new SimpleDateFormat("h a", Locale.getDefault()).format(date);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String j(DateTime dateTime) {
        String strPrint = DateTimeFormat.forPattern(d53.u.v(d53.u.v(O(Locale.getDefault()), "EEEE", "EEE", false), "MMMM", "MMM", false)).print(dateTime);
        strPrint.getClass();
        return strPrint;
    }

    public static String k(DateTime dateTime, char c14) {
        if (dateTime == null) {
            return "";
        }
        String strPrint = A(c14).print(dateTime);
        strPrint.getClass();
        return strPrint;
    }

    public static String l(LocalDate localDate) {
        localDate.getClass();
        return k(localDate.toDateTimeAtStartOfDay(), 'S');
    }

    public static final String m(DateTime dateTime) {
        Locale locale = Locale.getDefault();
        f23099a.getClass();
        String strPrint = DateTimeFormat.forPattern(d53.u.v(d53.u.v(new d53.k("(('[^']+')|[^\\u0041-\\u005A\\u0061-\\u007A']+)*G*y+(('[^']+')|[^\\u0041-\\u005A\\u0061-\\u007A']+)*").f(O(locale), ""), "EEEE", "EEE", false), "MMMM", "MMM", false)).print(dateTime);
        strPrint.getClass();
        return strPrint;
    }

    public static final String n(DateTime dateTime, char c14) {
        if (dateTime == null) {
            return "";
        }
        DateTime dateTimeNow = DateTime.now();
        f23099a.getClass();
        return !H(dateTime, dateTimeNow) ? a(dateTime, c14) : k(dateTime, c14);
    }

    public static final String o(DateTime dateTime, char c14) {
        if (dateTime == null) {
            return "";
        }
        if (dateTime.isBefore(DateTime.now().minusYears(1).plusDays(1).withTimeAtStartOfDay())) {
            return a(dateTime, c14);
        }
        f23099a.getClass();
        return k(dateTime, c14);
    }

    public static final String p(DateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        LocalDateTime localDateTime = dateTime.toLocalDateTime();
        f23099a.getClass();
        if (localDateTime == null) {
            return "";
        }
        String strPrint = DateTimeFormat.shortDate().print(localDateTime);
        strPrint.getClass();
        return strPrint;
    }

    public static final String q(Context context, DateTime dateTime) {
        String strV;
        String strPatternForStyle = DateTimeFormat.patternForStyle("SS", null);
        if (DateFormat.is24HourFormat(context)) {
            strPatternForStyle.getClass();
            strV = d53.u.v(d53.u.v(strPatternForStyle, "a", "", false), "h", "HH", false);
        } else {
            strPatternForStyle.getClass();
            strV = d53.u.v(strPatternForStyle, "HH", "h", false);
            if (!d53.w.z(strV, "a", false)) {
                strV = strV.concat(" a");
            }
        }
        String strPrint = DateTimeFormat.forPattern(strV).print(dateTime);
        strPrint.getClass();
        return strPrint;
    }

    public static final String r(Context context, DateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        String dateTime2 = DateUtils.formatDateTime(context, dateTime.getZone().getMillisKeepLocal(DateTimeZone.getDefault(), dateTime.getMillis()), 1);
        dateTime2.getClass();
        return dateTime2;
    }

    public static o13.p s(DateTime dateTime, DateTime dateTime2, boolean z14, boolean z15) {
        String str;
        DateTime dateTimeNow = DateTime.now();
        if (H(dateTimeNow, dateTime)) {
            str = (z14 || dateTime.getMonthOfYear() != dateTime2.getMonthOfYear()) ? "MMM d" : "d";
        } else {
            str = "MMM d, yyyy";
        }
        String strB = (H(dateTimeNow, dateTime) || !z14) ? b(dateTime, "MMM d", dateTime.getZone()) : b(dateTime, "MMM d, yyyy", dateTime.getZone());
        String strB2 = z15 ? b(dateTime2, "MMM d", dateTime2.getZone()) : b(dateTime2, str, dateTime2.getZone());
        if (strB == null || strB2 == null) {
            return null;
        }
        return new o13.p(strB, strB2);
    }

    public static String t(int i14, int i15, int i16) {
        if (i14 == 0) {
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            return String.format("%1$s AM", Arrays.copyOf(new Object[]{String.format(Locale.getDefault(), "%1$d:%2$02d", Arrays.copyOf(new Object[]{12, Integer.valueOf(i15), Integer.valueOf(i16)}, 3))}, 1));
        }
        if (i14 <= 12 && (i14 != 12 || i15 < 0)) {
            p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
            return String.format("%1$s AM", Arrays.copyOf(new Object[]{String.format(Locale.getDefault(), "%1$d:%2$02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)}, 3))}, 1));
        }
        if (i14 >= 13) {
            i14 -= 12;
        }
        p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
        return String.format("%1$s PM", Arrays.copyOf(new Object[]{String.format(Locale.getDefault(), "%1$d:%2$02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)}, 3))}, 1));
    }

    public static final String u(long j8) {
        long j14 = 60;
        long j15 = j8 * j14;
        j0 j0Var = f23099a;
        if (j15 < 60) {
            j0Var.getClass();
            return t(0, 0, (int) j15);
        }
        if (j15 < 3600) {
            j0Var.getClass();
            return t(0, (int) (j15 / j14), (int) (j15 % j14));
        }
        long j16 = DateTimeConstants.SECONDS_PER_HOUR;
        int i14 = (int) (j15 / j16);
        int i15 = (int) (j15 % j16);
        j0Var.getClass();
        return t(i14, i15 / 60, i15 % 60);
    }

    public static String v(DateTime dateTime) {
        String strPrint = DateTimeFormat.forPattern("EEEE").print(dateTime);
        strPrint.getClass();
        return strPrint;
    }

    public static SimpleDateFormat w(String str) {
        if (g22.n.d(str)) {
            return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), str), Locale.getDefault());
        }
        vb.h.s("Must have valid formatting pattern.");
        return null;
    }

    public static Date x() {
        Date date = LocalDate.now().withMonthOfYear(1).withDayOfMonth(1).toDate();
        date.getClass();
        return date;
    }

    public static String y(DateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        return com.nimbusds.jose.shaded.gson.internal.a.i(!H(dateTime, DateTime.now()) ? "EEE, MMM d, yyyy" : "EEE, MMM d", dateTime);
    }

    public static DateTimeFormatter z() {
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern(D() ? "HH:mm" : "hh:mm a");
        dateTimeFormatterForPattern.getClass();
        return dateTimeFormatterForPattern;
    }
}
