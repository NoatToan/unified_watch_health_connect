package com.xiaomi.fitness.pay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.utils.MibiEnvironment;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.OrderBean;
import com.miui.tsmclient.net.TSMAuthContants;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.exception.export.ExceptionHelper;
import com.xiaomi.fitness.exception.export.ExceptionHelperExtKt;
import com.xiaomi.fitness.pay.PaymentManagerImpl;
import com.xiaomi.fitness.pay.dialog.DialogPayManager;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.pay.export.PaymentOrderType;
import com.xiaomi.fitness.pay.export.PaymentProgressListener;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.pay.export.data.response.MibiDeductResult;
import com.xiaomi.fitness.pay.export.data.response.MibiPayError;
import com.xiaomi.fitness.pay.export.data.response.MibiPayResult;
import com.xiaomi.fitness.pay.page.PaymentTranslucentActivity;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import io.sentry.SentryLevel;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u0012Jj\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016JL\u0010$\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016Jb\u0010&\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052 \u0010-\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u000100\u0012\u0004\u0012\u00020\u00140.H\u0016J@\u00101\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u001e\u00102\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00140.H\u0016J \u00104\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0016J\u0018\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0005H\u0016J\b\u00109\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/pay/PaymentManagerImpl;", "Lcom/xiaomi/fitness/pay/export/PaymentManager;", "<init>", "()V", "appSetStaging", "", "buildSkuObject", "Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", "spuId", "", "spuVersion", "", "skuId", Constants.KEY_PRICE, "", "quantity", "productId", "skuName", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;)Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", "intentToPay", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "skuList", "", "promotionId", PaymentOrderType.DEDUCT, "needDid", "needModel", "needFirmwareVersion", TSMAuthContants.PARAM_PAY_TYPE, "source", "trackBundle", "Landroid/os/Bundle;", "callback", "Lcom/xiaomi/fitness/pay/export/PaymentProgressListener;", "intentToRepay", "orderId", "payChannel", "channel", "mOrder", Constants.KEY_USE_BALANCE, "useGiftCard", "usePartnerGiftCard", Constants.KEY_NO_ACCOUNT, "mibiPayResult", "Lkotlin/Function3;", "Lcom/xiaomi/fitness/pay/export/data/response/MibiPayError;", "Lcom/xiaomi/fitness/pay/export/data/response/MibiPayResult;", "signDeduct", "signDeductResult", "Lcom/xiaomi/fitness/pay/export/data/response/MibiDeductResult;", "gotoOrderPageList", "target", "setStaging", "context", "Landroid/content/Context;", "isStaging", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentManagerImpl implements PaymentManager {
    private boolean appSetStaging;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit payChannel$lambda$0(Function3 mibiPayResult, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(mibiPayResult, "$mibiPayResult");
        if (i == -1) {
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("result") : null;
            mibiPayResult.invoke(Boolean.TRUE, new MibiPayError(i, null), new MibiPayResult(bundleExtra != null ? bundleExtra.getString(Constants.KEY_PAY_RESULT_RET) : null, bundleExtra != null ? bundleExtra.getString(Constants.KEY_PAY_RESULT_SENDERSIGN) : null));
        } else {
            String stringExtra = intent != null ? intent.getStringExtra("message") : null;
            mibiPayResult.invoke(Boolean.FALSE, new MibiPayError(i, stringExtra), null);
            ExceptionHelper.DefaultImpls.uploadEvent$default(ExceptionHelperExtKt.getInstance(ExceptionHelper.INSTANCE), CollectionsKt__CollectionsJVMKt.listOf("HlthCheckoutPay"), (SentryLevel) null, MapsKt__MapsKt.mapOf(TuplesKt.to("function", "pay_android"), TuplesKt.to("code", Integer.valueOf(i)), TuplesKt.to("message", stringExtra)), 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit signDeduct$lambda$1(Function3 signDeductResult, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(signDeductResult, "$signDeductResult");
        Bundle bundleExtra = intent != null ? intent.getBundleExtra("extra") : null;
        String string = bundleExtra != null ? bundleExtra.getString(Constants.KEY_MARKET_DEDUCT_ID) : null;
        String string2 = bundleExtra != null ? bundleExtra.getString("orderId") : null;
        if (i == -1) {
            signDeductResult.invoke(Boolean.TRUE, Integer.valueOf(i), new MibiDeductResult(string, string2, null, 0, 0, 28, null));
        } else {
            signDeductResult.invoke(Boolean.FALSE, Integer.valueOf(i), new MibiDeductResult(string, string2, bundleExtra != null ? bundleExtra.getString(Constants.KEY_CHARGE_STATUS) : null, bundleExtra != null ? bundleExtra.getInt(Constants.KEY_PAY_STATUS, 0) : 0, bundleExtra != null ? bundleExtra.getInt(Constants.KEY_DEDUCT_SIGN_STATUS, 0) : 0));
            ExceptionHelper.DefaultImpls.uploadEvent$default(ExceptionHelperExtKt.getInstance(ExceptionHelper.INSTANCE), CollectionsKt__CollectionsJVMKt.listOf("HlthCheckoutPay"), (SentryLevel) null, MapsKt__MapsKt.mapOf(TuplesKt.to("function", "deduct_android"), TuplesKt.to("code", Integer.valueOf(i))), 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentManager
    @NotNull
    public SkuObject buildSkuObject(@Nullable String spuId, @Nullable Integer spuVersion, @Nullable String skuId, @Nullable Long price, long quantity, @NotNull String productId, @NotNull String skuName) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(skuName, "skuName");
        return new SkuObject(spuId == null ? "" : spuId, spuVersion != null ? spuVersion.intValue() : 0, skuId == null ? "" : skuId, price != null ? price.longValue() : 0L, quantity, skuName, null, null, null, productId, FileUtils.S_IRWXU, null);
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentManager
    public void gotoOrderPageList(@NotNull FragmentActivity activity, @NotNull String source, @NotNull String target) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).openPage(activity, "https://m.xiaomi.com/miwear/dial/OrderPage?target=" + target + "&source=" + source);
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentManager
    public void intentToPay(@NotNull FragmentActivity activity, @NotNull List<SkuObject> skuList, int promotionId, boolean deduct, boolean needDid, boolean needModel, boolean needFirmwareVersion, int payType, @NotNull String source, @Nullable Bundle trackBundle, @Nullable PaymentProgressListener callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(skuList, "skuList");
        Intrinsics.checkNotNullParameter(source, "source");
        DialogPayManager.INSTANCE.pay(activity, skuList, promotionId, deduct, needDid, needModel, needFirmwareVersion, payType, source, trackBundle, callback);
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentManager
    public void intentToRepay(@NotNull FragmentActivity activity, @NotNull String orderId, boolean needDid, boolean needModel, boolean needFirmwareVersion, int payType, @Nullable Bundle trackBundle, @Nullable PaymentProgressListener callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        DialogPayManager.INSTANCE.repay(activity, orderId, needDid, needModel, needFirmwareVersion, payType, trackBundle, callback);
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentManager
    public boolean isStaging() {
        return this.appSetStaging || MibiEnvironment.isStaging();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    @Override // com.xiaomi.fitness.pay.export.PaymentManager
    public void payChannel(@NotNull FragmentActivity activity, @NotNull String channel, @NotNull String mOrder, boolean useBalance, boolean useGiftCard, boolean usePartnerGiftCard, boolean noAccount, @NotNull final Function3<? super Boolean, ? super MibiPayError, ? super MibiPayResult, Unit> mibiPayResult) {
        String str;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(mOrder, "mOrder");
        Intrinsics.checkNotNullParameter(mibiPayResult, "mibiPayResult");
        MibiEnvironment.setStaging(activity, this.appSetStaging);
        OrderBean.OrderBeanBuilder order = new OrderBean.OrderBeanBuilder().setOrder(mOrder);
        int iHashCode = channel.hashCode();
        if (iHashCode == 73364844) {
            str = "MIPAY";
            if (!channel.equals("MIPAY")) {
                str = "";
            }
        } else if (iHashCode == 83046919) {
            str = "WXPAY";
            if (!channel.equals("WXPAY")) {
                str = "";
            }
        } else if (iHashCode != 1933336138) {
            str = "";
        } else {
            str = "ALIPAY";
            if (!channel.equals("ALIPAY")) {
                str = "";
            }
        }
        OrderBean orderBeanBuild = order.setChannel(str).useBalance(useBalance).useGiftcard(useGiftCard).usePartnerGiftcard(usePartnerGiftCard).setNoAccount(noAccount).useUi(false).useMipayH5(this.appSetStaging).build();
        PaymentTranslucentActivity.Companion companion = PaymentTranslucentActivity.INSTANCE;
        Intrinsics.checkNotNull(orderBeanBuild);
        companion.startForActivityResult(activity, orderBeanBuild, "pay", new Function2() { // from class: fph
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PaymentManagerImpl.payChannel$lambda$0(mibiPayResult, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
        activity.overridePendingTransition(0, 0);
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentManager
    public void setStaging(@NotNull Context context, boolean isStaging) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.appSetStaging = isStaging;
        MibiEnvironment.setStaging(context, isStaging);
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentManager
    public void signDeduct(@NotNull FragmentActivity activity, @NotNull String channel, @NotNull String mOrder, @NotNull final Function3<? super Boolean, ? super Integer, ? super MibiDeductResult, Unit> signDeductResult) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(mOrder, "mOrder");
        Intrinsics.checkNotNullParameter(signDeductResult, "signDeductResult");
        MibiEnvironment.setStaging(activity, this.appSetStaging);
        OrderBean.OrderBeanBuilder order = new OrderBean.OrderBeanBuilder().setOrder(mOrder);
        String str = "WXPAYDEDUCT";
        if (!Intrinsics.areEqual(channel, "WXPAYDEDUCT")) {
            str = "ALIPAYDEDUCT";
            if (!Intrinsics.areEqual(channel, "ALIPAYDEDUCT")) {
                str = "";
            }
        }
        OrderBean orderBeanBuild = order.setChannel(str).useUi(false).useMipayH5(this.appSetStaging).build();
        PaymentTranslucentActivity.Companion companion = PaymentTranslucentActivity.INSTANCE;
        Intrinsics.checkNotNull(orderBeanBuild);
        companion.startForActivityResult(activity, orderBeanBuild, PaymentOrderType.DEDUCT, new Function2() { // from class: eph
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PaymentManagerImpl.signDeduct$lambda$1(signDeductResult, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
        activity.overridePendingTransition(0, 0);
    }
}
