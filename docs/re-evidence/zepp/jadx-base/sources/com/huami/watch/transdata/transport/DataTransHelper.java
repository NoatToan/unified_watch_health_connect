package com.huami.watch.transdata.transport;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
public class DataTransHelper {
    public static final String TRIGGER_BROADCAST_ACTION = "com.huami.watch.trans_new_channel_prepare";
    public static final String TYPE_FIRST_BEAT = "FIRSTBEAT";
    public static final String TYPE_HEALTH = "HEALTH";
    public static final String TYPE_SPORT = "SPORT";
    public static final String TYPE_TRIGGER = "TRIGGER";

    public static String translationPackage(String str) {
        return TextUtils.equals(str, TYPE_HEALTH) ? "com.huami.watch.health" : (TextUtils.equals(str, TYPE_SPORT) || TextUtils.equals(str, TYPE_FIRST_BEAT)) ? "com.huami.watch.newsport" : "";
    }
}
