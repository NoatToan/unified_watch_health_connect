package com.xiaomi.fitness.pay.result;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.pay.channel.PayChannelActivity;
import com.xiaomi.fitness.pay.channel.PayChannelViewModel;
import com.xiaomi.fitness.pay.export.PayManagerExtKt;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.pay.export.data.response.MibiPayError;
import com.xiaomi.fitness.pay.export.data.response.MibiPayResult;
import com.xiaomi.fitness.pay.export.data.response.OrderInfo;
import com.xiaomi.fitness.pay.export.data.response.OrderInfoResponse;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import com.xiaomi.fitness.pay.result.PayResultActivity;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.onetrack.OneTrack;
import defpackage.jv1;
import defpackage.lnh;
import defpackage.ori;
import defpackage.r0j;
import defpackage.tji;
import defpackage.uui;
import defpackage.yni;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0007\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001DB\u0007¢\u0006\u0004\bC\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ#\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010\nJ\u000f\u0010&\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010\nR\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0016\u00103\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010;\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010(R\u0016\u0010=\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010(R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010@\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010:R\u0014\u0010B\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010:¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/pay/result/PayResultActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/pay/result/PayResultViewModel;", "Llnh;", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfoResponse;", "orderInfoResponse", "", "initDataBinding", "(Lcom/xiaomi/fitness/pay/export/data/response/OrderInfoResponse;)V", "setListener", "()V", "payChannel", "onPaymentProcessFinish", "", "needLoop", "", "loopCount", "checkOrderStatus", "(ZI)V", "index", "", "fibonacci", "(I)J", "signWatchFace", "code", "isCancelByUser", "(I)Z", "success", "trackExpose", "(Z)V", "type", "trackClick", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "onBackPressed", "inPaymentProgress", "Z", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "", "channel", "Ljava/lang/String;", "payParams", Constants.KEY_PRICE, "I", "orderId", "orderStartStamp", "J", "trackBundle", "Landroid/os/Bundle;", "payType$delegate", "Lkotlin/Lazy;", "getPayType", "()I", TSMAuthContants.PARAM_PAY_TYPE, "payFromVip", "paymentSuccess", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfoResponse;", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPayResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayResultActivity.kt\ncom/xiaomi/fitness/pay/result/PayResultActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n295#2,2:355\n295#2,2:357\n*S KotlinDebug\n*F\n+ 1 PayResultActivity.kt\ncom/xiaomi/fitness/pay/result/PayResultActivity\n*L\n281#1:355,2\n312#1:357,2\n*E\n"})
public final class PayResultActivity extends Hilt_PayResultActivity<PayResultViewModel, lnh> {

    @NotNull
    public static final String ORDER_START_TIMESTAMP = "order_start_timestamp";

    @NotNull
    public static final String PAYMENT_RESULT = "payment_result";

    @NotNull
    private static final String TAG = "PayResultFragment";
    private static final int USER_CANCEL_ALIPAY = 9808;
    private static final int USER_CANCEL_BACK_PRESSED = 9806;
    private static final int USER_CANCEL_MIPAY = 9804;
    private static final int USER_CANCEL_WXPAY = 9809;
    private boolean inPaymentProgress;

    @Nullable
    private OrderInfoResponse orderInfoResponse;
    private long orderStartStamp;
    private boolean payFromVip;
    private boolean paymentSuccess;
    private int price;

    @Nullable
    private Bundle trackBundle;

    @NotNull
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private String channel = "";

    @NotNull
    private String payParams = "";

    @NotNull
    private String orderId = "";

