package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.CardConstants;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class DCEPCardInfo extends CardInfo implements Parcelable {
    public static final Parcelable.Creator<DCEPCardInfo> CREATOR = new Parcelable.Creator<DCEPCardInfo>() { // from class: com.miui.tsmclient.entity.DCEPCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DCEPCardInfo createFromParcel(Parcel parcel) {
            DCEPCardInfo dCEPCardInfo = new DCEPCardInfo(null);
            dCEPCardInfo.readFromParcel(parcel);
            return dCEPCardInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DCEPCardInfo[] newArray(int i) {
            return new DCEPCardInfo[i];
        }
    };
    public static final String DEFAULT_AID = "A000000044434550";
    private static final String KEY_INSTAID = "instAid";
    private static final String KEY_ORG = "org";
    private static final String KEY_WALLETID = "walletId";
    private static final String KEY_WALLETINSTNO = "walletInstNo";
    private static final String KEY_WALLET_ID_WITH_MASK = "walletIdWithMask";
    private static final String PARAM_ADDSIGN = "addSign";
    private static final String PARAM_TIMESTAMP = "timestamp";
    private static final String PARAM_WALLET_ID_WITH_MASK = "walletIdWithMask";
    private String mContextId;
    private String mOrg;
    private String mSign;
    private String mTimeStamp;
    private TradeType mTradeType;
    private String mWalletIdWithMask;
    private String mWalletInstNo;

    public enum TradeType {
        UNKNOWN("00"),
        ADD("01"),
        REDUCE("02"),
        INVARIANT("03");

        private String mId;

        TradeType(String str) {
            this.mId = str;
        }

        public static TradeType getTradeType(String str) {
            for (TradeType tradeType : values()) {
                if (tradeType.mId.equals(str)) {
                    return tradeType;
                }
            }
            return UNKNOWN;
        }
    }

    public DCEPCardInfo() {
        this("DCEPCARD");
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DCEPCardInfo dCEPCardInfo = (DCEPCardInfo) obj;
        String str = this.mContextId;
        if (str != null && TextUtils.equals(str, dCEPCardInfo.mContextId)) {
            return true;
        }
        String str2 = this.mAid;
        return str2 != null && TextUtils.equals(str2, dCEPCardInfo.mAid);
    }

    public String getContextId() {
        return this.mContextId;
    }

    public String getWalletIdWithMask() {
        return this.mWalletIdWithMask;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.mContextId, this.mWalletInstNo, this.mOrg, this.mSign, this.mTimeStamp, this.mTradeType);
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isDCEPCard() {
        return true;
    }

    public boolean isSameContextId(String str) {
        return TextUtils.equals(this.mContextId, str);
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.mContextId = parcel.readString();
        this.mWalletInstNo = parcel.readString();
        this.mOrg = parcel.readString();
        this.mWalletIdWithMask = parcel.readString();
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObjectSerialize = super.serialize();
        try {
            jSONObjectSerialize.put("walletId", this.mContextId);
            jSONObjectSerialize.put(KEY_INSTAID, this.mAid);
            jSONObjectSerialize.put(KEY_WALLETINSTNO, this.mWalletInstNo);
            jSONObjectSerialize.put(KEY_ORG, this.mOrg);
            jSONObjectSerialize.put("card_balance", this.mCardBalance);
            jSONObjectSerialize.put("walletIdWithMask", this.mWalletIdWithMask);
        } catch (JSONException e) {
            LogUtils.e("serialize DigitalCurrencyCard info to json object failed!", e);
        }
        return jSONObjectSerialize;
    }

    public void setAmount(TradeType tradeType, long j) {
        if (tradeType == TradeType.ADD) {
            this.mCardBalance = (int) (((long) this.mCardBalance) + j);
        }
        if (tradeType == TradeType.REDUCE) {
            this.mCardBalance = (int) (((long) this.mCardBalance) - j);
        }
    }

    public void setContextId(String str) {
        this.mContextId = str;
    }

    public void setOrg(String str) {
        this.mOrg = str;
    }

    public void setSign(String str) {
        this.mSign = str;
    }

    public void setTimeStamp(String str) {
        this.mTimeStamp = str;
    }

    public void setWalletIdWithMask(String str) {
        this.mWalletIdWithMask = str;
    }

    public void setWalletInstNo(String str) {
        this.mWalletInstNo = str;
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("walletId", this.mContextId);
            jSONObject.put(KEY_INSTAID, this.mAid);
            jSONObject.put(KEY_WALLETINSTNO, this.mWalletInstNo);
            jSONObject.put(KEY_ORG, this.mOrg);
            jSONObject.put(PARAM_ADDSIGN, this.mSign);
            jSONObject.put("timestamp", this.mTimeStamp);
            jSONObject.put("walletIdWithMask", this.mWalletIdWithMask);
        } catch (JSONException unused) {
        }
        LogUtils.t("DigitalCurrencyCardInfo params:" + jSONObject.toString());
        return jSONObject.toString();
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public void updateInfo(CardInfo cardInfo) {
        super.updateInfo(cardInfo);
        DCEPCardInfo dCEPCardInfo = (DCEPCardInfo) cardInfo;
        this.mContextId = dCEPCardInfo.mContextId;
        this.mWalletInstNo = dCEPCardInfo.mWalletInstNo;
        this.mOrg = dCEPCardInfo.mOrg;
        this.mAid = dCEPCardInfo.mAid;
    }

    @Override // com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mContextId);
        parcel.writeString(this.mWalletInstNo);
        parcel.writeString(this.mOrg);
        parcel.writeString(this.mWalletIdWithMask);
    }

    public DCEPCardInfo(String str) {
        super(str);
        this.mTradeType = TradeType.UNKNOWN;
        this.mCardName = "DCEP";
        this.mIsSecure = true;
        this.mCardGroupId = CardGroupType.DCEP.getId();
        this.mCardBalance = CardConstants.RESULT_INVALID;
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.entity.ObjectParser
    public CardInfo parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        if (jSONObject == null) {
            return this;
        }
        if (jSONObject.has("walletId")) {
            this.mContextId = jSONObject.optString("walletId");
        }
        if (jSONObject.has(KEY_INSTAID)) {
            this.mAid = jSONObject.optString(KEY_INSTAID);
        }
        if (jSONObject.has(KEY_WALLETINSTNO)) {
            this.mWalletInstNo = jSONObject.optString(KEY_WALLETINSTNO);
        }
        if (jSONObject.has(KEY_ORG)) {
            this.mOrg = jSONObject.optString(KEY_ORG);
        }
        if (jSONObject.has("card_balance")) {
            this.mCardBalance = jSONObject.optInt("card_balance");
        }
        if (jSONObject.has("walletIdWithMask")) {
            this.mWalletIdWithMask = jSONObject.optString("walletIdWithMask");
        }
        return this;
    }
}
