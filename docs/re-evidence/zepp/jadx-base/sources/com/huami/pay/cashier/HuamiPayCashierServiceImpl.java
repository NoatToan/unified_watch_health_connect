package com.huami.pay.cashier;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.pay.lib.PayConstantsKt;
import com.huami.pay.service.HuamiPayCashierService;
import com.huami.pay.service.HuamiPayService;
import com.huami.pay.service.PayChannel;
import com.huami.pay.service.PayProgress;
import com.huami.pay.service.PayResult;
import com.huami.pay.service.ProductCashierParam;
import com.huami.pay.service.ProductParam;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0002J)\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\u00020\b2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\b0\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R3\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006&"}, d2 = {"Lcom/huami/pay/cashier/HuamiPayCashierServiceImpl;", "Lcom/huami/pay/service/HuamiPayCashierService;", "Landroid/app/Activity;", "activity", "Lcom/huami/pay/service/PayChannel;", "payChannel", "Lcom/huami/pay/service/ProductCashierParam;", "productCashierParam", "", "c", "a", "", "resId", "", "b", "payCashierTheme", "payCashier", "(Landroid/app/Activity;Lcom/huami/pay/service/ProductCashierParam;Ljava/lang/Integer;)V", "Lkotlin/Function1;", "Lcom/huami/pay/service/PayProgress;", "Lkotlin/ParameterName;", "name", "payProgress", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setPayProgressListener", "Lcom/huami/pay/service/PayResult;", "payResult", "getResultMessage", "Lkotlin/jvm/functions/Function1;", "payProgressListener", "Lcom/huami/pay/service/HuamiPayService;", "Lcom/huami/pay/service/HuamiPayService;", "huamiPayService", "Lcom/huami/pay/cashier/PayCashierFragment;", "Lcom/huami/pay/cashier/PayCashierFragment;", "payCashierFragment", "<init>", "()V", "pay-cashier_release"}, k = 1, mv = {1, 5, 1})
public final class HuamiPayCashierServiceImpl implements HuamiPayCashierService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function1<? super PayProgress, Unit> payProgressListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HuamiPayService huamiPayService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private PayCashierFragment payCashierFragment;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PayResult.values().length];
            iArr[PayResult.CODE_SUCCESS.ordinal()] = 1;
            iArr[PayResult.CODE_ALI_FAILED.ordinal()] = 2;
            iArr[PayResult.CODE_PAY_CHANNEL_NOT_SUPPORT.ordinal()] = 3;
            iArr[PayResult.CODE_CLOUD_PAY_RESULT_NULL.ordinal()] = 4;
            iArr[PayResult.CODE_GOOGLE_FEATURE_NOT_SUPPORTED.ordinal()] = 5;
            iArr[PayResult.CODE_GOOGLE_ITEM_NOT_OWNED.ordinal()] = 6;
            iArr[PayResult.CODE_ALI_NET_ERROR.ordinal()] = 7;
            iArr[PayResult.CODE_CLOUD_PAY_GENERATE_EXCEPTION.ordinal()] = 8;
            iArr[PayResult.CODE_CLOUD_NOTIFICATION_FAIL.ordinal()] = 9;
            iArr[PayResult.CODE_CLOUD_NOTIFICATION_EXCEPTION.ordinal()] = 10;
            iArr[PayResult.CODE_GOOGLE_SERVICE_TIMEOUT.ordinal()] = 11;
            iArr[PayResult.CODE_GOOGLE_SERVICE_DISCONNECTED.ordinal()] = 12;
            iArr[PayResult.CODE_GOOGLE_SERVICE_UNAVAILABLE.ordinal()] = 13;
            iArr[PayResult.CODE_GOOGLE_ITEM_UNAVAILABLE.ordinal()] = 14;
            iArr[PayResult.CODE_GOOGLE_BILLING_UNAVAILABLE.ordinal()] = 15;
            iArr[PayResult.CODE_WECHAT_REQUEST_FAIL.ordinal()] = 16;
            iArr[PayResult.CODE_WECHAT_REGISTER_APP_FAIL.ordinal()] = 17;
            iArr[PayResult.CODE_WECHAT_SEND_REQUEST_FAIL.ordinal()] = 18;
            iArr[PayResult.CODE_WECHAT_ERROR.ordinal()] = 19;
            iArr[PayResult.CODE_ALI_UNKNOWN_OTHER.ordinal()] = 20;
            iArr[PayResult.CODE_GOOGLE_DEVELOPER_ERROR.ordinal()] = 21;
            iArr[PayResult.CODE_GOOGLE_ERROR.ordinal()] = 22;
            iArr[PayResult.CODE_GOOGLE_SKU_DETAIL_NULL.ordinal()] = 23;
            iArr[PayResult.CODE_WECHAT_UNKNOWN.ordinal()] = 24;
            iArr[PayResult.CODE_ALI_UNKNOWN.ordinal()] = 25;
            iArr[PayResult.CODE_ALI_UNKNOWN_CURRENT.ordinal()] = 26;
            iArr[PayResult.CODE_CLOUD_PAY_RESULT_SKU_NULL.ordinal()] = 27;
            iArr[PayResult.CODE_WECHAT_CANCEL.ordinal()] = 28;
            iArr[PayResult.CODE_ALI_CANCEL.ordinal()] = 29;
            iArr[PayResult.CODE_GOOGLE_USER_CANCELED.ordinal()] = 30;
            iArr[PayResult.CODE_ALI_REPEAT.ordinal()] = 31;
            iArr[PayResult.CODE_GOOGLE_ITEM_ALREADY_OWNED.ordinal()] = 32;
            iArr[PayResult.CODE_WECHAT_NOT_INSTALL.ordinal()] = 33;
            iArr[PayResult.CODE_ALI_UNINSTALL.ordinal()] = 34;
            iArr[PayResult.CODE_QUERY_ORDER_STATE_EXCEPTION.ordinal()] = 35;
            iArr[PayResult.CODE_GOOGLE_PURCHASE_NULL.ordinal()] = 36;
            iArr[PayResult.CODE_ALI_PROCESSING.ordinal()] = 37;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/pay/service/PayProgress;", "payProgress", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayProgress, Unit> {

        /* JADX INFO: renamed from: com.huami.pay.cashier.HuamiPayCashierServiceImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0527a extends Lambda implements Function0<String> {
            public final /* synthetic */ PayProgress a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0527a(PayProgress payProgress) {
                super(0);
                this.a = payProgress;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "progress:" + this.a;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull PayProgress payProgress) {
            HMLog.info(PayConstantsKt.PAY_TAG, new C0527a(payProgress));
            Function1 function1 = HuamiPayCashierServiceImpl.this.payProgressListener;
            if (function1 != null) {
                function1.invoke(payProgress);
            }
            PayCashierFragment payCashierFragment = HuamiPayCashierServiceImpl.this.payCashierFragment;
            if (payCashierFragment != null && payCashierFragment.isVisible()) {
                payCashierFragment.updatePayProgressView(payProgress);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayProgress payProgress) {
            a(payProgress);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/pay/service/PayChannel;", "payChannel", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayChannel, Unit> {
        public final /* synthetic */ Activity b;
        public final /* synthetic */ ProductCashierParam c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, ProductCashierParam productCashierParam) {
            super(1);
            this.b = activity;
            this.c = productCashierParam;
        }

        public final void a(@NotNull PayChannel payChannel) {
            HuamiPayCashierServiceImpl.this.c(this.b, payChannel, this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayChannel payChannel) {
            a(payChannel);
            return Unit.INSTANCE;
        }
    }

    public HuamiPayCashierServiceImpl() {
        HuamiPayService huamiPayService = (HuamiPayService) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HuamiPayService.class), null, null);
        this.huamiPayService = huamiPayService;
        huamiPayService.setPayProgressListener(new a());
    }

    private final void a() {
        try {
            PayCashierFragment payCashierFragment = this.payCashierFragment;
            if (payCashierFragment != null) {
                payCashierFragment.dismissAllowingStateLoss();
            }
        } catch (Exception unused) {
        }
        this.payCashierFragment = null;
    }

    private final String b(@StringRes int resId) {
        return ((Context) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).getString(resId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Activity activity, PayChannel payChannel, ProductCashierParam productCashierParam) {
        this.huamiPayService.pay(activity, new ProductParam(productCashierParam.getUserId(), payChannel, productCashierParam.getDescription(), productCashierParam.getSkus(), productCashierParam.getSkuType(), productCashierParam.getNeedConsume()));
    }

    @Override // com.huami.pay.service.HuamiPayCashierService
    @NotNull
    public String getResultMessage(@NotNull PayResult payResult) {
        switch (WhenMappings.$EnumSwitchMapping$0[payResult.ordinal()]) {
            case 1:
                return b(R.string.pay_cashier_pay_success);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return b(R.string.pay_cashier_request_fail);
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return b(R.string.pay_cashier_net_fail);
            case 13:
            case 14:
            case 15:
                return b(R.string.pay_cashier_not_support);
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return b(R.string.pay_cashier_error);
            case 24:
            case 25:
            case 26:
            case 27:
                return b(R.string.pay_cashier_need_service_help);
            case 28:
            case 29:
            case 30:
                return b(R.string.pay_cashier_order_cancel);
            case 31:
            case 32:
                return b(R.string.pay_cashier_pay_repeat);
            case 33:
                return b(R.string.pay_cashier_pay_not_install_wx);
            case 34:
                return b(R.string.pay_cashier_pay_not_install_ali);
            case 35:
                return b(R.string.pay_cashier_pay_query_order_fail);
            case 36:
            case 37:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.huami.pay.service.HuamiPayCashierService
    public void payCashier(@NotNull Activity activity, @NotNull ProductCashierParam productCashierParam, @Nullable Integer payCashierTheme) {
        if (activity instanceof FragmentActivity) {
            a();
            PayCashierFragment payCashierFragmentCreate = new PayCashierFragment.Builder().setPrice(productCashierParam.getPrice()).setSupportChannel(productCashierParam.getSupportChannel()).setPayClickButton(new b(activity, productCashierParam)).create(payCashierTheme);
            this.payCashierFragment = payCashierFragmentCreate;
            payCashierFragmentCreate.show(((FragmentActivity) activity).getSupportFragmentManager(), "");
        }
    }

    @Override // com.huami.pay.service.HuamiPayCashierService
    public void setPayProgressListener(@NotNull Function1<? super PayProgress, Unit> listener) {
        this.payProgressListener = listener;
    }
}
