package com.xiaomi.hm.health.device.watchskinstore.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u001f\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder;", "", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Order;", "component1", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Payment;", "component2", StatEvent.MINE_KINGKONG_C_ORDER_VALUE, "payment", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Order;", "getOrder", "()Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Order;", "setOrder", "(Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Order;)V", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Payment;", "getPayment", "()Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Payment;", "setPayment", "(Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Payment;)V", "<init>", "(Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Order;Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Payment;)V", "Order", WFStateEvent.WF_PAYMENT, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PayOrder {

    @Nullable
    private Order order;

    @Nullable
    private Payment payment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B7\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J9\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Order;", "", "", "Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Order$SkuBean;", "component1", "", "component2", "component3", "items", "description", "skus", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getSkus", "setSkus", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "SkuBean", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Order {

        @Nullable
        private String description;

        @Nullable
        private List<SkuBean> items;

        @Nullable
        private List<SkuBean> skus;

        public Order() {
            this(null, null, null, 7, null);
        }

        public Order(@Nullable List<SkuBean> list, @Nullable String str, @Nullable List<SkuBean> list2) {
            this.items = list;
            this.description = str;
            this.skus = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Order copy$default(Order order, List list, String str, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = order.items;
            }
            if ((i & 2) != 0) {
                str = order.description;
            }
            if ((i & 4) != 0) {
                list2 = order.skus;
            }
            return order.copy(list, str, list2);
        }

        @Nullable
        public final List<SkuBean> component1() {
            return this.items;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final List<SkuBean> component3() {
            return this.skus;
        }

        @NotNull
        public final Order copy(@Nullable List<SkuBean> items, @Nullable String description, @Nullable List<SkuBean> skus) {
            return new Order(items, description, skus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Order)) {
                return false;
            }
            Order order = (Order) other;
            return Intrinsics.areEqual(this.items, order.items) && Intrinsics.areEqual(this.description, order.description) && Intrinsics.areEqual(this.skus, order.skus);
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final List<SkuBean> getItems() {
            return this.items;
        }

        @Nullable
        public final List<SkuBean> getSkus() {
            return this.skus;
        }

        public int hashCode() {
            List<SkuBean> list = this.items;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<SkuBean> list2 = this.skus;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        public final void setDescription(@Nullable String str) {
            this.description = str;
        }

        public final void setItems(@Nullable List<SkuBean> list) {
            this.items = list;
        }

        public final void setSkus(@Nullable List<SkuBean> list) {
            this.skus = list;
        }

        @NotNull
        public String toString() {
            return "Order(items=" + this.items + ", description=" + this.description + ", skus=" + this.skus + ")";
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Order$SkuBean;", "", "", "component1", "", "component2", TrainingWebConst.QueryParam.SKUID, FirebaseAnalytics.Param.QUANTITY, "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSkuId", "()Ljava/lang/String;", "setSkuId", "(Ljava/lang/String;)V", LogUtil.I, "getQuantity", "()I", "setQuantity", "(I)V", "<init>", "(Ljava/lang/String;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final /* data */ class SkuBean {
            private int quantity;

            @Nullable
            private String skuId;

            /* JADX WARN: Multi-variable type inference failed */
            public SkuBean() {
                this(null, 0, 3, 0 == true ? 1 : 0);
            }

            public SkuBean(@Nullable String str, int i) {
                this.skuId = str;
                this.quantity = i;
            }

            public static /* synthetic */ SkuBean copy$default(SkuBean skuBean, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = skuBean.skuId;
                }
                if ((i2 & 2) != 0) {
                    i = skuBean.quantity;
                }
                return skuBean.copy(str, i);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getSkuId() {
                return this.skuId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getQuantity() {
                return this.quantity;
            }

            @NotNull
            public final SkuBean copy(@Nullable String skuId, int quantity) {
                return new SkuBean(skuId, quantity);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SkuBean)) {
                    return false;
                }
                SkuBean skuBean = (SkuBean) other;
                return Intrinsics.areEqual(this.skuId, skuBean.skuId) && this.quantity == skuBean.quantity;
            }

            public final int getQuantity() {
                return this.quantity;
            }

            @Nullable
            public final String getSkuId() {
                return this.skuId;
            }

            public int hashCode() {
                String str = this.skuId;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.quantity;
            }

            public final void setQuantity(int i) {
                this.quantity = i;
            }

            public final void setSkuId(@Nullable String str) {
                this.skuId = str;
            }

            @NotNull
            public String toString() {
                return "SkuBean(skuId=" + this.skuId + ", quantity=" + this.quantity + ")";
            }

            public /* synthetic */ SkuBean(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 1 : i);
            }
        }

        public /* synthetic */ Order(List list, String str, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PayOrder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public PayOrder(@Nullable Order order, @Nullable Payment payment) {
        this.order = order;
        this.payment = payment;
    }

    public static /* synthetic */ PayOrder copy$default(PayOrder payOrder, Order order, Payment payment, int i, Object obj) {
        if ((i & 1) != 0) {
            order = payOrder.order;
        }
        if ((i & 2) != 0) {
            payment = payOrder.payment;
        }
        return payOrder.copy(order, payment);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Order getOrder() {
        return this.order;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Payment getPayment() {
        return this.payment;
    }

    @NotNull
    public final PayOrder copy(@Nullable Order order, @Nullable Payment payment) {
        return new PayOrder(order, payment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayOrder)) {
            return false;
        }
        PayOrder payOrder = (PayOrder) other;
        return Intrinsics.areEqual(this.order, payOrder.order) && Intrinsics.areEqual(this.payment, payOrder.payment);
    }

    @Nullable
    public final Order getOrder() {
        return this.order;
    }

    @Nullable
    public final Payment getPayment() {
        return this.payment;
    }

    public int hashCode() {
        Order order = this.order;
        int iHashCode = (order == null ? 0 : order.hashCode()) * 31;
        Payment payment = this.payment;
        return iHashCode + (payment != null ? payment.hashCode() : 0);
    }

    public final void setOrder(@Nullable Order order) {
        this.order = order;
    }

    public final void setPayment(@Nullable Payment payment) {
        this.payment = payment;
    }

    @NotNull
    public String toString() {
        return "PayOrder(order=" + this.order + ", payment=" + this.payment + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/watchskinstore/bean/PayOrder$Payment;", "", "", "component1", "component2", "payChannel", "prepaidData", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getPayChannel", "()Ljava/lang/String;", "setPayChannel", "(Ljava/lang/String;)V", "getPrepaidData", "setPrepaidData", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Payment {

        @Nullable
        private String payChannel;

        @Nullable
        private String prepaidData;

        /* JADX WARN: Multi-variable type inference failed */
        public Payment() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public Payment(@Nullable String str, @Nullable String str2) {
            this.payChannel = str;
            this.prepaidData = str2;
        }

        public static /* synthetic */ Payment copy$default(Payment payment, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payment.payChannel;
            }
            if ((i & 2) != 0) {
                str2 = payment.prepaidData;
            }
            return payment.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPayChannel() {
            return this.payChannel;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPrepaidData() {
            return this.prepaidData;
        }

        @NotNull
        public final Payment copy(@Nullable String payChannel, @Nullable String prepaidData) {
            return new Payment(payChannel, prepaidData);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) other;
            return Intrinsics.areEqual(this.payChannel, payment.payChannel) && Intrinsics.areEqual(this.prepaidData, payment.prepaidData);
        }

        @Nullable
        public final String getPayChannel() {
            return this.payChannel;
        }

        @Nullable
        public final String getPrepaidData() {
            return this.prepaidData;
        }

        public int hashCode() {
            String str = this.payChannel;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.prepaidData;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setPayChannel(@Nullable String str) {
            this.payChannel = str;
        }

        public final void setPrepaidData(@Nullable String str) {
            this.prepaidData = str;
        }

        @NotNull
        public String toString() {
            return "Payment(payChannel=" + this.payChannel + ", prepaidData=" + this.prepaidData + ")";
        }

        public /* synthetic */ Payment(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    public /* synthetic */ PayOrder(Order order, Payment payment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : order, (i & 2) != 0 ? null : payment);
    }
}
