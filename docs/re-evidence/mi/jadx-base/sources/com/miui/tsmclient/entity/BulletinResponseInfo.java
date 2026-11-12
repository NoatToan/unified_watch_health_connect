package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.onetrack.OneTrack;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BulletinResponseInfo extends CommonResponseInfo {

    @SerializedName("data")
    private List<BulletinInfo> mBulletinList;

    public static class BulletinInfo {

        @SerializedName(MiuiCursorConstants.CONTENT)
        private String mContent;

        @SerializedName(Constants.KEY_RECHARGE_ICON_URL)
        private String mIconUrl;

        @SerializedName("id")
        private String mId;

        @SerializedName("negativeButton")
        private ButtonInfo mNegativeButton;

        @SerializedName("positiveButton")
        private ButtonInfo mPositiveButton;

        @SerializedName("tips")
        private String mTips;

        @SerializedName("title")
        private String mTitle;

        public String getContent() {
            return this.mContent;
        }

        public String getIconUrl() {
            return this.mIconUrl;
        }

        public String getId() {
            return this.mId;
        }

        public ButtonInfo getNegativeButton() {
            return this.mNegativeButton;
        }

        public ButtonInfo getPositiveButton() {
            return this.mPositiveButton;
        }

        public String getTips() {
            return this.mTips;
        }

        public String getTitle() {
            return this.mTitle;
        }
    }

    public static class ButtonInfo {
        public static final int ACTION = 3;
        public static final int INTERNAL_APP = 2;
        public static final int WEB = 1;

        @SerializedName(OneTrack.Param.LINK)
        private String mLink;

        @SerializedName("linkType")
        private int mLinkType;

        @SerializedName("noMorePrompt")
        private boolean mNoMorePrompt;

        @SerializedName("title")
        private String mTitle;

        public String getLink() {
            return this.mLink;
        }

        public int getLinkType() {
            return this.mLinkType;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public boolean isNoMorePrompt() {
            return this.mNoMorePrompt;
        }
    }

    public List<BulletinInfo> getBulletinList() {
        return this.mBulletinList;
    }
}
