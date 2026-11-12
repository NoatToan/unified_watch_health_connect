package com.xiaomi.hm.health.healthdata.core;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.arch.helper.Resource;
import com.huami.bodymeasurements.temperature.model.local.entity.ManualTempEntity;
import com.huami.bodymeasurements.temperature.model.usecase.AddManualTempUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel$insertTemp$$inlined$safeLaunch$1", f = "AbstractHealthDataViewModel.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
public final class AbstractHealthDataViewModel$insertTemp$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ AbstractHealthDataViewModel c;
    public final /* synthetic */ ManualTempEntity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractHealthDataViewModel$insertTemp$$inlined$safeLaunch$1(Continuation continuation, AbstractHealthDataViewModel abstractHealthDataViewModel, ManualTempEntity manualTempEntity) {
        super(2, continuation);
        this.c = abstractHealthDataViewModel;
        this.d = manualTempEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AbstractHealthDataViewModel$insertTemp$$inlined$safeLaunch$1 abstractHealthDataViewModel$insertTemp$$inlined$safeLaunch$1 = new AbstractHealthDataViewModel$insertTemp$$inlined$safeLaunch$1(continuation, this.c, this.d);
        abstractHealthDataViewModel$insertTemp$$inlined$safeLaunch$1.b = obj;
        return abstractHealthDataViewModel$insertTemp$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AbstractHealthDataViewModel$insertTemp$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Resource.Companion companion;
        Resource<Unit> resourceError$default;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        boolean zBooleanValue = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AddManualTempUseCase addManualTempUseCase = this.c.addManualTempUseCase;
            if (addManualTempUseCase != null) {
                String userId = this.d.getUserId();
                long timestamp = this.d.getTimestamp();
                float temp = this.d.getTemp();
                this.a = 1;
                obj = addManualTempUseCase.execute(userId, timestamp, temp, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            MutableLiveData<Resource<Unit>> insertResultLiveData = this.c.getInsertResultLiveData();
            companion = Resource.INSTANCE;
            if (zBooleanValue) {
                resourceError$default = Resource.Companion.success$default(companion, null, 1, null);
            } else {
                resourceError$default = Resource.Companion.error$default(companion, "insert error", null, 2, null);
            }
            insertResultLiveData.postValue(resourceError$default);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        MutableLiveData<Resource<Unit>> insertResultLiveData2 = this.c.getInsertResultLiveData();
        companion = Resource.INSTANCE;
        if (zBooleanValue) {
            resourceError$default = Resource.Companion.success$default(companion, null, 1, null);
        } else {
            resourceError$default = Resource.Companion.error$default(companion, "insert error", null, 2, null);
        }
        insertResultLiveData2.postValue(resourceError$default);
        return Unit.INSTANCE;
    }
}
