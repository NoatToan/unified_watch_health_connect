package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.terminal.IScTerminal;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class QrBankCardInfo extends BankCardInfo {
    public static final Parcelable.Creator<QrBankCardInfo> CREATOR = new Parcelable.Creator<QrBankCardInfo>() { // from class: com.miui.tsmclient.entity.QrBankCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QrBankCardInfo createFromParcel(Parcel parcel) {
            QrBankCardInfo qrBankCardInfo = new QrBankCardInfo();
            qrBankCardInfo.readFromParcel(parcel);
            return qrBankCardInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public QrBankCardInfo[] newArray(int i) {
            return new QrBankCardInfo[i];
        }
    };
    private static final String KEY_BG_IMAGE = "bg_image";
    public String mBgImage;

    public QrBankCardInfo() {
        super(CardInfo.CARD_TYPE_QRBANKCARD);
        this.mCardGroupId = CardGroupType.QRBANKCARD.getId();
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardInfo) {
            return TextUtils.equals(this.mVCReferenceId, ((QrBankCardInfo) obj).mVCReferenceId);
        }
        return false;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public IScTerminal getTerminal() {
        throw new UnsupportedOperationException("this card not support terminal");
    }

    @Override // com.miui.tsmclient.entity.BankCardInfo, com.miui.tsmclient.entity.CardInfo
    public boolean hasQRToken() {
        return true;
    }

    @Override // com.miui.tsmclient.entity.BankCardInfo, com.miui.tsmclient.entity.CardInfo
    public boolean isQrBankCard() {
        return true;
    }

    public boolean isSameReferenceId(String str) {
        return TextUtils.equals(this.mVCReferenceId, str);
    }

    @Override // com.miui.tsmclient.entity.BankCardInfo, com.miui.tsmclient.entity.CardInfo
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.mBgImage = parcel.readString();
    }

    @Override // com.miui.tsmclient.entity.BankCardInfo, com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObjectSerialize = super.serialize();
        try {
            jSONObjectSerialize.put(KEY_BG_IMAGE, this.mBgImage);
        } catch (JSONException e) {
            LogUtils.e("serialize qrbankcard info to json object failed!", e);
        }
        return jSONObjectSerialize;
    }

    public void setQrBankCardInfo(TsmRpcModels.CardIssuerInfo cardIssuerInfo) {
        this.mIssuerChannel = cardIssuerInfo.getCardIssueChannel().getNumber();
        this.mIssuerId = cardIssuerInfo.getIssuerId();
        this.mBankName = cardIssuerInfo.getBankName();
        this.mBankLogoUrl = cardIssuerInfo.getLogoUrl();
        this.mBankLogoWithNameUrl = cardIssuerInfo.getLogoWithBankNameUrl();
        this.mBankContactNum = cardIssuerInfo.getContactNumber();
        this.mBgImage = cardIssuerInfo.getBgImage();
        this.mServiceHotline = cardIssuerInfo.getHotline();
    }

    @Override // com.miui.tsmclient.entity.BankCardInfo, com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mBgImage);
    }

    @Override // com.miui.tsmclient.entity.BankCardInfo, com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.entity.ObjectParser
    public CardInfo parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            super.parse(jSONObject);
            this.mBgImage = jSONObject.optString(KEY_BG_IMAGE);
        }
        return this;
    }
}
