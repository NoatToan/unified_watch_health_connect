package com.xiaomi.fitness.sleep;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.utils.SleepAudioFileUtils;
import com.xiaomi.fit.fitness.persist.process.SleepSnoreDecibelUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.migration.sleep.migration.a;
import com.xiaomi.fitness.sleep.MiuiSleepSyncer;
import com.xiaomi.fitness.sleep.behavior.AccSleepReport;
import com.xiaomi.fitness.sleep.behavior.analyze.snore.AudioAttributes;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.db.SleepStage;
import defpackage.yzm;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u00101J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\f¢\u0006\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/sleep/MiuiSleepSyncer;", "", "", "Lcom/xiaomi/fitness/sleep/trace/db/SleepStage;", "sleepStageList", "Lyzm;", "convertToSleepStageRecord", "(Ljava/util/List;)Ljava/util/List;", "stageList", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "createSleepSegmentReport", "(Ljava/util/List;)Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "srcReport", "destReport", "", "moveSnoreAndDreamTalkAudioFile", "(Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)Z", "", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/AudioAttributes;", "audioList", "segReport", "Lcom/xiaomi/fitness/sleep/MiuiSleepSyncer$SleepAudioResult;", "moveSleepAudioFile", "(Ljava/util/List;Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)Lcom/xiaomi/fitness/sleep/MiuiSleepSyncer$SleepAudioResult;", "", "wakeupTime", "", "tzIn15Min", "Ljava/io/File;", "getNewAudioFilePath", "(JI)Ljava/io/File;", "audio", "", "getNewAudioFileName", "(Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/AudioAttributes;)Ljava/lang/String;", "sleepReport", "", "onReceiveMiuiSleep", "(Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;)V", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "recorder$delegate", "Lkotlin/Lazy;", "getRecorder", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "recorder", "<init>", "()V", "SleepAudioResult", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMiuiSleepSyncer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiuiSleepSyncer.kt\ncom/xiaomi/fitness/sleep/MiuiSleepSyncer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n1863#2,2:196\n*S KotlinDebug\n*F\n+ 1 MiuiSleepSyncer.kt\ncom/xiaomi/fitness/sleep/MiuiSleepSyncer\n*L\n90#1:196,2\n*E\n"})
public final class MiuiSleepSyncer {

    @NotNull
    private final String TAG = "MiuiSleepSyncer";

