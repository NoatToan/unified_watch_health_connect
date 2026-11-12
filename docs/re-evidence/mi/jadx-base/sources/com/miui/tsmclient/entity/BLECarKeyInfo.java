package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.util.LogUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class BLECarKeyInfo extends CardInfo implements Parcelable {
    public static final String BLE_KEY_ID_ALL = "ALL";
    public static final Parcelable.Creator<BLECarKeyInfo> CREATOR = new Parcelable.Creator<BLECarKeyInfo>() { // from class: com.miui.tsmclient.entity.BLECarKeyInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BLECarKeyInfo createFromParcel(Parcel parcel) {
            return new BLECarKeyInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BLECarKeyInfo[] newArray(int i) {
            return new BLECarKeyInfo[i];
        }
    };
    private static final String KEY_BLE_KEY_ID = "bleKeyId";
    private static final String KEY_CAR_COLOR = "carColor";
    private static final String KEY_CAR_IMAGE_URL = "carImageUrl";
    private static final String KEY_CAR_KEY_ART = "carKeyArt";
    private static final String KEY_CAR_KEY_NAME = "carKeyName";
    private static final String KEY_CAR_MODEL = "carModel";
    private static final String KEY_CAR_NAME = "carName";
    private static final String KEY_COMPANY_ID = "companyId";
    private static final String KEY_DELETE_LINK = "appDeleteLink";
    private static final String KEY_ENABLE_NEW_TASK = "enableNewTask";
    private static final String KEY_ISSUE_TIME = "issuerTime";
    private static final String KEY_MASKING_VIN = "maskingVin";
    private static final String KEY_PACKAGE_NAME = "issuerPackageName";
    private static final String KEY_PRODUCT_NAME = "productName";
    private boolean isEnableNewTask;
    private String mAppDeleteLink;
    private String mCarColor;
    private String mCarImageUrl;
    private String mCarKeyFace;
    private String mCarModel;
    private String mCarName;
    private String mCompanyId;
    private String mIssueTime;
    private String mKeyId;
    private String mMaskingVin;
    private String mPackageName;
    private String mProductName;

    public BLECarKeyInfo() {
        super(CardInfo.CARD_TYPE_BLE_CAR, false);
        this.mCardGroupId = CardGroupType.BLECARKEY.getId();
    }

    @Override // com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) obj;
        return TextUtils.equals(this.mKeyId, cardInfo.getCardId()) && TextUtils.equals(this.mCardDevice, cardInfo.mCardDevice);
    }

    public String getAppDeleteLink() {
        return this.mAppDeleteLink;
    }

    public String getCarColor() {
        return this.mCarColor;
    }

    public String getCarImageUrl() {
        return this.mCarImageUrl;
    }

    public String getCarKeyFace() {
        return this.mCarKeyFace;
    }

    public String getCarModel() {
        return this.mCarModel;
    }

    public String getCarName() {
        return this.mCarName;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public String getCardId() {
        return this.mKeyId;
    }

    public String getCompanyId() {
        return this.mCompanyId;
    }

    public String getIssueTime() {
        return this.mIssueTime;
    }

    public String getMaskingVin() {
        return this.mMaskingVin;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getProductName() {
        return this.mProductName;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isBLECarKeyCard() {
        return true;
    }

    public boolean isEnableNewTask() {
        return this.isEnableNewTask;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isShowCardName() {
        return true;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isVisibleInSwipingCardActivity() {
        return false;
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObjectSerialize = super.serialize();
        try {
            jSONObjectSerialize.put("bleKeyId", this.mKeyId);
            jSONObjectSerialize.put("companyId", this.mCompanyId);
            jSONObjectSerialize.put("carKeyName", this.mCardName);
            jSONObjectSerialize.put("carColor", this.mCarColor);
            jSONObjectSerialize.put("carModel", this.mCarModel);
            jSONObjectSerialize.put("carKeyArt", this.mCarKeyFace);
            jSONObjectSerialize.put("maskingVin", this.mMaskingVin);
            jSONObjectSerialize.put("carImageUrl", this.mCarImageUrl);
            jSONObjectSerialize.put("issuerPackageName", this.mPackageName);
            jSONObjectSerialize.put(KEY_ISSUE_TIME, this.mIssueTime);
            jSONObjectSerialize.put("carName", this.mCarName);
            jSONObjectSerialize.put("productName", this.mProductName);
            jSONObjectSerialize.put(KEY_DELETE_LINK, this.mAppDeleteLink);
            jSONObjectSerialize.put("enableNewTask", this.isEnableNewTask);
        } catch (JSONException e) {
            LogUtils.e("serialize ble key info to json object failed!", e);
        }
        return jSONObjectSerialize;
    }

    public void setCarColor(String str) {
        this.mCarColor = str;
    }

    public void setCarImageUrl(String str) {
        this.mCarImageUrl = str;
    }

    public void setCarKeyFace(String str) {
        this.mCarKeyFace = str;
    }

    public void setCarModel(String str) {
        this.mCarModel = str;
    }

    public void setCarName(String str) {
        this.mCarName = str;
    }

    public void setCompanyId(String str) {
        this.mCompanyId = str;
    }

    public void setIssueTime(String str) {
        this.mIssueTime = str;
    }

    public void setKeyId(String str) {
        this.mKeyId = str;
    }

    public void setMaskingVin(String str) {
        this.mMaskingVin = str;
    }

    public void setPackageName(String str) {
        this.mPackageName = str;
    }

    @Override // com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mKeyId);
        parcel.writeString(this.mCompanyId);
        parcel.writeString(this.mCarName);
        parcel.writeString(this.mCarColor);
        parcel.writeString(this.mCarModel);
        parcel.writeString(this.mCarKeyFace);
        parcel.writeString(this.mMaskingVin);
        parcel.writeString(this.mCarImageUrl);
        parcel.writeString(this.mPackageName);
        parcel.writeString(this.mIssueTime);
        parcel.writeString(this.mProductName);
        parcel.writeString(this.mAppDeleteLink);
        parcel.writeByte(this.isEnableNewTask ? (byte) 1 : (byte) 0);
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.entity.ObjectParser
    public CardInfo parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        if (jSONObject != null) {
            this.mKeyId = jSONObject.optString("bleKeyId");
            this.mCompanyId = jSONObject.optString("companyId");
            this.mCardName = jSONObject.optString("carKeyName");
            this.mCarColor = jSONObject.optString("carColor");
            this.mCarModel = jSONObject.optString("carModel");
            this.mCarKeyFace = jSONObject.optString("carKeyArt");
            this.mMaskingVin = jSONObject.optString("maskingVin");
            this.mCarImageUrl = jSONObject.optString("carImageUrl");
            this.mPackageName = jSONObject.optString("issuerPackageName");
            this.mIssueTime = jSONObject.optString(KEY_ISSUE_TIME);
            this.mCarName = jSONObject.optString("carName");
            this.mProductName = jSONObject.optString("productName");
            this.mAppDeleteLink = jSONObject.optString(KEY_DELETE_LINK);
            this.isEnableNewTask = jSONObject.optBoolean("enableNewTask");
        }
        return this;
    }

    public BLECarKeyInfo(Parcel parcel) {
        super(parcel);
        this.mKeyId = parcel.readString();
        this.mCompanyId = parcel.readString();
        this.mCarName = parcel.readString();
        this.mCarColor = parcel.readString();
        this.mCarModel = parcel.readString();
        this.mCarKeyFace = parcel.readString();
        this.mMaskingVin = parcel.readString();
        this.mCarImageUrl = parcel.readString();
        this.mPackageName = parcel.readString();
        this.mIssueTime = parcel.readString();
        this.mProductName = parcel.readString();
        this.mAppDeleteLink = parcel.readString();
        this.isEnableNewTask = parcel.readByte() == 1;
    }
}
