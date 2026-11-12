package com.mi.health.sleep;

import com.mi.health.sleep.bean.SleepSegmentStage;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.dataprovider.DataProviderException;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a1\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012\u001a\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000f\u001a\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000f\u001a\u0006\u0010\u0019\u001a\u00020\u0018\u001a.\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006\u001a\u000e\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006\"\u000e\u0010\u0013\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"getSleepStartTime", "", "sleepData", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "getWakeTime", "getWakeCount", "", "getStageList", "", "Lcom/mi/health/sleep/bean/SleepSegmentStage;", "checkColumn", "", "T", "target", "", "", "projection", "", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "SLEEP_NOT_INITIALIZED", "DEAK_CLOCK_PKG", "checkStatusForDeskClockCall", "callingPackage", "isDeskClock", "", "hasSleepSchedule", "updateSleepScheduleSP", "sleepHour", "sleepMin", "wakeHour", "wakeMin", "repeat", "EVALUATION_NO_SLEEP", "EVALUATION_BAD", "EVALUATION_NORMAL", "EVALUATION_BETTER", "EVALUATION_BEST", "EVALUATION_NO_NIGHT_SLEEP", "SLEEP_DURATION_LACK", "SLEEP_DURATION_ENOUGH", "SLEEP_DURATION_MORE", "INDEX_ONE", "INDEX_TWO", "INDEX_THREE", "SLEEP_STAGE_REM", "SLEEP_STAGE_WAKE", "SLEEP_STAGE_SLEEPING", "SLEEP_STAGE_LIGHT", "SLEEP_STAGE_DEEP", "changeSleepStage", StepsInfo.KEY_STAGE, "fitness-data-provider_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDataHelper.kt\ncom/mi/health/sleep/SleepDataHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1863#2,2:122\n1863#2,2:124\n1#3:126\n*S KotlinDebug\n*F\n+ 1 SleepDataHelper.kt\ncom/mi/health/sleep/SleepDataHelperKt\n*L\n28#1:122,2\n36#1:124,2\n*E\n"})
public final class SleepDataHelperKt {

    @NotNull
    public static final String DEAK_CLOCK_PKG = "com.android.deskclock";
    public static final int EVALUATION_BAD = 1;
    public static final int EVALUATION_BEST = 4;
    public static final int EVALUATION_BETTER = 3;
    public static final int EVALUATION_NORMAL = 2;
    public static final int EVALUATION_NO_NIGHT_SLEEP = 5;
    public static final int EVALUATION_NO_SLEEP = 0;
    public static final int INDEX_ONE = 0;
    public static final int INDEX_THREE = 2;
    public static final int INDEX_TWO = 1;
    public static final int SLEEP_DURATION_ENOUGH = 2;
    public static final int SLEEP_DURATION_LACK = 1;
    public static final int SLEEP_DURATION_MORE = 3;
    public static final int SLEEP_NOT_INITIALIZED = 2000;
    public static final int SLEEP_STAGE_DEEP = 10;
    public static final int SLEEP_STAGE_LIGHT = 9;
    public static final int SLEEP_STAGE_REM = 5;
    public static final int SLEEP_STAGE_SLEEPING = 8;
    public static final int SLEEP_STAGE_WAKE = 6;

