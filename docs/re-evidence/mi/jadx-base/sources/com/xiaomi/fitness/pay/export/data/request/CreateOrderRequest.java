package com.xiaomi.fitness.pay.export.data.request;

import com.xiaomi.fitness.pay.channel.PayChannelActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J[\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/request/CreateOrderRequest;", "", "did", "", "model", "firmware_version", "sku_list", "", "Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", PayChannelActivity.PAY_TYPE, "", "promotion_id", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IILjava/lang/String;)V", "getDid", "()Ljava/lang/String;", "getModel", "getFirmware_version", "getSku_list", "()Ljava/util/List;", "getPay_type", "()I", "getPromotion_id", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CreateOrderRequest {

    @Nullable
    private final String did;

    @Nullable
    private final String firmware_version;

    @Nullable
    private final String model;
    private final int pay_type;
    private final int promotion_id;

    @NotNull
    private final List<SkuObject> sku_list;

    @NotNull
    private final String source;

    public CreateOrderRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull List<SkuObject> sku_list, int i, int i2, @NotNull String source) {
        Intrinsics.checkNotNullParameter(sku_list, "sku_list");
        Intrinsics.checkNotNullParameter(source, "source");
        this.did = str;
        this.model = str2;
        this.firmware_version = str3;
        this.sku_list = sku_list;
        this.pay_type = i;
        this.promotion_id = i2;
        this.source = source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateOrderRequest copy$default(CreateOrderRequest createOrderRequest, String str, String str2, String str3, List list, int i, int i2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = createOrderRequest.did;
        }
        if ((i3 & 2) != 0) {
            str2 = createOrderRequest.model;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            str3 = createOrderRequest.firmware_version;
        }
        String str6 = str3;
        if ((i3 & 8) != 0) {
            list = createOrderRequest.sku_list;
        }
        List list2 = list;
        if ((i3 & 16) != 0) {
            i = createOrderRequest.pay_type;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = createOrderRequest.promotion_id;
        }
        int i5 = i2;
        if ((i3 & 64) != 0) {
            str4 = createOrderRequest.source;
        }
        return createOrderRequest.copy(str, str5, str6, list2, i4, i5, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirmware_version() {
        return this.firmware_version;
    }

    @NotNull
    public final List<SkuObject> component4() {
        return this.sku_list;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPay_type() {
        return this.pay_type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPromotion_id() {
        return this.promotion_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final CreateOrderRequest copy(@Nullable String did, @Nullable String model, @Nullable String firmware_version, @NotNull List<SkuObject> sku_list, int pay_type, int promotion_id, @NotNull String source) {
        Intrinsics.checkNotNullParameter(sku_list, "sku_list");
        Intrinsics.checkNotNullParameter(source, "source");
        return new CreateOrderRequest(did, model, firmware_version, sku_list, pay_type, promotion_id, source);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrderRequest)) {
            return false;
        }
        CreateOrderRequest createOrderRequest = (CreateOrderRequest) other;
        return Intrinsics.areEqual(this.did, createOrderRequest.did) && Intrinsics.areEqual(this.model, createOrderRequest.model) && Intrinsics.areEqual(this.firmware_version, createOrderRequest.firmware_version) && Intrinsics.areEqual(this.sku_list, createOrderRequest.sku_list) && this.pay_type == createOrderRequest.pay_type && this.promotion_id == createOrderRequest.promotion_id && Intrinsics.areEqual(this.source, createOrderRequest.source);
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final String getFirmware_version() {
        return this.firmware_version;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    public final int getPay_type() {
        return this.pay_type;
    }

    public final int getPromotion_id() {
        return this.promotion_id;
    }

    @NotNull
    public final List<SkuObject> getSku_list() {
        return this.sku_list;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.did;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.model;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firmware_version;
        return ((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.sku_list.hashCode()) * 31) + Integer.hashCode(this.pay_type)) * 31) + Integer.hashCode(this.promotion_id)) * 31) + this.source.hashCode();
    }

    @NotNull
    public String toString() {
        return "CreateOrderRequest(did=" + this.did + ", model=" + this.model + ", firmware_version=" + this.firmware_version + ", sku_list=" + this.sku_list + ", pay_type=" + this.pay_type + ", promotion_id=" + this.promotion_id + ", source=" + this.source + ")";
    }

    public /* synthetic */ CreateOrderRequest(String str, String str2, String str3, List list, int i, int i2, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, list, (i3 & 16) != 0 ? 1 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str4);
    }
}
