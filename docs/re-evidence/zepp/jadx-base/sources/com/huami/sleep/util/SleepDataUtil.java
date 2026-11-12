package com.huami.sleep.util;

import com.huami.sleep.daysleep.daydetail.vo.SleepShowData;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/sleep/util/SleepDataUtil;", "", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "info", "Lcom/huami/sleep/daysleep/daydetail/vo/SleepShowData;", "parse2Sleep", "parse2Nap", "", "mode", "statisticNapSleepCountByMode", "", "mTag", "Ljava/lang/String;", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepDataUtil {

    @NotNull
    public static final SleepDataUtil INSTANCE = new SleepDataUtil();

    @NotNull
    public static final String mTag = "SportDataUtil";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ SleepInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SleepInfo sleepInfo) {
            super(0);
            this.a = sleepInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            String string;
            SleepInfo sleepInfo = this.a;
            String str = "null";
            if (sleepInfo != null && (string = sleepInfo.toString()) != null) {
                str = string;
            }
            return "sleep info : " + str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ SleepShowData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SleepShowData sleepShowData) {
            super(0);
            this.a = sleepShowData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sleep data : " + this.a;
        }
    }

    private SleepDataUtil() {
    }

    public static /* synthetic */ int statisticNapSleepCountByMode$default(SleepDataUtil sleepDataUtil, SleepInfo sleepInfo, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return sleepDataUtil.statisticNapSleepCountByMode(sleepInfo, i);
    }

    @NotNull
    public final SleepShowData parse2Nap(@Nullable SleepInfo info) {
        SleepShowData sleepShowData;
        SleepShowData sleepShowData2 = new SleepShowData(0, 0, 0, 0, 0, 0, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 1048575, null);
        if (info == null) {
            return sleepShowData2;
        }
        if (info.getOddStageSleep() == null || info.getOddStageSleep().size() <= 0) {
            sleepShowData = sleepShowData2;
        } else {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (StageSleep stageSleep : info.getOddStageSleep()) {
                int i5 = stageSleep.mode;
                if (i5 == 5) {
                    i += (stageSleep.stop - stageSleep.start) + 1;
                } else if (i5 == 4) {
                    i2 += (stageSleep.stop - stageSleep.start) + 1;
                } else if (i5 == 7) {
                    i3 += (stageSleep.stop - stageSleep.start) + 1;
                } else if (i5 == 8) {
                    i4 += (stageSleep.stop - stageSleep.start) + 1;
                }
            }
            sleepShowData = sleepShowData2;
            sleepShowData.setDeepDurationHour(i / 60);
            sleepShowData.setDeepDurationMin(i % 60);
            sleepShowData.setLightDurationHour(i2 / 60);
            sleepShowData.setLightDurationMin(i2 % 60);
            sleepShowData.setAwakeDuration(i3);
            sleepShowData.setDreamTime(i4);
            int i6 = i + i2 + i4;
            sleepShowData.setDurationHour(i6 / 60);
            sleepShowData.setDurationMin(i6 % 60);
        }
        sleepShowData.setRemSupported(info.isRemSupport());
        return sleepShowData;
    }

    @NotNull
    public final SleepShowData parse2Sleep(@Nullable SleepInfo info) {
        HMLog.debug(mTag, new a(info));
        SleepShowData sleepShowData = new SleepShowData(0, 0, 0, 0, 0, 0, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 1048575, null);
        if (info == null || info.getSleepCount() <= 0) {
            sleepShowData.setTime("00:00");
            sleepShowData.setAwakeTime("00:00");
            sleepShowData.setAwakeDuration(0);
            sleepShowData.setDurationHour(0);
            sleepShowData.setDurationMin(0);
            sleepShowData.setDeepDurationHour(0);
            sleepShowData.setDeepDurationMin(0);
            sleepShowData.setLightDurationHour(0);
            sleepShowData.setLightDurationMin(0);
            sleepShowData.setSleepFeeling(0);
            sleepShowData.setIntoSleepTime(0);
            sleepShowData.setLazyBedTime(0);
            sleepShowData.setTurnOverTime(0);
            sleepShowData.setDreamTime(0);
            sleepShowData.setSleepScore(0);
            sleepShowData.setEmpty(true);
        } else {
            sleepShowData.setTime(TimeUtils.formatTime_zh(info.getStartDate()));
            sleepShowData.setTimeReg(TimeUtils.getPrefix_zh(KoinExtKt.getAppContext(), info.getStartDate()));
            sleepShowData.setAwakeTime(TimeUtils.formatTime_zh(info.getStopDate()));
            sleepShowData.setAwakeTimeReg(TimeUtils.getPrefix_zh(KoinExtKt.getAppContext(), info.getStopDate()));
            sleepShowData.setAwakeDuration(info.getAwakeCount());
            sleepShowData.setAwakeNum(info.getAwakeNum());
            sleepShowData.setDurationHour(info.getSleepCount() / 60);
            sleepShowData.setDurationMin(info.getSleepCount() % 60);
            sleepShowData.setDeepDurationHour(info.getNonRemCount() / 60);
            sleepShowData.setDeepDurationMin(info.getNonRemCount() % 60);
            sleepShowData.setLightDurationHour(info.getRemCount() / 60);
            sleepShowData.setLightDurationMin(info.getRemCount() % 60);
            sleepShowData.setSleepFeeling(info.getSleepFeeling());
            sleepShowData.setIntoSleepTime(info.getIntoSleepCount());
            sleepShowData.setLazyBedTime(info.getLazyBedCount());
            sleepShowData.setTurnOverTime(info.getTurnOverCount());
            sleepShowData.setDreamTime(info.getDreamTime());
            sleepShowData.setSleepScore(info.getSleepScore());
            sleepShowData.setEmpty(false);
            sleepShowData.setRemSupported(info.isRemSupport());
        }
        HMLog.debug(mTag, new b(sleepShowData));
        return sleepShowData;
    }

    public final int statisticNapSleepCountByMode(@NotNull SleepInfo info, int mode) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (Object obj : info.getOddStageSleep()) {
            int i6 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            StageSleep stageSleep = (StageSleep) obj;
            int i7 = stageSleep.mode;
            if (i7 == 4) {
                i2 += (stageSleep.stop - stageSleep.start) + 1;
            } else if (i7 == 5) {
                i3 += (stageSleep.stop - stageSleep.start) + 1;
            } else if (i7 == 7) {
                i5 += (stageSleep.stop - stageSleep.start) + 1;
            } else if (i7 == 8) {
                i4 += (stageSleep.stop - stageSleep.start) + 1;
            }
            i = i6;
        }
        if (mode == 4) {
            return i2;
        }
        if (mode == 5) {
            return i3;
        }
        if (mode != 7) {
            return mode != 8 ? i3 + i2 + i4 : i4;
        }
        return i5;
    }
}
