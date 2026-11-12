package com.xiaomi.fitness.pay.dialog;

import android.app.Application;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.exception.export.ExceptionHelper;
import com.xiaomi.fitness.exception.export.ExceptionHelperExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.pay.PaymentPreference;
import com.xiaomi.fitness.pay.api.PaymentApiRequest;
import com.xiaomi.fitness.pay.channel.PayChannelAdapter;
import com.xiaomi.fitness.pay.dialog.DialogPayManager;
import com.xiaomi.fitness.pay.export.PayManagerExtKt;
import com.xiaomi.fitness.pay.export.PaymentConstant;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.pay.export.PaymentOrderType;
import com.xiaomi.fitness.pay.export.PaymentProgressListener;
import com.xiaomi.fitness.pay.export.data.request.CreateOrderRequest;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.pay.export.data.response.CheckPayResponse;
import com.xiaomi.fitness.pay.export.data.response.MibiDeductResult;
import com.xiaomi.fitness.pay.export.data.response.MibiPayError;
import com.xiaomi.fitness.pay.export.data.response.MibiPayResult;
import com.xiaomi.fitness.pay.export.data.response.OrderInfo;
import com.xiaomi.fitness.pay.export.data.response.OrderInfoResponse;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import com.xiaomi.fitness.pay.export.data.response.PayChannelResponse;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.r0j;
import defpackage.tji;
import defpackage.vnh;
import io.sentry.SentryLevel;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jh\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 JT\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 J>\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J>\u0010)\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J@\u0010+\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010'\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010-\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J$\u0010.\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r00H\u0002J@\u00101\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J4\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u0002052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r002\f\u00107\u001a\b\u0012\u0004\u0012\u00020\r08H\u0002J\b\u00109\u001a\u00020\rH\u0002J\u0010\u0010:\u001a\u0002052\u0006\u0010;\u001a\u00020\u0014H\u0002J\u0010\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u0014H\u0002J\u0010\u0010>\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u0014H\u0002J\u0010\u0010?\u001a\u00020\r2\u0006\u0010'\u001a\u00020,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/pay/dialog/DialogPayManager;", "", "<init>", "()V", "mHandler", "Landroid/os/Handler;", "request", "Lcom/xiaomi/fitness/pay/api/PaymentApiRequest;", "getRequest", "()Lcom/xiaomi/fitness/pay/api/PaymentApiRequest;", "countdonwTimer", "Landroid/os/CountDownTimer;", "pay", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "skuList", "", "Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", "promotionId", "", PaymentOrderType.DEDUCT, "", "needDid", "needModel", "needFirmwareVersion", TSMAuthContants.PARAM_PAY_TYPE, "source", "", "trackBundle", "Landroid/os/Bundle;", "callback", "Lcom/xiaomi/fitness/pay/export/PaymentProgressListener;", "repay", "orderId", "realPay", "dialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "channel", TSMAuthContants.PARAM_ORDER_INFO, "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfoResponse;", "realDeduct", "payDialog", "checkOrderStatus", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", "loopCount", "checkPrivacyAgree", "action", "Lkotlin/Function1;", "showPayDialog", "channelList", "startTimer", StatConstants.PARAM_START, "", "tick", StatConstants.PARAM_END, "Lkotlin/Function0;", "stopTimer", "fibonacci", "index", "isCancelByUser", "code", "isSingPaySuccessOnly", "signWatchFace", "TAG", "ORDER_COUNT_TIME", "USER_CANCEL_MIPAY", "USER_CANCEL_BACK_PRESSED", "USER_CANCEL_ALIPAY", "USER_CANCEL_WXPAY", "USER_CANCEL_SIGN_DEDUCT", "SIGN_DEDUCT_CANCEL", "SIGN_DEDUCT_FAILED", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DialogPayManager {
    private static final int ORDER_COUNT_TIME = 900000;
    private static final int SIGN_DEDUCT_CANCEL = 9822;
    private static final int SIGN_DEDUCT_FAILED = 9823;

    @NotNull
    private static final String TAG = "DialogPayManager";
    private static final int USER_CANCEL_ALIPAY = 9808;
    private static final int USER_CANCEL_BACK_PRESSED = 9806;
    private static final int USER_CANCEL_MIPAY = 9804;
    private static final int USER_CANCEL_SIGN_DEDUCT = 9821;
    private static final int USER_CANCEL_WXPAY = 9809;

    @Nullable
    private static CountDownTimer countdonwTimer;

    @NotNull
    public static final DialogPayManager INSTANCE = new DialogPayManager();

    @NotNull
    private static final Handler mHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private static final PaymentApiRequest request = new PaymentApiRequest();

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.dialog.DialogPayManager$checkOrderStatus$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.dialog.DialogPayManager$checkOrderStatus$1", f = "DialogPayManager.kt", i = {}, l = {281}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ PaymentProgressListener $callback;
        final /* synthetic */ int $loopCount;
        final /* synthetic */ OrderInfo $orderInfo;
        final /* synthetic */ CommonDialog<?> $payDialog;
        final /* synthetic */ int $payType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OrderInfo orderInfo, int i, PaymentProgressListener paymentProgressListener, int i2, FragmentActivity fragmentActivity, CommonDialog<?> commonDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$orderInfo = orderInfo;
            this.$payType = i;
            this.$callback = paymentProgressListener;
            this.$loopCount = i2;
            this.$activity = fragmentActivity;
            this.$payDialog = commonDialog;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(final PaymentProgressListener paymentProgressListener, final int i, final OrderInfo orderInfo, final FragmentActivity fragmentActivity, final CommonDialog commonDialog, final int i2, CheckPayResponse checkPayResponse) {
            Logger.i(DialogPayManager.TAG, "checkPayResponse: " + checkPayResponse);
            if (checkPayResponse.getSuccess()) {
                if (paymentProgressListener != null) {
                    paymentProgressListener.onOrderStatus(OrderStatus.PAYMENT_SUCCESS);
                }
                if (paymentProgressListener != null) {
                    paymentProgressListener.onOrderFinish(true);
                }
                if (fragmentActivity instanceof BaseActivity) {
                    ((BaseActivity) fragmentActivity).hideLoading();
                }
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), r0j.Q);
                commonDialog.dismissAllowingStateLoss();
                DialogPayManager dialogPayManager = DialogPayManager.INSTANCE;
                dialogPayManager.stopTimer();
                dialogPayManager.signWatchFace(orderInfo);
            } else {
                if (paymentProgressListener != null) {
                    paymentProgressListener.onOrderStatus(OrderStatus.IN_PAYMENT);
                }
                Handler handler = DialogPayManager.mHandler;
                Runnable runnable = new Runnable() { // from class: com.xiaomi.fitness.pay.dialog.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogPayManager.AnonymousClass1.invokeSuspend$lambda$1$lambda$0(fragmentActivity, commonDialog, orderInfo, i2, i, paymentProgressListener);
                    }
                };
                int i3 = i + 1;
                handler.postDelayed(runnable, DialogPayManager.INSTANCE.fibonacci(i3));
                if (i3 % 3 == 0) {
                    ExceptionHelper.DefaultImpls.uploadEvent$default(ExceptionHelperExtKt.getInstance(ExceptionHelper.INSTANCE), CollectionsKt__CollectionsJVMKt.listOf("HlthCheckoutOrder"), (SentryLevel) null, MapsKt__MapsKt.mapOf(TuplesKt.to("function", "check_order_status"), TuplesKt.to("times", Integer.valueOf(i3)), TuplesKt.to("orderId", orderInfo.getOrder_id())), 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1$lambda$0(FragmentActivity fragmentActivity, CommonDialog commonDialog, OrderInfo orderInfo, int i, int i2, PaymentProgressListener paymentProgressListener) {
            DialogPayManager.INSTANCE.checkOrderStatus(fragmentActivity, commonDialog, orderInfo, i, i2 + 1, paymentProgressListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(final int i, final OrderInfo orderInfo, final FragmentActivity fragmentActivity, final CommonDialog commonDialog, final int i2, final PaymentProgressListener paymentProgressListener, ApiException apiException) {
            Logger.i(DialogPayManager.TAG, "checkPayResponse fail: " + apiException);
            Handler handler = DialogPayManager.mHandler;
            Runnable runnable = new Runnable() { // from class: com.xiaomi.fitness.pay.dialog.d
                @Override // java.lang.Runnable
                public final void run() {
                    DialogPayManager.AnonymousClass1.invokeSuspend$lambda$3$lambda$2(fragmentActivity, commonDialog, orderInfo, i2, i, paymentProgressListener);
                }
            };
            int i3 = i + 1;
            handler.postDelayed(runnable, DialogPayManager.INSTANCE.fibonacci(i3));
            if (i3 % 3 == 0) {
                ExceptionHelper.DefaultImpls.uploadEvent$default(ExceptionHelperExtKt.getInstance(ExceptionHelper.INSTANCE), CollectionsKt__CollectionsJVMKt.listOf("HlthCheckoutOrder"), (SentryLevel) null, MapsKt__MapsKt.mapOf(TuplesKt.to("function", "check_order_status"), TuplesKt.to("times", Integer.valueOf(i3)), TuplesKt.to("orderId", orderInfo.getOrder_id())), 2, (Object) null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3$lambda$2(FragmentActivity fragmentActivity, CommonDialog commonDialog, OrderInfo orderInfo, int i, int i2, PaymentProgressListener paymentProgressListener) {
            DialogPayManager.INSTANCE.checkOrderStatus(fragmentActivity, commonDialog, orderInfo, i, i2 + 1, paymentProgressListener);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$orderInfo, this.$payType, this.$callback, this.$loopCount, this.$activity, this.$payDialog, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentApiRequest request = DialogPayManager.INSTANCE.getRequest();
                String order_id = this.$orderInfo.getOrder_id();
                final int i2 = this.$payType;
                final PaymentProgressListener paymentProgressListener = this.$callback;
                final int i3 = this.$loopCount;
                final OrderInfo orderInfo = this.$orderInfo;
                final FragmentActivity fragmentActivity = this.$activity;
                final CommonDialog<?> commonDialog = this.$payDialog;
                Function1<? super CheckPayResponse, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.pay.dialog.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return DialogPayManager.AnonymousClass1.invokeSuspend$lambda$1(paymentProgressListener, i3, orderInfo, fragmentActivity, commonDialog, i2, (CheckPayResponse) obj2);
                    }
                };
                final int i4 = this.$loopCount;
                final OrderInfo orderInfo2 = this.$orderInfo;
                final FragmentActivity fragmentActivity2 = this.$activity;
                final CommonDialog<?> commonDialog2 = this.$payDialog;
                final int i5 = this.$payType;
                final PaymentProgressListener paymentProgressListener2 = this.$callback;
                Function1<? super ApiException, Unit> function2 = new Function1() { // from class: com.xiaomi.fitness.pay.dialog.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return DialogPayManager.AnonymousClass1.invokeSuspend$lambda$3(i4, orderInfo2, fragmentActivity2, commonDialog2, i5, paymentProgressListener2, (ApiException) obj2);
                    }
                };
                this.label = 1;
                if (request.checkPay(order_id, i2, function1, function2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.dialog.DialogPayManager$repay$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.dialog.DialogPayManager$repay$1", f = "DialogPayManager.kt", i = {1}, l = {177, 178}, m = "invokeSuspend", n = {"channelList"}, s = {"L$0"})
    public static final class C27471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ PaymentProgressListener $callback;
        final /* synthetic */ String $orderId;
        final /* synthetic */ int $payType;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.pay.dialog.DialogPayManager$repay$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.pay.dialog.DialogPayManager$repay$1$1", f = "DialogPayManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FragmentActivity $activity;
            final /* synthetic */ PaymentProgressListener $callback;
            final /* synthetic */ List<String> $channelList;
            final /* synthetic */ OrderInfoResponse $orderInfo;
            final /* synthetic */ int $payType;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07171(FragmentActivity fragmentActivity, List<String> list, OrderInfoResponse orderInfoResponse, int i, PaymentProgressListener paymentProgressListener, Continuation<? super C07171> continuation) {
                super(2, continuation);
                this.$activity = fragmentActivity;
                this.$channelList = list;
                this.$orderInfo = orderInfoResponse;
                this.$payType = i;
                this.$callback = paymentProgressListener;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07171(this.$activity, this.$channelList, this.$orderInfo, this.$payType, this.$callback, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DialogPayManager.INSTANCE.showPayDialog(this.$activity, false, this.$channelList, this.$orderInfo, this.$payType, this.$callback);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.pay.dialog.DialogPayManager$repay$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.pay.dialog.DialogPayManager$repay$1$2", f = "DialogPayManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FragmentActivity $activity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(FragmentActivity fragmentActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$activity = fragmentActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$activity, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ToastExtKt.toastShort(this.$activity, r0j.common_hint_unkonwn_error);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.pay.dialog.DialogPayManager$repay$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.pay.dialog.DialogPayManager$repay$1$3", f = "DialogPayManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FragmentActivity $activity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(FragmentActivity fragmentActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$activity = fragmentActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$activity, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((BaseActivity) this.$activity).hideLoading();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27471(String str, PaymentProgressListener paymentProgressListener, FragmentActivity fragmentActivity, int i, Continuation<? super C27471> continuation) {
            super(2, continuation);
            this.$orderId = str;
            this.$callback = paymentProgressListener;
            this.$activity = fragmentActivity;
            this.$payType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27471(this.$orderId, this.$callback, this.$activity, this.$payType, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005f A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0013, B:25:0x0058, B:27:0x005f, B:28:0x0066, B:30:0x006a, B:31:0x0075, B:15:0x0026, B:21:0x003d, B:18:0x002d), top: B:43:0x0009, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: all -> 0x0018, Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0013, B:25:0x0058, B:27:0x005f, B:28:0x0066, B:30:0x006a, B:31:0x0075, B:15:0x0026, B:21:0x003d, B:18:0x002d), top: B:43:0x0009, outer: #1 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass3 anonymousClass3;
            List<String> list;
            OrderInfoResponse orderInfoResponse;
            PaymentProgressListener paymentProgressListener;
            PaymentProgressListener paymentProgressListener2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            List<String> list2 = (List) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            list = list2;
                        }
                        orderInfoResponse = (OrderInfoResponse) obj;
                        paymentProgressListener = this.$callback;
                        if (paymentProgressListener != null) {
                            paymentProgressListener.onCreateOrder(orderInfoResponse.getOrderInfo());
                        }
                        paymentProgressListener2 = this.$callback;
                        if (paymentProgressListener2 != null) {
                            paymentProgressListener2.onOrderStatus(orderInfoResponse.getOrderInfo().getOrder_status());
                        }
                        AnyExtKt.main$default(null, new C07171(this.$activity, list, orderInfoResponse, this.$payType, this.$callback, null), 1, null);
                        anonymousClass3 = new AnonymousClass3(this.$activity, null);
                        AnyExtKt.main$default(null, anonymousClass3, 1, null);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    PaymentApiRequest request = DialogPayManager.INSTANCE.getRequest();
                    this.label = 1;
                    obj = request.getPayChannelSync(1, false, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    List<String> pay_channel_list = ((PayChannelResponse) obj).getPay_channel_list();
                    PaymentApiRequest request2 = DialogPayManager.INSTANCE.getRequest();
                    String str = this.$orderId;
                    this.L$0 = pay_channel_list;
                    this.label = 2;
                    Object orderInfo = request2.getOrderInfo(str, this);
                    if (orderInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = pay_channel_list;
                    obj = orderInfo;
                    orderInfoResponse = (OrderInfoResponse) obj;
                    paymentProgressListener = this.$callback;
                    if (paymentProgressListener != null) {
                        paymentProgressListener.onCreateOrder(orderInfoResponse.getOrderInfo());
                    }
                    paymentProgressListener2 = this.$callback;
                    if (paymentProgressListener2 != null) {
                        paymentProgressListener2.onOrderStatus(orderInfoResponse.getOrderInfo().getOrder_status());
                    }
                    AnyExtKt.main$default(null, new C07171(this.$activity, list, orderInfoResponse, this.$payType, this.$callback, null), 1, null);
                    anonymousClass3 = new AnonymousClass3(this.$activity, null);
                    AnyExtKt.main$default(null, anonymousClass3, 1, null);
                    return Unit.INSTANCE;
                } catch (Exception e) {
                    PaymentProgressListener paymentProgressListener3 = this.$callback;
                    if (paymentProgressListener3 != null) {
                        paymentProgressListener3.onOrderStatus(OrderStatus.CREATE_FAIL);
                    }
                    e.printStackTrace();
                    AnyExtKt.main$default(null, new AnonymousClass2(this.$activity, null), 1, null);
                    anonymousClass3 = new AnonymousClass3(this.$activity, null);
                }
            } catch (Throwable th) {
                AnyExtKt.main$default(null, new AnonymousClass3(this.$activity, null), 1, null);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private DialogPayManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkOrderStatus(FragmentActivity activity, CommonDialog<?> payDialog, OrderInfo orderInfo, int payType, int loopCount, PaymentProgressListener callback) {
        ScopeExtKt.scopeNet$default(null, new AnonymousClass1(orderInfo, payType, callback, loopCount, activity, payDialog, null), 1, null);
    }

    public static /* synthetic */ void checkOrderStatus$default(DialogPayManager dialogPayManager, FragmentActivity fragmentActivity, CommonDialog commonDialog, OrderInfo orderInfo, int i, int i2, PaymentProgressListener paymentProgressListener, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        dialogPayManager.checkOrderStatus(fragmentActivity, commonDialog, orderInfo, i, i2, paymentProgressListener);
    }

    private final void checkPrivacyAgree(FragmentActivity activity, final Function1<? super Boolean, Unit> action) {
        if (PaymentPreference.INSTANCE.getAGREE_MIBI_PRIVACY()) {
            action.invoke2(Boolean.TRUE);
        } else {
            new CommonDialog.c("").setDialogTitle(r0j.M).setDialogDescriptionString(new DialogParams.DialogDescriptionString(LinkSpanHelper.a(activity, activity.getString(r0j.L, PaymentConstant.PAYMENT_MIBI_PRIVACY_URL, PaymentConstant.PAYMENT_MIBI_USER_URL, PaymentConstant.PAYMENT_MIBI_PRIVACY_URL, PaymentConstant.PAYMENT_MIBI_USER_URL), Integer.valueOf(tji.f34765a), new LinkSpanHelper.a() { // from class: jv6
                @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
                public final void onLinkClicked(View view, String str) {
                    DialogPayManager.checkPrivacyAgree$lambda$6(view, str);
                }
            }))).setPositiveText(r0j.K).setNegativeText(r0j.f32051a).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.pay.dialog.DialogPayManager.checkPrivacyAgree.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        PaymentPreference.INSTANCE.setAGREE_MIBI_PRIVACY(false);
                        action.invoke2(Boolean.FALSE);
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                    PaymentPreference.INSTANCE.setAGREE_MIBI_PRIVACY(true);
                    action.invoke2(Boolean.TRUE);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }).showIfNeed(activity.getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkPrivacyAgree$lambda$6(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
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

    private final boolean isCancelByUser(int code) {
        return code == 0 || code == 9804 || code == 9806 || code == 9808 || code == 9809 || code == 9821 || code == 9822;
    }

    private final boolean isSingPaySuccessOnly(int code) {
        return code == 9823;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit pay$lambda$0(WeakReference activityRef, Ref.ObjectRef channelList, Ref.ObjectRef orderInfoResponse, boolean z, int i, PaymentProgressListener paymentProgressListener, List it) {
        Intrinsics.checkNotNullParameter(activityRef, "$activityRef");
        Intrinsics.checkNotNullParameter(channelList, "$channelList");
        Intrinsics.checkNotNullParameter(orderInfoResponse, "$orderInfoResponse");
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity fragmentActivity = (FragmentActivity) activityRef.get();
        if (fragmentActivity == null) {
            return Unit.INSTANCE;
        }
        channelList.element = it;
        if (orderInfoResponse.element != 0 && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            DialogPayManager dialogPayManager = INSTANCE;
            List<String> list = (List) channelList.element;
            T t = orderInfoResponse.element;
            Intrinsics.checkNotNull(t);
            dialogPayManager.showPayDialog(fragmentActivity, z, list, (OrderInfoResponse) t, i, paymentProgressListener);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pay$lambda$1(WeakReference activityRef, ApiException it) {
        Intrinsics.checkNotNullParameter(activityRef, "$activityRef");
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity fragmentActivity = (FragmentActivity) activityRef.get();
        if (fragmentActivity == null) {
            return Unit.INSTANCE;
        }
        if (fragmentActivity instanceof BaseActivity) {
            ((BaseActivity) fragmentActivity).hideLoading();
        }
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), r0j.common_hint_unkonwn_error);
        ExceptionHelper.DefaultImpls.uploadEvent$default(ExceptionHelperExtKt.getInstance(ExceptionHelper.INSTANCE), CollectionsKt__CollectionsJVMKt.listOf("HlthCheckoutOrder"), (SentryLevel) null, MapsKt__MapsKt.mapOf(TuplesKt.to("function", "get_pay_channel"), TuplesKt.to("code", Integer.valueOf(it.getErrorCode())), TuplesKt.to("message", it.getMessage())), 2, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit pay$lambda$2(PaymentProgressListener paymentProgressListener, Ref.ObjectRef orderInfoResponse, WeakReference activityRef, Ref.ObjectRef channelList, boolean z, int i, OrderInfoResponse it) {
        Intrinsics.checkNotNullParameter(orderInfoResponse, "$orderInfoResponse");
        Intrinsics.checkNotNullParameter(activityRef, "$activityRef");
        Intrinsics.checkNotNullParameter(channelList, "$channelList");
        Intrinsics.checkNotNullParameter(it, "it");
        if (paymentProgressListener != null) {
            paymentProgressListener.onCreateOrder(it.getOrderInfo());
        }
        if (paymentProgressListener != null) {
            paymentProgressListener.onOrderStatus(it.getOrderInfo().getOrder_status());
        }
        orderInfoResponse.element = it;
        FragmentActivity fragmentActivity = (FragmentActivity) activityRef.get();
        if (fragmentActivity == null) {
            return Unit.INSTANCE;
        }
        if ((!((Collection) channelList.element).isEmpty()) && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            DialogPayManager dialogPayManager = INSTANCE;
            List<String> list = (List) channelList.element;
            T t = orderInfoResponse.element;
            Intrinsics.checkNotNull(t);
            dialogPayManager.showPayDialog(fragmentActivity, z, list, (OrderInfoResponse) t, i, paymentProgressListener);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pay$lambda$3(WeakReference activityRef, PaymentProgressListener paymentProgressListener, ApiException it) {
        int i;
        Intrinsics.checkNotNullParameter(activityRef, "$activityRef");
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity fragmentActivity = (FragmentActivity) activityRef.get();
        if (fragmentActivity == null) {
            return Unit.INSTANCE;
        }
        if (fragmentActivity instanceof BaseActivity) {
            ((BaseActivity) fragmentActivity).hideLoading();
        }
        Application application = ApplicationExtKt.getApplication();
        int errorCode = it.getErrorCode();
        if (errorCode != -4004006) {
            switch (errorCode) {
                case OrderInfoResponse.ERROR_CODE_PROMOTION_STOCK_EMPTY /* -4004104 */:
                case OrderInfoResponse.ERROR_CODE_PROMOTION_LIMIT /* -4004103 */:
                    i = r0j.A;
                    break;
                case OrderInfoResponse.ERROR_CODE_PROMOTION_NOT_START /* -4004102 */:
                    i = r0j.x;
                    break;
                case OrderInfoResponse.ERROR_CODE_PROMOTION_NULL /* -4004101 */:
                    i = r0j.y;
                    break;
                default:
                    switch (errorCode) {
                        case OrderInfoResponse.ERROR_CODE_USER_LOCKED /* -4004003 */:
                            i = r0j.B;
                            break;
                        case OrderInfoResponse.ERROR_CODE_WRONG_COMMODITY /* -4004002 */:
                            i = r0j.v;
                            break;
                        case OrderInfoResponse.ERROR_CODE_DUPLICATE_ORDER /* -4004001 */:
                            i = r0j.u;
                            break;
                        default:
                            i = r0j.common_hint_unkonwn_error;
                            break;
                    }
                    break;
            }
        } else {
            i = r0j.t;
        }
        ToastExtKt.toastShort(application, i);
        ExceptionHelper.DefaultImpls.uploadEvent$default(ExceptionHelperExtKt.getInstance(ExceptionHelper.INSTANCE), CollectionsKt__CollectionsJVMKt.listOf("HlthCheckoutOrder"), (SentryLevel) null, MapsKt__MapsKt.mapOf(TuplesKt.to("function", "create_order"), TuplesKt.to("code", Integer.valueOf(it.getErrorCode())), TuplesKt.to("message", it.getMessage())), 2, (Object) null);
        if (paymentProgressListener != null) {
            paymentProgressListener.onOrderStatus(OrderStatus.CREATE_FAIL);
        }
        return Unit.INSTANCE;
    }

    private final void realDeduct(final FragmentActivity activity, final CommonDialog<?> payDialog, String channel, final OrderInfoResponse orderInfo, final int payType, final PaymentProgressListener callback) {
        PayManagerExtKt.getInstance(PaymentManager.INSTANCE).signDeduct(activity, channel, orderInfo.getPay_params(), new Function3() { // from class: dv6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DialogPayManager.realDeduct$lambda$5(activity, payDialog, orderInfo, payType, callback, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (MibiDeductResult) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit realDeduct$lambda$5(FragmentActivity activity, CommonDialog payDialog, OrderInfoResponse orderInfo, int i, PaymentProgressListener paymentProgressListener, boolean z, int i2, MibiDeductResult result) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(payDialog, "$payDialog");
        Intrinsics.checkNotNullParameter(orderInfo, "$orderInfo");
        Intrinsics.checkNotNullParameter(result, "result");
        Logger.i(TAG, "MibiDeductResult: " + z + " " + i2 + " " + result);
        if (z) {
            if (activity instanceof BaseActivity) {
                PageState.DefaultImpls.showLoading$default((PageState) activity, null, 0, false, 3, null);
            }
            checkOrderStatus$default(INSTANCE, activity, payDialog, orderInfo.getOrderInfo(), i, 0, paymentProgressListener, 16, null);
        } else {
            DialogPayManager dialogPayManager = INSTANCE;
            if (dialogPayManager.isSingPaySuccessOnly(i2)) {
                if (activity instanceof BaseActivity) {
                    PageState.DefaultImpls.showLoading$default((PageState) activity, null, 0, false, 3, null);
                }
                checkOrderStatus$default(dialogPayManager, activity, payDialog, orderInfo.getOrderInfo(), i, 0, paymentProgressListener, 16, null);
            } else if (!dialogPayManager.isCancelByUser(i2)) {
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), r0j.N);
            }
        }
        return Unit.INSTANCE;
    }

    private final void realPay(final FragmentActivity activity, final CommonDialog<?> dialog, String channel, final OrderInfoResponse orderInfo, final int payType, final PaymentProgressListener callback) {
        PaymentManager.DefaultImpls.payChannel$default(PayManagerExtKt.getInstance(PaymentManager.INSTANCE), activity, channel, orderInfo.getPay_params(), false, false, false, false, new Function3() { // from class: kv6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DialogPayManager.realPay$lambda$4(callback, activity, dialog, orderInfo, payType, ((Boolean) obj).booleanValue(), (MibiPayError) obj2, (MibiPayResult) obj3);
            }
        }, 120, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit realPay$lambda$4(PaymentProgressListener paymentProgressListener, FragmentActivity activity, CommonDialog dialog, OrderInfoResponse orderInfo, int i, boolean z, MibiPayError errorMsg, MibiPayResult mibiPayResult) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(orderInfo, "$orderInfo");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        if (paymentProgressListener != null) {
            paymentProgressListener.onPayChannel(z, errorMsg.getMsg(), mibiPayResult);
        }
        Logger.i(TAG, "MibiPayResult: " + z + " " + errorMsg + " " + mibiPayResult);
        if (z) {
            if (activity instanceof BaseActivity) {
                PageState.DefaultImpls.showLoading$default((PageState) activity, null, 0, false, 3, null);
            }
            checkOrderStatus$default(INSTANCE, activity, dialog, orderInfo.getOrderInfo(), i, 0, paymentProgressListener, 16, null);
        } else {
            if (!INSTANCE.isCancelByUser(errorMsg.getCode())) {
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), r0j.N);
            }
            if (paymentProgressListener != null) {
                paymentProgressListener.onOrderStatus(OrderStatus.PAYMENT_FAIL);
            }
            if (paymentProgressListener != null) {
                paymentProgressListener.onOrderFinish(false);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showPayDialog(final FragmentActivity activity, final boolean deduct, List<String> channelList, final OrderInfoResponse orderInfo, final int payType, final PaymentProgressListener callback) {
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).hideLoading();
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = deduct ? "WXPAYDEDUCT" : "WXPAY";
        PayChannelAdapter payChannelAdapter = new PayChannelAdapter(new Function1<String, Unit>() { // from class: com.xiaomi.fitness.pay.dialog.DialogPayManager$showPayDialog$adapter$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(String p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                Logger.i("DialogPayManager", "choose payment channel: " + p1);
                objectRef.element = p1;
                PaymentProgressListener paymentProgressListener = callback;
                if (paymentProgressListener != null) {
                    paymentProgressListener.onSelectChannel(p1);
                }
            }
        });
        final vnh vnhVarA0 = vnh.A0(LayoutInflater.from(activity));
        Intrinsics.checkNotNullExpressionValue(vnhVarA0, "inflate(...)");
        vnhVarA0.A.setAdapter(payChannelAdapter);
        vnhVarA0.F.setText(ResourceExtKt.getString(r0j.d, Float.valueOf(orderInfo.getOrderInfo().getPay_fee() / 100.0f)));
        payChannelAdapter.setChannelList(channelList);
        final CommonDialog commonDialogCreate = new CommonDialog.c("").setCustomView(vnhVarA0.getRoot()).setCancelable(false).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).create();
        vnhVarA0.C.setOnClickListener(new View.OnClickListener() { // from class: lv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogPayManager.showPayDialog$lambda$7(callback, commonDialogCreate, view);
            }
        });
        vnhVarA0.D.setOnClickListener(new View.OnClickListener() { // from class: mv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogPayManager.showPayDialog$lambda$8(deduct, activity, commonDialogCreate, objectRef, orderInfo, payType, callback, view);
            }
        });
        startTimer(orderInfo.getOrderInfo().getCreate_time(), new Function1() { // from class: nv6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialogPayManager.showPayDialog$lambda$9(vnhVarA0, (String) obj);
            }
        }, new Function0() { // from class: ev6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogPayManager.showPayDialog$lambda$10(commonDialogCreate);
            }
        });
        commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPayDialog$lambda$10(CommonDialog commonDialog) {
        commonDialog.dismissAllowingStateLoss();
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), r0j.p);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPayDialog$lambda$7(PaymentProgressListener paymentProgressListener, CommonDialog commonDialog, View view) {
        if (paymentProgressListener != null) {
            Intrinsics.checkNotNull(commonDialog);
            if (paymentProgressListener.onClose(commonDialog)) {
                return;
            }
        }
        commonDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showPayDialog$lambda$8(boolean z, FragmentActivity activity, CommonDialog commonDialog, Ref.ObjectRef channel, OrderInfoResponse orderInfo, int i, PaymentProgressListener paymentProgressListener, View view) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(channel, "$channel");
        Intrinsics.checkNotNullParameter(orderInfo, "$orderInfo");
        if (!NetworkExtKt.isNetworkAvailable()) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), r0j.common_hint_network_unavailable);
            return;
        }
        if (z) {
            DialogPayManager dialogPayManager = INSTANCE;
            Intrinsics.checkNotNull(commonDialog);
            dialogPayManager.realDeduct(activity, commonDialog, (String) channel.element, orderInfo, i, paymentProgressListener);
        } else {
            DialogPayManager dialogPayManager2 = INSTANCE;
            Intrinsics.checkNotNull(commonDialog);
            dialogPayManager2.realPay(activity, commonDialog, (String) channel.element, orderInfo, i, paymentProgressListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPayDialog$lambda$9(vnh binding, String it) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(it, "it");
        binding.G.setText(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void signWatchFace(OrderInfo orderInfo) {
        Logger.i(TAG, "signWatchFace");
        for (SkuObject skuObject : orderInfo.getSku_list()) {
            Integer product_category = skuObject.getProduct_category();
            if (product_category != null && product_category.intValue() == 1) {
                Logger.i(TAG, "pay success, sign: " + skuObject.getProduct_id());
                FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).signWatchFace(skuObject.getProduct_id());
            }
        }
    }

    private final void startTimer(long start, final Function1<? super String, Unit> tick, final Function0<Unit> end) {
        CountDownTimer countDownTimer = new CountDownTimer(((long) 900000) - (start != 0 ? System.currentTimeMillis() - (start * ((long) 1000)) : 0L)) { // from class: com.xiaomi.fitness.pay.dialog.DialogPayManager.startTimer.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                end.invoke();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long p0) {
                String strValueOf;
                long j = p0 / ((long) 1000);
                long j2 = 60;
                long j3 = j / j2;
                long j4 = j % j2;
                if (j4 < 10) {
                    strValueOf = "0" + j4;
                } else {
                    strValueOf = String.valueOf(j4);
                }
                tick.invoke2(ResourceExtKt.getString(r0j.q, j3 + ":" + strValueOf));
            }
        };
        countdonwTimer = countDownTimer;
        countDownTimer.start();
    }

    public static /* synthetic */ void startTimer$default(DialogPayManager dialogPayManager, long j, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        dialogPayManager.startTimer(j, function1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopTimer() {
        CountDownTimer countDownTimer = countdonwTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        countdonwTimer = null;
    }

    @NotNull
    public final PaymentApiRequest getRequest() {
        return request;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.util.List] */
    public final void pay(@NotNull FragmentActivity activity, @NotNull List<SkuObject> skuList, int promotionId, final boolean deduct, boolean needDid, boolean needModel, boolean needFirmwareVersion, final int payType, @NotNull String source, @Nullable Bundle trackBundle, @Nullable final PaymentProgressListener callback) {
        CreateOrderRequest createOrderRequest;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(skuList, "skuList");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!NetworkExtKt.isNetworkAvailable()) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), r0j.common_hint_network_unavailable);
            return;
        }
        final WeakReference weakReference = new WeakReference(activity);
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).showLoading();
        }
        if (needDid || needFirmwareVersion || needModel) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            createOrderRequest = new CreateOrderRequest((!needDid || wearableDeviceModel == null) ? null : wearableDeviceModel.getDid(), (!needModel || wearableDeviceModel == null) ? null : DeviceModelExtKt.getModel(wearableDeviceModel), (!needFirmwareVersion || wearableDeviceModel == null) ? null : DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel), skuList, 0, promotionId, source, 16, null);
        } else {
            createOrderRequest = new CreateOrderRequest(null, null, null, skuList, 0, promotionId, source, 23, null);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CollectionsKt__CollectionsKt.emptyList();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        PaymentApiRequest paymentApiRequest = request;
        PaymentApiRequest.getPayChannel$default(paymentApiRequest, 0, deduct, new Function1() { // from class: fv6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialogPayManager.pay$lambda$0(weakReference, objectRef, objectRef2, deduct, payType, callback, (List) obj);
            }
        }, new Function1() { // from class: gv6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialogPayManager.pay$lambda$1(weakReference, (ApiException) obj);
            }
        }, 1, null);
        paymentApiRequest.createOrder(createOrderRequest, new Function1() { // from class: hv6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialogPayManager.pay$lambda$2(callback, objectRef2, weakReference, objectRef, deduct, payType, (OrderInfoResponse) obj);
            }
        }, new Function1() { // from class: iv6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialogPayManager.pay$lambda$3(weakReference, callback, (ApiException) obj);
            }
        });
    }

    public final void repay(@NotNull FragmentActivity activity, @NotNull String orderId, boolean needDid, boolean needModel, boolean needFirmwareVersion, int payType, @Nullable Bundle trackBundle, @Nullable PaymentProgressListener callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).showLoading();
            AnyExtKt.io$default(null, new C27471(orderId, callback, activity, payType, null), 1, null);
        }
    }
}
