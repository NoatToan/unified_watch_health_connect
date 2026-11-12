package com.huami.nfc.bus;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.loc.z;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\bB\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\f\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bT\u0010UJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\fHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J¸\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\"\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\u00022\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\t\u0010)\u001a\u00020\u0002HÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001J\u0013\u0010,\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0018\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0019\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u001a\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\tR\u001c\u0010\u001c\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u00104R\u001c\u0010\u001d\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b=\u00100R\u001c\u0010\u001e\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010.\u001a\u0004\bC\u00100R\u001c\u0010 \u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010.\u001a\u0004\bE\u00100R\u001e\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010.\u001a\u0004\bG\u00100R\u001c\u0010\"\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010AR\u001c\u0010#\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010.\u001a\u0004\bK\u00100R$\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001e\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010.\u001a\u0004\bQ\u00100R\u001e\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010.\u001a\u0004\bS\u00100¨\u0006V"}, d2 = {"Lcom/huami/nfc/bus/XiaomiOrderInfoEntity;", "", "", "component1", "", "component2", "component3", "", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "", "component7", "component8", "component9", "component10", "component11", "component12", "", "Lcom/huami/nfc/bus/ActionToken;", "component13", "component14", "component15", "orderNum", "type", "status", "richStatus", "amount", "time", "timestamp", "appCode", "source", "payTime", "payTimestamp", "cardName", "tokens", "invoiceAuthCode", "codeValidDate", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/nfc/bus/XiaomiOrderInfoEntity;", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getOrderNum", "()Ljava/lang/String;", "b", LogUtil.I, "getType", "()I", "c", "getStatus", GoogleApiAvailabilityLight.a, "Ljava/lang/Boolean;", "getRichStatus", "e", "getAmount", "f", "getTime", "g", "J", "getTimestamp", "()J", "h", "getAppCode", "i", "getSource", z.j, "getPayTime", hl.k, "getPayTimestamp", "l", "getCardName", "m", "Ljava/util/List;", "getTokens", "()Ljava/util/List;", GoogleApiAvailabilityLight.b, "getInvoiceAuthCode", "o", "getCodeValidDate", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class XiaomiOrderInfoEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("snb_order_no")
    @NotNull
    private final String orderNum;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("order_type")
    private final int type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("order_status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("rich_status")
    @Nullable
    private final Boolean richStatus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("order_amount")
    private final int amount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("order_time")
    @NotNull
    private final String time;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("order_time_timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName(ConstantKt.KEY_APP_CODE)
    @Nullable
    private final String appCode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("order_source")
    @NotNull
    private final String source;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName("pay_time")
    @Nullable
    private final String payTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("pay_time_timestamp")
    private final long payTimestamp;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @SerializedName("xm_card_name")
    @NotNull
    private final String cardName;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @SerializedName("actionToken")
    @Nullable
    private final List<ActionToken> tokens;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @SerializedName("invoice_auth_code")
    @Nullable
    private final String invoiceAuthCode;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @SerializedName("code_valid_date")
    @Nullable
    private final String codeValidDate;

    public XiaomiOrderInfoEntity(@NotNull String str, int i, @NotNull String str2, @Nullable Boolean bool, int i2, @NotNull String str3, long j, @Nullable String str4, @NotNull String str5, @Nullable String str6, long j2, @NotNull String str7, @Nullable List<ActionToken> list, @Nullable String str8, @Nullable String str9) {
        this.orderNum = str;
        this.type = i;
        this.status = str2;
        this.richStatus = bool;
        this.amount = i2;
        this.time = str3;
        this.timestamp = j;
        this.appCode = str4;
        this.source = str5;
        this.payTime = str6;
        this.payTimestamp = j2;
        this.cardName = str7;
        this.tokens = list;
        this.invoiceAuthCode = str8;
        this.codeValidDate = str9;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderNum() {
        return this.orderNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPayTime() {
        return this.payTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getPayTimestamp() {
        return this.payTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    @Nullable
    public final List<ActionToken> component13() {
        return this.tokens;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getInvoiceAuthCode() {
        return this.invoiceAuthCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCodeValidDate() {
        return this.codeValidDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getRichStatus() {
        return this.richStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final XiaomiOrderInfoEntity copy(@NotNull String orderNum, int type, @NotNull String status, @Nullable Boolean richStatus, int amount, @NotNull String time, long timestamp, @Nullable String appCode, @NotNull String source, @Nullable String payTime, long payTimestamp, @NotNull String cardName, @Nullable List<ActionToken> tokens, @Nullable String invoiceAuthCode, @Nullable String codeValidDate) {
        return new XiaomiOrderInfoEntity(orderNum, type, status, richStatus, amount, time, timestamp, appCode, source, payTime, payTimestamp, cardName, tokens, invoiceAuthCode, codeValidDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XiaomiOrderInfoEntity)) {
            return false;
        }
        XiaomiOrderInfoEntity xiaomiOrderInfoEntity = (XiaomiOrderInfoEntity) other;
        return Intrinsics.areEqual(this.orderNum, xiaomiOrderInfoEntity.orderNum) && this.type == xiaomiOrderInfoEntity.type && Intrinsics.areEqual(this.status, xiaomiOrderInfoEntity.status) && Intrinsics.areEqual(this.richStatus, xiaomiOrderInfoEntity.richStatus) && this.amount == xiaomiOrderInfoEntity.amount && Intrinsics.areEqual(this.time, xiaomiOrderInfoEntity.time) && this.timestamp == xiaomiOrderInfoEntity.timestamp && Intrinsics.areEqual(this.appCode, xiaomiOrderInfoEntity.appCode) && Intrinsics.areEqual(this.source, xiaomiOrderInfoEntity.source) && Intrinsics.areEqual(this.payTime, xiaomiOrderInfoEntity.payTime) && this.payTimestamp == xiaomiOrderInfoEntity.payTimestamp && Intrinsics.areEqual(this.cardName, xiaomiOrderInfoEntity.cardName) && Intrinsics.areEqual(this.tokens, xiaomiOrderInfoEntity.tokens) && Intrinsics.areEqual(this.invoiceAuthCode, xiaomiOrderInfoEntity.invoiceAuthCode) && Intrinsics.areEqual(this.codeValidDate, xiaomiOrderInfoEntity.codeValidDate);
    }

    public final int getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final String getCardName() {
        return this.cardName;
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

    @Nullable
    public final String getPayTime() {
        return this.payTime;
    }

    public final long getPayTimestamp() {
        return this.payTimestamp;
    }

    @Nullable
    public final Boolean getRichStatus() {
        return this.richStatus;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final List<ActionToken> getTokens() {
        return this.tokens;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.orderNum.hashCode() * 31) + this.type) * 31) + this.status.hashCode()) * 31;
        Boolean bool = this.richStatus;
        int iHashCode2 = (((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.amount) * 31) + this.time.hashCode()) * 31) + b.a(this.timestamp)) * 31;
        String str = this.appCode;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.source.hashCode()) * 31;
        String str2 = this.payTime;
        int iHashCode4 = (((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + b.a(this.payTimestamp)) * 31) + this.cardName.hashCode()) * 31;
        List<ActionToken> list = this.tokens;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.invoiceAuthCode;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.codeValidDate;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "XiaomiOrderInfoEntity(orderNum=" + this.orderNum + ", type=" + this.type + ", status=" + this.status + ", richStatus=" + this.richStatus + ", amount=" + this.amount + ", time=" + this.time + ", timestamp=" + this.timestamp + ", appCode=" + ((Object) this.appCode) + ", source=" + this.source + ", payTime=" + ((Object) this.payTime) + ", payTimestamp=" + this.payTimestamp + ", cardName=" + this.cardName + ", tokens=" + this.tokens + ", invoiceAuthCode=" + ((Object) this.invoiceAuthCode) + ", codeValidDate=" + ((Object) this.codeValidDate) + ')';
    }

    public /* synthetic */ XiaomiOrderInfoEntity(String str, int i, String str2, Boolean bool, int i2, String str3, long j, String str4, String str5, String str6, long j2, String str7, List list, String str8, String str9, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, bool, i2, (i3 & 32) != 0 ? "" : str3, (i3 & 64) != 0 ? 0L : j, (i3 & 128) != 0 ? null : str4, str5, (i3 & 512) != 0 ? null : str6, (i3 & 1024) != 0 ? 0L : j2, str7, (i3 & 4096) != 0 ? null : list, (i3 & 8192) != 0 ? null : str8, (i3 & 16384) != 0 ? null : str9);
    }
}
