package com.huami.sky.ui.utils;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sky.ui.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\"\u0016\u0010\u0007\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroid/content/Context;", "", "seconds", "", "secondsFormat", "Lkotlin/Triple;", "secondsToHMS", "ONE_HOUR_SECOND", LogUtil.I, "ONE_MINUTES_SECOND", "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class SkyDateFormatKt {
    public static final int ONE_HOUR_SECOND = 3600;
    public static final int ONE_MINUTES_SECOND = 60;

    @Nullable
    public static final String secondsFormat(@NotNull Context context, int i) {
        Triple<Integer, Integer, Integer> tripleSecondsToHMS = secondsToHMS(i);
        int iIntValue = tripleSecondsToHMS.component1().intValue();
        int iIntValue2 = tripleSecondsToHMS.component2().intValue();
        int iIntValue3 = tripleSecondsToHMS.component3().intValue();
        if (iIntValue > 0 && iIntValue2 == 0 && iIntValue3 == 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(context.getString(R.string.sky_seconds_format_h, Integer.valueOf(iIntValue)), Arrays.copyOf(new Object[0], 0));
        }
        if (iIntValue == 0 && iIntValue2 > 0 && iIntValue3 == 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            return String.format(context.getString(R.string.sky_seconds_format_m, Integer.valueOf(iIntValue2)), Arrays.copyOf(new Object[0], 0));
        }
        if (iIntValue == 0 && iIntValue2 == 0 && iIntValue3 > 0) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            return String.format(context.getString(R.string.sky_seconds_format_s, Integer.valueOf(iIntValue3)), Arrays.copyOf(new Object[0], 0));
        }
        if (iIntValue > 0 && iIntValue2 > 0 && iIntValue3 == 0) {
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            return String.format(context.getString(R.string.sky_seconds_format_h_m, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)), Arrays.copyOf(new Object[0], 0));
        }
        if (iIntValue == 0 && iIntValue2 > 0 && iIntValue3 > 0) {
            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
            return String.format(context.getString(R.string.sky_seconds_format_m_s, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)), Arrays.copyOf(new Object[0], 0));
        }
        if (iIntValue > 0 && iIntValue2 == 0 && iIntValue3 > 0) {
            StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
            return String.format(context.getString(R.string.sky_seconds_format_h_s, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue3)), Arrays.copyOf(new Object[0], 0));
        }
        if (iIntValue <= 0 || iIntValue2 <= 0 || iIntValue3 <= 0) {
            return null;
        }
        StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
        return String.format(context.getString(R.string.sky_seconds_format_full, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)), Arrays.copyOf(new Object[0], 0));
    }

    @NotNull
    public static final Triple<Integer, Integer, Integer> secondsToHMS(int i) {
        int i2 = i / 3600;
        int i3 = i % 3600;
        return new Triple<>(Integer.valueOf(i2), Integer.valueOf(i3 / 60), Integer.valueOf(i3 % 60));
    }
}
