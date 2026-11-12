package com.xiaomi.fitness.pay.export.data.response;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/response/OrderStatus;", "", "<init>", "()V", "Companion", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OrderStatus {

    @NotNull
    public static final String CANCEL = "Cancel";

    @NotNull
    public static final String CREATE_FAIL = "CreateFail";

    @NotNull
    public static final String INVALID = "Invalid";

    @NotNull
    public static final String IN_PAYMENT = "InPayment";

    @NotNull
    public static final String PAYMENT_FAIL = "PaymentFail";

    @NotNull
    public static final String PAYMENT_SUCCESS = "PaymentSuccess";

    @NotNull
    public static final String REFUND_FAIL = "RefundFail";

    @NotNull
    public static final String REFUND_SUCCESS = "RefundSuccess";

    @NotNull
    public static final String WAIT_REFUND = "WaitRefund";
}
