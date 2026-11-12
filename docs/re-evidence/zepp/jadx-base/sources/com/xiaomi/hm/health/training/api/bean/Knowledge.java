package com.xiaomi.hm.health.training.api.bean;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes21.dex */
public class Knowledge {

    @SerializedName("description")
    public String description;

    @SerializedName("id")
    public long id;

    @SerializedName("imgUrl")
    public String imgUrl;

    @SerializedName(SDKConstants.PARAM_SORT_ORDER)
    public Long sortOrder;

    @SerializedName("title")
    public String title;

    @SerializedName("url")
    public String url;
}
