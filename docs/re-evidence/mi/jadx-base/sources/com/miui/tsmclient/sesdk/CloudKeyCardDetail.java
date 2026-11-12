package com.miui.tsmclient.sesdk;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CardInfo;

/* JADX INFO: loaded from: classes6.dex */
public class CloudKeyCardDetail implements IJsonSerializer, IJsonDeserializer<CloudKeyCardDetail>, SeCard.IOnlineProperties {
    private boolean isDownloadable;
    private transient CardInfo mCardInfo;

    @SerializedName("description")
    private String mDescription;

    @SerializedName("descriptions")
    private String mDescriptions;

    @SerializedName("isServiceAvailable")
    private boolean mIsServiceAvailable;

    @SerializedName("label")
    private String mLabel;

    @SerializedName("serviceStatus")
    private String mServiceStatus;

    @SerializedName("tips")
    private String mTips;

    public CloudKeyCardDetail(SeCard seCard) {
        CardInfo cardInfo = seCard.mCardInfo;
        this.mCardInfo = cardInfo;
        this.mDescription = cardInfo.mCardSubName;
        this.mDescriptions = null;
        this.mServiceStatus = cardInfo.getServiceStatusDesc();
        this.mIsServiceAvailable = this.mCardInfo.isServiceAvailable();
        this.isDownloadable = !this.mCardInfo.mHasIssue;
        this.mTips = null;
        this.mLabel = null;
    }

    public static CloudKeyCardDetail fromJson(String str) {
        return (CloudKeyCardDetail) new Gson().fromJson(str, CloudKeyCardDetail.class);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getDescription() {
        return this.mDescription;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getDescriptions() {
        return this.mDescriptions;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getLabel() {
        return this.mLabel;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getServiceStatus() {
        return this.mServiceStatus;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getTips() {
        return this.mTips;
    }

    public boolean isDownloadable() {
        return this.isDownloadable;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public boolean isServiceAvailable() {
        return this.mIsServiceAvailable;
    }

    @Override // com.miui.tsmclient.sesdk.IJsonSerializer
    public String toJson() {
        return new Gson().toJson(this);
    }
}
