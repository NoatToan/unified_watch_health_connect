package com.huami.wallet.ui.navigation;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.nfc.bus.entities.PayAuthorizationInfo;
import com.huami.passport.Configs;
import com.loc.z;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b@\u0010AJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001f\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\"\u0010#\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010'\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R$\u0010+\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R$\u0010/\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u000e\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R$\u0010?\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u000e\u001a\u0004\b=\u0010\u0010\"\u0004\b>\u0010\u0012¨\u0006B"}, d2 = {"Lcom/huami/wallet/ui/navigation/Args;", "", "", WorkoutExercises.CLEAN, "Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;", "a", "Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;", "getPayAuthorizationInfo", "()Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;", "setPayAuthorizationInfo", "(Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;)V", "payAuthorizationInfo", "", "b", "Ljava/lang/String;", "getAuthCode", "()Ljava/lang/String;", "setAuthCode", "(Ljava/lang/String;)V", Configs.Params.AUTHCODE, "c", "getAlipay", "setAlipay", "alipay", GoogleApiAvailabilityLight.a, "getName", "setName", "name", "e", "getMobile", "setMobile", "mobile", "f", "getSnbTicket", "setSnbTicket", "snbTicket", "g", "getAppCode", "setAppCode", "appCode", "h", "getCardNumber", "setCardNumber", "cardNumber", "i", "getXiaomiCardName", "setXiaomiCardName", "xiaomiCardName", "", z.j, LogUtil.I, "getRefundReasonCode", "()I", "setRefundReasonCode", "(I)V", "refundReasonCode", hl.k, "getBlance", "setBlance", "blance", "l", "getCardName", "setCardName", "cardName", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class Args {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static PayAuthorizationInfo payAuthorizationInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private static String cardNumber;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private static String xiaomiCardName;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private static String cardName;

    @NotNull
    public static final Args INSTANCE = new Args();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static String authCode = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static String alipay = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static String name = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static String mobile = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static String snbTicket = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static String appCode = "";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static int refundReasonCode = -1;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static int blance = -1;

    private Args() {
    }

    public final void clean() {
        payAuthorizationInfo = null;
        authCode = "";
        alipay = "";
        name = "";
        mobile = "";
        snbTicket = "";
        appCode = "";
        cardNumber = "";
        cardName = "";
        refundReasonCode = -1;
        blance = -1;
        xiaomiCardName = null;
    }

    @NotNull
    public final String getAlipay() {
        return alipay;
    }

    @NotNull
    public final String getAppCode() {
        return appCode;
    }

    @NotNull
    public final String getAuthCode() {
        return authCode;
    }

    public final int getBlance() {
        return blance;
    }

    @Nullable
    public final String getCardName() {
        return cardName;
    }

    @Nullable
    public final String getCardNumber() {
        return cardNumber;
    }

    @NotNull
    public final String getMobile() {
        return mobile;
    }

    @NotNull
    public final String getName() {
        return name;
    }

    @Nullable
    public final PayAuthorizationInfo getPayAuthorizationInfo() {
        return payAuthorizationInfo;
    }

    public final int getRefundReasonCode() {
        return refundReasonCode;
    }

    @NotNull
    public final String getSnbTicket() {
        return snbTicket;
    }

    @Nullable
    public final String getXiaomiCardName() {
        return xiaomiCardName;
    }

    public final void setAlipay(@NotNull String str) {
        alipay = str;
    }

    public final void setAppCode(@NotNull String str) {
        appCode = str;
    }

    public final void setAuthCode(@NotNull String str) {
        authCode = str;
    }

    public final void setBlance(int i) {
        blance = i;
    }

    public final void setCardName(@Nullable String str) {
        cardName = str;
    }

    public final void setCardNumber(@Nullable String str) {
        cardNumber = str;
    }

    public final void setMobile(@NotNull String str) {
        mobile = str;
    }

    public final void setName(@NotNull String str) {
        name = str;
    }

    public final void setPayAuthorizationInfo(@Nullable PayAuthorizationInfo payAuthorizationInfo2) {
        payAuthorizationInfo = payAuthorizationInfo2;
    }

    public final void setRefundReasonCode(int i) {
        refundReasonCode = i;
    }

    public final void setSnbTicket(@NotNull String str) {
        snbTicket = str;
    }

    public final void setXiaomiCardName(@Nullable String str) {
        xiaomiCardName = str;
    }
}
