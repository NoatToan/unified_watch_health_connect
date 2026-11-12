package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes14.dex */
class TimeSource {
    private static final TimeSource SYSTEM_TIME_SOURCE = new TimeSource(null, null);
    private final Long fixedTimeMs;
    private final TimeZone fixedTimeZone;

    private TimeSource(Long l14, TimeZone timeZone) {
        this.fixedTimeMs = l14;
        this.fixedTimeZone = timeZone;
    }

    public static TimeSource fixed(long j8) {
        return new TimeSource(Long.valueOf(j8), null);
    }

    public static TimeSource system() {
        return SYSTEM_TIME_SOURCE;
    }

    public Calendar now(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l14 = this.fixedTimeMs;
        if (l14 != null) {
            calendar.setTimeInMillis(l14.longValue());
        }
        return calendar;
    }

    public static TimeSource fixed(long j8, TimeZone timeZone) {
        return new TimeSource(Long.valueOf(j8), timeZone);
    }

    public Calendar now() {
        return now(this.fixedTimeZone);
    }
}