    /* JADX INFO: renamed from: payType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy payType = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: coh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(PayResultActivity.payType_delegate$lambda$0(this.f5599a));
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.result.PayResultActivity$checkOrderStatus$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.result.PayResultActivity$checkOrderStatus$1", f = "PayResultActivity.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $loopCount;
        final /* synthetic */ boolean $needLoop;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$needLoop = z;
            this.$loopCount = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(final PayResultActivity payResultActivity, boolean z, final int i, Boolean bool) {
            if (bool != null) {
                Logger.i(PayResultActivity.TAG, "checkPayResponse: " + bool);
                if (bool.booleanValue()) {
                    payResultActivity.trackExpose(true);
                    payResultActivity.dismissDialogForce();
                    PayResultActivity.access$getMViewModel(payResultActivity).stopTimer();
                    PayResultActivity.access$getMViewModel(payResultActivity).processOrderStatus(OrderStatus.PAYMENT_SUCCESS);
                    payResultActivity.paymentSuccess = true;
                    if (z) {
                        payResultActivity.signWatchFace();
                    }
                } else {
                    PayResultActivity.access$getMViewModel(payResultActivity).processOrderStatus(OrderStatus.IN_PAYMENT);
                    payResultActivity.paymentSuccess = false;
                    if (z) {
                        payResultActivity.mHandler.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.pay.result.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                PayResultActivity.AnonymousClass1.invokeSuspend$lambda$2$lambda$0(payResultActivity, i);
                            }
                        }, payResultActivity.fibonacci(i + 1));
                    }
                }
            } else {
                payResultActivity.paymentSuccess = false;
                Logger.i(PayResultActivity.TAG, "checkPayResponse fail");
                PayResultActivity.access$getMViewModel(payResultActivity).processOrderStatus(OrderStatus.IN_PAYMENT);
                if (z) {
                    payResultActivity.mHandler.postDelayed(new Runnable() { // from class: com.xiaomi.fitness.pay.result.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            PayResultActivity.AnonymousClass1.invokeSuspend$lambda$2$lambda$1(payResultActivity, i);
                        }
                    }, payResultActivity.fibonacci(i + 1));
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2$lambda$0(PayResultActivity payResultActivity, int i) {
            payResultActivity.checkOrderStatus(true, i + 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2$lambda$1(PayResultActivity payResultActivity, int i) {
            payResultActivity.checkOrderStatus(true, i + 1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PayResultActivity.this.new AnonymousClass1(this.$needLoop, this.$loopCount, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PayResultViewModel payResultViewModelAccess$getMViewModel = PayResultActivity.access$getMViewModel(PayResultActivity.this);
                String str = PayResultActivity.this.orderId;
                final PayResultActivity payResultActivity = PayResultActivity.this;
                final boolean z = this.$needLoop;
                final int i2 = this.$loopCount;
                Function1<? super Boolean, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.pay.result.c
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return PayResultActivity.AnonymousClass1.invokeSuspend$lambda$2(payResultActivity, z, i2, (Boolean) obj2);
                    }
                };
                this.label = 1;
                if (payResultViewModelAccess$getMViewModel.checkPayDone(str, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ PayResultViewModel access$getMViewModel(PayResultActivity payResultActivity) {
        return (PayResultViewModel) payResultActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkOrderStatus(boolean needLoop, int loopCount) {
        ScopeExtKt.scopeNetLife$default(this, (Lifecycle.Event) null, (CoroutineDispatcher) null, new AnonymousClass1(needLoop, loopCount, null), 3, (Object) null);
    }

    public static /* synthetic */ void checkOrderStatus$default(PayResultActivity payResultActivity, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        payResultActivity.checkOrderStatus(z, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long fibonacci(int index) {
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i < index) {
            i3 = i4 + i2;
            i++;
            i4 = i2;
            i2 = i3;
        }
        return ((long) i3) * ((long) 1000);
    }

    private final int getPayType() {
        return ((Number) this.payType.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initDataBinding(OrderInfoResponse orderInfoResponse) {
        OrderInfo orderInfo;
        List<SkuObject> sku_list;
        SkuObject skuObject;
        ((lnh) getMBinding()).B0(this.orderId);
        ((lnh) getMBinding()).E0(TimeDateUtil.getDateYYYYMMDDHHmmssLocalFormat(this.orderStartStamp / ((long) 1000)));
        ((lnh) getMBinding()).D0(getString(r0j.d, Float.valueOf(this.price / 100.0f)));
        if (orderInfoResponse == null || (orderInfo = orderInfoResponse.getOrderInfo()) == null || (sku_list = orderInfo.getSku_list()) == null || (skuObject = sku_list.get(0)) == null) {
            return;
        }
        ((lnh) getMBinding()).C0(skuObject.getPic_url());
        ((lnh) getMBinding()).A0(skuObject.getSku_name());
    }

    private final boolean isCancelByUser(int code) {
        return code == 0 || code == 9806 || code == 9804 || code == 9808 || code == 9809;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(PayResultActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3$lambda$2(PayResultActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onPaymentProcessFinish();
        this$0.trackClick(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$4(PayResultActivity this$0, OrderInfoResponse orderInfoResponse) {
        String pay_params;
        OrderInfo orderInfo;
        List<SkuObject> sku_list;
        OrderInfo orderInfo2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.orderInfoResponse = orderInfoResponse;
        if (orderInfoResponse == null || (pay_params = orderInfoResponse.getPay_params()) == null) {
            pay_params = "";
        }
        this$0.payParams = pay_params;
        this$0.price = (orderInfoResponse == null || (orderInfo2 = orderInfoResponse.getOrderInfo()) == null) ? 0 : orderInfo2.getOrder_fee();
        this$0.initDataBinding(orderInfoResponse);
        if (orderInfoResponse == null || (orderInfo = orderInfoResponse.getOrderInfo()) == null || (sku_list = orderInfo.getSku_list()) == null) {
            return Unit.INSTANCE;
        }
        if (!sku_list.isEmpty()) {
            PayResultModel mModel = ((PayResultViewModel) this$0.getMViewModel()).getMModel();
            String sku_name = sku_list.get(0).getSku_name();
            mModel.setSkuName(sku_name != null ? sku_name : "");
        }
        ((PayResultViewModel) this$0.getMViewModel()).getMModel().setCourseVip(this$0.payFromVip);
        return Unit.INSTANCE;
    }

    private final void onPaymentProcessFinish() {
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void payChannel() {
        if (!NetworkExtKt.isNetworkAvailable()) {
            ToastExtKt.toastShort(this, r0j.w);
            return;
        }
        ((PayResultViewModel) getMViewModel()).setPaid(true);
        this.inPaymentProgress = true;
        showLoading();
        PaymentManager.DefaultImpls.payChannel$default(PayManagerExtKt.getInstance(PaymentManager.INSTANCE), this, this.channel, this.payParams, false, false, false, false, new Function3() { // from class: doh
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return PayResultActivity.payChannel$lambda$9(this.f15741a, ((Boolean) obj).booleanValue(), (MibiPayError) obj2, (MibiPayResult) obj3);
            }
        }, 120, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit payChannel$lambda$9(PayResultActivity this$0, boolean z, MibiPayError errorMsg, MibiPayResult mibiPayResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Logger.i(TAG, "MibiPayResult: " + z + " " + errorMsg + " " + mibiPayResult);
        this$0.inPaymentProgress = false;
        if (z) {
            this$0.checkOrderStatus(true, 0);
        } else {
            this$0.trackExpose(false);
            this$0.paymentSuccess = false;
            this$0.dismissDialogForce();
            if (!this$0.isCancelByUser(errorMsg.getCode())) {
                ToastExtKt.toastShort(this$0, r0j.z);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this$0.orderStartStamp;
            ((PayResultViewModel) this$0.getMViewModel()).processOrderStatus(OrderStatus.PAYMENT_FAIL);
            ((PayResultViewModel) this$0.getMViewModel()).startTimer(((long) PayChannelViewModel.ORDER_TIME_COUNT_DOWN) - jCurrentTimeMillis, new Function0() { // from class: eoh
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int payType_delegate$lambda$0(PayResultActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getIntExtra(PayChannelActivity.PAY_TYPE, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setListener() {
        ((lnh) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: foh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayResultActivity.setListener$lambda$6(this.f18001a, view);
            }
        });
        ((lnh) getMBinding()).M.setOnClickListener(new View.OnClickListener() { // from class: goh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayResultActivity.setListener$lambda$7(this.f19188a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$6(PayResultActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.inPaymentProgress) {
            return;
        }
        if (!Intrinsics.areEqual(((PayResultViewModel) this$0.getMViewModel()).getMModel().getOrderStatus(), OrderStatus.PAYMENT_SUCCESS)) {
            Bundle bundle = new Bundle();
            bundle.putInt("source", 23);
            Bundle bundle2 = this$0.trackBundle;
            bundle.putInt("utm_source", bundle2 != null ? bundle2.getInt("source") : 0);
            PaymentManager.DefaultImpls.intentToRepay$default(PayManagerExtKt.getInstance(PaymentManager.INSTANCE), this$0, this$0.orderId, false, false, false, this$0.getPayType(), bundle, null, 156, null);
            this$0.finish();
            return;
        }
        if (this$0.payFromVip) {
            int payType = this$0.getPayType();
            if (payType == 2) {
                this$0.trackClick(1);
            } else if (payType == 3) {
                this$0.trackClick(1);
                MainExtKt.showTabWithIndex(this$0, MainTab.INSTANCE.getINDEX_SPORT());
            }
        } else {
            this$0.trackClick(1);
            FaceHelper.DefaultImpls.gotoFacePage$default(FaceHelperExtKt.getInstance(FaceHelper.INSTANCE), this$0, null, 2, null);
        }
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(PayResultActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.trackClick(0);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void signWatchFace() {
        OrderInfo orderInfo;
        List<SkuObject> sku_list;
        Logger.i(TAG, "signWatchFace");
        OrderInfoResponse orderInfoResponse = this.orderInfoResponse;
        if (orderInfoResponse == null || (orderInfo = orderInfoResponse.getOrderInfo()) == null || (sku_list = orderInfo.getSku_list()) == null) {
            return;
        }
        for (SkuObject skuObject : sku_list) {
            Integer product_category = skuObject.getProduct_category();
            if (product_category != null && product_category.intValue() == 1) {
                Logger.i(TAG, "pay success, sign: " + skuObject.getProduct_id());
                FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).signWatchFace(skuObject.getProduct_id());
            }
        }
    }

    private final void trackClick(int type) {
        OrderInfo orderInfo;
        List<SkuObject> sku_list;
        Object next;
        String model;
        String firmwareVersion;
        String string;
        int payType = getPayType();
        String str = "";
        if (payType != 1) {
            if (payType == 2 || payType == 3) {
                IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.0.0.0.40477");
                Object[] objArr = new Object[12];
                objArr[0] = "name";
                objArr[1] = "Class_pay";
                objArr[2] = "asset_id";
                Bundle bundle = this.trackBundle;
                objArr[3] = String.valueOf(bundle != null ? bundle.getLong("courseId") : 0L);
                objArr[4] = OneTrack.Param.ASSET_NAME;
                Bundle bundle2 = this.trackBundle;
                if (bundle2 != null && (string = bundle2.getString("name")) != null) {
                    str = string;
                }
                objArr[5] = str;
                objArr[6] = "source";
                Bundle bundle3 = this.trackBundle;
                objArr[7] = Integer.valueOf(bundle3 != null ? bundle3.getInt("courseSource") : 0);
                objArr[8] = "test_type";
                objArr[9] = Integer.valueOf(type);
                objArr[10] = Constants.KEY_PRICE;
                objArr[11] = Integer.valueOf(this.price);
                oneTrackExtKt.reportData(oneTrackStatBean, objArr);
                return;
            }
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        OrderInfoResponse orderInfoResponse = this.orderInfoResponse;
        if (orderInfoResponse == null || (orderInfo = orderInfoResponse.getOrderInfo()) == null || (sku_list = orderInfo.getSku_list()) == null) {
            return;
        }
        Iterator<T> it = sku_list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer product_category = ((SkuObject) next).getProduct_category();
            if (product_category != null && product_category.intValue() == 1) {
                break;
            }
        }
        SkuObject skuObject = (SkuObject) next;
        if (skuObject == null) {
            return;
        }
        IOnetrack oneTrackExtKt2 = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean2 = new OneTrackStatBean("click_v3", "56.106.0.1.39953");
        Object[] objArr2 = new Object[14];
        objArr2[0] = "name";
        objArr2[1] = "watchface_pay";
        objArr2[2] = "asset_id";
        String product_id = skuObject.getProduct_id();
        if (product_id == null) {
            product_id = "";
        }
        objArr2[3] = product_id;
        objArr2[4] = OneTrack.Param.ASSET_NAME;
        String sku_name = skuObject.getSku_name();
        if (sku_name == null) {
            sku_name = "";
        }
        objArr2[5] = sku_name;
        objArr2[6] = "test_type";
        objArr2[7] = Integer.valueOf(type);
        objArr2[8] = Constants.KEY_PRICE;
        objArr2[9] = Integer.valueOf(this.price);
        objArr2[10] = "device_model";
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr2[11] = model;
        objArr2[12] = "device_version";
        if (wearableDeviceModel != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel)) != null) {
            str = firmwareVersion;
        }
        objArr2[13] = str;
        oneTrackExtKt2.reportData(oneTrackStatBean2, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackExpose(boolean success) {
        OrderInfo orderInfo;
        List<SkuObject> sku_list;
        Object next;
        String model;
        String firmwareVersion;
        String string;
        int payType = getPayType();
        String str = "";
        if (payType != 1) {
            if (payType == 2 || payType == 3) {
                IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("expose_v3", "56.0.0.0.40473");
                Object[] objArr = new Object[12];
                objArr[0] = "name";
                objArr[1] = "Class_pay";
                objArr[2] = "asset_id";
                Bundle bundle = this.trackBundle;
                objArr[3] = String.valueOf(bundle != null ? bundle.getLong("courseId") : 0L);
                objArr[4] = OneTrack.Param.ASSET_NAME;
                Bundle bundle2 = this.trackBundle;
                if (bundle2 != null && (string = bundle2.getString("name")) != null) {
                    str = string;
                }
                objArr[5] = str;
                objArr[6] = "source";
                Bundle bundle3 = this.trackBundle;
                objArr[7] = Integer.valueOf(bundle3 != null ? bundle3.getInt("courseSource") : 0);
                objArr[8] = "result";
                objArr[9] = Boolean.valueOf(success);
                objArr[10] = Constants.KEY_PRICE;
                objArr[11] = Integer.valueOf(this.price);
                oneTrackExtKt.reportData(oneTrackStatBean, objArr);
                return;
            }
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        OrderInfoResponse orderInfoResponse = this.orderInfoResponse;
        if (orderInfoResponse == null || (orderInfo = orderInfoResponse.getOrderInfo()) == null || (sku_list = orderInfo.getSku_list()) == null) {
            return;
        }
        Iterator<T> it = sku_list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer product_category = ((SkuObject) next).getProduct_category();
            if (product_category != null && product_category.intValue() == 1) {
                break;
            }
        }
        SkuObject skuObject = (SkuObject) next;
        if (skuObject == null) {
            return;
        }
        IOnetrack oneTrackExtKt2 = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean2 = new OneTrackStatBean("expose_v3", "56.106.0.1.39955");
        Object[] objArr2 = new Object[12];
        objArr2[0] = "name";
        objArr2[1] = "watchface_pay";
        objArr2[2] = "asset_id";
        String product_id = skuObject.getProduct_id();
        if (product_id == null) {
            product_id = "";
        }
        objArr2[3] = product_id;
        objArr2[4] = OneTrack.Param.ASSET_NAME;
        String sku_name = skuObject.getSku_name();
        if (sku_name == null) {
            sku_name = "";
        }
        objArr2[5] = sku_name;
        objArr2[6] = "result";
        objArr2[7] = Boolean.valueOf(success);
        objArr2[8] = "device_model";
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr2[9] = model;
        objArr2[10] = "device_version";
        if (wearableDeviceModel != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel)) != null) {
            str = firmwareVersion;
        }
        objArr2[11] = str;
        oneTrackExtKt2.reportData(oneTrackStatBean2, objArr2);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return uui.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return jv1.g;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        trackClick(3);
        onPaymentProcessFinish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.pay.result.Hilt_PayResultActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        super.onCreate(savedInstanceState);
        String str = "";
        setTitle("");
        setActionBarNormalTitleMode();
        setTitleBackground(tji.c);
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, yni.f40346a, null, new View.OnClickListener() { // from class: hoh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayResultActivity.onCreate$lambda$1(this.f20292a, view);
            }
        }, 5, null);
        Intent intent = getIntent();
        this.orderStartStamp = intent != null ? intent.getLongExtra(ORDER_START_TIMESTAMP, 0L) : 0L;
        Intent intent2 = getIntent();
        if (intent2 == null || (stringExtra = intent2.getStringExtra("order_id")) == null) {
            stringExtra = "";
        }
        this.orderId = stringExtra;
        Intent intent3 = getIntent();
        if (intent3 == null || (stringExtra2 = intent3.getStringExtra("pay_channel")) == null) {
            stringExtra2 = "WXPAY";
        }
        this.channel = stringExtra2;
        Intent intent4 = getIntent();
        if (intent4 != null && (stringExtra3 = intent4.getStringExtra(PayChannelActivity.PAY_PARAMS)) != null) {
            str = stringExtra3;
        }
        this.payParams = str;
        Intent intent5 = getIntent();
        this.trackBundle = intent5 != null ? intent5.getBundleExtra(PayChannelActivity.PAY_TRACK_BUNDLE) : null;
        int payType = getPayType();
        boolean z = false;
        if (2 <= payType && payType < 5) {
            z = true;
        }
        this.payFromVip = z;
        View viewInflate = LayoutInflater.from(this).inflate(uui.h, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(ori.C);
        textView.setText(r0j.common_complete);
        textView.setOnClickListener(new View.OnClickListener() { // from class: ioh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayResultActivity.onCreate$lambda$3$lambda$2(this.f21946a, view);
            }
        });
        Intrinsics.checkNotNull(viewInflate);
        setEndView(viewInflate);
        if (!((PayResultViewModel) getMViewModel()).getPaid()) {
            payChannel();
        }
        ((PayResultViewModel) getMViewModel()).getOrderInfo(this.orderId);
        ((PayResultViewModel) getMViewModel()).getOrderInfo().observe(this, new PayResultActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: joh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayResultActivity.onCreate$lambda$4(this.f22977a, (OrderInfoResponse) obj);
            }
        }));
        setListener();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.inPaymentProgress) {
            checkOrderStatus$default(this, false, 0, 3, null);
        }
    }
}
