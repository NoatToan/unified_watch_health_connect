package com.xiaomi.fitness.aggregation.health.dao;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\t\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/TimeZoneUtil;", "", "<init>", "()V", "getTimeZone", "Ljava/util/TimeZone;", "timeZoneOffsetInSecond", "", "(Ljava/lang/Integer;)Ljava/util/TimeZone;", "normalizeTime", "Lkotlin/Pair;", "", "startTime", "endTime", "time", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimeZoneUtil {

    @NotNull
    public static final TimeZoneUtil INSTANCE = new TimeZoneUtil();

    private TimeZoneUtil() {
    }

    @NotNull
    public final TimeZone getTimeZone(@Nullable Integer timeZoneOffsetInSecond) {
        if (timeZoneOffsetInSecond != null) {
            return FitnessDateUtils.INSTANCE.getTimeZone(timeZoneOffsetInSecond.intValue());
        }
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNull(timeZone);
        return timeZone;
    }

    @NotNull
    public final Pair<Long, Long> normalizeTime(long startTime, long endTime) {
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        return new Pair<>(Long.valueOf(FitnessDateUtils.changeToDestZeroTimeOneDay(startTime, currentTZOffsetInSec, 0)), Long.valueOf(FitnessDateUtils.changeToDestZeroTimeOneDay(endTime, currentTZOffsetInSec, 0)));
    }

    public final long normalizeTime(long time) {
        FitnessDateUtils fitnessDateUtils = FitnessDateUtils.INSTANCE;
        return fitnessDateUtils.changeTo0TimeIn0TzOneDay(time, (int) fitnessDateUtils.getTZOffsetInSec(time));
    }
}
