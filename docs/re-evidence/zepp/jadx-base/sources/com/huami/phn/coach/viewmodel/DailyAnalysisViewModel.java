package com.huami.phn.coach.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.coach.usecase.LoadDailyAnalysisUseCase;
import com.huami.phn.coach.usecase.PhnDailyAnalysis;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002R%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/phn/coach/viewmodel/DailyAnalysisViewModel;", "Landroidx/lifecycle/ViewModel;", "", "year", "month", "day", "count", "", "loadDailyAnalysisLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/huami/phn/coach/usecase/PhnDailyAnalysis;", "a", "Landroidx/lifecycle/MutableLiveData;", "getDailyAnalysisLiveData", "()Landroidx/lifecycle/MutableLiveData;", "dailyAnalysisLiveData", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class DailyAnalysisViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<PhnDailyAnalysis>> dailyAnalysisLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.phn.coach.viewmodel.DailyAnalysisViewModel$loadDailyAnalysisLiveData$1", f = "DailyAnalysisViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ DailyAnalysisViewModel f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, int i3, int i4, DailyAnalysisViewModel dailyAnalysisViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = dailyAnalysisViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, this.f, continuation);
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
            this.f.getDailyAnalysisLiveData().postValue(((LoadDailyAnalysisUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(LoadDailyAnalysisUseCase.class), null, null)).load(this.b, this.c, this.d, this.e));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final MutableLiveData<List<PhnDailyAnalysis>> getDailyAnalysisLiveData() {
        return this.dailyAnalysisLiveData;
    }

    public final void loadDailyAnalysisLiveData(int year, int month, int day, int count) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(year, month, day, count, this, null), 2, null);
    }
}
