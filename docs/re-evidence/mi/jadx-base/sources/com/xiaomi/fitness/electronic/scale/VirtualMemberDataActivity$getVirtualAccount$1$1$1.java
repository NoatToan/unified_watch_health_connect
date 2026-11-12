package com.xiaomi.fitness.electronic.scale;

import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import defpackage.qal;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.electronic.scale.VirtualMemberDataActivity$getVirtualAccount$1$1$1", f = "VirtualMemberDataActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VirtualMemberDataActivity$getVirtualAccount$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<VirtualAccount> $users;
    int label;
    final /* synthetic */ VirtualMemberDataActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualMemberDataActivity$getVirtualAccount$1$1$1(List<VirtualAccount> list, VirtualMemberDataActivity virtualMemberDataActivity, Continuation<? super VirtualMemberDataActivity$getVirtualAccount$1$1$1> continuation) {
        super(2, continuation);
        this.$users = list;
        this.this$0 = virtualMemberDataActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VirtualMemberDataActivity$getVirtualAccount$1$1$1(this.$users, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.$users.isEmpty()) {
            this.this$0.mVirtualMemberAdapter.updateData(this.$users);
            int indexByAccountId = this.this$0.getIndexByAccountId(this.$users);
            qal.c("getVirtualAccount() index :" + indexByAccountId);
            VirtualMemberDataActivity.access$getMViewModel(this.this$0).setVirtualAccount(this.$users.get(indexByAccountId));
            VirtualMemberDataActivity.access$getMBinding(this.this$0).E.smoothScrollToPosition(indexByAccountId);
        } else {
            this.this$0.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VirtualMemberDataActivity$getVirtualAccount$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
