package com.xiaomi.fitness.sync.net;

import com.xiaomi.fitness.sync.export.model.StockModel;
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
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;", "it", "Lcom/xiaomi/fitness/sync/net/SyncApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sync.net.SyncRequest$requestStockSuggest$observable$1$1$1$1", f = "SyncRequest.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
public final class SyncRequest$requestStockSuggest$observable$1$1$1$1 extends SuspendLambda implements Function2<SyncApiService, Continuation<? super StockModel.StockSuggestResult>, Object> {
    final /* synthetic */ StockModel.StockToken $stockToken;
    final /* synthetic */ String $url;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRequest$requestStockSuggest$observable$1$1$1$1(String str, StockModel.StockToken stockToken, Continuation<? super SyncRequest$requestStockSuggest$observable$1$1$1$1> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$stockToken = stockToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SyncRequest$requestStockSuggest$observable$1$1$1$1 syncRequest$requestStockSuggest$observable$1$1$1$1 = new SyncRequest$requestStockSuggest$observable$1$1$1$1(this.$url, this.$stockToken, continuation);
        syncRequest$requestStockSuggest$observable$1$1$1$1.L$0 = obj;
        return syncRequest$requestStockSuggest$observable$1$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SyncApiService syncApiService, Continuation<? super StockModel.StockSuggestResult> continuation) {
        return ((SyncRequest$requestStockSuggest$observable$1$1$1$1) create(syncApiService, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SyncApiService syncApiService = (SyncApiService) this.L$0;
            String str = this.$url;
            HashMap<String, String> stockParams = SyncRequest.INSTANCE.getStockParams();
            String str2 = "Bearer " + this.$stockToken.access_token;
            this.label = 1;
            obj = syncApiService.getStockSuggest(str, stockParams, str2, this);
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
