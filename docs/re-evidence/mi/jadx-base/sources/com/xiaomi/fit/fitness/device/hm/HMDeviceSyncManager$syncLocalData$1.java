package com.xiaomi.fit.fitness.device.hm;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.fitness.db.dao.DataSyncEntity;
import java.util.Iterator;
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
@DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncLocalData$1", f = "HMDeviceSyncManager.kt", i = {}, l = {127, 135}, m = "invokeSuspend", n = {}, s = {})
public final class HMDeviceSyncManager$syncLocalData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sid;
    Object L$0;
    int label;
    final /* synthetic */ HMDeviceSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMDeviceSyncManager$syncLocalData$1(HMDeviceSyncManager hMDeviceSyncManager, String str, Continuation<? super HMDeviceSyncManager$syncLocalData$1> continuation) {
        super(2, continuation);
        this.this$0 = hMDeviceSyncManager;
        this.$sid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HMDeviceSyncManager$syncLocalData$1(this.this$0, this.$sid, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0042 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        DataSyncEntity dataSyncEntity;
        FitnessDataId fitnessDataId;
        HMDeviceSyncManager hMDeviceSyncManager;
        String str;
        int syncStatus;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                dataSyncEntity = (DataSyncEntity) it.next();
                fitnessDataId = new FitnessDataId(dataSyncEntity.getIdBytes());
                if (dataSyncEntity.getSyncStatus() == 0) {
                    hMDeviceSyncManager = this.this$0;
                    str = this.$sid;
                    syncStatus = dataSyncEntity.getSyncStatus();
                    this.L$0 = it;
                    this.label = 2;
                    if (hMDeviceSyncManager.deleteSyncStatus(str, fitnessDataId, syncStatus, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        HMDeviceSyncManager hMDeviceSyncManager2 = this.this$0;
        String str2 = this.$sid;
        this.label = 1;
        obj = hMDeviceSyncManager2.getSyncStatusLessThan(str2, 2, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        it = list.iterator();
        while (it.hasNext()) {
            dataSyncEntity = (DataSyncEntity) it.next();
            fitnessDataId = new FitnessDataId(dataSyncEntity.getIdBytes());
            if (dataSyncEntity.getSyncStatus() == 0) {
                hMDeviceSyncManager = this.this$0;
                str = this.$sid;
                syncStatus = dataSyncEntity.getSyncStatus();
                this.L$0 = it;
                this.label = 2;
                if (hMDeviceSyncManager.deleteSyncStatus(str, fitnessDataId, syncStatus, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HMDeviceSyncManager$syncLocalData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
