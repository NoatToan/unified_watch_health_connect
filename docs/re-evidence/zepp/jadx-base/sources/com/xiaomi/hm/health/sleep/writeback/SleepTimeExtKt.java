package com.xiaomi.hm.health.sleep.writeback;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\"\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t\"\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"", "time", "Ljava/util/TimeZone;", "timeZone", "", "getSleepMinutes", "offset", "getTimeZone", "TIME_SIXTY_UNIT", LogUtil.I, "BASE_INDEX", "MILLISECOND_TO_SECOND_UNIT", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class SleepTimeExtKt {
    private static final int BASE_INDEX = 1440;
    public static final int MILLISECOND_TO_SECOND_UNIT = 1000;
    private static final int TIME_SIXTY_UNIT = 60;

    public static final int getSleepMinutes(long j, @NotNull TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.setTimeInMillis(j);
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        return calendar.get(9) == 0 ? (i * 60) + i2 : (i * 60) + i2 + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN;
    }

    public static /* synthetic */ int getSleepMinutes$default(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return getSleepMinutes(j, timeZone);
    }

    @NotNull
    public static final TimeZone getTimeZone(int i) {
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.setRawOffset(i * 1000);
        return timeZone;
    }
}
