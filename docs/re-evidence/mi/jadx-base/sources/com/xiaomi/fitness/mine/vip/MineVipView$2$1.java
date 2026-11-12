package com.xiaomi.fitness.mine.vip;

import com.xiaomi.fitness.membership.export.MembershipHelper;
import com.xiaomi.fitness.membership.export.MembershipHelperExtKt;
import com.xiaomi.fitness.membership.export.data.VipInfo;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.mine.vip.MineVipView$2$1", f = "MineVipView.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
public final class MineVipView$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MineVipView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineVipView$2$1(MineVipView mineVipView, Continuation<? super MineVipView$2$1> continuation) {
        super(2, continuation);
        this.this$0 = mineVipView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MineVipView$2$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MineVipView mineVipView;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MineVipView mineVipView2 = this.this$0;
            MembershipHelper membershipHelperExtKt = MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE);
            this.L$0 = mineVipView2;
            this.label = 1;
            Object vipInfo$default = MembershipHelper.DefaultImpls.getVipInfo$default(membershipHelperExtKt, false, this, 1, null);
            if (vipInfo$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            mineVipView = mineVipView2;
            obj = vipInfo$default;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mineVipView = (MineVipView) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mineVipView.setVipInfo((VipInfo) obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MineVipView$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
