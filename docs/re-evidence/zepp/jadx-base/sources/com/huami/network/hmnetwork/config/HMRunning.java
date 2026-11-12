package com.huami.network.hmnetwork.config;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class HMRunning {

    @SerializedName("runnerGroupEnnable")
    public static final Boolean ENABLE_RUNNER_GROUP;

    @SerializedName("enable")
    public static final Boolean ENABLE_RUNNING;

    @SerializedName("shareUrl")
    public static final String SHARE_URL = "http://paopaotuan.org/";

    static {
        Boolean bool = Boolean.TRUE;
        ENABLE_RUNNING = bool;
        ENABLE_RUNNER_GROUP = bool;
    }
}
