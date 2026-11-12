package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import com.xiaomi.hm.health.training.api.gson.JsonStringFieldMapAdapterFactory;

/* JADX INFO: loaded from: classes21.dex */
public class VideoPostConfig {

    @SerializedName(TrainingWebConst.Value.Settings.VIDEO_IMAGE_POST)
    @JsonAdapter(JsonStringFieldMapAdapterFactory.class)
    public VideoPosts videoPosts;
}
