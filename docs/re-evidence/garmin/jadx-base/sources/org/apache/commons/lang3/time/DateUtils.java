package org.apache.commons.lang3.time;

import c22.t;
import com.mapbox.maps.p;
import i3.e5;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.e;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
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
    private static final int[][] fields = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, 1001}, new int[]{1}, new int[]{0}};

    public static class DateIterator implements Iterator<Calendar> {
        private final Calendar endFinal;
        private final Calendar spot;

        public DateIterator(Calendar calendar, Calendar calendar2) {
            this.endFinal = calendar2;
            this.spot = calendar;
            calendar.add(5, -1);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.spot.before(this.endFinal);
        }

        @Override // java.util.Iterator
        public Calendar next() {
            if (this.spot.equals(this.endFinal)) {
                t.g();
                return null;
            }
            this.spot.add(5, 1);
            return (Calendar) this.spot.clone();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public enum ModifyType {
        TRUNCATE,
        ROUND,
        CEILING
    }

    private static Date add(Date date, int i14, int i15) {
        validateDateNotNull(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(i14, i15);
        return calendar.getTime();
    }

    public static Date addDays(Date date, int i14) {
        return add(date, 5, i14);
    }

    public static Date addHours(Date date, int i14) {
        return add(date, 11, i14);
    }

    public static Date addMilliseconds(Date date, int i14) {
        return add(date, 14, i14);
    }

    public static Date addMinutes(Date date, int i14) {
        return add(date, 12, i14);
    }

    public static Date addMonths(Date date, int i14) {
        return add(date, 2, i14);
    }

    public static Date addSeconds(Date date, int i14) {
        return add(date, 13, i14);
    }

    public static Date addWeeks(Date date, int i14) {
        return add(date, 3, i14);
    }

    public static Date addYears(Date date, int i14) {
        return add(date, 1, i14);
    }

    public static Date ceiling(Object obj, int i14) {
        if (obj == null) {
            throw nullDateIllegalArgumentException();
        }
        if (obj instanceof Date) {
            return ceiling((Date) obj, i14);
        }
        if (obj instanceof Calendar) {
            return ceiling((Calendar) obj, i14).getTime();
        }
        throw new ClassCastException("Could not find ceiling of for type: " + obj.getClass());
    }

    private static long getFragment(Calendar calendar, int i14, TimeUnit timeUnit) {
        long jConvert;
        if (calendar == null) {
            throw nullDateIllegalArgumentException();
        }
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        int i15 = timeUnit == timeUnit2 ? 0 : 1;
        if (i14 != 1) {
            jConvert = i14 != 2 ? 0L : timeUnit.convert(calendar.get(5) - i15, timeUnit2);
        } else {
            jConvert = timeUnit.convert(calendar.get(6) - i15, timeUnit2);
        }
        if (i14 == 1 || i14 == 2 || i14 == 5 || i14 == 6) {
            jConvert += timeUnit.convert(calendar.get(11), TimeUnit.HOURS);
        } else {
            switch (i14) {
                case 11:
                    break;
                case 12:
                    jConvert += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
                case 13:
                    return timeUnit.convert(calendar.get(14), TimeUnit.MILLISECONDS) + jConvert;
                case 14:
                    return jConvert;
                default:
                    h.s(e0.f(i14, "The fragment ", " is not supported"));
                    return 0L;
            }
        }
        jConvert += timeUnit.convert(calendar.get(12), TimeUnit.MINUTES);
        jConvert += timeUnit.convert(calendar.get(13), TimeUnit.SECONDS);
        return timeUnit.convert(calendar.get(14), TimeUnit.MILLISECONDS) + jConvert;
    }

    public static long getFragmentInDays(Date date, int i14) {
        return getFragment(date, i14, TimeUnit.DAYS);
    }

    public static long getFragmentInHours(Date date, int i14) {
        return getFragment(date, i14, TimeUnit.HOURS);
    }

    public static long getFragmentInMilliseconds(Date date, int i14) {
        return getFragment(date, i14, TimeUnit.MILLISECONDS);
    }

    public static long getFragmentInMinutes(Date date, int i14) {
        return getFragment(date, i14, TimeUnit.MINUTES);
    }

    public static long getFragmentInSeconds(Date date, int i14) {
        return getFragment(date, i14, TimeUnit.SECONDS);
    }

    public static boolean isSameDay(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw nullDateIllegalArgumentException();
        }
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static boolean isSameInstant(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw nullDateIllegalArgumentException();
        }
        return calendar.getTime().getTime() == calendar2.getTime().getTime();
    }

    public static boolean isSameLocalTime(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw nullDateIllegalArgumentException();
        }
        return calendar.get(14) == calendar2.get(14) && calendar.get(13) == calendar2.get(13) && calendar.get(12) == calendar2.get(12) && calendar.get(11) == calendar2.get(11) && calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1) && calendar.get(0) == calendar2.get(0) && calendar.getClass() == calendar2.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[LOOP:0: B:30:0x0067->B:32:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0077 A[LOOP:1: B:33:0x0071->B:35:0x0077, LOOP_END] */
    public static Iterator<Calendar> iterator(Calendar calendar, int i14) {
        Calendar calendarTruncate;
        Calendar calendarTruncate2;
        int i15;
        if (calendar == null) {
            throw nullDateIllegalArgumentException();
        }
        int i16 = 2;
        i16 = 1;
        switch (i14) {
            case 1:
            case 2:
            case 3:
            case 4:
                calendarTruncate = truncate(calendar, 5);
                calendarTruncate2 = truncate(calendar, 5);
                if (i14 == 2) {
                    i15 = 1;
                } else if (i14 == 3) {
                    i16 = calendar.get(7);
                    i15 = i16 - 1;
                } else if (i14 != 4) {
                    i15 = 7;
                } else {
                    int i17 = calendar.get(7) - 3;
                    i15 = calendar.get(7) + 3;
                    i16 = i17;
                }
                if (i16 < 1) {
                    i16 += 7;
                }
                if (i16 > 7) {
                    i16 -= 7;
                }
                if (i15 < 1) {
                    i15 += 7;
                }
                if (i15 > 7) {
                    i15 -= 7;
                }
                while (calendarTruncate.get(7) != i16) {
                    calendarTruncate.add(5, -1);
                }
                while (calendarTruncate2.get(7) != i15) {
                    calendarTruncate2.add(5, 1);
                }
                return new DateIterator(calendarTruncate, calendarTruncate2);
            case 5:
            case 6:
                Calendar calendarTruncate3 = truncate(calendar, 2);
                Calendar calendar2 = (Calendar) calendarTruncate3.clone();
                calendar2.add(2, 1);
                calendar2.add(5, -1);
                if (i14 == 6) {
                    calendarTruncate2 = calendar2;
                    calendarTruncate = calendarTruncate3;
                    i15 = 1;
                    if (i16 < 1) {
                        i16 += 7;
                    }
                    if (i16 > 7) {
                        i16 -= 7;
                    }
                    if (i15 < 1) {
                        i15 += 7;
                    }
                    if (i15 > 7) {
                        i15 -= 7;
                    }
                    while (calendarTruncate.get(7) != i16) {
                        calendarTruncate.add(5, -1);
                    }
                    while (calendarTruncate2.get(7) != i15) {
                        calendarTruncate2.add(5, 1);
                    }
                    return new DateIterator(calendarTruncate, calendarTruncate2);
                }
                calendarTruncate2 = calendar2;
                calendarTruncate = calendarTruncate3;
                i15 = 7;
                if (i16 < 1) {
                    i16 += 7;
                }
                if (i16 > 7) {
                    i16 -= 7;
                }
                if (i15 < 1) {
                    i15 += 7;
                }
                if (i15 > 7) {
                    i15 -= 7;
                }
                while (calendarTruncate.get(7) != i16) {
                    calendarTruncate.add(5, -1);
                }
                while (calendarTruncate2.get(7) != i15) {
                    calendarTruncate2.add(5, 1);
                }
                return new DateIterator(calendarTruncate, calendarTruncate2);
            default:
                h.s(e0.f(i14, "The range style ", " is not valid."));
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    private static void modify(Calendar calendar, int i14, ModifyType modifyType) {
        char c14;
        int i15;
        boolean z14;
        if (calendar.get(1) > 280000000) {
            e.u("Calendar value too large for accurate calculations");
            return;
        }
        if (i14 == 14) {
            return;
        }
        Date time = calendar.getTime();
        long time2 = time.getTime();
        int i16 = calendar.get(14);
        ModifyType modifyType2 = ModifyType.TRUNCATE;
        if (modifyType2 == modifyType || i16 < 500) {
            time2 -= (long) i16;
        }
        boolean z15 = i14 == 13;
        int i17 = calendar.get(13);
        if (!z15 && (modifyType2 == modifyType || i17 < 30)) {
            time2 -= ((long) i17) * 1000;
        }
        if (i14 == 12) {
            z15 = true;
        }
        int i18 = calendar.get(12);
        if (!z15 && (modifyType2 == modifyType || i18 < 30)) {
            time2 -= ((long) i18) * 60000;
        }
        if (time.getTime() != time2) {
            time.setTime(time2);
            calendar.setTime(time);
        }
        boolean z16 = false;
        for (int[] iArr : fields) {
            for (int i19 : iArr) {
                if (i19 == i14) {
                    if (modifyType == ModifyType.CEILING || (modifyType == ModifyType.ROUND && z16)) {
                        if (i14 == 1001) {
                            if (calendar.get(5) == 1) {
                                calendar.add(5, 15);
                                return;
                            } else {
                                calendar.add(5, -15);
                                calendar.add(2, 1);
                                return;
                            }
                        }
                        if (i14 != 9) {
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
            if (i14 != 9) {
                if (i14 == 1001 && iArr[0] == 5) {
                    int i24 = calendar.get(5);
                    int i25 = i24 - 1;
                    if (i25 >= 15) {
                        i25 = i24 - 16;
                    }
                    int i26 = i25;
                    z16 = i25 > 7;
                    i15 = i26;
                    z14 = true;
                    c14 = '\f';
                } else {
                    c14 = '\f';
                    i15 = 0;
                    z14 = false;
                }
            } else if (iArr[0] == 11) {
                int i27 = calendar.get(11);
                c14 = '\f';
                if (i27 >= 12) {
                    i27 -= 12;
                }
                int i28 = i27;
                z16 = i28 >= 6;
                i15 = i28;
                z14 = true;
            } else {
                c14 = '\f';
                i15 = 0;
                z14 = false;
            }
            if (!z14) {
                int actualMinimum = calendar.getActualMinimum(iArr[0]);
                int actualMaximum = calendar.getActualMaximum(iArr[0]);
                int i29 = calendar.get(iArr[0]) - actualMinimum;
                z16 = i29 > (actualMaximum - actualMinimum) / 2;
                i15 = i29;
            }
            if (i15 != 0) {
                int i30 = iArr[0];
                calendar.set(i30, calendar.get(i30) - i15);
            }
        }
        h.s(e0.f(i14, "The field ", " is not supported"));
    }

    private static IllegalArgumentException nullDateIllegalArgumentException() {
        return new IllegalArgumentException("The date must not be null");
    }

    public static Date parseDate(String str, String... strArr) {
        return parseDate(str, null, strArr);
    }

    public static Date parseDateStrictly(String str, String... strArr) {
        return parseDateStrictly(str, null, strArr);
    }

    private static Date parseDateWithLeniency(String str, Locale locale, String[] strArr, boolean z14) throws ParseException {
        if (str == null || strArr == null) {
            h.s("Date and Patterns must not be null");
            return null;
        }
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale2 = LocaleUtils.toLocale(locale);
        ParsePosition parsePosition = new ParsePosition(0);
        Calendar calendar = Calendar.getInstance(timeZone, locale2);
        calendar.setLenient(z14);
        for (String str2 : strArr) {
            FastDateParser fastDateParser = new FastDateParser(str2, timeZone, locale2);
            calendar.clear();
            try {
                if (fastDateParser.parse(str, parsePosition, calendar) && parsePosition.getIndex() == str.length()) {
                    return calendar.getTime();
                }
            } catch (IllegalArgumentException unused) {
            }
            parsePosition.setIndex(0);
        }
        p.i(-1, "Unable to parse the date: ".concat(str));
        return null;
    }

    public static Date round(Object obj, int i14) {
        if (obj == null) {
            throw nullDateIllegalArgumentException();
        }
        if (obj instanceof Date) {
            return round((Date) obj, i14);
        }
        if (obj instanceof Calendar) {
            return round((Calendar) obj, i14).getTime();
        }
        throw new ClassCastException(e5.f(obj, "Could not round "));
    }

    private static Date set(Date date, int i14, int i15) {
        validateDateNotNull(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        calendar.setTime(date);
        calendar.set(i14, i15);
        return calendar.getTime();
    }

    public static Date setDays(Date date, int i14) {
        return set(date, 5, i14);
    }

    public static Date setHours(Date date, int i14) {
        return set(date, 11, i14);
    }

    public static Date setMilliseconds(Date date, int i14) {
        return set(date, 14, i14);
    }

    public static Date setMinutes(Date date, int i14) {
        return set(date, 12, i14);
    }

    public static Date setMonths(Date date, int i14) {
        return set(date, 2, i14);
    }

    public static Date setSeconds(Date date, int i14) {
        return set(date, 13, i14);
    }

    public static Date setYears(Date date, int i14) {
        return set(date, 1, i14);
    }

    public static Calendar toCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Date truncate(Object obj, int i14) {
        if (obj == null) {
            throw nullDateIllegalArgumentException();
        }
        if (obj instanceof Date) {
            return truncate((Date) obj, i14);
        }
        if (obj instanceof Calendar) {
            return truncate((Calendar) obj, i14).getTime();
        }
        throw new ClassCastException(e5.f(obj, "Could not truncate "));
    }

    public static int truncatedCompareTo(Calendar calendar, Calendar calendar2, int i14) {
        return truncate(calendar, i14).compareTo(truncate(calendar2, i14));
    }

    public static boolean truncatedEquals(Calendar calendar, Calendar calendar2, int i14) {
        return truncatedCompareTo(calendar, calendar2, i14) == 0;
    }

    private static void validateDateNotNull(Date date) {
        Validate.notNull(date, "date", new Object[0]);
    }

    public static Date parseDate(String str, Locale locale, String... strArr) {
        return parseDateWithLeniency(str, locale, strArr, true);
    }

    public static Date parseDateStrictly(String str, Locale locale, String... strArr) {
        return parseDateWithLeniency(str, locale, strArr, false);
    }

    public static long getFragmentInDays(Calendar calendar, int i14) {
        return getFragment(calendar, i14, TimeUnit.DAYS);
    }

    public static long getFragmentInHours(Calendar calendar, int i14) {
        return getFragment(calendar, i14, TimeUnit.HOURS);
    }

    public static long getFragmentInMilliseconds(Calendar calendar, int i14) {
        return getFragment(calendar, i14, TimeUnit.MILLISECONDS);
    }

    public static long getFragmentInMinutes(Calendar calendar, int i14) {
        return getFragment(calendar, i14, TimeUnit.MINUTES);
    }

    public static long getFragmentInSeconds(Calendar calendar, int i14) {
        return getFragment(calendar, i14, TimeUnit.SECONDS);
    }

    public static Calendar toCalendar(Date date, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date);
        return calendar;
    }

    public static boolean truncatedEquals(Date date, Date date2, int i14) {
        return truncatedCompareTo(date, date2, i14) == 0;
    }

    public static int truncatedCompareTo(Date date, Date date2, int i14) {
        return truncate(date, i14).compareTo(truncate(date2, i14));
    }

    public static boolean isSameInstant(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw nullDateIllegalArgumentException();
        }
        return date.getTime() == date2.getTime();
    }

    public static boolean isSameDay(Date date, Date date2) {
        if (date != null && date2 != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date2);
            return isSameDay(calendar, calendar2);
        }
        throw nullDateIllegalArgumentException();
    }

    public static Calendar round(Calendar calendar, int i14) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            modify(calendar2, i14, ModifyType.ROUND);
            return calendar2;
        }
        throw nullDateIllegalArgumentException();
    }

    public static Calendar truncate(Calendar calendar, int i14) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            modify(calendar2, i14, ModifyType.TRUNCATE);
            return calendar2;
        }
        throw nullDateIllegalArgumentException();
    }

    public static Date round(Date date, int i14) {
        validateDateNotNull(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        modify(calendar, i14, ModifyType.ROUND);
        return calendar.getTime();
    }

    public static Date truncate(Date date, int i14) {
        validateDateNotNull(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        modify(calendar, i14, ModifyType.TRUNCATE);
        return calendar.getTime();
    }

    public static Calendar ceiling(Calendar calendar, int i14) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            modify(calendar2, i14, ModifyType.CEILING);
            return calendar2;
        }
        throw nullDateIllegalArgumentException();
    }

    public static Date ceiling(Date date, int i14) {
        validateDateNotNull(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        modify(calendar, i14, ModifyType.CEILING);
        return calendar.getTime();
    }

    private static long getFragment(Date date, int i14, TimeUnit timeUnit) {
        validateDateNotNull(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getFragment(calendar, i14, timeUnit);
    }

    public static Iterator<Calendar> iterator(Date date, int i14) {
        validateDateNotNull(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return iterator(calendar, i14);
    }

    public static Iterator<?> iterator(Object obj, int i14) {
        if (obj != null) {
            if (obj instanceof Date) {
                return iterator((Date) obj, i14);
            }
            if (obj instanceof Calendar) {
                return iterator((Calendar) obj, i14);
            }
            throw new ClassCastException(e5.f(obj, "Could not iterate based on "));
        }
        throw nullDateIllegalArgumentException();
    }
}
