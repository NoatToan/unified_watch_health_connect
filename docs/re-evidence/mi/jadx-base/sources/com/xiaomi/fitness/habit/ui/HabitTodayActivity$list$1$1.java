package com.xiaomi.fitness.habit.ui;

import com.xiaomi.fitness.habit.bean.HabitTodayResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.habit.ui.HabitTodayActivity$list$1$1", f = "HabitTodayActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HabitTodayActivity$list$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HabitTodayResult $it;
    int label;
    final /* synthetic */ HabitTodayActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitTodayActivity$list$1$1(HabitTodayActivity habitTodayActivity, HabitTodayResult habitTodayResult, Continuation<? super HabitTodayActivity$list$1$1> continuation) {
        super(2, continuation);
        this.this$0 = habitTodayActivity;
        this.$it = habitTodayResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HabitTodayActivity$list$1$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.hideLoading();
        this.this$0.showTodayList(this.$it);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HabitTodayActivity$list$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
