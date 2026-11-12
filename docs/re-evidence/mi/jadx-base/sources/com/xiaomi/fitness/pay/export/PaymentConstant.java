package com.xiaomi.fitness.pay.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/pay/export/PaymentConstant;", "", "<init>", "()V", "PAY_CHANNEL_MIPAY", "", "PAY_CHANNEL_WXPAY", "PAY_CHANNEL_ALIPAY", "PAY_DEDUCT_CHANNEL_WXPAY", "PAY_DEDUCT_CHANNEL_ALIPAY", "PAYMENT_MIBI_PRIVACY_URL", "PAYMENT_MIBI_USER_URL", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentConstant {

    @NotNull
    public static final PaymentConstant INSTANCE = new PaymentConstant();

    @NotNull
    public static final String PAYMENT_MIBI_PRIVACY_URL = "https://m.mibi.mi.com/license/privacy?region=CN&lang=zh";

    @NotNull
    public static final String PAYMENT_MIBI_USER_URL = "https://mibi.wali.com/static/html/mibilicense_zh-CN.html";

    @NotNull
    public static final String PAY_CHANNEL_ALIPAY = "ALIPAY";

    @NotNull
    public static final String PAY_CHANNEL_MIPAY = "MIPAY";

    @NotNull
    public static final String PAY_CHANNEL_WXPAY = "WXPAY";

    @NotNull
    public static final String PAY_DEDUCT_CHANNEL_ALIPAY = "ALIPAYDEDUCT";

    @NotNull
    public static final String PAY_DEDUCT_CHANNEL_WXPAY = "WXPAYDEDUCT";

    private PaymentConstant() {
    }
}
