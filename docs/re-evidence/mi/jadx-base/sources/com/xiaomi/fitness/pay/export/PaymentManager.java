package com.xiaomi.fitness.pay.export;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.pay.export.data.response.MibiDeductResult;
import com.xiaomi.fitness.pay.export.data.response.MibiPayError;
import com.xiaomi.fitness.pay.export.data.response.MibiPayResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 72\u00020\u0001:\u00017JS\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u000eJ|\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H&JX\u0010!\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H&Jj\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00172\b\b\u0002\u0010'\u001a\u00020\u00172\b\b\u0002\u0010(\u001a\u00020\u00172\b\b\u0002\u0010)\u001a\u00020\u00172 \u0010*\u001a\u001c\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\u00100+H&J@\u0010.\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u001e\u0010/\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00100+H&J$\u00101\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u0005H&J\u0018\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0017H&J\b\u00106\u001a\u00020\u0017H&¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/pay/export/PaymentManager;", "", "buildSkuObject", "Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", "spuId", "", "spuVersion", "", "skuId", Constants.KEY_PRICE, "", "quantity", "productId", "skuName", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;)Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", "intentToPay", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "skuList", "", "promotionId", PaymentOrderType.DEDUCT, "", "needDid", "needModel", "needFirmwareVersion", TSMAuthContants.PARAM_PAY_TYPE, "source", "trackBundle", "Landroid/os/Bundle;", "callback", "Lcom/xiaomi/fitness/pay/export/PaymentProgressListener;", "intentToRepay", "orderId", "payChannel", "channel", "mOrder", Constants.KEY_USE_BALANCE, "useGiftCard", "usePartnerGiftCard", Constants.KEY_NO_ACCOUNT, "mibiPayResult", "Lkotlin/Function3;", "Lcom/xiaomi/fitness/pay/export/data/response/MibiPayError;", "Lcom/xiaomi/fitness/pay/export/data/response/MibiPayResult;", "signDeduct", "signDeductResult", "Lcom/xiaomi/fitness/pay/export/data/response/MibiDeductResult;", "gotoOrderPageList", "target", "setStaging", "context", "Landroid/content/Context;", "isStaging", "Companion", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PaymentManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int PAY_TYPE_AIDONG_GAME = 4;
    public static final int PAY_TYPE_COURSE = 2;
    public static final int PAY_TYPE_FACE = 1;
    public static final int PAY_TYPE_H5 = 5;
    public static final int PAY_TYPE_VIP_CENTER = 3;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/pay/export/PaymentManager$Companion;", "", "<init>", "()V", "PAY_TYPE_FACE", "", "PAY_TYPE_COURSE", "PAY_TYPE_VIP_CENTER", "PAY_TYPE_AIDONG_GAME", "PAY_TYPE_H5", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int PAY_TYPE_AIDONG_GAME = 4;
        public static final int PAY_TYPE_COURSE = 2;
        public static final int PAY_TYPE_FACE = 1;
        public static final int PAY_TYPE_H5 = 5;
        public static final int PAY_TYPE_VIP_CENTER = 3;

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ SkuObject buildSkuObject$default(PaymentManager paymentManager, String str, Integer num, String str2, Long l, long j, String str3, String str4, int i, Object obj) {
            if (obj == null) {
                return paymentManager.buildSkuObject(str, num, str2, l, (i & 16) != 0 ? 1L : j, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildSkuObject");
        }

        public static /* synthetic */ void gotoOrderPageList$default(PaymentManager paymentManager, FragmentActivity fragmentActivity, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoOrderPageList");
            }
            if ((i & 2) != 0) {
                str = "profile_tab";
            }
            if ((i & 4) != 0) {
                str2 = "vip";
            }
            paymentManager.gotoOrderPageList(fragmentActivity, str, str2);
        }

        public static /* synthetic */ void intentToPay$default(PaymentManager paymentManager, FragmentActivity fragmentActivity, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str, Bundle bundle, PaymentProgressListener paymentProgressListener, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: intentToPay");
            }
            paymentManager.intentToPay(fragmentActivity, list, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? true : z2, (i3 & 32) != 0 ? true : z3, (i3 & 64) != 0 ? true : z4, (i3 & 128) != 0 ? 1 : i2, (i3 & 256) != 0 ? "" : str, (i3 & 512) != 0 ? null : bundle, (i3 & 1024) != 0 ? null : paymentProgressListener);
        }

        public static /* synthetic */ void intentToRepay$default(PaymentManager paymentManager, FragmentActivity fragmentActivity, String str, boolean z, boolean z2, boolean z3, int i, Bundle bundle, PaymentProgressListener paymentProgressListener, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: intentToRepay");
            }
            paymentManager.intentToRepay(fragmentActivity, str, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? true : z2, (i2 & 16) != 0 ? true : z3, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? null : bundle, (i2 & 128) != 0 ? null : paymentProgressListener);
        }

        public static /* synthetic */ void payChannel$default(PaymentManager paymentManager, FragmentActivity fragmentActivity, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Function3 function3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: payChannel");
            }
            paymentManager.payChannel(fragmentActivity, str, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, function3);
        }
    }

    @NotNull
    SkuObject buildSkuObject(@Nullable String spuId, @Nullable Integer spuVersion, @Nullable String skuId, @Nullable Long price, long quantity, @NotNull String productId, @NotNull String skuName);

    void gotoOrderPageList(@NotNull FragmentActivity activity, @NotNull String source, @NotNull String target);

    void intentToPay(@NotNull FragmentActivity activity, @NotNull List<SkuObject> skuList, int promotionId, boolean deduct, boolean needDid, boolean needModel, boolean needFirmwareVersion, int payType, @NotNull String source, @Nullable Bundle trackBundle, @Nullable PaymentProgressListener callback);

    void intentToRepay(@NotNull FragmentActivity activity, @NotNull String orderId, boolean needDid, boolean needModel, boolean needFirmwareVersion, int payType, @Nullable Bundle trackBundle, @Nullable PaymentProgressListener callback);

    boolean isStaging();

    void payChannel(@NotNull FragmentActivity activity, @NotNull String channel, @NotNull String mOrder, boolean useBalance, boolean useGiftCard, boolean usePartnerGiftCard, boolean noAccount, @NotNull Function3<? super Boolean, ? super MibiPayError, ? super MibiPayResult, Unit> mibiPayResult);

    void setStaging(@NotNull Context context, boolean isStaging);

    void signDeduct(@NotNull FragmentActivity activity, @NotNull String channel, @NotNull String mOrder, @NotNull Function3<? super Boolean, ? super Integer, ? super MibiDeductResult, Unit> signDeductResult);
}
