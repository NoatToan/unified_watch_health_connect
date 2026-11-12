package com.xiaomi.fitness.nfc.ui;

import defpackage.xrg;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel$setAidList$1$1$1$onSuccess$1", f = "AutoSwitchCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AutoSwitchCardViewModel$setAidList$1$1$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ xrg.b $cardSwitcherResult;
    final /* synthetic */ Function1<Boolean, Unit> $success;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoSwitchCardViewModel$setAidList$1$1$1$onSuccess$1(xrg.b bVar, Function1<? super Boolean, Unit> function1, Continuation<? super AutoSwitchCardViewModel$setAidList$1$1$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.$cardSwitcherResult = bVar;
        this.$success = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoSwitchCardViewModel$setAidList$1$1$1$onSuccess$1(this.$cardSwitcherResult, this.$success, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        xrg.b bVar = this.$cardSwitcherResult;
        if (bVar != null) {
            this.$success.invoke2(Boxing.boxBoolean(bVar.c == 0));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutoSwitchCardViewModel$setAidList$1$1$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
