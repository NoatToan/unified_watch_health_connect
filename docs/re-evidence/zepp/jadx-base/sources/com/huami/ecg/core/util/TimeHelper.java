package com.huami.ecg.core.util;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Calendar;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/huami/ecg/core/util/TimeHelper;", "", "", "dayMillis", "getDayStartTime", "getDayEndTime", "", "dateLimit", "getBeforeDaysStartTime", "SECOND_UNIT", LogUtil.I, "MAX_HOUR", "MAX_MIN", "DAY_HOUR", "HOUR_MIN", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class TimeHelper {
    public static final int DAY_HOUR = 24;
    public static final int HOUR_MIN = 60;
    public static final TimeHelper INSTANCE = new TimeHelper();
    public static final int MAX_HOUR = 23;
    public static final int MAX_MIN = 59;
    public static final int SECOND_UNIT = 1000;

    private TimeHelper() {
    }

    public final long getBeforeDaysStartTime(long dayMillis, int dateLimit) {
        return getDayStartTime(dayMillis) - ((long) ((((dateLimit - 1) * 24) * 60) * 60));
    }

    public final long getDayEndTime(long dayMillis) {
        Calendar calendar = Calendar.getInstance();
        long j = 1000;
        calendar.setTimeInMillis(dayMillis * j);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar.getTimeInMillis() / j;
    }

    public final long getDayStartTime(long dayMillis) {
        Calendar calendar = Calendar.getInstance();
        long j = 1000;
        calendar.setTimeInMillis(dayMillis * j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / j;
    }
}
