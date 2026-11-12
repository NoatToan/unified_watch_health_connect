package com.xiaomi.fitness.training_plan.util;

import com.xiaomi.fitness.common.log.Logger;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/training_plan/util/RemindTimeUtils;", "", "<init>", "()V", "TAG", "", "getRemindTimeHour", "", "time", "getRemindTimeMinute", "formateTime", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemindTimeUtils {

    @NotNull
    public static final RemindTimeUtils INSTANCE = new RemindTimeUtils();

    @NotNull
    private static final String TAG = "RemindTimeUtils";

    private RemindTimeUtils() {
    }

    @NotNull
    public final String formateTime(int time) {
        if (time >= 10) {
            return String.valueOf(time);
        }
        return "0" + time;
    }

    public final int getRemindTimeHour(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        try {
            return Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) time, new String[]{":"}, false, 0, 6, (Object) null).get(0));
        } catch (Exception e) {
            Logger.e(TAG, "getLocalTimeHour exception: " + time, e);
            return Calendar.getInstance(Locale.getDefault()).get(11);
        }
    }

    public final int getRemindTimeMinute(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        try {
            return Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) time, new String[]{":"}, false, 0, 6, (Object) null).get(1));
        } catch (Exception e) {
            Logger.e(TAG, "getLocalTimeMinute exception: " + time, e);
            return Calendar.getInstance(Locale.getDefault()).get(12);
        }
    }
}
