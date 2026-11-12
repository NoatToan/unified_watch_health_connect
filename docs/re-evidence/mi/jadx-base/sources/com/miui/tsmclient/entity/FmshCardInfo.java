package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.Coder;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class FmshCardInfo extends PayableCardInfo {
    public static final String CARD_INFO_FIELD_APP_NO = "app_no";
    public static final Parcelable.Creator<FmshCardInfo> CREATOR = new Parcelable.Creator<FmshCardInfo>() { // from class: com.miui.tsmclient.entity.FmshCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FmshCardInfo createFromParcel(Parcel parcel) {
            FmshCardInfo fmshCardInfo = new FmshCardInfo();
            fmshCardInfo.readFromParcel(parcel);
            return fmshCardInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FmshCardInfo[] newArray(int i) {
            return new FmshCardInfo[i];
        }
    };
    private static final String PATTERN_TRADE_TIME_SOURCE_DEFAULT = "yyyyMMdd HHmmss";
    private static final String PATTERN_TRADE_TIME_TARGET_DEFAULT = "yyyy/MM/dd HH:mm:ss";
    public byte[] mAppNo;

    public FmshCardInfo() {
        super(null);
    }

    private byte[] readBytesWithNull(Parcel parcel) {
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    private void writeBytesWithNull(Parcel parcel, byte[] bArr) {
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    public String getTradeTimeSourceFormat() {
        return PATTERN_TRADE_TIME_SOURCE_DEFAULT;
    }

    public String getTradeTimeTargetFormat() {
        return "yyyy/MM/dd HH:mm:ss";
    }

    @Override // com.miui.tsmclient.entity.PayableCardInfo, com.miui.tsmclient.entity.CardInfo
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.mAppNo = readBytesWithNull(parcel);
    }

    @Override // com.miui.tsmclient.entity.PayableCardInfo, com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObjectSerialize = super.serialize();
        try {
            jSONObjectSerialize.put(CARD_INFO_FIELD_APP_NO, Coder.bytesToHexString(this.mAppNo));
        } catch (JSONException e) {
            LogUtils.e("serialize cardinfo to jsonobject failed!", e);
        }
        return jSONObjectSerialize;
    }

    public void updateInfo(FmshCardInfo fmshCardInfo) {
        super.updateInfo((CardInfo) fmshCardInfo);
        String str = fmshCardInfo.mRealCardNo;
        this.mAppNo = str == null ? null : Coder.hexStringToBytes(str);
    }

    @Override // com.miui.tsmclient.entity.PayableCardInfo, com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        writeBytesWithNull(parcel, this.mAppNo);
    }

    public FmshCardInfo(String str) {
        super(str);
    }

    @Override // com.miui.tsmclient.entity.PayableCardInfo, com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.entity.ObjectParser
    public CardInfo parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        if (jSONObject != null) {
            this.mAppNo = Coder.hexStringToBytes(jSONObject.optString(CARD_INFO_FIELD_APP_NO));
        }
        return this;
    }
}
