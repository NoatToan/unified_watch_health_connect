package com.xiaomi.hm.health.healthdata.ui.viewmodel.stress;

import com.xiaomi.hm.health.healthtag.ui.vo.TagInfoVo;
import kotlin.Metadata;
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

/* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel$uploadManualTag$lambda-9$$inlined$safeLaunch$default$1, reason: invalid class name */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel$uploadManualTag$lambda-9$$inlined$safeLaunch$default$1", f = "StressDailyDetailViewModel.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
public final class StressDailyDetailViewModel$uploadManualTag$lambda9$$inlined$safeLaunch$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ TagInfoVo c;
    public final /* synthetic */ StressDailyDetailViewModel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StressDailyDetailViewModel$uploadManualTag$lambda9$$inlined$safeLaunch$default$1(Continuation continuation, TagInfoVo tagInfoVo, StressDailyDetailViewModel stressDailyDetailViewModel) {
        super(2, continuation);
        this.c = tagInfoVo;
        this.d = stressDailyDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        StressDailyDetailViewModel$uploadManualTag$lambda9$$inlined$safeLaunch$default$1 stressDailyDetailViewModel$uploadManualTag$lambda9$$inlined$safeLaunch$default$1 = new StressDailyDetailViewModel$uploadManualTag$lambda9$$inlined$safeLaunch$default$1(continuation, this.c, this.d);
        stressDailyDetailViewModel$uploadManualTag$lambda9$$inlined$safeLaunch$default$1.b = obj;
        return stressDailyDetailViewModel$uploadManualTag$lambda9$$inlined$safeLaunch$default$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((StressDailyDetailViewModel$uploadManualTag$lambda9$$inlined$safeLaunch$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            StressDailyDetailViewModel.k kVar = new StressDailyDetailViewModel.k(this.c, this.d, null);
            this.a = 1;
            if (BuildersKt.withContext(io2, kVar, this) == coroutine_suspended) {
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
