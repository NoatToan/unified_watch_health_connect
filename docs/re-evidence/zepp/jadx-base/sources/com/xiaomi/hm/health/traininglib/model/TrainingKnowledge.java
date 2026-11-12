package com.xiaomi.hm.health.traininglib.model;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingKnowledge implements Serializable {

    @SerializedName("description")
    public String description;

    @SerializedName("id")
    public long id;

    @SerializedName("imgUrl")
    public String imgUrl;

    @SerializedName(SDKConstants.PARAM_SORT_ORDER)
    public int sortOrder;

    @SerializedName("title")
    public String title;

    @SerializedName("url")
    public String url;
}
