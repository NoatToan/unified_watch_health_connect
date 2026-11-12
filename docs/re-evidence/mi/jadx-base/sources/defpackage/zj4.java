package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public class zj4 {
    public static TimeZone d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static TreeMap<String, Integer> f41334a = new TreeMap<>(new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static TreeMap<String, Integer> f41335b = new TreeMap<>(new a());
    public static HashSet<String> c = new HashSet<>();
    public static TreeMap<String, TimeZone> e = new TreeMap<>();

    public static class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    static {
        c.add("à");
        c.add("at");
        c.add("MEZ");
        c.add("Uhr");
        c.add("h");
        c.add("pm");
        c.add("PM");
        c.add("am");
        c.add("AM");
        c.add("min");
        c.add("um");
        c.add("o'clock");
        for (String str : TimeZone.getAvailableIDs()) {
            e.put(str, TimeZone.getTimeZone(str));
        }
        for (Locale locale : DateFormatSymbols.getAvailableLocales()) {
            if (!"ja".equals(locale.getLanguage()) && !"ko".equals(locale.getLanguage()) && !"zh".equals(locale.getLanguage())) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                String[] months = dateFormatSymbols.getMonths();
                for (int i = 0; i < months.length; i++) {
                    if (months[i].length() != 0) {
                        d(f41334a, months[i], Integer.valueOf(i));
                    }
                }
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                for (int i2 = 0; i2 < shortMonths.length; i2++) {
                    String str2 = shortMonths[i2];
                    if (str2.length() != 0 && !Character.isDigit(str2.charAt(str2.length() - 1))) {
                        d(f41334a, shortMonths[i2], Integer.valueOf(i2));
                        d(f41334a, shortMonths[i2].replace(".", ""), Integer.valueOf(i2));
                    }
                }
                String[] weekdays = dateFormatSymbols.getWeekdays();
                for (int i3 = 0; i3 < weekdays.length; i3++) {
                    String str3 = weekdays[i3];
                    if (str3.length() != 0) {
                        d(f41335b, str3, Integer.valueOf(i3));
                        d(f41335b, str3.replace(".", ""), Integer.valueOf(i3));
                    }
                }
                String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
                for (int i4 = 0; i4 < shortWeekdays.length; i4++) {
                    String str4 = shortWeekdays[i4];
                    if (str4.length() != 0) {
                        d(f41335b, str4, Integer.valueOf(i4));
                        d(f41335b, str4.replace(".", ""), Integer.valueOf(i4));
                    }
                }
            }
        }
    }

    public static Date a(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        if (str == null) {
            if (!stringTokenizer.hasMoreTokens()) {
                return calendar.getTime();
            }
            str = stringTokenizer.nextToken();
        }
        return b(stringTokenizer, calendar, str);
    }

    public static Date b(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        String strK;
        String strK2;
        String strK3;
        calendar.set(11, Integer.parseInt(k(stringTokenizer, str, calendar)));
        if (stringTokenizer.hasMoreTokens() && (strK = k(stringTokenizer, stringTokenizer.nextToken(), calendar)) != null) {
            calendar.set(12, Integer.parseInt(strK));
            if (stringTokenizer.hasMoreTokens() && (strK2 = k(stringTokenizer, stringTokenizer.nextToken(), calendar)) != null) {
                calendar.set(13, Integer.parseInt(strK2));
                if (stringTokenizer.hasMoreTokens() && (strK3 = k(stringTokenizer, stringTokenizer.nextToken(), calendar)) != null) {
                    String strK4 = k(stringTokenizer, strK3, calendar);
                    if (strK4.length() == 4 && Character.isDigit(strK4.charAt(0))) {
                        calendar.set(1, h(strK4));
                    }
                    return calendar.getTime();
                }
                return calendar.getTime();
            }
            return calendar.getTime();
        }
        return calendar.getTime();
    }

    public static Date c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            throw new RuntimeException("Primitive: Can not convert " + obj.getClass().getName() + " to int");
        }
        StringTokenizer stringTokenizer = new StringTokenizer(((String) obj).replace("p.m.", "pm").replace("a.m.", "am"), " -/:,.+年月日曜時分秒");
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        String strNextToken = stringTokenizer.nextToken();
        if (strNextToken.length() == 4 && Character.isDigit(strNextToken.charAt(0))) {
            return g(stringTokenizer, strNextToken);
        }
        if (f41335b.containsKey(strNextToken)) {
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            strNextToken = stringTokenizer.nextToken();
        }
        if (f41334a.containsKey(strNextToken)) {
            return f(stringTokenizer, strNextToken);
        }
        if (Character.isDigit(strNextToken.charAt(0))) {
            return e(stringTokenizer, strNextToken);
        }
        return null;
    }

    public static void d(TreeMap<String, Integer> treeMap, String str, Integer num) {
        treeMap.put(str, num);
        treeMap.put(str.replace("é", PluginDeviceInfo.FICONOFFLINE).replace("û", "u"), num);
    }

    public static Date e(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar gregorianCalendarI = i();
        gregorianCalendarI.set(5, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        gregorianCalendarI.set(2, j(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        gregorianCalendarI.set(1, h(stringTokenizer.nextToken()));
        return a(stringTokenizer, gregorianCalendarI, null);
    }

    public static Date f(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar gregorianCalendarI = i();
        Integer num = f41334a.get(str);
        if (num == null) {
            throw new NullPointerException("can not parse " + str + " as month");
        }
        gregorianCalendarI.set(2, num.intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        gregorianCalendarI.set(5, Integer.parseInt(stringTokenizer.nextToken()));
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        String strNextToken = stringTokenizer.nextToken();
        if (Character.isLetter(strNextToken.charAt(0))) {
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            strNextToken = stringTokenizer.nextToken();
        }
        if (strNextToken.length() == 4) {
            gregorianCalendarI.set(1, h(strNextToken));
        } else if (strNextToken.length() == 2) {
            return b(stringTokenizer, gregorianCalendarI, strNextToken);
        }
        return a(stringTokenizer, gregorianCalendarI, null);
    }

    public static Date g(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar gregorianCalendarI = i();
        gregorianCalendarI.set(1, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return gregorianCalendarI.getTime();
        }
        gregorianCalendarI.set(2, j(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return gregorianCalendarI.getTime();
        }
        String strNextToken = stringTokenizer.nextToken();
        if (!Character.isDigit(strNextToken.charAt(0))) {
            return gregorianCalendarI.getTime();
        }
        if (strNextToken.length() == 5 && strNextToken.charAt(2) == 'T') {
            gregorianCalendarI.set(5, Integer.parseInt(strNextToken.substring(0, 2)));
            return a(stringTokenizer, gregorianCalendarI, strNextToken.substring(3));
        }
        gregorianCalendarI.set(5, Integer.parseInt(strNextToken));
        return a(stringTokenizer, gregorianCalendarI, null);
    }

    public static int h(String str) {
        int i = Integer.parseInt(str);
        if (i < 100) {
            return i > 30 ? i + 2000 : i + 1900;
        }
        return i;
    }

    public static GregorianCalendar i() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2000, 0, 0, 0, 0, 0);
        TimeZone timeZone = d;
        if (timeZone != null) {
            gregorianCalendar.setTimeZone(timeZone);
        }
        TimeZone timeZone2 = gregorianCalendar.getTimeZone();
        if (timeZone2 == null) {
            timeZone2 = TimeZone.getDefault();
        }
        gregorianCalendar.setTimeInMillis(-timeZone2.getRawOffset());
        return gregorianCalendar;
    }

    public static Integer j(String str) {
        if (Character.isDigit(str.charAt(0))) {
            return Integer.valueOf(Integer.parseInt(str) - 1);
        }
        Integer num = f41334a.get(str);
        if (num != null) {
            return num;
        }
        throw new NullPointerException("can not parse " + str + " as month");
    }

    public static String k(StringTokenizer stringTokenizer, String str, Calendar calendar) {
        while (true) {
            TimeZone timeZone = e.get(str);
            if (timeZone != null) {
                calendar.setTimeZone(timeZone);
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            } else {
                if (!c.contains(str)) {
                    return str;
                }
                if (str.equalsIgnoreCase("pm")) {
                    calendar.add(9, 1);
                }
                if (str.equalsIgnoreCase("am")) {
                    calendar.add(9, 0);
                }
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            }
        }
    }
}
