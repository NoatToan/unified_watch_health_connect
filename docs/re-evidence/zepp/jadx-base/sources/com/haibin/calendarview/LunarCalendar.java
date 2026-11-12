package com.haibin.calendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class LunarCalendar {
    private static String[] a;
    private static String[] b;
    private static String[] c;
    private static String[] d;

    @SuppressLint({"UseSparseArrays"})
    private static final Map<Integer, String[]> e = new HashMap();
    private static String[] f = null;

    @SuppressLint({"UseSparseArrays"})
    private static final Map<Integer, String[]> g = new HashMap();
    private static final int[] h = {19416, 19168, 42352, 21717, 53856, 55632, 91476, 22176, 39632, 21970, 19168, 42422, 42192, 53840, 119381, 46400, 54944, 44450, 38320, 84343, 18800, 42160, 46261, 27216, 27968, 109396, Constants.REQUEST_OLD_QZSHARE, 38256, 21234, 18800, 25958, 54432, 59984, 28309, 23248, Constants.REQUEST_OLD_QZSHARE, 100067, 37600, 116951, 51536, 54432, 120998, 46416, 22176, 107956, 9680, 37584, 53938, 43344, 46423, 27808, 46416, 86869, 19872, 42416, 83315, 21168, 43432, 59728, 27296, 44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46752, 103846, 38320, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 19189, 18800, 25776, 29859, 59984, 27480, 21952, 43872, 38613, 37600, 51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 43344, 46240, 47780, 44368, 21977, 19360, 42416, 86390, 21168, 43312, 31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 23200, 30371, 38608, 19195, 19152, 42192, 118966, 53840, 54560, 56645, 46496, 22224, 21938, 18864, 42359, 42160, 43600, 111189, 27936, 44448, 84835, 37744, 18936, 18800, 25776, 92326, 59984, 27424, 108228, 43744, 41696, 53987, 51552, 54615, 54432, 55888, 23893, 22176, 42704, 21972, 21200, 43448, 43344, 46240, 46758, 44368, 21920, 43940, 42416, 21168, 45683, 26928, 29495, 27296, 44368, 84821, 19296, 42352, 21732, 53600, 59752, 54560, 55968, 92838, 22224, 19168, 43476, 41680, 53584, 62034, 54560};
    public static final /* synthetic */ boolean i = false;

    private static String a(int i2, int i3, int i4) {
        return i2 + e(i3, i4);
    }

    private static String b(int i2, int i3, int i4) {
        Map<Integer, String[]> map = g;
        if (!map.containsKey(Integer.valueOf(i2))) {
            map.put(Integer.valueOf(i2), SolarTermUtil.getSolarTerms(i2));
        }
        String[] strArr = map.get(Integer.valueOf(i2));
        String str = i2 + e(i3, i4);
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return str2.replace(str, "");
            }
        }
        return "";
    }

    private static String c(int i2, int i3, int i4) {
        Map<Integer, String[]> map = e;
        if (!map.containsKey(Integer.valueOf(i2))) {
            map.put(Integer.valueOf(i2), d(i2));
        }
        String[] strArr = map.get(Integer.valueOf(i2));
        String str = i2 + e(i3, i4);
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return str2.replace(str, "");
            }
        }
        return "";
    }

    private static String[] d(int i2) {
        String[] strArr = new String[3];
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i2, 4, 1);
        int i3 = (7 - calendar.get(7)) + 1;
        if (i3 == 7) {
            strArr[0] = a(i2, 5, i3 + 1) + d[0];
        } else {
            strArr[0] = a(i2, 5, i3 + 7 + 1) + d[0];
        }
        calendar.set(i2, 5, 1);
        int i4 = (7 - calendar.get(7)) + 1;
        if (i4 == 7) {
            strArr[1] = a(i2, 6, i4 + 7 + 1) + d[1];
        } else {
            strArr[1] = a(i2, 6, i4 + 7 + 7 + 1) + d[1];
        }
        calendar.set(i2, 10, 1);
        int i5 = (7 - calendar.get(7)) + 1;
        if (i5 <= 2) {
            strArr[2] = a(i2, 11, i5 + 21 + 5) + d[2];
        } else {
            strArr[2] = a(i2, 11, i5 + 14 + 5) + d[2];
        }
        return strArr;
    }

    public static int daysInLunarMonth(int i2, int i3) {
        return (h[i2 + (-1900)] & (65536 >> i3)) == 0 ? 29 : 30;
    }

    private static String e(int i2, int i3) {
        String strValueOf;
        Object objValueOf;
        StringBuilder sb = new StringBuilder();
        if (i2 >= 10) {
            strValueOf = String.valueOf(i2);
        } else {
            strValueOf = "0" + i2;
        }
        sb.append(strValueOf);
        if (i3 >= 10) {
            objValueOf = Integer.valueOf(i3);
        } else {
            objValueOf = "0" + i3;
        }
        sb.append(objValueOf);
        return sb.toString();
    }

    private static String f(int i2, int i3, int i4) {
        if (i3 == 12 && i4 == daysInLunarMonth(i2, i3)) {
            return b[0];
        }
        String strE = e(i3, i4);
        for (String str : b) {
            if (str.contains(strE)) {
                return str.replace(strE, "");
            }
        }
        return "";
    }

    private static String g(int i2, int i3) {
        String strE = e(i2, i3);
        for (String str : f) {
            if (str.contains(strE)) {
                return str.replace(strE, "");
            }
        }
        return "";
    }

    public static String getLunarText(int i2, int i3, int i4) {
        String strB = b(i2, i3, i4);
        String strG = g(i3, i4);
        if (!TextUtils.isEmpty(strG)) {
            return strG;
        }
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        int[] iArrSolarToLunar = LunarUtil.solarToLunar(i2, i3, i4);
        String strF = f(iArrSolarToLunar[0], iArrSolarToLunar[1], iArrSolarToLunar[2]);
        return !TextUtils.isEmpty(strF) ? strF : i(iArrSolarToLunar[1], iArrSolarToLunar[2], iArrSolarToLunar[3]);
    }

    public static void h(Context context) {
        if (a != null) {
            return;
        }
        TrunkBranchAnnals.init(context);
        SolarTermUtil.m(context);
        a = context.getResources().getStringArray(R.array.lunar_first_of_month);
        b = context.getResources().getStringArray(R.array.tradition_festival);
        c = context.getResources().getStringArray(R.array.lunar_str);
        d = context.getResources().getStringArray(R.array.special_festivals);
        f = context.getResources().getStringArray(R.array.solar_festival);
    }

    private static String i(int i2, int i3, int i4) {
        return i3 == 1 ? j(i2, i4) : c[i3 - 1];
    }

    private static String j(int i2, int i3) {
        if (i3 != 1) {
            return a[i2 - 1];
        }
        return "闰" + a[i2 - 1];
    }

    public static void setupLunarCalendar(Calendar calendar) {
        int year = calendar.getYear();
        int month = calendar.getMonth();
        int day = calendar.getDay();
        calendar.setWeekend(b.G(calendar));
        calendar.setWeek(b.t(calendar));
        Calendar calendar2 = new Calendar();
        calendar.setLunarCalendar(calendar2);
        int[] iArrSolarToLunar = LunarUtil.solarToLunar(year, month, day);
        calendar2.setYear(iArrSolarToLunar[0]);
        calendar2.setMonth(iArrSolarToLunar[1]);
        calendar2.setDay(iArrSolarToLunar[2]);
        calendar.setLeapYear(b.D(year));
        if (iArrSolarToLunar[3] == 1) {
            calendar.setLeapMonth(iArrSolarToLunar[1]);
            calendar2.setLeapMonth(iArrSolarToLunar[1]);
        }
        String strB = b(year, month, day);
        String strG = g(month, day);
        String strF = f(iArrSolarToLunar[0], iArrSolarToLunar[1], iArrSolarToLunar[2]);
        String strI = i(iArrSolarToLunar[1], iArrSolarToLunar[2], iArrSolarToLunar[3]);
        if (TextUtils.isEmpty(strG)) {
            strG = c(year, month, day);
        }
        calendar.setSolarTerm(strB);
        calendar.setGregorianFestival(strG);
        calendar.setTraditionFestival(strF);
        calendar2.setTraditionFestival(strF);
        calendar2.setSolarTerm(strB);
        if (!TextUtils.isEmpty(strB)) {
            calendar.setLunar(strB);
        } else if (!TextUtils.isEmpty(strG)) {
            calendar.setLunar(strG);
        } else if (TextUtils.isEmpty(strF)) {
            calendar.setLunar(strI);
        } else {
            calendar.setLunar(strF);
        }
        calendar2.setLunar(strI);
    }

    public static String getLunarText(Calendar calendar) {
        return getLunarText(calendar.getYear(), calendar.getMonth(), calendar.getDay());
    }
}
