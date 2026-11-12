package org.apache.commons.lang3.time;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes23.dex */
public class DateUtils {
    public static final long MILLIS_PER_DAY = 86400000;
    public static final long MILLIS_PER_HOUR = 3600000;
    public static final long MILLIS_PER_MINUTE = 60000;
    public static final long MILLIS_PER_SECOND = 1000;
    public static final int RANGE_MONTH_MONDAY = 6;
    public static final int RANGE_MONTH_SUNDAY = 5;
    public static final int RANGE_WEEK_CENTER = 4;
    public static final int RANGE_WEEK_MONDAY = 2;
    public static final int RANGE_WEEK_RELATIVE = 3;
    public static final int RANGE_WEEK_SUNDAY = 1;
    public static final int SEMI_MONTH = 1001;
    private static final int[][] a = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, 1001}, new int[]{1}, new int[]{0}};

    public static class a implements Iterator<Calendar> {
        private final Calendar a;
        private final Calendar b;

        public a(Calendar calendar, Calendar calendar2) {
            this.a = calendar2;
            this.b = calendar;
            calendar.add(5, -1);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Calendar next() {
            if (this.b.equals(this.a)) {
                throw new NoSuchElementException();
            }
            this.b.add(5, 1);
            return (Calendar) this.b.clone();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b.before(this.a);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public enum b {
        TRUNCATE,
        ROUND,
        CEILING
    }

    private static Date a(Date date, int i, int i2) {
        g(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(i, i2);
        return calendar.getTime();
    }

    public static Date addDays(Date date, int i) {
        return a(date, 5, i);
    }

    public static Date addHours(Date date, int i) {
        return a(date, 11, i);
    }

    public static Date addMilliseconds(Date date, int i) {
        return a(date, 14, i);
    }

    public static Date addMinutes(Date date, int i) {
        return a(date, 12, i);
    }

    public static Date addMonths(Date date, int i) {
        return a(date, 2, i);
    }

    public static Date addSeconds(Date date, int i) {
        return a(date, 13, i);
    }

    public static Date addWeeks(Date date, int i) {
        return a(date, 3, i);
    }

    public static Date addYears(Date date, int i) {
        return a(date, 1, i);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    private static long b(Calendar calendar, int i, TimeUnit timeUnit) {
        long jConvert;
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        long jConvert2 = 0;
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        int i2 = timeUnit == timeUnit2 ? 0 : 1;
        if (i != 1) {
            if (i == 2) {
                jConvert = timeUnit.convert(calendar.get(5) - i2, timeUnit2);
            }
            if (i != 1 || i == 2 || i == 5 || i == 6) {
                jConvert2 += timeUnit.convert(calendar.get(11), TimeUnit.HOURS);
            } else {
                switch (i) {
                    case 11:
                        break;
                    case 12:
                        jConvert2 += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
                    case 13:
                        return jConvert2 + timeUnit.convert(calendar.get(14), TimeUnit.MILLISECONDS);
                    case 14:
                        return jConvert2;
                    default:
                        throw new IllegalArgumentException("The fragment " + i + " is not supported");
                }
            }
            jConvert2 += timeUnit.convert(calendar.get(12), TimeUnit.MINUTES);
            jConvert2 += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
            return jConvert2 + timeUnit.convert(calendar.get(14), TimeUnit.MILLISECONDS);
        }
        jConvert = timeUnit.convert(calendar.get(6) - i2, timeUnit2);
        jConvert2 = 0 + jConvert;
        if (i != 1) {
            jConvert2 += timeUnit.convert(calendar.get(11), TimeUnit.HOURS);
            jConvert2 += timeUnit.convert(calendar.get(12), TimeUnit.MINUTES);
            jConvert2 += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
        } else {
            jConvert2 += timeUnit.convert(calendar.get(11), TimeUnit.HOURS);
            jConvert2 += timeUnit.convert(calendar.get(12), TimeUnit.MINUTES);
            jConvert2 += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
        }
        return jConvert2 + timeUnit.convert(calendar.get(14), TimeUnit.MILLISECONDS);
    }

    private static long c(Date date, int i, TimeUnit timeUnit) {
        g(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return b(calendar, i, timeUnit);
    }

    public static Date ceiling(Date date, int i) {
        g(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        d(calendar, i, b.CEILING);
        return calendar.getTime();
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00cd  */
    private static void d(Calendar calendar, int i, b bVar) {
        int i2;
        boolean z;
        char c;
        if (calendar.get(1) > 280000000) {
            throw new ArithmeticException("Calendar value too large for accurate calculations");
        }
        if (i == 14) {
            return;
        }
        Date time = calendar.getTime();
        long time2 = time.getTime();
        int i3 = calendar.get(14);
        b bVar2 = b.TRUNCATE;
        if (bVar2 == bVar || i3 < 500) {
            time2 -= (long) i3;
        }
        boolean z2 = i == 13;
        int i4 = calendar.get(13);
        if (!z2 && (bVar2 == bVar || i4 < 30)) {
            time2 -= ((long) i4) * 1000;
        }
        if (i == 12) {
            z2 = true;
        }
        int i5 = calendar.get(12);
        if (!z2 && (bVar2 == bVar || i5 < 30)) {
            time2 -= ((long) i5) * 60000;
        }
        if (time.getTime() != time2) {
            time.setTime(time2);
            calendar.setTime(time);
        }
        boolean z3 = false;
        for (int[] iArr : a) {
            for (int i6 : iArr) {
                if (i6 == i) {
                    if (bVar == b.CEILING || (bVar == b.ROUND && z3)) {
                        if (i == 1001) {
                            if (calendar.get(5) == 1) {
                                calendar.add(5, 15);
                                return;
                            } else {
                                calendar.add(5, -15);
                                calendar.add(2, 1);
                                return;
                            }
                        }
                        if (i != 9) {
                            calendar.add(iArr[0], 1);
                            return;
                        } else if (calendar.get(11) == 0) {
                            calendar.add(11, 12);
                            return;
                        } else {
                            calendar.add(11, -12);
                            calendar.add(5, 1);
                            return;
                        }
                    }
                    return;
                }
            }
            if (i != 9) {
                if (i == 1001 && iArr[0] == 5) {
                    int i7 = calendar.get(5) - 1;
                    if (i7 >= 15) {
                        i7 -= 15;
                    }
                    z3 = i7 > 7;
                    i2 = i7;
                    z = true;
                } else {
                    z = false;
                    i2 = 0;
                }
            } else if (iArr[0] == 11) {
                int i8 = calendar.get(11);
                if (i8 >= 12) {
                    i8 -= 12;
                }
                z3 = i8 >= 6;
                i2 = i8;
                z = true;
            } else {
                z = false;
                i2 = 0;
            }
            if (z) {
                c = 0;
            } else {
                c = 0;
                int actualMinimum = calendar.getActualMinimum(iArr[0]);
                int actualMaximum = calendar.getActualMaximum(iArr[0]);
                int i9 = calendar.get(iArr[0]) - actualMinimum;
                z3 = i9 > (actualMaximum - actualMinimum) / 2;
                i2 = i9;
            }
            if (i2 != 0) {
                calendar.set(iArr[c], calendar.get(iArr[c]) - i2);
            }
        }
        throw new IllegalArgumentException("The field " + i + " is not supported");
    }

    private static Date e(String str, Locale locale, String[] strArr, boolean z) throws ParseException {
        if (str == null || strArr == null) {
            throw new IllegalArgumentException("Date and Patterns must not be null");
        }
        TimeZone timeZone = TimeZone.getDefault();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        calendar.setLenient(z);
        for (String str2 : strArr) {
            FastDateParser fastDateParser = new FastDateParser(str2, timeZone, locale);
            calendar.clear();
            try {
                if (fastDateParser.parse(str, parsePosition, calendar) && parsePosition.getIndex() == str.length()) {
                    return calendar.getTime();
                }
            } catch (IllegalArgumentException unused) {
            }
            parsePosition.setIndex(0);
        }
        throw new ParseException("Unable to parse the date: " + str, -1);
    }

    private static Date f(Date date, int i, int i2) {
        g(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        calendar.setTime(date);
        calendar.set(i, i2);
        return calendar.getTime();
    }

    private static void g(Date date) {
        Validate.isTrue(date != null, "The date must not be null", new Object[0]);
    }

    public static long getFragmentInDays(Date date, int i) {
        return c(date, i, TimeUnit.DAYS);
    }

    public static long getFragmentInHours(Date date, int i) {
        return c(date, i, TimeUnit.HOURS);
    }

    public static long getFragmentInMilliseconds(Date date, int i) {
        return c(date, i, TimeUnit.MILLISECONDS);
    }

    public static long getFragmentInMinutes(Date date, int i) {
        return c(date, i, TimeUnit.MINUTES);
    }

    public static long getFragmentInSeconds(Date date, int i) {
        return c(date, i, TimeUnit.SECONDS);
    }

    public static boolean isSameDay(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return isSameDay(calendar, calendar2);
    }

    public static boolean isSameInstant(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return date.getTime() == date2.getTime();
    }

    public static boolean isSameLocalTime(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.get(14) == calendar2.get(14) && calendar.get(13) == calendar2.get(13) && calendar.get(12) == calendar2.get(12) && calendar.get(11) == calendar2.get(11) && calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1) && calendar.get(0) == calendar2.get(0) && calendar.getClass() == calendar2.getClass();
    }

    public static Iterator<Calendar> iterator(Date date, int i) {
        g(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return iterator(calendar, i);
    }

    public static Date parseDate(String str, String... strArr) throws ParseException {
        return parseDate(str, null, strArr);
    }

    public static Date parseDateStrictly(String str, String... strArr) throws ParseException {
        return parseDateStrictly(str, null, strArr);
    }

    public static Date round(Date date, int i) {
        g(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        d(calendar, i, b.ROUND);
        return calendar.getTime();
    }

    public static Date setDays(Date date, int i) {
        return f(date, 5, i);
    }

    public static Date setHours(Date date, int i) {
        return f(date, 11, i);
    }

    public static Date setMilliseconds(Date date, int i) {
        return f(date, 14, i);
    }

    public static Date setMinutes(Date date, int i) {
        return f(date, 12, i);
    }

    public static Date setMonths(Date date, int i) {
        return f(date, 2, i);
    }

    public static Date setSeconds(Date date, int i) {
        return f(date, 13, i);
    }

    public static Date setYears(Date date, int i) {
        return f(date, 1, i);
    }

    public static Calendar toCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Date truncate(Date date, int i) {
        g(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        d(calendar, i, b.TRUNCATE);
        return calendar.getTime();
    }

    public static int truncatedCompareTo(Calendar calendar, Calendar calendar2, int i) {
        return truncate(calendar, i).compareTo(truncate(calendar2, i));
    }

    public static boolean truncatedEquals(Calendar calendar, Calendar calendar2, int i) {
        return truncatedCompareTo(calendar, calendar2, i) == 0;
    }

    public static long getFragmentInDays(Calendar calendar, int i) {
        return b(calendar, i, TimeUnit.DAYS);
    }

    public static long getFragmentInHours(Calendar calendar, int i) {
        return b(calendar, i, TimeUnit.HOURS);
    }

    public static long getFragmentInMilliseconds(Calendar calendar, int i) {
        return b(calendar, i, TimeUnit.MILLISECONDS);
    }

    public static long getFragmentInMinutes(Calendar calendar, int i) {
        return b(calendar, i, TimeUnit.MINUTES);
    }

    public static long getFragmentInSeconds(Calendar calendar, int i) {
        return b(calendar, i, TimeUnit.SECONDS);
    }

    public static Date parseDate(String str, Locale locale, String... strArr) throws ParseException {
        return e(str, locale, strArr, true);
    }

    public static Date parseDateStrictly(String str, Locale locale, String... strArr) throws ParseException {
        return e(str, locale, strArr, false);
    }

    public static boolean truncatedEquals(Date date, Date date2, int i) {
        return truncatedCompareTo(date, date2, i) == 0;
    }

    public static boolean isSameInstant(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.getTime().getTime() == calendar2.getTime().getTime();
    }

    public static Calendar toCalendar(Date date, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date);
        return calendar;
    }

    public static int truncatedCompareTo(Date date, Date date2, int i) {
        return truncate(date, i).compareTo(truncate(date2, i));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e A[LOOP:0: B:29:0x0078->B:31:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088 A[LOOP:1: B:32:0x0082->B:34:0x0088, LOOP_END] */
    public static Iterator<Calendar> iterator(Calendar calendar, int i) {
        Calendar calendarTruncate;
        Calendar calendarTruncate2;
        int i2;
        if (calendar != null) {
            int i3 = 2;
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                    calendarTruncate = truncate(calendar, 5);
                    calendarTruncate2 = truncate(calendar, 5);
                    if (i == 2) {
                        i2 = 1;
                    } else if (i == 3) {
                        i3 = calendar.get(7);
                        i2 = i3 - 1;
                    } else if (i != 4) {
                        i2 = 7;
                        i3 = 1;
                    } else {
                        int i4 = calendar.get(7) - 3;
                        i2 = calendar.get(7) + 3;
                        i3 = i4;
                    }
                    if (i3 < 1) {
                        i3 += 7;
                    }
                    if (i3 > 7) {
                        i3 -= 7;
                    }
                    if (i2 < 1) {
                        i2 += 7;
                    }
                    if (i2 > 7) {
                        i2 -= 7;
                    }
                    while (calendarTruncate.get(7) != i3) {
                        calendarTruncate.add(5, -1);
                    }
                    while (calendarTruncate2.get(7) != i2) {
                        calendarTruncate2.add(5, 1);
                    }
                    return new a(calendarTruncate, calendarTruncate2);
                case 5:
                case 6:
                    Calendar calendarTruncate3 = truncate(calendar, 2);
                    Calendar calendar2 = (Calendar) calendarTruncate3.clone();
                    calendar2.add(2, 1);
                    calendar2.add(5, -1);
                    if (i == 6) {
                        calendarTruncate2 = calendar2;
                        calendarTruncate = calendarTruncate3;
                        i2 = 1;
                    } else {
                        calendarTruncate2 = calendar2;
                        i3 = 1;
                        calendarTruncate = calendarTruncate3;
                        i2 = 7;
                    }
                    if (i3 < 1) {
                        i3 += 7;
                    }
                    if (i3 > 7) {
                        i3 -= 7;
                    }
                    if (i2 < 1) {
                        i2 += 7;
                    }
                    if (i2 > 7) {
                        i2 -= 7;
                    }
                    while (calendarTruncate.get(7) != i3) {
                        calendarTruncate.add(5, -1);
                    }
                    while (calendarTruncate2.get(7) != i2) {
                        calendarTruncate2.add(5, 1);
                    }
                    return new a(calendarTruncate, calendarTruncate2);
                default:
                    throw new IllegalArgumentException("The range style " + i + " is not valid.");
            }
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Calendar ceiling(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            d(calendar2, i, b.CEILING);
            return calendar2;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Calendar round(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            d(calendar2, i, b.ROUND);
            return calendar2;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Calendar truncate(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            d(calendar2, i, b.TRUNCATE);
            return calendar2;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static boolean isSameDay(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static Date ceiling(Object obj, int i) {
        if (obj != null) {
            if (obj instanceof Date) {
                return ceiling((Date) obj, i);
            }
            if (obj instanceof Calendar) {
                return ceiling((Calendar) obj, i).getTime();
            }
            throw new ClassCastException("Could not find ceiling of for type: " + obj.getClass());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Date round(Object obj, int i) {
        if (obj != null) {
            if (obj instanceof Date) {
                return round((Date) obj, i);
            }
            if (obj instanceof Calendar) {
                return round((Calendar) obj, i).getTime();
            }
            throw new ClassCastException("Could not round " + obj);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Date truncate(Object obj, int i) {
        if (obj != null) {
            if (obj instanceof Date) {
                return truncate((Date) obj, i);
            }
            if (obj instanceof Calendar) {
                return truncate((Calendar) obj, i).getTime();
            }
            throw new ClassCastException("Could not truncate " + obj);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Iterator<?> iterator(Object obj, int i) {
        if (obj != null) {
            if (obj instanceof Date) {
                return iterator((Date) obj, i);
            }
            if (obj instanceof Calendar) {
                return iterator((Calendar) obj, i);
            }
            throw new ClassCastException("Could not iterate based on " + obj);
        }
        throw new IllegalArgumentException("The date must not be null");
    }
}
