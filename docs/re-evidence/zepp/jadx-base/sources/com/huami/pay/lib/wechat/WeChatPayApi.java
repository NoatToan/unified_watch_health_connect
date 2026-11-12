package com.huami.pay.lib.wechat;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.huami.android.tools.pay.wechat.WeChatPay;
import com.huami.android.tools.pay.wechat.WeChatResponse;
import com.huami.pay.lib.PayApi;
import com.huami.pay.lib.entry.PayOrder;
import com.huami.pay.lib.web.PayWebApiUseCase;
import com.huami.pay.service.PayProgress;
import com.huami.pay.service.PayResult;
import com.huami.pay.service.ProductParam;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/pay/lib/wechat/WeChatPayApi;", "Lcom/huami/pay/lib/PayApi;", "", "a", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/huami/pay/service/ProductParam;", "productParam", "", "pay", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
public final class WeChatPayApi extends PayApi {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pay.lib.wechat.WeChatPayApi$pay$1", f = "WeChatPayApi.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ProductParam c;
        public final /* synthetic */ WeakReference<Activity> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProductParam productParam, WeakReference<Activity> weakReference, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = productParam;
            this.d = weakReference;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeChatPayApi.this.new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            PayResult payResultComponent1;
            String prepaidData;
            int code;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!WeChatPayApi.this.a()) {
                    WeChatPayApi.this.notifyProgress(new PayProgress.PayEnd(PayResult.CODE_WECHAT_NOT_INSTALL));
                    return Unit.INSTANCE;
                }
                WeChatPayApi.this.notifyProgress(PayProgress.GenerateOrder.INSTANCE);
                Pair<PayResult, PayOrder> pairGeneratePayOrder = WeChatPayApi.this.getPayWebApiUseCase().generatePayOrder(this.c);
                payResultComponent1 = pairGeneratePayOrder.component1();
                PayOrder payOrderComponent2 = pairGeneratePayOrder.component2();
                PayResult payResult = PayResult.CODE_SUCCESS;
                if (payResultComponent1 == payResult && payOrderComponent2 != null) {
                    PayOrder.Payment payment = payOrderComponent2.getPayment();
                    if (payment == null || (prepaidData = payment.getPrepaidData()) == null) {
                        payResultComponent1 = null;
                    } else {
                        WeChatPayApi weChatPayApi = WeChatPayApi.this;
                        WeakReference<Activity> weakReference = this.d;
                        weChatPayApi.notifyProgress(PayProgress.Paying.INSTANCE);
                        Activity activity = weakReference.get();
                        if (activity == null || (code = WeChatPay.pay(activity, prepaidData).getCode()) == -2) {
                            payResultComponent1 = PayResult.CODE_WECHAT_CANCEL;
                        } else if (code == -1) {
                            payResultComponent1 = PayResult.CODE_WECHAT_ERROR;
                        } else if (code != 0) {
                            switch (code) {
                                case WeChatResponse.CODE_NOT_INSTALL /* 1048577 */:
                                    payResultComponent1 = PayResult.CODE_WECHAT_NOT_INSTALL;
                                    break;
                                case WeChatResponse.CODE_REQUEST_FAIL /* 1048578 */:
                                    payResultComponent1 = PayResult.CODE_WECHAT_REQUEST_FAIL;
                                    break;
                                case WeChatResponse.CODE_REGISTER_APP_FAIL /* 1048579 */:
                                    payResultComponent1 = PayResult.CODE_WECHAT_REGISTER_APP_FAIL;
                                    break;
                                case WeChatResponse.CODE_SEND_REQUEST_FAIL /* 1048580 */:
                                    payResultComponent1 = PayResult.CODE_WECHAT_SEND_REQUEST_FAIL;
                                    break;
                                default:
                                    payResultComponent1 = PayResult.CODE_WECHAT_UNKNOWN;
                                    break;
                            }
                        } else {
                            payResultComponent1 = payResult;
                        }
                    }
                    if (payResultComponent1 == null) {
                        payResultComponent1 = PayResult.CODE_CLOUD_PAY_RESULT_NULL;
                    }
                }
                if (payResultComponent1 == payResult) {
                    WeChatPayApi.this.notifyProgress(PayProgress.QueryOrderState.INSTANCE);
                    PayWebApiUseCase payWebApiUseCase = WeChatPayApi.this.getPayWebApiUseCase();
                    String userId = this.c.getUserId();
                    String orderId = payOrderComponent2.getOrder().getOrderId();
                    this.a = 1;
                    obj = PayWebApiUseCase.loopQueryOrderState$default(payWebApiUseCase, userId, orderId, false, this, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WeChatPayApi.this.notifyProgress(new PayProgress.PayEnd(payResultComponent1));
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            payResultComponent1 = (PayResult) obj;
            WeChatPayApi.this.notifyProgress(new PayProgress.PayEnd(payResultComponent1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a() {
        try {
            return getApplicationContext().getPackageManager().getPackageInfo("com.tencent.mm", 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.huami.pay.lib.PayApi
    public void pay(@NotNull WeakReference<Activity> weakReferenceActivity, @NotNull ProductParam productParam) {
        e.f(getScope(), null, null, new a(productParam, weakReferenceActivity, null), 3, null);
    }
}
