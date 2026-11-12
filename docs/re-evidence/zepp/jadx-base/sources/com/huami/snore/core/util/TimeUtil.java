package com.huami.snore.core.util;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.core.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.Constant;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/huami/snore/core/util/TimeUtil;", "", "Ljava/util/Date;", "date", "", "formatTime", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getPrefix_zh", "", "getMin", "formatTime_zh", "a", LogUtil.I, "TIME_LEVEL_0", "b", "TIME_LEVEL_1", "c", "TIME_LEVEL_2", GoogleApiAvailabilityLight.a, "TIME_LEVEL_3", "e", "TIME_LEVEL_4", "f", "TIME_LEVEL_5", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class TimeUtil {

    @NotNull
    public static final TimeUtil INSTANCE = new TimeUtil();

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

    private TimeUtil() {
    }

    @NotNull
    public final String formatTime(@Nullable Date date) {
        return new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault()).format(date);
    }

    @Nullable
    public final String formatTime_zh(@Nullable Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH", Locale.getDefault());
        Integer numValueOf = Integer.valueOf(simpleDateFormat.format(date));
        if (numValueOf == null || numValueOf.intValue() != 0) {
            simpleDateFormat.applyPattern("hh:mm");
            return simpleDateFormat.format(date);
        }
        simpleDateFormat.applyPattern(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
        return "00:" + simpleDateFormat.format(date);
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
            return context.getString(R.string.snore_unit_week_hour);
        }
        if (300 <= min && min < 480) {
            return context.getString(R.string.snore_unit_morning);
        }
        if (480 <= min && min < TIME_LEVEL_2) {
            return context.getString(R.string.snore_am);
        }
        if (TIME_LEVEL_2 <= min && min < TIME_LEVEL_3) {
            return context.getString(R.string.snore_unit_moon);
        }
        if (TIME_LEVEL_3 <= min && min < TIME_LEVEL_4) {
            return context.getString(R.string.snore_pm);
        }
        return TIME_LEVEL_4 <= min && min < 1440 ? context.getString(R.string.snore_unit_evening) : "";
    }

    @Nullable
    public final String formatTime(@NotNull Context context, @Nullable Date date) {
        String[] strArr = new String[2];
        String string = "";
        if (DateFormat.is24HourFormat(context.getApplicationContext())) {
            strArr[0] = "";
            string = context.getString(R.string.snore_time_HHmm_pattern);
        } else if (Language.INSTANCE.isChinese()) {
            strArr[0] = getPrefix_zh(context, date);
            strArr[1] = formatTime_zh(date);
        } else {
            strArr[0] = "";
            string = context.getString(R.string.snore_time_hhmma_pattern);
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
}
