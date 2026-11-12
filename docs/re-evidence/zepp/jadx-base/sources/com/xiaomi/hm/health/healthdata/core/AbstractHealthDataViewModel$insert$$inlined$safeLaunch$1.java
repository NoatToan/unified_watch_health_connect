package com.xiaomi.hm.health.healthdata.core;

import com.huami.arch.helper.Resource;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
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
@DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel$insert$$inlined$safeLaunch$1", f = "AbstractHealthDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AbstractHealthDataViewModel$insert$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ AbstractHealthDataViewModel c;
    public final /* synthetic */ UserDataEntity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractHealthDataViewModel$insert$$inlined$safeLaunch$1(Continuation continuation, AbstractHealthDataViewModel abstractHealthDataViewModel, UserDataEntity userDataEntity) {
        super(2, continuation);
        this.c = abstractHealthDataViewModel;
        this.d = userDataEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AbstractHealthDataViewModel$insert$$inlined$safeLaunch$1 abstractHealthDataViewModel$insert$$inlined$safeLaunch$1 = new AbstractHealthDataViewModel$insert$$inlined$safeLaunch$1(continuation, this.c, this.d);
        abstractHealthDataViewModel$insert$$inlined$safeLaunch$1.b = obj;
        return abstractHealthDataViewModel$insert$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AbstractHealthDataViewModel$insert$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.c.getInsertResultLiveData().postValue(this.c.healthDataRepo.insert(this.d) ? Resource.Companion.success$default(Resource.INSTANCE, null, 1, null) : Resource.Companion.error$default(Resource.INSTANCE, "insert error", null, 2, null));
        return Unit.INSTANCE;
    }
}
