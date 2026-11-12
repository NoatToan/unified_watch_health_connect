package com.xiaomi.fit.fitness;

import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.SnoreDreamTalkAudio;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\u0016\u0010\t\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\u0016\u0010\n\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J0\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/fitness/FitnessDataUtils;", "", "<init>", "()V", "sleepSegmentToLocalTime", "", "list", "", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "sleepSegmentToDBTime", "filterAudioFile", "Lcom/xiaomi/fit/fitness/export/data/item/SnoreDreamTalkAudio;", "audioList", "bedTime", "", "wakeupTime", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessDataUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDataUtils.kt\ncom/xiaomi/fit/fitness/FitnessDataUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1863#2:83\n1863#2,2:84\n1864#2:86\n1863#2:87\n1863#2,2:88\n1864#2:90\n1863#2,2:91\n1863#2,2:93\n*S KotlinDebug\n*F\n+ 1 FitnessDataUtils.kt\ncom/xiaomi/fit/fitness/FitnessDataUtils\n*L\n13#1:83\n29#1:84,2\n13#1:86\n39#1:87\n52#1:88,2\n39#1:90\n60#1:91,2\n75#1:93,2\n*E\n"})
public final class FitnessDataUtils {

    @NotNull
    public static final FitnessDataUtils INSTANCE = new FitnessDataUtils();

    private FitnessDataUtils() {
    }

    public final void filterAudioFile(@Nullable List<SleepSegmentReport> list) {
        if (list != null) {
            for (SleepSegmentReport sleepSegmentReport : list) {
                FitnessDataUtils fitnessDataUtils = INSTANCE;
                sleepSegmentReport.setSnoreAudioList(fitnessDataUtils.filterAudioFile(sleepSegmentReport.getSnoreAudioList(), sleepSegmentReport.getBedTime(), sleepSegmentReport.getWakeupTime()));
                sleepSegmentReport.setDreamTalkAudioList(fitnessDataUtils.filterAudioFile(sleepSegmentReport.getDreamTalkAudioList(), sleepSegmentReport.getBedTime(), sleepSegmentReport.getWakeupTime()));
            }
        }
    }

    public final void sleepSegmentToDBTime(@Nullable List<SleepSegmentReport> list) {
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        if (list != null) {
            for (SleepSegmentReport sleepSegmentReport : list) {
                long tzIn15Min = currentTZOffsetInSec - (sleepSegmentReport.getTzIn15Min() * 900);
                sleepSegmentReport.setWakeupTime(sleepSegmentReport.getWakeupTime() + tzIn15Min);
                sleepSegmentReport.setDeviceWakeupTime(Long.valueOf(sleepSegmentReport.getWakeupTime()));
                sleepSegmentReport.setBedTime(sleepSegmentReport.getBedTime() + tzIn15Min);
                sleepSegmentReport.setDeviceBedTime(Long.valueOf(sleepSegmentReport.getBedTime()));
                if (sleepSegmentReport.getLeaveBedTime() != null) {
                    Long leaveBedTime = sleepSegmentReport.getLeaveBedTime();
                    Intrinsics.checkNotNull(leaveBedTime);
                    sleepSegmentReport.setLeaveBedTime(Long.valueOf(leaveBedTime.longValue() + tzIn15Min));
                }
                if (sleepSegmentReport.getGoBedTime() != null) {
                    Long goBedTime = sleepSegmentReport.getGoBedTime();
                    Intrinsics.checkNotNull(goBedTime);
                    sleepSegmentReport.setGoBedTime(Long.valueOf(goBedTime.longValue() + tzIn15Min));
                }
                List<SleepStateItem> sleepItems = sleepSegmentReport.getSleepItems();
                if (sleepItems != null) {
                    for (SleepStateItem sleepStateItem : sleepItems) {
                        sleepStateItem.setEndTime(sleepStateItem.getEndTime() + tzIn15Min);
                        sleepStateItem.setStartTime(sleepStateItem.getStartTime() + tzIn15Min);
                    }
                }
            }
        }
    }

    public final void sleepSegmentToLocalTime(@Nullable List<SleepSegmentReport> list) {
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        if (list != null) {
            for (SleepSegmentReport sleepSegmentReport : list) {
                if (sleepSegmentReport.getProtoTime() == 0) {
                    sleepSegmentReport.setProtoTime(sleepSegmentReport.getWakeupTime());
                }
                long tzIn15Min = (sleepSegmentReport.getTzIn15Min() * 900) - currentTZOffsetInSec;
                sleepSegmentReport.setWakeupTime(sleepSegmentReport.getWakeupTime() + tzIn15Min);
                sleepSegmentReport.setDeviceWakeupTime(Long.valueOf(sleepSegmentReport.getWakeupTime()));
                sleepSegmentReport.setBedTime(sleepSegmentReport.getBedTime() + tzIn15Min);
                sleepSegmentReport.setDeviceBedTime(Long.valueOf(sleepSegmentReport.getBedTime()));
                if (sleepSegmentReport.getLeaveBedTime() != null) {
                    Long leaveBedTime = sleepSegmentReport.getLeaveBedTime();
                    Intrinsics.checkNotNull(leaveBedTime);
                    sleepSegmentReport.setLeaveBedTime(Long.valueOf(leaveBedTime.longValue() + tzIn15Min));
                }
                if (sleepSegmentReport.getGoBedTime() != null) {
                    Long goBedTime = sleepSegmentReport.getGoBedTime();
                    Intrinsics.checkNotNull(goBedTime);
                    sleepSegmentReport.setGoBedTime(Long.valueOf(goBedTime.longValue() + tzIn15Min));
                }
                List<SleepStateItem> sleepItems = sleepSegmentReport.getSleepItems();
                if (sleepItems != null) {
                    for (SleepStateItem sleepStateItem : sleepItems) {
                        sleepStateItem.setEndTime(sleepStateItem.getEndTime() + tzIn15Min);
                        sleepStateItem.setStartTime(sleepStateItem.getStartTime() + tzIn15Min);
                    }
                }
            }
        }
    }

    private final List<SnoreDreamTalkAudio> filterAudioFile(List<SnoreDreamTalkAudio> audioList, long bedTime, long wakeupTime) {
        List<SnoreDreamTalkAudio> list = audioList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SnoreDreamTalkAudio snoreDreamTalkAudio : audioList) {
            long beginTime = snoreDreamTalkAudio.getBeginTime();
            if (bedTime <= beginTime && beginTime <= wakeupTime) {
                arrayList.add(snoreDreamTalkAudio);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
