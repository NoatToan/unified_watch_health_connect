package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.SerializedName;
import com.ingenic.iwds.HardwareList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ContentItem {

    @SerializedName("audio")
    public Audio audio;

    @SerializedName("duration")
    public String duration;

    @SerializedName("group")
    public Integer group;

    @SerializedName("nextRestTime")
    public Integer nextRestTime;

    @SerializedName("repeatNumber")
    public Integer repeatNumber;

    @SerializedName(HardwareList.VALUE_LCD_EXTERIOR_ROUND)
    public Integer round;

    @SerializedName("type")
    public String type;

    @SerializedName("videos")
    public List<VideoItem> videos;
}
