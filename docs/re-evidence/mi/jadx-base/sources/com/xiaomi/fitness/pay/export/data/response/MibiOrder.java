package com.xiaomi.fitness.pay.export.data.response;

import com.mibi.sdk.component.Constants;
import com.xiaomi.onetrack.b.m;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jm\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/response/MibiOrder;", "", "createTime", "", "msgId", "notifyUrl", "orderDesc", Constants.KEY_ORDER_FEE, "orderId", "region", "returnUrl", m.j, Constants.KEY_PAY_RESULT_SENDERSIGN, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreateTime", "()Ljava/lang/String;", "getMsgId", "getNotifyUrl", "getOrderDesc", "getOrderFee", "getOrderId", "getRegion", "getReturnUrl", "getSender", "getSenderSign", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MibiOrder {

    @NotNull
    private final String createTime;

    @NotNull
    private final String msgId;

    @NotNull
    private final String notifyUrl;

    @NotNull
    private final String orderDesc;

    @NotNull
    private final String orderFee;

    @NotNull
    private final String orderId;

    @NotNull
    private final String region;

    @NotNull
    private final String returnUrl;

    @NotNull
    private final String sender;

    @NotNull
    private final String senderSign;

    public MibiOrder() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSenderSign() {
        return this.senderSign;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsgId() {
        return this.msgId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNotifyUrl() {
        return this.notifyUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderDesc() {
        return this.orderDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOrderFee() {
        return this.orderFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSender() {
        return this.sender;
    }

    @NotNull
    public final MibiOrder copy(@NotNull String createTime, @NotNull String msgId, @NotNull String notifyUrl, @NotNull String orderDesc, @NotNull String orderFee, @NotNull String orderId, @NotNull String region, @NotNull String returnUrl, @NotNull String sender, @NotNull String senderSign) {
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(notifyUrl, "notifyUrl");
        Intrinsics.checkNotNullParameter(orderDesc, "orderDesc");
        Intrinsics.checkNotNullParameter(orderFee, "orderFee");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(senderSign, "senderSign");
        return new MibiOrder(createTime, msgId, notifyUrl, orderDesc, orderFee, orderId, region, returnUrl, sender, senderSign);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MibiOrder)) {
            return false;
        }
        MibiOrder mibiOrder = (MibiOrder) other;
        return Intrinsics.areEqual(this.createTime, mibiOrder.createTime) && Intrinsics.areEqual(this.msgId, mibiOrder.msgId) && Intrinsics.areEqual(this.notifyUrl, mibiOrder.notifyUrl) && Intrinsics.areEqual(this.orderDesc, mibiOrder.orderDesc) && Intrinsics.areEqual(this.orderFee, mibiOrder.orderFee) && Intrinsics.areEqual(this.orderId, mibiOrder.orderId) && Intrinsics.areEqual(this.region, mibiOrder.region) && Intrinsics.areEqual(this.returnUrl, mibiOrder.returnUrl) && Intrinsics.areEqual(this.sender, mibiOrder.sender) && Intrinsics.areEqual(this.senderSign, mibiOrder.senderSign);
    }

    @NotNull
    public final String getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getMsgId() {
        return this.msgId;
    }

    @NotNull
    public final String getNotifyUrl() {
        return this.notifyUrl;
    }

    @NotNull
    public final String getOrderDesc() {
        return this.orderDesc;
    }

    @NotNull
    public final String getOrderFee() {
        return this.orderFee;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @NotNull
    public final String getSender() {
        return this.sender;
    }

    @NotNull
    public final String getSenderSign() {
        return this.senderSign;
    }

    public int hashCode() {
        return (((((((((((((((((this.createTime.hashCode() * 31) + this.msgId.hashCode()) * 31) + this.notifyUrl.hashCode()) * 31) + this.orderDesc.hashCode()) * 31) + this.orderFee.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.region.hashCode()) * 31) + this.returnUrl.hashCode()) * 31) + this.sender.hashCode()) * 31) + this.senderSign.hashCode();
    }

    @NotNull
    public String toString() {
        return "MibiOrder(createTime=" + this.createTime + ", msgId=" + this.msgId + ", notifyUrl=" + this.notifyUrl + ", orderDesc=" + this.orderDesc + ", orderFee=" + this.orderFee + ", orderId=" + this.orderId + ", region=" + this.region + ", returnUrl=" + this.returnUrl + ", sender=" + this.sender + ", senderSign=" + this.senderSign + ")";
    }

    public MibiOrder(@NotNull String createTime, @NotNull String msgId, @NotNull String notifyUrl, @NotNull String orderDesc, @NotNull String orderFee, @NotNull String orderId, @NotNull String region, @NotNull String returnUrl, @NotNull String sender, @NotNull String senderSign) {
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(notifyUrl, "notifyUrl");
        Intrinsics.checkNotNullParameter(orderDesc, "orderDesc");
        Intrinsics.checkNotNullParameter(orderFee, "orderFee");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(senderSign, "senderSign");
        this.createTime = createTime;
        this.msgId = msgId;
        this.notifyUrl = notifyUrl;
        this.orderDesc = orderDesc;
        this.orderFee = orderFee;
        this.orderId = orderId;
        this.region = region;
        this.returnUrl = returnUrl;
        this.sender = sender;
        this.senderSign = senderSign;
    }

    public /* synthetic */ MibiOrder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "1565577142" : str, (i & 2) != 0 ? "bc809707-bb6f-43c2-83f4-*9a6c39013afa" : str2, (i & 4) != 0 ? "http://staging.billapi.n.xiaomi.com/mock/notify/receive" : str3, (i & 8) != 0 ? "QsoboCrGNF" : str4, (i & 16) != 0 ? "1" : str5, (i & 32) != 0 ? "09974095283008288604" : str6, (i & 64) != 0 ? ServerConstants.NEW_CN_COUNTRY_CODE : str7, (i & 128) != 0 ? "http://staging.mibi.n.xiaomi.com/record/account" : str8, (i & 256) != 0 ? "999" : str9, (i & 512) != 0 ? "ivnv5kSloUORBsVv31z080tdPa0GoxK0mHjapWJbQUciEfFgwqhEX4BJ4SA7CzdTPl7_GcxRxNqdTV9HU16tIOcEdBFMTnaNMOqMC4zTxjoaajfR2GeZW70Cp4YlAHxOrRv9Z9sbhPwgUqiUtA9qTXM5iy1wLH05HzsDdpzwoQc" : str10);
    }
}
