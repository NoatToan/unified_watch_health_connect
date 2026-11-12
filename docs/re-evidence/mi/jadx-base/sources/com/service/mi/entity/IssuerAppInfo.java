package com.service.mi.entity;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class IssuerAppInfo {

    @SerializedName("activateWithIssuerMobileAppAndroidIntent")
    private IssuerAppAndroid mIssuerAppAndroid;

    @SerializedName("activateWithIssuerMobileAppIOSDeepLinkingUrl")
    private IssuerAppIOS mIssuerAppIOS;

    public static class IssuerAppAndroid {

        @SerializedName("action")
        private String mAction;

        @SerializedName("extraTextValue")
        private String mExtraTextValue;

        @SerializedName("packageName")
        private String mPackageName;

        public String getAction() {
            return this.mAction;
        }

        public String getExtraTextValue() {
            return this.mExtraTextValue;
        }

        public String getPackageName() {
            return this.mPackageName;
        }
    }

    public static class IssuerAppIOS {

        @SerializedName("deepLinkingUrl")
        private String mDeepLinkingUrl;

        @SerializedName("extraTextValue")
        private String mExtraTextValue;

        public String getDeepLinkingUrl() {
            return this.mDeepLinkingUrl;
        }

        public String getExtraTextValue() {
            return this.mExtraTextValue;
        }
    }

    public static IssuerAppInfo parseJson(String str) {
        return (IssuerAppInfo) new Gson().fromJson(str, IssuerAppInfo.class);
    }

    public IssuerAppAndroid getIssuerAppAndroid() {
        return this.mIssuerAppAndroid;
    }

    public IssuerAppIOS getIssuerAppIOS() {
        return this.mIssuerAppIOS;
    }
}
