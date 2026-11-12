package com.huami.pay.lib;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.pay.lib.HuamiPayDebugServiceImpl;
import com.huami.pay.service.HuamiPayDebugService;
import com.huami.pay.service.SkuType;
import com.huami.tools.log.HMLog;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J#\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/pay/lib/HuamiPayDebugServiceImpl;", "Lcom/huami/pay/service/HuamiPayDebugService;", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/huami/pay/service/SkuType;", "skuType", "", "", "queryGooglePurchaseHistory", "(Lcom/huami/pay/service/SkuType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "purchaseToken", "consumeGooglePurchase", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "releaseGoogleService", "Lcom/android/billingclient/api/BillingClient;", "a", "Lcom/android/billingclient/api/BillingClient;", OpenSdkPlayStatisticUpload.KEY_CLIENT, "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
public final class HuamiPayDebugServiceImpl implements HuamiPayDebugService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private BillingClient client;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/android/billingclient/api/BillingResult;", "result", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements ConsumeResponseListener {
        public final /* synthetic */ CancellableContinuation<Boolean> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // com.android.billingclient.api.ConsumeResponseListener
        public final void onConsumeResponse(@NotNull BillingResult billingResult, @NotNull String str) {
            CancellableContinuation<Boolean> cancellableContinuation = this.a;
            Boolean boolValueOf = Boolean.valueOf(billingResult.getResponseCode() == 0);
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m3845constructorimpl(boolValueOf));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pay.lib.HuamiPayDebugServiceImpl", f = "HuamiPayDebugServiceImpl.kt", i = {0, 0, 1, 1}, l = {62, 90}, m = "queryGooglePurchaseHistory", n = {"this", "skuType", "this", "skuType"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return HuamiPayDebugServiceImpl.this.queryGooglePurchaseHistory(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002(\u0010\u0006\u001a$\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00050\u0002H\n"}, d2 = {"Lcom/android/billingclient/api/BillingResult;", "<anonymous parameter 0>", "", "Lcom/android/billingclient/api/Purchase;", "kotlin.jvm.PlatformType", "", "purchases", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements PurchasesResponseListener {
        public final /* synthetic */ CancellableContinuation<List<String>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(CancellableContinuation<? super List<String>> cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // com.android.billingclient.api.PurchasesResponseListener
        public final void onQueryPurchasesResponse(@NotNull BillingResult billingResult, @NotNull List<Purchase> list) {
            CancellableContinuation<List<String>> cancellableContinuation = this.a;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Purchase) it2.next()).getPurchaseToken());
            }
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m3845constructorimpl(arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BillingClient billingClient = this.client;
        if (billingClient != null) {
            billingClient.startConnection(new BillingClientStateListener() { // from class: com.huami.pay.lib.HuamiPayDebugServiceImpl$connectGoogleService$2$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public static final a a = new a();

                    public a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "Google Service Disconnected.";
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public final /* synthetic */ BillingResult a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(BillingResult billingResult) {
                        super(0);
                        this.a = billingResult;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "GonBillingSetupFinished:" + this.a.getResponseCode();
                    }
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingServiceDisconnected() {
                    HMLog.warn$default(PayConstantsKt.PAY_TAG, null, a.a, 2, null);
                    CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                    Boolean bool = Boolean.FALSE;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m3845constructorimpl(bool));
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingSetupFinished(@NotNull BillingResult result) {
                    HMLog.info(PayConstantsKt.PAY_TAG, new b(result));
                    if (result.getResponseCode() == 0) {
                        CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                        Boolean bool = Boolean.TRUE;
                        Result.Companion companion = Result.Companion;
                        cancellableContinuation.resumeWith(Result.m3845constructorimpl(bool));
                        return;
                    }
                    CancellableContinuation<Boolean> cancellableContinuation2 = cancellableContinuationImpl;
                    Boolean bool2 = Boolean.FALSE;
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuation2.resumeWith(Result.m3845constructorimpl(bool2));
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(Continuation<? super Boolean> continuation) {
        this.client = BillingClient.newBuilder((Context) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).setListener(new PurchasesUpdatedListener() { // from class: ac4
            @Override // com.android.billingclient.api.PurchasesUpdatedListener
            public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                HuamiPayDebugServiceImpl.d(billingResult, list);
            }
        }).enablePendingPurchases().build();
        return b(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(BillingResult billingResult, List list) {
    }

    @Override // com.huami.pay.service.HuamiPayDebugService
    @Nullable
    public Object consumeGooglePurchase(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ConsumeParams consumeParamsBuild = ConsumeParams.newBuilder().setPurchaseToken(str).build();
        BillingClient billingClient = this.client;
        if (billingClient != null) {
            billingClient.consumeAsync(consumeParamsBuild, new a(cancellableContinuationImpl));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.pay.service.HuamiPayDebugService
    @Nullable
    public Object queryGooglePurchaseHistory(@NotNull SkuType skuType, @NotNull Continuation<? super List<String>> continuation) {
        b bVar;
        HuamiPayDebugServiceImpl huamiPayDebugServiceImpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.e = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objC = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                skuType = (SkuType) bVar.b;
                huamiPayDebugServiceImpl = (HuamiPayDebugServiceImpl) bVar.a;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
        }
        ResultKt.throwOnFailure(objC);
        bVar.a = this;
        bVar.b = skuType;
        bVar.e = 1;
        objC = c(bVar);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        huamiPayDebugServiceImpl = this;
        if (!((Boolean) objC).booleanValue()) {
            return null;
        }
        bVar.a = huamiPayDebugServiceImpl;
        bVar.b = skuType;
        bVar.e = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(bVar), 1);
        cancellableContinuationImpl.initCancellability();
        BillingClient billingClient = huamiPayDebugServiceImpl.client;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(skuType.getValue(), new c(cancellableContinuationImpl));
        }
        objC = cancellableContinuationImpl.getResult();
        if (objC == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(bVar);
        }
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }

    @Override // com.huami.pay.service.HuamiPayDebugService
    public void releaseGoogleService() {
        BillingClient billingClient = this.client;
        if (billingClient != null) {
            billingClient.endConnection();
        }
        this.client = null;
    }
}
