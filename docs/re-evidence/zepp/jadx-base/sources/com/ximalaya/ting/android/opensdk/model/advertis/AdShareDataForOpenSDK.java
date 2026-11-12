package com.ximalaya.ting.android.opensdk.model.advertis;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AdShareDataForOpenSDK implements Parcelable {
    public static final Parcelable.Creator<AdShareDataForOpenSDK> CREATOR = new Parcelable.Creator<AdShareDataForOpenSDK>() { // from class: com.ximalaya.ting.android.opensdk.model.advertis.AdShareDataForOpenSDK.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AdShareDataForOpenSDK createFromParcel(Parcel parcel) {
            return new AdShareDataForOpenSDK(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AdShareDataForOpenSDK[] newArray(int i) {
            return new AdShareDataForOpenSDK[i];
        }
    };
    private boolean isExternalUrl;
    private String linkContent;
    private String linkCoverPath;
    private String linkTitle;
    private String linkUrl;

    public AdShareDataForOpenSDK() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getLinkContent() {
        return this.linkContent;
    }

    public String getLinkCoverPath() {
        return this.linkCoverPath;
    }

    public String getLinkTitle() {
        return this.linkTitle;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public boolean isExternalUrl() {
        return this.isExternalUrl;
    }

    public void readFromParcel(Parcel parcel) {
        this.linkUrl = parcel.readString();
        this.linkTitle = parcel.readString();
        this.linkCoverPath = parcel.readString();
        this.linkContent = parcel.readString();
        this.isExternalUrl = parcel.readByte() != 0;
    }

    public void setExternalUrl(boolean z) {
        this.isExternalUrl = z;
    }

    public void setLinkContent(String str) {
        this.linkContent = str;
    }

    public void setLinkCoverPath(String str) {
        this.linkCoverPath = str;
    }

    public void setLinkTitle(String str) {
        this.linkTitle = str;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.linkTitle);
        parcel.writeString(this.linkCoverPath);
        parcel.writeString(this.linkContent);
        parcel.writeByte(this.isExternalUrl ? (byte) 1 : (byte) 0);
    }

    public AdShareDataForOpenSDK(Parcel parcel) {
        this.linkUrl = parcel.readString();
        this.linkTitle = parcel.readString();
        this.linkCoverPath = parcel.readString();
        this.linkContent = parcel.readString();
        this.isExternalUrl = parcel.readByte() != 0;
    }

    public AdShareDataForOpenSDK(AdShareDataForOpenSDK adShareDataForOpenSDK) {
        this.linkUrl = adShareDataForOpenSDK.linkUrl;
        this.linkTitle = adShareDataForOpenSDK.linkTitle;
        this.linkCoverPath = adShareDataForOpenSDK.linkCoverPath;
        this.linkContent = adShareDataForOpenSDK.linkContent;
        this.isExternalUrl = adShareDataForOpenSDK.isExternalUrl;
    }

    public AdShareDataForOpenSDK(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.linkUrl = jSONObject.optString("linkUrl");
            this.linkTitle = jSONObject.optString("linkTitle");
            this.linkCoverPath = jSONObject.optString("linkCoverPath");
            this.linkContent = jSONObject.optString("linkContent");
            this.isExternalUrl = jSONObject.optBoolean("isExternalUrl");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
