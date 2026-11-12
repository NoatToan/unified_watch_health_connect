package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.onetrack.OneTrack;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class AccessControlResponseInfo extends CommonResponseInfo {
    private static final int TIP_UI_TYPE_DIALOG = 2;

    @SerializedName("data")
    private AccessControlDialogInfo mAccessControlDialogInfo;

    public static class AccessControlButtonInfo {
        public static final int DEEP_LINK = 2;
        public static final int URI_SCHEME = 1;

        @SerializedName("cnTitle")
        private String mCnTitle;

        @SerializedName(OneTrack.Param.LINK)
        private String mLink;

        @SerializedName("linkType")
        private int mLinkType;

        @SerializedName("title")
        private String mTitle;

        @SerializedName("twTitle")
        private String mTwTitle;

        public String getLink() {
            return this.mLink;
        }

        public int getLinkType() {
            return this.mLinkType;
        }

        public String getTitle() {
            Locale locale = Locale.getDefault();
            if (locale.equals(Locale.CHINA)) {
                return this.mCnTitle;
            }
            return locale.equals(Locale.TRADITIONAL_CHINESE) ? this.mTwTitle : this.mTitle;
        }
    }

    public static class AccessControlDialogInfo {

        @SerializedName("dialog")
        private AccessControlUIInfo mDialog;

        public AccessControlUIInfo getDialog() {
            return this.mDialog;
        }
    }

    public static class AccessControlUIInfo {

        @SerializedName("style")
        private AccessControlUIStyle mStyle;

        @SerializedName("tipUIType")
        private int mTipUIType;

        public AccessControlUIStyle getStyle() {
            return this.mStyle;
        }

        public int getTipUIType() {
            return this.mTipUIType;
        }

        public boolean isDialog() {
            return this.mTipUIType == 2;
        }
    }

    public static class AccessControlUIStyle {

        @SerializedName("cnContent")
        private String mCnContent;

        @SerializedName("cnTitle")
        private String mCnTitle;

        @SerializedName(MiuiCursorConstants.CONTENT)
        private String mContent;

        @SerializedName("negativeButton")
        private AccessControlButtonInfo mNegativeButton;

        @SerializedName("positiveButton")
        private AccessControlButtonInfo mPositiveButton;

        @SerializedName("title")
        private String mTitle;

        @SerializedName("twContent")
        private String mTwContent;

        @SerializedName("twTitle")
        private String mTwTitle;

        public String getContent() {
            Locale locale = Locale.getDefault();
            if (locale.equals(Locale.CHINA)) {
                return this.mCnContent;
            }
            return locale.equals(Locale.TRADITIONAL_CHINESE) ? this.mTwContent : this.mContent;
        }

        public AccessControlButtonInfo getNegativeButton() {
            return this.mNegativeButton;
        }

        public AccessControlButtonInfo getPositiveButton() {
            return this.mPositiveButton;
        }

        public String getTitle() {
            Locale locale = Locale.getDefault();
            if (locale.equals(Locale.CHINA)) {
                return this.mCnTitle;
            }
            return locale.equals(Locale.TRADITIONAL_CHINESE) ? this.mTwTitle : this.mTitle;
        }
    }

    public AccessControlUIInfo getAccessControlUIInfo() {
        AccessControlDialogInfo accessControlDialogInfo = this.mAccessControlDialogInfo;
        if (accessControlDialogInfo != null) {
            return accessControlDialogInfo.getDialog();
        }
        return null;
    }
}
