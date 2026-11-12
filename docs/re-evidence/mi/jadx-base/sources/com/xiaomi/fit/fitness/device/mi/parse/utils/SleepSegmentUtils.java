package com.xiaomi.fit.fitness.device.mi.parse.utils;

import com.xiaomi.fit.data.common.data.daily.SleepAssistItemInfo;
import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.mi.parse.utils.SleepSegmentUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.stat.AnimalInfo;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.data.AllDaySleepParseData;
import com.xiaomi.fit.fitness.sleep.algo.MiDevSleepAlgo;
import com.xiaomi.fit.fitness.sleep.algo.stage.data.SleepStage;
import com.xiaomi.fit.fitness.sleep.algo.stage.data.SleepStageSummary;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.s7r;
import defpackage.ur9;
import defpackage.v64;
import defpackage.xt9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eJ \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fit/fitness/device/mi/parse/utils/SleepSegmentUtils;", "", "<init>", "()V", "TAG", "", "DEVICE_CAPABILITY_7_DAY_SLEEP", "", "sleepRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "computeSleepSegmentReport", "", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "sleepData", "Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;", "(Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertToSleepSegmentReport", "sleepSummary", "Lcom/xiaomi/fit/fitness/sleep/algo/stage/data/SleepStageSummary;", "convertToSegmentReport", "convertSleepState", "Lcom/xiaomi/fit/data/common/data/daily/SleepStateItem;", "sleepStage", "Lcom/xiaomi/fit/fitness/sleep/algo/stage/data/SleepStage;", "writeBackSleepToDevice", "", "did", "hasNewSleep", "", "startTime", "", "endTime", "isDeviceSupport7daysSleep", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepSegmentUtils {

    @NotNull
    public static final SleepSegmentUtils INSTANCE = new SleepSegmentUtils();

    @NotNull
    private static final String TAG = "SleepSegmentUtils";
    private static final int DEVICE_CAPABILITY_7_DAY_SLEEP = 32;

    @NotNull
    private static final ISleepRepository sleepRepo = (ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class);

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.mi.parse.utils.SleepSegmentUtils$computeSleepSegmentReport$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.parse.utils.SleepSegmentUtils", f = "SleepSegmentUtils.kt", i = {0, 0, 0}, l = {48}, m = "computeSleepSegmentReport", n = {"this", "dataId", "sleepData"}, s = {"L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepSegmentUtils.this.computeSleepSegmentReport(null, null, this);
        }
    }

    private SleepSegmentUtils() {
    }

    private final SleepStateItem convertSleepState(SleepStage sleepStage) {
        return new SleepStateItem(sleepStage.startTime, sleepStage.endTime, sleepStage.state);
    }

    private final SleepSegmentReport convertToSegmentReport(SleepStageSummary sleepSummary) {
        SleepStage[] sleepStageArr;
        SleepSegmentReport.Builder builderWakeCount = new SleepSegmentReport.Builder().bedTime(sleepSummary.sleepIntoTs).wakeupTime(sleepSummary.sleepOutofTs).sleepDuration(sleepSummary.sleepDuration).lightSleepDuration(sleepSummary.lightDuration).deepSleepDuration(sleepSummary.deepDuration).wakeDuration(sleepSummary.wakeDuration).wakeCount(sleepSummary.wakeCount);
        if (sleepSummary.hasRem) {
            builderWakeCount.remDuration(sleepSummary.remDuration);
        }
        int i = sleepSummary.breathQualityState;
        if (i == 1) {
            builderWakeCount.breathQuality(sleepSummary.breathQuality);
        } else if (i == 3) {
            builderWakeCount.breathQuality(0);
        }
        int i2 = sleepSummary.breathRateState;
        if (i2 == 1) {
            builderWakeCount.avgBreathRate(sleepSummary.avgBreathRate);
        } else if (i2 == 3) {
            builderWakeCount.avgBreathRate(0);
        }
        if (!sleepSummary.hasStage || (sleepStageArr = sleepSummary.stages) == null) {
            return builderWakeCount.build();
        }
        Iterator it = ArrayIteratorKt.iterator(sleepStageArr);
        while (it.hasNext()) {
            SleepStage sleepStage = (SleepStage) it.next();
            Intrinsics.checkNotNull(sleepStage);
            builderWakeCount.addSleepState(convertSleepState(sleepStage));
        }
        return builderWakeCount.build();
    }

    private final SleepSegmentReport convertToSleepSegmentReport(FitnessDataId dataId, SleepStageSummary sleepSummary, AllDaySleepParseData sleepData) {
        SleepSegmentReport sleepSegmentReportConvertToSegmentReport = convertToSegmentReport(sleepSummary);
        SleepSegmentReport.Builder builderLeaveBedTime = sleepSegmentReportConvertToSegmentReport.builder().tzOffsetIn15Min(Integer.valueOf(dataId.getTzIn15Min())).version(Integer.valueOf(dataId.getVersion())).deviceBedTime(sleepData.getDeviceBedTime()).deviceWakeupTime(sleepData.getDeviceWakeupTime()).sleepEfficiency(sleepData.getSleepEfficiency()).entrySleepDuration(sleepData.getEntrySleepDuration()).linBedDuration(sleepData.getLinBedDuration()).goBedTime(sleepData.getGoBedTime()).leaveBedTime(sleepData.getLeaveBedTime());
        SleepAssistItemInfo hrInfo = sleepData.getHrInfo();
        if (sleepSegmentReportConvertToSegmentReport.hasStageData() && hrInfo != null) {
            hrInfo.computeIntMeanValues(sleepSummary.sleepIntoTs, sleepSummary.sleepOutofTs);
            builderLeaveBedTime.hr(hrInfo.getAvgValue(), hrInfo.getMaxValue(), hrInfo.getMinValue());
        }
        SleepAssistItemInfo spo2Info = sleepData.getSpo2Info();
        if (sleepSegmentReportConvertToSegmentReport.hasStageData() && spo2Info != null) {
            spo2Info.computeIntMeanValues(sleepSummary.sleepIntoTs, sleepSummary.sleepOutofTs);
            builderLeaveBedTime.spo2(spo2Info.getAvgValue(), spo2Info.getMaxValue(), spo2Info.getMinValue());
        }
        return builderLeaveBedTime.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeBackSleepToDevice$lambda$0(String did, boolean z) {
        Intrinsics.checkNotNullParameter(did, "$did");
        SleepSegmentUtils sleepSegmentUtils = INSTANCE;
        int i = sleepSegmentUtils.isDeviceSupport7daysSleep(did) ? 7 : 1;
        if (i == 1 && !z) {
            FitnessLogUtils.i(TAG, "(" + i + ")day sleep(" + z + "),not write back");
            return;
        }
        long todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec();
        FitnessDateUtils fitnessDateUtils = FitnessDateUtils.INSTANCE;
        long seconds_one_day = todayZeroTimeInSec - (fitnessDateUtils.getSECONDS_ONE_DAY() * ((long) (i - 1)));
        long seconds_one_day2 = fitnessDateUtils.getSECONDS_ONE_DAY() + todayZeroTimeInSec;
        FitnessLogUtils.i(TAG, "writeBackSleepToDevice: " + i + " days (" + seconds_one_day + "-" + seconds_one_day2 + ")");
        sleepSegmentUtils.writeBackSleepToDevice(did, seconds_one_day, seconds_one_day2);
    }

    private static final int writeBackSleepToDevice$mapOldToNewAnimalType(int i) {
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 2;
            case 3:
                return 6;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 1;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object computeSleepSegmentReport(@NotNull FitnessDataId fitnessDataId, @NotNull AllDaySleepParseData allDaySleepParseData, @NotNull Continuation<? super List<SleepSegmentReport>> continuation) {
        AnonymousClass1 anonymousClass1;
        SleepSegmentUtils sleepSegmentUtils;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object sleep = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(sleep);
                if (allDaySleepParseData.getSleepSrcBytes() == null) {
                    FitnessLogUtils.w(TAG, "no sleep src data " + allDaySleepParseData);
                    return null;
                }
                FitnessLogUtils.i(TAG, "sleep segment: " + allDaySleepParseData);
                MiDevSleepAlgo companion = MiDevSleepAlgo.INSTANCE.getInstance();
                byte[] sleepSrcBytes = allDaySleepParseData.getSleepSrcBytes();
                Intrinsics.checkNotNull(sleepSrcBytes);
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = fitnessDataId;
                anonymousClass1.L$2 = allDaySleepParseData;
                anonymousClass1.label = 1;
                sleep = companion.parseSleep(sleepSrcBytes, anonymousClass1);
                if (sleep == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sleepSegmentUtils = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                allDaySleepParseData = (AllDaySleepParseData) anonymousClass1.L$2;
                fitnessDataId = (FitnessDataId) anonymousClass1.L$1;
                sleepSegmentUtils = (SleepSegmentUtils) anonymousClass1.L$0;
                ResultKt.throwOnFailure(sleep);
            }
            List<SleepStageSummary> list = (List) sleep;
            if (list.isEmpty()) {
                FitnessLogUtils.w(TAG, "sleep stage parse failed " + allDaySleepParseData);
                return null;
            }
            FitnessLogUtils.i(TAG, "parseSleep - success");
            ArrayList arrayList = new ArrayList();
            for (SleepStageSummary sleepStageSummary : list) {
                FitnessLogUtils.i(TAG, "parseSleep - " + sleepStageSummary);
                if (sleepStageSummary.sleepDuration != 0) {
                    arrayList.add(sleepSegmentUtils.convertToSleepSegmentReport(fitnessDataId, sleepStageSummary, allDaySleepParseData));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "parse sleep should not be here ", th);
            return null;
        }
    }

    public final boolean isDeviceSupport7daysSleep(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        int deviceCapability = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(did);
        int i = DEVICE_CAPABILITY_7_DAY_SLEEP;
        return (deviceCapability & i) == i;
    }

    public final void writeBackSleepToDevice(@NotNull final String did, final boolean hasNewSleep) {
        Intrinsics.checkNotNullParameter(did, "did");
        ExecutorHelper.getBackgroundPool().execute(new Runnable() { // from class: fxm
            @Override // java.lang.Runnable
            public final void run() {
                SleepSegmentUtils.writeBackSleepToDevice$lambda$0(did, hasNewSleep);
            }
        });
    }

    private final void writeBackSleepToDevice(String did, long startTime, long endTime) {
        int iIntValue;
        int iIntValue2;
        List<DailyRecordItem> list = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).getTheDailyItems(did, startTime, endTime, FitnessDateUtils.getCurrentTZOffsetInSec(), "sleep").get("sleep");
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>");
        List<DailyRecordItem> list2 = list;
        if (list2.isEmpty()) {
            FitnessLogUtils.i(TAG, "writeBackSleepToDevice: no sleep(" + did + ")");
            return;
        }
        Collections.sort(list2);
        int size = list2.size();
        xt9 xt9Var = new xt9();
        ur9 ur9Var = new ur9();
        ur9Var.J0(xt9Var);
        xt9Var.c = new xt9.c[size];
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            xt9.c cVar = new xt9.c();
            xt9.b bVar = new xt9.b();
            SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) list2.get(i);
            AllDaySleepReport report = ((ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class)).getReport(null, FitnessDateUtils.INSTANCE.changeZeroOfTheDay(sleepSegmentReport.getWakeupTime()));
            cVar.e = (int) sleepSegmentReport.getBedTime();
            cVar.f = (int) sleepSegmentReport.getWakeupTime();
            v64 v64Var = new v64();
            cVar.c = v64Var;
            v64Var.c = sleepSegmentReport.getTzIn15Min();
            cVar.d = sleepSegmentReport.getSleepDuration() * 60;
            if (sleepSegmentReport.getAvgHr() == null) {
                iIntValue = 0;
            } else {
                Integer avgHr = sleepSegmentReport.getAvgHr();
                Intrinsics.checkNotNull(avgHr);
                iIntValue = avgHr.intValue();
            }
            cVar.g = iIntValue;
            if (sleepSegmentReport.getAvgSpo2() == null) {
                iIntValue2 = 0;
            } else {
                Integer avgSpo2 = sleepSegmentReport.getAvgSpo2();
                Intrinsics.checkNotNull(avgSpo2);
                iIntValue2 = avgSpo2.intValue();
            }
            cVar.h = iIntValue2;
            Integer sleepEfficiency = sleepSegmentReport.getSleepEfficiency();
            bVar.f = sleepEfficiency != null ? sleepEfficiency.intValue() : 0;
            bVar.e = report != null ? report.getScore() : 0;
            Long linBedDuration = sleepSegmentReport.getLinBedDuration();
            bVar.c = linBedDuration != null ? (int) linBedDuration.longValue() : 0;
            Long entrySleepDuration = sleepSegmentReport.getEntrySleepDuration();
            bVar.d = entrySleepDuration != null ? (int) entrySleepDuration.longValue() : 0;
            Integer avgBreathRate = sleepSegmentReport.getAvgBreathRate();
            bVar.g = avgBreathRate != null ? avgBreathRate.intValue() : 0;
            cVar.i = bVar;
            xt9Var.c[i] = cVar;
            Logger.i(TAG, "writeBackSleepToDevice " + bVar + " " + sleepSegmentReport.getWakeupTime());
            i++;
        }
        SleepAnimalReport latestSleepAnimalSync = sleepRepo.getLatestSleepAnimalSync();
        xt9.a aVar = new xt9.a();
        if ((latestSleepAnimalSync != null ? latestSleepAnimalSync.getAnimal() : null) != null) {
            AnimalInfo animal = latestSleepAnimalSync.getAnimal();
            Intrinsics.checkNotNull(animal);
            aVar.c = writeBackSleepToDevice$mapOldToNewAnimalType(animal.getType());
            aVar.d = latestSleepAnimalSync.getSampleDates().size();
            aVar.e = 7;
        }
        xt9Var.d = aVar;
        String str = TAG;
        Logger.i(str, "writeBackSleepToDevice: animal = " + aVar);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 41;
        s7rVar.S(ur9Var);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        FitnessLogUtils.i(str, "writeBackSleepToDevice: segSize = " + size + " did = " + did + ", deviceModel = " + wearableDeviceModel + ", wearPacket = " + s7rVar + ", startTime = " + startTime + ", endTime = " + endTime + ", hasNewSleep = true, sleepSegList = " + list2);
        if (wearableDeviceModel != null) {
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fit.fitness.device.mi.parse.utils.SleepSegmentUtils.writeBackSleepToDevice.2
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did2, int type, int code) {
                    FitnessLogUtils.i(SleepSegmentUtils.TAG, "writeBackSleepToDevice onError(did = " + did2 + ", code = " + code + "))");
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did2, int type, SyncResult result) {
                    FitnessLogUtils.i(SleepSegmentUtils.TAG, "writeBackSleepToDevice: onSuccess(did = " + did2 + ")");
                }
            }, 0, 16, (Object) null);
        }
    }
}
