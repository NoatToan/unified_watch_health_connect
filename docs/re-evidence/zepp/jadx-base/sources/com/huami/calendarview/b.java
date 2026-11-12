package com.huami.calendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class b {
    private static final long a = 86400000;

    public static List<Calendar> A(Calendar calendar, c cVar, int i) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        long timeInMillis = calendar2.getTimeInMillis();
        int iW = w(calendar.getYear(), calendar.getMonth(), calendar.getDay(), i);
        ArrayList arrayList = new ArrayList();
        calendar2.setTimeInMillis(timeInMillis);
        Calendar calendar3 = new Calendar();
        calendar3.setYear(calendar2.get(1));
        calendar3.setMonth(calendar2.get(2) + 1);
        calendar3.setDay(calendar2.get(5));
        if (calendar3.equals(cVar.j())) {
            calendar3.setCurrentDay(true);
        }
        LunarCalendar.setupLunarCalendar(calendar3);
        calendar3.setCurrentMonth(true);
        arrayList.add(calendar3);
        for (int i2 = 1; i2 <= iW; i2++) {
            calendar2.setTimeInMillis((((long) i2) * 86400000) + timeInMillis);
            Calendar calendar4 = new Calendar();
            calendar4.setYear(calendar2.get(1));
            calendar4.setMonth(calendar2.get(2) + 1);
            calendar4.setDay(calendar2.get(5));
            if (calendar4.equals(cVar.j())) {
                calendar4.setCurrentDay(true);
            }
            LunarCalendar.setupLunarCalendar(calendar4);
            calendar4.setCurrentMonth(true);
            arrayList.add(calendar4);
        }
        return arrayList;
    }

    public static boolean B(Calendar calendar, int i, int i2, int i3, int i4, int i5, int i6) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(i, i2 - 1, i3);
        long timeInMillis = calendar2.getTimeInMillis();
        calendar2.set(i4, i5 - 1, i6);
        long timeInMillis2 = calendar2.getTimeInMillis();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        long timeInMillis3 = calendar2.getTimeInMillis();
        return timeInMillis3 >= timeInMillis && timeInMillis3 <= timeInMillis2;
    }

    public static boolean C(Calendar calendar, c cVar) {
        return B(calendar, cVar.z(), cVar.B(), cVar.A(), cVar.u(), cVar.w(), cVar.v());
    }

    public static boolean D(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }

    private static boolean E(Calendar calendar, c cVar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(cVar.z(), cVar.B() - 1, cVar.A());
        long timeInMillis = calendar2.getTimeInMillis();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        return calendar2.getTimeInMillis() < timeInMillis;
    }

    public static boolean F(int i, int i2, int i3, int i4, int i5, int i6) {
        return i >= i3 && i <= i5 && (i != i3 || i2 >= i4) && (i != i5 || i2 <= i6);
    }

    public static boolean G(Calendar calendar) {
        int iT = t(calendar);
        return iT == 0 || iT == 6;
    }

    public static int a(int i, int i2, int i3, int i4, int i5, int i6) {
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        Calendar calendar2 = new Calendar();
        calendar2.setYear(i4);
        calendar2.setMonth(i5);
        calendar2.setDay(i6);
        return calendar.compareTo(calendar2);
    }

    public static int b(Calendar calendar, Calendar calendar2) {
        if (calendar == null) {
            return Integer.MIN_VALUE;
        }
        if (calendar2 == null) {
            return Integer.MAX_VALUE;
        }
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        calendar3.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        long timeInMillis = calendar3.getTimeInMillis();
        calendar3.set(calendar2.getYear(), calendar2.getMonth() - 1, calendar2.getDay());
        return (int) ((timeInMillis - calendar3.getTimeInMillis()) / 86400000);
    }

    public static int c(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @SuppressLint({"SimpleDateFormat"})
    public static int d(String str, Date date) {
        return Integer.parseInt(new SimpleDateFormat(str).format(date));
    }

    public static Calendar e(int i, c cVar) {
        Calendar calendar = new Calendar();
        if (cVar.t0()) {
            calendar.setYear(cVar.u() - (((cVar.B() + i) - 1) / 12));
            calendar.setMonth((12 - ((((i + cVar.B()) - 1) % 12) + 1)) + 1);
        } else {
            int iB = ((cVar.B() + i) - 1) / 12;
            cVar.z();
            calendar.setYear((((cVar.B() + i) - 1) / 12) + cVar.z());
            calendar.setMonth((((i + cVar.B()) - 1) % 12) + 1);
        }
        if (cVar.n() != 0) {
            int iG = g(calendar.getYear(), calendar.getMonth());
            Calendar calendar2 = cVar.C0;
            if (calendar2 == null || calendar2.getDay() == 0) {
                iG = 1;
            } else if (iG >= calendar2.getDay()) {
                iG = calendar2.getDay();
            }
            calendar.setDay(iG);
        } else {
            calendar.setDay(1);
        }
        if (!C(calendar, cVar)) {
            calendar = E(calendar, cVar) ? cVar.x() : cVar.s();
        }
        calendar.setCurrentMonth(calendar.getYear() == cVar.j().getYear() && calendar.getMonth() == cVar.j().getMonth());
        calendar.setCurrentDay(calendar.equals(cVar.j()));
        LunarCalendar.setupLunarCalendar(calendar);
        return calendar;
    }

    public static Calendar f(int i, int i2, int i3, int i4, int i5) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i, i2 - 1, i3);
        long timeInMillis = (((long) ((i4 - 1) * 7)) * 86400000) + calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        calendar.setTimeInMillis(timeInMillis - (((long) y(calendar.get(1), calendar.get(2) + 1, calendar.get(5), i5)) * 86400000));
        Calendar calendar2 = new Calendar();
        calendar2.setYear(calendar.get(1));
        calendar2.setMonth(calendar.get(2) + 1);
        calendar2.setDay(calendar.get(5));
        return calendar2;
    }

    public static int g(int i, int i2) {
        int i3 = (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 8 || i2 == 10 || i2 == 12) ? 31 : 0;
        if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = 30;
        }
        if (i2 == 2) {
            return D(i) ? 29 : 28;
        }
        return i3;
    }

    public static int h(int i, int i2, int i3) {
        return i(i, i2, g(i, i2), i3);
    }

    private static int i(int i, int i2, int i3, int i4) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i, i2 - 1, i3);
        int i5 = calendar.get(7);
        if (i4 == 1) {
            return 7 - i5;
        }
        if (i4 == 2) {
            if (i5 == 1) {
                return 0;
            }
            return (7 - i5) + 1;
        }
        if (i5 == 7) {
            return 6;
        }
        return (7 - i5) - 1;
    }

    public static int j(int i, int i2, int i3, int i4) {
        java.util.Calendar.getInstance().set(i, i2 - 1, 1);
        int iM = m(i, i2, i4);
        int iG = g(i, i2);
        return (((iM + iG) + i(i, i2, iG, i4)) / 7) * i3;
    }

    public static int k(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? i3 * 6 : j(i, i2, i3, i4);
    }

    public static int l(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            return 6;
        }
        return ((m(i, i2, i3) + g(i, i2)) + h(i, i2, i3)) / 7;
    }

    public static int m(int i, int i2, int i3) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i, i2 - 1, 1);
        int i4 = calendar.get(7);
        if (i3 == 1) {
            return i4 - 1;
        }
        if (i3 == 2) {
            if (i4 == 1) {
                return 6;
            }
            return i4 - i3;
        }
        if (i4 == 7) {
            return 0;
        }
        return i4;
    }

    public static int n(Calendar calendar, int i) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, 1);
        int i2 = calendar2.get(7);
        if (i == 1) {
            return i2 - 1;
        }
        if (i == 2) {
            if (i2 == 1) {
                return 6;
            }
            return i2 - i;
        }
        if (i2 == 7) {
            return 0;
        }
        return i2;
    }

    public static Calendar o(Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        calendar2.setTimeInMillis(calendar2.getTimeInMillis() + 86400000);
        Calendar calendar3 = new Calendar();
        calendar3.setYear(calendar2.get(1));
        calendar3.setMonth(calendar2.get(2) + 1);
        calendar3.setDay(calendar2.get(5));
        return calendar3;
    }

    public static Calendar p(Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        calendar2.setTimeInMillis(calendar2.getTimeInMillis() - 86400000);
        Calendar calendar3 = new Calendar();
        calendar3.setYear(calendar2.get(1));
        calendar3.setMonth(calendar2.get(2) + 1);
        calendar3.setDay(calendar2.get(5));
        return calendar3;
    }

    public static Calendar q(Calendar calendar, c cVar) {
        if (C(cVar.j(), cVar) && cVar.n() != 2) {
            return cVar.e();
        }
        if (C(calendar, cVar)) {
            return calendar;
        }
        return cVar.x().isSameMonth(calendar) ? cVar.x() : cVar.s();
    }

    public static List<Calendar> r(Calendar calendar, c cVar) {
        long timeInMillis = calendar.getTimeInMillis();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        int iU = calendar2.get(7);
        if (cVar.U() == 1) {
            iU--;
        } else if (cVar.U() == 2) {
            iU = iU == 1 ? 6 : iU - cVar.U();
        } else if (iU == 7) {
            iU = 0;
        }
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        calendar3.setTimeInMillis(timeInMillis - (((long) iU) * 86400000));
        Calendar calendar4 = new Calendar();
        calendar4.setYear(calendar3.get(1));
        calendar4.setMonth(calendar3.get(2) + 1);
        calendar4.setDay(calendar3.get(5));
        return A(calendar4, cVar, cVar.U());
    }

    public static int s(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i, i2 - 1, i3);
        long timeInMillis = calendar.getTimeInMillis();
        int iY = y(i, i2, i3, i7);
        calendar.set(i4, i5 - 1, i6);
        return ((iY + w(i4, i5, i6, i7)) + (((int) ((calendar.getTimeInMillis() - timeInMillis) / 86400000)) + 1)) / 7;
    }

    public static int t(Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(calendar.getYear(), calendar.getMonth() - 1, calendar.getDay());
        return calendar2.get(7) - 1;
    }

    public static int u(Calendar calendar, int i, int i2, int i3, int i4) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(i, i2 - 1, i3);
        long timeInMillis = calendar2.getTimeInMillis();
        int iY = y(i, i2, i3, i4);
        int iY2 = y(calendar.getYear(), calendar.getMonth(), calendar.getDay(), i4);
        int year = calendar.getYear();
        int month = calendar.getMonth() - 1;
        int day = calendar.getDay();
        if (iY2 == 0) {
            day++;
        }
        calendar2.set(year, month, day);
        return ((iY + ((int) ((calendar2.getTimeInMillis() - timeInMillis) / 86400000))) / 7) + 1;
    }

    public static int v(Calendar calendar, int i) {
        java.util.Calendar.getInstance().set(calendar.getYear(), calendar.getMonth() - 1, 1);
        return (((calendar.getDay() + n(calendar, i)) - 1) / 7) + 1;
    }

    private static int w(int i, int i2, int i3, int i4) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i, i2 - 1, i3);
        int i5 = calendar.get(7);
        if (i4 == 1) {
            return 7 - i5;
        }
        if (i4 == 2) {
            if (i5 == 1) {
                return 0;
            }
            return (7 - i5) + 1;
        }
        if (i5 == 7) {
            return 6;
        }
        return (7 - i5) - 1;
    }

    public static int x(Calendar calendar, int i) {
        return y(calendar.getYear(), calendar.getMonth(), calendar.getDay(), i);
    }

    private static int y(int i, int i2, int i3, int i4) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i, i2 - 1, i3);
        int i5 = calendar.get(7);
        if (i4 == 1) {
            return i5 - 1;
        }
        if (i4 == 2) {
            if (i5 == 1) {
                return 6;
            }
            return i5 - i4;
        }
        if (i5 == 7) {
            return 0;
        }
        return i5;
    }

    public static List<Calendar> z(int i, int i2, Calendar calendar, int i3) {
        int iG;
        int i4;
        int i5;
        int i6;
        int i7 = i2 - 1;
        java.util.Calendar.getInstance().set(i, i7, 1);
        int iM = m(i, i2, i3);
        int iG2 = g(i, i2);
        ArrayList arrayList = new ArrayList();
        int i8 = 12;
        if (i2 == 1) {
            i4 = i - 1;
            int i9 = i2 + 1;
            iG = iM == 0 ? 0 : g(i4, 12);
            i5 = i9;
            i6 = i;
        } else if (i2 == 12) {
            i6 = i + 1;
            iG = iM == 0 ? 0 : g(i, i7);
            i5 = 1;
            i8 = i7;
            i4 = i;
        } else {
            int i10 = i2 + 1;
            i8 = i7;
            iG = iM == 0 ? 0 : g(i, i7);
            i4 = i;
            i5 = i10;
            i6 = i4;
        }
        int i11 = 1;
        for (int i12 = 0; i12 < 42; i12++) {
            Calendar calendar2 = new Calendar();
            if (i12 < iM) {
                calendar2.setYear(i4);
                calendar2.setMonth(i8);
                calendar2.setDay((iG - iM) + i12 + 1);
            } else if (i12 >= iG2 + iM) {
                calendar2.setYear(i6);
                calendar2.setMonth(i5);
                calendar2.setDay(i11);
                i11++;
            } else {
                calendar2.setYear(i);
                calendar2.setMonth(i2);
                calendar2.setCurrentMonth(true);
                calendar2.setDay((i12 - iM) + 1);
            }
            if (calendar2.equals(calendar)) {
                calendar2.setCurrentDay(true);
            }
            LunarCalendar.setupLunarCalendar(calendar2);
            arrayList.add(calendar2);
        }
        return arrayList;
    }
}
