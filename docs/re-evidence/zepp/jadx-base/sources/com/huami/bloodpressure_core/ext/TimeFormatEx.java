package com.huami.bloodpressure_core.ext;

import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.femalehealth.uilib.helper.ChartHelper;
import com.huami.tools.log.HMLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u0010\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u0004J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004R\u001e\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u00040\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/huami/bloodpressure_core/ext/TimeFormatEx;", "", "", "time", "", "formatTimeYYYY", "formatTimeYM", "formatTimeYMD", "formatTimeYMDInter", "timeStamp", "pattern", "formatTime", "formatTimeMD", "Ljava/util/Date;", "date", "formatDateYMD", "formatDate", "formatTimeHM", "formatTimeYMDHHmm", "formatTimeYMDHH", "formatTimeHHmm", "formatTimeHH", "dateString", "parseYMToLong", "(Ljava/lang/String;)Ljava/lang/Long;", "parseYMDToLong", "parseYMDInterToLong", "parseToLong", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "parseYMDToDate", "parseToDate", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class TimeFormatEx {

    @NotNull
    public static final TimeFormatEx INSTANCE = new TimeFormatEx();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = TimeFormatEx.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    private TimeFormatEx() {
    }

    @NotNull
    public final String formatDate(@Nullable Date date, @NotNull String pattern) {
        return date == null ? "" : new SimpleDateFormat(pattern, Locale.CHINA).format(date);
    }

    @NotNull
    public final String formatDateYMD(@Nullable Date date) {
        String str;
        return (date == null || (str = new SimpleDateFormat(TimeFormatUtils.PATTERN_YYY_MM_DD, Locale.CHINA).format(date)) == null) ? "" : str;
    }

    @NotNull
    public final String formatTime(long timeStamp, @NotNull String pattern) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp);
        Unit unit = Unit.INSTANCE;
        return formatDate(calendar.getTime(), pattern);
    }

    @NotNull
    public final String formatTimeHH(long timeStamp) {
        return formatTime(timeStamp, "HH:00");
    }

    @NotNull
    public final String formatTimeHHmm(long timeStamp) {
        return formatTime(timeStamp, "HH:mm");
    }

    @NotNull
    public final String formatTimeHM(long time) {
        try {
            return new SimpleDateFormat("HH:mm", Locale.CHINA).format(Long.valueOf(time));
        } catch (Exception e) {
            HMLog.debug(TAG, new a(e));
            return "HH:mm";
        }
    }

    @NotNull
    public final String formatTimeMD(long time) {
        return new SimpleDateFormat(ChartHelper.FMT_MM_DD, Locale.CHINA).format(new Date(time));
    }

    @NotNull
    public final String formatTimeYM(long time) {
        return new SimpleDateFormat(TimeFormatUtils.PATTERN_YYY_MM, Locale.CHINA).format(new Date(time));
    }

    @NotNull
    public final String formatTimeYMD(long time) {
        return new SimpleDateFormat(TimeFormatUtils.PATTERN_YYY_MM_DD, Locale.CHINA).format(new Date(time));
    }

    @NotNull
    public final String formatTimeYMDHH(long timeStamp) {
        return formatTime(timeStamp, "yyyy/MM/dd HH:00");
    }

    @NotNull
    public final String formatTimeYMDHHmm(long timeStamp) {
        return formatTime(timeStamp, TimeFormatUtils.PATTERN_YYY_MM_DD_HH_MM);
    }

    @NotNull
    public final String formatTimeYMDInter(long time) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date(time));
    }

    @NotNull
    public final String formatTimeYYYY(long time) {
        return new SimpleDateFormat("yyyy", Locale.CHINA).format(new Date(time));
    }

    @Nullable
    public final Date parseToDate(@NotNull String dateString, @NotNull String pattern) {
        try {
            return new SimpleDateFormat(pattern, Locale.CHINA).parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final Long parseToLong(@NotNull String dateString, @NotNull String pattern) {
        try {
            Date date = new SimpleDateFormat(pattern, Locale.CHINA).parse(dateString);
            if (date == null) {
                return null;
            }
            return Long.valueOf(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final Long parseYMDInterToLong(@NotNull String dateString) {
        return parseToLong(dateString, "yyyy-MM-dd");
    }

    @Nullable
    public final Date parseYMDToDate(@NotNull String dateString) {
        return parseToDate(dateString, "yyyy-MM-dd");
    }

    @Nullable
    public final Long parseYMDToLong(@NotNull String dateString) {
        return parseToLong(dateString, TimeFormatUtils.PATTERN_YYY_MM_DD);
    }

    @Nullable
    public final Long parseYMToLong(@NotNull String dateString) {
        return parseToLong(dateString, TimeFormatUtils.PATTERN_YYY_MM);
    }
}
