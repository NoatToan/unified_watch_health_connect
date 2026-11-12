package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ObjectUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ProprietaryCarKeyCardInfo extends CardInfo implements Parcelable {
    public static final String CARD_ART = "cardArt";
    public static final String CARD_FINGER_FLAG = "fingerFlag";
    public static final String CARD_INFO_DOOR_CARD_CID = "cid";
    public static final String CARD_INFO_DOOR_CARD_CUSTOMIZABLE = "customizable";
    public static final String CARD_INFO_DOOR_CARD_IS_SUPPORT_PERSONAL_ART = "supportPersonalArt";
    public static final String CARD_INFO_DOOR_CARD_PRODUCT_ID = "productId";
    public static final String CARD_INFO_DOOR_CARD_PRODUCT_NAME = "productName";
    public static final String CARD_INFO_DOOR_CARD_VC_UID = "vcUid";
    public static final String CARD_INFO_ISSUER_ID = "issuerId";
    public static final String CARD_INFO_KEY_ITEMS = "keyItems";
    public static final String CARD_INFO_MIFARE_CARD_TYPE = "cardType";
    public static final String CARD_INFO_NAME = "name";
    public static final String CARD_INFO_SUPPORT_KEY = "supportKey";
    public static final int CARD_STATUS_ACTIVE = 1;
    public static final String CARD_USER_TERMS = "userTerms";
    public static final String CARD_VC_STATUS = "vcStatus";
    public static final Parcelable.Creator<ProprietaryCarKeyCardInfo> CREATOR = new Parcelable.Creator<ProprietaryCarKeyCardInfo>() { // from class: com.miui.tsmclient.entity.ProprietaryCarKeyCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProprietaryCarKeyCardInfo createFromParcel(Parcel parcel) {
            ProprietaryCarKeyCardInfo proprietaryCarKeyCardInfo = new ProprietaryCarKeyCardInfo();
            proprietaryCarKeyCardInfo.readFromParcel(parcel);
            return proprietaryCarKeyCardInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProprietaryCarKeyCardInfo[] newArray(int i) {
            return new ProprietaryCarKeyCardInfo[i];
        }
    };
    private static final int FLAG_CANCEL_FINGER_AUTH = 1;
    public static final String KEY_PRODUCT_ID = "productId";
    private boolean isCustomizable;
    private String mBusinessId;
    private String mCId;
    public String mCardArt;
    public int mCardFace;
    public int mFingerAuthFlag;
    private boolean mIsSupportChildKey;
    private boolean mIsSupportPersonalArt;
    private String mIssuerId;
    private List<KeyItem> mKeyItems;
    public String mProductId;
    public String mProductName;
    public int mTraditionalCardType;
    private String mUIName;
    public String mUserTerms;
    public int mVCStatus;
    private String mVcUid;

    public ProprietaryCarKeyCardInfo() {
        this(CardInfo.CARD_TYPE_TRADITIONALCARKEYCARD, false);
    }

    public void cancelFinger() {
        this.mFingerAuthFlag = 1;
    }

    public String getBusinessId() {
        String str = this.mBusinessId;
        return str == null ? "" : str;
    }

    public String getCid() {
        return this.mCId;
    }

    public String getImageUrl() {
        return this.mCardArt;
    }

    public String getIssuerId() {
        return this.mIssuerId;
    }

    public List<KeyItem> getKeyItems() {
        return this.mKeyItems;
    }

    public String getProductId() {
        String str = this.mProductId;
        return str == null ? "" : str;
    }

    public String getProductName() {
        return this.mProductName;
    }

    public String getVcUid() {
        return this.mVcUid;
    }

    public boolean isCommunityDoorCardV3() {
        return !TextUtils.isEmpty(this.mBusinessId);
    }

    public boolean isCustomizable() {
        return this.isCustomizable;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isSecure() {
        return this.mFingerAuthFlag != 1;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isShowCardName() {
        return true;
    }

    public boolean isSupportChildKey() {
        return this.mIsSupportChildKey;
    }

    public boolean isSupportPersonalArt() {
        return this.mIsSupportPersonalArt;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isTraditionalCarKeyCard() {
        return true;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.mUIName = parcel.readString();
        this.mFingerAuthFlag = parcel.readInt();
        this.mUserTerms = parcel.readString();
        this.mCId = parcel.readString();
        this.mVCStatus = parcel.readInt();
        this.mVcUid = parcel.readString();
        this.mIssuerId = parcel.readString();
        this.mProductId = parcel.readString();
        this.mProductName = parcel.readString();
        this.mCardArt = parcel.readString();
        this.mTraditionalCardType = parcel.readInt();
        this.mIsSupportChildKey = parcel.readInt() == 1;
        this.mIsSupportPersonalArt = parcel.readInt() == 1;
        this.isCustomizable = parcel.readInt() == 1;
        this.mKeyItems = parcel.createTypedArrayList(KeyItem.CREATOR);
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObjectSerialize = super.serialize();
        try {
            jSONObjectSerialize.put("name", this.mUIName);
            jSONObjectSerialize.put(CARD_FINGER_FLAG, this.mFingerAuthFlag);
            jSONObjectSerialize.put(CARD_USER_TERMS, this.mUserTerms);
            jSONObjectSerialize.put("cid", this.mCId);
            jSONObjectSerialize.put(CARD_VC_STATUS, this.mVCStatus);
            jSONObjectSerialize.put("vcUid", this.mVcUid);
            jSONObjectSerialize.put("issuerId", this.mIssuerId);
            jSONObjectSerialize.put("productId", this.mProductId);
            jSONObjectSerialize.put("productName", this.mProductName);
            jSONObjectSerialize.put("cardArt", this.mCardArt);
            jSONObjectSerialize.put("cardType", this.mTraditionalCardType);
            jSONObjectSerialize.put(CARD_INFO_SUPPORT_KEY, this.mIsSupportChildKey);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_IS_SUPPORT_PERSONAL_ART, this.mIsSupportPersonalArt);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_CUSTOMIZABLE, this.isCustomizable);
            if (!ObjectUtils.isCollectionEmpty(this.mKeyItems)) {
                JSONArray jSONArray = new JSONArray();
                Iterator<KeyItem> it = this.mKeyItems.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().serialize());
                }
                jSONObjectSerialize.put(CARD_INFO_KEY_ITEMS, jSONArray);
            }
        } catch (JSONException e) {
            LogUtils.e("serialize traditionalCarKeyCardInfo info to json object failed!", e);
        }
        return jSONObjectSerialize;
    }

    public void setBusinessId(String str) {
        this.mBusinessId = str;
    }

    public void setCid(String str) {
        this.mCId = str;
    }

    public void setCustomizable(boolean z) {
        this.isCustomizable = z;
    }

    public void setIssuerId(String str) {
        this.mIssuerId = str;
    }

    public void setKeyItems(List<KeyItem> list) {
        this.mKeyItems = list;
    }

    public void setProductId(String str) {
        this.mProductId = str;
    }

    public void setProductName(String str) {
        this.mProductName = str;
    }

    public void setSupportChildKey(boolean z) {
        this.mIsSupportChildKey = z;
    }

    public void setSupportPersonalArt(boolean z) {
        this.mIsSupportPersonalArt = z;
    }

    public void setUIName(String str) {
        this.mUIName = str;
    }

    public void setVcUid(String str) {
        this.mVcUid = str;
    }

    public MifareCardInfo transformToMifareCardInfo() {
        MifareCardInfo mifareCardInfo = new MifareCardInfo();
        mifareCardInfo.mAid = this.mAid;
        mifareCardInfo.mMifareCardType = this.mTraditionalCardType;
        mifareCardInfo.mVCStatus = this.mVCStatus;
        mifareCardInfo.mCardName = this.mCardName;
        mifareCardInfo.mCardArt = this.mCardArt;
        mifareCardInfo.mFingerAuthFlag = this.mFingerAuthFlag;
        mifareCardInfo.mProductName = this.mProductName;
        mifareCardInfo.setProductId(this.mProductId);
        mifareCardInfo.setSupportChildKey(isSupportChildKey());
        mifareCardInfo.setKeyItems(this.mKeyItems);
        mifareCardInfo.setIssuerId(this.mIssuerId);
        mifareCardInfo.setSupportPersonalArt(isSupportPersonalArt());
        mifareCardInfo.setVcUid(this.mVcUid);
        mifareCardInfo.setCid(this.mCId);
        mifareCardInfo.setCustomizable(this.isCustomizable);
        return mifareCardInfo;
    }

    @Override // com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mUIName);
        parcel.writeInt(this.mFingerAuthFlag);
        parcel.writeString(this.mUserTerms);
        parcel.writeString(this.mCId);
        parcel.writeInt(this.mVCStatus);
        parcel.writeString(this.mVcUid);
        parcel.writeString(this.mIssuerId);
        parcel.writeString(this.mProductId);
        parcel.writeString(this.mProductName);
        parcel.writeString(this.mCardArt);
        parcel.writeInt(this.mTraditionalCardType);
        parcel.writeInt(this.mIsSupportChildKey ? 1 : 0);
        parcel.writeInt(this.mIsSupportPersonalArt ? 1 : 0);
        parcel.writeInt(this.isCustomizable ? 1 : 0);
        parcel.writeTypedList(this.mKeyItems);
    }

    public ProprietaryCarKeyCardInfo(String str, boolean z) {
        super(str, z);
        this.isCustomizable = false;
        this.mIsSupportPersonalArt = false;
        this.mCardGroupId = CardGroupType.PROPRIETARYCARKEY.getId();
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.entity.ObjectParser
    public CardInfo parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("name");
            this.mUIName = strOptString;
            this.mCardName = strOptString;
            this.mFingerAuthFlag = jSONObject.optInt(CARD_FINGER_FLAG);
            this.mUserTerms = jSONObject.optString(CARD_USER_TERMS);
            this.mCId = jSONObject.optString("cid");
            this.mVCStatus = jSONObject.optInt(CARD_VC_STATUS);
            this.mVcUid = jSONObject.optString("vcUid", this.mVcUid);
            this.mIssuerId = jSONObject.optString("issuerId");
            this.mProductId = jSONObject.optString("productId");
            this.mProductName = jSONObject.optString("productName");
            this.mCardArt = jSONObject.optString("cardArt");
            this.mTraditionalCardType = jSONObject.optInt("cardType");
            this.mIsSupportChildKey = jSONObject.optBoolean(CARD_INFO_SUPPORT_KEY);
            this.mIsSupportPersonalArt = jSONObject.optBoolean(CARD_INFO_DOOR_CARD_IS_SUPPORT_PERSONAL_ART);
            this.isCustomizable = jSONObject.optBoolean(CARD_INFO_DOOR_CARD_CUSTOMIZABLE, false);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(CARD_INFO_KEY_ITEMS);
            if (jSONArrayOptJSONArray == null) {
                this.mKeyItems = Collections.EMPTY_LIST;
            } else {
                this.mKeyItems = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    this.mKeyItems.add(new KeyItem().parse(jSONArrayOptJSONArray.optJSONObject(i)));
                }
            }
        }
        return this;
    }
}
