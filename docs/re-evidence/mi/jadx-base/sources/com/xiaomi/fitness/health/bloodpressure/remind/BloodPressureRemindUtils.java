package com.xiaomi.fitness.health.bloodpressure.remind;

import android.content.Context;
import android.content.res.Resources;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository;
import defpackage.c0j;
import defpackage.i4b;
import defpackage.ohi;
import defpackage.tz2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0005J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u0015\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\u0005R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010#R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010#R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u0014\u0010/\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010#¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/remind/BloodPressureRemindUtils;", "", "", "index", "getMidRepeatByArrayIndex", "(I)I", "repeat", "getMidArrayRepeatIndex", "getNormalRepeatByArrayIndex", "getNormalArrayRepeatIndex", "Landroid/content/Context;", "context", "", "days", "", "getCustomRepeatFormatString", "(Landroid/content/Context;[I)Ljava/lang/String;", "getMidRepeatString", "(Landroid/content/Context;I)Ljava/lang/String;", "code", "getRepeatDays", "(I)[I", "", "checkIsSuccessive", "([I)Z", "key", "getDefaultRemindMeasureString", "(Ljava/lang/String;)Ljava/lang/String;", "Ltz2;", "getDefaultRemindMeasureData", "(Ljava/lang/String;)Ltz2;", "getCountsByCode", "value", "formatWeekIndex", "WEEK_MON", "I", "WEEK_TUE", "WEEK_WED", "WEEK_THU", "WEEK_FRI", "WEEK_SAT", "WEEK_SUN", "DEFAULT_ONE_REMIND_TIMES", "[I", "DEFAULT_TWO_REMIND_TIMES", "DEFAULT_THREE_REMIND_TIMES", "CUSTOM_THREE_REMIND_TIMES", "DEFAULT_CUSTOM_START_REMIND_TIME", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodPressureRemindUtils {
    public static final int DEFAULT_CUSTOM_START_REMIND_TIME = 480;
    private static final int WEEK_FRI = 16;
    private static final int WEEK_MON = 1;
    private static final int WEEK_SAT = 32;
    private static final int WEEK_SUN = 64;
    private static final int WEEK_THU = 8;
    private static final int WEEK_TUE = 2;
    private static final int WEEK_WED = 4;

    @NotNull
    public static final BloodPressureRemindUtils INSTANCE = new BloodPressureRemindUtils();

    @NotNull
    private static final int[] DEFAULT_ONE_REMIND_TIMES = {480};

    @NotNull
    private static final int[] DEFAULT_TWO_REMIND_TIMES = {480, 1320};

    @NotNull
    private static final int[] DEFAULT_THREE_REMIND_TIMES = {480, 780, 1320};

    @NotNull
    private static final int[] CUSTOM_THREE_REMIND_TIMES = {480};

    private BloodPressureRemindUtils() {
    }

    private final boolean checkIsSuccessive(int[] days) {
        int length = days.length;
        for (int i = 1; i < length; i++) {
            if (days[i - 1] != days[i] - 1) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    @NotNull
    public static final String getCustomRepeatFormatString(@NotNull Context context, @NotNull int[] days) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(days, "days");
        Objects.requireNonNull(days);
        int length = days.length;
        BloodPressureRemindUtils bloodPressureRemindUtils = INSTANCE;
        boolean zCheckIsSuccessive = bloodPressureRemindUtils.checkIsSuccessive(days);
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
            String string3 = resources.getString(c0j.E1, stringArray[bloodPressureRemindUtils.formatWeekIndex(days[0]) - 1]);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        if (length > 3 && zCheckIsSuccessive) {
            String string4 = resources.getString(c0j.F1, stringArray[bloodPressureRemindUtils.formatWeekIndex(days[0]) - 1], stringArray[bloodPressureRemindUtils.formatWeekIndex(days[days.length - 1]) - 1]);
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final tz2 getDefaultRemindMeasureData(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Objects.requireNonNull(key);
        switch (key.hashCode()) {
            case -1349088399:
                if (key.equals("custom")) {
                    return new tz2(1, 1, CUSTOM_THREE_REMIND_TIMES);
                }
                break;
            case -1039745817:
                if (key.equals("normal")) {
                    return new tz2(1, 1, DEFAULT_ONE_REMIND_TIMES);
                }
                break;
            case -905723276:
                if (key.equals(BloodPressurePreRepository.KEY_ITEM_SEVERE)) {
                    return new tz2(127, 3, DEFAULT_THREE_REMIND_TIMES);
                }
                break;
            case -699686236:
                if (key.equals(BloodPressurePreRepository.KEY_REMIND_DATA)) {
                    tz2 tz2VarA = tz2.a();
                    Intrinsics.checkNotNullExpressionValue(tz2VarA, "empty(...)");
                    return tz2VarA;
                }
                break;
            case -618857213:
                if (key.equals(BloodPressurePreRepository.KEY_ITEM_MODERATE)) {
                    return new tz2(127, 2, DEFAULT_TWO_REMIND_TIMES);
                }
                break;
            case 108104:
                if (key.equals(BloodPressurePreRepository.KEY_ITEM_MID)) {
                    return new tz2(21, 2, DEFAULT_TWO_REMIND_TIMES);
                }
                break;
        }
        throw new IllegalArgumentException("getDefaultRemindMeasureData key type illegal");
    }

    @NotNull
    public final String getDefaultRemindMeasureString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String json = i4b.a().toJson(getDefaultRemindMeasureData(key));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
