package com.huami.nfc.bus;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b/\u00100J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J_\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u001c\u0010\u0010\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u001c\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001eR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u001e¨\u00061"}, d2 = {"Lcom/huami/nfc/bus/OrderEntity;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "orderNum", "orderExpire", "payUrl", "payWay", "source", "data", "returnUrl", "cityId", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getOrderNum", "()Ljava/lang/String;", "b", "J", "getOrderExpire", "()J", "c", "getPayUrl", GoogleApiAvailabilityLight.a, "getPayWay", "e", "getSource", "f", "getData", "g", "getReturnUrl", "h", "getCityId", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OrderEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("snb_order_no")
    @NotNull
    private final String orderNum;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("order_expire_timestamp")
    private final long orderExpire;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("pay_url")
    @Nullable
    private final String payUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("pay_gateway")
    @Nullable
    private final String payWay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("order_source")
    @NotNull
    private final String source;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("signed_data")
    @NotNull
    private final String data;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("return_url")
    @NotNull
    private final String returnUrl;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName(XiaomiApduScriptKt.KEY_CITY_ID)
    @Nullable
    private final String cityId;

    public OrderEntity(@NotNull String str, long j, @Nullable String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @Nullable String str7) {
        this.orderNum = str;
        this.orderExpire = j;
        this.payUrl = str2;
        this.payWay = str3;
        this.source = str4;
        this.data = str5;
        this.returnUrl = str6;
        this.cityId = str7;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderNum() {
        return this.orderNum;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getOrderExpire() {
        return this.orderExpire;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayUrl() {
        return this.payUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPayWay() {
        return this.payWay;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCityId() {
        return this.cityId;
    }

    @NotNull
    public final OrderEntity copy(@NotNull String orderNum, long orderExpire, @Nullable String payUrl, @Nullable String payWay, @NotNull String source, @NotNull String data, @NotNull String returnUrl, @Nullable String cityId) {
        return new OrderEntity(orderNum, orderExpire, payUrl, payWay, source, data, returnUrl, cityId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderEntity)) {
            return false;
        }
        OrderEntity orderEntity = (OrderEntity) other;
        return Intrinsics.areEqual(this.orderNum, orderEntity.orderNum) && this.orderExpire == orderEntity.orderExpire && Intrinsics.areEqual(this.payUrl, orderEntity.payUrl) && Intrinsics.areEqual(this.payWay, orderEntity.payWay) && Intrinsics.areEqual(this.source, orderEntity.source) && Intrinsics.areEqual(this.data, orderEntity.data) && Intrinsics.areEqual(this.returnUrl, orderEntity.returnUrl) && Intrinsics.areEqual(this.cityId, orderEntity.cityId);
    }

    @Nullable
    public final String getCityId() {
        return this.cityId;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public final long getOrderExpire() {
        return this.orderExpire;
    }

    @NotNull
    public final String getOrderNum() {
        return this.orderNum;
    }

    @Nullable
    public final String getPayUrl() {
        return this.payUrl;
    }

    @Nullable
    public final String getPayWay() {
        return this.payWay;
    }

    @NotNull
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = ((this.orderNum.hashCode() * 31) + b.a(this.orderExpire)) * 31;
        String str = this.payUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.payWay;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.source.hashCode()) * 31) + this.data.hashCode()) * 31) + this.returnUrl.hashCode()) * 31;
        String str3 = this.cityId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderEntity(orderNum=" + this.orderNum + ", orderExpire=" + this.orderExpire + ", payUrl=" + ((Object) this.payUrl) + ", payWay=" + ((Object) this.payWay) + ", source=" + this.source + ", data=" + this.data + ", returnUrl=" + this.returnUrl + ", cityId=" + ((Object) this.cityId) + ')';
    }

    public /* synthetic */ OrderEntity(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, str3, str4, str5, str6, (i & 128) != 0 ? null : str7);
    }
}
