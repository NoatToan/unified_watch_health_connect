package com.xiaomi.fitness.training_plan.habit_plan;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import com.xiaomi.fitness.training_plan_export.model.HabitPlanHome;
import com.xiaomi.fitness.training_plan_export.model.HabitPlanImprove;
import com.xiaomi.fitness.training_plan_export.model.HabitSuccessResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J \u0010\u0016\u001a\u00020\u00122\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u0018J\u0006\u0010\u001a\u001a\u00020\u0012R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHomeVM;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanHomeModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "habitPlanHomeDetailLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanHome;", "getHabitPlanHomeDetailLiveData", "()Landroidx/lifecycle/MutableLiveData;", "habitPlanImproveLiveData", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "getHabitPlanImproveLiveData", "getHabitPlanHomeDetail", "", "planId", "", "checkHabitTrainImprove", "terminateCurrentPlan", "result", "Lkotlin/Function2;", "", "closeHabitImproveReply", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitPlanHomeVM extends BaseViewModel<HabitPlanHomeModel> {

    @NotNull
    private final MutableLiveData<HabitPlanHome> habitPlanHomeDetailLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<HabitPlan> habitPlanImproveLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$checkHabitTrainImprove$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$checkHabitTrainImprove$1", f = "HabitPlanHomeVM.kt", i = {}, l = {44, 45}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$checkHabitTrainImprove$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$checkHabitTrainImprove$1$1", f = "HabitPlanHomeVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ HabitPlanImprove $result;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HabitPlanHomeVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07941(HabitPlanImprove habitPlanImprove, HabitPlanHomeVM habitPlanHomeVM, Continuation<? super C07941> continuation) {
                super(2, continuation);
                this.$result = habitPlanImprove;
                this.this$0 = habitPlanHomeVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07941 c07941 = new C07941(this.$result, this.this$0, continuation);
                c07941.L$0 = obj;
                return c07941;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HabitPlanImprove habitPlanImprove = this.$result;
                if (habitPlanImprove != null) {
                    HabitPlanHomeVM habitPlanHomeVM = this.this$0;
                    if (habitPlanImprove.getNeedImprove()) {
                        habitPlanHomeVM.getHabitPlanImproveLiveData().postValue(habitPlanImprove.getImprovePlan());
                    } else {
                        habitPlanHomeVM.getHabitPlanImproveLiveData().postValue(null);
                    }
                } else {
                    this.this$0.getHabitPlanImproveLiveData().postValue(null);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HabitPlanHomeVM.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
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
            TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();
            this.label = 1;
            obj = trainingPlanRequest.getHabitPlanImproveCheck(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C07941 c07941 = new C07941((HabitPlanImprove) obj, HabitPlanHomeVM.this, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c07941, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$closeHabitImproveReply$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$closeHabitImproveReply$1", f = "HabitPlanHomeVM.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C32431(Continuation<? super C32431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HabitPlanHomeVM.this.new C32431(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HabitSuggestRequest habitSuggestRequest = HabitSuggestRequest.INSTANCE;
                this.label = 1;
                obj = habitSuggestRequest.habitImproveReply(false, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.i(HabitPlanHomeVM.this.getTAG(), "Habit home close habit improve result " + zBooleanValue);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$getHabitPlanHomeDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$getHabitPlanHomeDetail$1", f = "HabitPlanHomeVM.kt", i = {}, l = {28, 29}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $planId;
        int label;
        final /* synthetic */ HabitPlanHomeVM this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$getHabitPlanHomeDetail$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$getHabitPlanHomeDetail$1$1", f = "HabitPlanHomeVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ HabitPlanHome $result;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HabitPlanHomeVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07951(HabitPlanHome habitPlanHome, HabitPlanHomeVM habitPlanHomeVM, Continuation<? super C07951> continuation) {
                super(2, continuation);
                this.$result = habitPlanHome;
                this.this$0 = habitPlanHomeVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07951 c07951 = new C07951(this.$result, this.this$0, continuation);
                c07951.L$0 = obj;
                return c07951;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HabitPlanHome habitPlanHome = this.$result;
                if (habitPlanHome != null) {
                    HabitPlanHomeVM habitPlanHomeVM = this.this$0;
                    LogExtKt.loge(habitPlanHomeVM.getTAG(), "getHabitPlanHomeDetail:" + habitPlanHome);
                    habitPlanHomeVM.getHabitPlanHomeDetailLiveData().postValue(habitPlanHome);
                } else {
                    HabitPlanHomeVM habitPlanHomeVM2 = this.this$0;
                    habitPlanHomeVM2.getHabitPlanHomeDetailLiveData().postValue(null);
                    LogExtKt.loge(habitPlanHomeVM2.getTAG(), "result is null");
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32441(long j, HabitPlanHomeVM habitPlanHomeVM, Continuation<? super C32441> continuation) {
            super(2, continuation);
            this.$planId = j;
            this.this$0 = habitPlanHomeVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32441(this.$planId, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
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
            TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();
            long j = this.$planId;
            this.label = 1;
            obj = trainingPlanRequest.getHabitPlanHomeDetail(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C07951 c07951 = new C07951((HabitPlanHome) obj, this.this$0, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c07951, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$terminateCurrentPlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$terminateCurrentPlan$1", f = "HabitPlanHomeVM.kt", i = {}, l = {61, 62}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Boolean, Boolean, Unit> $result;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$terminateCurrentPlan$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanHomeVM$terminateCurrentPlan$1$1", f = "HabitPlanHomeVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ HabitSuccessResult $result;
            final /* synthetic */ Function2<Boolean, Boolean, Unit> $result$1;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07961(HabitSuccessResult habitSuccessResult, Function2<? super Boolean, ? super Boolean, Unit> function2, Continuation<? super C07961> continuation) {
                super(2, continuation);
                this.$result = habitSuccessResult;
                this.$result$1 = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07961 c07961 = new C07961(this.$result, this.$result$1, continuation);
                c07961.L$0 = obj;
                return c07961;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HabitSuccessResult habitSuccessResult = this.$result;
                if (habitSuccessResult != null) {
                    this.$result$1.invoke(Boxing.boxBoolean(habitSuccessResult.getSuccess()), Boxing.boxBoolean(habitSuccessResult.getWithReport()));
                } else {
                    this.$result$1.invoke(Boxing.boxBoolean(false), Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C32451(Function2<? super Boolean, ? super Boolean, Unit> function2, Continuation<? super C32451> continuation) {
            super(2, continuation);
            this.$result = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32451(this.$result, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
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
            TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();
            this.label = 1;
            obj = trainingPlanRequest.terminatePlan(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C07961 c07961 = new C07961((HabitSuccessResult) obj, this.$result, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c07961, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void checkHabitTrainImprove() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    public final void closeHabitImproveReply() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C32431(null), 2, null);
    }

    public final void getHabitPlanHomeDetail(long planId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C32441(planId, this, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<HabitPlanHome> getHabitPlanHomeDetailLiveData() {
        return this.habitPlanHomeDetailLiveData;
    }

    @NotNull
    public final MutableLiveData<HabitPlan> getHabitPlanImproveLiveData() {
        return this.habitPlanImproveLiveData;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "HabitPlanHomeVM";
    }

    public final void terminateCurrentPlan(@NotNull Function2<? super Boolean, ? super Boolean, Unit> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C32451(result, null), 2, null);
    }
}
