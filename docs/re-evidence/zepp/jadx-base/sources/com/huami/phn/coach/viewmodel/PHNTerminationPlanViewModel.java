package com.huami.phn.coach.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.coach.usecase.PlanDetail;
import com.huami.phn.coach.usecase.PlanDetailUseCase;
import com.huami.phn.coach.usecase.StopPlanUseCase;
import com.huami.phn.coach.usecase.UseCaseException;
import com.huami.phn.util.Result;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/phn/coach/viewmodel/PHNTerminationPlanViewModel;", "Landroidx/lifecycle/ViewModel;", "", "type", "", "reason", "", "stopPlan", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "getStopPlanLiveData", "()Landroidx/lifecycle/MutableLiveData;", "stopPlanLiveData", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNTerminationPlanViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> stopPlanLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.phn.coach.viewmodel.PHNTerminationPlanViewModel$stopPlan$1", f = "PHNTerminationPlanViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ PHNTerminationPlanViewModel d;

        /* JADX INFO: renamed from: com.huami.phn.coach.viewmodel.PHNTerminationPlanViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0536a extends Lambda implements Function0<ParametersHolder> {
            public final /* synthetic */ PlanDetail a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0536a(PlanDetail planDetail) {
                super(0);
                this.a = planDetail;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ParametersHolder getA() {
                return ParametersHolderKt.parametersOf(Long.valueOf(this.a.getId()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, String str, PHNTerminationPlanViewModel pHNTerminationPlanViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = i;
            this.c = str;
            this.d = pHNTerminationPlanViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlanDetail planDetailLoad$default = PlanDetailUseCase.DefaultImpls.load$default((PlanDetailUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(PlanDetailUseCase.class), null, null), null, 1, null);
            if (planDetailLoad$default != null) {
                int i = this.b;
                String str = this.c;
                PHNTerminationPlanViewModel pHNTerminationPlanViewModel = this.d;
                Result<Boolean, UseCaseException> resultStop = ((StopPlanUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(StopPlanUseCase.class), null, new C0536a(planDetailLoad$default))).stop(i, str);
                Throwable thExceptionOrNull = resultStop.exceptionOrNull();
                if (thExceptionOrNull == null) {
                    ((Boolean) resultStop.getValue()).booleanValue();
                    pHNTerminationPlanViewModel.getStopPlanLiveData().postValue(Boxing.boxBoolean(true));
                } else {
                    pHNTerminationPlanViewModel.getStopPlanLiveData().postValue(Boxing.boxBoolean(false));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final MutableLiveData<Boolean> getStopPlanLiveData() {
        return this.stopPlanLiveData;
    }

    public final void stopPlan(int type, @Nullable String reason) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(type, reason, this, null), 2, null);
    }
}
