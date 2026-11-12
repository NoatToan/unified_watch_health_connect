package com.huami.femalehealth.logiclib.helper;

import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.Milli;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import io.netty.util.internal.StringUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b@\u0010AJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bJ\u0010\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bJ\u0010\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u000bJ\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u000bJ\"\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\tJ\u0016\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bJ\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\tJ\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bJ\n\u0010$\u001a\u00020\u001e*\u00020\u0002J\u0016\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eJ\u001e\u0010)\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007J \u0010+\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u0007J \u0010,\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u0007J$\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160-2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007J\u0016\u0010/\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007J\u0006\u00100\u001a\u00020\u0002J\"\u00105\u001a\u0002032\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00104\u001a\u000203J\u0016\u00105\u001a\u0002032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00104\u001a\u000206J\u0018\u00108\u001a\u0002032\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\tJ\u0010\u00109\u001a\u0004\u0018\u0001032\u0006\u0010\u001f\u001a\u00020\u001eR\u0016\u0010:\u001a\u0002038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u0002038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010>¨\u0006B"}, d2 = {"Lcom/huami/femalehealth/logiclib/helper/DateHelper;", "", "Ljava/util/Calendar;", "", "b", "a", "c", "", "year", "", "isCurrentYear", "", "time", "month", "isCurrentMonth", "isFeatureMonth", "isCurrentDay", "timeInMillis", "isFeatureDay", "millis", "resetHour", "nowMillis", "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "nowDate", "dayOffset", "offsetDay", "offsetDayGetCalendar", "timeStart", "timeEnd", "differDays", "Ljava/util/Date;", "date", "begin", "toUTC0", "milli", "getDstOffset", "toDate", "d1", "d2", "daysBetween", "day", "date2Millis", "offset", "preMonth", "nextMonth", "", "getMonthList", "getMonthOfDay", "today", "Ljava/util/Locale;", "locale", "", TrainingWebConst.QueryParam.VIDEO_FORMAT, "convertUTCDateString", "Ljava/text/SimpleDateFormat;", "printUTC0", "convertUTCDate", "getDescDateUTC", "DEFAULT_DATE_FORMAT", "Ljava/lang/String;", "DATE_FORMAT_YYYY_MM_DD", "ONE_HOUR_MILLI", "J", "ONE_DAY_MILLI", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class DateHelper {

    @NotNull
    public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";

    @NotNull
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    @NotNull
    public static final DateHelper INSTANCE = new DateHelper();
    public static final long ONE_DAY_MILLI = 86400000;
    public static final long ONE_HOUR_MILLI = 3600000;

    private DateHelper() {
    }

    private final void a(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    private final void b(Calendar calendar) {
        calendar.setTimeInMillis(System.currentTimeMillis());
    }

    private final void c(Calendar calendar) {
        b(calendar);
        a(calendar);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.set(1, i);
        calendar.set(2, i2);
        calendar.set(5, i3);
        calendar.set(10, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public static /* synthetic */ String convertUTCDate$default(DateHelper dateHelper, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return dateHelper.convertUTCDate(j, z);
    }

    public static /* synthetic */ String convertUTCDateString$default(DateHelper dateHelper, long j, Locale locale, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
        }
        if ((i & 4) != 0) {
            str = "yyyy-MM-dd HH:mm:ss";
        }
        return dateHelper.convertUTCDateString(j, locale, str);
    }

    public static /* synthetic */ DateTriple nextMonth$default(DateHelper dateHelper, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return dateHelper.nextMonth(i, i2, i3);
    }

    public static /* synthetic */ DateTriple nowDate$default(DateHelper dateHelper, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return dateHelper.nowDate(j);
    }

    public static /* synthetic */ DateTriple offsetDay$default(DateHelper dateHelper, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = System.currentTimeMillis();
        }
        return dateHelper.offsetDay(i, j);
    }

    public static /* synthetic */ Calendar offsetDayGetCalendar$default(DateHelper dateHelper, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = System.currentTimeMillis();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return dateHelper.offsetDayGetCalendar(i, j, z);
    }

    public static /* synthetic */ DateTriple preMonth$default(DateHelper dateHelper, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return dateHelper.preMonth(i, i2, i3);
    }

    public static /* synthetic */ long resetHour$default(DateHelper dateHelper, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return dateHelper.resetHour(j);
    }

    public static /* synthetic */ Date toUTC0$default(DateHelper dateHelper, Date date, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return dateHelper.toUTC0(date, z);
    }

    @NotNull
    public final String convertUTCDate(long time, boolean printUTC0) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        if (printUTC0) {
            calendar.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        }
        return calendar.get(1) + '-' + (calendar.get(2) + 1) + '-' + calendar.get(5) + StringUtil.SPACE + calendar.get(11) + JsonLexerKt.COLON + calendar.get(12) + JsonLexerKt.COLON + calendar.get(13) + '(' + time + " [" + ((Object) calendar.getTimeZone().getID()) + "])";
    }

    @NotNull
    public final String convertUTCDateString(long time, @NotNull Locale locale, @NotNull String format) {
        return new SimpleDateFormat(format, locale).format(Long.valueOf(time));
    }

    public final long date2Millis(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, year);
        calendar.set(2, month - 1);
        calendar.set(5, day);
        a(calendar);
        return calendar.getTimeInMillis();
    }

    public final int daysBetween(@NotNull Date d1, @NotNull Date d2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(d2);
        int i = calendar.get(6);
        int i2 = calendar2.get(6);
        int i3 = calendar.get(1);
        int i4 = calendar2.get(1);
        if (i3 == i4) {
            return (i2 - i) + 1;
        }
        int i5 = 0;
        if (i3 < i4) {
            while (true) {
                int i6 = i3 + 1;
                i5 += ((i3 % 4 != 0 || i3 % 100 == 0) && i3 % 400 != 0) ? 365 : 366;
                if (i6 >= i4) {
                    break;
                }
                i3 = i6;
            }
        }
        return i5 + (i2 - i) + 1;
    }

    public final int differDays(long timeStart, long timeEnd) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(timeStart));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(timeEnd));
        int i = calendar.get(6);
        int i2 = calendar2.get(6);
        int i3 = calendar.get(1);
        int i4 = calendar2.get(1);
        if (i3 == i4) {
            return i2 - i;
        }
        int i5 = 0;
        if (i3 < i4) {
            while (true) {
                int i6 = i3 + 1;
                i5 += ((i3 % 4 != 0 || i3 % 100 == 0) && i3 % 400 != 0) ? 365 : 366;
                if (i6 >= i4) {
                    break;
                }
                i3 = i6;
            }
        }
        return i5 + (i2 - i);
    }

    @Nullable
    public final String getDescDateUTC(@NotNull Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = -12;
        while (true) {
            int i2 = i + 1;
            calendar.setTimeZone(TimeZone.getTimeZone(Intrinsics.stringPlus("GMT+", Integer.valueOf(i))));
            if (calendar.get(11) == 0) {
                return Intrinsics.stringPlus("GMT+", Integer.valueOf(i));
            }
            if (i2 > 12) {
                return null;
            }
            i = i2;
        }
    }

    public final long getDstOffset(long milli) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milli);
        return calendar.get(16);
    }

    @NotNull
    public final List<DateTriple> getMonthList(int year, int month, int offset) {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        if (offset > 0) {
            int i2 = offset + 1;
            if (1 < i2) {
                while (true) {
                    int i3 = i + 1;
                    arrayList.add(nextMonth(year, month, i));
                    if (i3 >= i2) {
                        break;
                    }
                    i = i3;
                }
            }
        } else {
            int iAbs = Math.abs(offset - 1);
            if (1 < iAbs) {
                while (true) {
                    int i4 = i + 1;
                    arrayList.add(preMonth(year, month, i));
                    if (i4 >= iAbs) {
                        break;
                    }
                    i = i4;
                }
            }
        }
        return arrayList;
    }

    public final int getMonthOfDay(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) ? 28 : 29;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }
    }

    public final boolean isCurrentDay(long time) {
        if (!isCurrentMonth(time)) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int i = calendar.get(5);
        b(calendar);
        return i == calendar.get(5);
    }

    public final boolean isCurrentMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return calendar.get(1) == year && calendar.get(2) + 1 == month;
    }

    public final boolean isCurrentYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return calendar.get(1) == year;
    }

    public final boolean isFeatureDay(long timeInMillis) {
        Calendar calendar = Calendar.getInstance();
        c(calendar);
        return timeInMillis >= calendar.getTimeInMillis() + 86400000;
    }

    public final boolean isFeatureMonth(int year, int month) {
        return AidKt.toMilli(DateTriple.reset$default(nextMonth$default(this, year, month, 0, 4, null), 0, 0, 1, 3, null)).getValue() > AidKt.toMilli(DateTriple.reset$default(AidKt.toDateTriple(new Milli(System.currentTimeMillis())), 0, 0, 1, 3, null)).getValue() && !isCurrentMonth(year, month);
    }

    @NotNull
    public final DateTriple nextMonth(int year, int month, int offset) {
        while (offset >= 1) {
            if (month == 12) {
                year++;
                month = 1;
            } else {
                month++;
            }
            offset--;
        }
        return new DateTriple(year, month, 1);
    }

    @NotNull
    public final DateTriple nowDate(long nowMillis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(nowMillis);
        return new DateTriple(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
    }

    @NotNull
    public final DateTriple offsetDay(int dayOffset, long nowMillis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(nowMillis);
        calendar.add(5, dayOffset);
        return new DateTriple(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
    }

    @NotNull
    public final Calendar offsetDayGetCalendar(int dayOffset, long nowMillis, boolean resetHour) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(nowMillis);
        calendar.add(5, dayOffset);
        if (resetHour) {
            a(calendar);
        }
        return calendar;
    }

    @NotNull
    public final DateTriple preMonth(int year, int month, int offset) {
        while (offset >= 1) {
            if (month == 1) {
                month = 12;
                year--;
            } else {
                month--;
            }
            offset--;
        }
        return new DateTriple(year, month, 1);
    }

    public final long resetHour(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        a(calendar);
        return calendar.getTimeInMillis();
    }

    @NotNull
    public final Date toDate(@NotNull Calendar calendar) {
        return new Date(calendar.getTimeInMillis());
    }

    @NotNull
    public final Date toUTC0(@NotNull Date date, boolean begin) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        calendar.setTimeInMillis(date.getTime());
        if (begin) {
            DateHelperKt.setStartOfDay(calendar);
        }
        return new Date(calendar.getTimeInMillis() + ((long) Math.abs(Calendar.getInstance().get(15))));
    }

    @NotNull
    public final Calendar today() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    @NotNull
    public final String convertUTCDateString(long time, @NotNull SimpleDateFormat format) {
        return format.format(Long.valueOf(time));
    }

    public final boolean isCurrentMonth(long time) {
        if (!isCurrentYear(time)) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int i = calendar.get(2);
        b(calendar);
        return i == calendar.get(2);
    }

    public final boolean isCurrentYear(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int i = calendar.get(1);
        b(calendar);
        return i == calendar.get(1);
    }
}
