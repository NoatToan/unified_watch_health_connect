package com.miui.tsmclient.sesdk;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.entity.ProprietaryCarKeyCardInfo;

/* JADX INFO: loaded from: classes6.dex */
public class KeyCardDetail implements IJsonSerializer, IJsonDeserializer<KeyCardDetail>, SeCard.IOnlineProperties {

    @SerializedName("isBackedUp")
    private boolean isBackedUp;

    @SerializedName("isSupportBackup")
    private boolean isSupportBackup;
    private transient CardInfo mCardInfo;

    @SerializedName("cloudCid")
    private String mCloudCid;

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

    @SerializedName(ProprietaryCarKeyCardInfo.CARD_VC_STATUS)
    private int mVCStatus;

    public KeyCardDetail(SeCard seCard) {
        CardInfo cardInfo = seCard.mCardInfo;
        this.mCardInfo = cardInfo;
        this.mDescription = cardInfo.mCardSubName;
        this.mDescriptions = null;
        this.mServiceStatus = cardInfo.getServiceStatusDesc();
        this.mIsServiceAvailable = true;
        CardInfo cardInfo2 = this.mCardInfo;
        if (cardInfo2 instanceof MifareCardInfo) {
            this.isBackedUp = ((MifareCardInfo) cardInfo2).isBackedUp();
            this.isSupportBackup = ((MifareCardInfo) this.mCardInfo).isSupportBackup();
            this.mVCStatus = ((MifareCardInfo) this.mCardInfo).getVCStatus();
            this.mCloudCid = ((MifareCardInfo) this.mCardInfo).getCloudCid();
        }
        this.mTips = null;
        this.mLabel = null;
    }

    public static KeyCardDetail fromJson(String str) {
        return (KeyCardDetail) new Gson().fromJson(str, KeyCardDetail.class);
    }

    public String getCloudCid() {
        return this.mCloudCid;
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

    public int getVCStatus() {
        return this.mVCStatus;
    }

    public boolean isBackedUp() {
        return this.isBackedUp;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public boolean isServiceAvailable() {
        return this.mIsServiceAvailable;
    }

    public boolean isSupportBackup() {
        return this.isSupportBackup;
    }

    @Override // com.miui.tsmclient.sesdk.IJsonSerializer
    public String toJson() {
        return new Gson().toJson(this);
    }
}
