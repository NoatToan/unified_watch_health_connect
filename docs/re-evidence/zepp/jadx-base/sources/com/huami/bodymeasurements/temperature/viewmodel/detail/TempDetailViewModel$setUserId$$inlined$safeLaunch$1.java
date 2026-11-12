package com.huami.bodymeasurements.temperature.viewmodel.detail;

import com.huami.bodymeasurements.temperature.model.usecase.FetchTempFromServerUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.GetLatestTempUseCase;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/bodymeasurements/temperature/viewmodel/coroutines/ExtKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.bodymeasurements.temperature.viewmodel.detail.TempDetailViewModel$setUserId$$inlined$safeLaunch$1", f = "TempDetailViewModel.kt", i = {}, l = {34, 35}, m = "invokeSuspend", n = {}, s = {})
public final class TempDetailViewModel$setUserId$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ TempDetailViewModel c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempDetailViewModel$setUserId$$inlined$safeLaunch$1(Continuation continuation, TempDetailViewModel tempDetailViewModel, String str) {
        super(2, continuation);
        this.c = tempDetailViewModel;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TempDetailViewModel$setUserId$$inlined$safeLaunch$1 tempDetailViewModel$setUserId$$inlined$safeLaunch$1 = new TempDetailViewModel$setUserId$$inlined$safeLaunch$1(continuation, this.c, this.d);
        tempDetailViewModel$setUserId$$inlined$safeLaunch$1.b = obj;
        return tempDetailViewModel$setUserId$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TempDetailViewModel$setUserId$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.c.getLatestTempLiveData().postValue((TemperatureVo) obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        FetchTempFromServerUseCase fetchTempFromServerUseCase = this.c.fetchTempFromServerUseCase;
        String str = this.d;
        this.a = 1;
        if (fetchTempFromServerUseCase.execute(str, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        GetLatestTempUseCase getLatestTempUseCase = this.c.latestTempUseCase;
        String str2 = this.d;
        this.a = 2;
        obj = getLatestTempUseCase.execute(str2, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.c.getLatestTempLiveData().postValue((TemperatureVo) obj);
        return Unit.INSTANCE;
    }
}
