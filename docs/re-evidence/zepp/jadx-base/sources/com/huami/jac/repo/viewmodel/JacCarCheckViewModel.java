package com.huami.jac.repo.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.jac.repo.exception.JacExceptionHandlerApi;
import com.huami.jac.repo.repo.JacCardCheckRepo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR.\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/huami/jac/repo/viewmodel/JacCarCheckViewModel;", "Lcom/huami/jac/repo/viewmodel/BaseViewModel;", "", "action", "", "checkCondition", "Lcom/huami/jac/repo/repo/JacCardCheckRepo;", "b", "Lcom/huami/jac/repo/repo/JacCardCheckRepo;", "jacCardCheckRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "", "c", "Landroidx/lifecycle/MutableLiveData;", "getCheckConditionListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setCheckConditionListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "checkConditionListLiveData", "Lcom/huami/jac/repo/exception/JacExceptionHandlerApi;", "exceptionHandler", "<init>", "(Lcom/huami/jac/repo/repo/JacCardCheckRepo;Lcom/huami/jac/repo/exception/JacExceptionHandlerApi;)V", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public final class JacCarCheckViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final JacCardCheckRepo jacCardCheckRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<State<Boolean>> checkConditionListLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.jac.repo.viewmodel.JacCarCheckViewModel$checkCondition$1", f = "JacCarCheckViewModel.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super State<? extends Boolean>>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(1, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return JacCarCheckViewModel.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super State<Boolean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Boolean>> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JacCardCheckRepo jacCardCheckRepo = JacCarCheckViewModel.this.jacCardCheckRepo;
                String str = this.c;
                this.a = 1;
                obj = jacCardCheckRepo.checkConditionList(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new Success(obj);
        }
    }

    public JacCarCheckViewModel(@NotNull JacCardCheckRepo jacCardCheckRepo, @NotNull JacExceptionHandlerApi jacExceptionHandlerApi) {
        super(jacExceptionHandlerApi);
        this.jacCardCheckRepo = jacCardCheckRepo;
        this.checkConditionListLiveData = new MutableLiveData<>();
    }

    public final void checkCondition(@NotNull String action) {
        startWithLoading(this.checkConditionListLiveData, new a(action, null));
    }

    @NotNull
    public final MutableLiveData<State<Boolean>> getCheckConditionListLiveData() {
        return this.checkConditionListLiveData;
    }

    public final void setCheckConditionListLiveData(@NotNull MutableLiveData<State<Boolean>> mutableLiveData) {
        this.checkConditionListLiveData = mutableLiveData;
    }
}
