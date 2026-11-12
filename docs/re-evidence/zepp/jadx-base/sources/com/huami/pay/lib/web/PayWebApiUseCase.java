package com.huami.pay.lib.web;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.pay.lib.PayConstantsKt;
import com.huami.pay.lib.db.PayPurchase;
import com.huami.pay.lib.db.PayPurchaseDao;
import com.huami.pay.lib.db.PayPurchaseDb;
import com.huami.pay.lib.entry.Orders;
import com.huami.pay.lib.entry.PayNotification;
import com.huami.pay.lib.entry.PayOrder;
import com.huami.pay.lib.entry.Sku;
import com.huami.pay.service.GoodsSku;
import com.huami.pay.service.HuamiPayNotificationService;
import com.huami.pay.service.PayChannel;
import com.huami.pay.service.PayResult;
import com.huami.pay.service.ProductParam;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ-\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/huami/pay/lib/web/PayWebApiUseCase;", "Lcom/huami/pay/service/HuamiPayNotificationService;", "Lcom/huami/pay/service/PayChannel;", "", "c", "Lcom/huami/pay/service/ProductParam;", "payChannel", "Lcom/huami/pay/lib/entry/PayOrder;", "b", "productParam", "Lkotlin/Pair;", "Lcom/huami/pay/service/PayResult;", "generatePayOrder", "Lcom/huami/pay/lib/entry/PayNotification;", SleepHomeActivity.FROM_NOTIFICATION, "notificationCloud", "userId", "orderId", "", "isGooglePay", "loopQueryOrderState", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "insertNotificationFailPurchase", "checkAndReUploadPurchaseVoucher", "Lcom/huami/pay/lib/web/PayWebApi;", "a", "Lcom/huami/pay/lib/web/PayWebApi;", "payWebApi", "Lcom/huami/pay/lib/db/PayPurchaseDao;", "Lkotlin/Lazy;", "()Lcom/huami/pay/lib/db/PayPurchaseDao;", UserDataStore.DATE_OF_BIRTH, "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "()V", GoogleApiAvailabilityLight.a, "pay-lib_release"}, k = 1, mv = {1, 5, 1})
public final class PayWebApiUseCase implements HuamiPayNotificationService {

    @Deprecated
    public static final long DELAY_TIME_DEFAULT = 1000;

    @Deprecated
    public static final long DELAY_TIME_GOOGLE = 3000;

    @Deprecated
    public static final int NOTIFICATION_RETRY_TIMES = 3;

