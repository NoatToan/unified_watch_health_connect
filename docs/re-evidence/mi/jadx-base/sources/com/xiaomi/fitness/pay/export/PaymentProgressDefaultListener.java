package com.xiaomi.fitness.pay.export;

import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.pay.export.data.response.MibiPayResult;
import com.xiaomi.fitness.pay.export.data.response.OrderInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J$\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/pay/export/PaymentProgressDefaultListener;", "Lcom/xiaomi/fitness/pay/export/PaymentProgressListener;", "<init>", "()V", "onClose", "", "dialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "onTimeUp", "", "onPrivacyRequest", CommonConstants.KEY_AGREE, "onCreateOrder", TSMAuthContants.PARAM_ORDER_INFO, "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", "onSelectChannel", "channel", "", "onPayChannel", "success", Constants.EXTRA_ERROR_MESSAGE, "result", "Lcom/xiaomi/fitness/pay/export/data/response/MibiPayResult;", "onOrderStatus", "status", "onOrderFinish", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class PaymentProgressDefaultListener implements PaymentProgressListener {
    @Override // com.xiaomi.fitness.pay.export.PaymentProgressListener
    public boolean onClose(@NotNull CommonDialog<?> dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        return false;
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentProgressListener
    public void onCreateOrder(@NotNull OrderInfo orderInfo) {
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentProgressListener
    public void onOrderFinish(boolean success) {
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentProgressListener
    public void onOrderStatus(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentProgressListener
    public void onPayChannel(boolean success, @Nullable String errorMsg, @Nullable MibiPayResult result) {
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentProgressListener
    public void onPrivacyRequest(boolean agree) {
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentProgressListener
    public void onSelectChannel(@NotNull String channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
    }

    @Override // com.xiaomi.fitness.pay.export.PaymentProgressListener
    public void onTimeUp() {
    }
}
