package com.huami.ad;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public interface Constants {
    public static final String GIF_PATH = "gif";
    public static final String GIF_RENAME_SUFFIX = "_complete.gif";
    public static final String TYPE_GIF = "GIF";
    public static final String TYPE_PIC = "PIC";
    public static final String TYPE_STR_GIF = "GIF";
    public static final String TYPE_STR_PIC = "PIC";
    public static final String TYPE_STR_VIDEO = "VIDEO";
    public static final int TYPE_SUMMARY = 0;
    public static final String TYPE_VIDEO = "VIDEO";
    public static final int TYPE_VIDEO_PAUSE_AD = 1;
    public static final int TYPE_VIDEO_PAUSE_ONLY_MESSAGE = 2;
    public static final int TYPE_VIDEO_REST_AD = 3;
    public static final int TYPE_VIDEO_REST_ONLY_MESSAGE = 4;
    public static final String VIDEO_PATH = "video";
    public static final String VIDEO_RENAME_SUFFIX = "_complete.mp4";

    public interface SportAd {
        public static final int CYCLING_OUTDOOR = 5;
        public static final int RUNNING_INDOOR = 4;
        public static final int RUNNING_OUTDOOR = 2;
        public static final int TRAINING = 1;
        public static final int WALKING = 3;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SportAdType {
    }
}
