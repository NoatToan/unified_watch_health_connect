package com.xiaomi.fitness.pay.export;

import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.pay.export.data.response.MibiPayResult;
import com.xiaomi.fitness.pay.export.data.response.OrderInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J$\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000fH&J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0003H&¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/pay/export/PaymentProgressListener;", "", "onClose", "", "dialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "onTimeUp", "", "onPrivacyRequest", CommonConstants.KEY_AGREE, "onCreateOrder", TSMAuthContants.PARAM_ORDER_INFO, "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", "onSelectChannel", "channel", "", "onPayChannel", "success", Constants.EXTRA_ERROR_MESSAGE, "result", "Lcom/xiaomi/fitness/pay/export/data/response/MibiPayResult;", "onOrderStatus", "status", "onOrderFinish", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PaymentProgressListener {
    boolean onClose(@NotNull CommonDialog<?> dialog);

    void onCreateOrder(@NotNull OrderInfo orderInfo);

    void onOrderFinish(boolean success);

    void onOrderStatus(@NotNull String status);

    void onPayChannel(boolean success, @Nullable String errorMsg, @Nullable MibiPayResult result);

    void onPrivacyRequest(boolean agree);

    void onSelectChannel(@NotNull String channel);

    void onTimeUp();
}
