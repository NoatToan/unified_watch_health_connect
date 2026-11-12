package com.xiaomi.fitness.nfc.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.ErrorCode;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.pay.TransitCardPayRule;
import com.miui.tsmclient.sesdk.OrderData;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.common.CommonBaseActivity;
import com.xiaomi.fitness.nfc.ui.BaseRechargeFragment;
import com.xiaomi.fitness.nfc.ui.realname.RealNameRemindInfoKt;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.bg4;
import defpackage.fmg;
import defpackage.gzp;
import defpackage.jz6;
import defpackage.na4;
import defpackage.o0j;
import defpackage.o4h;
import defpackage.o63;
import defpackage.ofl;
import defpackage.s3q;
import defpackage.ua1;
import defpackage.voh;
import defpackage.vqg;
import defpackage.yhj;
import defpackage.zl3;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 M*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001MB\u001f\u0012\u0006\u0010H\u001a\u00020\u0019\u0012\u0006\u0010I\u001a\u00020\u0019\u0012\u0006\u0010J\u001a\u00020\u0010¢\u0006\u0004\bK\u0010LJ\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\bH\u0014¢\u0006\u0004\b!\u0010\fJ'\u0010%\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0014¢\u0006\u0004\b'\u0010\fJ)\u0010,\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\fJ\u0019\u00100\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b0\u0010\nR\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\u00198\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006N"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/BaseRechargeFragment;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Landroid/os/Bundle;", "extras", "", "createOrder", "(Landroid/os/Bundle;)V", "handleOrder", "()V", "gotoRechargeFailPage", "startResultActivity", LifecycleConstantKt.ON_RESUME, "", "isUseAlipayChanel", "()Z", "clickRechargeBtn", "", "channel", "doCreateOrder", "(Ljava/lang/String;)V", "checkValue", "", "code", "msg", "showDefaultError", "(ILjava/lang/String;)V", "errorCode", Constants.EXTRA_ERROR_MESSAGE, "showError", "queryOrderStatus", "titleResId", "messageResId", "message", "showConfirmDialog", "(IILjava/lang/String;)V", "doPay", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", LifecycleConstantKt.ON_DESTROY, "savedInstanceState", "onCreate", "Lna4;", "compositeDisposable", "Lna4;", "Lcom/miui/tsmclient/pay/TransitCardPayRule;", "mPayRule", "Lcom/miui/tsmclient/pay/TransitCardPayRule;", "getMPayRule", "()Lcom/miui/tsmclient/pay/TransitCardPayRule;", "setMPayRule", "(Lcom/miui/tsmclient/pay/TransitCardPayRule;)V", "mAmountValue", "I", "getMAmountValue", "()I", "setMAmountValue", "(I)V", "Lvoh;", "mPaySelector", "Lvoh;", "getMPaySelector", "()Lvoh;", "setMPaySelector", "(Lvoh;)V", "layoutId", "viewModle", "isShare", "<init>", "(IIZ)V", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseRechargeFragment<VM extends AbsViewModel, VDB extends ViewDataBinding> extends BaseCardFragment<VM, VDB> {
    private static final int MAX_RETRY_COUNT_FOR_QUERY_ORDER = 12;
    private static final int TIME_QUERY_DELAY = 5000;

    @NotNull
    private na4 compositeDisposable;
    private int mAmountValue;

    @NotNull
    private TransitCardPayRule mPayRule;

    @NotNull
    private voh mPaySelector;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int sRequestCodeTSMResult = 1111111;
    private static final int sRequestCodeCardOrder = 1111112;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/BaseRechargeFragment$Companion;", "", "<init>", "()V", "MAX_RETRY_COUNT_FOR_QUERY_ORDER", "", "TIME_QUERY_DELAY", "sRequestCodeTSMResult", "getSRequestCodeTSMResult", "()I", "sRequestCodeCardOrder", "getSRequestCodeCardOrder", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSRequestCodeCardOrder() {
            return BaseRechargeFragment.sRequestCodeCardOrder;
        }

        public final int getSRequestCodeTSMResult() {
            return BaseRechargeFragment.sRequestCodeTSMResult;
        }
    }

    public BaseRechargeFragment(int i, int i2, boolean z) {
        super(i, i2, z);
        this.compositeDisposable = new na4();
        this.mPayRule = new TransitCardPayRule();
        this.mPaySelector = new voh();
    }

    private final void createOrder(Bundle extras) {
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        if (!cardWrapper.isSupportNewPay()) {
            doCreateOrder("ucashier");
            return;
        }
        FragmentParams fragmentParamsB = new FragmentParams.b().e(NewPayFragment.class).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        Intent intent = new Intent();
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        intent.setClass(mActivity, CommonBaseActivity.class);
        intent.putExtra("fragment_param", (Parcelable) fragmentParamsB);
        startActivityForResult(intent, NewPayFragment.RQUEST_CODE_NEWPAY_FRAGMENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doCreateOrder$lambda$0(BaseRechargeFragment this$0, OrderData.Order order) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vqg.b("doCreateOrder success");
        this$0.dismissDialog();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        cardWrapper.mOrderInfo = order;
        CardWrapper cardWrapper2 = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper2);
        if (cardWrapper2.selectedFee.getTotalPay() == 0) {
            this$0.queryOrderStatus();
            return Unit.INSTANCE;
        }
        this$0.doPay();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateOrder$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doCreateOrder$lambda$3(final BaseRechargeFragment this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vqg.c("doCreateOrder", th);
        this$0.dismissDialog();
        if (th instanceof AuthApiException) {
            CardWrapper cardWrapper = this$0.getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            RealNameRemindInfoKt.handleAuthApiException(this$0, cardWrapper, (AuthApiException) th, new Function1() { // from class: ma2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseRechargeFragment.doCreateOrder$lambda$3$lambda$2(this.f25934a, (AuthApiException) obj);
                }
            });
        } else {
            this$0.showError(-2, th.toString());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doCreateOrder$lambda$3$lambda$2(BaseRechargeFragment this$0, AuthApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showError(it.mErrorCode, it.mErrorMsg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateOrder$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    private final void gotoRechargeFailPage() {
        zl3.g().l(getCardWrapper());
        Bundle bundle = new Bundle();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        OrderData.Order mOrderInfo = cardWrapper.mOrderInfo;
        Intrinsics.checkNotNullExpressionValue(mOrderInfo, "mOrderInfo");
        bundle.putString(CardOrderDetailFragment.sOrderId, mOrderInfo.getOrderId());
        bundle.putBoolean(CardOrderDetailFragment.sIsFromIssue, false);
        bundle.putInt(CardOrderDetailFragment.sAmount, mOrderInfo.getPayFee());
        gotoPageForResult(CardOrderDetailFragment.class, bundle, sRequestCodeCardOrder);
    }

    private final void handleOrder() {
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        if (!cardWrapper.mHasIssue) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putString(IssuerFragment.EXTRA_ISSUE_CARD_STATUS, getString(o0j.u1));
            o4h<CardWrapper> o4hVarZ1 = s3q.f0().z1(getCardWrapper());
            final Function1 function1 = new Function1() { // from class: va2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseRechargeFragment.handleOrder$lambda$9(this.f36652a, (CardWrapper) obj);
                }
            };
            bg4<? super CardWrapper> bg4Var = new bg4() { // from class: wa2
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    BaseRechargeFragment.handleOrder$lambda$10(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: xa2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseRechargeFragment.handleOrder$lambda$11((Throwable) obj);
                }
            };
            jz6 jz6VarO = o4hVarZ1.O(bg4Var, new bg4() { // from class: ya2
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    BaseRechargeFragment.handleOrder$lambda$12(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(jz6VarO, "subscribe(...)");
            this.compositeDisposable.a(jz6VarO);
            return;
        }
        showLoading(o0j.L1, false);
        s3q s3qVarF0 = s3q.f0();
        CardWrapper cardWrapper2 = getCardWrapper();
        CardWrapper cardWrapper3 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper3);
        o4h<BaseResponse> o4hVarL1 = s3qVarF0.l1(cardWrapper2, cardWrapper3.mOrderInfo.getOrderId());
        final Function1 function3 = new Function1() { // from class: ja2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseRechargeFragment.handleOrder$lambda$5(this.f22576a, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var2 = new bg4() { // from class: sa2
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BaseRechargeFragment.handleOrder$lambda$6(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: ta2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseRechargeFragment.handleOrder$lambda$7(this.f34491a, (Throwable) obj);
            }
        };
        jz6 jz6VarO2 = o4hVarL1.O(bg4Var2, new bg4() { // from class: ua2
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BaseRechargeFragment.handleOrder$lambda$8(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarO2, "subscribe(...)");
        this.compositeDisposable.a(jz6VarO2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleOrder$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleOrder$lambda$11(Throwable th) {
        ToastUtil.showLongToast(fmg.c(th));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleOrder$lambda$12(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleOrder$lambda$5(BaseRechargeFragment this$0, BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (baseResponse.isSuccess()) {
            CardWrapper cardWrapper = this$0.getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            cardWrapper.mOrderInfo = null;
            vqg.d("recharge success!");
            o63.b(new yhj());
            this$0.startResultActivity();
        } else {
            this$0.gotoRechargeFailPage();
            ToastUtil.showLongToast(gzp.c(this$0.getCardWrapper()) ? fmg.d(baseResponse.mMsg) : baseResponse.mMsg);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleOrder$lambda$6(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleOrder$lambda$7(BaseRechargeFragment this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        vqg.c("recharge", th);
        this$0.gotoRechargeFailPage();
        ToastUtil.showLongToast(gzp.c(this$0.getCardWrapper()) ? fmg.e(th) : th.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleOrder$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleOrder$lambda$9(BaseRechargeFragment this$0, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<OrderData.Fee> activeFeeInfoList = cardWrapper.getActiveFeeInfoList();
        if (activeFeeInfoList != null && (!activeFeeInfoList.isEmpty())) {
            cardWrapper.selectedFee = activeFeeInfoList.get(0);
        }
        Intent intent = new Intent();
        Bundle arguments = this$0.getArguments();
        if (arguments != null) {
            intent.putExtras(arguments);
        }
        zl3.g().l(cardWrapper);
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1, intent);
        }
        FragmentActivity mActivity2 = this$0.getMActivity();
        if (mActivity2 != null) {
            mActivity2.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderData.Order queryOrderStatus$lambda$13(BaseRechargeFragment this$0) throws InterruptedException, AuthApiException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (int i = 0; i < 12; i++) {
            CardWrapper cardWrapper = this$0.getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            boolean zIsPaid = cardWrapper.mOrderInfo.isPaid();
            if (zIsPaid) {
                break;
            }
            vqg.d("queryOrderStatus retryCount:" + i + "  isPaid:" + zIsPaid);
            Thread.sleep(5000L);
            CardWrapper cardWrapper2 = this$0.getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper2);
            cardWrapper2.mOrderInfo.update();
        }
        CardWrapper cardWrapper3 = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper3);
        return cardWrapper3.mOrderInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryOrderStatus$lambda$14(BaseRechargeFragment this$0, OrderData.Order order) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(order, "order");
        boolean zIsPaid = order.isPaid();
        this$0.dismissDialogForce();
        vqg.d("queryOrderStatus end isPaid:" + zIsPaid);
        if (zIsPaid) {
            this$0.handleOrder();
        } else {
            ToastUtil.showLongToast(o0j.U1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryOrderStatus$lambda$15(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit queryOrderStatus$lambda$16(BaseRechargeFragment this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        vqg.c("queryOrderStatus end error", th);
        if (this$0.isFragmentValid()) {
            if (th instanceof AuthApiException) {
                AuthApiException authApiException = (AuthApiException) th;
                this$0.showError(authApiException.mErrorCode, authApiException.mErrorMsg);
            } else {
                this$0.showError(-2, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryOrderStatus$lambda$17(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    private final void startResultActivity() {
        Bundle bundle = new Bundle();
        zl3.g().l(getCardWrapper());
        bundle.putString(Constants.KEY_INTENT_FROM, TSMResultFragment.INSTANCE.getFROM_RECHARGE());
        bundle.putInt("recharge_amount", getMAmountValue() * 100);
        gotoPageForResult(TSMResultFragment.class, bundle, sRequestCodeTSMResult);
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1);
        }
        finish();
    }

    public final boolean checkValue() {
        String string;
        TransitCardPayRule transitCardPayRule = this.mPayRule;
        int mAmountValue = getMAmountValue() * 100;
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        int iCheckPayAmount = transitCardPayRule.checkPayAmount(mAmountValue, cardWrapper.mCardBalance);
        if (iCheckPayAmount == 1006) {
            string = getString(o0j.M1, Integer.valueOf(this.mPayRule.getMinPayAmount() / 100));
        } else if (iCheckPayAmount != 1008) {
            string = iCheckPayAmount != 1013 ? "" : getString(o0j.Q3);
        } else {
            string = getString(o0j.P3);
        }
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        ToastUtil.showToast(string);
        return false;
    }

    public final void clickRechargeBtn() {
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        ToastUtil.showShortToast(cardWrapper.getRechargeStatusDesc());
        CardWrapper cardWrapper2 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper2);
        if (cardWrapper2.getRechargeStatus() == 4) {
            return;
        }
        CardWrapper cardWrapper3 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper3);
        if (cardWrapper3.mOrderInfo != null) {
            CardWrapper cardWrapper4 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper4);
            if (cardWrapper4.mOrderInfo.isPaid()) {
                handleOrder();
                return;
            }
        }
        NfcUtils nfcUtils = NfcUtils.INSTANCE;
        CardWrapper cardWrapper5 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper5);
        int cardStatusMsg = nfcUtils.getCardStatusMsg(cardWrapper5);
        if (cardStatusMsg != -1) {
            ToastUtil.showShortToast(cardStatusMsg);
        } else if (checkValue()) {
            createOrder(null);
        }
    }

    public final void doCreateOrder(@NotNull String channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        PageState.DefaultImpls.showLoading$default(this, o0j.K1, false, 2, null);
        s3q s3qVarF0 = s3q.f0();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        o4h<OrderData.Order> o4hVarP = s3qVarF0.P(channel, cardWrapper.selectedFee, zl3.g().f41418a, getCardWrapper());
        final Function1 function1 = new Function1() { // from class: za2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseRechargeFragment.doCreateOrder$lambda$0(this.f41061a, (OrderData.Order) obj);
            }
        };
        bg4<? super OrderData.Order> bg4Var = new bg4() { // from class: ab2
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BaseRechargeFragment.doCreateOrder$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ka2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseRechargeFragment.doCreateOrder$lambda$3(this.f23649a, (Throwable) obj);
            }
        };
        jz6 jz6VarO = o4hVarP.O(bg4Var, new bg4() { // from class: la2
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BaseRechargeFragment.doCreateOrder$lambda$4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarO, "subscribe(...)");
        this.compositeDisposable.a(jz6VarO);
    }

    public void doPay() {
        voh vohVar = this.mPaySelector;
        FragmentActivity mActivity = getMActivity();
        CardWrapper cardWrapper = getCardWrapper();
        CardWrapper cardWrapper2 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper2);
        vohVar.b(mActivity, cardWrapper, cardWrapper2.mOrderInfo);
    }

    public int getMAmountValue() {
        return this.mAmountValue;
    }

    @NotNull
    public final TransitCardPayRule getMPayRule() {
        return this.mPayRule;
    }

    @NotNull
    public final voh getMPaySelector() {
        return this.mPaySelector;
    }

    public boolean isUseAlipayChanel() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestCodeCardOrder || requestCode == sRequestCodeTSMResult) {
            if (resultCode == -1) {
                FragmentActivity mActivity = getMActivity();
                if (mActivity != null) {
                    mActivity.setResult(-1);
                }
                finish();
                return;
            }
            return;
        }
        if (requestCode == 222222 && resultCode == -1) {
            FragmentActivity mActivity2 = getMActivity();
            if (mActivity2 != null) {
                mActivity2.setResult(-1);
            }
            finish();
        }
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CardWrapper cardWrapper = getCardWrapper();
        if (cardWrapper != null) {
            cardWrapper.mOrderInfo = null;
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.compositeDisposable.dispose();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        boolean zIsUseAlipayChanel = isUseAlipayChanel();
        vqg.d("mPaySelector status:" + this.mPaySelector.f37087a + " isUseAlipayChanel:" + zIsUseAlipayChanel);
        if (!this.mPaySelector.a() || zIsUseAlipayChanel) {
            return;
        }
        this.mPaySelector.f37087a = 3;
        queryOrderStatus();
    }

    public void queryOrderStatus() {
        showLoading(o0j.P1, false);
        na4 na4Var = this.compositeDisposable;
        o4h o4hVarH = o4h.v(new Callable() { // from class: na2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BaseRechargeFragment.queryOrderStatus$lambda$13(this.f27698a);
            }
        }).S(ofl.c()).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: oa2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseRechargeFragment.queryOrderStatus$lambda$14(this.f28909a, (OrderData.Order) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: pa2
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BaseRechargeFragment.queryOrderStatus$lambda$15(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: qa2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseRechargeFragment.queryOrderStatus$lambda$16(this.f31269a, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarH.O(bg4Var, new bg4() { // from class: ra2
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                BaseRechargeFragment.queryOrderStatus$lambda$17(function2, obj);
            }
        }));
    }

    public void setMAmountValue(int i) {
        this.mAmountValue = i;
    }

    public final void setMPayRule(@NotNull TransitCardPayRule transitCardPayRule) {
        Intrinsics.checkNotNullParameter(transitCardPayRule, "<set-?>");
        this.mPayRule = transitCardPayRule;
    }

    public final void setMPaySelector(@NotNull voh vohVar) {
        Intrinsics.checkNotNullParameter(vohVar, "<set-?>");
        this.mPaySelector = vohVar;
    }

    public final void showConfirmDialog(int titleResId, int messageResId, @Nullable String message) {
        if (TextUtils.isEmpty(message)) {
            message = getString(messageResId);
        }
        ToastUtil.showShortToast(message);
    }

    public final void showDefaultError(int code, @Nullable String msg) {
        if (code == 1004) {
            showConfirmDialog(o0j.L, o0j.I, msg);
            CardWrapper cardWrapper = getCardWrapper();
            if (cardWrapper != null) {
                cardWrapper.mOrderInfo = null;
            }
            return;
        }
        if (code == 1012) {
            showConfirmDialog(o0j.K, o0j.H, msg);
            CardWrapper cardWrapper2 = getCardWrapper();
            if (cardWrapper2 != null) {
                cardWrapper2.mOrderInfo = null;
                return;
            }
            return;
        }
        switch (code) {
            case 1136:
                showConfirmDialog(o0j.K, o0j.v, msg);
                CardWrapper cardWrapper3 = getCardWrapper();
                if (cardWrapper3 != null) {
                    cardWrapper3.mOrderInfo = null;
                }
                break;
            case 1137:
                showConfirmDialog(o0j.K, o0j.u, msg);
                CardWrapper cardWrapper4 = getCardWrapper();
                if (cardWrapper4 != null) {
                    cardWrapper4.mOrderInfo = null;
                }
                break;
            case 1138:
                showConfirmDialog(o0j.K, o0j.x, msg);
                CardWrapper cardWrapper5 = getCardWrapper();
                if (cardWrapper5 != null) {
                    cardWrapper5.mOrderInfo = null;
                }
                break;
            case 1139:
                showConfirmDialog(o0j.K, o0j.w, msg);
                CardWrapper cardWrapper6 = getCardWrapper();
                if (cardWrapper6 != null) {
                    cardWrapper6.mOrderInfo = null;
                }
                break;
            case 1140:
                showConfirmDialog(o0j.K, o0j.H, msg);
                CardWrapper cardWrapper7 = getCardWrapper();
                if (cardWrapper7 != null) {
                    cardWrapper7.mOrderInfo = null;
                }
                break;
            case 1141:
                showConfirmDialog(o0j.K, o0j.H, msg);
                CardWrapper cardWrapper8 = getCardWrapper();
                if (cardWrapper8 != null) {
                    cardWrapper8.mOrderInfo = null;
                }
                break;
            default:
                ToastUtil.showToast(ErrorCode.getErrorText(getActivity(), code, msg));
                break;
        }
    }

    public final void showError(int errorCode, @Nullable String errorMsg) {
        if (errorCode == 205) {
            if (TextUtils.isEmpty(errorMsg)) {
                errorMsg = ResourceExtKt.getString(o0j.F);
            }
            ToastUtil.showShortToast(errorMsg);
        } else if (errorCode == 211) {
            if (TextUtils.isEmpty(errorMsg)) {
                errorMsg = ResourceExtKt.getString(o0j.G);
            }
            ToastUtil.showShortToast(errorMsg);
        } else {
            if (errorCode != 1000) {
                showDefaultError(errorCode, errorMsg);
                return;
            }
            if (TextUtils.isEmpty(errorMsg)) {
                errorMsg = ResourceExtKt.getString(o0j.G);
            }
            ToastUtil.showShortToast(errorMsg);
        }
    }
}
