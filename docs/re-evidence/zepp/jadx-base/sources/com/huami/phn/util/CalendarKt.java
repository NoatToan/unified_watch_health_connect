package com.huami.phn.util;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\u0019\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\b\u001a\r\u0010\b\u001a\u00020\u0007*\u00020\u0001H\u0086\b\u001a\u0017\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0086\b¨\u0006\u000b"}, d2 = {"Ljava/util/Calendar;", "", "getTimezoneOffset", "", "timestamp", "timeZoneOffset", "timestampToCalendar", "Ljava/util/TimeZone;", "toTimeZone", "day", "theDayBefore", "phn_coach_release"}, k = 2, mv = {1, 5, 1})
public final class CalendarKt {
    public static final int getTimezoneOffset(@NotNull Calendar calendar) {
        return (-(calendar.get(15) + calendar.get(16))) / 60000;
    }

    @NotNull
    public static final Calendar theDayBefore(@NotNull Calendar calendar, int i) {
        Calendar calendar2 = Calendar.getInstance(calendar.getTimeZone());
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        calendar2.add(6, -i);
        return calendar2;
    }

    public static /* synthetic */ Calendar theDayBefore$default(Calendar calendar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        Calendar calendar2 = Calendar.getInstance(calendar.getTimeZone());
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        calendar2.add(6, -i);
        return calendar2;
    }

    @NotNull
    public static final Calendar timestampToCalendar(long j, int i) {
        String str = i > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+";
        int iAbs = Math.abs(i);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)}, 3))));
        calendar.setTimeInMillis(j);
        return calendar;
    }

    @NotNull
    public static final TimeZone toTimeZone(int i) {
        String str = i > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+";
        int iAbs = Math.abs(i);
        return TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)}, 3)));
    }
}
