package com.xiaomi.fit.fitness.device.hm;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncAllDayStressData$1$onPressureData$1", f = "HMDeviceSyncManager.kt", i = {}, l = {867}, m = "invokeSuspend", n = {}, s = {})
public final class HMDeviceSyncManager$syncAllDayStressData$1$onPressureData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    final /* synthetic */ String $s;
    int label;
    final /* synthetic */ HMDeviceSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMDeviceSyncManager$syncAllDayStressData$1$onPressureData$1(HMDeviceSyncManager hMDeviceSyncManager, String str, String str2, Continuation<? super HMDeviceSyncManager$syncAllDayStressData$1$onPressureData$1> continuation) {
        super(2, continuation);
        this.this$0 = hMDeviceSyncManager;
        this.$did = str;
        this.$s = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HMDeviceSyncManager$syncAllDayStressData$1$onPressureData$1(this.this$0, this.$did, this.$s, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HMDeviceSyncManager hMDeviceSyncManager = this.this$0;
            String str = this.$did;
            String str2 = this.$s;
            this.label = 1;
            if (hMDeviceSyncManager.parseData(2, str, str2, this) == coroutine_suspended) {
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
        return ((HMDeviceSyncManager$syncAllDayStressData$1$onPressureData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
