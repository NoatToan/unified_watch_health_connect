package com.huami.sleep.service;

import androidx.exifinterface.media.ExifInterface;
import com.huami.sky.service.RelaxDataService;
import com.huami.sleep.service.bean.WithTonalitySleepInfoData;
import com.huami.tools.log.HMLog;
import it.sauronsoftware.ftp4j.FTPCodes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.huami.sleep.service.SleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$lambda-16$$inlined$flatMapLatest$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.sleep.service.SleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$lambda-16$$inlined$flatMapLatest$1", f = "SleepServiceDataSourceImpl.kt", i = {}, l = {FTPCodes.USER_LOGGED_IN, 224}, m = "invokeSuspend", n = {}, s = {})
public final class SleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$lambda16$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super SleepWithTonalityInfo>, WithTonalitySleepInfoData, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ RelaxDataService d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$lambda16$$inlined$flatMapLatest$1(Continuation continuation, RelaxDataService relaxDataService) {
        super(3, continuation);
        this.d = relaxDataService;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super SleepWithTonalityInfo> flowCollector, WithTonalitySleepInfoData withTonalitySleepInfoData, @Nullable Continuation<? super Unit> continuation) {
        SleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$lambda16$$inlined$flatMapLatest$1 sleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$lambda16$$inlined$flatMapLatest$1 = new SleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$lambda16$$inlined$flatMapLatest$1(continuation, this.d);
        sleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$lambda16$$inlined$flatMapLatest$1.b = flowCollector;
        sleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$lambda16$$inlined$flatMapLatest$1.c = withTonalitySleepInfoData;
        return sleepServiceDataSourceImpl$fetchWithTonalityMainSleepInfo$lambda16$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FlowCollector flowCollector;
        WithTonalitySleepInfoData withTonalitySleepInfoData;
        FlowCollector flowCollector2;
        Flow flow;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                withTonalitySleepInfoData = (WithTonalitySleepInfoData) this.c;
                flowCollector2 = (FlowCollector) this.b;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        flowCollector = (FlowCollector) this.b;
        withTonalitySleepInfoData = (WithTonalitySleepInfoData) this.c;
        HMLog.info("SleepServiceDataSourceImpl", new SleepServiceDataSourceImpl.j(withTonalitySleepInfoData));
        if (withTonalitySleepInfoData == null) {
            flow = FlowKt.flow(new SleepServiceDataSourceImpl.k(null));
        } else {
            RelaxDataService relaxDataService = this.d;
            long mainSleepStartTime = withTonalitySleepInfoData.getMainSleepStartTime();
            long mainSleepStopTime = withTonalitySleepInfoData.getMainSleepStopTime();
            this.b = flowCollector;
            this.c = withTonalitySleepInfoData;
            this.a = 1;
            Object relaxData = relaxDataService.getRelaxData(mainSleepStartTime, mainSleepStopTime, this);
            if (relaxData == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector2 = flowCollector;
            obj = relaxData;
        }
        this.b = null;
        this.c = null;
        this.a = 2;
        if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        flow = FlowKt.mapLatest((Flow) obj, new SleepServiceDataSourceImpl.l(withTonalitySleepInfoData, null));
        flowCollector = flowCollector2;
        this.b = null;
        this.c = null;
        this.a = 2;
        if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
