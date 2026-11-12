package com.xiaomi.fitness.electronic.scale.util;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005J\n\u0010\u0006\u001a\u00020\u0007*\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/DateUtil;", "", "<init>", "()V", "PATTERN_YYYYMMDD", "", "getZeroMills", "", "mills", "getDateToString", "milSecond", "pattern", "Lorg/joda/time/LocalDate;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DateUtil {

    @NotNull
    public static final DateUtil INSTANCE = new DateUtil();

    @NotNull
    public static final String PATTERN_YYYYMMDD = "yyyyMMdd";

    private DateUtil() {
    }

    @NotNull
    public final String getDateToString(long milSecond, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        String str = new SimpleDateFormat(pattern).format(new Date(milSecond));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final long getZeroMills(long mills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mills);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final long getZeroMills(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return TimeDateUtil.changZeroOfTheDay(localDate) * ((long) 1000);
    }
}
