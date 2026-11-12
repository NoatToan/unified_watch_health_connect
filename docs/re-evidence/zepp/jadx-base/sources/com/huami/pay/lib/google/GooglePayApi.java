package com.huami.pay.lib.google;

import android.app.Activity;
import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.pay.lib.PayApi;
import com.huami.pay.lib.PayConstantsKt;
import com.huami.pay.lib.entry.Orders;
import com.huami.pay.lib.entry.PayNotification;
import com.huami.pay.lib.entry.PayOrder;
import com.huami.pay.lib.entry.Sku;
import com.huami.pay.lib.google.GooglePayApi;
import com.huami.pay.lib.web.PayWebApiUseCase;
import com.huami.pay.service.GoodsSku;
import com.huami.pay.service.PayProgress;
import com.huami.pay.service.PayResult;
import com.huami.pay.service.ProductParam;
import com.huami.pay.service.SkuType;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b2\u00103J*\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J$\u0010\u0010\u001a\u00020\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002J\u0013\u0010\u0011\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u001f\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u001b\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J/\u0010#\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00040\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020 2\u0006\u0010%\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0010\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0002J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0014J\u001e\u0010.\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/huami/pay/lib/google/GooglePayApi;", "Lcom/huami/pay/lib/PayApi;", "Lcom/huami/pay/service/ProductParam;", "productParam", "", "Lcom/android/billingclient/api/SkuDetails;", "details", "", "", "Lcom/huami/pay/lib/entry/Sku;", "g", "Lkotlin/Function2;", "Lcom/huami/pay/service/PayResult;", "Lcom/android/billingclient/api/Purchase;", "", "payResult", "h", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "skuIds", "Lcom/huami/pay/service/SkuType;", "skuType", "Lkotlin/Pair;", hl.k, "(Ljava/util/List;Lcom/huami/pay/service/SkuType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "skuDetails", "userId", "orderId", "f", "", "e", "(Lcom/huami/pay/service/ProductParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", z.j, "(Lcom/huami/pay/service/SkuType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "purchaseToken", GoogleApiAvailabilityLight.a, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "code", "b", "Lcom/huami/pay/service/PayProgress;", "payProgress", "notifyProgress", "pay", "Lcom/android/billingclient/api/BillingClient;", "Lcom/android/billingclient/api/BillingClient;", OpenSdkPlayStatisticUpload.KEY_CLIENT, "<init>", "()V", "a", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
public final class GooglePayApi extends PayApi {

    @Deprecated
    public static final float AMOUNT_MICROS = 1000000.0f;

