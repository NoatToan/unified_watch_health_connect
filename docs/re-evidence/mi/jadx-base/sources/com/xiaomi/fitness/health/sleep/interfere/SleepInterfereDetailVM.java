package com.xiaomi.fitness.health.sleep.interfere;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereDayTask;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereTaskItem;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014JD\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\n2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110\u001eJ\"\u0010 \u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110\u001eJ\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereDetailVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "request", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest;", "getRequest", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest;", "dayTaskList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;", "getDayTaskList", "()Landroidx/lifecycle/MutableLiveData;", "dayTasksLiveData", "getDayTasksLiveData", "getInterferePlanDetail", "", "getDayTasks", "planId", "", "startDate", "endDate", "completeTask", DialWidgetType.DATE, "tasks", "Lkotlin/Pair;", "", "", "cb", "Lkotlin/Function1;", "", "stopPlan", "mockDayTasks", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepInterfereDetailVM extends AbsViewModel {

    @NotNull
    private final SleepInterfereRequest request = new SleepInterfereRequest();

    @NotNull
    private final MutableLiveData<List<SleepInterfereDayTask>> dayTaskList = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<SleepInterfereDayTask> dayTasksLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailVM$completeTask$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailVM$completeTask$1", f = "SleepInterfereDetailVM.kt", i = {}, l = {44, 45}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $cb;
        final /* synthetic */ long $date;
        final /* synthetic */ long $planId;
        final /* synthetic */ List<Pair<String, Integer>> $tasks;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailVM$completeTask$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailVM$completeTask$1$1", f = "SleepInterfereDetailVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $cb;
            final /* synthetic */ SleepInterfereDayTask $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06001(Function1<? super Boolean, Unit> function1, SleepInterfereDayTask sleepInterfereDayTask, Continuation<? super C06001> continuation) {
                super(2, continuation);
                this.$cb = function1;
                this.$result = sleepInterfereDayTask;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06001(this.$cb, this.$result, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$cb.invoke2(Boxing.boxBoolean(this.$result != null));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(long j, long j2, List<Pair<String, Integer>> list, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$planId = j;
            this.$date = j2;
            this.$tasks = list;
            this.$cb = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereDetailVM.this.new AnonymousClass1(this.$planId, this.$date, this.$tasks, this.$cb, continuation);
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
            SleepInterfereRequest request = SleepInterfereDetailVM.this.getRequest();
            long j = this.$planId;
            long j2 = this.$date;
            List<Pair<String, Integer>> list = this.$tasks;
            this.label = 1;
            obj = request.updateTask(j, j2, list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C06001 c06001 = new C06001(this.$cb, (SleepInterfereDayTask) obj, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c06001, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailVM$getDayTasks$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailVM$getDayTasks$1", f = "SleepInterfereDetailVM.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endDate;
        final /* synthetic */ long $planId;
        final /* synthetic */ long $startDate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24811(long j, long j2, long j3, Continuation<? super C24811> continuation) {
            super(2, continuation);
            this.$planId = j;
            this.$startDate = j2;
            this.$endDate = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereDetailVM.this.new C24811(this.$planId, this.$startDate, this.$endDate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepInterfereRequest request = SleepInterfereDetailVM.this.getRequest();
                long j = this.$planId;
                long j2 = this.$startDate;
                long j3 = this.$endDate;
                this.label = 1;
                obj = request.getDayTasks(j, j2, j3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SleepInterfereDetailVM.this.getDayTaskList().postValue((List) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailVM$getInterferePlanDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailVM$getInterferePlanDetail$1", f = "SleepInterfereDetailVM.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24821(Continuation<? super C24821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereDetailVM.this.new C24821(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepInterfereRequest request = SleepInterfereDetailVM.this.getRequest();
                this.label = 1;
                obj = request.getCurrentSleepInterferePlan(this);
                if (obj == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailVM$stopPlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailVM$stopPlan$1", f = "SleepInterfereDetailVM.kt", i = {}, l = {53, 54}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $cb;
        final /* synthetic */ long $planId;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailVM$stopPlan$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailVM$stopPlan$1$1", f = "SleepInterfereDetailVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $cb;
            final /* synthetic */ SleepInterferePlan $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06011(Function1<? super Boolean, Unit> function1, SleepInterferePlan sleepInterferePlan, Continuation<? super C06011> continuation) {
                super(2, continuation);
                this.$cb = function1;
                this.$result = sleepInterferePlan;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06011(this.$cb, this.$result, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$cb.invoke2(Boxing.boxBoolean(this.$result != null));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24831(long j, Function1<? super Boolean, Unit> function1, Continuation<? super C24831> continuation) {
            super(2, continuation);
            this.$planId = j;
            this.$cb = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereDetailVM.this.new C24831(this.$planId, this.$cb, continuation);
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
            SleepInterfereRequest request = SleepInterfereDetailVM.this.getRequest();
            long j = this.$planId;
            this.label = 1;
            obj = request.updateInterferePlan(j, (6 & 2) != 0 ? null : null, (6 & 4) != 0 ? null : null, (6 & 8) != 0 ? 0 : 2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C06011 c06011 = new C06011(this.$cb, (SleepInterferePlan) obj, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c06011, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final List<SleepInterfereDayTask> mockDayTasks() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SleepInterfereDayTask(1746633600L, CollectionsKt__CollectionsKt.arrayListOf(new SleepInterfereTaskItem("TIMELY_SLEEP", 2), new SleepInterfereTaskItem("LIMIT_NAPS", 0), new SleepInterfereTaskItem("NO_SCREENS_30MIN", 0)), 0, 0, false, 28, null));
        arrayList.add(new SleepInterfereDayTask(1746720000L, CollectionsKt__CollectionsKt.arrayListOf(new SleepInterfereTaskItem("TIMELY_SLEEP", 2), new SleepInterfereTaskItem("LIMIT_NAPS", 2), new SleepInterfereTaskItem("NO_SCREENS_30MIN", 2)), 0, 0, false, 28, null));
        arrayList.add(new SleepInterfereDayTask(1746806400L, CollectionsKt__CollectionsKt.arrayListOf(new SleepInterfereTaskItem("TIMELY_SLEEP", 0), new SleepInterfereTaskItem("LIMIT_NAPS", 0), new SleepInterfereTaskItem("NO_SCREENS_30MIN", 0)), 0, 0, false, 28, null));
        arrayList.add(new SleepInterfereDayTask(1746892800L, CollectionsKt__CollectionsKt.arrayListOf(new SleepInterfereTaskItem("TIMELY_SLEEP", 0), new SleepInterfereTaskItem("LIMIT_NAPS", 0), new SleepInterfereTaskItem("NO_SCREENS_30MIN", 0)), 0, 0, false, 28, null));
        arrayList.add(new SleepInterfereDayTask(1746979200L, CollectionsKt__CollectionsKt.arrayListOf(new SleepInterfereTaskItem("TIMELY_SLEEP", 0), new SleepInterfereTaskItem("LIMIT_NAPS", 0), new SleepInterfereTaskItem("NO_SCREENS_30MIN", 0)), 0, 0, false, 28, null));
        arrayList.add(new SleepInterfereDayTask(1747065600L, CollectionsKt__CollectionsKt.arrayListOf(new SleepInterfereTaskItem("TIMELY_SLEEP", 0), new SleepInterfereTaskItem("LIMIT_NAPS", 0), new SleepInterfereTaskItem("NO_SCREENS_30MIN", 0)), 0, 0, false, 28, null));
        arrayList.add(new SleepInterfereDayTask(1747152000L, CollectionsKt__CollectionsKt.arrayListOf(new SleepInterfereTaskItem("TIMELY_SLEEP", 0), new SleepInterfereTaskItem("LIMIT_NAPS", 0), new SleepInterfereTaskItem("NO_SCREENS_30MIN", 0)), 0, 0, false, 28, null));
        return arrayList;
    }

    public final void completeTask(long planId, long date, @NotNull List<Pair<String, Integer>> tasks, @NotNull Function1<? super Boolean, Unit> cb) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(cb, "cb");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(planId, date, tasks, cb, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<List<SleepInterfereDayTask>> getDayTaskList() {
        return this.dayTaskList;
    }

    public final void getDayTasks(long planId, long startDate, long endDate) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24811(planId, startDate, endDate, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<SleepInterfereDayTask> getDayTasksLiveData() {
        return this.dayTasksLiveData;
    }

    public final void getInterferePlanDetail() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24821(null), 2, null);
    }

    @NotNull
    public final SleepInterfereRequest getRequest() {
        return this.request;
    }

    public final void stopPlan(long planId, @NotNull Function1<? super Boolean, Unit> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24831(planId, cb, null), 2, null);
    }
}
