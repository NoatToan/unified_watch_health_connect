package org.apache.commons.lang.time;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import org.apache.commons.lang.StringUtils;

/* JADX INFO: loaded from: classes23.dex */
public class DateUtils {
    public static final int MILLIS_IN_DAY = 86400000;
    public static final int MILLIS_IN_HOUR = 3600000;
    public static final int MILLIS_IN_MINUTE = 60000;
    public static final int MILLIS_IN_SECOND = 1000;
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
    public static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("GMT");
    private static final int[][] a = {new int[]{14}, new int[]{13}, new int[]{12}, new int[]{11, 10}, new int[]{5, 5, 9}, new int[]{2, 1001}, new int[]{1}, new int[]{0}};
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;

    public static class a implements Iterator {
        private final Calendar a;
        private final Calendar b;

        public a(Calendar calendar, Calendar calendar2) {
            this.a = calendar2;
            this.b = calendar;
            calendar.add(5, -1);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b.before(this.a);
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.b.equals(this.a)) {
                throw new NoSuchElementException();
            }
            this.b.add(5, 1);
            return this.b.clone();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    private static long a(Calendar calendar, int i, int i2) {
        long j;
        if (calendar == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        long jC = c(i2);
        long j2 = 0;
        if (i != 1) {
            if (i == 2) {
                j = (((long) calendar.get(5)) * 86400000) / jC;
            }
            if (i != 1 || i == 2 || i == 5 || i == 6) {
                j2 += (((long) calendar.get(11)) * 3600000) / jC;
            } else {
                switch (i) {
                    case 11:
                        break;
                    case 12:
                        j2 += (((long) calendar.get(13)) * 1000) / jC;
                    case 13:
                        return j2 + (((long) (calendar.get(14) * 1)) / jC);
                    case 14:
                        return j2;
                    default:
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("The fragment ");
                        stringBuffer.append(i);
                        stringBuffer.append(" is not supported");
                        throw new IllegalArgumentException(stringBuffer.toString());
                }
            }
            j2 += (((long) calendar.get(12)) * 60000) / jC;
            j2 += (((long) calendar.get(13)) * 1000) / jC;
            return j2 + (((long) (calendar.get(14) * 1)) / jC);
        }
        j = (((long) calendar.get(6)) * 86400000) / jC;
        j2 = 0 + j;
        if (i != 1) {
            j2 += (((long) calendar.get(11)) * 3600000) / jC;
            j2 += (((long) calendar.get(12)) * 60000) / jC;
            j2 += (((long) calendar.get(13)) * 1000) / jC;
        } else {
            j2 += (((long) calendar.get(11)) * 3600000) / jC;
            j2 += (((long) calendar.get(12)) * 60000) / jC;
            j2 += (((long) calendar.get(13)) * 1000) / jC;
        }
        return j2 + (((long) (calendar.get(14) * 1)) / jC);
    }

    public static Date add(Date date, int i, int i2) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(i, i2);
        return calendar.getTime();
    }

    public static Date addDays(Date date, int i) {
        return add(date, 5, i);
    }

    public static Date addHours(Date date, int i) {
        return add(date, 11, i);
    }

    public static Date addMilliseconds(Date date, int i) {
        return add(date, 14, i);
    }

    public static Date addMinutes(Date date, int i) {
        return add(date, 12, i);
    }

    public static Date addMonths(Date date, int i) {
        return add(date, 2, i);
    }

    public static Date addSeconds(Date date, int i) {
        return add(date, 13, i);
    }

    public static Date addWeeks(Date date, int i) {
        return add(date, 3, i);
    }

    public static Date addYears(Date date, int i) {
        return add(date, 1, i);
    }

    private static long b(Date date, int i, int i2) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return a(calendar, i, i2);
    }

