package com.xiaomi.fitness.notify;

import com.xiaomi.fitness.notify.data.InstallApplicationInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.notify.NotifySelectAppActivity$onCreate$1$1", f = "NotifySelectAppActivity.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
public final class NotifySelectAppActivity$onCreate$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<InstallApplicationInfo> $it;
    int label;
    final /* synthetic */ NotifySelectAppActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifySelectAppActivity$onCreate$1$1(NotifySelectAppActivity notifySelectAppActivity, List<InstallApplicationInfo> list, Continuation<? super NotifySelectAppActivity$onCreate$1$1> continuation) {
        super(2, continuation);
        this.this$0 = notifySelectAppActivity;
        this.$it = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotifySelectAppActivity$onCreate$1$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            NotifyAdapter mNotifyAdapter = this.this$0.getMNotifyAdapter();
            if (mNotifyAdapter != null) {
                mNotifyAdapter.refreshList(this.$it);
            }
            this.label = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.hideLoading();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotifySelectAppActivity$onCreate$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
