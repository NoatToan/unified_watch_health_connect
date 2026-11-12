package com.huami.assistant.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.TimeFormatException;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.assistant.R;
import com.huami.assistant.calendar.EventRecurrence;
import com.huami.assistant.model.bean.EventRepeatType;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class EventUtils {
    private static final String a = "EventUtils";

    private EventUtils() {
    }

    private static String a(int day, int dayOfWeekLength) {
        return DateUtils.getDayOfWeekString(b(day), dayOfWeekLength);
    }

    private static int b(int day) {
        if (day == 65536) {
            return 1;
        }
        if (day == 131072) {
            return 2;
        }
        if (day == 262144) {
            return 3;
        }
        if (day == 524288) {
            return 4;
        }
        if (day == 1048576) {
            return 5;
        }
        if (day == 2097152) {
            return 6;
        }
        if (day == 4194304) {
            return 7;
        }
        throw new IllegalArgumentException("bad day argument: " + day);
    }

    private static String c(Context context, @NonNull EventRecurrence recurrence) {
        ArrayList arrayList = new ArrayList();
        int[] iArr = recurrence.byday;
        if (iArr != null) {
            if (iArr.length == 7) {
                arrayList.add(context.getString(R.string.repeat_all_week));
            } else if (recurrence.repeatsOnEveryWorkday()) {
                arrayList.add(context.getString(R.string.repeat_every_workday));
            } else if (recurrence.repeatsOnEveryWeekend()) {
                arrayList.add(context.getString(R.string.repeat_weekend));
            } else {
                int i = recurrence.bydayCount > 1 ? 20 : 10;
                for (int i2 : recurrence.byday) {
                    arrayList.add(a(i2, i));
                }
            }
        }
        return TextUtils.join(",", arrayList);
    }

    public static String constructReminderLabel(Context context, int minutes) {
        int i;
        Resources resources = context.getResources();
        if (minutes % 60 != 0) {
            i = R.plurals.Nminutes;
        } else if (minutes % 1440 != 0) {
            minutes /= 60;
            i = R.plurals.Nhours;
        } else {
            minutes /= 1440;
            i = R.plurals.Ndays;
        }
        return String.format(resources.getQuantityString(i, minutes), Integer.valueOf(minutes));
    }

    private static String d(Context context, @NonNull EventRecurrence recurrence) {
        if (recurrence.bydayNum == null) {
            return c(context, recurrence);
        }
        ArrayList arrayList = new ArrayList();
        for (int i : recurrence.bydayNum) {
            int i2 = i - 1;
            StringBuilder sb = new StringBuilder();
            String[] stringArray = context.getResources().getStringArray(R.array.repeat_by_nth);
            if (i2 <= 0) {
                i2 = 4;
            }
            sb.append(stringArray[i2]);
            sb.append(c(context, recurrence));
            arrayList.add(sb.toString());
        }
        return TextUtils.join(";", arrayList);
    }

    private static String e(Context context, @NonNull EventRecurrence recurrence, boolean includeEndString) {
        String string = "";
        if (!includeEndString) {
            return "";
        }
        if (recurrence.until != null) {
            try {
                Time time = new Time();
                time.parse(recurrence.until);
                string = context.getString(R.string.endByDate, DateUtils.formatDateTime(context, time.toMillis(false), 131072));
            } catch (TimeFormatException unused) {
            }
        }
        if (recurrence.count <= 0) {
            return string;
        }
        Resources resources = context.getResources();
        int i = R.plurals.endByCount;
        int i2 = recurrence.count;
        return resources.getQuantityString(i, i2, Integer.valueOf(i2));
    }

    private static void f(Context context, @NonNull EventRecurrence recurrence, StringBuilder repeat) {
        int i = recurrence.interval;
        if (i <= 1) {
            i = 1;
        }
        int i2 = recurrence.freq;
        if (i2 == 4) {
            if (i > 1) {
                repeat.append(context.getString(R.string.daily_other, Integer.valueOf(i)));
                return;
            } else {
                repeat.append(context.getString(R.string.repeat_every_day));
                return;
            }
        }
        if (i2 == 5) {
            if (i > 1) {
                repeat.append(context.getString(R.string.weekly_other, Integer.valueOf(i)));
                return;
            } else {
                repeat.append(context.getString(R.string.weekly_one));
                return;
            }
        }
        if (i2 == 6) {
            if (i > 1) {
                repeat.append(context.getString(R.string.monthly_other, Integer.valueOf(i)));
                return;
            } else {
                repeat.append(context.getString(R.string.repeat_every_month));
                return;
            }
        }
        if (i2 != 7) {
            return;
        }
        if (i > 1) {
            repeat.append(context.getString(R.string.yearly_other, Integer.valueOf(i)));
        } else {
            repeat.append(context.getString(R.string.repeat_every_year));
        }
    }

    public static String formatReminderMinute(Context context, int minute, long time) {
        if (minute == -1) {
            return context.getString(R.string.no_remind);
        }
        if (minute == 0) {
            return context.getString(R.string.on_event_start);
        }
        StringBuilder sb = new StringBuilder();
        long j = minute * 60 * 1000;
        if (time > 0) {
            int iAbs = minute > 0 ? (minute / 1440) + 1 : Math.abs(minute) / 1440;
            if (iAbs == 0) {
                sb.append(context.getString(R.string.schedule_cur_day));
            } else {
                sb.append(context.getResources().getQuantityString(minute > 0 ? R.plurals.days_ago : R.plurals.days_after, iAbs, Integer.valueOf(iAbs)));
            }
            sb.append("(");
            sb.append(TimeUtil.formatDateTime(DateDay.today().dayStartMills() - j, "HH:mm"));
            sb.append(")");
        } else {
            DateDay dateDay = DateDay.today();
            sb.append(DateUtils.getRelativeTimeSpanString(dateDay.timeInMillis() - j, dateDay.timeInMillis(), 60000L));
        }
        return sb.toString();
    }

    private static String g(@NonNull EventRecurrence recurrence) {
        if (recurrence.bymonth == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (int i : recurrence.bymonth) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2, i - 1);
            arrayList.add(TimeUtil.formatDateTime(calendar.getTimeInMillis(), "MMM"));
        }
        return TextUtils.join(",", arrayList);
    }

    public static boolean[] getCustomRepeatDays(EventRecurrence recu) {
        if (recu.interval != 1 || recu.freq != 5) {
            return null;
        }
        boolean[] zArr = {false, false, false, false, false, false, false};
        int[] iArr = recu.byday;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = recu.byday;
                if (i >= iArr2.length) {
                    break;
                }
                int i2 = iArr2[i];
                if (i2 == 65536) {
                    zArr[0] = true;
                } else if (i2 == 131072) {
                    zArr[1] = true;
                } else if (i2 == 262144) {
                    zArr[2] = true;
                } else if (i2 == 524288) {
                    zArr[3] = true;
                } else if (i2 == 1048576) {
                    zArr[4] = true;
                } else if (i2 == 2097152) {
                    zArr[5] = true;
                } else if (i2 == 4194304) {
                    zArr[6] = true;
                }
                i++;
            }
        }
        return zArr;
    }

    public static String getDuration(long start, long end) {
        return "P" + ((end - start) / 1000) + ExifInterface.LATITUDE_SOUTH;
    }

    public static int getFirstDayOfWeek() {
        int firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
        if (firstDayOfWeek == 7) {
            return 6;
        }
        return firstDayOfWeek == 2 ? 1 : 0;
    }

    public static String getRepeatString(Context context, Resources r, EventRecurrence recurrence, boolean includeEndString) {
        EventRepeatType repeatType = getRepeatType(recurrence);
        if (repeatType != EventRepeatType.CUSTOM) {
            return r.getString(repeatType.name);
        }
        StringBuilder sb = new StringBuilder();
        f(context, recurrence, sb);
        ArrayList arrayList = new ArrayList();
        String strD = d(context, recurrence);
        if (!TextUtils.isEmpty(strD)) {
            arrayList.add(strD);
        }
        String strH = h(context, recurrence);
        if (!TextUtils.isEmpty(strH)) {
            arrayList.add(strH);
        }
        String strG = g(recurrence);
        if (!TextUtils.isEmpty(strG)) {
            arrayList.add(strG);
        }
        if (!arrayList.isEmpty()) {
            sb.append(context.getString(R.string.repeat_on));
            sb.append(TextUtils.join(";", arrayList));
        }
        sb.append(e(context, recurrence, includeEndString));
        return sb.toString();
    }

    public static EventRepeatType getRepeatType(EventRecurrence recu) {
        if (recu == null) {
            return EventRepeatType.NEVER;
        }
        if (recu.until != null || recu.count > 0) {
            return EventRepeatType.CUSTOM;
        }
        int i = recu.interval;
        if (i <= 1) {
            i = 1;
        }
        if (recu.startDate == null) {
            recu.setStartDate(new Time());
        }
        int i2 = recu.freq;
        if (i2 == 4 && i == 1) {
            return EventRepeatType.EVERY_DAY;
        }
        if (i2 == 5) {
            if (i > 2) {
                return EventRepeatType.CUSTOM;
            }
            if (recu.bydayCount == 7 && i == 1) {
                return EventRepeatType.EVERY_DAY;
            }
            if (recu.repeatsOnEveryWorkday() && i == 1) {
                return EventRepeatType.WORKDAY;
            }
            if (recu.repeatsOnEveryWeekend() && i == 1) {
                return EventRepeatType.WEEKEND;
            }
            if (recu.repeatsOnDefault()) {
                return i == 1 ? EventRepeatType.EVERY_WEEK : EventRepeatType.EVERY_TWO_WEEK;
            }
        }
        if (!recu.repeatsOnDefault()) {
            return EventRepeatType.CUSTOM;
        }
        int i3 = recu.freq;
        if (i3 == 6) {
            return EventRepeatType.EVERY_MONTH;
        }
        return i3 == 7 ? EventRepeatType.EVERY_YEAR : EventRepeatType.CUSTOM;
    }

    private static String h(Context context, @NonNull EventRecurrence recurrence) {
        if (recurrence.bymonthday == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (int i : recurrence.bymonthday) {
            arrayList.add(context.getString(R.string.repeat_month_day, Integer.valueOf(i)));
        }
        return TextUtils.join(",", arrayList);
    }

    public static long parseDuration(String duration) {
        long j;
        long j2 = 0;
        if (TextUtils.isEmpty(duration)) {
            Log.d(a, "Duration is null.", new Object[0]);
            return 0L;
        }
        if (!duration.startsWith("P") || !duration.endsWith(ExifInterface.LATITUDE_SOUTH) || duration.endsWith(LogUtil.D)) {
            Log.e(a, "Duration is not valid.", new Object[0]);
            return 0L;
        }
        try {
            long j3 = Integer.parseInt(duration.substring(1, duration.length() - 1));
            if (duration.endsWith(ExifInterface.LATITUDE_SOUTH)) {
                j = 1000;
            } else {
                if (!duration.endsWith(LogUtil.D)) {
                    return 0L;
                }
                j = 86400000;
            }
            j2 = j3 * j;
            return j2;
        } catch (Exception e) {
            Log.e(a, e.toString(), new Object[0]);
            return j2;
        }
    }

    public static String parseIntervalTime(long begin, long end, String duration, boolean allDay) {
        if (allDay) {
            return DateDay.from(begin).str(DateDay.FORMAT_PATTERN_MDE);
        }
        long duration2 = parseDuration(duration);
        if (duration2 <= 0) {
            return DateDay.from(begin).str(DateDay.FORMAT_PATTERN_MDEHM) + " - " + DateDay.from(end).str(DateDay.FORMAT_PATTERN_MDEHM);
        }
        long j = duration2 + begin;
        if (!DateDay.from(begin).str().equals(DateDay.from(j).str())) {
            return DateDay.from(begin).str(DateDay.FORMAT_PATTERN_MDEHM) + " - " + DateDay.from(j).str(DateDay.FORMAT_PATTERN_MDEHM);
        }
        return DateDay.from(begin).str() + " " + DateDay.from(begin).str("HH:mm") + " - " + DateDay.from(j).str("HH:mm");
    }
}
