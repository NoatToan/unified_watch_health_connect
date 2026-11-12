package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;

/* JADX INFO: loaded from: classes21.dex */
public class SkusItem {

    @SerializedName("expiry")
    public String expiry;

    @SerializedName("freeTimeRange")
    public FreeTimeRange freeTimeRange;

    @SerializedName("isPurchased")
    public Boolean isPurchased = Boolean.FALSE;

    @SerializedName("originalPrice")
    public Float originalPrice;

    @SerializedName("salePrice")
    public Float salePrice;

    @SerializedName(TrainingWebConst.QueryParam.SKUID)
    public String skuId;
}
