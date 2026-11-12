package com.xiaomi.fitness.health.sleep.rhythm.diary;

import com.miui.tsmclient.entity.UIConfig;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0007H\u0002J\n\u0010\b\u001a\u00020\u0007*\u00020\u0007J\f\u0010\t\u001a\u00020\u0007*\u00020\u0007H\u0002J\f\u0010\n\u001a\u00020\u0007*\u00020\u0007H\u0002J\u0019\u0010\u000b\u001a\u00020\u0007*\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u0007*\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\u0012\u0010\u000f\u001a\u00020\u0010*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007J\u0012\u0010\u0011\u001a\u00020\u0010*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryHandle;", "", "<init>", "()V", "TAG", "", "getLastDayNightTenTime", "", "getLastDayZeroTime", "getTodayZeroTime", "getTodayMorningEightTime", "toCurrentWakeOrGetUpTime", UIConfig.KEY_CURRENT_TIME, "(Ljava/lang/Long;J)J", "toCurrentLastDaySleepOrMedicationTime", "isLimitSelectDay", "", "isLimitSelectCurrentDay", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepDiaryHandle {

    @NotNull
    public static final SleepDiaryHandle INSTANCE = new SleepDiaryHandle();

    @NotNull
    public static final String TAG = "SleepDiary";

    private SleepDiaryHandle() {
    }

    private final long getLastDayNightTenTime(long j) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        calendar.setTimeInMillis(j);
        calendar.add(5, -1);
        calendar.set(11, 22);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final long getTodayMorningEightTime(long j) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        calendar.setTimeInMillis(j);
        calendar.add(5, 0);
        calendar.set(11, 8);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final long getTodayZeroTime(long j) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        calendar.setTimeInMillis(j);
        calendar.add(5, 0);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final long getLastDayZeroTime(long j) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        calendar.setTimeInMillis(j);
        calendar.add(5, -1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final boolean isLimitSelectCurrentDay(long j, long j2) {
        return getTodayZeroTime(j2) != getTodayZeroTime(j);
    }

    public final boolean isLimitSelectDay(long j, long j2) {
        long todayZeroTime = getTodayZeroTime(j2);
        long todayZeroTime2 = getTodayZeroTime(j);
        return todayZeroTime2 > todayZeroTime || todayZeroTime - todayZeroTime2 > 86400000;
    }

    public final long toCurrentLastDaySleepOrMedicationTime(@Nullable Long l, long j) {
        return l == null ? getLastDayNightTenTime(j) : l.longValue() * ((long) 1000);
    }

    public final long toCurrentWakeOrGetUpTime(@Nullable Long l, long j) {
        return l == null ? getTodayMorningEightTime(j) : l.longValue() * ((long) 1000);
    }
}
