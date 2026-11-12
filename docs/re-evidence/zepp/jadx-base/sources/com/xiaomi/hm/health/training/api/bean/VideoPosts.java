package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes21.dex */
public class VideoPosts {

    @SerializedName("back")
    public Post back;

    @SerializedName("front")
    public Post front;

    public static class Post {

        @SerializedName("duration")
        public long duration;

        @SerializedName("endTime")
        public long endTime;

        @SerializedName("picture")
        public String picture;

        @SerializedName("startTime")
        public long startTime;
    }
}
