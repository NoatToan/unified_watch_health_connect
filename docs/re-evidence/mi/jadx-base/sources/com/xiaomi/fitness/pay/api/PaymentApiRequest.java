package com.xiaomi.fitness.pay.api;

import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.pay.api.PaymentApiRequest;
import com.xiaomi.fitness.pay.export.PaymentOrderType;
import com.xiaomi.fitness.pay.export.data.request.CheckPayResult;
import com.xiaomi.fitness.pay.export.data.request.CreateOrderRequest;
import com.xiaomi.fitness.pay.export.data.request.OrderInfoRequest;
import com.xiaomi.fitness.pay.export.data.request.OrderPageListRequest;
import com.xiaomi.fitness.pay.export.data.request.PayChannelRequest;
import com.xiaomi.fitness.pay.export.data.response.CheckPayResponse;
import com.xiaomi.fitness.pay.export.data.response.OrderInfoResponse;
import com.xiaomi.fitness.pay.export.data.response.OrderPageResponse;
import com.xiaomi.fitness.pay.export.data.response.PayChannelResponse;
import com.xiaomi.fitness.pay.export.data.response.SyncAuthorizationResponse;
import dagger.hilt.android.EntryPointAccessors;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004Ja\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2(\u0010\u000b\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00060\u000fj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r`\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\u0002`\u0011¢\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0016JI\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00060\u000fj\b\u0012\u0004\u0012\u00020\u001a`\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\u0002`\u0011¢\u0006\u0002\u0010\u001bJV\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u000fj\b\u0012\u0004\u0012\u00020\u001e`\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\u0002`\u0011H\u0086@¢\u0006\u0002\u0010\u001fJl\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010$\u001a\u00020\b2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00060\u000fj\b\u0012\u0004\u0012\u00020%`\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\u0002`\u0011H\u0086@¢\u0006\u0002\u0010&JL\u0010'\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000e2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00060\u000fj\b\u0012\u0004\u0012\u00020\u001a`\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\u0002`\u0011H\u0086@¢\u0006\u0002\u0010(J\u0016\u0010'\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010)JD\u0010*\u001a\u00020\u00062\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u000fj\b\u0012\u0004\u0012\u00020\n`\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\u0002`\u0011H\u0086@¢\u0006\u0002\u0010+¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/pay/api/PaymentApiRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/pay/api/PaymentApiService;", "<init>", "()V", "getPayChannel", "", TSMAuthContants.PARAM_PAY_TYPE, "", PaymentOrderType.DEDUCT, "", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "", "Lkotlin/Function1;", "fail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(IZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getPayChannelSync", "Lcom/xiaomi/fitness/pay/export/data/response/PayChannelResponse;", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createOrder", "param", "Lcom/xiaomi/fitness/pay/export/data/request/CreateOrderRequest;", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfoResponse;", "(Lcom/xiaomi/fitness/pay/export/data/request/CreateOrderRequest;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "checkPay", "orderId", "Lcom/xiaomi/fitness/pay/export/data/response/CheckPayResponse;", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderPageList", "nextKey", "limit", "categoryId", "productCategory", "Lcom/xiaomi/fitness/pay/export/data/response/OrderPageResponse;", "(Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderInfo", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncAuthorization", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPaymentApiRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentApiRequest.kt\ncom/xiaomi/fitness/pay/api/PaymentApiRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,125:1\n89#2,5:126\n141#2:131\n89#2,5:135\n89#2,5:140\n89#2,5:145\n89#2,5:150\n141#2:155\n89#2,5:159\n31#3:132\n28#3,2:133\n31#3:156\n28#3,2:157\n*S KotlinDebug\n*F\n+ 1 PaymentApiRequest.kt\ncom/xiaomi/fitness/pay/api/PaymentApiRequest\n*L\n23#1:126,5\n35#1:131\n51#1:135,5\n69#1:140,5\n89#1:145,5\n106#1:150,5\n114#1:155\n118#1:159,5\n35#1:132\n35#1:133,2\n114#1:156\n114#1:157,2\n*E\n"})
public final class PaymentApiRequest extends BaseRequest<PaymentApiService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.api.PaymentApiRequest$checkPay$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/pay/export/data/response/CheckPayResponse;", "it", "Lcom/xiaomi/fitness/pay/api/PaymentApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.api.PaymentApiRequest$checkPay$2", f = "PaymentApiRequest.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<PaymentApiService, Continuation<? super BaseResult<CheckPayResponse>>, Object> {
        final /* synthetic */ String $orderId;
        final /* synthetic */ int $payType;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$orderId = str;
            this.$payType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = PaymentApiRequest.this.new AnonymousClass2(this.$orderId, this.$payType, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentApiService paymentApiService, Continuation<? super BaseResult<CheckPayResponse>> continuation) {
            return ((AnonymousClass2) create(paymentApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentApiService paymentApiService = (PaymentApiService) this.L$0;
                String json = PaymentApiRequest.this.getMGson().toJson(new CheckPayResult(this.$orderId, this.$payType));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = paymentApiService.checkPay(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.api.PaymentApiRequest$createOrder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfoResponse;", "it", "Lcom/xiaomi/fitness/pay/api/PaymentApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.api.PaymentApiRequest$createOrder$1", f = "PaymentApiRequest.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PaymentApiService, Continuation<? super BaseResult<OrderInfoResponse>>, Object> {
        final /* synthetic */ CreateOrderRequest $param;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CreateOrderRequest createOrderRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$param = createOrderRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = PaymentApiRequest.this.new AnonymousClass1(this.$param, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentApiService paymentApiService, Continuation<? super BaseResult<OrderInfoResponse>> continuation) {
            return ((AnonymousClass1) create(paymentApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentApiService paymentApiService = (PaymentApiService) this.L$0;
                String json = PaymentApiRequest.this.getMGson().toJson(this.$param);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = paymentApiService.createOrder(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.api.PaymentApiRequest$getOrderInfo$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfoResponse;", "it", "Lcom/xiaomi/fitness/pay/api/PaymentApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.api.PaymentApiRequest$getOrderInfo$2", f = "PaymentApiRequest.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27352 extends SuspendLambda implements Function2<PaymentApiService, Continuation<? super BaseResult<OrderInfoResponse>>, Object> {
        final /* synthetic */ String $orderId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27352(String str, Continuation<? super C27352> continuation) {
            super(2, continuation);
            this.$orderId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27352 c27352 = PaymentApiRequest.this.new C27352(this.$orderId, continuation);
            c27352.L$0 = obj;
            return c27352;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentApiService paymentApiService, Continuation<? super BaseResult<OrderInfoResponse>> continuation) {
            return ((C27352) create(paymentApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentApiService paymentApiService = (PaymentApiService) this.L$0;
                String json = PaymentApiRequest.this.getMGson().toJson(new OrderInfoRequest(this.$orderId));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = paymentApiService.getOrderInfo(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.api.PaymentApiRequest$getOrderInfo$4, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.api.PaymentApiRequest", f = "PaymentApiRequest.kt", i = {}, l = {114}, m = "getOrderInfo", n = {}, s = {})
    public static final class AnonymousClass4 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiRequest.this.getOrderInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.api.PaymentApiRequest$getOrderPageList$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/pay/export/data/response/OrderPageResponse;", "it", "Lcom/xiaomi/fitness/pay/api/PaymentApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.api.PaymentApiRequest$getOrderPageList$2", f = "PaymentApiRequest.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27362 extends SuspendLambda implements Function2<PaymentApiService, Continuation<? super BaseResult<OrderPageResponse>>, Object> {
        final /* synthetic */ String $categoryId;
        final /* synthetic */ int $limit;
        final /* synthetic */ String $nextKey;
        final /* synthetic */ int $productCategory;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27362(String str, int i, String str2, int i2, Continuation<? super C27362> continuation) {
            super(2, continuation);
            this.$nextKey = str;
            this.$limit = i;
            this.$categoryId = str2;
            this.$productCategory = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27362 c27362 = PaymentApiRequest.this.new C27362(this.$nextKey, this.$limit, this.$categoryId, this.$productCategory, continuation);
            c27362.L$0 = obj;
            return c27362;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentApiService paymentApiService, Continuation<? super BaseResult<OrderPageResponse>> continuation) {
            return ((C27362) create(paymentApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentApiService paymentApiService = (PaymentApiService) this.L$0;
                String json = PaymentApiRequest.this.getMGson().toJson(new OrderPageListRequest(this.$nextKey, this.$limit, this.$categoryId, this.$productCategory));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = paymentApiService.getOrderPageList(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.api.PaymentApiRequest$getPayChannel$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/pay/export/data/response/PayChannelResponse;", "it", "Lcom/xiaomi/fitness/pay/api/PaymentApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.api.PaymentApiRequest$getPayChannel$1", f = "PaymentApiRequest.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27371 extends SuspendLambda implements Function2<PaymentApiService, Continuation<? super BaseResult<PayChannelResponse>>, Object> {
        final /* synthetic */ boolean $deduct;
        final /* synthetic */ int $payType;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27371(int i, boolean z, Continuation<? super C27371> continuation) {
            super(2, continuation);
            this.$payType = i;
            this.$deduct = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27371 c27371 = PaymentApiRequest.this.new C27371(this.$payType, this.$deduct, continuation);
            c27371.L$0 = obj;
            return c27371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentApiService paymentApiService, Continuation<? super BaseResult<PayChannelResponse>> continuation) {
            return ((C27371) create(paymentApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentApiService paymentApiService = (PaymentApiService) this.L$0;
                String json = PaymentApiRequest.this.getMGson().toJson(new PayChannelRequest(this.$payType, this.$deduct));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = paymentApiService.getPayChannel(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.api.PaymentApiRequest$getPayChannelSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.api.PaymentApiRequest", f = "PaymentApiRequest.kt", i = {}, l = {35}, m = "getPayChannelSync", n = {}, s = {})
    public static final class C27381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27381(Continuation<? super C27381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentApiRequest.this.getPayChannelSync(0, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.api.PaymentApiRequest$syncAuthorization$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/pay/export/data/response/SyncAuthorizationResponse;", "it", "Lcom/xiaomi/fitness/pay/api/PaymentApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.api.PaymentApiRequest$syncAuthorization$2", f = "PaymentApiRequest.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27392 extends SuspendLambda implements Function2<PaymentApiService, Continuation<? super BaseResult<SyncAuthorizationResponse>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C27392(Continuation<? super C27392> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27392 c27392 = new C27392(continuation);
            c27392.L$0 = obj;
            return c27392;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentApiService paymentApiService, Continuation<? super BaseResult<SyncAuthorizationResponse>> continuation) {
            return ((C27392) create(paymentApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentApiService paymentApiService = (PaymentApiService) this.L$0;
                this.label = 1;
                obj = paymentApiService.syncAuthorization("", this);
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

    public static /* synthetic */ Object checkPay$default(PaymentApiRequest paymentApiRequest, String str, int i, Function1 function1, Function1 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return paymentApiRequest.checkPay(str, i, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPay$lambda$2(Function1 success, CheckPayResponse it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createOrder$lambda$1(Function1 success, OrderInfoResponse it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOrderInfo$lambda$4(Function1 success, OrderInfoResponse it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOrderPageList$lambda$3(Function1 success, OrderPageResponse it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPayChannel$default(PaymentApiRequest paymentApiRequest, int i, boolean z, Function1 function1, Function1 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        paymentApiRequest.getPayChannel(i, z, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPayChannel$lambda$0(Function1 fail, Function1 success, PayChannelResponse it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getPay_channel_list().isEmpty()) {
            fail.invoke2(ApiException.INSTANCE.getEMPTY());
        } else {
            success.invoke2(it.getPay_channel_list());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object getPayChannelSync$default(PaymentApiRequest paymentApiRequest, int i, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return paymentApiRequest.getPayChannelSync(i, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncAuthorization$lambda$5(Function1 success, SyncAuthorizationResponse it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(Boolean.valueOf(it.getSuccess()));
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object checkPay(@NotNull String str, int i, @NotNull final Function1<? super CheckPayResponse, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(str, i, null)).error(function2).success(new Function1() { // from class: dph
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaymentApiRequest.checkPay$lambda$2(function1, (CheckPayResponse) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public final void createOrder(@NotNull CreateOrderRequest param, @NotNull final Function1<? super OrderInfoResponse, Unit> success, @NotNull Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(param, null)).error(fail).success(new Function1() { // from class: cph
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaymentApiRequest.createOrder$lambda$1(success, (OrderInfoResponse) obj);
            }
        });
    }

    @Nullable
    public final Object getOrderInfo(@NotNull String str, @NotNull final Function1<? super OrderInfoResponse, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C27352(str, null)).error(function2).success(new Function1() { // from class: yoh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaymentApiRequest.getOrderInfo$lambda$4(function1, (OrderInfoResponse) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object getOrderPageList(@NotNull String str, int i, @NotNull String str2, int i2, @NotNull final Function1<? super OrderPageResponse, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C27362(str, i, str2, i2, null)).error(function2).success(new Function1() { // from class: aph
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaymentApiRequest.getOrderPageList$lambda$3(function1, (OrderPageResponse) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public final void getPayChannel(int payType, boolean deduct, @NotNull final Function1<? super List<String>, Unit> success, @NotNull final Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C27371(payType, deduct, null)).error(fail).success(new Function1() { // from class: bph
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaymentApiRequest.getPayChannel$lambda$0(fail, success, (PayChannelResponse) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPayChannelSync(int i, boolean z, @NotNull Continuation<? super PayChannelResponse> continuation) {
        C27381 c27381;
        if (continuation instanceof C27381) {
            c27381 = (C27381) continuation;
            int i2 = c27381.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27381.label = i2 - Integer.MIN_VALUE;
            } else {
                c27381 = new C27381(continuation);
            }
        } else {
            c27381 = new C27381(continuation);
        }
        Object payChannel = c27381.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c27381.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(payChannel);
            PaymentApiService mService = getMService();
            String json = getMGson().toJson(new PayChannelRequest(i, z));
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c27381.label = 1;
            payChannel = mService.getPayChannel(json, c27381);
            if (payChannel == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(payChannel);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(payChannel);
    }

    @Nullable
    public final Object syncAuthorization(@NotNull final Function1<? super Boolean, Unit> function1, @NotNull Function1<? super ApiException, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C27392(null)).error(function2).success(new Function1() { // from class: zoh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaymentApiRequest.syncAuthorization$lambda$5(function1, (SyncAuthorizationResponse) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getOrderInfo(@NotNull String str, @NotNull Continuation<? super OrderInfoResponse> continuation) {
        AnonymousClass4 anonymousClass4;
        if (continuation instanceof AnonymousClass4) {
            anonymousClass4 = (AnonymousClass4) continuation;
            int i = anonymousClass4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass4.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass4 = new AnonymousClass4(continuation);
            }
        } else {
            anonymousClass4 = new AnonymousClass4(continuation);
        }
        Object orderInfo = anonymousClass4.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass4.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(orderInfo);
            PaymentApiService mService = getMService();
            String json = getMGson().toJson(new OrderInfoRequest(str));
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            anonymousClass4.label = 1;
            orderInfo = mService.getOrderInfo(json, anonymousClass4);
            if (orderInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(orderInfo);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(orderInfo);
    }
}
