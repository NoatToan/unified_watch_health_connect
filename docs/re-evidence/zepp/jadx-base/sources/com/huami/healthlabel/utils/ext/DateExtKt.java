package com.huami.healthlabel.utils.ext;

import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\n*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0000\"\u001a\u0010\u000f\u001a\u00020\u0000*\u00020\f8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001a\u0010\u0011\u001a\u00020\u0000*\u00020\f8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"", "", "isToday", "Ljava/text/DateFormat;", TrainingWebConst.QueryParam.VIDEO_FORMAT, "", "kotlin.jvm.PlatformType", "millis2String", "", "minuteRange", "Lkotlin/Pair;", "timeRange", "Ljava/util/Date;", "getBeginningTime", "(Ljava/util/Date;)J", "beginningTime", "getEndToday", "endToday", "healthLabel_release"}, k = 2, mv = {1, 5, 1})
public final class DateExtKt {
    public static final long getBeginningTime(@NotNull Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, calendar.getMinimum(11));
        calendar.set(12, calendar.getMinimum(12));
        calendar.set(13, calendar.getMinimum(13));
        calendar.set(14, calendar.getMinimum(14));
        return calendar.getTimeInMillis();
    }

    public static final long getEndToday(@NotNull Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, calendar.getMaximum(11));
        calendar.set(12, calendar.getMaximum(12));
        calendar.set(13, calendar.getMaximum(13));
        calendar.set(14, calendar.getMaximum(14));
        return calendar.getTimeInMillis();
    }

    public static final boolean isToday(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        return calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5);
    }

    public static final String millis2String(long j, @NotNull DateFormat dateFormat) {
        return dateFormat.format(new Date(j));
    }

    @NotNull
    public static final Pair<Long, Long> timeRange(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        long j2 = (j - ((long) (calendar.get(13) * 1000))) - ((long) calendar.get(14));
        return new Pair<>(Long.valueOf(j2), Long.valueOf(j2 + ((long) (i * 60 * 1000))));
    }

    public static /* synthetic */ Pair timeRange$default(long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return timeRange(j, i);
    }
}
