package com.xiaomi.hm.health.healthdata.ui.viewmodel.stress;

import com.xiaomi.hm.health.healthtag.ui.vo.TagInfoVo;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel$addNewTag$lambda-3$lambda-2$$inlined$safeLaunch$default$1, reason: invalid class name */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel$addNewTag$lambda-3$lambda-2$$inlined$safeLaunch$default$1", f = "StressDailyDetailViewModel.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
public final class StressDailyDetailViewModel$addNewTag$lambda3$lambda2$$inlined$safeLaunch$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ TagInfoVo d;
    public final /* synthetic */ StressDailyDetailViewModel e;
    public final /* synthetic */ Long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StressDailyDetailViewModel$addNewTag$lambda3$lambda2$$inlined$safeLaunch$default$1(Continuation continuation, Pair pair, TagInfoVo tagInfoVo, StressDailyDetailViewModel stressDailyDetailViewModel, Long l) {
        super(2, continuation);
        this.c = pair;
        this.d = tagInfoVo;
        this.e = stressDailyDetailViewModel;
        this.f = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        StressDailyDetailViewModel$addNewTag$lambda3$lambda2$$inlined$safeLaunch$default$1 stressDailyDetailViewModel$addNewTag$lambda3$lambda2$$inlined$safeLaunch$default$1 = new StressDailyDetailViewModel$addNewTag$lambda3$lambda2$$inlined$safeLaunch$default$1(continuation, this.c, this.d, this.e, this.f);
        stressDailyDetailViewModel$addNewTag$lambda3$lambda2$$inlined$safeLaunch$default$1.b = obj;
        return stressDailyDetailViewModel$addNewTag$lambda3$lambda2$$inlined$safeLaunch$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((StressDailyDetailViewModel$addNewTag$lambda3$lambda2$$inlined$safeLaunch$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            StressDailyDetailViewModel.a aVar = new StressDailyDetailViewModel.a(this.c, this.d, this.e, this.f, null);
            this.a = 1;
            if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
