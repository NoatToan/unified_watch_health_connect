package com.xiaomi.hm.health.atrialfibrillation;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.health.afppg.koin.KoinModuleKt;
import com.huami.health.afppg.model.AtrialFibrillationEventDay;
import com.huami.health.afppg.usecase.GetAfibByDayUseCase;
import com.huami.tools.log.HMLog;
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

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/atrialfibrillation/AtrialFibViewModel;", "Landroidx/lifecycle/ViewModel;", "", "time", "", "loadData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/health/afppg/model/AtrialFibrillationEventDay;", "a", "Landroidx/lifecycle/MutableLiveData;", "getAtrialFibrillation", "()Landroidx/lifecycle/MutableLiveData;", "setAtrialFibrillation", "(Landroidx/lifecycle/MutableLiveData;)V", "atrialFibrillation", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AtrialFibViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<AtrialFibrillationEventDay> atrialFibrillation = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.atrialfibrillation.AtrialFibViewModel$loadData$1$1", f = "AtrialFibViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ GetAfibByDayUseCase b;
        public final /* synthetic */ long c;
        public final /* synthetic */ AtrialFibViewModel d;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.atrialfibrillation.AtrialFibViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/health/afppg/model/AtrialFibrillationEventDay;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0776a extends Lambda implements Function1<AtrialFibrillationEventDay, Unit> {
            public final /* synthetic */ AtrialFibViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0776a(AtrialFibViewModel atrialFibViewModel) {
                super(1);
                this.a = atrialFibViewModel;
            }

            public final void a(@NotNull AtrialFibrillationEventDay atrialFibrillationEventDay) {
                this.a.getAtrialFibrillation().postValue(atrialFibrillationEventDay);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AtrialFibrillationEventDay atrialFibrillationEventDay) {
                a(atrialFibrillationEventDay);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GetAfibByDayUseCase getAfibByDayUseCase, long j, AtrialFibViewModel atrialFibViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = getAfibByDayUseCase;
            this.c = j;
            this.d = atrialFibViewModel;
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
            this.b.execute(this.c, new C0776a(this.d));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "AtrialFibViewModel loadData failed: " + this.a.getMessage();
        }
    }

    @NotNull
    public final MutableLiveData<AtrialFibrillationEventDay> getAtrialFibrillation() {
        return this.atrialFibrillation;
    }

    public final void loadData(long time) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a((GetAfibByDayUseCase) KoinModuleKt.ppgScope().get(Reflection.getOrCreateKotlinClass(GetAfibByDayUseCase.class), null, null), time, this, null), 2, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl == null) {
            return;
        }
        HMLog.error$default(null, null, null, new b(thM3848exceptionOrNullimpl), 7, null);
    }

    public final void setAtrialFibrillation(@NotNull MutableLiveData<AtrialFibrillationEventDay> mutableLiveData) {
        this.atrialFibrillation = mutableLiveData;
    }
}
