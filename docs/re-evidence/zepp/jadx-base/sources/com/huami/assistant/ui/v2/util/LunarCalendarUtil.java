package com.huami.assistant.ui.v2.util;

import com.tencent.connect.common.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public class LunarCalendarUtil {
    private static final int[] a = {19416, 19168, 42352, 21717, 53856, 55632, 91476, 22176, 39632, 21970, 19168, 42422, 42192, 53840, 119381, 46400, 54944, 44450, 38320, 84343, 18800, 42160, 46261, 27216, 27968, 109396, Constants.REQUEST_OLD_QZSHARE, 38256, 21234, 18800, 25958, 54432, 59984, 28309, 23248, Constants.REQUEST_OLD_QZSHARE, 100067, 37600, 116951, 51536, 54432, 120998, 46416, 22176, 107956, 9680, 37584, 53938, 43344, 46423, 27808, 46416, 86869, 19872, 42448, 83315, 21200, 43432, 59728, 27296, 44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46496, 103846, 38320, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 19189, 18800, 25776, 29859, 59984, 27480, 21952, 43872, 38613, 37600, 51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 43344, 46240, 47780, 44368, 21977, 19360, 42416, 86390, 21168, 43312, 31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 23200, 30371, 38608, 19415, 19152, 42192, 118966, 53840, 54560, 56645, 46496, 22224, 21938, 18864, 42359, 42160, 43600, 111189, 27936, 44448};
    private static final int b = 1900;
    private static final int c = 2049;
    private static final String d = "19000130";
    private static boolean e;

    private static void a(int lunarYear, int lunarMonth, int lunarDay) throws Exception {
        if (lunarYear < 1900 || lunarYear > c) {
            throw new Exception("非法农历年份！");
        }
        if (lunarMonth < 1 || lunarMonth > 12) {
            throw new Exception("非法农历月份！");
        }
        if (lunarDay < 1 || lunarDay > 30) {
            throw new Exception("非法农历天数！");
        }
    }

    private static int b(Date startDate, Date endDate) {
        int actualMaximum;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(endDate);
        int i = calendar.get(1);
        int i2 = calendar2.get(1);
        if (calendar.before(calendar2)) {
            actualMaximum = (0 - calendar.get(6)) + calendar2.get(6);
        } else {
            actualMaximum = (0 - calendar2.get(6)) + calendar.get(6);
            calendar = calendar2;
        }
        for (int i3 = 0; i3 < Math.abs(i2 - i); i3++) {
            actualMaximum += calendar.getActualMaximum(6);
            calendar.add(1, 1);
        }
        return actualMaximum;
    }

    @Deprecated
    private static int c(Date startDate, Date endDate) {
        return Integer.parseInt(String.valueOf((endDate.getTime() - startDate.getTime()) / 86400000));
    }

    private static int d(int year) {
        return a[year - 1900] & 15;
    }

    private static int e(int year) {
        if (d(year) != 0) {
            return (a[year + (-1900)] & 983040) == 0 ? 29 : 30;
        }
        return 0;
    }

    private static int f(int lunarYeay, int month) throws Exception {
        if (month > 31 || month < 0) {
            throw new Exception("月份有错！");
        }
        return ((a[lunarYeay + (-1900)] & 65535) & (1 << (16 - month))) == 0 ? 29 : 30;
    }

    private static int g(int year) {
        int i = 348;
        for (int i2 = 32768; i2 >= 8; i2 >>= 1) {
            if ((a[year - 1900] & 65520 & i2) != 0) {
                i++;
            }
        }
        return i + e(year);
    }

    public static String lunarToSolar(String lunarDate) throws Exception {
        int iF = 0;
        int i = Integer.parseInt(lunarDate.substring(0, 4));
        int i2 = Integer.parseInt(lunarDate.substring(4, 6));
        int i3 = Integer.parseInt(lunarDate.substring(6, 8));
        a(i, i2, i3);
        for (int i4 = 1900; i4 < i; i4++) {
            iF += g(i4);
        }
        int iD = d(i);
        int i5 = 1;
        if (iD == 0 || i2 < iD || i2 == iD) {
            while (i5 < i2) {
                iF += f(i, i5);
                i5++;
            }
            if (i3 > f(i, i2)) {
                throw new Exception("不合法的农历日期！");
            }
        } else {
            while (i5 < i2) {
                iF += f(i, i5);
                i5++;
            }
            if (i2 > iD) {
                iF += e(i);
                if (i3 > f(i, i2)) {
                    throw new Exception("不合法的农历日期！");
                }
            } else {
                iF += f(i, i2);
                if (i3 > e(i)) {
                    throw new Exception("不合法的农历日期！");
                }
            }
        }
        int i6 = iF + i3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = simpleDateFormat.parse(d);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, i6);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String solarToLunar(String solarDate) throws Exception {
        Date date;
        int iG;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date2 = null;
        try {
            date = simpleDateFormat.parse(solarDate);
            try {
                date2 = simpleDateFormat.parse(d);
            } catch (ParseException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (ParseException e3) {
            e = e3;
            date = null;
        }
        int iB = b(date2, date);
        int i = 1900;
        int iF = 0;
        while (i <= c && (iG = iB - (iF = g(i))) >= 1) {
            i++;
            iB = iG;
        }
        int iD = d(i);
        e = iD > 0;
        int i2 = 1;
        boolean z = false;
        while (i2 <= 12) {
            if (i2 == iD + 1 && e) {
                iF = e(i);
                e = false;
                i2--;
                z = true;
            } else {
                iF = f(i, i2);
            }
            iB -= iF;
            if (iB <= 0) {
                break;
            }
            i2++;
        }
        int i3 = iB + iF;
        StringBuilder sb = new StringBuilder();
        sb.append("阴历：");
        sb.append(i);
        sb.append("年");
        sb.append(z & (i2 == iD) ? "闰" : "");
        sb.append(i2);
        sb.append("月");
        sb.append(i3);
        sb.append("日");
        return sb.toString();
    }
}
