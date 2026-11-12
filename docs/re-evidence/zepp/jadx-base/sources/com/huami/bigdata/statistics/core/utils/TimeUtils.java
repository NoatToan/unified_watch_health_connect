package com.huami.bigdata.statistics.core.utils;

import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000bJ\u001e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/bigdata/statistics/core/utils/TimeUtils;", "", "", "date", TrainingWebConst.QueryParam.VIDEO_FORMAT, "", "a", "yMToTimestamp", "yMDToTimestamp", "yMDHMSToTimestamp", "timestamp", "Ljava/util/TimeZone;", "timezone", "timestampToYM", "timestampToYMD", "timestampToYMDHMS", "timestampToFormat", "timeMs", "getLastTimeInMillis", "Ljava/lang/String;", "TAG", "YYYY_MM", "YYYY_MM_DD", "YYYY_MM_DD_HH_MM_SS", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class TimeUtils {

    @NotNull
    public static final TimeUtils INSTANCE = new TimeUtils();

    @NotNull
    public static final String YYYY_MM = "yyyy-MM";

    @NotNull
    public static final String YYYY_MM_DD = "yyyy-MM-dd";

    @NotNull
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd'T'HH:mm:ss";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "TimeUtils";

    private TimeUtils() {
    }

    private final long a(String date, String format) {
        Date date2 = new SimpleDateFormat(format, Locale.ENGLISH).parse(date);
        return (date2 == null ? null : Long.valueOf(date2.getTime())).longValue();
    }

    public static /* synthetic */ String timestampToYM$default(TimeUtils timeUtils, long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return timeUtils.timestampToYM(j, timeZone);
    }

    public static /* synthetic */ String timestampToYMD$default(TimeUtils timeUtils, long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return timeUtils.timestampToYMD(j, timeZone);
    }

    public static /* synthetic */ String timestampToYMDHMS$default(TimeUtils timeUtils, long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return timeUtils.timestampToYMDHMS(j, timeZone);
    }

    public final long getLastTimeInMillis(long timeMs) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(timeMs));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.set(6, calendar.get(6) + 1);
        calendar.set(14, calendar.get(14) - 1);
        return calendar.getTimeInMillis();
    }

    @NotNull
    public final String timestampToFormat(long timestamp, @NotNull String format, @NotNull TimeZone timezone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.ENGLISH);
        simpleDateFormat.setTimeZone(timezone);
        return simpleDateFormat.format(Long.valueOf(timestamp));
    }

    @NotNull
    public final String timestampToYM(long timestamp, @NotNull TimeZone timezone) {
        return timestampToFormat(timestamp, "yyyy-MM", timezone);
    }

    @NotNull
    public final String timestampToYMD(long timestamp, @NotNull TimeZone timezone) {
        return timestampToFormat(timestamp, "yyyy-MM-dd", timezone);
    }

    @NotNull
    public final String timestampToYMDHMS(long timestamp, @NotNull TimeZone timezone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(timezone);
        return simpleDateFormat.format(Long.valueOf(timestamp));
    }

    public final long yMDHMSToTimestamp(@NotNull String date) {
        return a(date, "yyyy-MM-dd'T'HH:mm:ss");
    }

    public final long yMDToTimestamp(@NotNull String date) {
        return a(date, "yyyy-MM-dd");
    }

    public final long yMToTimestamp(@NotNull String date) {
        return a(date, "yyyy-MM");
    }
}
