package com.xiaomi.fitness.health.todayhealth.model;

import android.content.Context;
import android.content.res.Resources;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import defpackage.c0j;
import defpackage.i4b;
import defpackage.ohi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0007J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0007J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0007J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0007J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rH\u0007J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0005H\u0007J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005J\u0010\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0005H\u0007J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckSettingUtils;", "", "<init>", "()V", "WEEK_MON", "", "WEEK_TUE", "WEEK_WED", "WEEK_THU", "WEEK_FRI", "WEEK_SAT", "WEEK_SUN", "DEFAULT_ONE_REMIND_TIMES", "", "DEFAULT_TWO_REMIND_TIMES", "DEFAULT_THREE_REMIND_TIMES", "DEFAULT_CUSTOM_START_REMIND_TIME", "getDefaultRemindMeasureString", "", "getDefaultRemindMeasureData", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckMeasureReminderSettingData;", "getMidRepeatByArrayIndex", "index", "getMidArrayRepeatIndex", "repeat", "getNormalRepeatByArrayIndex", "getNormalArrayRepeatIndex", "getCustomRepeatFormatString", "context", "Landroid/content/Context;", "days", "getMidRepeatString", "getCountsByCode", "code", "formatWeekIndex", "value", "getRepeatDays", "checkIsSuccessive", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthCheckSettingUtils {
    public static final int DEFAULT_CUSTOM_START_REMIND_TIME = 480;
    private static final int WEEK_FRI = 16;
    private static final int WEEK_MON = 1;
    private static final int WEEK_SAT = 32;
    private static final int WEEK_SUN = 64;
    private static final int WEEK_THU = 8;
    private static final int WEEK_TUE = 2;
    private static final int WEEK_WED = 4;

    @NotNull
    public static final HealthCheckSettingUtils INSTANCE = new HealthCheckSettingUtils();

    @NotNull
    private static final int[] DEFAULT_ONE_REMIND_TIMES = {480};

    @NotNull
    private static final int[] DEFAULT_TWO_REMIND_TIMES = {480, 1320};

    @NotNull
    private static final int[] DEFAULT_THREE_REMIND_TIMES = {480, 780, 1320};

    private HealthCheckSettingUtils() {
    }

    private final boolean checkIsSuccessive(int[] days) {
        return days.length == 0 || ArraysKt___ArraysKt.last(days) - ArraysKt___ArraysKt.first(days) == days.length - 1;
    }

    @JvmStatic
    @NotNull
    public static final String getCustomRepeatFormatString(@NotNull Context context, @NotNull int[] days) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(days, "days");
        Objects.requireNonNull(days);
        int length = days.length;
        HealthCheckSettingUtils healthCheckSettingUtils = INSTANCE;
        boolean zCheckIsSuccessive = healthCheckSettingUtils.checkIsSuccessive(days);
        Resources resources = context.getResources();
        String[] stringArray = resources.getStringArray(ohi.common_week_array);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (length == 0) {
            String string = resources.getString(c0j.u5);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (length == 7) {
            String string2 = resources.getString(c0j.k5);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (length == 1) {
            String string3 = resources.getString(c0j.E1, stringArray[healthCheckSettingUtils.formatWeekIndex(days[0]) - 1]);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        if (length > 3 && zCheckIsSuccessive) {
            String string4 = resources.getString(c0j.F1, stringArray[healthCheckSettingUtils.formatWeekIndex(days[0]) - 1], stringArray[healthCheckSettingUtils.formatWeekIndex(days[days.length - 1]) - 1]);
            Intrinsics.checkNotNull(string4);
            return string4;
        }
        StringBuilder sb = new StringBuilder(resources.getString(c0j.E1));
        int i = 2;
        if (2 <= length) {
            while (true) {
                sb.append(",%");
                sb.append(i);
                sb.append("$");
                sb.append("s");
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        int length2 = days.length;
        String[] strArr = new String[length2];
        int length3 = days.length;
        for (int i2 = 0; i2 < length3; i2++) {
            strArr[i2] = stringArray[INSTANCE.formatWeekIndex(days[i2]) - 1];
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string5 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, length2);
        String str = String.format(string5, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @JvmStatic
    public static final int getMidArrayRepeatIndex(int repeat) {
        int midRepeatByArrayIndex = getMidRepeatByArrayIndex(0);
        int midRepeatByArrayIndex2 = getMidRepeatByArrayIndex(1);
        if ((repeat & midRepeatByArrayIndex) == midRepeatByArrayIndex) {
            return 0;
        }
        return (repeat & midRepeatByArrayIndex2) == midRepeatByArrayIndex2 ? 1 : 2;
    }

    @JvmStatic
    public static final int getMidRepeatByArrayIndex(int index) {
        if (index != 0) {
            return index != 1 ? 84 : 42;
        }
        return 21;
    }

    @JvmStatic
    @NotNull
    public static final String getMidRepeatString(@NotNull Context context, int index) {
        Intrinsics.checkNotNullParameter(context, "context");
        Objects.requireNonNull(context);
        String[] stringArray = context.getResources().getStringArray(ohi.c);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (index < 0 || index >= stringArray.length) {
            String string = context.getString(c0j.h2);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String str = stringArray[index];
        Intrinsics.checkNotNull(str);
        return str;
    }

    @JvmStatic
    public static final int getNormalArrayRepeatIndex(int repeat) {
        int i = 1;
        if (repeat == 1) {
            return 0;
        }
        if (repeat != 2) {
            i = 4;
            if (repeat == 4) {
                return 2;
            }
            if (repeat == 8) {
                return 3;
            }
            if (repeat != 16) {
                if (repeat != 32) {
                    return repeat != 64 ? 0 : 6;
                }
                return 5;
            }
        }
        return i;
    }

    @JvmStatic
    public static final int getNormalRepeatByArrayIndex(int index) {
        switch (index) {
            case 0:
            default:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
        }
    }

    @JvmStatic
    @NotNull
    public static final int[] getRepeatDays(int code) {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (code != 0) {
            if ((code & 1) == 1) {
                arrayList.add(Integer.valueOf(i));
            }
            i++;
            code >>= 1;
        }
        return ArrayUtils.INSTANCE.toIntArray(arrayList);
    }

    public final int formatWeekIndex(int value) {
        if (value == 7) {
            return 1;
        }
        return 1 + value;
    }

    public final int getCountsByCode(int code) {
        int i = 0;
        while (code != 0) {
            if ((code & 1) == 1) {
                i++;
            }
            code >>= 1;
        }
        return i;
    }

    @NotNull
    public final HealthCheckMeasureReminderSettingData getDefaultRemindMeasureData() {
        return new HealthCheckMeasureReminderSettingData(1, 1, DEFAULT_ONE_REMIND_TIMES);
    }

    @NotNull
    public final String getDefaultRemindMeasureString() {
        String json = i4b.a().toJson(getDefaultRemindMeasureData());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