    /* JADX INFO: renamed from: recorder$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recorder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: n6g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiuiSleepSyncer.recorder_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sleep/MiuiSleepSyncer$SleepAudioResult;", "", "audioCount", "", "duration", "<init>", "(II)V", "getAudioCount", "()I", "getDuration", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepAudioResult {
        private final int audioCount;
        private final int duration;

        public SleepAudioResult(int i, int i2) {
            this.audioCount = i;
            this.duration = i2;
        }

        public static /* synthetic */ SleepAudioResult copy$default(SleepAudioResult sleepAudioResult, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = sleepAudioResult.audioCount;
            }
            if ((i3 & 2) != 0) {
                i2 = sleepAudioResult.duration;
            }
            return sleepAudioResult.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAudioCount() {
            return this.audioCount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        @NotNull
        public final SleepAudioResult copy(int audioCount, int duration) {
            return new SleepAudioResult(audioCount, duration);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepAudioResult)) {
                return false;
            }
            SleepAudioResult sleepAudioResult = (SleepAudioResult) other;
            return this.audioCount == sleepAudioResult.audioCount && this.duration == sleepAudioResult.duration;
        }

        public final int getAudioCount() {
            return this.audioCount;
        }

        public final int getDuration() {
            return this.duration;
        }

        public int hashCode() {
            return (Integer.hashCode(this.audioCount) * 31) + Integer.hashCode(this.duration);
        }

        @NotNull
        public String toString() {
            return "SleepAudioResult(audioCount=" + this.audioCount + ", duration=" + this.duration + ")";
        }
    }

    public MiuiSleepSyncer() {
        FitnessLogUtils.d("MiuiSleepSyncer", "MiuiSleepSyncer inited");
    }

    private final List<yzm> convertToSleepStageRecord(List<SleepStage> sleepStageList) {
        final Function2 function2 = new Function2() { // from class: l6g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(MiuiSleepSyncer.convertToSleepStageRecord$lambda$1((SleepStage) obj, (SleepStage) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(sleepStageList, new Comparator() { // from class: m6g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MiuiSleepSyncer.convertToSleepStageRecord$lambda$2(function2, obj, obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        yzm yzmVar = null;
        for (SleepStage sleepStage : sleepStageList) {
            yzm yzmVar2 = new yzm();
            yzmVar2.I(sleepStage.getBeginTime());
            yzmVar2.L(sleepStage.getEndTime());
            yzmVar2.W(sleepStage.getStage());
            arrayList.add(yzmVar2);
            FitnessLogUtils.i(this.TAG, "record(" + yzmVar2 + ")");
            yzmVar = yzmVar2;
        }
        if (yzmVar != null) {
            yzmVar.V(true);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int convertToSleepStageRecord$lambda$1(SleepStage sleepStage, SleepStage sleepStage2) {
        return (int) (sleepStage.getBeginTime() - sleepStage2.getBeginTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int convertToSleepStageRecord$lambda$2(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final SleepSegmentReport createSleepSegmentReport(List<yzm> stageList) {
        FitnessLogUtils.i(this.TAG, "stage: size = " + stageList.size() + ", lastOne = " + CollectionsKt___CollectionsKt.last((List<? extends Object>) stageList));
        final Function2 function2 = new Function2() { // from class: j6g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(MiuiSleepSyncer.createSleepSegmentReport$lambda$4((yzm) obj, (yzm) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(stageList, new Comparator() { // from class: k6g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MiuiSleepSyncer.createSleepSegmentReport$lambda$5(function2, obj, obj2);
            }
        });
        return new a(ApplicationExtKt.getApplication()).d(stageList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createSleepSegmentReport$lambda$4(yzm yzmVar, yzm yzmVar2) {
        return (int) (yzmVar2.B() - yzmVar.B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createSleepSegmentReport$lambda$5(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final String getNewAudioFileName(AudioAttributes audio) {
        return SleepAudioFileUtils.INSTANCE.getAudioFileName(audio.getBeginTime(), audio.getDuration(), audio.getType());
    }

    private final File getNewAudioFilePath(long wakeupTime, int tzIn15Min) {
        return SleepAudioFileUtils.INSTANCE.getTheAudioFilePath(wakeupTime, tzIn15Min);
    }

    private final FitnessDataRecorder getRecorder() {
        return (FitnessDataRecorder) this.recorder.getValue();
    }

    private final SleepAudioResult moveSleepAudioFile(List<AudioAttributes> audioList, SleepSegmentReport segReport) {
        if (audioList.isEmpty() || segReport.getWakeupTime() <= 0) {
            FitnessLogUtils.i(this.TAG, "no need to move, " + segReport.getWakeupTime());
            return null;
        }
        File newAudioFilePath = getNewAudioFilePath(segReport.getWakeupTime(), segReport.getTzIn15Min());
        int i = 0;
        int duration = 0;
        for (AudioAttributes audioAttributes : audioList) {
            String filePath = audioAttributes.getFilePath(ApplicationExtKt.getApplication());
            if (filePath == null) {
                FitnessLogUtils.i(this.TAG, "audio file name is null(" + audioAttributes + ")");
            } else {
                File file = new File(filePath);
                if (file.exists()) {
                    FitnessLogUtils.i(this.TAG, "(" + audioAttributes + ")audio name(" + file.getName() + ")");
                    if (!newAudioFilePath.exists()) {
                        newAudioFilePath.mkdirs();
                    }
                    File file2 = new File(newAudioFilePath, getNewAudioFileName(audioAttributes));
                    FitnessLogUtils.i(this.TAG, "new audio file(" + file2.getName() + ")");
                    file.renameTo(file2);
                    file.deleteOnExit();
                    i++;
                    duration += audioAttributes.getDuration();
                } else {
                    FitnessLogUtils.i(this.TAG, "audio file(" + filePath + ") not exist");
                }
            }
        }
        return new SleepAudioResult(i, duration);
    }

    private final boolean moveSnoreAndDreamTalkAudioFile(SleepReport srcReport, SleepSegmentReport destReport) {
        boolean z;
        List<AudioAttributes> dreamTalkList = srcReport.getDreamTalkList();
        if (dreamTalkList == null || dreamTalkList.isEmpty()) {
            z = false;
        } else {
            String str = this.TAG;
            List<AudioAttributes> dreamTalkList2 = srcReport.getDreamTalkList();
            FitnessLogUtils.i(str, "move dream talk audio(" + (dreamTalkList2 != null ? Integer.valueOf(dreamTalkList2.size()) : null) + ")");
            List<AudioAttributes> dreamTalkList3 = srcReport.getDreamTalkList();
            Intrinsics.checkNotNull(dreamTalkList3);
            SleepAudioResult sleepAudioResultMoveSleepAudioFile = moveSleepAudioFile(dreamTalkList3, destReport);
            if (sleepAudioResultMoveSleepAudioFile != null) {
                destReport.setDreamTalkCount(Integer.valueOf(sleepAudioResultMoveSleepAudioFile.getAudioCount()));
            }
            z = true;
        }
        List<AudioAttributes> snoreList = srcReport.getSnoreList();
        if (snoreList == null || snoreList.isEmpty()) {
            return z;
        }
        String str2 = this.TAG;
        List<AudioAttributes> snoreList2 = srcReport.getSnoreList();
        FitnessLogUtils.i(str2, "move snore audio(" + (snoreList2 != null ? Integer.valueOf(snoreList2.size()) : null) + ")");
        List<AudioAttributes> snoreList3 = srcReport.getSnoreList();
        Intrinsics.checkNotNull(snoreList3);
        SleepAudioResult sleepAudioResultMoveSleepAudioFile2 = moveSleepAudioFile(snoreList3, destReport);
        destReport.setSnoreDuration(Integer.valueOf(srcReport.getSnorePureTotalTime()));
        if (sleepAudioResultMoveSleepAudioFile2 == null) {
            return true;
        }
        if (destReport.getSnoreDuration() != null) {
            Integer snoreDuration = destReport.getSnoreDuration();
            Intrinsics.checkNotNull(snoreDuration);
            if (snoreDuration.intValue() > 0) {
                return true;
            }
        }
        FitnessLogUtils.i(this.TAG, "srcReport duration = " + srcReport.getSnorePureTotalTime());
        destReport.setSnoreDuration(Integer.valueOf(sleepAudioResultMoveSleepAudioFile2.getDuration()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorder recorder_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
    }

    public final void onReceiveMiuiSleep(@NotNull SleepReport sleepReport) {
        SleepSegmentReport sleepSegmentReportBuild;
        List<AccSleepReport.SleepState> report;
        Intrinsics.checkNotNullParameter(sleepReport, "sleepReport");
        FitnessLogUtils.i(this.TAG, "onReceiveMiuiSleep");
        RegionManager regionExtKt = RegionExtKt.getInstance(RegionManager.INSTANCE);
        if (regionExtKt == null || !RegionExtKt.isRegionSelected(regionExtKt)) {
            FitnessLogUtils.i(this.TAG, "onReceiveMiuiSleep: region not selected");
            return;
        }
        AccSleepReport accReport = sleepReport.getAccReport();
        List<AccSleepReport.SleepState> mutableList = (accReport == null || (report = accReport.getReport()) == null) ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) report);
        List<AccSleepReport.SleepState> list = mutableList;
        if (list == null || list.isEmpty()) {
            List<SleepStage> sleepStageList = sleepReport.getSleepStageList();
            List<SleepStage> list2 = sleepStageList;
            if (list2 != null && !list2.isEmpty()) {
                sleepSegmentReportBuild = createSleepSegmentReport(convertToSleepStageRecord(sleepStageList));
            } else {
                if (sleepReport.getSleepTime() <= 0 || sleepReport.getWakeTime() <= 0) {
                    FitnessLogUtils.i(this.TAG, "invalid sleep(bedTime = " + sleepReport.getSleepTime() + ", wakeupTime = " + sleepReport.getWakeTime() + ")");
                    return;
                }
                long j = 1000;
                sleepSegmentReportBuild = new SleepSegmentReport.Builder().tzOffsetIn15Min(Integer.valueOf(FitnessDateUtils.getCurrentTZOffsetIn15min())).bedTime(sleepReport.getSleepTime() / j).wakeupTime(sleepReport.getWakeTime() / j).build();
            }
        } else {
            FitnessLogUtils.i(this.TAG, "accSleepStages: " + mutableList);
            sleepSegmentReportBuild = createSleepSegmentReport(SleepDataConvert.INSTANCE.convertToSleepStageRecordList(mutableList));
        }
        FitnessLogUtils.i(this.TAG, "sleepSeg = " + sleepSegmentReportBuild);
        if (sleepSegmentReportBuild != null) {
            moveSnoreAndDreamTalkAudioFile(sleepReport, sleepSegmentReportBuild);
            String currentPhoneSid = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentPhoneSid();
            SleepSnoreDecibelUtils.INSTANCE.getInstance().convertAndUploadDecibelData(currentPhoneSid, sleepSegmentReportBuild.getWakeupTime() * ((long) 1000), sleepSegmentReportBuild);
            getRecorder().recordSleepSegment(currentPhoneSid, FitnessDateUtils.getCurrentTZOffsetInSec(), sleepSegmentReportBuild);
            FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), false, "miui_function_sleep", null, 4, null);
        }
        SleepAudioFileUtils.INSTANCE.checkSwitchAndDeleteAudioIfOver();
    }
}
