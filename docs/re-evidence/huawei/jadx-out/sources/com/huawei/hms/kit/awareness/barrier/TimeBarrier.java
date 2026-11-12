package com.huawei.hms.kit.awareness.barrier;

import com.huawei.hms.kit.awareness.barrier.internal.a.f.a;
import com.huawei.hms.kit.awareness.barrier.internal.a.f.b;
import com.huawei.hms.kit.awareness.barrier.internal.a.f.c;
import com.huawei.hms.kit.awareness.barrier.internal.a.f.d;
import com.huawei.hms.kit.awareness.barrier.internal.a.f.e;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes34.dex */
public final class TimeBarrier {
    public static final int FRIDAY_CODE = 6;
    public static final int MONDAY_CODE = 2;
    public static final int SATURDAY_CODE = 7;
    public static final int SUNDAY_CODE = 1;
    public static final int SUNRISE_CODE = 0;
    public static final int SUNSET_CODE = 1;
    public static final int THURSDAY_CODE = 5;
    public static final int TIME_CATEGORY_AFTERNOON = 2;
    public static final int TIME_CATEGORY_EVENING = 3;
    public static final int TIME_CATEGORY_HOLIDAY = 5;
    public static final int TIME_CATEGORY_MORNING = 1;
    public static final int TIME_CATEGORY_NIGHT = 4;
    public static final int TIME_CATEGORY_NOT_HOLIDAY = 8;
    public static final int TIME_CATEGORY_WEEKDAY = 6;
    public static final int TIME_CATEGORY_WEEKEND = 7;
    public static final int TUESDAY_CODE = 3;
    public static final int WEDNESDAY_CODE = 4;

    public static AwarenessBarrier inTimeCategory(int i) {
        e eVarA = e.a(i);
        if (eVarA.j()) {
            return eVarA;
        }
        throw new IllegalArgumentException();
    }

    public static AwarenessBarrier inSunriseOrSunsetPeriod(int i, long j, long j2) {
        d dVarA = d.a(i, j, j2);
        if (dVarA.j()) {
            return dVarA;
        }
        throw new IllegalArgumentException();
    }

    public static AwarenessBarrier duringTimePeriod(long j, long j2) {
        c cVarA = c.a(j, j2);
        if (cVarA.j()) {
            return cVarA;
        }
        throw new IllegalArgumentException();
    }

    public static AwarenessBarrier duringPeriodOfWeek(int i, TimeZone timeZone, long j, long j2) {
        b bVarA = b.a(i, timeZone, j, j2);
        if (bVarA.j()) {
            return bVarA;
        }
        throw new IllegalArgumentException();
    }

    public static AwarenessBarrier duringPeriodOfDay(TimeZone timeZone, long j, long j2) {
        a aVarA = a.a(timeZone, j, j2);
        if (aVarA.j()) {
            return aVarA;
        }
        throw new IllegalArgumentException();
    }

    private TimeBarrier() {
    }
}
