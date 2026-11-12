package defpackage;

import com.huawei.wearengine.sensor.DataResult;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes21.dex */
public class aif extends DateFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final DateFormat f451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Calendar f452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String[] f453c;
    protected static final Locale d;
    protected static final TimeZone e;
    public static final aif f;
    protected static final Pattern h;
    protected static final Pattern j = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
    protected Boolean g;
    protected final Locale i;
    private boolean k;
    private transient DateFormat l;
    protected transient TimeZone m;
    private transient Calendar n;

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return obj == this;
    }

    static {
        try {
            h = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            f453c = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone timeZone = TimeZone.getTimeZone(DataResult.UTC);
            e = timeZone;
            Locale locale = Locale.US;
            d = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            f451a = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            f = new aif();
            f452b = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public aif() {
        this.k = true;
        this.i = d;
    }

    protected aif(TimeZone timeZone, Locale locale, Boolean bool, boolean z) {
        this.m = timeZone;
        this.i = locale;
        this.g = bool;
        this.k = z;
    }

    public aif a(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = e;
        }
        TimeZone timeZone2 = this.m;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new aif(timeZone, this.i, this.g, this.k);
    }

    public aif d(Locale locale) {
        return locale.equals(this.i) ? this : new aif(this.m, locale, this.g, this.k);
    }

    public aif c(Boolean bool) {
        return c(bool, this.g) ? this : new aif(this.m, this.i, bool, this.k);
    }

    @Override // java.text.DateFormat, java.text.Format
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public aif clone() {
        return new aif(this.m, this.i, this.g, this.k);
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this.m;
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.m)) {
            return;
        }
        c();
        this.m = timeZone;
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        if (c(boolValueOf, this.g)) {
            return;
        }
        this.g = boolValueOf;
        c();
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this.g;
        return bool == null || bool.booleanValue();
    }

    @Override // java.text.DateFormat
    public Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateB = b(strTrim, parsePosition);
        if (dateB != null) {
            return dateB;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : f453c) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append('\"');
            }
            sb.append(str2);
        }
        sb.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", strTrim, sb.toString()), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return b(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }

    protected Date b(String str, ParsePosition parsePosition) throws ParseException {
        if (b(str)) {
            return c(str, parsePosition);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt < '0' || cCharAt > '9') {
                if (length > 0 || cCharAt != '-') {
                    break;
                }
            }
        }
        if (length < 0 && (str.charAt(0) == '-' || xd.a(str, false))) {
            return e(str, parsePosition);
        }
        return d(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.m;
        if (timeZone == null) {
            timeZone = e;
        }
        b(timeZone, this.i, date, stringBuffer);
        return stringBuffer;
    }

    protected void b(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar calendarB = b(timeZone);
        calendarB.setTime(date);
        int i = calendarB.get(1);
        if (calendarB.get(0) == 0) {
            a(stringBuffer, i);
        } else {
            if (i > 9999) {
                stringBuffer.append('+');
            }
            e(stringBuffer, i);
        }
        stringBuffer.append('-');
        d(stringBuffer, calendarB.get(2) + 1);
        stringBuffer.append('-');
        d(stringBuffer, calendarB.get(5));
        stringBuffer.append('T');
        d(stringBuffer, calendarB.get(11));
        stringBuffer.append(':');
        d(stringBuffer, calendarB.get(12));
        stringBuffer.append(':');
        d(stringBuffer, calendarB.get(13));
        stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
        c(stringBuffer, calendarB.get(14));
        int offset = timeZone.getOffset(calendarB.getTimeInMillis());
        if (offset != 0) {
            int i2 = offset / 60000;
            int iAbs = Math.abs(i2 / 60);
            int iAbs2 = Math.abs(i2 % 60);
            stringBuffer.append(offset < 0 ? '-' : '+');
            d(stringBuffer, iAbs);
            if (this.k) {
                stringBuffer.append(':');
            }
            d(stringBuffer, iAbs2);
            return;
        }
        if (this.k) {
            stringBuffer.append("+00:00");
        } else {
            stringBuffer.append("+0000");
        }
    }

    protected void a(StringBuffer stringBuffer, int i) {
        if (i == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            e(stringBuffer, i - 1);
        }
    }

    private static void d(StringBuffer stringBuffer, int i) {
        int i2 = i / 10;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 10;
        }
        stringBuffer.append((char) (i + 48));
    }

    private static void c(StringBuffer stringBuffer, int i) {
        int i2 = i / 100;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 100;
        }
        d(stringBuffer, i);
    }

    private static void e(StringBuffer stringBuffer, int i) {
        int i2 = i / 100;
        if (i2 == 0) {
            stringBuffer.append('0').append('0');
        } else {
            if (i2 > 99) {
                stringBuffer.append(i2);
            } else {
                d(stringBuffer, i2);
            }
            i -= i2 * 100;
        }
        d(stringBuffer, i);
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this.m, this.i, this.g);
    }

    public String b() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSX', 'EEE, dd MMM yyyy HH:mm:ss zzz' (");
        sb.append(Boolean.FALSE.equals(this.g) ? "strict" : "lenient");
        sb.append(")]");
        return sb.toString();
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    protected boolean b(String str) {
        return str.length() >= 7 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-' && Character.isDigit(str.charAt(5));
    }

    private Date e(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return new Date(xd.a(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", str), parsePosition.getErrorIndex());
        }
    }

    protected Date c(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return a(str, parsePosition);
        } catch (IllegalArgumentException e2) {
            throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", str, e2.getMessage()), parsePosition.getErrorIndex());
        }
    }

    protected Date a(String str, ParsePosition parsePosition) throws ParseException, IllegalArgumentException {
        String str2;
        int length = str.length();
        TimeZone timeZone = e;
        if (this.m != null && 'Z' != str.charAt(length - 1)) {
            timeZone = this.m;
        }
        Calendar calendarB = b(timeZone);
        calendarB.clear();
        int iCharAt = 0;
        if (length <= 10) {
            if (j.matcher(str).matches()) {
                calendarB.set(c(str, 0), b(str, 5) - 1, b(str, 8), 0, 0, 0);
                calendarB.set(14, 0);
                return calendarB.getTime();
            }
            str2 = "yyyy-MM-dd";
        } else {
            Matcher matcher = h.matcher(str);
            if (matcher.matches()) {
                int iStart = matcher.start(2);
                int iEnd = matcher.end(2);
                int i = iEnd - iStart;
                if (i > 1) {
                    int iB = b(str, iStart + 1) * 3600;
                    if (i >= 5) {
                        iB += b(str, iEnd - 2) * 60;
                    }
                    calendarB.set(15, str.charAt(iStart) == '-' ? iB * (-1000) : iB * 1000);
                    calendarB.set(16, 0);
                }
                calendarB.set(c(str, 0), b(str, 5) - 1, b(str, 8), b(str, 11), b(str, 14), (length <= 16 || str.charAt(16) != ':') ? 0 : b(str, 17));
                int iStart2 = matcher.start(1);
                int i2 = iStart2 + 1;
                int iEnd2 = matcher.end(1);
                if (i2 >= iEnd2) {
                    calendarB.set(14, 0);
                } else {
                    int i3 = iEnd2 - i2;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3 && i3 > 9) {
                                    throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", str, matcher.group(1).substring(1)), i2);
                                }
                                iCharAt = str.charAt(iStart2 + 3) - '0';
                            }
                            iCharAt += (str.charAt(iStart2 + 2) - '0') * 10;
                        }
                        iCharAt += (str.charAt(i2) - '0') * 100;
                    }
                    calendarB.set(14, iCharAt);
                }
                return calendarB.getTime();
            }
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        }
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", str, str2, this.g), 0);
    }

    private static int c(String str, int i) {
        return ((str.charAt(i) - '0') * 1000) + ((str.charAt(i + 1) - '0') * 100) + ((str.charAt(i + 2) - '0') * 10) + (str.charAt(i + 3) - '0');
    }

    private static int b(String str, int i) {
        return ((str.charAt(i) - '0') * 10) + (str.charAt(i + 1) - '0');
    }

    protected Date d(String str, ParsePosition parsePosition) {
        if (this.l == null) {
            this.l = b(f451a, "EEE, dd MMM yyyy HH:mm:ss zzz", this.m, this.i, this.g);
        }
        return this.l.parse(str, parsePosition);
    }

    private static final DateFormat b(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat simpleDateFormat;
        if (!locale.equals(d)) {
            simpleDateFormat = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = e;
            }
            simpleDateFormat.setTimeZone(timeZone);
        } else {
            simpleDateFormat = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                simpleDateFormat.setTimeZone(timeZone);
            }
        }
        if (bool != null) {
            simpleDateFormat.setLenient(bool.booleanValue());
        }
        return simpleDateFormat;
    }

    protected void c() {
        this.l = null;
    }

    protected Calendar b(TimeZone timeZone) {
        Calendar calendar = this.n;
        if (calendar == null) {
            calendar = (Calendar) f452b.clone();
            this.n = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    protected static <T> boolean c(T t, T t2) {
        if (t == t2) {
            return true;
        }
        return t != null && t.equals(t2);
    }
}