    @NotNull
    private static final a f = new a(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private BillingClient client;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/pay/lib/google/GooglePayApi$a", "", "", "AMOUNT_MICROS", "F", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/android/billingclient/api/BillingResult;", "result", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements ConsumeResponseListener {
        public final /* synthetic */ CancellableContinuation<Boolean> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(CancellableContinuation<? super Boolean> cancellableContinuation) {
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
    @DebugMetadata(c = "com.huami.pay.lib.google.GooglePayApi", f = "GooglePayApi.kt", i = {0, 1, 1}, l = {280, 286}, m = "consumePurchase", n = {"this", "this", "success"}, s = {"L$0", "L$0", "L$1"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return GooglePayApi.this.e(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pay.lib.google.GooglePayApi$googlePay$1", f = "GooglePayApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ WeakReference<Activity> d;
        public final /* synthetic */ GooglePayApi e;
        public final /* synthetic */ List<SkuDetails> f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ BillingResult a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BillingResult billingResult) {
                super(0);
                this.a = billingResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                BillingResult billingResult = this.a;
                return "拉取 Google 支付界面结果:" + (billingResult == null ? null : Integer.valueOf(billingResult.getResponseCode()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, WeakReference<Activity> weakReference, GooglePayApi googlePayApi, List<? extends SkuDetails> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = str2;
            this.d = weakReference;
            this.e = googlePayApi;
            this.f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BillingFlowParams.Builder obfuscatedProfileId = BillingFlowParams.newBuilder().setObfuscatedAccountId(this.b).setObfuscatedProfileId(this.c);
            Iterator<T> it2 = this.f.iterator();
            while (it2.hasNext()) {
                obfuscatedProfileId.setSkuDetails((SkuDetails) it2.next());
            }
            BillingFlowParams billingFlowParamsBuild = obfuscatedProfileId.build();
            Activity activity = this.d.get();
            if (activity == null) {
                this.e.notifyProgress(new PayProgress.PayEnd(PayResult.CODE_GOOGLE_USER_CANCELED));
                return Unit.INSTANCE;
            }
            BillingClient billingClient = this.e.client;
            HMLog.info(PayConstantsKt.PAY_TAG, new a(billingClient == null ? null : billingClient.launchBillingFlow(activity, billingFlowParamsBuild)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pay.lib.google.GooglePayApi$pay$1", f = "GooglePayApi.kt", i = {0, 0, 1, 1, 2, 2}, l = {103, 110, 115}, m = "invokeSuspend", n = {"cloudOrderId", "detailMap", "cloudOrderId", "detailMap", "cloudOrderId", "detailMap"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ ProductParam e;
        public final /* synthetic */ WeakReference<Activity> f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"Lcom/huami/pay/service/PayResult;", "payResult", "Lcom/android/billingclient/api/Purchase;", "purchase", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<PayResult, Purchase, Unit> {
            public final /* synthetic */ GooglePayApi a;
            public final /* synthetic */ Ref.ObjectRef<String> b;
            public final /* synthetic */ ProductParam c;
            public final /* synthetic */ Map<String, Sku> d;

            /* JADX INFO: renamed from: com.huami.pay.lib.google.GooglePayApi$e$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0529a extends Lambda implements Function0<String> {
                public final /* synthetic */ PayResult a;
                public final /* synthetic */ Purchase b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0529a(PayResult payResult, Purchase purchase) {
                    super(0);
                    this.a = payResult;
                    this.b = purchase;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "result:" + this.a + ", purchase:" + this.b;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Ref.ObjectRef<String> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Ref.ObjectRef<String> objectRef) {
                    super(0);
                    this.a = objectRef;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "cloudOrderId:" + ((Object) this.a.element);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.pay.lib.google.GooglePayApi$pay$1$1$3", f = "GooglePayApi.kt", i = {1}, l = {93, 97}, m = "invokeSuspend", n = {"requestCloudResult"}, s = {"L$0"})
            public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public Object a;
                public int b;
                public final /* synthetic */ GooglePayApi c;
                public final /* synthetic */ Purchase d;
                public final /* synthetic */ ProductParam e;
                public final /* synthetic */ Ref.ObjectRef<String> f;
                public final /* synthetic */ Map<String, Sku> g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(GooglePayApi googlePayApi, Purchase purchase, ProductParam productParam, Ref.ObjectRef<String> objectRef, Map<String, Sku> map, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.c = googlePayApi;
                    this.d = purchase;
                    this.e = productParam;
                    this.f = objectRef;
                    this.g = map;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new c(this.c, this.d, this.e, this.f, this.g, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    PayResult payResultNotificationCloud;
                    PayResult payResult;
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.b;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            payResult = (PayResult) this.a;
                            ResultKt.throwOnFailure(obj);
                        }
                        payResultNotificationCloud = payResult;
                        this.c.notifyProgress(new PayProgress.PayEnd(payResultNotificationCloud));
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    this.c.notifyProgress(PayProgress.Notification.INSTANCE);
                    Purchase purchase = this.d;
                    Ref.ObjectRef<String> objectRef = this.f;
                    GooglePayApi googlePayApi = this.c;
                    Map<String, Sku> map = this.g;
                    List listListOf = kotlin.collections.e.listOf(objectRef.element);
                    String purchaseToken = purchase.getPurchaseToken();
                    String str = purchase.getSkus().get(0);
                    String packageName = googlePayApi.getApplicationContext().getPackageName();
                    String str2 = objectRef.element;
                    ArrayList<String> skus = purchase.getSkus();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = skus.iterator();
                    while (it2.hasNext()) {
                        Sku sku = map.get((String) it2.next());
                        if (sku != null) {
                            arrayList.add(sku);
                        }
                    }
                    PayNotification payNotification = new PayNotification(listListOf, purchaseToken, str, packageName, kotlin.collections.e.listOf(new Orders(str2, arrayList)));
                    payResultNotificationCloud = this.c.getPayWebApiUseCase().notificationCloud(payNotification);
                    if (payResultNotificationCloud != PayResult.CODE_SUCCESS) {
                        this.c.getPayWebApiUseCase().insertNotificationFailPurchase(this.e.getUserId(), payNotification);
                    } else {
                        this.c.notifyProgress(PayProgress.QueryOrderState.INSTANCE);
                        PayWebApiUseCase payWebApiUseCase = this.c.getPayWebApiUseCase();
                        String userId = this.e.getUserId();
                        String str3 = this.f.element;
                        this.b = 1;
                        obj = payWebApiUseCase.loopQueryOrderState(userId, str3, true, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    this.c.notifyProgress(new PayProgress.PayEnd(payResultNotificationCloud));
                    return Unit.INSTANCE;
                    PayResult payResult2 = (PayResult) obj;
                    GooglePayApi googlePayApi2 = this.c;
                    ProductParam productParam = this.e;
                    this.a = payResult2;
                    this.b = 2;
                    if (googlePayApi2.e(productParam, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    payResult = payResult2;
                    payResultNotificationCloud = payResult;
                    this.c.notifyProgress(new PayProgress.PayEnd(payResultNotificationCloud));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GooglePayApi googlePayApi, Ref.ObjectRef<String> objectRef, ProductParam productParam, Map<String, Sku> map) {
                super(2);
                this.a = googlePayApi;
                this.b = objectRef;
                this.c = productParam;
                this.d = map;
            }

            public final void a(@NotNull PayResult payResult, @Nullable Purchase purchase) {
                HMLog.info(PayConstantsKt.PAY_TAG, new C0529a(payResult, purchase));
                if (payResult != PayResult.CODE_SUCCESS) {
                    this.a.notifyProgress(new PayProgress.PayEnd(payResult));
                } else {
                    HMLog.info(PayConstantsKt.PAY_TAG, new b(this.b));
                    kotlinx.coroutines.e.f(this.a.getScope(), null, null, new c(this.a, purchase, this.c, this.b, this.d, null), 3, null);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PayResult payResult, Purchase purchase) {
                a(payResult, purchase);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ PayResult a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PayResult payResult) {
                super(0);
                this.a = payResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "connectResult:" + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ PayResult a;
            public final /* synthetic */ List<SkuDetails> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(PayResult payResult, List<? extends SkuDetails> list) {
                super(0);
                this.a = payResult;
                this.b = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "queryResult:" + this.a + ", details:" + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ PayResult a;
            public final /* synthetic */ PayOrder b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(PayResult payResult, PayOrder payOrder) {
                super(0);
                this.a = payResult;
                this.b = payOrder;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "generateResult:" + this.a + ", payOrder:" + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ProductParam productParam, WeakReference<Activity> weakReference, Continuation<? super e> continuation) {
            super(2, continuation);
            this.e = productParam;
            this.f = weakReference;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GooglePayApi.this.new e(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d0 A[LOOP:0: B:29:0x00ca->B:31:0x00d0, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:34:0x00f0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:38:0x010d  */
        /* JADX WARN: Code duplicated, block: B:40:0x011a  */
        /* JADX WARN: Code duplicated, block: B:42:0x0143  */
        /* JADX WARN: Code duplicated, block: B:44:0x0150 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:46:0x0153  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Map linkedHashMap;
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            ArrayList arrayList;
            Iterator<T> it2;
            Map map;
            Ref.ObjectRef objectRef3;
            PayResult payResult;
            List list;
            PayResult payResult2;
            PayResult payResultComponent1;
            PayOrder payOrderComponent2;
            T t;
            PayOrder.Order order;
            String orderId;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            String str = "";
            if (i != 0) {
                if (i == 1) {
                    linkedHashMap = (Map) this.b;
                    objectRef = (Ref.ObjectRef) this.a;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    linkedHashMap = (Map) this.b;
                    objectRef2 = (Ref.ObjectRef) this.a;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        GooglePayApi.this.notifyProgress(new PayProgress.PayEnd(PayResult.CODE_GOOGLE_ERROR));
                        return Unit.INSTANCE;
                    }
                    GooglePayApi googlePayApi = GooglePayApi.this;
                    List<GoodsSku> skus = this.e.getSkus();
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(skus, 10));
                    it2 = skus.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((GoodsSku) it2.next()).getThirdId());
                    }
                    SkuType skuType = this.e.getSkuType();
                    this.a = objectRef2;
                    this.b = linkedHashMap;
                    this.c = 3;
                    obj = googlePayApi.k(arrayList, skuType, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map = linkedHashMap;
                    objectRef3 = objectRef2;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) this.b;
                    objectRef3 = (Ref.ObjectRef) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                Pair pair = (Pair) obj;
                payResult = (PayResult) pair.component1();
                list = (List) pair.component2();
                HMLog.info(PayConstantsKt.PAY_TAG, new c(payResult, list));
                payResult2 = PayResult.CODE_SUCCESS;
                if (payResult != payResult2) {
                    GooglePayApi.this.notifyProgress(new PayProgress.PayEnd(payResult));
                    return Unit.INSTANCE;
                }
                GooglePayApi.this.notifyProgress(PayProgress.GenerateOrder.INSTANCE);
                Pair<PayResult, PayOrder> pairGeneratePayOrder = GooglePayApi.this.getPayWebApiUseCase().generatePayOrder(this.e);
                payResultComponent1 = pairGeneratePayOrder.component1();
                payOrderComponent2 = pairGeneratePayOrder.component2();
                HMLog.info(PayConstantsKt.PAY_TAG, new d(payResultComponent1, payOrderComponent2));
                if (payResultComponent1 != payResult2) {
                    t = str;
                    GooglePayApi.this.notifyProgress(new PayProgress.PayEnd(payResultComponent1));
                    return Unit.INSTANCE;
                }
                if (payOrderComponent2 != null) {
                    order = payOrderComponent2.getOrder();
                    t = str;
                    if (order != null && (orderId = order.getOrderId()) != null) {
                        t = str;
                        t = orderId;
                    }
                }
                t = str;
                objectRef3.element = t;
                map.clear();
                map.putAll(GooglePayApi.this.g(this.e, list));
                GooglePayApi.this.notifyProgress(PayProgress.Paying.INSTANCE);
                GooglePayApi.this.f(this.f, list, this.e.getUserId(), (String) objectRef3.element);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            objectRef4.element = "";
            linkedHashMap = new LinkedHashMap();
            GooglePayApi googlePayApi2 = GooglePayApi.this;
            googlePayApi2.h(new a(googlePayApi2, objectRef4, this.e, linkedHashMap));
            GooglePayApi googlePayApi3 = GooglePayApi.this;
            this.a = objectRef4;
            this.b = linkedHashMap;
            this.c = 1;
            Object objC = googlePayApi3.c(this);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef4;
            obj = objC;
            PayResult payResult3 = (PayResult) obj;
            HMLog.info(PayConstantsKt.PAY_TAG, new b(payResult3));
            if (payResult3 != PayResult.CODE_SUCCESS) {
                GooglePayApi.this.notifyProgress(new PayProgress.PayEnd(payResult3));
                return Unit.INSTANCE;
            }
            GooglePayApi googlePayApi4 = GooglePayApi.this;
            ProductParam productParam = this.e;
            this.a = objectRef;
            this.b = linkedHashMap;
            this.c = 2;
            obj = googlePayApi4.e(productParam, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef2 = objectRef;
            if (!((Boolean) obj).booleanValue()) {
                GooglePayApi.this.notifyProgress(new PayProgress.PayEnd(PayResult.CODE_GOOGLE_ERROR));
                return Unit.INSTANCE;
            }
            GooglePayApi googlePayApi5 = GooglePayApi.this;
            List<GoodsSku> skus2 = this.e.getSkus();
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(skus2, 10));
            it2 = skus2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((GoodsSku) it2.next()).getThirdId());
            }
            SkuType skuType2 = this.e.getSkuType();
            this.a = objectRef2;
            this.b = linkedHashMap;
            this.c = 3;
            obj = googlePayApi5.k(arrayList, skuType2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            map = linkedHashMap;
            objectRef3 = objectRef2;
            Pair pair2 = (Pair) obj;
            payResult = (PayResult) pair2.component1();
            list = (List) pair2.component2();
            HMLog.info(PayConstantsKt.PAY_TAG, new c(payResult, list));
            payResult2 = PayResult.CODE_SUCCESS;
            if (payResult != payResult2) {
                GooglePayApi.this.notifyProgress(new PayProgress.PayEnd(payResult));
                return Unit.INSTANCE;
            }
            GooglePayApi.this.notifyProgress(PayProgress.GenerateOrder.INSTANCE);
            Pair<PayResult, PayOrder> pairGeneratePayOrder2 = GooglePayApi.this.getPayWebApiUseCase().generatePayOrder(this.e);
            payResultComponent1 = pairGeneratePayOrder2.component1();
            payOrderComponent2 = pairGeneratePayOrder2.component2();
            HMLog.info(PayConstantsKt.PAY_TAG, new d(payResultComponent1, payOrderComponent2));
            if (payResultComponent1 != payResult2) {
                t = str;
                GooglePayApi.this.notifyProgress(new PayProgress.PayEnd(payResultComponent1));
                return Unit.INSTANCE;
            }
            if (payOrderComponent2 != null) {
                order = payOrderComponent2.getOrder();
                t = str;
                if (order != null) {
                    t = str;
                    t = orderId;
                }
            }
            t = str;
            objectRef3.element = t;
            map.clear();
            map.putAll(GooglePayApi.this.g(this.e, list));
            GooglePayApi.this.notifyProgress(PayProgress.Paying.INSTANCE);
            GooglePayApi.this.f(this.f, list, this.e.getUserId(), (String) objectRef3.element);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002(\u0010\u0006\u001a$\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00050\u0002H\n"}, d2 = {"Lcom/android/billingclient/api/BillingResult;", "result", "", "Lcom/android/billingclient/api/Purchase;", "kotlin.jvm.PlatformType", "", "purchases", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f implements PurchasesResponseListener {
        public final /* synthetic */ CancellableContinuation<Pair<Boolean, ? extends List<String>>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(CancellableContinuation<? super Pair<Boolean, ? extends List<String>>> cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // com.android.billingclient.api.PurchasesResponseListener
        public final void onQueryPurchasesResponse(@NotNull BillingResult billingResult, @NotNull List<Purchase> list) {
            CancellableContinuation<Pair<Boolean, ? extends List<String>>> cancellableContinuation = this.a;
            Boolean boolValueOf = Boolean.valueOf(billingResult.getResponseCode() == 0);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Purchase) it2.next()).getPurchaseToken());
            }
            Pair pair = new Pair(boolValueOf, arrayList);
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m3845constructorimpl(pair));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002,\u0010\u0006\u001a(\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002H\n"}, d2 = {"Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/SkuDetails;", "kotlin.jvm.PlatformType", "", "skuDetailList", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g implements SkuDetailsResponseListener {
        public final /* synthetic */ CancellableContinuation<Pair<? extends PayResult, ? extends List<? extends SkuDetails>>> a;
        public final /* synthetic */ GooglePayApi b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ BillingResult a;
            public final /* synthetic */ List<SkuDetails> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BillingResult billingResult, List<SkuDetails> list) {
                super(0);
                this.a = billingResult;
                this.b = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "queryGoogleSkuDetails：billingResult: " + this.a.getResponseCode() + ", skuDetailList: " + this.b;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(CancellableContinuation<? super Pair<? extends PayResult, ? extends List<? extends SkuDetails>>> cancellableContinuation, GooglePayApi googlePayApi) {
            this.a = cancellableContinuation;
            this.b = googlePayApi;
        }

        @Override // com.android.billingclient.api.SkuDetailsResponseListener
        public final void onSkuDetailsResponse(@NotNull BillingResult billingResult, @Nullable List<SkuDetails> list) {
            HMLog.info(PayConstantsKt.PAY_TAG, new a(billingResult, list));
            if (billingResult.getResponseCode() != 0) {
                CancellableContinuation<Pair<? extends PayResult, ? extends List<? extends SkuDetails>>> cancellableContinuation = this.a;
                Pair pair = TuplesKt.to(this.b.b(billingResult.getResponseCode()), null);
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m3845constructorimpl(pair));
                return;
            }
            if (list == null || list.isEmpty()) {
                CancellableContinuation<Pair<? extends PayResult, ? extends List<? extends SkuDetails>>> cancellableContinuation2 = this.a;
                Pair pair2 = TuplesKt.to(PayResult.CODE_GOOGLE_SKU_DETAIL_NULL, null);
                Result.Companion companion2 = Result.Companion;
                cancellableContinuation2.resumeWith(Result.m3845constructorimpl(pair2));
                return;
            }
            CancellableContinuation<Pair<? extends PayResult, ? extends List<? extends SkuDetails>>> cancellableContinuation3 = this.a;
            Pair pair3 = TuplesKt.to(PayResult.CODE_SUCCESS, list);
            Result.Companion companion3 = Result.Companion;
            cancellableContinuation3.resumeWith(Result.m3845constructorimpl(pair3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PayResult b(int code) {
        switch (code) {
            case -3:
                return PayResult.CODE_GOOGLE_SERVICE_TIMEOUT;
            case -2:
                return PayResult.CODE_GOOGLE_FEATURE_NOT_SUPPORTED;
            case -1:
                return PayResult.CODE_GOOGLE_SERVICE_DISCONNECTED;
            case 0:
            default:
                return PayResult.CODE_GOOGLE_ERROR;
            case 1:
                return PayResult.CODE_GOOGLE_USER_CANCELED;
            case 2:
                return PayResult.CODE_GOOGLE_SERVICE_UNAVAILABLE;
            case 3:
                return PayResult.CODE_GOOGLE_BILLING_UNAVAILABLE;
            case 4:
                return PayResult.CODE_GOOGLE_ITEM_UNAVAILABLE;
            case 5:
                return PayResult.CODE_GOOGLE_DEVELOPER_ERROR;
            case 6:
                return PayResult.CODE_GOOGLE_ERROR;
            case 7:
                return PayResult.CODE_GOOGLE_ITEM_ALREADY_OWNED;
            case 8:
                return PayResult.CODE_GOOGLE_ITEM_NOT_OWNED;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(Continuation<? super PayResult> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BillingClient billingClient = this.client;
        if (billingClient != null) {
            billingClient.startConnection(new BillingClientStateListener() { // from class: com.huami.pay.lib.google.GooglePayApi$connectGoogleService$2$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public static final a a = new a();

                    public a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
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
                    public final String invoke() {
                        return "GonBillingSetupFinished:" + this.a.getResponseCode();
                    }
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingServiceDisconnected() {
                    HMLog.warn$default(PayConstantsKt.PAY_TAG, null, a.a, 2, null);
                    CancellableContinuation<PayResult> cancellableContinuation = cancellableContinuationImpl;
                    PayResult payResult = PayResult.CODE_GOOGLE_SERVICE_DISCONNECTED;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m3845constructorimpl(payResult));
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingSetupFinished(@NotNull BillingResult result) {
                    HMLog.info(PayConstantsKt.PAY_TAG, new b(result));
                    if (result.getResponseCode() == 0) {
                        CancellableContinuation<PayResult> cancellableContinuation = cancellableContinuationImpl;
                        PayResult payResult = PayResult.CODE_SUCCESS;
                        Result.Companion companion = Result.Companion;
                        cancellableContinuation.resumeWith(Result.m3845constructorimpl(payResult));
                        return;
                    }
                    CancellableContinuation<PayResult> cancellableContinuation2 = cancellableContinuationImpl;
                    PayResult payResultB = this.b(result.getResponseCode());
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuation2.resumeWith(Result.m3845constructorimpl(payResultB));
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
    public final Object d(String str, Continuation<? super Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ConsumeParams consumeParamsBuild = ConsumeParams.newBuilder().setPurchaseToken(str).build();
        BillingClient billingClient = this.client;
        if (billingClient != null) {
            billingClient.consumeAsync(consumeParamsBuild, new b(cancellableContinuationImpl));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a8 -> B:36:0x00ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(com.huami.pay.service.ProductParam r7, kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.huami.pay.lib.google.GooglePayApi.c
            if (r0 == 0) goto L13
            r0 = r8
            com.huami.pay.lib.google.GooglePayApi$c r0 = (com.huami.pay.lib.google.GooglePayApi.c) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.huami.pay.lib.google.GooglePayApi$c r0 = new com.huami.pay.lib.google.GooglePayApi$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L42
            if (r2 != r4) goto L3a
            java.lang.Object r7 = r0.c
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.b
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r5 = r0.a
            com.huami.pay.lib.google.GooglePayApi r5 = (com.huami.pay.lib.google.GooglePayApi) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto Lab
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            java.lang.Object r7 = r0.a
            com.huami.pay.lib.google.GooglePayApi r7 = (com.huami.pay.lib.google.GooglePayApi) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6c
        L4a:
            kotlin.ResultKt.throwOnFailure(r8)
            com.huami.pay.service.SkuType r8 = r7.getSkuType()
            com.huami.pay.service.SkuType r2 = com.huami.pay.service.SkuType.INAPP
            if (r8 != r2) goto Lc1
            boolean r8 = r7.getNeedConsume()
            if (r8 != 0) goto L5c
            goto Lc1
        L5c:
            com.huami.pay.service.SkuType r7 = r7.getSkuType()
            r0.a = r6
            r0.f = r5
            java.lang.Object r8 = r6.j(r7, r0)
            if (r8 != r1) goto L6b
            return r1
        L6b:
            r7 = r6
        L6c:
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r2 = r8.component1()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r8 = r8.component2()
            java.util.List r8 = (java.util.List) r8
            if (r2 == 0) goto Lb9
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef
            r2.<init>()
            r2.element = r5
            if (r8 != 0) goto L8a
            goto Lb6
        L8a:
            java.util.Iterator r8 = r8.iterator()
            r5 = r7
            r7 = r8
        L90:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb6
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            r0.a = r5
            r0.b = r2
            r0.c = r7
            r0.f = r4
            java.lang.Object r8 = r5.d(r8, r0)
            if (r8 != r1) goto Lab
            return r1
        Lab:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L90
            r2.element = r3
            goto L90
        Lb6:
            boolean r3 = r2.element
            goto Lbc
        Lb9:
            if (r2 == 0) goto Lbc
            r3 = 1
        Lbc:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r7
        Lc1:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.pay.lib.google.GooglePayApi.e(com.huami.pay.service.ProductParam, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(WeakReference<Activity> weakReferenceActivity, List<? extends SkuDetails> skuDetails, String userId, String orderId) {
        kotlinx.coroutines.e.f(getScope(), Dispatchers.getMain(), null, new d(userId, orderId, weakReferenceActivity, this, skuDetails, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Sku> g(ProductParam productParam, List<? extends SkuDetails> details) {
        Object next;
        String sku;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10)), 16));
        for (SkuDetails skuDetails : details) {
            String sku2 = skuDetails.getSku();
            String priceCurrencyCode = skuDetails.getPriceCurrencyCode();
            String strValueOf = String.valueOf(skuDetails.getPriceAmountMicros() / 1000000.0f);
            Iterator<T> it2 = productParam.getSkus().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((GoodsSku) next).getThirdId(), sku2));
            GoodsSku goodsSku = (GoodsSku) next;
            String str = "";
            if (goodsSku != null && (sku = goodsSku.getSku()) != null) {
                str = sku;
            }
            Pair pair = TuplesKt.to(sku2, new Sku(priceCurrencyCode, strValueOf, sku2, str));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(final Function2<? super PayResult, ? super Purchase, Unit> payResult) {
        this.client = BillingClient.newBuilder((Context) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).setListener(new PurchasesUpdatedListener() { // from class: ai2
            @Override // com.android.billingclient.api.PurchasesUpdatedListener
            public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                GooglePayApi.i(payResult, this, billingResult, list);
            }
        }).enablePendingPurchases().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Function2 function2, GooglePayApi googlePayApi, BillingResult billingResult, List list) {
        if (billingResult.getResponseCode() != 0) {
            function2.invoke(googlePayApi.b(billingResult.getResponseCode()), null);
            return;
        }
        if (list == null || list.isEmpty()) {
            function2.invoke(PayResult.CODE_GOOGLE_PURCHASE_NULL, null);
        } else {
            function2.invoke(PayResult.CODE_SUCCESS, CollectionsKt.first(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(SkuType skuType, Continuation<? super Pair<Boolean, ? extends List<String>>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BillingClient billingClient = this.client;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(skuType.getValue(), new f(cancellableContinuationImpl));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(List<String> list, SkuType skuType, Continuation<? super Pair<? extends PayResult, ? extends List<? extends SkuDetails>>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        SkuDetailsParams skuDetailsParamsBuild = SkuDetailsParams.newBuilder().setSkusList(list).setType(skuType.getValue()).build();
        BillingClient billingClient = this.client;
        if (billingClient != null) {
            billingClient.querySkuDetailsAsync(skuDetailsParamsBuild, new g(cancellableContinuationImpl, this));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.huami.pay.lib.PayApi
    public void notifyProgress(@NotNull PayProgress payProgress) {
        super.notifyProgress(payProgress);
        if (payProgress instanceof PayProgress.PayEnd) {
            BillingClient billingClient = this.client;
            if (billingClient != null) {
                billingClient.endConnection();
            }
            this.client = null;
        }
    }

    @Override // com.huami.pay.lib.PayApi
    public void pay(@NotNull WeakReference<Activity> weakReferenceActivity, @NotNull ProductParam productParam) {
        kotlinx.coroutines.e.f(getScope(), null, null, new e(productParam, weakReferenceActivity, null), 3, null);
    }
}
