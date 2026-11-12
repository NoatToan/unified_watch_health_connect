package com.huami.respiratoryrate.core.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/respiratoryrate/core/utils/TimeUtils;", "", "", "timestamp", "toUTC0StartTime", "toUTC0EndTime", "", "SECOND_UNIT", LogUtil.I, "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class TimeUtils {

    @NotNull
    public static final TimeUtils INSTANCE = new TimeUtils();
    public static final int SECOND_UNIT = 1000;

    private TimeUtils() {
    }

    public final long toUTC0EndTime(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        long j = 1000;
        calendar.setTimeInMillis(timestamp * j);
        TimeUtilsKt.setEndOfDay(calendar);
        return calendar.getTimeInMillis() / j;
    }

    public final long toUTC0StartTime(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        long j = 1000;
        calendar.setTimeInMillis(timestamp * j);
        TimeUtilsKt.setStartOfDay(calendar);
        return calendar.getTimeInMillis() / j;
    }
}
