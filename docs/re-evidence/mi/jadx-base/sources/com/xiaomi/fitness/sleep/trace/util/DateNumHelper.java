package com.xiaomi.fitness.sleep.trace.util;

import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/util/DateNumHelper;", "", "<init>", "()V", "calcDateNum", "", "dateTimeMillis", "calcTimestamp", "dateNum", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DateNumHelper {

    @NotNull
    public static final DateNumHelper INSTANCE = new DateNumHelper();

    private DateNumHelper() {
    }

    public final long calcDateNum(long dateTimeMillis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
        calendar.setTimeInMillis(dateTimeMillis);
        TimeUtils.setToZeroOClock(calendar);
        return calendar.getTimeInMillis();
    }

    public final long calcTimestamp(long dateNum) {
        return dateNum;
    }
}
