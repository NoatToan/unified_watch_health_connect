package com.huami.pay.lib.ali;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.huami.android.tools.pay.ali.AliPay;
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
import kotlin.text.l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/huami/pay/lib/ali/AliPayApi;", "Lcom/huami/pay/lib/PayApi;", "", "prepaidData", "a", "", "b", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakReferenceActivity", "Lcom/huami/pay/service/ProductParam;", "productParam", "", "pay", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
public final class AliPayApi extends PayApi {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pay.lib.ali.AliPayApi$pay$1", f = "AliPayApi.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
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
            return AliPayApi.this.new a(this.c, this.d, continuation);
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
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!AliPayApi.this.b()) {
                    AliPayApi.this.notifyProgress(new PayProgress.PayEnd(PayResult.CODE_ALI_UNINSTALL));
                    return Unit.INSTANCE;
                }
                AliPayApi.this.notifyProgress(PayProgress.GenerateOrder.INSTANCE);
                Pair<PayResult, PayOrder> pairGeneratePayOrder = AliPayApi.this.getPayWebApiUseCase().generatePayOrder(this.c);
                payResultComponent1 = pairGeneratePayOrder.component1();
                PayOrder payOrderComponent2 = pairGeneratePayOrder.component2();
                PayResult payResult = PayResult.CODE_SUCCESS;
                if (payResultComponent1 == payResult && payOrderComponent2 != null) {
                    PayOrder.Payment payment = payOrderComponent2.getPayment();
                    if (payment == null || (prepaidData = payment.getPrepaidData()) == null) {
                        payResultComponent1 = null;
                    } else {
                        AliPayApi aliPayApi = AliPayApi.this;
                        WeakReference<Activity> weakReference = this.d;
                        aliPayApi.notifyProgress(PayProgress.Paying.INSTANCE);
                        AliPay aliPay = new AliPay();
                        Activity activity = weakReference.get();
                        if (activity == null) {
                            payResultComponent1 = PayResult.CODE_WECHAT_CANCEL;
                        } else {
                            Integer intOrNull = l.toIntOrNull(aliPay.pay(activity, aliPayApi.a(prepaidData)).getCode());
                            int code = intOrNull == null ? PayResult.CODE_ALI_UNKNOWN_OTHER.getCode() : intOrNull.intValue();
                            if (code == 4000) {
                                payResultComponent1 = PayResult.CODE_ALI_FAILED;
                            } else if (code == 5000) {
                                payResultComponent1 = PayResult.CODE_ALI_REPEAT;
                            } else if (code == 6004) {
                                payResultComponent1 = PayResult.CODE_ALI_UNKNOWN;
                            } else if (code == 6006) {
                                payResultComponent1 = PayResult.CODE_ALI_UNKNOWN_CURRENT;
                            } else if (code == 8000) {
                                payResultComponent1 = PayResult.CODE_ALI_PROCESSING;
                            } else if (code == 9000) {
                                payResultComponent1 = payResult;
                            } else if (code != 6001) {
                                payResultComponent1 = code != 6002 ? PayResult.CODE_ALI_UNKNOWN_OTHER : PayResult.CODE_ALI_NET_ERROR;
                            } else {
                                payResultComponent1 = PayResult.CODE_ALI_CANCEL;
                            }
                        }
                    }
                    if (payResultComponent1 == null) {
                        payResultComponent1 = PayResult.CODE_CLOUD_PAY_RESULT_NULL;
                    }
                }
                if (payResultComponent1 == payResult) {
                    AliPayApi.this.notifyProgress(PayProgress.QueryOrderState.INSTANCE);
                    PayWebApiUseCase payWebApiUseCase = AliPayApi.this.getPayWebApiUseCase();
                    String userId = this.c.getUserId();
                    String orderId = payOrderComponent2.getOrder().getOrderId();
                    this.a = 1;
                    obj = PayWebApiUseCase.loopQueryOrderState$default(payWebApiUseCase, userId, orderId, false, this, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                AliPayApi.this.notifyProgress(new PayProgress.PayEnd(payResultComponent1));
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            payResultComponent1 = (PayResult) obj;
            AliPayApi.this.notifyProgress(new PayProgress.PayEnd(payResultComponent1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(String prepaidData) {
        try {
            String string = new JSONObject(prepaidData).get("data").toString();
            if (!(string.length() > 0)) {
                string = null;
            }
            return string == null ? prepaidData : string;
        } catch (Exception unused) {
            return prepaidData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b() {
        try {
            return getApplicationContext().getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.huami.pay.lib.PayApi
    public void pay(@NotNull WeakReference<Activity> weakReferenceActivity, @NotNull ProductParam productParam) {
        e.f(getScope(), null, null, new a(productParam, weakReferenceActivity, null), 3, null);
    }
}
