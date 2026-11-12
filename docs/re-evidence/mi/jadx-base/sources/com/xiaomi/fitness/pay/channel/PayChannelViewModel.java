package com.xiaomi.fitness.pay.channel;

import android.os.CountDownTimer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.pay.api.PaymentApiRequest;
import com.xiaomi.fitness.pay.channel.PayChannelViewModel;
import com.xiaomi.fitness.pay.export.data.request.CreateOrderRequest;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.pay.export.data.response.OrderInfoResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J^\u0010\r\u001a\u00020\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000e0\u0018H\u0086@¢\u0006\u0002\u0010\u001bJ,\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000e0\u001fH\u0086@¢\u0006\u0002\u0010 J\u0006\u0010(\u001a\u00020\u000eJ\u000e\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u001eJ0\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\u001f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e00J\u0010\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020-H\u0002J\u0010\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u000205H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R)\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010#0\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u00106\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/pay/channel/PayChannelViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/pay/channel/PayChannelModel;", "<init>", "()V", "paymentApiRequest", "Lcom/xiaomi/fitness/pay/api/PaymentApiRequest;", "getPaymentApiRequest", "()Lcom/xiaomi/fitness/pay/api/PaymentApiRequest;", "setPaymentApiRequest", "(Lcom/xiaomi/fitness/pay/api/PaymentApiRequest;)V", "countdownTimer", "Landroid/os/CountDownTimer;", "createOrder", "", "skuList", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", "Ljava/util/ArrayList;", "needDid", "", "needModel", "needFW", "result", "Lkotlin/Function2;", "", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfoResponse;", "(Ljava/util/ArrayList;ZZZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderInfo", "orderId", "", "Lkotlin/Function1;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payChannel", "Landroidx/lifecycle/MutableLiveData;", "", "getPayChannel", "()Landroidx/lifecycle/MutableLiveData;", "payChannel$delegate", "Lkotlin/Lazy;", "getPaymentChannel", "processOrderStatus", "status", "startTimer", "past", "", "timeLast", "timeUp", "Lkotlin/Function0;", "postTimer", "millisUntilFinished", LifecycleConstantKt.ON_DESTROY, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "TAG", "getTAG", "()Ljava/lang/String;", "Companion", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PayChannelViewModel extends BaseViewModel<PayChannelModel> {
    public static final int ORDER_TIME_COUNT_DOWN = 900000;

    @Nullable
    private CountDownTimer countdownTimer;

    /* JADX INFO: renamed from: payChannel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy payChannel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bnh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayChannelViewModel.payChannel_delegate$lambda$4();
        }
    });
    public PaymentApiRequest paymentApiRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.channel.PayChannelViewModel$getPaymentChannel$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.channel.PayChannelViewModel$getPaymentChannel$1", f = "PayChannelViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PayChannelViewModel payChannelViewModel, List list) {
            payChannelViewModel.getPayChannel().postValue(list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(PayChannelViewModel payChannelViewModel, ApiException apiException) {
            payChannelViewModel.getPayChannel().postValue(null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PayChannelViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PaymentApiRequest paymentApiRequest = PayChannelViewModel.this.getPaymentApiRequest();
            final PayChannelViewModel payChannelViewModel = PayChannelViewModel.this;
            Function1 function1 = new Function1() { // from class: com.xiaomi.fitness.pay.channel.c
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return PayChannelViewModel.AnonymousClass1.invokeSuspend$lambda$0(payChannelViewModel, (List) obj2);
                }
            };
            final PayChannelViewModel payChannelViewModel2 = PayChannelViewModel.this;
            PaymentApiRequest.getPayChannel$default(paymentApiRequest, 0, false, function1, new Function1() { // from class: com.xiaomi.fitness.pay.channel.d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return PayChannelViewModel.AnonymousClass1.invokeSuspend$lambda$1(payChannelViewModel2, (ApiException) obj2);
                }
            }, 3, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createOrder$lambda$0(Function2 result, OrderInfoResponse it) {
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        result.invoke(0, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createOrder$lambda$1(PayChannelViewModel this$0, Function2 result, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "createOrder fail: " + it.getErrorCode() + ", cause " + it.getMessage());
        result.invoke(Integer.valueOf(it.getErrorCode()), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOrderInfo$lambda$2(PayChannelViewModel this$0, Function1 result, OrderInfoResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d(this$0.getTAG(), "getOrderInfo success");
        result.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOrderInfo$lambda$3(PayChannelViewModel this$0, Function1 result, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "getOrderInfo fail: " + it.getErrorCode());
        result.invoke2(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData payChannel_delegate$lambda$4() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String postTimer(long millisUntilFinished) {
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
        String str = j3 + ":" + strValueOf;
        getMModel().setTimerLeft(str);
        return str;
    }

    @Nullable
    public final Object createOrder(@Nullable ArrayList<SkuObject> arrayList, boolean z, boolean z2, boolean z3, @NotNull final Function2<? super Integer, ? super OrderInfoResponse, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        CreateOrderRequest createOrderRequest;
        String firmwareVersion = null;
        if (arrayList == null || arrayList.isEmpty()) {
            Logger.i(getTAG(), "createOrder fail cause skuObject == null");
            function2.invoke(Boxing.boxInt(-1), null);
            return Unit.INSTANCE;
        }
        if (z || z3 || z2) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            String did = (!z || wearableDeviceModel == null) ? null : wearableDeviceModel.getDid();
            String model = (!z2 || wearableDeviceModel == null) ? null : DeviceModelExtKt.getModel(wearableDeviceModel);
            if (z3 && wearableDeviceModel != null) {
                firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel);
            }
            createOrderRequest = new CreateOrderRequest(did, model, firmwareVersion, arrayList, 0, 0, null, 112, null);
        } else {
            createOrderRequest = new CreateOrderRequest(null, null, null, arrayList, 0, 0, null, 119, null);
        }
        getPaymentApiRequest().createOrder(createOrderRequest, new Function1() { // from class: xmh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayChannelViewModel.createOrder$lambda$0(function2, (OrderInfoResponse) obj);
            }
        }, new Function1() { // from class: ymh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayChannelViewModel.createOrder$lambda$1(this.f40326a, function2, (ApiException) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object getOrderInfo(@NotNull String str, @NotNull final Function1<? super OrderInfoResponse, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object orderInfo = getPaymentApiRequest().getOrderInfo(str, new Function1() { // from class: zmh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayChannelViewModel.getOrderInfo$lambda$2(this.f41462a, function1, (OrderInfoResponse) obj);
            }
        }, new Function1() { // from class: anh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayChannelViewModel.getOrderInfo$lambda$3(this.f3284a, function1, (ApiException) obj);
            }
        }, continuation);
        return orderInfo == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orderInfo : Unit.INSTANCE;
    }

    @NotNull
    public final MutableLiveData<List<String>> getPayChannel() {
        return (MutableLiveData) this.payChannel.getValue();
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

    public final void getPaymentChannel() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "FacePayOrderViewModel";
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        CountDownTimer countDownTimer = this.countdownTimer;
        if (countDownTimer != null) {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.countdownTimer = null;
        }
    }

    public final void processOrderStatus(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        getMModel().processOrderStatus(status);
    }

    public final void setPaymentApiRequest(@NotNull PaymentApiRequest paymentApiRequest) {
        Intrinsics.checkNotNullParameter(paymentApiRequest, "<set-?>");
        this.paymentApiRequest = paymentApiRequest;
    }

    public final void startTimer(long past, @NotNull final Function1<? super String, Unit> timeLast, @NotNull final Function0<Unit> timeUp) {
        Intrinsics.checkNotNullParameter(timeLast, "timeLast");
        Intrinsics.checkNotNullParameter(timeUp, "timeUp");
        CountDownTimer countDownTimer = new CountDownTimer(900000 - past) { // from class: com.xiaomi.fitness.pay.channel.PayChannelViewModel.startTimer.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                timeUp.invoke();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long p0) {
                timeLast.invoke2(this.postTimer(p0));
            }
        };
        this.countdownTimer = countDownTimer;
        countDownTimer.start();
    }
}
