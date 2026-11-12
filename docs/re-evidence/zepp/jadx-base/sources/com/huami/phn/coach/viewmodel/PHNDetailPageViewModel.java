package com.huami.phn.coach.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.coach.usecase.GetOldestPHNPlanStartDateUseCase;
import com.huami.phn.coach.usecase.PlanDetail;
import com.huami.phn.coach.usecase.PlanDetailUseCase;
import com.huami.phn.coach.usecase.UpdateRestDayUseCase;
import com.huami.phn.coach.usecase.UseCaseException;
import com.huami.phn.logic.PhnDeviceDataSyncLogic;
import com.huami.phn.util.Result;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b-\u0010.J\u0019\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0004R\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R+\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00190\u00180\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\r\u0010\u0013R\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0010\u0010#R\u001d\u0010(\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b\u001a\u0010'R\u001d\u0010,\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b\u0015\u0010+¨\u00060"}, d2 = {"Lcom/huami/phn/coach/viewmodel/PHNDetailPageViewModel;", "Landroidx/lifecycle/ViewModel;", "", "id", "", "loadPlanDetailLiveData", "(Ljava/lang/Long;)V", "", "rest", "modifyRestDays", "", "isShow", "showTrainingStatus", "getOldestStartDateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/phn/coach/usecase/PlanDetail;", "a", "Landroidx/lifecycle/MutableLiveData;", "getPlanDetailLiveData", "()Landroidx/lifecycle/MutableLiveData;", "planDetailLiveData", "b", "getShowTrainingStatusLiveData", "showTrainingStatusLiveData", "Lcom/huami/phn/util/Result;", "Lcom/huami/phn/coach/usecase/UseCaseException;", "c", "getModifyRestDaysLiveData", "modifyRestDaysLiveData", "Ljava/util/Calendar;", GoogleApiAvailabilityLight.a, "oldestStartDateLiveData", "Lcom/huami/phn/coach/usecase/PlanDetailUseCase;", "e", "Lkotlin/Lazy;", "()Lcom/huami/phn/coach/usecase/PlanDetailUseCase;", "detail", "Lcom/huami/phn/coach/usecase/UpdateRestDayUseCase;", "f", "()Lcom/huami/phn/coach/usecase/UpdateRestDayUseCase;", "updateRestDay", "Lcom/huami/phn/coach/usecase/GetOldestPHNPlanStartDateUseCase;", "g", "()Lcom/huami/phn/coach/usecase/GetOldestPHNPlanStartDateUseCase;", "getOldestStartDateUseCase", "<init>", "()V", "h", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNDetailPageViewModel extends ViewModel {

    @Deprecated
    @NotNull
    public static final String TAG = "PHNDetailPageViewModel";

    @NotNull
    private static final a h = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<PlanDetail> planDetailLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showTrainingStatusLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Result<Boolean, UseCaseException>> modifyRestDaysLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Calendar> oldestStartDateLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy detail = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy updateRestDay = LazyKt__LazyJVMKt.lazy(new h());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy getOldestStartDateUseCase = LazyKt__LazyJVMKt.lazy(d.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/phn/coach/viewmodel/PHNDetailPageViewModel$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/phn/coach/usecase/PlanDetailUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<PlanDetailUseCase> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PlanDetailUseCase getA() {
            return (PlanDetailUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(PlanDetailUseCase.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.phn.coach.viewmodel.PHNDetailPageViewModel$getOldestStartDateLiveData$1", f = "PHNDetailPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PHNDetailPageViewModel.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Calendar calendarExecute = PHNDetailPageViewModel.this.b().execute();
            if (calendarExecute != null) {
                PHNDetailPageViewModel.this.getOldestStartDateLiveData().postValue(calendarExecute);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/phn/coach/usecase/GetOldestPHNPlanStartDateUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<GetOldestPHNPlanStartDateUseCase> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GetOldestPHNPlanStartDateUseCase getA() {
            return (GetOldestPHNPlanStartDateUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(GetOldestPHNPlanStartDateUseCase.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.phn.coach.viewmodel.PHNDetailPageViewModel$loadPlanDetailLiveData$1", f = "PHNDetailPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Long l, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PHNDetailPageViewModel.this.new e(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            PlanDetail planDetailLoad;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlanDetail planDetailLoad2 = PHNDetailPageViewModel.this.a().load(this.c);
            if (planDetailLoad2 != null) {
                PHNDetailPageViewModel pHNDetailPageViewModel = PHNDetailPageViewModel.this;
                Long l = this.c;
                pHNDetailPageViewModel.getPlanDetailLiveData().postValue(planDetailLoad2);
                if (!Intrinsics.areEqual(planDetailLoad2.getState(), PlanDetail.State.End.INSTANCE) && PhnDeviceDataSyncLogic.startSync() && (planDetailLoad = pHNDetailPageViewModel.a().load(l)) != null) {
                    pHNDetailPageViewModel.getPlanDetailLiveData().postValue(planDetailLoad);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.phn.coach.viewmodel.PHNDetailPageViewModel$modifyRestDays$1", f = "PHNDetailPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int[] iArr, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = iArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PHNDetailPageViewModel.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PHNDetailPageViewModel.this.getModifyRestDaysLiveData().postValue(PHNDetailPageViewModel.this.c().update(this.c));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.phn.coach.viewmodel.PHNDetailPageViewModel$showTrainingStatus$1", f = "PHNDetailPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PHNDetailPageViewModel.this.new g(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PHNDetailPageViewModel.this.getShowTrainingStatusLiveData().postValue(Boxing.boxBoolean(this.c));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/phn/coach/usecase/UpdateRestDayUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<UpdateRestDayUseCase> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<ParametersHolder> {
            public final /* synthetic */ PHNDetailPageViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PHNDetailPageViewModel pHNDetailPageViewModel) {
                super(0);
                this.a = pHNDetailPageViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ParametersHolder getA() {
                return ParametersHolderKt.parametersOf(Long.valueOf(this.a.getPlanDetailLiveData().getValue().getId()));
            }
        }

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UpdateRestDayUseCase getA() {
            return (UpdateRestDayUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(UpdateRestDayUseCase.class), null, new a(PHNDetailPageViewModel.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlanDetailUseCase a() {
        return (PlanDetailUseCase) this.detail.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GetOldestPHNPlanStartDateUseCase b() {
        return (GetOldestPHNPlanStartDateUseCase) this.getOldestStartDateUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateRestDayUseCase c() {
        return (UpdateRestDayUseCase) this.updateRestDay.getValue();
    }

    public static /* synthetic */ void loadPlanDetailLiveData$default(PHNDetailPageViewModel pHNDetailPageViewModel, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        pHNDetailPageViewModel.loadPlanDetailLiveData(l);
    }

    @NotNull
    public final MutableLiveData<Result<Boolean, UseCaseException>> getModifyRestDaysLiveData() {
        return this.modifyRestDaysLiveData;
    }

    @NotNull
    public final MutableLiveData<Calendar> getOldestStartDateLiveData() {
        return this.oldestStartDateLiveData;
    }

    @NotNull
    public final MutableLiveData<PlanDetail> getPlanDetailLiveData() {
        return this.planDetailLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowTrainingStatusLiveData() {
        return this.showTrainingStatusLiveData;
    }

    public final void loadPlanDetailLiveData(@Nullable Long id) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(id, null), 2, null);
    }

    public final void modifyRestDays(@NotNull int[] rest) {
        if (this.planDetailLiveData.getValue() == null) {
            return;
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new f(rest, null), 2, null);
    }

    public final void showTrainingStatus(boolean isShow) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new g(isShow, null), 2, null);
    }

    /* JADX INFO: renamed from: getOldestStartDateLiveData, reason: collision with other method in class */
    public final void m3386getOldestStartDateLiveData() {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new c(null), 3, null);
    }
}
