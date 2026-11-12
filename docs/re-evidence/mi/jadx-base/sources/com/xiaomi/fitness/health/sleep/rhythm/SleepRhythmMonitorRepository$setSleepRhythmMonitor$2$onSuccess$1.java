package com.xiaomi.fitness.health.sleep.rhythm;

import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorRepository$setSleepRhythmMonitor$2$onSuccess$1", f = "SleepDisorderMonitorRepo.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
public final class SleepRhythmMonitorRepository$setSleepRhythmMonitor$2$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SoftReference<ISleepRhythmCallback> $callBackRef;
    final /* synthetic */ int $cycleDays;
    final /* synthetic */ WearableDeviceModel $deviceModel;
    final /* synthetic */ SleepRhythmReport $sleepRhythmReport;
    int label;
    final /* synthetic */ SleepRhythmMonitorRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepRhythmMonitorRepository$setSleepRhythmMonitor$2$onSuccess$1(SleepRhythmMonitorRepository sleepRhythmMonitorRepository, WearableDeviceModel wearableDeviceModel, SleepRhythmReport sleepRhythmReport, SoftReference<ISleepRhythmCallback> softReference, int i, Continuation<? super SleepRhythmMonitorRepository$setSleepRhythmMonitor$2$onSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = sleepRhythmMonitorRepository;
        this.$deviceModel = wearableDeviceModel;
        this.$sleepRhythmReport = sleepRhythmReport;
        this.$callBackRef = softReference;
        this.$cycleDays = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepRhythmMonitorRepository$setSleepRhythmMonitor$2$onSuccess$1(this.this$0, this.$deviceModel, this.$sleepRhythmReport, this.$callBackRef, this.$cycleDays, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ISleepRepository sleepDataRepo = this.this$0.getSleepDataRepo();
            WearableDeviceModel wearableDeviceModel = this.$deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            String did = wearableDeviceModel.getDid();
            SleepRhythmReport sleepRhythmReport = this.$sleepRhythmReport;
            this.label = 1;
            if (sleepDataRepo.addSleepRhyThmReport(did, sleepRhythmReport, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ISleepRhythmCallback iSleepRhythmCallback = this.$callBackRef.get();
        if (iSleepRhythmCallback != null) {
            iSleepRhythmCallback.updateSleepRhythmMonitorResult(0, this.$cycleDays);
        }
        SleepRhythmPreference.INSTANCE.setUsedSleepRhythmMonitorCycle(true);
        Logger.i(SleepRhythmMonitorRepository.TAG, "setRhythmMonitor success ;" + iSleepRhythmCallback);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepRhythmMonitorRepository$setSleepRhythmMonitor$2$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