    @Deprecated
    public static final int QUERY_ORDER_RETRY_TIMES = 5;

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PayWebApi payWebApi = new PayWebApi();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy db = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PayChannel.values().length];
            iArr[PayChannel.ALI_PAY.ordinal()] = 1;
            iArr[PayChannel.WECHAT_PAY.ordinal()] = 2;
            iArr[PayChannel.GOOGLE_PAY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"com/huami/pay/lib/web/PayWebApiUseCase$a", "", "", "DELAY_TIME_DEFAULT", "J", "DELAY_TIME_GOOGLE", "", "NOTIFICATION_RETRY_TIMES", LogUtil.I, "QUERY_ORDER_RETRY_TIMES", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pay.lib.web.PayWebApiUseCase$checkAndReUploadPurchaseVoucher$1", f = "PayWebApiUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PayWebApiUseCase.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<PayPurchase> listQueryPurchases = PayWebApiUseCase.this.a().queryPurchases(this.c);
            PayWebApiUseCase payWebApiUseCase = PayWebApiUseCase.this;
            for (PayPurchase payPurchase : listQueryPurchases) {
                List listListOf = kotlin.collections.e.listOf(payPurchase.getOrderId());
                String purchaseToken = payPurchase.getPurchaseToken();
                String subscriptionId = payPurchase.getSkus().get(0).getSubscriptionId();
                String packageName = ((Context) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).getPackageName();
                String orderId = payPurchase.getOrderId();
                List<PayPurchase.PurchaseSku> skus = payPurchase.getSkus();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(skus, 10));
                for (PayPurchase.PurchaseSku purchaseSku : skus) {
                    arrayList.add(new Sku(purchaseSku.getCurrencyCode(), purchaseSku.getPrice(), purchaseSku.getSubscriptionId(), purchaseSku.getSkuId()));
                }
                if (payWebApiUseCase.notificationCloud(new PayNotification(listListOf, purchaseToken, subscriptionId, packageName, kotlin.collections.e.listOf(new Orders(orderId, arrayList)))) == PayResult.CODE_SUCCESS) {
                    payWebApiUseCase.a().deletePurchase(payPurchase);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/pay/lib/db/PayPurchaseDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<PayPurchaseDao> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayPurchaseDao getA() {
            return ((PayPurchaseDb) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(PayPurchaseDb.class), null, null)).payPurchaseDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pay.lib.web.PayWebApiUseCase$insertNotificationFailPurchase$1", f = "PayWebApiUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ PayNotification d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, PayNotification payNotification, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = payNotification;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PayWebApiUseCase.this.new d(this.c, this.d, continuation);
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
            PayPurchaseDao payPurchaseDaoA = PayWebApiUseCase.this.a();
            String str = this.c;
            String str2 = this.d.getOrderIds().get(0);
            String token = this.d.getToken();
            List<Sku> skus = this.d.getOrders().get(0).getSkus();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(skus, 10));
            for (Sku sku : skus) {
                arrayList.add(new PayPurchase.PurchaseSku(sku.getCurrencyCode(), sku.getPrice(), sku.getSubscriptionId(), sku.getSkuId()));
            }
            payPurchaseDaoA.insertPurchases(new PayPurchase(str, str2, token, arrayList));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pay.lib.web.PayWebApiUseCase", f = "PayWebApiUseCase.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {102, 107}, m = "loopQueryOrderState", n = {"this", "userId", "orderId", "result", "isGooglePay", "this", "userId", "orderId", "result", "isGooglePay"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public boolean e;
        public int f;
        public /* synthetic */ Object g;
        public int i;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return PayWebApiUseCase.this.loopQueryOrderState(null, null, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<PayResult> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ref.ObjectRef<PayResult> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "queryOrderState result:" + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<PayResult> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Ref.ObjectRef<PayResult> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "notification result:" + this.a.element;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PayPurchaseDao a() {
        return (PayPurchaseDao) this.db.getValue();
    }

    private final PayOrder b(ProductParam productParam, String str) {
        List<GoodsSku> skus = productParam.getSkus();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(skus, 10));
        for (GoodsSku goodsSku : skus) {
            arrayList.add(new PayOrder.Order.OrderSku(goodsSku.getSku(), goodsSku.getQuantity(), goodsSku.getExtra()));
        }
        return new PayOrder(new PayOrder.Order(productParam.getDescription(), arrayList, (String) null, 4, (DefaultConstructorMarker) null), new PayOrder.Payment(str, (String) null, 2, (DefaultConstructorMarker) null));
    }

    private final String c(PayChannel payChannel) {
        String str;
        Context context = (Context) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        if (context.getPackageName().equals("com.xiaomi.hm.health")) {
            str = PayConstantsKt.PAY_CHANNEL_PREFIX_MIFIT;
        } else {
            str = context.getPackageName().equals("com.huami.watch.hmwatchmanager") ? PayConstantsKt.PAY_CHANNEL_PREFIX_ZEPP : null;
        }
        if (str == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[payChannel.ordinal()];
        if (i == 1) {
            return str + PayConstantsKt.PAY_CHANNEL_ALI;
        }
        if (i == 2) {
            return str + PayConstantsKt.PAY_CHANNEL_WECHAT;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return str + PayConstantsKt.PAY_CHANNEL_GOOGLE;
    }

    public static /* synthetic */ Object loopQueryOrderState$default(PayWebApiUseCase payWebApiUseCase, String str, String str2, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return payWebApiUseCase.loopQueryOrderState(str, str2, z, continuation);
    }

    @Override // com.huami.pay.service.HuamiPayNotificationService
    public void checkAndReUploadPurchaseVoucher(@NotNull String userId) {
        kotlinx.coroutines.e.f(this.scope, null, null, new b(userId, null), 3, null);
    }

    @NotNull
    public final Pair<PayResult, PayOrder> generatePayOrder(@NotNull ProductParam productParam) {
        PayOrder.Order order;
        List<PayOrder.Order.OrderSku> skus;
        String strC = c(productParam.getChannel());
        if (strC == null) {
            return TuplesKt.to(PayResult.CODE_PAY_CHANNEL_NOT_SUPPORT, null);
        }
        Pair<PayResult, PayOrder> pairGeneratePayOrder = this.payWebApi.generatePayOrder(productParam.getUserId(), b(productParam, strC));
        PayResult payResultComponent1 = pairGeneratePayOrder.component1();
        PayOrder payOrderComponent2 = pairGeneratePayOrder.component2();
        if (payResultComponent1 != PayResult.CODE_SUCCESS) {
            return TuplesKt.to(payResultComponent1, payOrderComponent2);
        }
        boolean z = false;
        if (payOrderComponent2 != null && (order = payOrderComponent2.getOrder()) != null && (skus = order.getSkus()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(skus, 10));
            Iterator<T> it2 = skus.iterator();
            while (it2.hasNext()) {
                arrayList.add(((PayOrder.Order.OrderSku) it2.next()).getSkuId());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (true) {
                boolean z2 = true;
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                String str = (String) next;
                if (str != null && str.length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    arrayList2.add(next);
                }
            }
            z = !arrayList2.isEmpty();
        }
        return z ? TuplesKt.to(PayResult.CODE_SUCCESS, payOrderComponent2) : TuplesKt.to(PayResult.CODE_CLOUD_PAY_RESULT_SKU_NULL, payOrderComponent2);
    }

    public final void insertNotificationFailPurchase(@NotNull String userId, @NotNull PayNotification notification) {
        kotlinx.coroutines.e.f(this.scope, null, null, new d(userId, notification, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f A[PHI: r2 r6 r10 r11 r12 r13
      0x006f: PHI (r2v4 int) = (r2v2 int), (r2v8 int) binds: [B:16:0x0061, B:31:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r6v2 com.huami.pay.lib.web.PayWebApiUseCase) = (r6v0 com.huami.pay.lib.web.PayWebApiUseCase), (r6v3 com.huami.pay.lib.web.PayWebApiUseCase) binds: [B:16:0x0061, B:31:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r10v4 java.lang.String) = (r10v0 java.lang.String), (r10v7 java.lang.String) binds: [B:16:0x0061, B:31:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r11v3 java.lang.String) = (r11v0 java.lang.String), (r11v6 java.lang.String) binds: [B:16:0x0061, B:31:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r12v3 boolean) = (r12v0 boolean), (r12v6 boolean) binds: [B:16:0x0061, B:31:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r13v6 kotlin.jvm.internal.Ref$ObjectRef) = (r13v2 kotlin.jvm.internal.Ref$ObjectRef), (r13v7 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:16:0x0061, B:31:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v4, types: [T, com.huami.pay.service.PayResult] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.huami.pay.service.PayResult] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b1 -> B:30:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loopQueryOrderState(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, boolean r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.huami.pay.service.PayResult> r13) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.pay.lib.web.PayWebApiUseCase.loopQueryOrderState(java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.huami.pay.service.PayResult] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.huami.pay.service.PayResult] */
    @NotNull
    public final PayResult notificationCloud(@NotNull PayNotification notification) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = PayResult.CODE_CLOUD_NOTIFICATION_FAIL;
        int i = 0;
        do {
            i++;
            ?? UploadNotification = this.payWebApi.uploadNotification(notification);
            objectRef.element = UploadNotification;
            if (UploadNotification == PayResult.CODE_SUCCESS) {
                break;
            }
        } while (i < 3);
        HMLog.info(PayConstantsKt.PAY_TAG, new g(objectRef));
        return (PayResult) objectRef.element;
    }
}
