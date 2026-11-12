package com.huami.discovery.bridge.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class JsCashierReq {

    @SerializedName("items")
    private List<Product> a;

    @SerializedName("description")
    private String b;

    @SerializedName("totalFee")
    private int c;

    public static class Product {

        @SerializedName(FirebaseAnalytics.Param.QUANTITY)
        public int mQuantity;

        @SerializedName(TrainingWebConst.QueryParam.SKUID)
        public String mSkuId = null;

        public int getQuantity() {
            return this.mQuantity;
        }

        public String getSkuId() {
            return this.mSkuId;
        }

        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public String getDescription() {
        return this.b;
    }

    public int getItemQuantity() {
        List<Product> list = this.a;
        if (list == null || list.size() == 0) {
            return 0;
        }
        return this.a.get(0).getQuantity();
    }

    public String getItemSkuId() {
        List<Product> list = this.a;
        return (list == null || list.size() == 0) ? "" : this.a.get(0).getSkuId();
    }

    public List<Product> getProducts() {
        return this.a;
    }

    public int getTotalFee() {
        return this.c;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