    public static final int changeSleepStage(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 9;
        }
        if (i == 4) {
            return 5;
        }
        if (i != 5) {
            return i != 6 ? 0 : 8;
        }
        return 6;
    }

    public static final <T> void checkColumn(@Nullable Collection<String> collection, @Nullable T[] tArr) {
        if (!(true ^ (collection == null || collection.isEmpty()))) {
            throw new IllegalArgumentException("target can not bu null or empty".toString());
        }
        if (tArr == null || tArr.length == 0) {
            return;
        }
        Iterator it = ArrayIteratorKt.iterator(tArr);
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                Intrinsics.checkNotNull(collection);
                if (!collection.contains(next)) {
                    throw new IllegalArgumentException(("please check your column:" + next).toString());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void checkStatusForDeskClockCall(@NotNull String callingPackage) throws DataProviderException {
        Intrinsics.checkNotNullParameter(callingPackage, "callingPackage");
        if (!isDeskClock(callingPackage) || hasSleepSchedule()) {
            return;
        }
        throw new DataProviderException(2000, null, 2, 0 == true ? 1 : 0);
    }

    public static final long getSleepStartTime(@NotNull AllDaySleepReport sleepData) {
        Intrinsics.checkNotNullParameter(sleepData, "sleepData");
        List<SleepSegmentReport> sleepSegments = sleepData.getSleepSegments();
        if (sleepSegments == null) {
            return 0L;
        }
        return sleepSegments.get(sleepSegments.size() - 1).getBedTime() * ((long) 1000);
    }

    @NotNull
    public static final List<SleepSegmentStage> getStageList(@NotNull AllDaySleepReport sleepData) {
        Intrinsics.checkNotNullParameter(sleepData, "sleepData");
        ArrayList arrayList = new ArrayList();
        List<SleepSegmentReport> sleepSegments = sleepData.getSleepSegments();
        if (sleepSegments != null) {
            for (SleepSegmentReport sleepSegmentReport : sleepSegments) {
                List<SleepStateItem> sleepItems = sleepSegmentReport.getSleepItems();
                if (sleepItems == null) {
                    long j = 1000;
                    arrayList.add(new SleepSegmentStage(sleepSegmentReport.getBedTime() * j, sleepSegmentReport.getWakeupTime() * j, 6));
                } else {
                    for (SleepStateItem sleepStateItem : sleepItems) {
                        long j2 = 1000;
                        arrayList.add(new SleepSegmentStage(sleepStateItem.getStartTime() * j2, sleepStateItem.getEndTime() * j2, sleepStateItem.getSleepState()));
                    }
                }
            }
        }
        return arrayList;
    }

    public static final int getWakeCount(@NotNull AllDaySleepReport sleepData) {
        Intrinsics.checkNotNullParameter(sleepData, "sleepData");
        List<SleepSegmentReport> sleepSegments = sleepData.getSleepSegments();
        if (sleepSegments == null) {
            return 0;
        }
        Iterator<T> it = sleepSegments.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer wakeCount = ((SleepSegmentReport) it.next()).getWakeCount();
            iIntValue += wakeCount != null ? wakeCount.intValue() : 0;
        }
        return iIntValue;
    }

    public static final long getWakeTime(@NotNull AllDaySleepReport sleepData) {
        Intrinsics.checkNotNullParameter(sleepData, "sleepData");
        List<SleepSegmentReport> sleepSegments = sleepData.getSleepSegments();
        if (sleepSegments == null) {
            return 0L;
        }
        return sleepSegments.get(0).getWakeupTime() * ((long) 1000);
    }

    public static final boolean hasSleepSchedule() {
        SleepConfigPreference sleepConfigPreference = SleepConfigPreference.INSTANCE;
        return (sleepConfigPreference.getKEY_SLEEP_HOUR() == 0 && sleepConfigPreference.getKEY_SLEEP_MIN() == 0 && sleepConfigPreference.getKEY_WAKE_HOUR() == 0 && sleepConfigPreference.getKEY_WAKE_MIN() == 0) ? false : true;
    }

    public static final boolean isDeskClock(@NotNull String callingPackage) {
        Intrinsics.checkNotNullParameter(callingPackage, "callingPackage");
        return Intrinsics.areEqual(DEAK_CLOCK_PKG, callingPackage);
    }

    public static final void updateSleepScheduleSP(int i, int i2, int i3, int i4, int i5) {
        SleepConfigPreference sleepConfigPreference = SleepConfigPreference.INSTANCE;
        sleepConfigPreference.setKEY_SLEEP_HOUR(i);
        sleepConfigPreference.setKEY_SLEEP_MIN(i2);
        sleepConfigPreference.setKEY_WAKE_HOUR(i3);
        sleepConfigPreference.setKEY_WAKE_MIN(i4);
        sleepConfigPreference.setKEY_REPEAT(i5);
    }
}
