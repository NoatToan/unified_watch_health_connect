package com.xiaomi.hm.health.bodyfat.utils;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.bodyfat.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001a\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J \u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006J \u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\"\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nJ\"\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0017\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0019\u001a\u00020\u0006R\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001b¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/utils/BodyFatTimeUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "time", "", "isShort", "", "formatDateTime_no_y", "Ljava/util/Date;", "date", "formatDate_no_y", "start", Command.STOP, "", "getDeltaDayCount", "formatDateTime", "pattern", "formatDate", "formatDateYmd", "formatTime", "getPrefix_zh", "getMin", "formatTime_zh", "isChinese", "a", LogUtil.I, "TIME_LEVEL_0", "b", "TIME_LEVEL_1", "c", "TIME_LEVEL_2", GoogleApiAvailabilityLight.a, "TIME_LEVEL_3", "e", "TIME_LEVEL_4", "f", "TIME_LEVEL_5", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyFatTimeUtils {

    @NotNull
    public static final BodyFatTimeUtils INSTANCE = new BodyFatTimeUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int TIME_LEVEL_0 = 300;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int TIME_LEVEL_1 = 480;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int TIME_LEVEL_2 = 660;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int TIME_LEVEL_3 = 780;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int TIME_LEVEL_4 = 1080;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int TIME_LEVEL_5 = 1440;

    private BodyFatTimeUtils() {
    }

    @Nullable
    public final String formatDate(@Nullable String pattern, long time) {
        return formatDate(pattern, new Date(time));
    }

    @Nullable
    public final String formatDateTime(@NotNull Context context, @Nullable Date date) {
        return context.getString(R.string.date_time_format_one, new SimpleDateFormat(context.getString(R.string.date_yMd_unit_pattern), Locale.getDefault()).format(date), formatTime(context, date));
    }

    @Nullable
    public final String formatDateTime_no_y(@NotNull Context context, long time, boolean isShort) {
        return formatDateTime_no_y(context, new Date(time), isShort);
    }

    @Nullable
    public final String formatDateYmd(@NotNull Context context, @Nullable Date date) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        calendar.setTime(date);
        return new SimpleDateFormat(i - calendar.get(1) == 0 ? context.getString(R.string.date_Md_pattern) : context.getString(R.string.date_yMd_pattern), Locale.getDefault()).format(date);
    }

    @Nullable
    public final String formatDate_no_y(@NotNull Context context, long time, boolean isShort) {
        return formatDate_no_y(context, new Date(time), isShort);
    }

    @Nullable
    public final String formatTime(@NotNull Context context, @Nullable Date date) {
        String[] strArr = new String[2];
        String string = "";
        if (DateFormat.is24HourFormat(context.getApplicationContext())) {
            strArr[0] = "";
            string = context.getString(R.string.time_HHmm_pattern);
        } else if (isChinese()) {
            strArr[0] = getPrefix_zh(context, date);
            strArr[1] = formatTime_zh(date);
        } else {
            strArr[0] = "";
            string = context.getString(R.string.time_hhmma_pattern);
        }
        if (TextUtils.isEmpty(strArr[1])) {
            strArr[1] = new SimpleDateFormat(string, Locale.getDefault()).format(date);
        }
        if (TextUtils.isEmpty(strArr[0])) {
            return strArr[1];
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%s %s", Arrays.copyOf(new Object[]{strArr[0], strArr[1]}, 2));
    }

    @Nullable
    public final String formatTime_zh(@Nullable Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH", Locale.getDefault());
        Integer numValueOf = Integer.valueOf(simpleDateFormat.format(date));
        if (numValueOf != null && numValueOf.intValue() == 0) {
            simpleDateFormat.applyPattern(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
            return Intrinsics.stringPlus("00:", simpleDateFormat.format(date));
        }
        simpleDateFormat.applyPattern("hh:mm");
        return simpleDateFormat.format(date);
    }

    public final int getDeltaDayCount(@Nullable Date start, @Nullable Date stop) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(stop);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return (int) ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / ((long) 86400000));
    }

    public final int getMin(@Nullable Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    @Nullable
    public final String getPrefix_zh(@NotNull Context context, @Nullable Date date) {
        int min = getMin(date);
        if (min >= 0 && min < 300) {
            return context.getString(R.string.unit_week_hour);
        }
        if (300 <= min && min < 480) {
            return context.getString(R.string.unit_morning);
        }
        if (480 <= min && min < TIME_LEVEL_2) {
            return context.getString(R.string.unit_forenoon);
        }
        if (TIME_LEVEL_2 <= min && min < TIME_LEVEL_3) {
            return context.getString(R.string.unit_moon);
        }
        if (TIME_LEVEL_3 <= min && min < TIME_LEVEL_4) {
            return context.getString(R.string.unit_afternoon);
        }
        return TIME_LEVEL_4 <= min && min < 1440 ? context.getString(R.string.unit_evening) : "";
    }

    public final boolean isChinese() {
        return Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage());
    }

    @Nullable
    public final String formatDate(@Nullable String pattern, @NotNull Date date) {
        return new SimpleDateFormat(pattern, Locale.getDefault()).format(date);
    }

    @Nullable
    public final String formatDateTime_no_y(@NotNull Context context, @Nullable Date date, boolean isShort) {
        return context.getString(R.string.date_time_format_one, formatDate_no_y(context, date, isShort), formatTime(context, date));
    }

    @Nullable
    public final String formatDate_no_y(@NotNull Context context, @Nullable Date date, boolean isShort) {
        String string;
        if (isShort) {
            string = context.getString(R.string.date_Md_pattern);
        } else {
            string = context.getString(R.string.date_Md_unit_pattern);
        }
        return new SimpleDateFormat(string, Locale.getDefault()).format(date);
    }

    @Nullable
    public final String formatDate(@NotNull Context context, @Nullable Date date, boolean isShort) {
        return new SimpleDateFormat(context.getString(isShort ? R.string.date_yMd_pattern : R.string.date_yMd_unit_pattern), Locale.getDefault()).format(date);
    }

    @Nullable
    public final String formatTime(@NotNull Context context, long time) {
        return formatTime(context, new Date(time));
    }
}
