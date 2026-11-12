package com.huami.bodymeasurements.temperature.viewmodel;

import com.huami.arch.helper.Resource;
import com.huami.bodymeasurements.temperature.model.converter.TempUnitConverter;
import com.huami.bodymeasurements.temperature.model.usecase.AddManualTempUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.k;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/bodymeasurements/temperature/viewmodel/coroutines/ExtKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.bodymeasurements.temperature.viewmodel.TempAddDataViewModel$post$$inlined$safeLaunch$1", f = "TempAddDataViewModel.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
public final class TempAddDataViewModel$post$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ TempAddDataViewModel c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempAddDataViewModel$post$$inlined$safeLaunch$1(Continuation continuation, TempAddDataViewModel tempAddDataViewModel, String str) {
        super(2, continuation);
        this.c = tempAddDataViewModel;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TempAddDataViewModel$post$$inlined$safeLaunch$1 tempAddDataViewModel$post$$inlined$safeLaunch$1 = new TempAddDataViewModel$post$$inlined$safeLaunch$1(continuation, this.c, this.d);
        tempAddDataViewModel$post$$inlined$safeLaunch$1.b = obj;
        return tempAddDataViewModel$post$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TempAddDataViewModel$post$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.c._postResultLiveData.postValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
            Float floatOrNull = k.toFloatOrNull((String) this.c.tempLiveData.getValue());
            if (floatOrNull != null) {
                float tempInUnitC = TempUnitConverter.INSTANCE.getTempInUnitC(floatOrNull.floatValue());
                long jLongValue = ((Number) this.c.postTimeLiveData.getValue()).longValue();
                AddManualTempUseCase addManualTempUseCase = this.c.useCase;
                String str = this.d;
                this.a = 1;
                obj = addManualTempUseCase.execute(str, jLongValue, tempInUnitC, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.c._postResultLiveData.postValue(((Boolean) obj).booleanValue() ? Resource.Companion.success$default(Resource.INSTANCE, null, 1, null) : Resource.Companion.error$default(Resource.INSTANCE, "", null, 2, null));
        return Unit.INSTANCE;
    }
}
