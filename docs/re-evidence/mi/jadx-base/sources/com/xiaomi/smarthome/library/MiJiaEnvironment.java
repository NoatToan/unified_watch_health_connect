package com.xiaomi.smarthome.library;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class MiJiaEnvironment {
    public static final String AUDIO_CONFIG = "AUDIO_CONFIG";
    public static final String AUDIO_CONFIG_P = "AUDIO_CONFIG_P";
    public static final String COMMON_DATA_ACTION = "COMMON_DATA_ACTION";
    private static String midPath = "";
    private static String originFrom = "";
    private static Context sAppContext = null;
    private static int sCPUArcType = 0;
    private static String sChannel = null;
    private static boolean sIsDebugBuildType = false;
    private static boolean sIsDevChannel = false;
    private static boolean sIsGooglePlayChannel = false;
    private static boolean sIsInGreyPublish = false;
    private static boolean sIsMiuiChannel = false;
    private static boolean sIsPublishTypeDev = false;
    private static boolean sIsReleaseBuildType = false;
    private static boolean sIsSdkBuildType = false;
    private static boolean withOutPrefix = false;

    public static class Builder {
        private Context appContext;
        private String channel;
        private int cpuArcType;
        private boolean isDebugBuildType;
        private boolean isDevChannel;
        private boolean isGooglePlayChannel;
        private boolean isInGreyPublish;
        private boolean isMiuiChannel;
        private boolean isPublishTypeDev;
        private boolean isReleaseBuildType;
        private boolean isSdkBuildType;
        private String midPath = "";
        private String originFrom = "";
        private boolean withOutPrefix = false;

        public Builder build() {
            return this;
        }

        public Builder setCPUArcType(int i) {
            this.cpuArcType = i;
            return this;
        }

        public Builder setChannel(String str) {
            this.channel = str;
            return this;
        }

        public Builder setContext(Context context) {
            this.appContext = context;
            return this;
        }

        public Builder setIsDebugBuildType(boolean z) {
            this.isDebugBuildType = z;
            return this;
        }

        public Builder setIsDevChannel(boolean z) {
            this.isDevChannel = z;
            return this;
        }

        public Builder setIsGooglePlayChannel(boolean z) {
            this.isGooglePlayChannel = z;
            return this;
        }

        public Builder setIsInGreyPublish(boolean z) {
            this.isInGreyPublish = z;
            return this;
        }

        public Builder setIsMiuiChannel(boolean z) {
            this.isMiuiChannel = z;
            return this;
        }

        public Builder setIsPublishTypeDev(boolean z) {
            this.isPublishTypeDev = z;
            return this;
        }

        public Builder setIsReleaseBuildType(boolean z) {
            this.isReleaseBuildType = z;
            return this;
        }

        public Builder setIsSdkBuildType(boolean z) {
            this.isSdkBuildType = z;
            return this;
        }

        public Builder setMidPath(String str) {
            this.midPath = str;
            return this;
        }

        public Builder setOriginFrom(String str) {
            this.originFrom = str;
            return this;
        }

        public Builder setWithOutPrefix(boolean z) {
            this.withOutPrefix = z;
            return this;
        }
    }

    public static Context getAppContext() {
        return sAppContext;
    }

    public static int getCPUArcType() {
        return sCPUArcType;
    }

    public static String getChannel() {
        return sChannel;
    }

    public static String getMidPath() {
        return midPath;
    }

    public static String getOriginFrom() {
        return originFrom;
    }

    public static boolean isDebugBuildOrDevChannel() {
        return sIsDebugBuildType || sIsDevChannel;
    }

    public static boolean isDebugBuildType() {
        return sIsDebugBuildType;
    }

    public static boolean isDevChannel() {
        return sIsDevChannel;
    }

    public static boolean isGooglePlayChannel() {
        return sIsGooglePlayChannel;
    }

    public static boolean isInGreyPublish() {
        return sIsInGreyPublish;
    }

    public static boolean isMiuiChannel() {
        return sIsMiuiChannel;
    }

    public static boolean isPublishTypeDev() {
        return sIsPublishTypeDev;
    }

    public static boolean isReleaseBuildType() {
        return sIsReleaseBuildType;
    }

    public static boolean isSdkBuildType() {
        return sIsSdkBuildType;
    }

    public static boolean isWithOutPrefix() {
        return withOutPrefix;
    }

    public static void setEnvironment(Builder builder) {
        if (builder == null) {
            throw new NullPointerException("MiJiaEnvironment builder is null");
        }
        sAppContext = builder.appContext;
        sIsDebugBuildType = builder.isDebugBuildType;
        sIsReleaseBuildType = builder.isReleaseBuildType;
        sIsSdkBuildType = builder.isSdkBuildType;
        sIsInGreyPublish = builder.isInGreyPublish;
        sIsPublishTypeDev = builder.isPublishTypeDev;
        sIsDevChannel = builder.isDevChannel;
        sIsMiuiChannel = builder.isMiuiChannel;
        sIsGooglePlayChannel = builder.isGooglePlayChannel;
        sChannel = builder.channel;
        sCPUArcType = builder.cpuArcType;
        midPath = builder.midPath;
        originFrom = builder.originFrom;
        withOutPrefix = builder.withOutPrefix;
    }
}
