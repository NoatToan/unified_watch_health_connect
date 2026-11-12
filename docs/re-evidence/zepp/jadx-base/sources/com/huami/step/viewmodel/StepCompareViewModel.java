package com.huami.step.viewmodel;

import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import androidx.p008lifecycle.ViewModel;
import com.huami.hmchartui.model.CommonCompareData;
import com.huami.hmchartui.utils.CommonTimeUtils;
import com.huami.step.model.StepInfo;
import com.huami.step.model.StepsInTime;
import com.huami.step.repo.StepInfoRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/step/viewmodel/StepCompareViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/step/model/StepsInTime;", "stepsInTime", "", "a", "", "userId", "timeType", "Landroidx/lifecycle/LiveData;", "Lcom/huami/hmchartui/model/CommonCompareData;", "getPeriodTimeLiveData", "Lcom/huami/step/repo/StepInfoRepository;", "Lcom/huami/step/repo/StepInfoRepository;", "repository", "<init>", "(Lcom/huami/step/repo/StepInfoRepository;)V", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepCompareViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final StepInfoRepository repository;

    /* JADX INFO: renamed from: com.huami.step.viewmodel.StepCompareViewModel$getPeriodTimeLiveData$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "Lcom/huami/hmchartui/model/CommonCompareData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.step.viewmodel.StepCompareViewModel$getPeriodTimeLiveData$1", f = "StepCompareViewModel.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<CommonCompareData>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;

        /* JADX INFO: renamed from: com.huami.step.viewmodel.StepCompareViewModel$getPeriodTimeLiveData$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/step/model/StepsInTime;", "thisValue", "lastValue", "Lcom/huami/hmchartui/model/CommonCompareData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.step.viewmodel.StepCompareViewModel$getPeriodTimeLiveData$1$1$1", f = "StepCompareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function3<StepsInTime, StepsInTime, Continuation<? super CommonCompareData>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public /* synthetic */ Object c;
            public final /* synthetic */ StepCompareViewModel d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StepCompareViewModel stepCompareViewModel, Continuation<? super a> continuation) {
                super(3, continuation);
                this.d = stepCompareViewModel;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull StepsInTime stepsInTime, @NotNull StepsInTime stepsInTime2, @Nullable Continuation<? super CommonCompareData> continuation) {
                a aVar = new a(this.d, continuation);
                aVar.b = stepsInTime;
                aVar.c = stepsInTime2;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                StepsInTime stepsInTime = (StepsInTime) this.b;
                StepsInTime stepsInTime2 = (StepsInTime) this.c;
                return new CommonCompareData(stepsInTime.getTotalStep().getSteps() / this.d.a(stepsInTime), stepsInTime2.getTotalStep().getSteps() / this.d.a(stepsInTime2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.d = i;
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<CommonCompareData> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = StepCompareViewModel.this.new AnonymousClass1(this.d, this.e, continuation);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0076  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Flow flowAsFlow;
            Flow flowZip;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final LiveDataScope liveDataScope = (LiveDataScope) this.b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                LiveData<StepsInTime> stepsInTimeRange = StepCompareViewModel.this.repository.getStepsInTimeRange(jCurrentTimeMillis, this.d, this.e);
                Flow flowAsFlow2 = stepsInTimeRange == null ? null : FlowLiveDataConversions.asFlow(stepsInTimeRange);
                if (this.d == 18) {
                    LiveData<StepsInTime> stepsInTimeRange2 = StepCompareViewModel.this.repository.getStepsInTimeRange(CommonTimeUtils.INSTANCE.getFirstDayOfMonthTime(jCurrentTimeMillis) - 1, this.d, this.e);
                    if (stepsInTimeRange2 == null) {
                        flowAsFlow = null;
                    } else {
                        flowAsFlow = FlowLiveDataConversions.asFlow(stepsInTimeRange2);
                    }
                } else {
                    LiveData<StepsInTime> stepsInTimeRange3 = StepCompareViewModel.this.repository.getStepsInTimeRange(CommonTimeUtils.INSTANCE.getFirstDayOfWeekTime(jCurrentTimeMillis) - 1, this.d, this.e);
                    if (stepsInTimeRange3 == null) {
                        flowAsFlow = null;
                    } else {
                        flowAsFlow = FlowLiveDataConversions.asFlow(stepsInTimeRange3);
                    }
                }
                if (flowAsFlow != null) {
                    StepCompareViewModel stepCompareViewModel = StepCompareViewModel.this;
                    if (flowAsFlow2 != null && (flowZip = FlowKt.zip(flowAsFlow2, flowAsFlow, new a(stepCompareViewModel, null))) != null) {
                        FlowCollector<CommonCompareData> flowCollector = new FlowCollector<CommonCompareData>() { // from class: com.huami.step.viewmodel.StepCompareViewModel$getPeriodTimeLiveData$1$invokeSuspend$lambda-1$$inlined$collect$1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            @Nullable
                            public Object emit(CommonCompareData commonCompareData, @NotNull Continuation continuation) {
                                Object objEmit = liveDataScope.emit(commonCompareData, continuation);
                                return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                            }
                        };
                        this.a = 1;
                        if (flowZip.collect(flowCollector, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
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

    public StepCompareViewModel(@NotNull StepInfoRepository stepInfoRepository) {
        this.repository = stepInfoRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int a(StepsInTime stepsInTime) {
        StepInfo totalStep;
        if (stepsInTime == null || (totalStep = stepsInTime.getTotalStep()) == null || totalStep.getDaysHasData() == 0) {
            return 1;
        }
        return totalStep.getDaysHasData();
    }

    @NotNull
    public final LiveData<CommonCompareData> getPeriodTimeLiveData(@NotNull String userId, int timeType) {
        return CoroutineLiveDataKt.liveData$default(Dispatchers.getDefault(), 0L, new AnonymousClass1(timeType, userId, null), 2, (Object) null);
    }
}
