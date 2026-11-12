package com.huami.bodymeasurements.common.utils;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u001f\u001a\u00020\u0018J\u001e\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010#\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018J\u001e\u0010$\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018J\u001e\u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018¨\u0006)"}, d2 = {"Lcom/huami/bodymeasurements/common/utils/TimeUtils;", "", "", "time", "f", "e", z.j, "i", "h", "g", "l", hl.k, "", "offset", GoogleApiAvailabilityLight.b, "m", "o", "Ljava/util/Date;", "startDate", "endDate", "a", "c", "b", GoogleApiAvailabilityLight.a, "", "dateMode", "Lkotlin/Pair;", "getTimeRangeByDateMode", "getTimeExactToMinute", "getTimeExactToHour", "offsetDay", "getLocalTimeZoneDisplayName", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getDateStrToUI", "getDifferByDateMode", "getTimeFromStartByOffset", "", "isSamePeriod", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
public final class TimeUtils {

    @NotNull
    public static final TimeUtils INSTANCE = new TimeUtils();

    private TimeUtils() {
    }

    private final int a(Date startDate, Date endDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(endDate);
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

    private final int b(Date startDate, Date endDate) {
        Calendar calendar = Calendar.getInstance();
        TimeUtils timeUtils = INSTANCE;
        calendar.setTimeInMillis(timeUtils.h(startDate.getTime()));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(timeUtils.h(endDate.getTime()));
        if (calendar.get(1) == calendar2.get(1)) {
            return calendar2.get(2) - calendar.get(2);
        }
        return (calendar2.get(2) - calendar.get(2)) + ((calendar2.get(1) - calendar.get(1)) * 12);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    private final int c(Date startDate, Date endDate) {
        Calendar calendar = Calendar.getInstance();
        TimeUtils timeUtils = INSTANCE;
        calendar.setTimeInMillis(timeUtils.j(startDate.getTime()));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(timeUtils.j(endDate.getTime()));
        int i = -1;
        int i2 = calendar.get(7) - 1;
        if (i2 == 0) {
            i2 = 7;
        }
        int iA = a(calendar.getTime(), calendar2.getTime()) + 1;
        int i3 = iA / 7;
        if (iA > 0) {
            if ((iA % 7) + i2 > 7) {
                i = 1;
            } else {
                i = 0;
            }
        } else if (i2 + (iA % 7) >= 1) {
            i = 0;
        }
        return i3 + i;
    }

    private final int d(Date startDate, Date endDate) {
        Calendar calendar = Calendar.getInstance();
        TimeUtils timeUtils = INSTANCE;
        calendar.setTimeInMillis(timeUtils.l(startDate.getTime()));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(timeUtils.l(endDate.getTime()));
        return calendar2.get(1) - calendar.get(1);
    }

    private final long e(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    private final long f(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final long g(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(1, 0);
        calendar.add(2, 0);
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    private final long h(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(1, 0);
        calendar.add(2, 0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final long i(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        calendar.setTimeInMillis(time);
        calendar.set(7, calendar.getFirstDayOfWeek() + 6);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    private final long j(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        calendar.setTimeInMillis(time);
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final long k(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int i = calendar.get(1);
        calendar.clear();
        calendar.set(1, i);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        calendar.roll(6, -1);
        return calendar.getTimeInMillis();
    }

    private final long l(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(1, 0);
        calendar.add(2, 0);
        calendar.add(5, 0);
        calendar.set(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final long m(long time, int offset) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(2, offset);
        return calendar.getTimeInMillis();
    }

    private final long n(long time, int offset) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(3, offset);
        return calendar.getTimeInMillis();
    }

    private final long o(long time, int offset) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(1, offset);
        return calendar.getTimeInMillis();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final String getDateStrToUI(@NotNull String dateMode, @NotNull Context context, long time) {
        StringBuilder sb = new StringBuilder();
        switch (dateMode.hashCode()) {
            case 99228:
                if (dateMode.equals("day")) {
                    sb.append(TimeFormatUtils.INSTANCE.formatTimeYMD(context, time));
                }
                break;
            case 3645428:
                if (dateMode.equals("week")) {
                    Pair<Long, Long> timeRangeByDateMode = getTimeRangeByDateMode(time, dateMode);
                    long jLongValue = timeRangeByDateMode.component1().longValue();
                    long jLongValue2 = timeRangeByDateMode.component2().longValue();
                    TimeFormatUtils timeFormatUtils = TimeFormatUtils.INSTANCE;
                    sb.append(timeFormatUtils.formatTimeYMD(context, jLongValue));
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    sb.append(timeFormatUtils.formatTimeYMD(context, jLongValue2));
                }
                break;
            case 3704893:
                if (dateMode.equals("year")) {
                    sb.append(TimeFormatUtils.INSTANCE.getYear(time));
                }
                break;
            case 104080000:
                if (dateMode.equals("month")) {
                    sb.append(TimeFormatUtils.INSTANCE.formatTimeYM(context, time));
                }
                break;
        }
        return sb.toString();
    }

    public final int getDifferByDateMode(@NotNull Date startDate, @NotNull Date endDate, @NotNull String dateMode) {
        int iHashCode = dateMode.hashCode();
        if (iHashCode != 99228) {
            if (iHashCode != 3645428) {
                if (iHashCode == 104080000 && dateMode.equals("month")) {
                    return b(startDate, endDate);
                }
            } else if (dateMode.equals("week")) {
                return c(startDate, endDate);
            }
        } else if (dateMode.equals("day")) {
            return a(startDate, endDate);
        }
        return d(startDate, endDate);
    }

    @NotNull
    public final String getLocalTimeZoneDisplayName() {
        return TimeZone.getDefault().getID();
    }

    public final long getTimeExactToHour(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final long getTimeExactToMinute(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final long getTimeFromStartByOffset(@NotNull Date startDate, int offset, @NotNull String dateMode) {
        int iHashCode = dateMode.hashCode();
        if (iHashCode != 99228) {
            if (iHashCode != 3645428) {
                if (iHashCode == 104080000 && dateMode.equals("month")) {
                    return m(startDate.getTime(), offset);
                }
            } else if (dateMode.equals("week")) {
                return n(startDate.getTime(), offset);
            }
        } else if (dateMode.equals("day")) {
            return offsetDay(startDate.getTime(), offset);
        }
        return o(startDate.getTime(), offset);
    }

    @NotNull
    public final Pair<Long, Long> getTimeRangeByDateMode(long time, @NotNull String dateMode) {
        int iHashCode = dateMode.hashCode();
        if (iHashCode != 99228) {
            if (iHashCode != 3645428) {
                if (iHashCode == 104080000 && dateMode.equals("month")) {
                    return new Pair<>(Long.valueOf(h(time)), Long.valueOf(g(time)));
                }
            } else if (dateMode.equals("week")) {
                return new Pair<>(Long.valueOf(j(time)), Long.valueOf(i(time)));
            }
        } else if (dateMode.equals("day")) {
            return new Pair<>(Long.valueOf(f(time)), Long.valueOf(e(time)));
        }
        return new Pair<>(Long.valueOf(l(time)), Long.valueOf(k(time)));
    }

    public final boolean isSamePeriod(@NotNull Date startDate, @NotNull Date endDate, @NotNull String dateMode) {
        return getDifferByDateMode(startDate, endDate, dateMode) == 0;
    }

    public final long offsetDay(long time, int offset) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(6, offset);
        return calendar.getTimeInMillis();
    }
}
