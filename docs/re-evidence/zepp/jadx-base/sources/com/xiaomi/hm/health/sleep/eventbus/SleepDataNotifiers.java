package com.xiaomi.hm.health.sleep.eventbus;

import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.eventbus.EventDateDataAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventSummeryAnalysisJobFinished;
import com.xiaomi.hm.health.play.card.DataNotifier;
import com.xiaomi.hm.health.play.card.InvalidateLiveData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\nR\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/sleep/eventbus/SleepDataNotifiers;", "", "Landroidx/lifecycle/LiveData;", "", "recentSleepInfoNotifiers", "Lcom/xiaomi/hm/health/play/card/DataNotifier;", "Lcom/xiaomi/hm/health/eventbus/EventDateDataAnalysisJobFinished;", "dataAnalysisJobFinished", "Lcom/xiaomi/hm/health/play/card/DataNotifier;", "getDataAnalysisJobFinished", "()Lcom/xiaomi/hm/health/play/card/DataNotifier;", "Lcom/xiaomi/hm/health/eventbus/EventSummeryAnalysisJobFinished;", "summeryAnalysisJobFinished", "getSummeryAnalysisJobFinished", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncDataEvent;", "hMDeviceSyncDataEvent", "getHMDeviceSyncDataEvent", "recentStepOrSleepInfoEvent", "getRecentStepOrSleepInfoEvent", "", "sleepStateNotifier", "getSleepStateNotifier", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepDataNotifiers {

    @NotNull
    public static final SleepDataNotifiers INSTANCE = new SleepDataNotifiers();

    @NotNull
    private static final DataNotifier<EventDateDataAnalysisJobFinished> dataAnalysisJobFinished = new DataNotifier<>();

    @NotNull
    private static final DataNotifier<EventSummeryAnalysisJobFinished> summeryAnalysisJobFinished = new DataNotifier<>();

    @NotNull
    private static final DataNotifier<HMDeviceSyncDataEvent> hMDeviceSyncDataEvent = new DataNotifier<>();

    @NotNull
    private static final DataNotifier<Unit> recentStepOrSleepInfoEvent = new DataNotifier<>();

    @NotNull
    private static final DataNotifier<Integer> sleepStateNotifier = new DataNotifier<>();

    /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.eventbus.SleepDataNotifiers$recentSleepInfoNotifiers$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/eventbus/EventDateDataAnalysisJobFinished;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.sleep.eventbus.SleepDataNotifiers$recentSleepInfoNotifiers$1", f = "SleepDataNotifiers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<EventDateDataAnalysisJobFinished, Unit, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@Nullable EventDateDataAnalysisJobFinished eventDateDataAnalysisJobFinished, @Nullable Unit unit, @Nullable Continuation<? super Unit> continuation) {
            return new AnonymousClass1(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    private SleepDataNotifiers() {
    }

    @NotNull
    public final DataNotifier<EventDateDataAnalysisJobFinished> getDataAnalysisJobFinished() {
        return dataAnalysisJobFinished;
    }

    @NotNull
    public final DataNotifier<HMDeviceSyncDataEvent> getHMDeviceSyncDataEvent() {
        return hMDeviceSyncDataEvent;
    }

    @NotNull
    public final DataNotifier<Unit> getRecentStepOrSleepInfoEvent() {
        return recentStepOrSleepInfoEvent;
    }

    @NotNull
    public final DataNotifier<Integer> getSleepStateNotifier() {
        return sleepStateNotifier;
    }

    @NotNull
    public final DataNotifier<EventSummeryAnalysisJobFinished> getSummeryAnalysisJobFinished() {
        return summeryAnalysisJobFinished;
    }

    @NotNull
    public final LiveData<Unit> recentSleepInfoNotifiers() {
        InvalidateLiveData.Companion companion = InvalidateLiveData.INSTANCE;
        return FlowLiveDataConversions.asLiveData$default(FlowKt.combine(FlowLiveDataConversions.asFlow(companion.listen(dataAnalysisJobFinished)), FlowLiveDataConversions.asFlow(companion.listen(recentStepOrSleepInfoEvent)), new AnonymousClass1(null)), (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
