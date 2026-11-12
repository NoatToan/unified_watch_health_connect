package com.huami.pay.lib;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u000e\"\u0016\u0010\u0001\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0016\u0010\u0006\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0016\u0010\u0007\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0016\u0010\b\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u001c\u0010\t\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\f\n\u0004\b\t\u0010\u0002\u0012\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0016\u0010\r\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0002¨\u0006\u000e"}, d2 = {"", "PAY_CHANNEL_PREFIX_MIFIT", "Ljava/lang/String;", "PAY_CHANNEL_PREFIX_ZEPP", "PAY_CHANNEL_ALI", "PAY_CHANNEL_WECHAT", "PAY_CHANNEL_GOOGLE", "PAY_ORDER_GENERATE_URL", "PAY_NOTIFICATION_URL", "PAY_ORDER_GET_URL", "getPAY_ORDER_GET_URL$annotations", "()V", "PAY_ORDER_STATE_URL", "PAY_TAG", "pay-lib_release"}, k = 2, mv = {1, 5, 1})
public final class PayConstantsKt {

    @NotNull
    public static final String PAY_CHANNEL_ALI = "ALI";

    @NotNull
    public static final String PAY_CHANNEL_GOOGLE = "GOOGLEPLAY";

    @NotNull
    public static final String PAY_CHANNEL_PREFIX_MIFIT = "MIFIT_";

    @NotNull
    public static final String PAY_CHANNEL_PREFIX_ZEPP = "ZEPP_";

    @NotNull
    public static final String PAY_CHANNEL_WECHAT = "WECHAT";

    @NotNull
    public static final String PAY_NOTIFICATION_URL = "googleplay/payment/notification";

    @NotNull
    public static final String PAY_ORDER_GENERATE_URL = "users/{userId}/orders";

    @NotNull
    public static final String PAY_ORDER_GET_URL = "users/{userId}/orders/{orderId}";

    @NotNull
    public static final String PAY_ORDER_STATE_URL = "users/{userId}/orders/{orderId}/loop";

    @NotNull
    public static final String PAY_TAG = "HuamiPay";

    public static /* synthetic */ void getPAY_ORDER_GET_URL$annotations() {
    }
}
