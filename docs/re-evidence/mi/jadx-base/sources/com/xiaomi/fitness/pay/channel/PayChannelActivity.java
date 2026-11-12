package com.xiaomi.fitness.pay.channel;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.pay.channel.PayChannelActivity;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.pay.export.data.response.OrderInfoResponse;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import com.xiaomi.fitness.pay.result.PayResultActivity;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.onetrack.OneTrack;
import defpackage.av6;
import defpackage.jnh;
import defpackage.jv1;
import defpackage.ori;
import defpackage.r0j;
import defpackage.tji;
import defpackage.uui;
import defpackage.yni;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u0000 R2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001RB\u0007¢\u0006\u0004\bQ\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u0013\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0006R*\u0010#\u001a\u0016\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00020!\u0018\u0001`\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010)\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010/\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0010R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00100R\u0016\u0010<\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010'R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00100R\u0016\u0010C\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00100R\u001d\u0010H\u001a\u0004\u0018\u00010?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001f\u0010K\u001a\u0006\u0012\u0002\b\u00030\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010\u0017R\u0014\u0010N\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010M¨\u0006S"}, d2 = {"Lcom/xiaomi/fitness/pay/channel/PayChannelActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/pay/channel/PayChannelViewModel;", "Ljnh;", "", "addListener", "()V", "createOrder", "getOrderInfo", "", StatConstants.PARAM_START, "startOrderTimer", "(J)V", "", "timeStr", "refreshDialogCountdownText", "(Ljava/lang/String;)V", "select", "onPayChannelChanged", "onOrderTimeUp", "getPaymentChannel", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "createExitPayDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "trackExpose", "trackPay", "trackCancel", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", "Lkotlin/collections/ArrayList;", "skuObject", "Ljava/util/ArrayList;", "", "needDid", "Z", "needModel", "needFW", "trackBundle", "Landroid/os/Bundle;", "Landroid/widget/TextView;", "dialogCountDownText", "Landroid/widget/TextView;", "currentCountDownStr", "Ljava/lang/String;", "getCurrentCountDownStr", "()Ljava/lang/String;", "setCurrentCountDownStr", "Lcom/xiaomi/fitness/pay/channel/PayChannelAdapter;", "payChannelAdapter", "Lcom/xiaomi/fitness/pay/channel/PayChannelAdapter;", "getPayChannelAdapter", "()Lcom/xiaomi/fitness/pay/channel/PayChannelAdapter;", "setPayChannelAdapter", "(Lcom/xiaomi/fitness/pay/channel/PayChannelAdapter;)V", "channel", "startTimer", "orderStartStamp", "J", "", Constants.KEY_PRICE, "I", "payParams", "orderId", "mPayType$delegate", "Lkotlin/Lazy;", "getMPayType", "()Ljava/lang/Integer;", "mPayType", "exitPayDialog$delegate", "getExitPayDialog", "exitPayDialog", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPayChannelActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayChannelActivity.kt\ncom/xiaomi/fitness/pay/channel/PayChannelActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,395:1\n37#2:396\n36#2,3:397\n*S KotlinDebug\n*F\n+ 1 PayChannelActivity.kt\ncom/xiaomi/fitness/pay/channel/PayChannelActivity\n*L\n86#1:396\n86#1:397,3\n*E\n"})
public final class PayChannelActivity extends Hilt_PayChannelActivity<PayChannelViewModel, jnh> {

    @NotNull
    public static final String ORDER_ID = "order_id";

    @NotNull
    public static final String ORDER_NEED_DID = "order_need_did";

    @NotNull
    public static final String ORDER_NEED_FW = "order_need_fw";

    @NotNull
    public static final String ORDER_NEED_MODEL = "order_need_model";

    @NotNull
    public static final String PAY_CHANNEL = "pay_channel";

    @NotNull
    public static final String PAY_PARAMS = "pay_params";

    @NotNull
    public static final String PAY_TRACK_BUNDLE = "pay_track_bundle";

    @NotNull
    public static final String PAY_TYPE = "pay_type";

    @NotNull
    public static final String SKU_OBJECT = "sku_object";

    @NotNull
    private static final String TAG = "PayChannelFragment";

    @Nullable
    private TextView dialogCountDownText;
    private boolean needDid;
    private boolean needFW;
    private boolean needModel;
    private long orderStartStamp;
    public PayChannelAdapter payChannelAdapter;
    private int price;

    @Nullable
    private ArrayList<SkuObject> skuObject;
    private boolean startTimer;