    private static long c(int i) {
        if (i == 5 || i == 6) {
            return 86400000L;
        }
        switch (i) {
            case 11:
                return 3600000L;
            case 12:
                return 60000L;
            case 13:
                return 1000L;
            case 14:
                return 1L;
            default:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("The unit ");
                stringBuffer.append(i);
                stringBuffer.append(" cannot be represented is milleseconds");
                throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public static Date ceiling(Date date, int i) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        e(calendar, i, 2);
        return calendar.getTime();
    }

    private static int d(String str, int i) {
        int iIndexOf = StringUtils.indexOf(str, '+', i);
        return iIndexOf < 0 ? StringUtils.indexOf(str, '-', i) : iIndexOf;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00ec A[PHI: r6
      0x00ec: PHI (r6v11 int) = (r6v8 int), (r6v26 int) binds: [B:73:0x00ea, B:65:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ee A[PHI: r6
      0x00ee: PHI (r6v23 int) = (r6v8 int), (r6v26 int) binds: [B:73:0x00ea, B:65:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    private static void e(Calendar calendar, int i, int i2) {
        int[][] iArr;
        int i3;
        boolean z;
        boolean z2;
        if (calendar.get(1) > 280000000) {
            throw new ArithmeticException("Calendar value too large for accurate calculations");
        }
        if (i == 14) {
            return;
        }
        Date time = calendar.getTime();
        long time2 = time.getTime();
        int i4 = calendar.get(14);
        if (i2 == 0 || i4 < 500) {
            time2 -= (long) i4;
        }
        boolean z3 = i == 13;
        int i5 = calendar.get(13);
        if (!z3 && (i2 == 0 || i5 < 30)) {
            time2 -= ((long) i5) * 1000;
        }
        if (i == 12) {
            z3 = true;
        }
        int i6 = calendar.get(12);
        if (!z3 && (i2 == 0 || i6 < 30)) {
            time2 -= ((long) i6) * 60000;
        }
        if (time.getTime() != time2) {
            time.setTime(time2);
            calendar.setTime(time);
        }
        int i7 = 0;
        boolean z4 = false;
        while (i7 < a.length) {
            int i8 = 0;
            while (true) {
                iArr = a;
                if (i8 < iArr[i7].length) {
                    if (iArr[i7][i8] == i) {
                        if (i2 == 2 || (i2 == 1 && z4)) {
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
                                calendar.add(iArr[i7][0], 1);
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
                    i8++;
                }
            }
            if (i != 9) {
                if (i == 1001 && iArr[i7][0] == 5) {
                    i3 = calendar.get(5) - 1;
                    if (i3 >= 15) {
                        i3 -= 15;
                    }
                    if (i3 > 7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = true;
                } else {
                    z = z4;
                    i3 = 0;
                    z2 = false;
                }
            } else if (iArr[i7][0] == 11) {
                i3 = calendar.get(11);
                if (i3 >= 12) {
                    i3 -= 12;
                }
                if (i3 >= 6) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = true;
            } else {
                z = z4;
                i3 = 0;
                z2 = false;
            }
            if (!z2) {
                int actualMinimum = calendar.getActualMinimum(iArr[i7][0]);
                int actualMaximum = calendar.getActualMaximum(iArr[i7][0]);
                int i9 = calendar.get(iArr[i7][0]) - actualMinimum;
                z = i9 > (actualMaximum - actualMinimum) / 2;
                i3 = i9;
            }
            if (i3 != 0) {
                calendar.set(iArr[i7][0], calendar.get(iArr[i7][0]) - i3);
            }
            i7++;
            z4 = z;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("The field ");
        stringBuffer.append(i);
        stringBuffer.append(" is not supported");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    private static Date f(String str, String[] strArr, boolean z) throws ParseException {
        String strG;
        if (str == null || strArr == null) {
            throw new IllegalArgumentException("Date and Patterns must not be null");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.setLenient(z);
        ParsePosition parsePosition = new ParsePosition(0);
        for (int i = 0; i < strArr.length; i++) {
            String strSubstring = strArr[i];
            if (strArr[i].endsWith("ZZ")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            simpleDateFormat.applyPattern(strSubstring);
            parsePosition.setIndex(0);
            if (strArr[i].endsWith("ZZ")) {
                int iD = d(str, 0);
                strG = str;
                while (iD >= 0) {
                    strG = g(strG, iD);
                    iD = d(strG, iD + 1);
                }
            } else {
                strG = str;
            }
            Date date = simpleDateFormat.parse(strG, parsePosition);
            if (date != null && parsePosition.getIndex() == strG.length()) {
                return date;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unable to parse the date: ");
        stringBuffer.append(str);
        throw new ParseException(stringBuffer.toString(), -1);
    }

    private static String g(String str, int i) {
        int i2;
        if (i < 0 || (i2 = i + 5) >= str.length() || !Character.isDigit(str.charAt(i + 1)) || !Character.isDigit(str.charAt(i + 2))) {
            return str;
        }
        int i3 = i + 3;
        if (str.charAt(i3) != ':') {
            return str;
        }
        int i4 = i + 4;
        if (!Character.isDigit(str.charAt(i4)) || !Character.isDigit(str.charAt(i2))) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str.substring(0, i3));
        stringBuffer.append(str.substring(i4));
        return stringBuffer.toString();
    }

    public static long getFragmentInDays(Date date, int i) {
        return b(date, i, 6);
    }

    public static long getFragmentInHours(Date date, int i) {
        return b(date, i, 11);
    }

    public static long getFragmentInMilliseconds(Date date, int i) {
        return b(date, i, 14);
    }

    public static long getFragmentInMinutes(Date date, int i) {
        return b(date, i, 12);
    }

    public static long getFragmentInSeconds(Date date, int i) {
        return b(date, i, 13);
    }

    private static Date h(Date date, int i, int i2) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        calendar.setTime(date);
        calendar.set(i, i2);
        return calendar.getTime();
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
        return calendar.get(14) == calendar2.get(14) && calendar.get(13) == calendar2.get(13) && calendar.get(12) == calendar2.get(12) && calendar.get(10) == calendar2.get(10) && calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1) && calendar.get(0) == calendar2.get(0) && calendar.getClass() == calendar2.getClass();
    }

    public static Iterator iterator(Date date, int i) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return iterator(calendar, i);
    }

    public static Date parseDate(String str, String[] strArr) throws ParseException {
        return f(str, strArr, true);
    }

    public static Date parseDateStrictly(String str, String[] strArr) throws ParseException {
        return f(str, strArr, false);
    }

    public static Date round(Date date, int i) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        e(calendar, i, 1);
        return calendar.getTime();
    }

    public static Date setDays(Date date, int i) {
        return h(date, 5, i);
    }

    public static Date setHours(Date date, int i) {
        return h(date, 11, i);
    }

    public static Date setMilliseconds(Date date, int i) {
        return h(date, 14, i);
    }

    public static Date setMinutes(Date date, int i) {
        return h(date, 12, i);
    }

    public static Date setMonths(Date date, int i) {
        return h(date, 2, i);
    }

    public static Date setSeconds(Date date, int i) {
        return h(date, 13, i);
    }

    public static Date setYears(Date date, int i) {
        return h(date, 1, i);
    }

    public static Calendar toCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static Date truncate(Date date, int i) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        e(calendar, i, 0);
        return calendar.getTime();
    }

    public static int truncatedCompareTo(Calendar calendar, Calendar calendar2, int i) {
        return truncate(calendar, i).getTime().compareTo(truncate(calendar2, i).getTime());
    }

    public static boolean truncatedEquals(Calendar calendar, Calendar calendar2, int i) {
        return truncatedCompareTo(calendar, calendar2, i) == 0;
    }

    public static long getFragmentInDays(Calendar calendar, int i) {
        return a(calendar, i, 6);
    }

    public static long getFragmentInHours(Calendar calendar, int i) {
        return a(calendar, i, 11);
    }

    public static long getFragmentInMilliseconds(Calendar calendar, int i) {
        return a(calendar, i, 14);
    }

    public static long getFragmentInMinutes(Calendar calendar, int i) {
        return a(calendar, i, 12);
    }

    public static long getFragmentInSeconds(Calendar calendar, int i) {
        return a(calendar, i, 13);
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

    public static int truncatedCompareTo(Date date, Date date2, int i) {
        return truncate(date, i).compareTo(truncate(date2, i));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[LOOP:0: B:29:0x0077->B:31:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087 A[LOOP:1: B:32:0x0081->B:34:0x0087, LOOP_END] */
    public static Iterator iterator(Calendar calendar, int i) {
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
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("The range style ");
                    stringBuffer.append(i);
                    stringBuffer.append(" is not valid.");
                    throw new IllegalArgumentException(stringBuffer.toString());
            }
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Calendar ceiling(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            e(calendar2, i, 2);
            return calendar2;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Calendar round(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            e(calendar2, i, 1);
            return calendar2;
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Calendar truncate(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            e(calendar2, i, 0);
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
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not find ceiling of for type: ");
            stringBuffer.append(obj.getClass());
            throw new ClassCastException(stringBuffer.toString());
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
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not round ");
            stringBuffer.append(obj);
            throw new ClassCastException(stringBuffer.toString());
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
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not truncate ");
            stringBuffer.append(obj);
            throw new ClassCastException(stringBuffer.toString());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static Iterator iterator(Object obj, int i) {
        if (obj != null) {
            if (obj instanceof Date) {
                return iterator((Date) obj, i);
            }
            if (obj instanceof Calendar) {
                return iterator((Calendar) obj, i);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not iterate based on ");
            stringBuffer.append(obj);
            throw new ClassCastException(stringBuffer.toString());
        }
        throw new IllegalArgumentException("The date must not be null");
    }
}
