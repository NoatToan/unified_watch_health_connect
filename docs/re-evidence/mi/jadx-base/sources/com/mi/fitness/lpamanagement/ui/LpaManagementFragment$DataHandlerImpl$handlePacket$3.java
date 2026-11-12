package com.mi.fitness.lpamanagement.ui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.mi.fitness.lpamanagement.ui.LpaManagementFragment$DataHandlerImpl$handlePacket$3", f = "LpaManagementFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LpaManagementFragment$DataHandlerImpl$handlePacket$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LpaManagementFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LpaManagementFragment$DataHandlerImpl$handlePacket$3(LpaManagementFragment lpaManagementFragment, Continuation<? super LpaManagementFragment$DataHandlerImpl$handlePacket$3> continuation) {
        super(2, continuation);
        this.this$0 = lpaManagementFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LpaManagementFragment$DataHandlerImpl$handlePacket$3(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LpaManagementFragment$DataHandlerImpl$handlePacket$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