    @Nullable
    private Bundle trackBundle;

    @NotNull
    private String currentCountDownStr = "";

    @NotNull
    private String channel = "";

    @NotNull
    private String payParams = "";

    @NotNull
    private String orderId = "";

    /* JADX INFO: renamed from: mPayType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPayType = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: smh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayChannelActivity.mPayType_delegate$lambda$0(this.f33788a);
        }
    });

    /* JADX INFO: renamed from: exitPayDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy exitPayDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tmh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PayChannelActivity.exitPayDialog_delegate$lambda$7(this.f34856a);
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.channel.PayChannelActivity$createOrder$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.channel.PayChannelActivity$createOrder$1", f = "PayChannelActivity.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C27401(Continuation<? super C27401> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PayChannelActivity payChannelActivity, int i, OrderInfoResponse orderInfoResponse) {
            int i2;
            Logger.i(PayChannelActivity.TAG, "createOrder: " + orderInfoResponse);
            if (orderInfoResponse != null) {
                payChannelActivity.orderId = orderInfoResponse.getOrderInfo().getOrder_id();
                payChannelActivity.price = orderInfoResponse.getOrderInfo().getOrder_fee();
                payChannelActivity.payParams = orderInfoResponse.getPay_params();
                PayChannelActivity.access$getMViewModel(payChannelActivity).processOrderStatus(orderInfoResponse.getOrderInfo().getOrder_status());
                PayChannelActivity.startOrderTimer$default(payChannelActivity, 0L, 1, null);
                payChannelActivity.trackExpose();
            } else {
                switch (i) {
                    case OrderInfoResponse.ERROR_CODE_USER_LOCKED /* -4004003 */:
                        i2 = r0j.B;
                        break;
                    case OrderInfoResponse.ERROR_CODE_WRONG_COMMODITY /* -4004002 */:
                        i2 = r0j.v;
                        break;
                    case OrderInfoResponse.ERROR_CODE_DUPLICATE_ORDER /* -4004001 */:
                        i2 = r0j.u;
                        break;
                    default:
                        i2 = r0j.z;
                        break;
                }
                ToastExtKt.toastShort(payChannelActivity, i2);
                PayChannelActivity.access$getMViewModel(payChannelActivity).processOrderStatus(OrderStatus.CREATE_FAIL);
                payChannelActivity.finish();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PayChannelActivity.this.new C27401(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PayChannelViewModel payChannelViewModelAccess$getMViewModel = PayChannelActivity.access$getMViewModel(PayChannelActivity.this);
                ArrayList<SkuObject> arrayList = PayChannelActivity.this.skuObject;
                boolean z = PayChannelActivity.this.needDid;
                boolean z2 = PayChannelActivity.this.needModel;
                boolean z3 = PayChannelActivity.this.needFW;
                final PayChannelActivity payChannelActivity = PayChannelActivity.this;
                Function2<? super Integer, ? super OrderInfoResponse, Unit> function2 = new Function2() { // from class: com.xiaomi.fitness.pay.channel.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return PayChannelActivity.C27401.invokeSuspend$lambda$0(payChannelActivity, ((Integer) obj2).intValue(), (OrderInfoResponse) obj3);
                    }
                };
                this.label = 1;
                if (payChannelViewModelAccess$getMViewModel.createOrder(arrayList, z, z2, z3, function2, this) == coroutine_suspended) {
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
            return ((C27401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.channel.PayChannelActivity$getOrderInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.pay.channel.PayChannelActivity$getOrderInfo$1", f = "PayChannelActivity.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C27411(Continuation<? super C27411> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PayChannelActivity payChannelActivity, OrderInfoResponse orderInfoResponse) {
            if (orderInfoResponse == null) {
                ToastExtKt.toastShort(payChannelActivity, r0j.common_hint_unkonwn_error);
                PayChannelActivity.access$getMViewModel(payChannelActivity).processOrderStatus(OrderStatus.CREATE_FAIL);
                payChannelActivity.finish();
            } else {
                payChannelActivity.price = orderInfoResponse.getOrderInfo().getOrder_fee();
                payChannelActivity.payParams = orderInfoResponse.getPay_params();
                payChannelActivity.skuObject = ListExtKt.toArrayList(orderInfoResponse.getOrderInfo().getSku_list());
                PayChannelActivity.access$getMViewModel(payChannelActivity).processOrderStatus(orderInfoResponse.getOrderInfo().getOrder_status());
                payChannelActivity.startOrderTimer(orderInfoResponse.getOrderInfo().getCreate_time());
                payChannelActivity.trackExpose();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PayChannelActivity.this.new C27411(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PayChannelViewModel payChannelViewModelAccess$getMViewModel = PayChannelActivity.access$getMViewModel(PayChannelActivity.this);
                String str = PayChannelActivity.this.orderId;
                final PayChannelActivity payChannelActivity = PayChannelActivity.this;
                Function1<? super OrderInfoResponse, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.pay.channel.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return PayChannelActivity.C27411.invokeSuspend$lambda$0(payChannelActivity, (OrderInfoResponse) obj2);
                    }
                };
                this.label = 1;
                if (payChannelViewModelAccess$getMViewModel.getOrderInfo(str, function1, this) == coroutine_suspended) {
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
            return ((C27411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.channel.PayChannelActivity$onCreate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C27421 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C27421(Object obj) {
            super(1, obj, PayChannelActivity.class, "onPayChannelChanged", "onPayChannelChanged(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PayChannelActivity) this.receiver).onPayChannelChanged(p0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ PayChannelViewModel access$getMViewModel(PayChannelActivity payChannelActivity) {
        return (PayChannelViewModel) payChannelActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addListener() {
        ((jnh) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: rmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayChannelActivity.addListener$lambda$4(this.f32706a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addListener$lambda$4(final PayChannelActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.trackPay();
        if (!this$0.startTimer) {
            this$0.onOrderTimeUp();
        } else {
            LaunchExtensionKt.startActivity(this$0, (Class<?>) PayResultActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: qmh
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return PayChannelActivity.addListener$lambda$4$lambda$3(this.f31662a, (Intent) obj);
                }
            });
            this$0.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$4$lambda$3(PayChannelActivity this$0, Intent it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra("order_id", this$0.orderId);
        it.putExtra("pay_channel", this$0.channel);
        it.putExtra(PAY_PARAMS, this$0.payParams);
        it.putExtra(PAY_TYPE, this$0.getMPayType());
        it.putExtra(PayResultActivity.ORDER_START_TIMESTAMP, this$0.orderStartStamp);
        it.putExtra(PAY_TRACK_BUNDLE, this$0.trackBundle);
        return Unit.INSTANCE;
    }

    private final CommonDialog<?> createExitPayDialog() {
        this.dialogCountDownText = (TextView) LayoutInflater.from(this).inflate(uui.g, (ViewGroup) null, false).findViewById(ori.G);
        CommonDialog<?> commonDialogAddDialogCallback = new CommonDialog.c("give up pay").setDialogTitle(r0j.o).setCustomView(this.dialogCountDownText).setPositiveText(r0j.l).setNegativeText(r0j.m).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.pay.channel.PayChannelActivity.createExitPayDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    PayChannelActivity.this.trackCancel();
                    PayChannelActivity.this.finish();
                } else if (which == -1 && dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(commonDialogAddDialogCallback, "addDialogCallback(...)");
        return commonDialogAddDialogCallback;
    }

    private final void createOrder() {
        if (NetworkExtKt.isNetworkAvailable()) {
            ScopeExtKt.scopeNetLife$default(this, (Lifecycle.Event) null, (CoroutineDispatcher) null, new C27401(null), 3, (Object) null);
        } else {
            ToastExtKt.toastShort(this, r0j.w);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonDialog exitPayDialog_delegate$lambda$7(PayChannelActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.createExitPayDialog();
    }

    private final CommonDialog<?> getExitPayDialog() {
        return (CommonDialog) this.exitPayDialog.getValue();
    }

    private final Integer getMPayType() {
        return (Integer) this.mPayType.getValue();
    }

    private final void getOrderInfo() {
        ScopeExtKt.scopeNetLife$default(this, (Lifecycle.Event) null, (CoroutineDispatcher) null, new C27411(null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getPaymentChannel() {
        showLoading();
        ((PayChannelViewModel) getMViewModel()).getPaymentChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer mPayType_delegate$lambda$0(PayChannelActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = this$0.getIntent();
        if (intent != null) {
            return Integer.valueOf(intent.getIntExtra(PAY_TYPE, 1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$1(PayChannelActivity this$0, List list) {
        String string;
        String[] strArr;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (list == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
            string = null;
        } else {
            string = Arrays.toString(strArr);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        }
        Logger.i(TAG, "get payChannel: " + string);
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            ToastExtKt.toastShort(this$0, r0j.common_hint_unkonwn_error);
        } else {
            this$0.channel = (String) list.get(0);
            this$0.getPayChannelAdapter().setChannelList(list);
            ((PayChannelViewModel) this$0.getMViewModel()).getMModel().setChannelList(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(PayChannelActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onOrderTimeUp() {
        Logger.i(TAG, "onOrderTimeUp");
        ((PayChannelViewModel) getMViewModel()).getMModel().getTimerString().postValue("");
        new CommonDialog.c("order time up").setDialogDescription(r0j.e).setPositiveText(r0j.f32052b).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.pay.channel.PayChannelActivity.onOrderTimeUp.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    PayChannelActivity.this.finish();
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPayChannelChanged(String select) {
        Logger.i(TAG, "choose payment channel: " + select);
        this.channel = select;
    }

    private final void refreshDialogCountdownText(String timeStr) {
        TextView textView = this.dialogCountDownText;
        if (textView != null) {
            textView.setText(getString(r0j.n, timeStr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void startOrderTimer(long start) {
        TextView textView = ((jnh) getMBinding()).D;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.price / 100)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        if (this.startTimer) {
            return;
        }
        this.orderStartStamp = start == 0 ? System.currentTimeMillis() : ((long) 1000) * start;
        ((PayChannelViewModel) getMViewModel()).startTimer(start != 0 ? System.currentTimeMillis() - (start * ((long) 1000)) : 0L, new Function1() { // from class: mmh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayChannelActivity.startOrderTimer$lambda$5(this.f27004a, (String) obj);
            }
        }, new Function0() { // from class: nmh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PayChannelActivity.startOrderTimer$lambda$6(this.f28073a);
            }
        });
        this.startTimer = true;
    }

    public static /* synthetic */ void startOrderTimer$default(PayChannelActivity payChannelActivity, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        payChannelActivity.startOrderTimer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startOrderTimer$lambda$5(PayChannelActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.currentCountDownStr = it;
        this$0.refreshDialogCountdownText(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startOrderTimer$lambda$6(PayChannelActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onOrderTimeUp();
        this$0.startTimer = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackCancel() {
        String string;
        SkuObject skuObject;
        String model;
        String firmwareVersion;
        Integer mPayType = getMPayType();
        String str = "";
        if (mPayType == null || mPayType.intValue() != 1) {
            if ((mPayType != null && mPayType.intValue() == 3) || (mPayType != null && mPayType.intValue() == 2)) {
                IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.0.0.0.40476");
                Object[] objArr = new Object[10];
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
                objArr[8] = Constants.KEY_PRICE;
                objArr[9] = Integer.valueOf(this.price);
                oneTrackExtKt.reportData(oneTrackStatBean, objArr);
                return;
            }
            return;
        }
        ArrayList<SkuObject> arrayList = this.skuObject;
        if (arrayList == null || (skuObject = (SkuObject) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList)) == null) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        IOnetrack oneTrackExtKt2 = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean2 = new OneTrackStatBean("click_v3", "56.106.0.1.39952");
        Object[] objArr2 = new Object[16];
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
        objArr2[6] = "source";
        Bundle bundle4 = this.trackBundle;
        objArr2[7] = Integer.valueOf(bundle4 != null ? bundle4.getInt("source") : 0);
        objArr2[8] = "utm_source";
        Bundle bundle5 = this.trackBundle;
        objArr2[9] = Integer.valueOf(bundle5 != null ? bundle5.getInt("utm_source") : 0);
        objArr2[10] = Constants.KEY_PRICE;
        objArr2[11] = Integer.valueOf(this.price);
        objArr2[12] = "device_model";
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr2[13] = model;
        objArr2[14] = "device_version";
        if (wearableDeviceModel != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel)) != null) {
            str = firmwareVersion;
        }
        objArr2[15] = str;
        oneTrackExtKt2.reportData(oneTrackStatBean2, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackExpose() {
        String string;
        SkuObject skuObject;
        String model;
        String firmwareVersion;
        Integer mPayType = getMPayType();
        int i = 2;
        String str = "";
        if (mPayType != null && mPayType.intValue() == 1) {
            ArrayList<SkuObject> arrayList = this.skuObject;
            if (arrayList == null || (skuObject = (SkuObject) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList)) == null) {
                return;
            }
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("expose_v3", "56.106.0.1.40135");
            Object[] objArr = new Object[14];
            objArr[0] = "name";
            objArr[1] = "watchface_pay";
            objArr[2] = "asset_id";
            String product_id = skuObject.getProduct_id();
            if (product_id == null) {
                product_id = "";
            }
            objArr[3] = product_id;
            objArr[4] = OneTrack.Param.ASSET_NAME;
            String sku_name = skuObject.getSku_name();
            if (sku_name == null) {
                sku_name = "";
            }
            objArr[5] = sku_name;
            objArr[6] = "source";
            Bundle bundle = this.trackBundle;
            objArr[7] = Integer.valueOf(bundle != null ? bundle.getInt("source") : 0);
            objArr[8] = "utm_source";
            Bundle bundle2 = this.trackBundle;
            objArr[9] = Integer.valueOf(bundle2 != null ? bundle2.getInt("utm_source") : 0);
            objArr[10] = "device_model";
            if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
                model = "";
            }
            objArr[11] = model;
            objArr[12] = "device_version";
            if (wearableDeviceModel != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel)) != null) {
                str = firmwareVersion;
            }
            objArr[13] = str;
            oneTrackExtKt.reportData(oneTrackStatBean, objArr);
            return;
        }
        if ((mPayType != null && mPayType.intValue() == 3) || (mPayType != null && mPayType.intValue() == 2)) {
            IOnetrack oneTrackExtKt2 = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean2 = new OneTrackStatBean("expose_v3", "56.0.0.0.40472");
            Object[] objArr2 = new Object[12];
            objArr2[0] = "name";
            objArr2[1] = "Class_pay";
            objArr2[2] = "asset_id";
            Bundle bundle3 = this.trackBundle;
            objArr2[3] = String.valueOf(bundle3 != null ? bundle3.getLong("courseId") : 0L);
            objArr2[4] = OneTrack.Param.ASSET_NAME;
            Bundle bundle4 = this.trackBundle;
            if (bundle4 != null && (string = bundle4.getString("name")) != null) {
                str = string;
            }
            objArr2[5] = str;
            objArr2[6] = "type_pay";
            String str2 = this.channel;
            int iHashCode = str2.hashCode();
            if (iHashCode != 73364844) {
                if (iHashCode == 83046919) {
                    str2.equals("WXPAY");
                } else if (iHashCode == 1933336138 && str2.equals("ALIPAY")) {
                    i = 1;
                }
                i = 0;
            } else if (!str2.equals("MIPAY")) {
                i = 0;
            }
            objArr2[7] = Integer.valueOf(i);
            objArr2[8] = "source";
            Bundle bundle5 = this.trackBundle;
            objArr2[9] = Integer.valueOf(bundle5 != null ? bundle5.getInt("courseSource") : 0);
            objArr2[10] = Constants.KEY_PRICE;
            objArr2[11] = Integer.valueOf(this.price);
            oneTrackExtKt2.reportData(oneTrackStatBean2, objArr2);
        }
    }

    private final void trackPay() {
        String string;
        SkuObject skuObject;
        int i;
        String model;
        String firmwareVersion;
        Integer mPayType = getMPayType();
        String str = "";
        if (mPayType == null || mPayType.intValue() != 1) {
            if ((mPayType != null && mPayType.intValue() == 3) || (mPayType != null && mPayType.intValue() == 2)) {
                IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
                OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.0.0.0.40475");
                Object[] objArr = new Object[12];
                objArr[0] = "name";
                objArr[1] = "Class_pay";
                int i2 = 2;
                objArr[2] = "asset_id";
                Bundle bundle = this.trackBundle;
                objArr[3] = String.valueOf(bundle != null ? bundle.getLong("courseId") : 0L);
                objArr[4] = OneTrack.Param.ASSET_NAME;
                Bundle bundle2 = this.trackBundle;
                if (bundle2 != null && (string = bundle2.getString("name")) != null) {
                    str = string;
                }
                objArr[5] = str;
                objArr[6] = "type_pay";
                String str2 = this.channel;
                int iHashCode = str2.hashCode();
                if (iHashCode != 73364844) {
                    if (iHashCode == 83046919) {
                        str2.equals("WXPAY");
                    } else if (iHashCode == 1933336138 && str2.equals("ALIPAY")) {
                        i2 = 1;
                    }
                    i2 = 0;
                } else if (!str2.equals("MIPAY")) {
                    i2 = 0;
                }
                objArr[7] = Integer.valueOf(i2);
                objArr[8] = "source";
                Bundle bundle3 = this.trackBundle;
                objArr[9] = Integer.valueOf(bundle3 != null ? bundle3.getInt("courseSource") : 0);
                objArr[10] = Constants.KEY_PRICE;
                objArr[11] = Integer.valueOf(this.price);
                oneTrackExtKt.reportData(oneTrackStatBean, objArr);
                return;
            }
            return;
        }
        ArrayList<SkuObject> arrayList = this.skuObject;
        if (arrayList == null || (skuObject = (SkuObject) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList)) == null) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        IOnetrack oneTrackExtKt2 = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean2 = new OneTrackStatBean("click_v3", "56.106.0.1.39951");
        Object[] objArr2 = new Object[18];
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
        objArr2[6] = "type_pay";
        String str3 = this.channel;
        int iHashCode2 = str3.hashCode();
        if (iHashCode2 != 73364844) {
            if (iHashCode2 == 83046919) {
                str3.equals("WXPAY");
            } else if (iHashCode2 == 1933336138 && str3.equals("ALIPAY")) {
                i = 1;
            }
        } else {
            i = !str3.equals("MIPAY") ? 0 : 2;
        }
        objArr2[7] = Integer.valueOf(i);
        objArr2[8] = "source";
        Bundle bundle4 = this.trackBundle;
        objArr2[9] = Integer.valueOf(bundle4 != null ? bundle4.getInt("source") : 0);
        objArr2[10] = "utm_source";
        Bundle bundle5 = this.trackBundle;
        objArr2[11] = Integer.valueOf(bundle5 != null ? bundle5.getInt("utm_source") : 0);
        objArr2[12] = Constants.KEY_PRICE;
        objArr2[13] = Integer.valueOf(this.price);
        objArr2[14] = "device_model";
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr2[15] = model;
        objArr2[16] = "device_version";
        if (wearableDeviceModel != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel)) != null) {
            str = firmwareVersion;
        }
        objArr2[17] = str;
        oneTrackExtKt2.reportData(oneTrackStatBean2, objArr2);
    }

    @NotNull
    public final String getCurrentCountDownStr() {
        return this.currentCountDownStr;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return uui.c;
    }

    @NotNull
    public final PayChannelAdapter getPayChannelAdapter() {
        PayChannelAdapter payChannelAdapter = this.payChannelAdapter;
        if (payChannelAdapter != null) {
            return payChannelAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("payChannelAdapter");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return jv1.f23165b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (!this.startTimer) {
            super.lambda$onCreate$0();
        } else {
            getExitPayDialog().showIfNeed(getSupportFragmentManager());
            refreshDialogCountdownText(this.currentCountDownStr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.pay.channel.Hilt_PayChannelActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        setActionBarNormalTitleMode();
        setTitleBackground(tji.c);
        setTitle(r0j.f32054r);
        Intent intent = getIntent();
        this.skuObject = intent != null ? intent.getParcelableArrayListExtra(SKU_OBJECT) : null;
        Intent intent2 = getIntent();
        if (intent2 == null || (stringExtra = intent2.getStringExtra("order_id")) == null) {
            stringExtra = "";
        }
        this.orderId = stringExtra;
        Intent intent3 = getIntent();
        this.needDid = intent3 != null ? intent3.getBooleanExtra(ORDER_NEED_DID, false) : false;
        Intent intent4 = getIntent();
        this.needModel = intent4 != null ? intent4.getBooleanExtra(ORDER_NEED_MODEL, false) : false;
        Intent intent5 = getIntent();
        this.needFW = intent5 != null ? intent5.getBooleanExtra(ORDER_NEED_FW, false) : false;
        Intent intent6 = getIntent();
        this.trackBundle = intent6 != null ? intent6.getBundleExtra(PAY_TRACK_BUNDLE) : null;
        if (this.orderId.length() == 0) {
            createOrder();
        } else {
            getOrderInfo();
        }
        getPaymentChannel();
        setPayChannelAdapter(new PayChannelAdapter(new C27421(this)));
        ((jnh) getMBinding()).A.setAdapter(getPayChannelAdapter());
        ((PayChannelViewModel) getMViewModel()).getPayChannel().observe(this, new PayChannelActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: omh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayChannelActivity.onCreate$lambda$1(this.f29298a, (List) obj);
            }
        }));
        addListener();
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, yni.f40346a, getString(r0j.c), new View.OnClickListener() { // from class: pmh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayChannelActivity.onCreate$lambda$2(this.f30541a, view);
            }
        }, 1, null);
    }

    public final void setCurrentCountDownStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentCountDownStr = str;
    }

    public final void setPayChannelAdapter(@NotNull PayChannelAdapter payChannelAdapter) {
        Intrinsics.checkNotNullParameter(payChannelAdapter, "<set-?>");
        this.payChannelAdapter = payChannelAdapter;
    }
}
