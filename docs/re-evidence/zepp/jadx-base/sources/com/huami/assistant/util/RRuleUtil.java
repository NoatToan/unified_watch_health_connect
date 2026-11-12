package com.huami.assistant.util;

import android.text.TextUtils;
import android.text.format.Time;
import android.util.TimeFormatException;
import com.google.android.material.datepicker.UtcDates;
import com.huami.assistant.calendar.EventRecurrence;
import com.huami.assistant.calendar.RecurrenceModel;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class RRuleUtil {
    private static final int[] a = {4, 5, 6, 7};

    private static boolean a(EventRecurrence er) {
        int i;
        int i2;
        int i3 = er.freq;
        if (i3 != 4 && i3 != 5 && i3 != 6 && i3 != 7) {
            return false;
        }
        if (er.count > 0 && !TextUtils.isEmpty(er.until)) {
            return false;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = er.bydayCount;
            if (i4 >= i) {
                break;
            }
            if (er.bydayNum[i4] > 0) {
                i5++;
            }
            i4++;
        }
        if (i5 > 1) {
            return false;
        }
        if ((i5 > 0 && er.freq != 6) || (i2 = er.bymonthdayCount) > 1) {
            return false;
        }
        if (er.freq == 6) {
            if (i > 1) {
                return false;
            }
            if (i > 0 && i2 > 0) {
                return false;
            }
        }
        return true;
    }

    public static void copyEventRecurrenceToModel(EventRecurrence er, RecurrenceModel model) {
        int i;
        int i2 = er.freq;
        if (i2 == 4) {
            model.freq = 0;
        } else if (i2 == 5) {
            model.freq = 1;
        } else if (i2 == 6) {
            model.freq = 2;
        } else {
            if (i2 != 7) {
                throw new IllegalStateException("freq=" + er.freq);
            }
            model.freq = 3;
        }
        int i3 = er.interval;
        if (i3 > 0) {
            model.interval = i3;
        }
        int i4 = er.count;
        model.endCount = i4;
        if (i4 > 0) {
            model.end = 2;
        }
        if (!TextUtils.isEmpty(er.until)) {
            if (model.endDate == null) {
                model.endDate = new Time();
            }
            try {
                model.endDate.parse(er.until);
            } catch (TimeFormatException unused) {
                model.endDate = null;
            }
            if (model.end == 2 && model.endDate != null) {
                throw new IllegalStateException("freq=" + er.freq);
            }
            model.end = 1;
        }
        Arrays.fill(model.weeklyByDayOfWeek, false);
        if (er.bydayCount > 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = er.bydayCount;
                if (i5 >= i) {
                    break;
                }
                int iDay2TimeDay = EventRecurrence.day2TimeDay(er.byday[i5]);
                model.weeklyByDayOfWeek[iDay2TimeDay] = true;
                if (model.freq == 2) {
                    int[] iArr = er.bydayNum;
                    if (iArr[i5] > 0) {
                        model.monthlyByDayOfWeek = iDay2TimeDay;
                        model.monthlyByNthDayOfWeek = iArr[i5];
                        model.monthlyRepeat = 1;
                        i6++;
                    }
                }
                i5++;
            }
            if (model.freq == 2) {
                if (i != 1) {
                    throw new IllegalStateException("Can handle only 1 byDayOfWeek in monthly");
                }
                if (i6 != 1) {
                    throw new IllegalStateException("Didn't specify which nth day of week to repeat for a monthly");
                }
            }
        }
        if (model.freq == 2) {
            if (er.bymonthdayCount != 1) {
                if (er.bymonthCount > 1) {
                    throw new IllegalStateException("Can handle only one bymonthday");
                }
            } else {
                if (model.monthlyRepeat == 1) {
                    throw new IllegalStateException("Can handle only by monthday or by nth day of week, not both");
                }
                model.monthlyByMonthDay = er.bymonthday[0];
                model.monthlyRepeat = 0;
            }
        }
    }

    public static void copyModelToEventRecurrence(RecurrenceModel model, EventRecurrence er) {
        er.freq = a[model.freq];
        int i = model.interval;
        if (i <= 1) {
            er.interval = 0;
        } else {
            er.interval = i;
        }
        int i2 = model.end;
        if (i2 == 1) {
            Time time = model.endDate;
            if (time == null) {
                throw new IllegalStateException("end = END_BY_DATE but endDate is null");
            }
            time.switchTimezone(UtcDates.UTC);
            model.endDate.normalize(false);
            er.until = model.endDate.format2445();
            er.count = 0;
        } else if (i2 != 2) {
            er.count = 0;
            er.until = null;
        } else {
            int i3 = model.endCount;
            er.count = i3;
            er.until = null;
            if (i3 <= 0) {
                throw new IllegalStateException("count is " + er.count);
            }
        }
        er.bydayCount = 0;
        er.bymonthdayCount = 0;
        int i4 = model.freq;
        if (i4 == 1) {
            int i5 = 0;
            for (int i6 = 0; i6 < 7; i6++) {
                if (model.weeklyByDayOfWeek[i6]) {
                    i5++;
                }
            }
            if (er.bydayCount < i5 || er.byday == null || er.bydayNum == null) {
                er.byday = new int[i5];
                er.bydayNum = new int[i5];
            }
            er.bydayCount = i5;
            for (int i7 = 6; i7 >= 0; i7--) {
                if (model.weeklyByDayOfWeek[i7]) {
                    i5--;
                    er.bydayNum[i5] = 0;
                    er.byday[i5] = EventRecurrence.timeDay2Day(i7);
                }
            }
        } else if (i4 == 2) {
            int i8 = model.monthlyRepeat;
            if (i8 == 0) {
                int i9 = model.monthlyByMonthDay;
                if (i9 > 0) {
                    int[] iArr = er.bymonthday;
                    er.bymonthday = new int[1];
                    er.bymonthday[0] = i9;
                    er.bymonthdayCount = 1;
                }
            } else if (i8 == 1) {
                if (model.monthlyByNthDayOfWeek <= 0) {
                    throw new IllegalStateException("month repeat by nth week but n is " + model.monthlyByNthDayOfWeek);
                }
                er.byday = new int[1];
                er.bydayNum = new int[1];
                er.bydayCount = 1;
                er.byday[0] = EventRecurrence.timeDay2Day(model.monthlyByDayOfWeek);
                er.bydayNum[0] = model.monthlyByNthDayOfWeek;
            }
        }
        if (a(er)) {
            return;
        }
        throw new IllegalStateException("UI generated recurrence that it can't handle. ER:" + er.toString() + " Model: " + model.toString());
    }
}
