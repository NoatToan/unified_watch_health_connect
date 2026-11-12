package com.huami.pay.service;

import androidx.annotation.AnyThread;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/pay/service/HuamiPayDebugService;", "", "Lcom/huami/pay/service/SkuType;", "skuType", "", "", "queryGooglePurchaseHistory", "(Lcom/huami/pay/service/SkuType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "purchaseToken", "", "consumeGooglePurchase", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "releaseGoogleService", "pay-service_release"}, k = 1, mv = {1, 5, 1})
public interface HuamiPayDebugService {
    @Nullable
    Object consumeGooglePurchase(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object queryGooglePurchaseHistory(@NotNull SkuType skuType, @NotNull Continuation<? super List<String>> continuation);

    @AnyThread
    void releaseGoogleService();
}
