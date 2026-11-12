package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.util.LogUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MifareCardInfo extends CardInfo {
    public static final String CARD_ART = "card_art";
    public static final int CARD_FACE1 = 1;
    public static final int CARD_FACE2 = 2;
    public static final String CARD_FINGER_FLAG = "card_finger_flag";
    public static final String CARD_INFO_DOOR_CARD_APPLY_STATUS = "apply_status";
    public static final String CARD_INFO_DOOR_CARD_BUSINESS_ID = "business_id";
    public static final String CARD_INFO_DOOR_CARD_CID = "door_card_cid";
    public static final String CARD_INFO_DOOR_CARD_COMMUNITY_CODE = "community_code";
    public static final String CARD_INFO_DOOR_CARD_COMMUNITY_FLOW_STATUS = "community_flow_status";
    public static final String CARD_INFO_DOOR_CARD_COMMUNITY_TICKET = "community_ticket";
    public static final String CARD_INFO_DOOR_CARD_CUSTOMIZABLE = "door_card_customizable";
    public static final String CARD_INFO_DOOR_CARD_IS_SUPPORT_PERSONAL_ART = "is_support_personal_art";
    public static final String CARD_INFO_DOOR_CARD_PRODUCT_ID = "door_card_product_id";
    public static final String CARD_INFO_DOOR_CARD_PRODUCT_NAME = "door_card_product_name";
    public static final String CARD_INFO_DOOR_CARD_SUPPORT_QUERY_RECORD = "door_card_support_query_trans_record";
    public static final String CARD_INFO_DOOR_CARD_SUPPORT_RECHARGE = "door_card_support_recharge";
    public static final String CARD_INFO_DOOR_CARD_VC_UID = "door_card_vc_uid";
    public static final String CARD_INFO_IS_SECTOR_OVERWRITTEN = "is_sector_overwritten";
    public static final String CARD_INFO_MIFARE_CARD_TYPE = "mifare_card_type";
    public static final String CARD_INFO_WAITING_TIME = "timeWait";
    public static final String CARD_NATIVE_DRAWABLE_RES = "card_native_drawable";
    public static final int CARD_STATUS_ACTIVE = 1;
    public static final String CARD_USER_TERMS = "card_user_terms";
    public static final String CARD_VC_STATUS = "card_vc_status";
    public static final Parcelable.Creator<MifareCardInfo> CREATOR = new Parcelable.Creator<MifareCardInfo>() { // from class: com.miui.tsmclient.entity.MifareCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MifareCardInfo createFromParcel(Parcel parcel) {
            MifareCardInfo mifareCardInfo = new MifareCardInfo();
            mifareCardInfo.readFromParcel(parcel);
            return mifareCardInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MifareCardInfo[] newArray(int i) {
            return new MifareCardInfo[i];
        }
    };
    private static final int FLAG_CANCEL_FINGER_AUTH = 1;
    private static final int FLAG_ENCRYPTED_SECTOR_DATA_PREPARING = 7;
    private static final int FLAG_WAIT_TO_WRITE_ENCRYPTED_SECTOR = 6;
    public static final String KEY_PRODUCT_ID = "productId";
    private static final String MI_ENTRANCE_AID = "5849414F4D49000001";
    private boolean isBackedUp;
    private boolean isCustomizable;
    private boolean isOverWrite;
    private boolean isSectorOverwritten;
    private boolean isSupportBackup;
    private boolean isSupportDownload;
    private boolean isSupportQueryTransRecord;
    private boolean isSupportRecharge;
    private String mApplyStatus;
    private String mBusinessId;
    private String mCId;
    public String mCardArt;
    public int mCardFace;
    private String mCloudCId;
    private int mCommunityCardFlowStatus;
    private String mCommunityCode;
    public int mFingerAuthFlag;
    private boolean mIsSupportChildKey;
    private boolean mIsSupportPersonalArt;
    private String mIssuerId;
    private List<KeyItem> mKeyItems;
    public int mMifareCardType;
    public String mProductId;
    public String mProductName;
    private String mTicket;
    public String mUserTerms;
    public int mVCStatus;
    private String mVcUid;
    private String mWaitingTime;

    public enum APPLY_STATUS {
        ISSUED,
        APPLIED,
        DELETED
    }

    public static class CommunityCardFlowStatus {
        public static final int CARD_STATUS_APPLYING = 1;
        public static final int CARD_STATUS_APPLY_FAILED = 2;
        public static final int CARD_STATUS_APPLY_SUCCESS = 3;
        public static final int CARD_STATUS_NONE = 0;
        public static final int CARD_STATUS_PERMISSION_CHANGE_DELETE = 5;
        public static final int CARD_STATUS_PERMISSION_CHANGE_REISSUE = 4;

        private CommunityCardFlowStatus() {
        }
    }

    public static class MifareType {
        public static final int CARD_TYPE_CAR_KEYS = 5;
        public static final int CARD_TYPE_CUSTOM_BLANK = 1;
        public static final int CARD_TYPE_DOOR_LOCK = 2;
        public static final int CARD_TYPE_GOVERNMENT_ENTERPRISE = 4;
        public static final int CARD_TYPE_KEY_CAMPUS = 8;
        public static final int CARD_TYPE_M1_ONLINE = 3;
        public static final int CARD_TYPE_M1_ONLINE_V3 = 6;
        public static final int CARD_TYPE_NORMAL = 0;
        public static final int CARD_TYPE_ONLINE_CPU = 7;
    }

    public interface ServiceType {
        public static final int BLANK_CARD = 4;
        public static final int CPU_CARD = 5;
        public static final int DOOR_CARD = 6;
        public static final int MIFARE_CARD = 1;
    }

    public MifareCardInfo() {
        super(CardInfo.CARD_TYPE_MIFARE);
        this.isCustomizable = true;
        this.mIsSupportPersonalArt = true;
        this.isSectorOverwritten = true;
        this.mIsSecure = false;
        this.mCardGroupId = CardGroupType.MIFARECARD.getId();
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

    public String getCloudCid() {
        return this.mCloudCId;
    }

    public int getCommunityCardFlowStatus() {
        return this.mCommunityCardFlowStatus;
    }

    public String getCommunityCode() {
        String str = this.mCommunityCode;
        return str == null ? "" : str;
    }

    public String getImageUrl() {
        return TextUtils.isEmpty(this.mCardArt) ? String.valueOf(this.mCardFace) : this.mCardArt;
    }

    public String getIssuerId() {
        return this.mIssuerId;
    }

    public List<KeyItem> getKeyItems() {
        return this.mKeyItems;
    }

    public int getMifareCardType() {
        return this.mMifareCardType;
    }

    public String getProductId() {
        String str = this.mProductId;
        return str == null ? "" : str;
    }

    public String getProductName() {
        return this.mProductName;
    }

    public int getServiceType() {
        int i = this.mMifareCardType;
        return (i == 1 || i == 6) ? 6 : 1;
    }

    public String getTicket() {
        String str = this.mTicket;
        return str == null ? "" : str;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public String getUpdateArtContent() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aid", this.mAid);
            jSONObject.put("cardType", this.mCardType);
            jSONObject.put("productId", this.mProductId);
            jSONObject.put(CardInfo.KEY_UPDATE_KEY, 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("status", 1);
            jSONObject.put(CardInfo.KEY_UPDATE_CONTENT, jSONObject2);
        } catch (JSONException e) {
            LogUtils.e("getUpdateArtContent error", e);
        }
        return jSONObject.toString();
    }

    public int getVCStatus() {
        return this.mVCStatus;
    }

    public String getVcUid() {
        return this.mVcUid;
    }

    public String getWaitingTime() {
        return this.mWaitingTime;
    }

    public boolean hasSectorOverwritten() {
        return this.isSectorOverwritten;
    }

    public boolean isApplying() {
        return APPLY_STATUS.APPLIED.name().equals(this.mApplyStatus);
    }

    public boolean isBackedUp() {
        return this.isBackedUp;
    }

    public boolean isCommunityDoorCardV3() {
        return !TextUtils.isEmpty(this.mBusinessId);
    }

    public boolean isCustomizable() {
        return this.isCustomizable;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isDeletable() {
        int i;
        return !isCommunityDoorCardV3() || !isApplying() || (i = this.mCommunityCardFlowStatus) == 2 || i == 5;
    }

    public boolean isDummy() {
        return (TextUtils.isEmpty(this.mApplyStatus) || APPLY_STATUS.ISSUED.name().equals(this.mApplyStatus)) ? false : true;
    }

    public boolean isEncryptedDataPrepared() {
        return this.mVCStatus == 7;
    }

    public boolean isM1Card() {
        int mifareCardType = getMifareCardType();
        return mifareCardType == 1 || mifareCardType == 0 || mifareCardType == 6;
    }

    public boolean isMiEntranceCard() {
        return MI_ENTRANCE_AID.equals(getAid());
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isMiFareCard() {
        return true;
    }

    public boolean isOverWrite() {
        return this.isOverWrite;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isSecure() {
        return this.mFingerAuthFlag != 1;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isShowCardName() {
        return true;
    }

    public boolean isSupportBackup() {
        return this.isSupportBackup;
    }

    public boolean isSupportChildKey() {
        return this.mIsSupportChildKey;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isSupportDownload() {
        return this.isSupportDownload;
    }

    public boolean isSupportPersonalArt() {
        return this.mIsSupportPersonalArt;
    }

    public boolean isSupportQueryTransRecord() {
        return this.isSupportQueryTransRecord;
    }

    public boolean isSupportRecharge() {
        return this.isSupportRecharge;
    }

    public boolean isUnnormalCardStatus() {
        return isWaitingToWriteDataStatus() || isEncryptedDataPrepared() || (isCommunityDoorCardV3() && getCommunityCardFlowStatus() != 0);
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isVisibleInSwipingCardActivity() {
        return !isDummy();
    }

    public boolean isWaitingToWriteDataStatus() {
        return this.mVCStatus == 6;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public void parseCardFromJson(JSONObject jSONObject) {
        super.parseCardFromJson(jSONObject);
        if (jSONObject == null || !jSONObject.has("card_art")) {
            return;
        }
        this.mCardArt = jSONObject.optString("card_art");
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.mUserTerms = parcel.readString();
        this.mCardArt = parcel.readString();
        this.mVCStatus = parcel.readInt();
        this.mCardFace = parcel.readInt();
        this.mFingerAuthFlag = parcel.readInt();
        this.mMifareCardType = parcel.readInt();
        this.mProductId = parcel.readString();
        this.mProductName = parcel.readString();
        this.mCommunityCode = parcel.readString();
        this.mBusinessId = parcel.readString();
        this.mTicket = parcel.readString();
        this.mCommunityCardFlowStatus = parcel.readInt();
        this.isOverWrite = parcel.readInt() == 1;
        this.mApplyStatus = parcel.readString();
        this.mIsSupportChildKey = parcel.readInt() == 1;
        this.mKeyItems = parcel.createTypedArrayList(KeyItem.CREATOR);
        this.mProductName = parcel.readString();
        this.mIssuerId = parcel.readString();
        this.mIsSupportPersonalArt = parcel.readInt() == 1;
        this.mVcUid = parcel.readString();
        this.mCId = parcel.readString();
        this.mWaitingTime = parcel.readString();
        this.isCustomizable = parcel.readInt() == 1;
        this.isSupportBackup = parcel.readInt() == 1;
        this.isSupportDownload = parcel.readInt() == 1;
        this.isBackedUp = parcel.readInt() == 1;
        this.mCloudCId = parcel.readString();
        this.isSupportRecharge = parcel.readInt() == 1;
        this.isSupportQueryTransRecord = parcel.readInt() == 1;
        this.isSectorOverwritten = parcel.readInt() == 1;
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObjectSerialize = super.serialize();
        try {
            jSONObjectSerialize.put(CARD_FINGER_FLAG, this.mFingerAuthFlag);
            jSONObjectSerialize.put(CARD_INFO_MIFARE_CARD_TYPE, this.mMifareCardType);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_PRODUCT_ID, this.mProductId);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_PRODUCT_NAME, this.mProductName);
            jSONObjectSerialize.put("card_user_terms", this.mUserTerms);
            jSONObjectSerialize.put("card_art", this.mCardArt);
            jSONObjectSerialize.put("card_vc_status", this.mVCStatus);
            jSONObjectSerialize.putOpt(CARD_NATIVE_DRAWABLE_RES, Integer.valueOf(this.mCardFace));
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_COMMUNITY_CODE, this.mCommunityCode);
            jSONObjectSerialize.put("business_id", this.mBusinessId);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_APPLY_STATUS, this.mApplyStatus);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_COMMUNITY_FLOW_STATUS, this.mCommunityCardFlowStatus);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_COMMUNITY_TICKET, this.mTicket);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_IS_SUPPORT_PERSONAL_ART, this.mIsSupportPersonalArt);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_VC_UID, this.mVcUid);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_CID, this.mCId);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_CUSTOMIZABLE, this.isCustomizable);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_SUPPORT_RECHARGE, this.isSupportRecharge);
            jSONObjectSerialize.put(CARD_INFO_DOOR_CARD_SUPPORT_QUERY_RECORD, this.isSupportQueryTransRecord);
            jSONObjectSerialize.put(CARD_INFO_IS_SECTOR_OVERWRITTEN, this.isSectorOverwritten);
        } catch (JSONException e) {
            LogUtils.e("serialize mifarecard info to json object failed!", e);
        }
        return jSONObjectSerialize;
    }

    public void setApplyStatus(String str) {
        this.mApplyStatus = str;
    }

    public void setBackedUp(boolean z) {
        this.isBackedUp = z;
    }

    public void setBusinessId(String str) {
        this.mBusinessId = str;
    }

    public void setCid(String str) {
        this.mCId = str;
    }

    public void setCloudCid(String str) {
        this.mCloudCId = str;
    }

    public void setCommunityCardFlowStatus(int i) {
        this.mCommunityCardFlowStatus = i;
    }

    public void setCommunityCode(String str) {
        this.mCommunityCode = str;
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

    public void setOverWrite(boolean z) {
        this.isOverWrite = z;
    }

    public void setProductId(String str) {
        this.mProductId = str;
    }

    public void setProductName(String str) {
        this.mProductName = str;
    }

    public void setSectorOverwritten(boolean z) {
        this.isSectorOverwritten = z;
    }

    public void setSupportBackup(boolean z) {
        this.isSupportBackup = z;
    }

    public void setSupportChildKey(boolean z) {
        this.mIsSupportChildKey = z;
    }

    public void setSupportDownload(boolean z) {
        this.isSupportDownload = z;
    }

    public void setSupportPersonalArt(boolean z) {
        this.mIsSupportPersonalArt = z;
    }

    public void setSupportQueryTransRecord(boolean z) {
        this.isSupportQueryTransRecord = z;
    }

    public void setSupportRecharge(boolean z) {
        this.isSupportRecharge = z;
    }

    public void setTicket(String str) {
        this.mTicket = str;
    }

    public void setVCStatus(int i) {
        this.mVCStatus = i;
    }

    public void setVcUid(String str) {
        this.mVcUid = str;
    }

    public void setWaitingTime(String str) {
        this.mWaitingTime = str;
    }

    public ProprietaryCarKeyCardInfo transformToProprietaryCarKeyCardInfo() {
        ProprietaryCarKeyCardInfo proprietaryCarKeyCardInfo = new ProprietaryCarKeyCardInfo();
        proprietaryCarKeyCardInfo.mAid = this.mAid;
        proprietaryCarKeyCardInfo.mTraditionalCardType = this.mMifareCardType;
        proprietaryCarKeyCardInfo.mVCStatus = this.mVCStatus;
        proprietaryCarKeyCardInfo.mCardName = this.mCardName;
        proprietaryCarKeyCardInfo.mCardArt = this.mCardArt;
        proprietaryCarKeyCardInfo.mCardFace = this.mCardFace;
        proprietaryCarKeyCardInfo.mFingerAuthFlag = this.mFingerAuthFlag;
        proprietaryCarKeyCardInfo.mProductName = this.mProductName;
        proprietaryCarKeyCardInfo.setProductId(this.mProductId);
        proprietaryCarKeyCardInfo.setBusinessId(this.mBusinessId);
        proprietaryCarKeyCardInfo.setSupportChildKey(isSupportChildKey());
        proprietaryCarKeyCardInfo.setKeyItems(this.mKeyItems);
        proprietaryCarKeyCardInfo.setIssuerId(this.mIssuerId);
        proprietaryCarKeyCardInfo.setSupportPersonalArt(isSupportPersonalArt());
        proprietaryCarKeyCardInfo.setVcUid(this.mVcUid);
        proprietaryCarKeyCardInfo.setCid(this.mCId);
        proprietaryCarKeyCardInfo.setCustomizable(this.isCustomizable);
        proprietaryCarKeyCardInfo.setKeepActivated(isKeepActivated());
        return proprietaryCarKeyCardInfo;
    }

    @Override // com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mUserTerms);
        parcel.writeString(this.mCardArt);
        parcel.writeInt(this.mVCStatus);
        parcel.writeInt(this.mCardFace);
        parcel.writeInt(this.mFingerAuthFlag);
        parcel.writeInt(this.mMifareCardType);
        parcel.writeString(this.mProductId);
        parcel.writeString(this.mProductName);
        parcel.writeString(this.mCommunityCode);
        parcel.writeString(this.mBusinessId);
        parcel.writeString(this.mTicket);
        parcel.writeInt(this.mCommunityCardFlowStatus);
        parcel.writeInt(this.isOverWrite ? 1 : 0);
        parcel.writeString(this.mApplyStatus);
        parcel.writeInt(this.mIsSupportChildKey ? 1 : 0);
        parcel.writeTypedList(this.mKeyItems);
        parcel.writeString(this.mProductName);
        parcel.writeString(this.mIssuerId);
        parcel.writeInt(this.mIsSupportPersonalArt ? 1 : 0);
        parcel.writeString(this.mVcUid);
        parcel.writeString(this.mCId);
        parcel.writeString(this.mWaitingTime);
        parcel.writeInt(this.isCustomizable ? 1 : 0);
        parcel.writeInt(this.isSupportBackup ? 1 : 0);
        parcel.writeInt(this.isSupportDownload ? 1 : 0);
        parcel.writeInt(this.isBackedUp ? 1 : 0);
        parcel.writeString(this.mCloudCId);
        parcel.writeInt(this.isSupportRecharge ? 1 : 0);
        parcel.writeInt(this.isSupportQueryTransRecord ? 1 : 0);
        parcel.writeInt(this.isSectorOverwritten ? 1 : 0);
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.entity.ObjectParser
    public CardInfo parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        if (jSONObject != null) {
            this.mUserTerms = jSONObject.optString("card_user_terms");
            this.mCardArt = jSONObject.optString("card_art");
            this.mVCStatus = jSONObject.optInt("card_vc_status");
            this.mCardFace = jSONObject.optInt(CARD_NATIVE_DRAWABLE_RES);
            this.mFingerAuthFlag = jSONObject.optInt(CARD_FINGER_FLAG);
            this.mMifareCardType = jSONObject.optInt(CARD_INFO_MIFARE_CARD_TYPE);
            this.mProductId = jSONObject.optString(CARD_INFO_DOOR_CARD_PRODUCT_ID);
            this.mProductName = jSONObject.optString(CARD_INFO_DOOR_CARD_PRODUCT_NAME);
            this.mCommunityCode = jSONObject.optString(CARD_INFO_DOOR_CARD_COMMUNITY_CODE);
            this.mBusinessId = jSONObject.optString("business_id");
            this.mApplyStatus = jSONObject.optString(CARD_INFO_DOOR_CARD_APPLY_STATUS);
            this.mCommunityCardFlowStatus = jSONObject.optInt(CARD_INFO_DOOR_CARD_COMMUNITY_FLOW_STATUS, this.mCommunityCardFlowStatus);
            this.mTicket = jSONObject.optString(CARD_INFO_DOOR_CARD_COMMUNITY_TICKET, this.mTicket);
            this.mIsSupportPersonalArt = jSONObject.optBoolean(CARD_INFO_DOOR_CARD_IS_SUPPORT_PERSONAL_ART);
            this.mVcUid = jSONObject.optString(CARD_INFO_DOOR_CARD_VC_UID, this.mVcUid);
            this.mCId = jSONObject.optString(CARD_INFO_DOOR_CARD_CID);
            this.isCustomizable = jSONObject.optBoolean(CARD_INFO_DOOR_CARD_CUSTOMIZABLE, true);
            this.isSupportRecharge = jSONObject.optBoolean(CARD_INFO_DOOR_CARD_SUPPORT_RECHARGE, false);
            this.isSupportQueryTransRecord = jSONObject.optBoolean(CARD_INFO_DOOR_CARD_SUPPORT_QUERY_RECORD, false);
            this.isSectorOverwritten = jSONObject.optBoolean(CARD_INFO_IS_SECTOR_OVERWRITTEN, true);
        }
        return this;
    }
}
