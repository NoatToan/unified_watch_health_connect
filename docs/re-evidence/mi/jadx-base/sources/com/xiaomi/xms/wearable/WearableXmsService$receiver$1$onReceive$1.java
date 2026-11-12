package com.xiaomi.xms.wearable;

import android.util.ArrayMap;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.d8r;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.xms.wearable.WearableXmsService$receiver$1$onReceive$1", f = "WearableXmsService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WearableXmsService$receiver$1$onReceive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amapPkgName;
    final /* synthetic */ boolean $isAmapConnected;
    int label;
    final /* synthetic */ WearableXmsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearableXmsService$receiver$1$onReceive$1(WearableXmsService wearableXmsService, String str, boolean z, Continuation<? super WearableXmsService$receiver$1$onReceive$1> continuation) {
        super(2, continuation);
        this.this$0 = wearableXmsService;
        this.$amapPkgName = str;
        this.$isAmapConnected = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WearableXmsService$receiver$1$onReceive$1(this.this$0, this.$amapPkgName, this.$isAmapConnected, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayMap<String, Boolean> arrayMap;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        d8r d8rVar = this.this$0.binder;
        if (d8rVar != null && (arrayMap = d8rVar.f) != null) {
            arrayMap.put(this.$amapPkgName, Boxing.boxBoolean(this.$isAmapConnected));
        }
        d8r d8rVar2 = this.this$0.binder;
        if (d8rVar2 != null) {
            d8rVar2.E5(this.$amapPkgName, this.$isAmapConnected);
        }
        Logger.i("AmapConnectProvider", "appConnectedStatus app:" + this.$amapPkgName + " isConnected:" + this.$isAmapConnected);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WearableXmsService$receiver$1$onReceive$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
