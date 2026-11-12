package com.huami.sleep.util;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.module.ktx.I18nKt;
import com.huami.sleep.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\u001a3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0000H\u0002\u001a\n\u0010\u0010\u001a\u00020\u0003*\u00020\u000f\u001a\u0012\u0010\u0012\u001a\u00020\u0007*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007\u001a\n\u0010\u0012\u001a\u00020\u0007*\u00020\u000f\"\u0016\u0010\u0014\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013\"\u0016\u0010\u0016\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "useSimple", "needBlank", "", "", "getDurationStr", "(ILandroid/content/Context;ZZ)[Ljava/lang/String;", "getDurationText", "getTimesStr", "(ILandroid/content/Context;)[Ljava/lang/String;", "min", "a", "", "isToday", TrainingWebConst.QueryParam.VIDEO_FORMAT, "toDateString", LogUtil.I, "MINUTE_IN_HOUR", "b", "INT_10", "sleep_release"}, k = 2, mv = {1, 5, 1})
public final class TimeShowUtilsKt {
    private static final int a = 60;
    private static final int b = 10;

    private static final String a(int i) {
        String strI18n = I18nKt.i18n(i);
        if (i >= 10) {
            return strI18n;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%d%d", Arrays.copyOf(new Object[]{0, Integer.valueOf(i)}, 2));
    }

    @NotNull
    public static final String[] getDurationStr(int i, @NotNull Context context, boolean z, boolean z2) {
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 > 0) {
            if (z) {
                if (!z2) {
                    return new String[]{I18nKt.i18n(i2), context.getString(R.string.hm_common_hour), String.valueOf(a(i3)), context.getString(R.string.hm_common_minute)};
                }
                return new String[]{I18nKt.i18n(i2), context.getString(R.string.hm_common_hour), " " + a(i3), context.getString(R.string.hm_common_minute)};
            }
            if (!z2) {
                return new String[]{I18nKt.i18n(i2), context.getString(R.string.hm_common_hour_long), String.valueOf(a(i3)), context.getString(R.string.hm_common_minute_long)};
            }
            return new String[]{I18nKt.i18n(i2), context.getString(R.string.hm_common_hour_long), " " + a(i3), context.getString(R.string.hm_common_minute_long)};
        }
        if (i2 == 0 && i3 > 0) {
            if (!z2) {
                return new String[]{String.valueOf(I18nKt.i18n(i3)), context.getString(R.string.hm_common_minute_long)};
            }
            return new String[]{I18nKt.i18n(i3) + " ", context.getString(R.string.hm_common_minute_long)};
        }
        if (i2 != 0 || i3 != 0) {
            return new String[0];
        }
        if (!z2) {
            return new String[]{String.valueOf(I18nKt.i18n(0)), context.getString(R.string.hm_common_minute_long)};
        }
        return new String[]{I18nKt.i18n(0) + " ", context.getString(R.string.hm_common_minute_long)};
    }

    public static /* synthetic */ String[] getDurationStr$default(int i, Context context, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        return getDurationStr(i, context, z, z2);
    }

    @NotNull
    public static final String getDurationText(int i, @NotNull Context context, boolean z) {
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 <= 0) {
            if (i2 == 0 && i3 > 0) {
                return I18nKt.i18n(i3) + " " + context.getString(R.string.hm_common_minute_long);
            }
            if (i2 != 0 || i3 != 0) {
                return "";
            }
            return I18nKt.i18n(0) + " " + context.getString(R.string.hm_common_minute_long);
        }
        if (z) {
            return I18nKt.i18n(i2) + context.getString(R.string.hm_common_hour) + " " + a(i3) + context.getString(R.string.hm_common_minute);
        }
        return I18nKt.i18n(i2) + context.getString(R.string.hm_common_hour_long) + " " + a(i3) + context.getString(R.string.hm_common_minute_long);
    }

    public static /* synthetic */ String getDurationText$default(int i, Context context, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return getDurationText(i, context, z);
    }

    @NotNull
    public static final String[] getTimesStr(int i, @NotNull Context context) {
        return i <= 0 ? new String[]{"--", context.getString(R.string.unit_hr)} : new String[]{String.valueOf(i), context.getString(R.string.unit_hr)};
    }

    public static final boolean isToday(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        return calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5);
    }

    @NotNull
    public static final String toDateString(long j, @NotNull String str) {
        return new SimpleDateFormat(str, Locale.CHINA).format(Long.valueOf(j));
    }

    @NotNull
    public static final String toDateString(long j) {
        return toDateString(j, "yyyy-MM-dd");
    }
}
