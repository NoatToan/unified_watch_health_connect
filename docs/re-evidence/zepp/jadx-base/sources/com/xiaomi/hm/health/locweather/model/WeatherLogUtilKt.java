package com.xiaomi.hm.health.locweather.model;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¨\u0006\u0004"}, d2 = {"Ljava/util/Calendar;", "calendar", "", "wrapCalender", "locweather_release"}, k = 2, mv = {1, 5, 1})
public final class WeatherLogUtilKt {
    @NotNull
    public static final String wrapCalender(@Nullable Calendar calendar) {
        Date time;
        String string;
        return (calendar == null || (time = calendar.getTime()) == null || (string = time.toString()) == null) ? "null" : string;
    }
}
