package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.miui.tsmclient.util.LogUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class EidCardInfo extends CardInfo {
    public static final String CARD_ART = "card_art";
    public static final String CARD_VC_STATUS = "card_vc_status";
    public static final Parcelable.Creator<EidCardInfo> CREATOR = new Parcelable.Creator<EidCardInfo>() { // from class: com.miui.tsmclient.entity.EidCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EidCardInfo createFromParcel(Parcel parcel) {
            EidCardInfo eidCardInfo = new EidCardInfo();
            eidCardInfo.readFromParcel(parcel);
            return eidCardInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EidCardInfo[] newArray(int i) {
            return new EidCardInfo[i];
        }
    };
    private String mCardArt;
    private int mVCStatus;

    public EidCardInfo() {
        super(CardInfo.CARD_TYPE_EID, true);
        this.mCardGroupId = CardGroupType.EIDCARD.getId();
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public String getCardArt() {
        return this.mCardArt;
    }

    public int getVCStatus() {
        return this.mVCStatus;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.mCardArt = parcel.readString();
        this.mVCStatus = parcel.readInt();
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObjectSerialize = super.serialize();
        try {
            jSONObjectSerialize.put("card_art", this.mCardArt);
            jSONObjectSerialize.put("card_vc_status", this.mVCStatus);
        } catch (JSONException e) {
            LogUtils.e("serialize bankcard info to json object failed!", e);
        }
        return jSONObjectSerialize;
    }

    public void setCardArt(String str) {
        this.mCardArt = str;
    }

    public void setVCStatus(int i) {
        this.mVCStatus = i;
    }

    @Override // com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mCardArt);
        parcel.writeInt(this.mVCStatus);
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.entity.ObjectParser
    public CardInfo parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        if (jSONObject != null) {
            this.mCardArt = jSONObject.optString("card_art");
            this.mVCStatus = jSONObject.optInt("card_vc_status");
        }
        return this;
    }
}
