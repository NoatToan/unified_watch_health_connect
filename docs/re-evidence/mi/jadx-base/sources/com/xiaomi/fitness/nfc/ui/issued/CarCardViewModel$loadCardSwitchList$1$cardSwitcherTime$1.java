package com.xiaomi.fitness.nfc.ui.issued;

import com.xiaomi.fitness.nfc.bean.CardSwitcherBean;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import defpackage.ssg;
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
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/nfc/bean/CardSwitcherBean;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.issued.CarCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1", f = "CarCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CarCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CardSwitcherBean>, Object> {
    final /* synthetic */ CardWrapper $cardWrapper;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1(CardWrapper cardWrapper, Continuation<? super CarCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1> continuation) {
        super(2, continuation);
        this.$cardWrapper = cardWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CarCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1(this.$cardWrapper, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ssg.u().l(this.$cardWrapper.getAid(), 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CardSwitcherBean> continuation) {
        return ((CarCardViewModel$loadCardSwitchList$1$cardSwitcherTime$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
