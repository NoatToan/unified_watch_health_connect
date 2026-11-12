package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;

/* JADX INFO: loaded from: classes21.dex */
public class Audio {

    @SerializedName("content")
    public String content;

    @SerializedName("name")
    public String name;

    @SerializedName("id")
    public Long round;

    @SerializedName("size")
    public Integer size;

    @SerializedName("status")
    public Integer status;

    @SerializedName("time")
    public Integer time;

    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    public Long updateTime;

    @SerializedName("url")
    public String url;
}
