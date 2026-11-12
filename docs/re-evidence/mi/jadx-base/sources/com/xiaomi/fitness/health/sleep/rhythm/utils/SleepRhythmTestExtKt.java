package com.xiaomi.fitness.health.sleep.rhythm.utils;

import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.annotation.SleepRhythmType;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\u0002\u001a0\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"testAddProcessMonitorCycle", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "testAddHistoryMonitorCycle", "testAddSleepRhyThmReport", "sid", "", "status", "", "cycleDays", "startTimeSecond", "", "(Ljava/lang/String;IIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SleepRhythmTestExtKt {

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.utils.SleepRhythmTestExtKt$testAddHistoryMonitorCycle$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.utils.SleepRhythmTestExtKt", f = "SleepRhythmTestExt.kt", i = {0, 0}, l = {25, 33}, m = "testAddHistoryMonitorCycle", n = {"repo", "deviceModel"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
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
            return SleepRhythmTestExtKt.testAddHistoryMonitorCycle(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object testAddHistoryMonitorCycle(@NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        ISleepRepository iSleepRepository;
        WearableDeviceModel wearableDeviceModel;
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
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                wearableDeviceModel = (WearableDeviceModel) anonymousClass1.L$1;
                iSleepRepository = (ISleepRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        iSleepRepository = (ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class);
        wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return Unit.INSTANCE;
        }
        String did = wearableDeviceModel.getDid();
        LocalDate localDateMinusDays = LocalDate.now().minusDays(40);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
        SleepRhythmReport sleepRhythmReport = new SleepRhythmReport(2, 14, TimeDateUtil.changZeroOfTheDay(localDateMinusDays));
        anonymousClass1.L$0 = iSleepRepository;
        anonymousClass1.L$1 = wearableDeviceModel;
        anonymousClass1.label = 1;
        if (iSleepRepository.addSleepRhyThmReport(did, sleepRhythmReport, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        String did2 = wearableDeviceModel.getDid();
        LocalDate localDateMinusDays2 = LocalDate.now().minusDays(60);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays2, "minusDays(...)");
        SleepRhythmReport sleepRhythmReport2 = new SleepRhythmReport(1, 5, TimeDateUtil.changZeroOfTheDay(localDateMinusDays2));
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        if (iSleepRepository.addSleepRhyThmReport(did2, sleepRhythmReport2, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object testAddProcessMonitorCycle(@NotNull Continuation<? super Unit> continuation) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return Unit.INSTANCE;
        }
        String did = wearableDeviceModel.getDid();
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        Object objTestAddSleepRhyThmReport = testAddSleepRhyThmReport(did, 0, 28, TimeDateUtil.changZeroOfTheDay(localDateNow), continuation);
        return objTestAddSleepRhyThmReport == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTestAddSleepRhyThmReport : Unit.INSTANCE;
    }

    @Nullable
    public static final Object testAddSleepRhyThmReport(@NotNull String str, @SleepRhythmType int i, int i2, long j, @NotNull Continuation<? super Unit> continuation) {
        Object objAddSleepRhyThmReport = ((ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class)).addSleepRhyThmReport(str, new SleepRhythmReport(i, i2, j), continuation);
        return objAddSleepRhyThmReport == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAddSleepRhyThmReport : Unit.INSTANCE;
    }
}
