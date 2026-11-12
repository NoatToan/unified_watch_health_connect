package com.xiaomi.hm.health.training.api.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class VideoUrls {

    @SerializedName("deliveryContent")
    public List<Url> deliveryContent;

    public static class Url {

        @SerializedName("playUrl")
        public String playUrl;
    }
}
