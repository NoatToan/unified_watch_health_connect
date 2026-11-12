package com.xiaomi.fit.fitness.device.hm;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncAFibData$1$onResultData$1", f = "HMDeviceSyncManager.kt", i = {}, l = {682}, m = "invokeSuspend", n = {}, s = {})
public final class HMDeviceSyncManager$syncAFibData$1$onResultData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HMDeviceSyncManager.AFibData $aFibData;
    final /* synthetic */ String $did;
    int label;
    final /* synthetic */ HMDeviceSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMDeviceSyncManager$syncAFibData$1$onResultData$1(HMDeviceSyncManager hMDeviceSyncManager, String str, HMDeviceSyncManager.AFibData aFibData, Continuation<? super HMDeviceSyncManager$syncAFibData$1$onResultData$1> continuation) {
        super(2, continuation);
        this.this$0 = hMDeviceSyncManager;
        this.$did = str;
        this.$aFibData = aFibData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HMDeviceSyncManager$syncAFibData$1$onResultData$1(this.this$0, this.$did, this.$aFibData, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HMDeviceSyncManager hMDeviceSyncManager = this.this$0;
            String str = this.$did;
            String json = hMDeviceSyncManager.getMGson().toJson(this.$aFibData);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            this.label = 1;
            if (hMDeviceSyncManager.parseData(7, str, json, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HMDeviceSyncManager$syncAFibData$1$onResultData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
