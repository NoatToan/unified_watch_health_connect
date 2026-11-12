package com.xiaomi.hm.health.training.api.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class PayOrder {

    @SerializedName(StatEvent.MINE_KINGKONG_C_ORDER_VALUE)
    public OrderBean order;

    @SerializedName("payment")
    public PaymentBean payment;

    public static class OrderBean {

        @SerializedName("description")
        public String description;

        @SerializedName("items")
        public List<SkuBean> items;

        public static class SkuBean {

            @SerializedName(FirebaseAnalytics.Param.QUANTITY)
            public int quantity;

            @SerializedName(TrainingWebConst.QueryParam.SKUID)
            public String skuId;
        }
    }

    public static class PaymentBean {

        @SerializedName("payChannel")
        public String payChannel;
    }
}
