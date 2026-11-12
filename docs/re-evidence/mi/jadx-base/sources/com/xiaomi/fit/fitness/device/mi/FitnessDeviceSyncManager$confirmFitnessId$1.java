package com.xiaomi.fit.fitness.device.mi;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.device.FitnessDataSyncBaseImpl;
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
@DebugMetadata(c = "com.xiaomi.fit.fitness.device.mi.FitnessDeviceSyncManager$confirmFitnessId$1", f = "FitnessDeviceSyncManager.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
public final class FitnessDeviceSyncManager$confirmFitnessId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FitnessDataId $dataId;
    final /* synthetic */ String $sid;
    int label;
    final /* synthetic */ FitnessDeviceSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitnessDeviceSyncManager$confirmFitnessId$1(FitnessDeviceSyncManager fitnessDeviceSyncManager, String str, FitnessDataId fitnessDataId, Continuation<? super FitnessDeviceSyncManager$confirmFitnessId$1> continuation) {
        super(2, continuation);
        this.this$0 = fitnessDeviceSyncManager;
        this.$sid = str;
        this.$dataId = fitnessDataId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FitnessDeviceSyncManager$confirmFitnessId$1(this.this$0, this.$sid, this.$dataId, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FitnessLogUtils.i(this.this$0.getTAG(), this.$sid + " data, not need confirmFitnessId: " + this.$dataId);
            FitnessDeviceSyncManager fitnessDeviceSyncManager = this.this$0;
            String str = this.$sid;
            FitnessDataId fitnessDataId = this.$dataId;
            this.label = 1;
            if (FitnessDataSyncBaseImpl.onSyncSuccess$default(fitnessDeviceSyncManager, str, fitnessDataId, 4, 0, this, 8, null) == coroutine_suspended) {
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
        return ((FitnessDeviceSyncManager$confirmFitnessId$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
