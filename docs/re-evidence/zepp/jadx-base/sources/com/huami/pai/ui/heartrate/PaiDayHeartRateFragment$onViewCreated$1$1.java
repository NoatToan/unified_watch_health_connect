package com.huami.pai.ui.heartrate;

import android.util.Pair;
import android.util.SparseArray;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.huami.chart.data.ChartData;
import com.huami.pai.vo.PAIDataVo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.pai.ui.heartrate.PaiDayHeartRateFragment$onViewCreated$1$1", f = "PaiDayHeartRateFragment.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
public final class PaiDayHeartRateFragment$onViewCreated$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ PaiDayHeartRateFragment b;
    public final /* synthetic */ PAIDataVo c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Landroid/util/Pair;", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.heartrate.PaiDayHeartRateFragment$onViewCreated$1$1$1", f = "PaiDayHeartRateFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<FlowCollector<? super Pair<SparseArray<ChartData>, Integer>>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PaiDayHeartRateFragment b;
        public final /* synthetic */ PAIDataVo c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PaiDayHeartRateFragment paiDayHeartRateFragment, PAIDataVo pAIDataVo, Continuation<? super a> continuation) {
            super(3, continuation);
            this.b = paiDayHeartRateFragment;
            this.c = pAIDataVo;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Pair<SparseArray<ChartData>, Integer>> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            return new a(this.b, this.c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.b().pvHeartRateChart.setData(null, new int[]{this.c.getLhr(), this.c.getMhr(), this.c.getHhr()});
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaiDayHeartRateFragment$onViewCreated$1$1(PaiDayHeartRateFragment paiDayHeartRateFragment, PAIDataVo pAIDataVo, Continuation<? super PaiDayHeartRateFragment$onViewCreated$1$1> continuation) {
        super(2, continuation);
        this.b = paiDayHeartRateFragment;
        this.c = pAIDataVo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PaiDayHeartRateFragment$onViewCreated$1$1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((PaiDayHeartRateFragment$onViewCreated$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowM4456catch = FlowKt.m4456catch(this.b.mRepoPai.heartRateData(LifecycleOwnerKt.getLifecycleScope(this.b), this.c.getDate(), this.b.curUserId), new a(this.b, this.c, null));
            final PaiDayHeartRateFragment paiDayHeartRateFragment = this.b;
            final PAIDataVo pAIDataVo = this.c;
            FlowCollector<Pair<SparseArray<ChartData>, Integer>> flowCollector = new FlowCollector<Pair<SparseArray<ChartData>, Integer>>() { // from class: com.huami.pai.ui.heartrate.PaiDayHeartRateFragment$onViewCreated$1$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Pair<SparseArray<ChartData>, Integer> pair, @NotNull Continuation continuation) {
                    SparseArray<ChartData> sparseArray = (SparseArray) pair.first;
                    int size = sparseArray.size();
                    if (size > 0) {
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            ChartData chartDataValueAt = sparseArray.valueAt(i2);
                            float f = chartDataValueAt.getValues()[0];
                            if (f > 0.0f) {
                                if (f <= paiDayHeartRateFragment.VALUE_MIN_HEARTRATE) {
                                    f = paiDayHeartRateFragment.VALUE_MIN_HEARTRATE;
                                } else if (f > paiDayHeartRateFragment.VALUE_MAX_HEARTRATE) {
                                    f = paiDayHeartRateFragment.VALUE_MAX_HEARTRATE;
                                }
                            }
                            chartDataValueAt.getValues()[0] = f;
                            if (i3 >= size) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                    paiDayHeartRateFragment.b().pvHeartRateChart.setData(sparseArray, new int[]{pAIDataVo.getLhr(), pAIDataVo.getMhr(), pAIDataVo.getHhr()});
                    return Unit.INSTANCE;
                }
            };
            this.a = 1;
            if (flowM4456catch.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
