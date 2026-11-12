package com.huami.bloodoxygen.core.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b \bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b1\u00102J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002J\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002J\u0016\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0013J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0013J\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0016\u0010!\u001a\u00020\u00138\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00138\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00138\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010'\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0016\u0010)\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\"R\u0016\u0010*\u001a\u00020\u00138\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\"R\u0016\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u001fR\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u001fR\u0016\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u001f¨\u00063"}, d2 = {"Lcom/huami/bloodoxygen/core/utils/BloodOxygenUtils;", "", "", "timestamp", "", TrainingWebConst.QueryParam.VIDEO_FORMAT, "b", "date", "a", "timestampToYM", "timestampToYMD", "Ljava/util/TimeZone;", "timezone", "timestampToYMDHMS", "yMToTimestamp", "yMDToTimestamp", "yMDHMSToTimestamp", "second", "secondToHour", "", b.X, "timeInSeconds", "getOffsetOfTimeInSeconds", "timeMs", "getZeroTimeInMillis", "getLastTimeInMillis", "offset", "getZeroTimeInMillisOfDayOffset", "secondToMinuteLeftInHour", "time", "getHourTime", "Ljava/lang/String;", "TAG", "SECOND_IN_MINUTES", LogUtil.I, "SECOND_IN_HOUR", "MILLI_SECOND_IN_HOUR", "J", "DAY_IN_MINUTES", "DAY_IN_SECONDS", "c", "HOUR_IN_DAY", "MILLISECOND_IN_SECOND", "MILLI_SECOND_IN_DAY", GoogleApiAvailabilityLight.a, "YYYY_MM_DD", "e", "YYYY_MM", "YYYY_MM_DD_HH_MM_SS", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenUtils {
    public static final int DAY_IN_MINUTES = 1440;

    @NotNull
    public static final BloodOxygenUtils INSTANCE = new BloodOxygenUtils();
    public static final int MILLISECOND_IN_SECOND = 1000;
    public static final long MILLI_SECOND_IN_DAY = 86400000;
    public static final long MILLI_SECOND_IN_HOUR = 3600000;
    public static final int SECOND_IN_HOUR = 3600;
    public static final int SECOND_IN_MINUTES = 60;

    @NotNull
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd'T'HH:mm:ss";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "BloodOxygenUtils";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int DAY_IN_SECONDS = 86400;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int HOUR_IN_DAY = 24;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String YYYY_MM_DD = "yyyy-MM-dd";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String YYYY_MM = "yyyy-MM";

    private BloodOxygenUtils() {
    }

    private final long a(String date, String format) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Date date2 = new SimpleDateFormat(format, Locale.ENGLISH).parse(date);
            objM3845constructorimpl = Result.m3845constructorimpl(Long.valueOf(date2 == null ? 0L : date2.getTime()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.i(TAG, "dateToMillisecond error " + thM3848exceptionOrNullimpl.getMessage(), new Object[0]);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = 0L;
        }
        return ((Number) objM3845constructorimpl).longValue();
    }

    private final String b(long timestamp, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static /* synthetic */ String timestampToYMDHMS$default(BloodOxygenUtils bloodOxygenUtils, long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return bloodOxygenUtils.timestampToYMDHMS(j, timeZone);
    }

    public final long getHourTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
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

    public final int getOffsetOfTimeInSeconds(int base, int timeInSeconds) {
        return (timeInSeconds - base) / 60;
    }

    public final long getZeroTimeInMillis(long timeMs) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(timeMs));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final long getZeroTimeInMillisOfDayOffset(long timeMs, int offset) {
        return getZeroTimeInMillis(timeMs + (((long) offset) * 86400000));
    }

    public final long secondToHour(long second) {
        return (second / ((long) 3600)) - ((second / ((long) 86400)) * ((long) 24));
    }

    public final int secondToMinuteLeftInHour(int second) {
        int i = second / 86400;
        return ((second / 60) - (i * 1440)) - (((second / 3600) - (i * 24)) * 60);
    }

    @NotNull
    public final String timestampToYM(long timestamp) {
        return b(timestamp, "yyyy-MM");
    }

    @NotNull
    public final String timestampToYMD(long timestamp) {
        return b(timestamp, "yyyy-MM-dd");
    }

    @NotNull
    public final String timestampToYMDHMS(long timestamp, @NotNull TimeZone timezone) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(timezone);
            objM3845constructorimpl = Result.m3845constructorimpl(simpleDateFormat.format(Long.valueOf(timestamp)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = "";
        }
        return (String) objM3845constructorimpl;
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
