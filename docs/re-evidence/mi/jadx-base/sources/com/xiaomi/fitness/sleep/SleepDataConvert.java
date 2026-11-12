package com.xiaomi.fitness.sleep;

import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.sleep.behavior.AccSleepReport;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.yzm;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sleep/SleepDataConvert;", "", "", "Lcom/xiaomi/fitness/sleep/behavior/AccSleepReport$SleepState;", "accSleepReport", "Ljava/util/LinkedList;", "Lyzm;", "combineSameSleepState", "(Ljava/util/List;)Ljava/util/LinkedList;", "lastSnailSleepState", "currentSnailSleepSate", "convertToSleepStageRecord", "(Lcom/xiaomi/fitness/sleep/behavior/AccSleepReport$SleepState;Lcom/xiaomi/fitness/sleep/behavior/AccSleepReport$SleepState;)Lyzm;", "", StepsInfo.KEY_STAGE, "snailSleepStageToSleepStage", "(I)I", "", "sleepStageList", "convertToSleepStageRecordList", "(Ljava/util/List;)Ljava/util/List;", "<init>", "()V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepDataConvert {

    @NotNull
    public static final SleepDataConvert INSTANCE = new SleepDataConvert();

    private SleepDataConvert() {
    }

    private final LinkedList<yzm> combineSameSleepState(List<AccSleepReport.SleepState> accSleepReport) {
        LinkedList<yzm> linkedList = new LinkedList<>();
        int size = accSleepReport.size();
        AccSleepReport.SleepState sleepState = null;
        int i = 0;
        while (i < size) {
            AccSleepReport.SleepState sleepState2 = accSleepReport.get(i);
            if (sleepState != null || sleepState2.getData() != 3) {
                if (sleepState == null) {
                    i++;
                    sleepState = sleepState2;
                } else {
                    if (sleepState.getData() != sleepState2.getData()) {
                        linkedList.add(convertToSleepStageRecord(sleepState, sleepState2));
                        sleepState = sleepState2;
                    }
                    if (i == size - 1 && sleepState != sleepState2) {
                        linkedList.add(convertToSleepStageRecord(sleepState, sleepState2));
                    }
                }
            }
            i++;
        }
        return linkedList;
    }

    private final yzm convertToSleepStageRecord(AccSleepReport.SleepState lastSnailSleepState, AccSleepReport.SleepState currentSnailSleepSate) {
        yzm yzmVar = new yzm();
        yzmVar.r(false);
        yzmVar.V(false);
        yzmVar.W(snailSleepStageToSleepStage(lastSnailSleepState.getData()));
        TimeUtils timeUtils = TimeUtils.INSTANCE;
        String time = lastSnailSleepState.getTime();
        Intrinsics.checkNotNull(time);
        long jStringToDateLong$default = TimeUtils.stringToDateLong$default(timeUtils, time, null, 2, null);
        yzmVar.I(jStringToDateLong$default);
        String time2 = currentSnailSleepSate.getTime();
        Intrinsics.checkNotNull(time2);
        long jStringToDateLong$default2 = TimeUtils.stringToDateLong$default(timeUtils, time2, null, 2, null);
        yzmVar.L(jStringToDateLong$default2);
        yzmVar.x((jStringToDateLong$default + jStringToDateLong$default2) / ((long) 2));
        return yzmVar;
    }

    private final int snailSleepStageToSleepStage(int stage) {
        if (stage == 1) {
            return 10;
        }
        if (stage != 2) {
            return stage != 3 ? 0 : 6;
        }
        return 9;
    }

    @NotNull
    public final List<yzm> convertToSleepStageRecordList(@NotNull List<AccSleepReport.SleepState> sleepStageList) {
        Intrinsics.checkNotNullParameter(sleepStageList, "sleepStageList");
        LinkedList<yzm> linkedListCombineSameSleepState = combineSameSleepState(sleepStageList);
        yzm last = linkedListCombineSameSleepState.getLast();
        if (last.G() == 6) {
            linkedListCombineSameSleepState.removeLast();
            last = linkedListCombineSameSleepState.getLast();
        }
        if (last != null) {
            last.V(true);
        }
        return linkedListCombineSameSleepState;
    }
}
