package com.miui.tsmclient.sesdk;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardUIInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TransitCardGroupDetail implements IJsonSerializer, IJsonDeserializer<TransitCardGroupDetail>, SeCard.IOnlineProperties {
    private static final String KEY_FAMILY_DESC1 = "familyDesc1";
    private static final String KEY_FAMILY_DESC2 = "familyDesc2";
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

    public TransitCardGroupDetail(SeCard seCard) {
        CardInfo cardInfo = seCard.mCardInfo;
        this.mCardInfo = cardInfo;
        CardUIInfo cardUIInfo = cardInfo.mCardUIInfo;
        this.mDescription = cardUIInfo != null ? cardUIInfo.mFamilyDesc1 : null;
        JSONObject jSONObject = new JSONObject();
        try {
            CardUIInfo cardUIInfo2 = this.mCardInfo.mCardUIInfo;
            if (cardUIInfo2 != null) {
                jSONObject.put("familyDesc1", cardUIInfo2.mFamilyDesc1);
                jSONObject.put("familyDesc2", this.mCardInfo.mCardUIInfo.mFamilyDesc2);
            }
        } catch (JSONException unused) {
        }
        this.mDescriptions = jSONObject.toString();
        this.mServiceStatus = null;
        this.mIsServiceAvailable = true;
        this.mTips = null;
        this.mLabel = null;
    }

    public static TransitCardGroupDetail fromJson(String str) {
        return (TransitCardGroupDetail) new Gson().fromJson(str, TransitCardGroupDetail.class);
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

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public boolean isServiceAvailable() {
        return this.mIsServiceAvailable;
    }

    @Override // com.miui.tsmclient.sesdk.IJsonSerializer
    public String toJson() {
        return new Gson().toJson(this);
    }
}
