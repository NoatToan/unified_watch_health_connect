package com.huami.discovery.bridge.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes8.dex */
public class WebItem implements Parcelable {
    public static final int BACK_AND_TITLE = 1;
    public static final Parcelable.Creator<WebItem> CREATOR = new a();
    public static final String FROM_CCB_GUIDE = "FROM_CCB_GUIDE";
    public static final String FROM_DISCOVERY = "FROM_DISCOVERY";
    public static final String FROM_HOME_POPUP = "from_home_popup";
    public static final String FROM_HOME_TEXT_LINK = "FROM_HOME_TEXT_LINK";
    public static final String FROM_RUN_TEXT_LINK = "FROM_RUN_TEXT_LINK";
    public static final String FROM_STARTUP = "FROM_STARTUP";
    public static final String FROM_VIRTUAL_WATCH = "FROM_VIRTUAL_WATCH";
    public static final int NONE_TITLE = 3;
    public static final int SINGLE_TITLE = 2;
    public String from;
    public boolean hasFinishEvent;
    public boolean isRefresh;
    public boolean isShouldNotifyFinish;
    public boolean isShouldPreVerify;
    public boolean isShowLoadingTip;
    public boolean isShowMore;
    public boolean isUseCache;
    public boolean needWriteCookie;
    public int share;
    public String shareSubtitle;
    public String shareTitle;
    public String shareUrl;
    public boolean shouldOverrideUrl;
    public boolean showProgressBar;
    public int titleBarStyle;
    public String url;
    public String webTheme;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TitleBarStyle {
    }

    public class a implements Parcelable.Creator<WebItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WebItem createFromParcel(Parcel parcel) {
            return new WebItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WebItem[] newArray(int i) {
            return new WebItem[i];
        }
    }

    public WebItem() {
        this.titleBarStyle = 0;
        this.isShouldPreVerify = true;
        this.isShowLoadingTip = false;
        this.isShowMore = true;
        this.isUseCache = true;
        this.isRefresh = false;
        this.showProgressBar = false;
        this.webTheme = null;
        this.hasFinishEvent = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getShare() {
        return this.share;
    }

    public String getShareSubtitle() {
        return this.shareSubtitle;
    }

    public String getShareTitle() {
        return this.shareTitle;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public boolean isFromCCBGuide() {
        return TextUtils.equals(this.from, "FROM_CCB_GUIDE");
    }

    public boolean isFromHomePopup() {
        return TextUtils.equals(this.from, "from_home_popup");
    }

    public boolean isFromVirtualWatch() {
        return TextUtils.equals(this.from, "FROM_VIRTUAL_WATCH");
    }

    public boolean isShareCapture() {
        return this.share == 2;
    }

    public boolean isShareLink() {
        return this.share == 1;
    }

    public boolean isShareable() {
        return this.share > 0;
    }

    public void setShare(int i) {
        this.share = i;
    }

    public String toString() {
        return "WebItem{url='" + this.url + "', share=" + this.share + ", shareTitle='" + this.shareTitle + "', shareSubtitle='" + this.shareSubtitle + "', shareUrl='" + this.shareUrl + "', needWriteCookie=" + this.needWriteCookie + ", shouldOverrideUrl=" + this.shouldOverrideUrl + ", from='" + this.from + "', titleBarStyle='" + this.titleBarStyle + "', isShouldNotifyFinish=" + this.isShouldNotifyFinish + ", isShouldPreVerify=" + this.isShouldPreVerify + ", isShowLoadingTip=" + this.isShowLoadingTip + ", isShowMore=" + this.isShowMore + ", isUseCache=" + this.isUseCache + ", isRefresh=" + this.isRefresh + ", showProgressBar=" + this.showProgressBar + ", webTheme=" + this.webTheme + ", hasFinishEvent=" + this.hasFinishEvent + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.share);
        parcel.writeString(this.shareTitle);
        parcel.writeString(this.shareSubtitle);
        parcel.writeString(this.shareUrl);
        parcel.writeByte(this.needWriteCookie ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.shouldOverrideUrl ? (byte) 1 : (byte) 0);
        parcel.writeString(this.from);
        parcel.writeInt(this.titleBarStyle);
        parcel.writeByte(this.isShouldNotifyFinish ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isShouldPreVerify ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isShowLoadingTip ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isShowMore ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isUseCache ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isRefresh ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showProgressBar ? (byte) 1 : (byte) 0);
        parcel.writeString(this.webTheme);
        parcel.writeByte(this.hasFinishEvent ? (byte) 1 : (byte) 0);
    }

    public WebItem(String str) {
        this.titleBarStyle = 0;
        this.isShouldPreVerify = true;
        this.isShowLoadingTip = false;
        this.isShowMore = true;
        this.isUseCache = true;
        this.isRefresh = false;
        this.showProgressBar = false;
        this.webTheme = null;
        this.hasFinishEvent = false;
        this.url = str;
    }

    public WebItem(Parcel parcel) {
        this.titleBarStyle = 0;
        this.isShouldPreVerify = true;
        this.isShowLoadingTip = false;
        this.isShowMore = true;
        this.isUseCache = true;
        this.isRefresh = false;
        this.showProgressBar = false;
        this.webTheme = null;
        this.hasFinishEvent = false;
        this.url = parcel.readString();
        this.share = parcel.readInt();
        this.shareTitle = parcel.readString();
        this.shareSubtitle = parcel.readString();
        this.shareUrl = parcel.readString();
        this.needWriteCookie = parcel.readByte() != 0;
        this.shouldOverrideUrl = parcel.readByte() != 0;
        this.from = parcel.readString();
        this.titleBarStyle = parcel.readInt();
        this.isShouldNotifyFinish = parcel.readByte() != 0;
        this.isShouldPreVerify = parcel.readByte() != 0;
        this.isShowLoadingTip = parcel.readByte() != 0;
        this.isShowMore = parcel.readByte() != 0;
        this.isUseCache = parcel.readByte() != 0;
        this.isRefresh = parcel.readByte() != 0;
        this.showProgressBar = parcel.readByte() != 0;
        this.webTheme = parcel.readString();
        this.hasFinishEvent = parcel.readByte() != 0;
    }
}
