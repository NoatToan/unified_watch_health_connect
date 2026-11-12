package com.xiaomi.hm.health.ui.smartplay.eventremind;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class ReminderCategoryHelper {
    private Calendar a(ComparableReminder comparableReminder) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(EventRemindManager.getDateFormat().parse(comparableReminder.getReminder().getStartDate()));
            return calendar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ComparableReminder categorizeDaily(Calendar calendar, ComparableReminder comparableReminder) {
        Calendar calendarA = a(comparableReminder);
        if (calendarA == null) {
            return null;
        }
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        int i3 = calendarA.get(11);
        int i4 = calendarA.get(12);
        if (!calendarA.after(calendar)) {
            return timeLater(i, i2, i3, i4) ? getTodayReminder(calendar, calendarA, comparableReminder) : getTomorrowReminder(calendar, calendarA, comparableReminder);
        }
        if (isInToday(calendar, calendarA)) {
            return getTodayReminder(calendar, calendarA, comparableReminder);
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.add(5, 1);
        return isInToday(calendar2, calendarA) ? getTomorrowReminder(calendar, calendarA, comparableReminder) : comparableReminder.c(calendarA).setRemindType(2);
    }

    public ComparableReminder categorizeMonthly(Calendar calendar, ComparableReminder comparableReminder) {
        Calendar calendarA = a(comparableReminder);
        if (calendarA == null) {
            return null;
        }
        int i = calendar.get(5);
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        int i4 = calendarA.get(5);
        int i5 = calendarA.get(11);
        int i6 = calendarA.get(12);
        if (calendarA.after(calendar)) {
            if (isInToday(calendar, calendarA)) {
                return getTodayReminder(calendar, calendarA, comparableReminder);
            }
            Calendar calendar2 = (Calendar) calendar.clone();
            calendar2.add(5, 1);
            return isInToday(calendar2, calendarA) ? getTomorrowReminder(calendar, calendarA, comparableReminder) : comparableReminder.c(calendarA).setRemindType(2);
        }
        if (i == i4) {
            if (timeLater(i2, i3, i5, i6)) {
                return getTodayReminder(calendar, calendarA, comparableReminder);
            }
            Calendar calendar3 = (Calendar) calendar.clone();
            calendar3.set(11, i5);
            calendar3.set(12, i6);
            do {
                calendar3.add(2, 1);
            } while (i4 > calendar3.getActualMaximum(5));
            calendar3.set(5, i4);
            comparableReminder.c(calendar3);
            return comparableReminder.setRemindType(2);
        }
        Calendar calendar4 = (Calendar) calendar.clone();
        calendar4.add(5, 1);
        if (calendar4.get(5) == i4) {
            return getTomorrowReminder(calendar, calendarA, comparableReminder);
        }
        Calendar calendar5 = (Calendar) calendar.clone();
        calendar5.set(11, i5);
        calendar5.set(12, i6);
        if (i >= i4 || i4 > calendar.getActualMaximum(5)) {
            do {
                calendar5.add(2, 1);
            } while (i4 > calendar5.getActualMaximum(5));
            calendar5.set(5, i4);
            comparableReminder.c(calendar5);
        } else {
            calendar5.set(5, i4);
            comparableReminder.c(calendar5);
        }
        return comparableReminder.setRemindType(2);
    }

    public ComparableReminder categorizeOnce(Calendar calendar, ComparableReminder comparableReminder) {
        Calendar calendarA = a(comparableReminder);
        if (calendarA == null) {
            return null;
        }
        if (!calendarA.after(calendar)) {
            return comparableReminder.c(calendarA).setRemindType(-1);
        }
        if (isInToday(calendar, calendarA)) {
            return getTodayReminder(calendar, calendarA, comparableReminder);
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.add(5, 1);
        return isInToday(calendar2, calendarA) ? getTomorrowReminder(calendar, calendarA, comparableReminder) : comparableReminder.c(calendarA).setRemindType(2);
    }

    public ComparableReminder categorizeWeekly(Calendar calendar, ComparableReminder comparableReminder) {
        Calendar calendarA = a(comparableReminder);
        if (calendarA == null) {
            return null;
        }
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        int i3 = calendarA.get(11);
        int i4 = calendarA.get(12);
        String[] strArrSplit = comparableReminder.getReminder().getLoop().split(",");
        int iConvertWeek = convertWeek(calendar.get(7));
        if (!calendarA.after(calendar)) {
            for (String str : strArrSplit) {
                int i5 = Integer.parseInt(str);
                if (iConvertWeek == i5) {
                    if (timeLater(i, i2, i3, i4)) {
                        return getTodayReminder(calendar, calendarA, comparableReminder);
                    }
                } else if (weekAdd(iConvertWeek) == i5) {
                    return getTomorrowReminder(calendar, calendarA, comparableReminder);
                }
            }
            Calendar calendar2 = (Calendar) calendar.clone();
            calendar2.set(11, i3);
            calendar2.set(12, i4);
            String loop = comparableReminder.getReminder().getLoop();
            do {
                calendar2.add(5, 1);
            } while (!loop.contains(String.valueOf(convertWeek(calendar2.get(7)))));
            comparableReminder.c(calendar2);
            return comparableReminder.setRemindType(2);
        }
        if (isInToday(calendar, calendarA)) {
            if (checkDayOfWeek(iConvertWeek, strArrSplit)) {
                return getTodayReminder(calendar, calendarA, comparableReminder);
            }
            if (checkDayOfWeek(weekAdd(iConvertWeek), strArrSplit)) {
                return getTomorrowReminder(calendar, calendarA, comparableReminder);
            }
            Calendar calendar3 = (Calendar) calendarA.clone();
            String loop2 = comparableReminder.getReminder().getLoop();
            do {
                calendar3.add(5, 1);
            } while (!loop2.contains(String.valueOf(convertWeek(calendar3.get(7)))));
            comparableReminder.c(calendar3);
            return comparableReminder.setRemindType(2);
        }
        Calendar calendar4 = (Calendar) calendar.clone();
        calendar4.add(5, 1);
        if (isInToday(calendar4, calendarA) && checkDayOfWeek(convertWeek(calendar4.get(7)), strArrSplit)) {
            return getTomorrowReminder(calendar, calendarA, comparableReminder);
        }
        Calendar calendar5 = (Calendar) calendarA.clone();
        String loop3 = comparableReminder.getReminder().getLoop();
        while (!loop3.contains(String.valueOf(convertWeek(calendar5.get(7))))) {
            calendar5.add(5, 1);
        }
        comparableReminder.c(calendar5);
        return comparableReminder.setRemindType(2);
    }

    public ComparableReminder categorizeYearly(Calendar calendar, ComparableReminder comparableReminder) {
        int i;
        Calendar calendarA = a(comparableReminder);
        if (calendarA == null) {
            return null;
        }
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        int i6 = calendarA.get(2);
        int i7 = calendarA.get(5);
        int i8 = calendarA.get(11);
        int i9 = calendarA.get(12);
        if (calendarA.after(calendar)) {
            if (isInToday(calendar, calendarA)) {
                return getTodayReminder(calendar, calendarA, comparableReminder);
            }
            Calendar calendar2 = (Calendar) calendar.clone();
            calendar2.add(5, 1);
            return isInToday(calendar2, calendarA) ? getTomorrowReminder(calendar, calendarA, comparableReminder) : comparableReminder.c(calendarA).setRemindType(2);
        }
        if (i2 == i6 && i3 == i7) {
            if (timeLater(i4, i5, i8, i9)) {
                return getTodayReminder(calendar, calendarA, comparableReminder);
            }
            Calendar calendar3 = (Calendar) calendar.clone();
            calendar3.set(11, i8);
            calendar3.set(12, i9);
            do {
                calendar3.add(1, 1);
            } while (i7 > calendar3.getActualMaximum(5));
            comparableReminder.c(calendar3);
            return comparableReminder.setRemindType(2);
        }
        Calendar calendar4 = (Calendar) calendar.clone();
        calendar4.add(5, 1);
        if (calendar4.get(2) == i6 && calendar4.get(5) == i7) {
            return getTomorrowReminder(calendar, calendarA, comparableReminder);
        }
        Calendar calendar5 = (Calendar) calendar.clone();
        calendar5.set(2, i6);
        int actualMaximum = calendar5.getActualMaximum(5);
        if ((i2 < i6 || (i2 == i6 && i3 < i7)) && i7 <= actualMaximum) {
            calendar5.set(5, i7);
            calendar5.set(11, i8);
            calendar5.set(12, i9);
            comparableReminder.c(calendar5);
            i = 2;
        } else {
            Calendar calendar6 = (Calendar) calendar.clone();
            i = 2;
            calendar6.set(2, i6);
            do {
                calendar6.add(1, 1);
                calendar6.set(2, i6);
            } while (i7 > calendar6.getActualMaximum(5));
            calendar6.set(5, i7);
            calendar6.set(11, i8);
            calendar6.set(12, i9);
            comparableReminder.c(calendar6);
        }
        return comparableReminder.setRemindType(i);
    }

    public boolean checkDayOfWeek(int i, String[] strArr) {
        for (String str : strArr) {
            if (i == Integer.parseInt(str)) {
                return true;
            }
        }
        return false;
    }

    public int convertWeek(int i) {
        int i2 = (i + 6) % 7;
        if (i2 == 0) {
            return 7;
        }
        return i2;
    }

    public ComparableReminder getTodayReminder(Calendar calendar, Calendar calendar2, ComparableReminder comparableReminder) {
        int i = calendar2.get(11);
        int i2 = calendar2.get(12);
        Calendar calendar3 = (Calendar) calendar.clone();
        calendar3.set(11, i);
        calendar3.set(12, i2);
        return comparableReminder.c(calendar3).setRemindType(0);
    }

    public ComparableReminder getTomorrowReminder(Calendar calendar, Calendar calendar2, ComparableReminder comparableReminder) {
        int i = calendar2.get(11);
        int i2 = calendar2.get(12);
        Calendar calendar3 = (Calendar) calendar.clone();
        calendar3.add(5, 1);
        calendar3.set(11, i);
        calendar3.set(12, i2);
        return comparableReminder.c(calendar3).setRemindType(1);
    }

    public boolean isInToday(Calendar calendar, Calendar calendar2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        return simpleDateFormat.format(calendar.getTime()).equals(simpleDateFormat.format(calendar2.getTime()));
    }

    public boolean timeLater(int i, int i2, int i3, int i4) {
        return (i * 60) + i2 < (i3 * 60) + i4;
    }

    public int weekAdd(int i) {
        int i2 = (i + 1) % 7;
        if (i2 == 0) {
            return 7;
        }
        return i2;
    }
}
