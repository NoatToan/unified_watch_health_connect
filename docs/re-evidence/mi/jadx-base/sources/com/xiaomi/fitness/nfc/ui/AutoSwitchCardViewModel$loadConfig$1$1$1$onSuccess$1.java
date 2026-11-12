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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.AutoSwitchCardViewModel$loadConfig$1$1$1$onSuccess$1", f = "AutoSwitchCardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AutoSwitchCardViewModel$loadConfig$1$1$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ xrg.c $cardSwitcherSmart;
    final /* synthetic */ Function2<Boolean, String[], Unit> $success;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoSwitchCardViewModel$loadConfig$1$1$1$onSuccess$1(xrg.c cVar, Function2<? super Boolean, ? super String[], Unit> function2, Continuation<? super AutoSwitchCardViewModel$loadConfig$1$1$1$onSuccess$1> continuation) {
        super(2, continuation);
        this.$cardSwitcherSmart = cVar;
        this.$success = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoSwitchCardViewModel$loadConfig$1$1$1$onSuccess$1(this.$cardSwitcherSmart, this.$success, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        xrg.c cVar = this.$cardSwitcherSmart;
        if (cVar != null) {
            Function2<Boolean, String[], Unit> function2 = this.$success;
            Boolean boolBoxBoolean = Boxing.boxBoolean(cVar.c);
            String[] aid = cVar.d;
            Intrinsics.checkNotNullExpressionValue(aid, "aid");
            function2.invoke(boolBoxBoolean, aid);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutoSwitchCardViewModel$loadConfig$1$1$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
