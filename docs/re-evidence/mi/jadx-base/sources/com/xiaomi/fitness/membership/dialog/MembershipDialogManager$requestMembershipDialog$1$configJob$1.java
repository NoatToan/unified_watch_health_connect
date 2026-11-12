package com.xiaomi.fitness.membership.dialog;

import com.xiaomi.fitness.membership.api.MembershipRequest;
import com.xiaomi.fitness.membership.export.data.VipConfigInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.membership.dialog.MembershipDialogManager$requestMembershipDialog$1$configJob$1", f = "MembershipDialogManager.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
public final class MembershipDialogManager$requestMembershipDialog$1$configJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VipConfigInfo>, Object> {
    int label;

    public MembershipDialogManager$requestMembershipDialog$1$configJob$1(Continuation<? super MembershipDialogManager$requestMembershipDialog$1$configJob$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MembershipDialogManager$requestMembershipDialog$1$configJob$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MembershipRequest membershipRequest = MembershipDialogManager.mRequest;
            this.label = 1;
            obj = membershipRequest.getOperationConfig(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super VipConfigInfo> continuation) {
        return ((MembershipDialogManager$requestMembershipDialog$1$configJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
