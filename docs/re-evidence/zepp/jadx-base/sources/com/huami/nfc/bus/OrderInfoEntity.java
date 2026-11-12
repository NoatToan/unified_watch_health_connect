package com.huami.nfc.bus;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bC\u0010DJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003J{\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u001e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0013\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0014\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&R\u0019\u0010\u0017\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0018\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b<\u0010&R\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010&R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010$\u001a\u0004\b@\u0010&R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010$\u001a\u0004\bB\u0010&¨\u0006E"}, d2 = {"Lcom/huami/nfc/bus/OrderInfoEntity;", "", "", "component1", "Lcom/huami/nfc/bus/PayChannel;", "component2", "Lcom/huami/nfc/bus/PayType;", "component3", "component4", "component5", "", "component6", "", "component7", "component8", "component9", "component10", "component11", "orderNum", "channel", "type", "status", "statusDesc", "amount", "time", "transNum", "appCode", "invoiceAuthCode", "codeValidDate", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getOrderNum", "()Ljava/lang/String;", "b", "Lcom/huami/nfc/bus/PayChannel;", "getChannel", "()Lcom/huami/nfc/bus/PayChannel;", "c", "Lcom/huami/nfc/bus/PayType;", "getType", "()Lcom/huami/nfc/bus/PayType;", GoogleApiAvailabilityLight.a, "getStatus", "e", "getStatusDesc", "f", LogUtil.I, "getAmount", "()I", "g", "J", "getTime", "()J", "h", "getTransNum", "i", "getAppCode", z.j, "getInvoiceAuthCode", hl.k, "getCodeValidDate", "<init>", "(Ljava/lang/String;Lcom/huami/nfc/bus/PayChannel;Lcom/huami/nfc/bus/PayType;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OrderInfoEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String orderNum;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final PayChannel channel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final PayType type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String statusDesc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int amount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String transNum;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appCode;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String invoiceAuthCode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final String codeValidDate;

    public OrderInfoEntity(@NotNull String str, @NotNull PayChannel payChannel, @NotNull PayType payType, @NotNull String str2, @NotNull String str3, int i, long j, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7) {
        this.orderNum = str;
        this.channel = payChannel;
        this.type = payType;
        this.status = str2;
        this.statusDesc = str3;
        this.amount = i;
        this.time = j;
        this.transNum = str4;
        this.appCode = str5;
        this.invoiceAuthCode = str6;
        this.codeValidDate = str7;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderNum() {
        return this.orderNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getInvoiceAuthCode() {
        return this.invoiceAuthCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCodeValidDate() {
        return this.codeValidDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PayChannel getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PayType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTransNum() {
        return this.transNum;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final OrderInfoEntity copy(@NotNull String orderNum, @NotNull PayChannel channel, @NotNull PayType type, @NotNull String status, @NotNull String statusDesc, int amount, long time, @NotNull String transNum, @NotNull String appCode, @Nullable String invoiceAuthCode, @Nullable String codeValidDate) {
        return new OrderInfoEntity(orderNum, channel, type, status, statusDesc, amount, time, transNum, appCode, invoiceAuthCode, codeValidDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderInfoEntity)) {
            return false;
        }
        OrderInfoEntity orderInfoEntity = (OrderInfoEntity) other;
        return Intrinsics.areEqual(this.orderNum, orderInfoEntity.orderNum) && this.channel == orderInfoEntity.channel && this.type == orderInfoEntity.type && Intrinsics.areEqual(this.status, orderInfoEntity.status) && Intrinsics.areEqual(this.statusDesc, orderInfoEntity.statusDesc) && this.amount == orderInfoEntity.amount && this.time == orderInfoEntity.time && Intrinsics.areEqual(this.transNum, orderInfoEntity.transNum) && Intrinsics.areEqual(this.appCode, orderInfoEntity.appCode) && Intrinsics.areEqual(this.invoiceAuthCode, orderInfoEntity.invoiceAuthCode) && Intrinsics.areEqual(this.codeValidDate, orderInfoEntity.codeValidDate);
    }

    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final PayChannel getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getCodeValidDate() {
        return this.codeValidDate;
    }

    @Nullable
    public final String getInvoiceAuthCode() {
        return this.invoiceAuthCode;
    }

    @NotNull
    public final String getOrderNum() {
        return this.orderNum;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getTransNum() {
        return this.transNum;
    }

    @NotNull
    public final PayType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.orderNum.hashCode() * 31) + this.channel.hashCode()) * 31) + this.type.hashCode()) * 31) + this.status.hashCode()) * 31) + this.statusDesc.hashCode()) * 31) + this.amount) * 31) + b.a(this.time)) * 31) + this.transNum.hashCode()) * 31) + this.appCode.hashCode()) * 31;
        String str = this.invoiceAuthCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.codeValidDate;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderInfoEntity(orderNum=" + this.orderNum + ", channel=" + this.channel + ", type=" + this.type + ", status=" + this.status + ", statusDesc=" + this.statusDesc + ", amount=" + this.amount + ", time=" + this.time + ", transNum=" + this.transNum + ", appCode=" + this.appCode + ", invoiceAuthCode=" + ((Object) this.invoiceAuthCode) + ", codeValidDate=" + ((Object) this.codeValidDate) + ')';
    }

    public /* synthetic */ OrderInfoEntity(String str, PayChannel payChannel, PayType payType, String str2, String str3, int i, long j, String str4, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, payChannel, payType, str2, str3, i, j, str4, str5, (i2 & 512) != 0 ? null : str6, (i2 & 1024) != 0 ? null : str7);
    }
}
