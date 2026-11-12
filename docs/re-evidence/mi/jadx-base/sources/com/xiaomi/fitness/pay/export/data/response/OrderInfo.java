package com.xiaomi.fitness.pay.export.data.response;

import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003Ju\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001f¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", "", "id", "", "order_id", "", "order_status", "order_fee", "pay_id", "pay_time", "pay_fee", "sku_list", "", "Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", MiuiCursorConstants.CREATE_TIME, "", "update_time", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/util/List;JJ)V", "getId", "()I", "getOrder_id", "()Ljava/lang/String;", "getOrder_status", "getOrder_fee", "getPay_id", "getPay_time", "getPay_fee", "getSku_list", "()Ljava/util/List;", "getCreate_time", "()J", "getUpdate_time", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrderInfo {
    private final long create_time;
    private final int id;
    private final int order_fee;

    @NotNull
    private final String order_id;

    @NotNull
    private final String order_status;
    private final int pay_fee;

    @Nullable
    private final String pay_id;
    private final int pay_time;

    @NotNull
    private final List<SkuObject> sku_list;
    private final long update_time;

    public OrderInfo(int i, @NotNull String order_id, @NotNull String order_status, int i2, @Nullable String str, int i3, int i4, @NotNull List<SkuObject> sku_list, long j, long j2) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_status, "order_status");
        Intrinsics.checkNotNullParameter(sku_list, "sku_list");
        this.id = i;
        this.order_id = order_id;
        this.order_status = order_status;
        this.order_fee = i2;
        this.pay_id = str;
        this.pay_time = i3;
        this.pay_fee = i4;
        this.sku_list = sku_list;
        this.create_time = j;
        this.update_time = j2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getUpdate_time() {
        return this.update_time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrder_id() {
        return this.order_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrder_status() {
        return this.order_status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOrder_fee() {
        return this.order_fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPay_id() {
        return this.pay_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPay_time() {
        return this.pay_time;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPay_fee() {
        return this.pay_fee;
    }

    @NotNull
    public final List<SkuObject> component8() {
        return this.sku_list;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getCreate_time() {
        return this.create_time;
    }

    @NotNull
    public final OrderInfo copy(int id, @NotNull String order_id, @NotNull String order_status, int order_fee, @Nullable String pay_id, int pay_time, int pay_fee, @NotNull List<SkuObject> sku_list, long create_time, long update_time) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_status, "order_status");
        Intrinsics.checkNotNullParameter(sku_list, "sku_list");
        return new OrderInfo(id, order_id, order_status, order_fee, pay_id, pay_time, pay_fee, sku_list, create_time, update_time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderInfo)) {
            return false;
        }
        OrderInfo orderInfo = (OrderInfo) other;
        return this.id == orderInfo.id && Intrinsics.areEqual(this.order_id, orderInfo.order_id) && Intrinsics.areEqual(this.order_status, orderInfo.order_status) && this.order_fee == orderInfo.order_fee && Intrinsics.areEqual(this.pay_id, orderInfo.pay_id) && this.pay_time == orderInfo.pay_time && this.pay_fee == orderInfo.pay_fee && Intrinsics.areEqual(this.sku_list, orderInfo.sku_list) && this.create_time == orderInfo.create_time && this.update_time == orderInfo.update_time;
    }

    public final long getCreate_time() {
        return this.create_time;
    }

    public final int getId() {
        return this.id;
    }

    public final int getOrder_fee() {
        return this.order_fee;
    }

    @NotNull
    public final String getOrder_id() {
        return this.order_id;
    }

    @NotNull
    public final String getOrder_status() {
        return this.order_status;
    }

    public final int getPay_fee() {
        return this.pay_fee;
    }

    @Nullable
    public final String getPay_id() {
        return this.pay_id;
    }

    public final int getPay_time() {
        return this.pay_time;
    }

    @NotNull
    public final List<SkuObject> getSku_list() {
        return this.sku_list;
    }

    public final long getUpdate_time() {
        return this.update_time;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.id) * 31) + this.order_id.hashCode()) * 31) + this.order_status.hashCode()) * 31) + Integer.hashCode(this.order_fee)) * 31;
        String str = this.pay_id;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.pay_time)) * 31) + Integer.hashCode(this.pay_fee)) * 31) + this.sku_list.hashCode()) * 31) + Long.hashCode(this.create_time)) * 31) + Long.hashCode(this.update_time);
    }

    @NotNull
    public String toString() {
        return "OrderInfo(id=" + this.id + ", order_id=" + this.order_id + ", order_status=" + this.order_status + ", order_fee=" + this.order_fee + ", pay_id=" + this.pay_id + ", pay_time=" + this.pay_time + ", pay_fee=" + this.pay_fee + ", sku_list=" + this.sku_list + ", create_time=" + this.create_time + ", update_time=" + this.update_time + ")";
    }
}
