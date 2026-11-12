package com.huami.bodymeasurements.common.utils;

import android.content.Context;
import com.huami.bodymeasurements.common.R;
import com.huami.tools.analytics.DbUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/bodymeasurements/common/utils/TimeFormatUtils;", "", "", "pattern", "", "time", "formatTime", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "formatTimeYMDHHmm", "formatTimeYMD", "formatTimeYM", "formatTimeMD", "getYear", "formatTimeHHmm", "PATTERN_YYY_MM_DD_HH_MM", "Ljava/lang/String;", "PATTERN_YYY_MM_DD", "PATTERN_YYY_MM", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
public final class TimeFormatUtils {

    @NotNull
    public static final TimeFormatUtils INSTANCE = new TimeFormatUtils();

    @NotNull
    public static final String PATTERN_YYY_MM = "yyyy/MM";

    @NotNull
    public static final String PATTERN_YYY_MM_DD = "yyyy/MM/dd";

    @NotNull
    public static final String PATTERN_YYY_MM_DD_HH_MM = "yyyy/MM/dd HH:mm";

    private TimeFormatUtils() {
    }

    @NotNull
    public final String formatTime(@NotNull String pattern, long time) {
        return new SimpleDateFormat(pattern, Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final String formatTimeHHmm(@NotNull Context context, long time) {
        return com.xiaomi.hm.health.baseutil.TimeUtils.formatDate(context.getString(R.string.time_HHmm_pattern), time);
    }

    @NotNull
    public final String formatTimeMD(@NotNull Context context, long time) {
        return com.xiaomi.hm.health.baseutil.TimeUtils.formatDate(context.getString(R.string.date_Md_pattern), time);
    }

    @NotNull
    public final String formatTimeYM(@NotNull Context context, long time) {
        return com.xiaomi.hm.health.baseutil.TimeUtils.formatDate(context.getString(R.string.date_yM_unit_pattern_escape), time);
    }

    @NotNull
    public final String formatTimeYMD(@NotNull Context context, long time) {
        return com.xiaomi.hm.health.baseutil.TimeUtils.formatDate(context.getString(R.string.date_yMd_pattern), time);
    }

    @NotNull
    public final String formatTimeYMDHHmm(@NotNull Context context, long time) {
        return context.getString(R.string.date_time_format_one, com.xiaomi.hm.health.baseutil.TimeUtils.formatDate(context.getString(R.string.date_yMd_pattern_escape), time), com.xiaomi.hm.health.baseutil.TimeUtils.formatDate(context.getString(R.string.time_HHmm_pattern), time));
    }

    @NotNull
    public final String getYear(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return String.valueOf(calendar.get(1));
    }
}
