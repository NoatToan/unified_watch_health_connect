package com.xiaomi.fitness.pay.result;

import android.os.CountDownTimer;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.pay.api.PaymentApiRequest;
import com.xiaomi.fitness.pay.export.data.response.CheckPayResponse;
import com.xiaomi.fitness.pay.export.data.response.OrderInfoResponse;
import com.xiaomi.fitness.pay.result.PayResultViewModel;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ,\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u001a0\u001fH\u0086@¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0%J\u0006\u0010&\u001a\u00020\u001aJ\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001cJ\u000e\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020#R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010+\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/pay/result/PayResultViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/pay/result/PayResultModel;", "<init>", "()V", "paymentApiRequest", "Lcom/xiaomi/fitness/pay/api/PaymentApiRequest;", "getPaymentApiRequest", "()Lcom/xiaomi/fitness/pay/api/PaymentApiRequest;", "setPaymentApiRequest", "(Lcom/xiaomi/fitness/pay/api/PaymentApiRequest;)V", "paid", "", "getPaid", "()Z", "setPaid", "(Z)V", "countdownTimer", "Landroid/os/CountDownTimer;", TSMAuthContants.PARAM_ORDER_INFO, "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfoResponse;", "getOrderInfo", "()Landroidx/lifecycle/MutableLiveData;", "orderInfo$delegate", "Lkotlin/Lazy;", "", "orderId", "", "checkPayDone", "result", "Lkotlin/Function1;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTimer", "left", "", "timeUp", "Lkotlin/Function0;", "stopTimer", "processOrderStatus", "status", "refreshTimerText", "millisUntilFinished", "TAG", "getTAG", "()Ljava/lang/String;", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PayResultViewModel extends BaseViewModel<PayResultModel> {

    @Nullable
    private CountDownTimer countdownTimer;

    /* JADX INFO: renamed from: orderInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy orderInfo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: poh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayResultViewModel.orderInfo_delegate$lambda$0();
        }
    });
    private boolean paid;
    public PaymentApiRequest paymentApiRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.result.PayResultViewModel$getOrderInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.result.PayResultViewModel$getOrderInfo$1", f = "PayResultViewModel.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$orderId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PayResultViewModel payResultViewModel, OrderInfoResponse orderInfoResponse) {
            Logger.i(payResultViewModel.getTAG(), "getOrderInfo success: " + orderInfoResponse);
            payResultViewModel.getOrderInfo().postValue(orderInfoResponse);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(PayResultViewModel payResultViewModel, ApiException apiException) {
            Logger.i(payResultViewModel.getTAG(), "getOrderInfo fail: " + apiException);
            payResultViewModel.getOrderInfo().postValue(null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PayResultViewModel.this.new AnonymousClass1(this.$orderId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentApiRequest paymentApiRequest = PayResultViewModel.this.getPaymentApiRequest();
                String str = this.$orderId;
                final PayResultViewModel payResultViewModel = PayResultViewModel.this;
                Function1<? super OrderInfoResponse, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.pay.result.d
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return PayResultViewModel.AnonymousClass1.invokeSuspend$lambda$0(payResultViewModel, (OrderInfoResponse) obj2);
                    }
                };
                final PayResultViewModel payResultViewModel2 = PayResultViewModel.this;
                Function1<? super ApiException, Unit> function2 = new Function1() { // from class: com.xiaomi.fitness.pay.result.e
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return PayResultViewModel.AnonymousClass1.invokeSuspend$lambda$1(payResultViewModel2, (ApiException) obj2);
                    }
                };
                this.label = 1;
                if (paymentApiRequest.getOrderInfo(str, function1, function2, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPayDone$lambda$1(PayResultViewModel this$0, Function1 result, CheckPayResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "checkPayDone success: " + it);
        result.invoke2(Boolean.valueOf(it.getSuccess()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPayDone$lambda$2(PayResultViewModel this$0, Function1 result, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "checkPayDone fail: " + it);
        result.invoke2(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData orderInfo_delegate$lambda$0() {
        return new MutableLiveData();
    }

    @Nullable
    public final Object checkPayDone(@NotNull String str, @NotNull final Function1<? super Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objCheckPay$default = PaymentApiRequest.checkPay$default(getPaymentApiRequest(), str, 0, new Function1() { // from class: noh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayResultViewModel.checkPayDone$lambda$1(this.f28201a, function1, (CheckPayResponse) obj);
            }
        }, new Function1() { // from class: ooh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayResultViewModel.checkPayDone$lambda$2(this.f29339a, function1, (ApiException) obj);
            }
        }, continuation, 2, null);
        return objCheckPay$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCheckPay$default : Unit.INSTANCE;
    }

    @NotNull
    public final MutableLiveData<OrderInfoResponse> getOrderInfo() {
        return (MutableLiveData) this.orderInfo.getValue();
    }

    public final boolean getPaid() {
        return this.paid;
    }

    @NotNull
    public final PaymentApiRequest getPaymentApiRequest() {
        PaymentApiRequest paymentApiRequest = this.paymentApiRequest;
        if (paymentApiRequest != null) {
            return paymentApiRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentApiRequest");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "PayResultViewModel";
    }

    public final void processOrderStatus(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        getMModel().processOrderStatus(status);
    }

    public final void refreshTimerText(long millisUntilFinished) {
        String strValueOf;
        long j = millisUntilFinished / ((long) 1000);
        long j2 = 60;
        long j3 = j / j2;
        long j4 = j % j2;
        if (j4 < 10) {
            strValueOf = "0" + j4;
        } else {
            strValueOf = String.valueOf(j4);
        }
        getMModel().refreshTimerText(j3 + ":" + strValueOf);
    }

    public final void setPaid(boolean z) {
        this.paid = z;
    }

    public final void setPaymentApiRequest(@NotNull PaymentApiRequest paymentApiRequest) {
        Intrinsics.checkNotNullParameter(paymentApiRequest, "<set-?>");
        this.paymentApiRequest = paymentApiRequest;
    }

    public final void startTimer(long left, @NotNull final Function0<Unit> timeUp) {
        Intrinsics.checkNotNullParameter(timeUp, "timeUp");
        CountDownTimer countDownTimer = this.countdownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.countdownTimer = null;
        CountDownTimer countDownTimer2 = new CountDownTimer(left) { // from class: com.xiaomi.fitness.pay.result.PayResultViewModel.startTimer.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                timeUp.invoke();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long p0) {
                this.refreshTimerText(p0);
            }
        };
        this.countdownTimer = countDownTimer2;
        countDownTimer2.start();
    }

    public final void stopTimer() {
        CountDownTimer countDownTimer = this.countdownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.countdownTimer = null;
    }

    public final void getOrderInfo(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(orderId, null), 3, null);
    }
}
