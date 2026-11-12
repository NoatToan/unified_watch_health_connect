package com.miui.tsmclient.sesdk;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoExtra;
import com.miui.tsmclient.entity.CloudTransitCardInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class CloudTransitCardDetail implements IJsonSerializer, IJsonDeserializer<CloudTransitCardDetail>, SeCard.IOnlineProperties {
    private static final String KEY_DEVICE_MODEL = "deviceModel";
    private transient CardInfo mCardInfo;

    @SerializedName("description")
    private String mDescription;

    @SerializedName("descriptions")
    private String mDescriptions;

    @SerializedName("isCanTransferIn")
    private boolean mIsCanTransferIn;

    @SerializedName("isServiceAvailable")
    private boolean mIsServiceAvailable;

    @SerializedName("label")
    private String mLabel;

    @SerializedName("serviceStatus")
    private String mServiceStatus;

    @SerializedName("tips")
    private String mTips;

    public CloudTransitCardDetail(SeCard seCard) {
        CardInfo cardInfo = seCard.mCardInfo;
        this.mCardInfo = cardInfo;
        this.mDescription = ((CloudTransitCardInfo) cardInfo).getCardBalanceTitle();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceModel", ((CloudTransitCardInfo) this.mCardInfo).getCardLastUsedDeviceModel());
        } catch (JSONException unused) {
        }
        this.mDescriptions = jSONObject.toString();
        this.mServiceStatus = this.mCardInfo.getServiceStatusDesc();
        this.mIsServiceAvailable = this.mCardInfo.isServiceAvailable();
        this.mTips = CardInfoExtra.get(this.mCardInfo.getExtra()).getCardToast();
        this.mLabel = null;
        this.mIsCanTransferIn = ((CloudTransitCardInfo) this.mCardInfo).canTransferIn();
    }

    public static CloudTransitCardDetail fromJson(String str) {
        return (CloudTransitCardDetail) new Gson().fromJson(str, CloudTransitCardDetail.class);
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

    public boolean isCanTransferIn() {
        return this.mIsCanTransferIn;
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
