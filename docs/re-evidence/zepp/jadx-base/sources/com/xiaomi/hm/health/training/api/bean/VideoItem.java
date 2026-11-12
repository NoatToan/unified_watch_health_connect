package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.SerializedName;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;

/* JADX INFO: loaded from: classes21.dex */
public class VideoItem {

    @SerializedName("consumption")
    public long consumption;

    @SerializedName("time")
    public long duration;

    @SerializedName("freeDuration")
    public long freeDuration;

    @SerializedName("freeUnit")
    public String freeUnit;

    @SerializedName("gender")
    public Integer gender;

    @SerializedName("id")
    public long id;

    @SerializedName("instrument")
    public String instrument;

    @SerializedName("isFree")
    public boolean isFree;

    @SerializedName("name")
    public String name;

    @SerializedName("participantNumber")
    public long participantNumber;

    @SerializedName(DeviceSettingApiImpl.META_KEY_THUMBNAIL)
    public String thumbnail;

    @SerializedName("url")
    public String url;
}
