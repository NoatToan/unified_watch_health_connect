package com.xiaomi.hm.health.healthdata.ui.viewmodel;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.healthdata.ui.viewmodel.DataDetailBaseViewModel$updateLatestTime$$inlined$safeLaunch$1", f = "DataDetailBaseViewModel.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
public final class DataDetailBaseViewModel$updateLatestTime$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DataDetailBaseViewModel c;
    public final /* synthetic */ DataType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataDetailBaseViewModel$updateLatestTime$$inlined$safeLaunch$1(Continuation continuation, DataDetailBaseViewModel dataDetailBaseViewModel, DataType dataType) {
        super(2, continuation);
        this.c = dataDetailBaseViewModel;
        this.d = dataType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DataDetailBaseViewModel$updateLatestTime$$inlined$safeLaunch$1 dataDetailBaseViewModel$updateLatestTime$$inlined$safeLaunch$1 = new DataDetailBaseViewModel$updateLatestTime$$inlined$safeLaunch$1(continuation, this.c, this.d);
        dataDetailBaseViewModel$updateLatestTime$$inlined$safeLaunch$1.b = obj;
        return dataDetailBaseViewModel$updateLatestTime$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DataDetailBaseViewModel$updateLatestTime$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HealthCoreDataRepo healthCoreDataRepo = this.c.coreRepo;
            DataType dataType = this.d;
            this.a = 1;
            obj = healthCoreDataRepo.latestTime(dataType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        HMLog.info(this.c.tag, new DataDetailBaseViewModel.a(jLongValue));
        this.c.dayTime.postValue(Boxing.boxLong(jLongValue));
        this.c.weekTime.postValue(Boxing.boxLong(jLongValue));
        this.c.monthTime.postValue(Boxing.boxLong(jLongValue));
        this.c.yearTime.postValue(Boxing.boxLong(jLongValue));
        return Unit.INSTANCE;
    }
}
