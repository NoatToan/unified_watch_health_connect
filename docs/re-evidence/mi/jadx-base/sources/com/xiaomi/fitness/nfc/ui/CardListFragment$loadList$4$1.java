package com.xiaomi.fitness.nfc.ui;

import android.text.Html;
import android.text.TextUtils;
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
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardListFragment$loadList$4$1", f = "CardListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CardListFragment$loadList$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $tips;
    int label;
    final /* synthetic */ CardListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardListFragment$loadList$4$1(String str, CardListFragment cardListFragment, Continuation<? super CardListFragment$loadList$4$1> continuation) {
        super(2, continuation);
        this.$tips = str;
        this.this$0 = cardListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardListFragment$loadList$4$1(this.$tips, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!TextUtils.isEmpty(this.$tips)) {
            CardListFragment.access$getMBinding(this.this$0).C.setVisibility(0);
            CardListFragment.access$getMBinding(this.this$0).C.setMarqueeText(Html.fromHtml(this.$tips).toString());
            CardListFragment.access$getMBinding(this.this$0).C.h();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CardListFragment$loadList$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
