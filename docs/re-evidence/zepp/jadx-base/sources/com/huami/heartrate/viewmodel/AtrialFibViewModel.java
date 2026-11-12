package com.huami.heartrate.viewmodel;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.health.afppg.koin.KoinModuleKt;
import com.huami.health.afppg.model.AtrialFibrillationEventDay;
import com.huami.health.afppg.usecase.GetAfibByDayUseCase;
import com.huami.heartrate.koin.KoinExtKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001f\u0010\n\u001a\u0004\u0018\u00010\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001d\u0010\u000e\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/heartrate/viewmodel/AtrialFibViewModel;", "Landroidx/lifecycle/ViewModel;", "", "time", "", "loadData", "Lcom/huami/health/afppg/usecase/GetAfibByDayUseCase;", "a", "Lkotlin/Lazy;", "()Lcom/huami/health/afppg/usecase/GetAfibByDayUseCase;", "afibByDayUseCase", "", "b", "()Z", "needFetchAFibData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/health/afppg/model/AtrialFibrillationEventDay;", "c", "Landroidx/lifecycle/MutableLiveData;", "atrialFibrillation", "Landroidx/lifecycle/LiveData;", "getAbnormalHrLiveData", "()Landroidx/lifecycle/LiveData;", "abnormalHrLiveData", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class AtrialFibViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy afibByDayUseCase = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy needFetchAFibData = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<AtrialFibrillationEventDay> atrialFibrillation = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/health/afppg/usecase/GetAfibByDayUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<GetAfibByDayUseCase> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GetAfibByDayUseCase invoke() {
            Object objM3845constructorimpl;
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl((GetAfibByDayUseCase) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(GetAfibByDayUseCase.class), null, null));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            return (GetAfibByDayUseCase) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.viewmodel.AtrialFibViewModel$loadData$1", f = "AtrialFibViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/health/afppg/model/AtrialFibrillationEventDay;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<AtrialFibrillationEventDay, Unit> {
            public final /* synthetic */ AtrialFibViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AtrialFibViewModel atrialFibViewModel) {
                super(1);
                this.a = atrialFibViewModel;
            }

            public final void a(@NotNull AtrialFibrillationEventDay atrialFibrillationEventDay) {
                this.a.atrialFibrillation.postValue(atrialFibrillationEventDay);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AtrialFibrillationEventDay atrialFibrillationEventDay) {
                a(atrialFibrillationEventDay);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AtrialFibViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GetAfibByDayUseCase getAfibByDayUseCaseA = AtrialFibViewModel.this.a();
            if (getAfibByDayUseCaseA != null) {
                getAfibByDayUseCaseA.execute(this.c, new a(AtrialFibViewModel.this));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Boolean> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return (KoinExtKt.isHollywood() || AtrialFibViewModel.this.a() == null) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GetAfibByDayUseCase a() {
        return (GetAfibByDayUseCase) this.afibByDayUseCase.getValue();
    }

    private final boolean b() {
        return ((Boolean) this.needFetchAFibData.getValue()).booleanValue();
    }

    @NotNull
    public final LiveData<AtrialFibrillationEventDay> getAbnormalHrLiveData() {
        return this.atrialFibrillation;
    }

    public final void loadData(long time) {
        if (b()) {
            e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(time, null), 2, null);
        }
    }
}
