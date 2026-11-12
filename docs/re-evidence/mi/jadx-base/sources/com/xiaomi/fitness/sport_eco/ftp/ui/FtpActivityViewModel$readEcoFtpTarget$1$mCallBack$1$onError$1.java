package com.xiaomi.fitness.sport_eco.ftp.ui;

import defpackage.tr9;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport_eco.ftp.ui.FtpActivityViewModel$readEcoFtpTarget$1$mCallBack$1$onError$1", f = "FtpActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FtpActivityViewModel$readEcoFtpTarget$1$mCallBack$1$onError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProducerScope<tr9[]> $$this$callbackFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FtpActivityViewModel$readEcoFtpTarget$1$mCallBack$1$onError$1(ProducerScope<? super tr9[]> producerScope, Continuation<? super FtpActivityViewModel$readEcoFtpTarget$1$mCallBack$1$onError$1> continuation) {
        super(2, continuation);
        this.$$this$callbackFlow = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FtpActivityViewModel$readEcoFtpTarget$1$mCallBack$1$onError$1(this.$$this$callbackFlow, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$$this$callbackFlow.mo2387trySendJP2dKIU(new tr9[0]);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FtpActivityViewModel$readEcoFtpTarget$1$mCallBack$1$onError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
