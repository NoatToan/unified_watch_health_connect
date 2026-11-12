package com.xiaomi.hm.health.traininglib.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class RunCirclePosts implements Serializable {

    @SerializedName("appType")
    public String appType;

    @SerializedName("id")
    public int id;

    @SerializedName("isRecommend")
    public boolean isRecommend;

    @SerializedName("nickName")
    public String nickName;

    @SerializedName("offlineTime")
    public int offlineTime;

    @SerializedName("onlineTime")
    public int onlineTime;

    @SerializedName("picture")
    public String picture;

    @SerializedName("url")
    public String url;

    @SerializedName("userId")
    public String userId;
}
