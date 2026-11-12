package com.xiaomi.fitness.sync;

import defpackage.gyo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sync.WifiDataHandler$handleWifiPacket$1$2", f = "WifiDataHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WifiDataHandler$handleWifiPacket$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ gyo.a $basicInfo;
    int label;
    final /* synthetic */ WifiDataHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiDataHandler$handleWifiPacket$1$2(WifiDataHandler wifiDataHandler, gyo.a aVar, Continuation<? super WifiDataHandler$handleWifiPacket$1$2> continuation) {
        super(2, continuation);
        this.this$0 = wifiDataHandler;
        this.$basicInfo = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WifiDataHandler$handleWifiPacket$1$2(this.this$0, this.$basicInfo, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.showWifiDialog(this.$basicInfo);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WifiDataHandler$handleWifiPacket$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
