package com.huami.step.utils;

import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u001c\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/step/utils/StepTimeUtils;", "", "", "time", "", "formatDate", "date", "Ljava/util/Date;", "parseDate", "", "minutes", "formatTimeHM", "a", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepTimeUtils {

    @NotNull
    public static final StepTimeUtils INSTANCE = new StepTimeUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "StepTimeUtils";

    private StepTimeUtils() {
    }

    @NotNull
    public final String formatDate(long time) {
        String strValueOf;
        String strValueOf2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        if (i2 < 10) {
            strValueOf = "0" + i2;
        } else {
            strValueOf = String.valueOf(i2);
        }
        if (i3 < 10) {
            strValueOf2 = "0" + i3;
        } else {
            strValueOf2 = String.valueOf(i3);
        }
        return i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + strValueOf + Constants.ACCEPT_TIME_SEPARATOR_SERVER + strValueOf2;
    }

    @NotNull
    public final String formatTimeHM(int minutes) {
        String strValueOf = String.valueOf(minutes / 60);
        String strValueOf2 = String.valueOf(minutes % 60);
        if (strValueOf.length() == 1 && strValueOf2.length() == 1) {
            return "0" + strValueOf + ":0" + strValueOf2 + ":00";
        }
        if (strValueOf.length() == 1 && strValueOf2.length() > 1) {
            return "0" + strValueOf + ":" + strValueOf2 + ":00";
        }
        if (strValueOf.length() <= 1 || strValueOf2.length() != 1) {
            return strValueOf + ":" + strValueOf2 + ":00";
        }
        return strValueOf + ":0" + strValueOf2 + ":00";
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    @Nullable
    public final Date parseDate(@NotNull String date) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(date);
    }
}
