package com.xiaomi.fit.fitness.device.hm;

import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeat;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import java.util.List;
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
@DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncTrainingLoad$2$onFirstbeatData$1", f = "HMDeviceSyncManager.kt", i = {}, l = {627}, m = "invokeSuspend", n = {}, s = {})
public final class HMDeviceSyncManager$syncTrainingLoad$2$onFirstbeatData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    final /* synthetic */ BleFirstbeatData $p0;
    int label;
    final /* synthetic */ HMDeviceSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMDeviceSyncManager$syncTrainingLoad$2$onFirstbeatData$1(HMDeviceSyncManager hMDeviceSyncManager, String str, BleFirstbeatData bleFirstbeatData, Continuation<? super HMDeviceSyncManager$syncTrainingLoad$2$onFirstbeatData$1> continuation) {
        super(2, continuation);
        this.this$0 = hMDeviceSyncManager;
        this.$did = str;
        this.$p0 = bleFirstbeatData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HMDeviceSyncManager$syncTrainingLoad$2$onFirstbeatData$1(this.this$0, this.$did, this.$p0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            HMDeviceSyncManager hMDeviceSyncManager = this.this$0;
            String str = this.$did;
            BleFirstbeatData bleFirstbeatData = this.$p0;
            List<BleFirstbeat> list = bleFirstbeatData != null ? bleFirstbeatData.firstbeatList : null;
            this.label = 1;
            if (hMDeviceSyncManager.parseTLData(str, list, this) == coroutine_suspended) {
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
        return ((HMDeviceSyncManager$syncTrainingLoad$2$onFirstbeatData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
