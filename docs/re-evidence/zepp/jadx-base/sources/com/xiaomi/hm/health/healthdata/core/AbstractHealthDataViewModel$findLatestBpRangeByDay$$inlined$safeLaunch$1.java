package com.xiaomi.hm.health.healthdata.core;

import androidx.p008lifecycle.MutableLiveData;
import java.util.Date;
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
@DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel$findLatestBpRangeByDay$$inlined$safeLaunch$1", f = "AbstractHealthDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AbstractHealthDataViewModel$findLatestBpRangeByDay$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ MutableLiveData c;
    public final /* synthetic */ AbstractHealthDataViewModel d;
    public final /* synthetic */ Date e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractHealthDataViewModel$findLatestBpRangeByDay$$inlined$safeLaunch$1(Continuation continuation, MutableLiveData mutableLiveData, AbstractHealthDataViewModel abstractHealthDataViewModel, Date date) {
        super(2, continuation);
        this.c = mutableLiveData;
        this.d = abstractHealthDataViewModel;
        this.e = date;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AbstractHealthDataViewModel$findLatestBpRangeByDay$$inlined$safeLaunch$1 abstractHealthDataViewModel$findLatestBpRangeByDay$$inlined$safeLaunch$1 = new AbstractHealthDataViewModel$findLatestBpRangeByDay$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e);
        abstractHealthDataViewModel$findLatestBpRangeByDay$$inlined$safeLaunch$1.b = obj;
        return abstractHealthDataViewModel$findLatestBpRangeByDay$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AbstractHealthDataViewModel$findLatestBpRangeByDay$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.c.postValue(this.d.healthDataRepo.findLastBpRangeByDay(this.e));
        return Unit.INSTANCE;
    }
}
