package com.huami.bloodoxygen.core.service;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.usecase.clickspo2.GetLatestClickSpo2FlowUseCase;
import com.huami.bloodoxygen.core.usecase.odi.GetLatestSleepBreathScoreFlowUseCase;
import com.huami.bloodoxygen.core.usecase.odi.GetSleepBreathScoreListFlowUseCase;
import com.huami.bloodoxygen.core.usecase.osaevent.GetDifficultBreathListFlowUseCase;
import com.huami.bloodoxygen.service.Spo2Service;
import com.huami.bloodoxygen.service.odi.SleepBreathScore;
import com.huami.bloodoxygen.service.osaevent.DifficultBreath;
import com.huami.bloodoxygen.service.other.Spo2;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0002H\u0016J,\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/bloodoxygen/core/service/Spo2ServiceImpl;", "Lcom/huami/bloodoxygen/service/Spo2Service;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/bloodoxygen/service/other/Spo2;", "getLatestClickSpo2Flow", "", "from", "to", "", "Lcom/huami/bloodoxygen/service/odi/SleepBreathScore;", "getSleepBreathScoreListFlow", "getLatestSleepBreathScoreFlow", "splitIntervalTimeMillis", "Lcom/huami/bloodoxygen/service/osaevent/DifficultBreath;", "getDifficultBreathListFlow", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetLatestClickSpo2FlowUseCase;", "b", "()Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetLatestClickSpo2FlowUseCase;", "getLatestClickSpo2FlowUseCase", "Lcom/huami/bloodoxygen/core/usecase/odi/GetSleepBreathScoreListFlowUseCase;", GoogleApiAvailabilityLight.a, "()Lcom/huami/bloodoxygen/core/usecase/odi/GetSleepBreathScoreListFlowUseCase;", "getSleepBreathScoreListFlowUseCase", "Lcom/huami/bloodoxygen/core/usecase/odi/GetLatestSleepBreathScoreFlowUseCase;", "c", "()Lcom/huami/bloodoxygen/core/usecase/odi/GetLatestSleepBreathScoreFlowUseCase;", "getLatestSleepBreathScoreFlowUseCase", "Lcom/huami/bloodoxygen/core/usecase/osaevent/GetDifficultBreathListFlowUseCase;", "a", "()Lcom/huami/bloodoxygen/core/usecase/osaevent/GetDifficultBreathListFlowUseCase;", "getDifficultBreathListFlowUseCase", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public class Spo2ServiceImpl implements Spo2Service {
    private final GetDifficultBreathListFlowUseCase a() {
        return (GetDifficultBreathListFlowUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(GetDifficultBreathListFlowUseCase.class), null, null);
    }

    private final GetLatestClickSpo2FlowUseCase b() {
        return (GetLatestClickSpo2FlowUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(GetLatestClickSpo2FlowUseCase.class), null, null);
    }

    private final GetLatestSleepBreathScoreFlowUseCase c() {
        return (GetLatestSleepBreathScoreFlowUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(GetLatestSleepBreathScoreFlowUseCase.class), null, null);
    }

    private final GetSleepBreathScoreListFlowUseCase d() {
        return (GetSleepBreathScoreListFlowUseCase) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(GetSleepBreathScoreListFlowUseCase.class), null, null);
    }

    @Override // com.huami.bloodoxygen.service.Spo2Service
    @NotNull
    public Flow<List<DifficultBreath>> getDifficultBreathListFlow(long from, long to, long splitIntervalTimeMillis) {
        return a().execute(from, to, splitIntervalTimeMillis);
    }

    @Override // com.huami.bloodoxygen.service.Spo2Service
    @NotNull
    public Flow<Spo2> getLatestClickSpo2Flow() {
        final Flow<ClickMeasuredSpo2> flowExecute = b().execute();
        return new Flow<Spo2>() { // from class: com.huami.bloodoxygen.core.service.Spo2ServiceImpl$getLatestClickSpo2Flow$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.bloodoxygen.core.service.Spo2ServiceImpl$getLatestClickSpo2Flow$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<ClickMeasuredSpo2> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ Spo2ServiceImpl$getLatestClickSpo2Flow$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.bloodoxygen.core.service.Spo2ServiceImpl$getLatestClickSpo2Flow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bloodoxygen.core.service.Spo2ServiceImpl$getLatestClickSpo2Flow$$inlined$map$1$2", f = "Spo2ServiceImpl.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Spo2ServiceImpl$getLatestClickSpo2Flow$$inlined$map$1 spo2ServiceImpl$getLatestClickSpo2Flow$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = spo2ServiceImpl$getLatestClickSpo2Flow$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(ClickMeasuredSpo2 clickMeasuredSpo2, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        ClickMeasuredSpo2 clickMeasuredSpo3 = clickMeasuredSpo2;
                        Spo2 spo2 = clickMeasuredSpo3 == null ? null : new Spo2(clickMeasuredSpo3.getTimestamp(), clickMeasuredSpo3.getSpo2());
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(spo2, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Spo2> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowExecute.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.bloodoxygen.service.Spo2Service
    @NotNull
    public Flow<SleepBreathScore> getLatestSleepBreathScoreFlow() {
        return c().execute();
    }

    @Override // com.huami.bloodoxygen.service.Spo2Service
    @NotNull
    public Flow<List<SleepBreathScore>> getSleepBreathScoreListFlow(long from, long to) {
        return d().execute(from, to);
    }
}
