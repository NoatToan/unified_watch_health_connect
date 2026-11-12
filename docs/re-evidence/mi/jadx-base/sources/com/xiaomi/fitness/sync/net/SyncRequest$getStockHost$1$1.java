package com.xiaomi.fitness.sync.net;

import com.xiaomi.fitness.sync.model.StockHostResp;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sync/model/StockHostResp;", "it", "Lcom/xiaomi/fitness/sync/net/SyncApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sync.net.SyncRequest$getStockHost$1$1", f = "SyncRequest.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
public final class SyncRequest$getStockHost$1$1 extends SuspendLambda implements Function2<SyncApiService, Continuation<? super StockHostResp>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public SyncRequest$getStockHost$1$1(Continuation<? super SyncRequest$getStockHost$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SyncRequest$getStockHost$1$1 syncRequest$getStockHost$1$1 = new SyncRequest$getStockHost$1$1(continuation);
        syncRequest$getStockHost$1$1.L$0 = obj;
        return syncRequest$getStockHost$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SyncApiService syncApiService, Continuation<? super StockHostResp> continuation) {
        return ((SyncRequest$getStockHost$1$1) create(syncApiService, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SyncApiService syncApiService = (SyncApiService) this.L$0;
            HashMap<String, String> stockParams = SyncRequest.INSTANCE.getStockParams();
            this.label = 1;
            obj = syncApiService.getStockHost("https://cg.play-analytics.com", stockParams, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
