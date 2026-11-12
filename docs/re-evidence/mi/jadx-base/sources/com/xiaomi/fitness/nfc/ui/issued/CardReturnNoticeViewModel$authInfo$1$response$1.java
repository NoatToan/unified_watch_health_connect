package com.xiaomi.fitness.nfc.ui.issued;

import com.miui.tsmclient.entity.RefundChannelInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.RefundAuthorizationOperation;
import com.miui.tsmclient.sesdk.SeCard;
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
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/miui/tsmclient/model/BaseResponse;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeViewModel$authInfo$1$response$1", f = "CardReturnNoticeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CardReturnNoticeViewModel$authInfo$1$response$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BaseResponse>, Object> {
    final /* synthetic */ SeCard $mSeCard;
    final /* synthetic */ RefundChannelInfo $refundChannelInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardReturnNoticeViewModel$authInfo$1$response$1(SeCard seCard, RefundChannelInfo refundChannelInfo, Continuation<? super CardReturnNoticeViewModel$authInfo$1$response$1> continuation) {
        super(2, continuation);
        this.$mSeCard = seCard;
        this.$refundChannelInfo = refundChannelInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardReturnNoticeViewModel$authInfo$1$response$1(this.$mSeCard, this.$refundChannelInfo, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new RefundAuthorizationOperation(this.$mSeCard).getAuthInfo(this.$refundChannelInfo);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BaseResponse> continuation) {
        return ((CardReturnNoticeViewModel$authInfo$1$response$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
