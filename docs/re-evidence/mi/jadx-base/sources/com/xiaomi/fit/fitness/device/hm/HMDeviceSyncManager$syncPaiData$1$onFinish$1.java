package com.xiaomi.fit.fitness.device.hm;

import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.hm.health.bt.sdk.data.PaiDataResult;
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
@DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncPaiData$1$onFinish$1", f = "HMDeviceSyncManager.kt", i = {}, l = {1319, 1324}, m = "invokeSuspend", n = {}, s = {})
public final class HMDeviceSyncManager$syncPaiData$1$onFinish$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    final /* synthetic */ HuamiApiCaller $huamiDevice;
    final /* synthetic */ PaiDataResult $paiDataResult;
    int label;
    final /* synthetic */ HMDeviceSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMDeviceSyncManager$syncPaiData$1$onFinish$1(HMDeviceSyncManager hMDeviceSyncManager, String str, PaiDataResult paiDataResult, HuamiApiCaller huamiApiCaller, Continuation<? super HMDeviceSyncManager$syncPaiData$1$onFinish$1> continuation) {
        super(2, continuation);
        this.this$0 = hMDeviceSyncManager;
        this.$did = str;
        this.$paiDataResult = paiDataResult;
        this.$huamiDevice = huamiApiCaller;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HMDeviceSyncManager$syncPaiData$1$onFinish$1(this.this$0, this.$did, this.$paiDataResult, this.$huamiDevice, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        HMDeviceSyncManager hMDeviceSyncManager = this.this$0;
        String str = this.$did;
        this.label = 1;
        if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 4, true, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        PaiDataResult paiDataResult = this.$paiDataResult;
        if (paiDataResult == null) {
            return Unit.INSTANCE;
        }
        this.this$0.updatePaiGoal(this.$huamiDevice, paiDataResult);
        HMDeviceSyncManager hMDeviceSyncManager2 = this.this$0;
        String str2 = this.$did;
        String result = this.$paiDataResult.getResult();
        Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
        this.label = 2;
        if (hMDeviceSyncManager2.parseData(4, str2, result, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HMDeviceSyncManager$syncPaiData$1$onFinish$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
