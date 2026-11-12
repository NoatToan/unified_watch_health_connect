package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class PaidOrder {

    @SerializedName("description")
    public String description;

    @SerializedName("orderId")
    public String orderId;

    @SerializedName("paidAt")
    public long paidAt;

    @SerializedName("saleAmount")
    public double saleAmount;

    @SerializedName("skus")
    public List<PaidOrderSkusItem> skus;

    public static class PaidOrderSkusItem {

        @SerializedName("imgUrl")
        public String imgUrl;

        @SerializedName("productId")
        public String productId;

        @SerializedName(TrainingWebConst.QueryParam.SKUID)
        public String skuId;
    }
}
