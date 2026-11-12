package com.huami.network.hmnetwork.config;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class HMLogger {

    @SerializedName("fileLogEnable")
    public static final Boolean FILE_LOG_ENABLE;

    @SerializedName("debugLogEnable")
    public static final Boolean LOG_CAT_ENABLE;

    @SerializedName("autoTrack")
    public static final Boolean ACTIVITY_AUTO_TRACK = Boolean.FALSE;

    @SerializedName(FirebaseAnalytics.Param.LEVEL)
    public static final Integer LEVEL = 6;

    static {
        Boolean bool = Boolean.TRUE;
        LOG_CAT_ENABLE = bool;
        FILE_LOG_ENABLE = bool;
    }
}
