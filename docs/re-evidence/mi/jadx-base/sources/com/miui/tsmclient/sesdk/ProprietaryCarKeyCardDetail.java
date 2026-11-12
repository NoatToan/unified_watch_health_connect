package com.miui.tsmclient.sesdk;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardUIInfo;
import com.miui.tsmclient.entity.ProprietaryCarKeyCardInfo;

/* JADX INFO: loaded from: classes6.dex */
public class ProprietaryCarKeyCardDetail implements IJsonSerializer, IJsonDeserializer<CloudKeyCardDetail>, SeCard.IOnlineProperties {

    @SerializedName(ProprietaryCarKeyCardInfo.CARD_INFO_DOOR_CARD_CUSTOMIZABLE)
    private boolean isCustomizable;

    @SerializedName("cid")
    private String mCId;

    @SerializedName(CardUIInfo.KEY_LOGO)
    private String mLogo;

    @SerializedName("productDescription")
    private String mProductDescription;

    @SerializedName(ProprietaryCarKeyCardInfo.CARD_VC_STATUS)
    private final int mVcStatus;

    public ProprietaryCarKeyCardDetail(SeCard seCard) {
        CardInfo cardInfo = seCard.mCardInfo;
        this.mVcStatus = ((ProprietaryCarKeyCardInfo) cardInfo).mVCStatus;
        CardUIInfo cardUIInfo = cardInfo.mCardUIInfo;
        if (cardUIInfo != null) {
            this.mLogo = cardUIInfo.mCardLogoUrl;
            this.mProductDescription = cardUIInfo.mCardDesc;
        }
        this.mCId = ((ProprietaryCarKeyCardInfo) cardInfo).getCid();
        this.isCustomizable = ((ProprietaryCarKeyCardInfo) seCard.mCardInfo).isCustomizable();
    }

    public static ProprietaryCarKeyCardDetail fromJson(String str) {
        return (ProprietaryCarKeyCardDetail) new Gson().fromJson(str, ProprietaryCarKeyCardDetail.class);
    }

    public String getCId() {
        return this.mCId;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getDescription() {
        return this.mProductDescription;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getDescriptions() {
        return null;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getLabel() {
        return null;
    }

    public String getLogo() {
        return this.mLogo;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getServiceStatus() {
        return null;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getTips() {
        return null;
    }

    public int getVcStatus() {
        return this.mVcStatus;
    }

    public boolean isCustomizable() {
        return this.isCustomizable;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public boolean isServiceAvailable() {
        return true;
    }

    @Override // com.miui.tsmclient.sesdk.IJsonSerializer
    public String toJson() {
        return new Gson().toJson(this);
    }
}
