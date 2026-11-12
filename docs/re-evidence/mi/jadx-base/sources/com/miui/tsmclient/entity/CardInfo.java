package com.miui.tsmclient.entity;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.net.request.PersonalCardFaceRequest;
import com.miui.tsmclient.util.CardEnvironmentConfig;
import com.miui.tsmclient.util.IDeviceInfo;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ReflectUtil;
import com.tsmclient.smartcard.model.TradeLog;
import com.tsmclient.smartcard.terminal.IScTerminal;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class CardInfo implements Parcelable, JSONSerializable, ObjectParser<CardInfo> {
    public static final int AID_EQUAL = 1;
    public static final int AID_NOT_MATCH = 3;
    public static final int AID_PREFIX = 2;
    private static final String CARD_EXTRA = "com.miui.tsmclient.entity.CardExtra";
    public static final String CARD_STATUS_ISSUED = "ISSUED";
    public static final String CARD_STATUS_RETURNING = "RETURNING";
    public static final String CARD_STATUS_SHIFTING_OUT = "SHIFTING_OUT";
    public static final String CARD_TYPE_ALL = "ALL";
    public static final String CARD_TYPE_BANKCARD = "BANKCARD";
    public static final String CARD_TYPE_BLE_CAR = "BLECAR";
    public static final String CARD_TYPE_BMAC = "BMAC";
    public static final String CARD_TYPE_DCEPCARD = "DCEPCARD";
    public static final String CARD_TYPE_DIGITAL_KEY = "DIGITALKEY";
    public static final String CARD_TYPE_DUMMY = "DUMMY";
    public static final String CARD_TYPE_EID = "EID";
    public static final String CARD_TYPE_ICCOA_DIGITAL_KEY = "ICCOADIGITALKEY";
    public static final String CARD_TYPE_LNT = "LNT";
    public static final String CARD_TYPE_MIFARE = "MIFARE_ENTRANCE";
    public static final String CARD_TYPE_QRBANKCARD = "QRBANKCARD";
    public static final String CARD_TYPE_RUUBYPAY = "RUUBYPAY";
    public static final String CARD_TYPE_SPTC = "SPTC";
    public static final String CARD_TYPE_SPTC_NEW = "SPTC_NEW";
    public static final String CARD_TYPE_SZT = "SZT";
    public static final String CARD_TYPE_SZT_MOT = "SZT_MOT";
    public static final String CARD_TYPE_TRADITIONALCARKEYCARD = "TRADITIONALCARKEYCARD";
    public static final String CARD_TYPE_VSIM = "VSIM";
    public static final Parcelable.Creator<CardInfo> CREATOR;
    private static final int EXTRA_CONFIGS_MASK_LOCK_CARD_BEFORE_RETURN = 16;
    private static final int EXTRA_CONFIGS_MASK_REFUND_TICKET_MODEL = 64;
    private static final int EXTRA_CONFIGS_MASK_SUPPORT_CLOUD_RETURN_CARD = 2;
    private static final int EXTRA_CONFIGS_MASK_SUPPORT_MOVE_CARD_RETURN_CARD = 1;
    private static final int EXTRA_CONFIGS_MASK_SUPPORT_PHONE_RETURN_CARD = 4;
    private static final int EXTRA_CONFIGS_MASK_SUPPORT_WEARABLE_RETURN_CARD = 8;
    public static final String KEY_AID = "aid";
    public static final String KEY_AREA_CODE = "areaCode";
    public static final String KEY_CARDNAME = "cardName";
    private static final String KEY_CARD_ART = "cardArt";
    public static final String KEY_CARD_BALANCE = "card_balance";
    public static final String KEY_CARD_DEVICE = "cardDevice";
    public static final String KEY_CARD_END_DATE = "card_end_date";
    public static final String KEY_CARD_GROUP = "cardGroup";
    public static final String KEY_CARD_GROUP_ID = "groupId";
    public static final String KEY_CARD_GROUP_NAME = "groupName";
    public static final String KEY_CARD_NO = "card_no";
    public static final String KEY_CARD_START_DATE = "card_start_date";
    public static final String KEY_CARD_STATUS = "card_status";
    public static final String KEY_CARD_SUB_NAME = "card_sub_name";
    public static final String KEY_CARD_SUB_SCRIPT = "cardSubScript";
    public static final String KEY_CARD_TYPE = "cardType";
    private static final String KEY_DELETABLE = "deletable";
    public static final String KEY_EXTRA = "extra";
    private static final String KEY_EXTRA_ISSUED = "issued";
    private static final String KEY_EXTRA_RETURN_DELETE_CONFIGS = "returnDeleteConfigs";
    private static final String KEY_HAS_CHILDREN = "hasChildren";
    public static final String KEY_HAS_ISSUE = "has_issue";
    public static final String KEY_ISSUEFEE = "issueFee";
    public static final String KEY_ISSUER_NAME = "issuerName";
    public static final String KEY_ISSUE_FEE_DETAIL_DESC = "issueFeeDetailDesc";
    public static final String KEY_ISSUE_STATUS = "issueStatus";
    public static final String KEY_ISSUE_STATUS_DESC = "issueStatusDesc";
    public static final String KEY_IS_DEFAULT = "is_default";
    public static final String KEY_IS_LOCAL_CARD = "local";
    private static final String KEY_KEEP_ACTIVATED = "keepActivated";
    public static final String KEY_OP_SUGGEST = "opSuggest";
    public static final String KEY_ORDER_ID = "orderId";
    public static final String KEY_OWNER = "owner";
    public static final String KEY_READ_SE_CORRECTLY = "read_se_correctly";
    public static final String KEY_REAL_CARD_NO = "real_card_no";
    public static final String KEY_RECHARGE_STATUS = "rechargeStatus";
    public static final String KEY_RECHARGE_STATUS_DESC = "rechargeStatusDesc";
    public static final String KEY_SECURE = "secure";
    public static final String KEY_SERVICE_FEE_DESC = "serviceFeeDesc";
    private static final String KEY_SHOW_BALANCE = "showBalance";
    public static final String KEY_STATUS = "status";
    public static final String KEY_STATUS_DESC = "statusDesc";
    public static final String KEY_SUB_CARD_GROUP = "subCardGroup";
    public static final String KEY_SUB_CARD_GROUP_NAME = "subGroupName";
    public static final String KEY_TECH_TYPE = "techType";
    public static final String KEY_TITLE = "title";
    public static final String KEY_TRANSFER_CARD_STATUS = "cardStatus";
    public static final String KEY_TRANSFER_EXTRA = "transferExtra";
    public static final String KEY_TRANSFER_OUT_TOKEN = "transferOutToken";
    private static final String KEY_UNDELETABLE_DESC = "undeletableDesc";
    public static final String KEY_UPDATE_CONTENT = "updateContent";
    public static final String KEY_UPDATE_KEY = "updateKey";
    public static final Set<String> SPTC_TYPE_SET;
    public static final int VALUE_UPDATE_CARD_ART_BY_STATUS = 0;
    private static final Map<String, IDeviceInfo> sDeviceInfoMap = new HashMap();
    private boolean isDeletable;
    private boolean isLocalCard;
    private boolean isShowBalance;
    public String mAid;
    public String mAreaCode;
    private String mCardArt;
    public int mCardBalance;
    protected String mCardDevice;
    public int mCardGroupId;
    public String mCardName;
    public String mCardNo;
    public String mCardSubName;
    public String mCardType;
    public CardUIInfo mCardUIInfo;
    public DataSource mDataSource;
    public String mEndDate;
    private String mExtra;
    public String mGroupName;
    public int mGroupType;
    private boolean mHasChildren;
    public boolean mHasIssue;
    public boolean mIsDefault;
    private boolean mIsKeepActivated;
    public boolean mIsNeedLockCardBeforeReturn;
    private boolean mIsOwner;
    public boolean mIsPack;
    public boolean mIsReadSECorrectly;
    protected boolean mIsSecure;
    public boolean mIsShowRefundTicket;
    public int mIssueFee;
    private int mIssueStatus;
    private String mIssueStatusDesc;
    public String mIssuerName;
    private String mOpSuggest;
    private String mOrderId;
    public String mRealCardNo;
    private RechargeStatus mRechargeStatus;
    private String mRechargeStatusDesc;
    private String mServiceFeeDesc;
    private String mServiceFeeDetailDesc;
    public ServiceStatus mServiceStatus;
    private String mServiceStatusDesc;
    public String mStartDate;
    public Status mStatus;
    private String mSubGroupName;
    private int mSubGroupType;
    public boolean mSupportCloudReturnCard;
    public boolean mSupportMoveCardReturnCard;
    public boolean mSupportPhoneReturnCard;
    public boolean mSupportWearableReturnCard;
    public int mTechType;
    public List<TradeLog> mTradeLogs;
    private String mTransferCardStatus;
    private String mTransferExtra;
    private String mTransferOutToken;
    private String mUndeletableDesc;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AidMatchResult {
    }

    public enum DataSource {
        Unknown,
        DB,
        Network,
        SE
    }

    public enum RechargeStatus {
        unknown(-1),
        available(0),
        unavailable(4);

        private int mId;

        RechargeStatus(int i) {
            this.mId = i;
        }

        public static RechargeStatus getInstance(int i) {
            for (RechargeStatus rechargeStatus : values()) {
                if (rechargeStatus.mId == i) {
                    return rechargeStatus;
                }
            }
            return unknown;
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum ServiceStatus {
        unknown(-1),
        active(0),
        negative(1),
        no_stock(2),
        coming_soon(3),
        under_maintenance(4),
        unavailable(5),
        immediately_shift_in(6),
        unable_to_shift_in(7),
        issued(8),
        activity_close(9);

        private int mId;

        ServiceStatus(int i) {
            this.mId = i;
        }

        public static ServiceStatus getInstance(int i) {
            for (ServiceStatus serviceStatus : values()) {
                if (serviceStatus.mId == i) {
                    return serviceStatus;
                }
            }
            return unknown;
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum Status {
        ACTIVE,
        IN_BLACKLIST,
        NEGATIVE,
        DATA_ILLEGAL,
        START_DATE_INVALID,
        END_DATE_INVALID,
        LOCKED,
        INVALID
    }

    static {
        HashSet hashSet = new HashSet();
        SPTC_TYPE_SET = hashSet;
        hashSet.add("SPTC");
        hashSet.add("SPTC_NEW");
        CREATOR = new Parcelable.Creator<CardInfo>() { // from class: com.miui.tsmclient.entity.CardInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CardInfo createFromParcel(Parcel parcel) {
                return new CardInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CardInfo[] newArray(int i) {
                return new CardInfo[i];
            }
        };
    }

    public CardInfo(Parcel parcel) {
        this.mIsPack = false;
        this.mStatus = null;
        this.mDataSource = DataSource.Unknown;
        this.mIsSecure = false;
        this.mTechType = 1;
        this.mCardArt = "";
        this.isDeletable = true;
        readFromParcel(parcel);
    }

    private boolean updateCardFromExtra() {
        if (TextUtils.isEmpty(this.mExtra)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.mExtra);
            boolean zOptBoolean = jSONObject.optBoolean(KEY_EXTRA_ISSUED, false);
            this.mHasIssue = zOptBoolean;
            if (!zOptBoolean) {
                this.mStatus = null;
                this.mCardBalance = 0;
                this.mCardNo = null;
                this.mRealCardNo = null;
                this.mIsReadSECorrectly = true;
            }
            this.isLocalCard = jSONObject.optBoolean("local", false);
            int iOptInt = jSONObject.optInt(KEY_EXTRA_RETURN_DELETE_CONFIGS, 0);
            this.mSupportMoveCardReturnCard = (iOptInt & 1) == 1;
            this.mSupportPhoneReturnCard = (iOptInt & 4) == 4;
            this.mSupportWearableReturnCard = (iOptInt & 8) == 8;
            this.mSupportCloudReturnCard = (iOptInt & 2) == 2;
            this.mIsNeedLockCardBeforeReturn = (iOptInt & 16) == 16;
            this.mIsShowRefundTicket = (iOptInt & 64) == 64;
            return true;
        } catch (JSONException e) {
            LogUtils.e("updateCardFromExtra error occurred", e);
            return false;
        }
    }

    public boolean canTransferIn() {
        return false;
    }

    public boolean cardIdEquals(String str) {
        return !TextUtils.isEmpty(getCardId()) && TextUtils.equals(str, getCardId());
    }

    public CardInfo copy() {
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(this.mCardType, serialize());
        cardInfoMakeCardInfo.mTradeLogs = this.mTradeLogs;
        return cardInfoMakeCardInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) obj;
        return TextUtils.equals(this.mAid, cardInfo.mAid) && TextUtils.equals(this.mCardDevice, cardInfo.mCardDevice);
    }

    public String getAid() {
        return this.mAid;
    }

    public List<String> getAids() {
        String aid = getAid();
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(aid)) {
            arrayList.add(aid);
        }
        return arrayList;
    }

    public String getCardArt() {
        return this.mCardArt;
    }

    public String getCardId() {
        return this.mAid;
    }

    public String getCardName() {
        return this.mCardName;
    }

    public Status getCardStatus() {
        return this.mStatus;
    }

    public String[] getCardTag() {
        return null;
    }

    public String getCardType() {
        if (CARD_TYPE_DUMMY.equals(this.mCardType)) {
            String cardType = CardConfigManager.getInstance().getCardType(this.mAid);
            if (!TextUtils.isEmpty(cardType)) {
                return cardType;
            }
        }
        return this.mCardType;
    }

    public String getContentDescription(Map<Class<? extends CardInfo>, String> map) {
        return this.mCardName;
    }

    public IDeviceInfo getDeviceInfo() {
        String str;
        IDeviceInfo deviceInfo = CardEnvironmentConfig.getDeviceInfo();
        if (deviceInfo != null) {
            return deviceInfo;
        }
        if (TextUtils.isEmpty(this.mCardDevice)) {
            str = "com.miui.tsmclient.mitsmsdk.DeviceInfoImpl";
        } else {
            str = this.mCardDevice + ".mitsmsdk.DeviceInfoImpl";
        }
        Map<String, IDeviceInfo> map = sDeviceInfoMap;
        IDeviceInfo iDeviceInfo = map.get(str);
        if (iDeviceInfo == null) {
            Object objNewInstance = ReflectUtil.newInstance(str, (Class<?>[]) null, new Object[0]);
            if (objNewInstance instanceof IDeviceInfo) {
                iDeviceInfo = (IDeviceInfo) objNewInstance;
                map.put(str, iDeviceInfo);
            }
        }
        return iDeviceInfo == null ? new IDeviceInfo() { // from class: com.miui.tsmclient.entity.CardInfo.2
            @Override // com.miui.tsmclient.util.IDeviceInfo
            public String getDeviceFirmwareVersion() {
                return null;
            }

            @Override // com.miui.tsmclient.util.IDeviceInfo
            public String getDeviceId(Context context) {
                return null;
            }

            @Override // com.miui.tsmclient.util.IDeviceInfo
            public String getDeviceModel() {
                return null;
            }

            @Override // com.miui.tsmclient.util.IDeviceInfo
            public int getDeviceType() {
                return 0;
            }

            @Override // com.miui.tsmclient.util.IDeviceInfo
            public List<String> getSIMNumber() {
                return null;
            }

            @Override // com.miui.tsmclient.util.IDeviceInfo
            public boolean isEseEnabled(Context context) {
                return false;
            }
        } : iDeviceInfo;
    }

    public String getExtra() {
        return this.mExtra;
    }

    public int getIssueFee() {
        return this.mIssueFee;
    }

    public String getIssueFeeDetailDesc() {
        return this.mServiceFeeDetailDesc;
    }

    public int getIssueStatus() {
        return this.mIssueStatus;
    }

    public String getIssueStatusDesc() {
        return this.mIssueStatusDesc;
    }

    public String getLabel() {
        try {
            return !TextUtils.isEmpty(getExtra()) ? new JSONObject(getExtra()).optString(KEY_CARD_SUB_SCRIPT) : "";
        } catch (JSONException e) {
            LogUtils.e("parse card sub script failed", e);
            return "";
        }
    }

    public String getOrderId() {
        return this.mOrderId;
    }

    public int getRechargeStatus() {
        RechargeStatus rechargeStatus = this.mRechargeStatus;
        if (rechargeStatus != null) {
            return rechargeStatus.getId();
        }
        return -1;
    }

    public String getRechargeStatusDesc() {
        return this.mRechargeStatusDesc;
    }

    public String getServiceFeeDesc() {
        return this.mServiceFeeDesc;
    }

    public String getServiceStatusDesc() {
        return this.mServiceStatusDesc;
    }

    public String getSubGroupName() {
        return this.mSubGroupName;
    }

    public int getSubGroupType() {
        return this.mSubGroupType;
    }

    public int getTechType() {
        return this.mTechType;
    }

    public IScTerminal getTerminal() {
        try {
            return (IScTerminal) ReflectUtil.callObjectMethod(ReflectUtil.newInstance(CARD_EXTRA, (Class<?>[]) null, new Object[0]), "getTerminal", new Class[]{CardInfo.class}, this);
        } catch (Exception e) {
            LogUtils.e("getTerminal", e);
            throw new RuntimeException("get Terminal failed");
        }
    }

    public String getTransferCardStatus() {
        return this.mTransferCardStatus;
    }

    public String getTransferExtra() {
        return this.mTransferExtra;
    }

    public String getTransferOutToken() {
        return this.mTransferOutToken;
    }

    public String getUndeletableDesc() {
        return this.mUndeletableDesc;
    }

    public String getUpdateArtContent() {
        return "";
    }

    public boolean hasIssueOrder() {
        return false;
    }

    public boolean hasQRProperty() {
        return false;
    }

    public boolean hasQRToken() {
        return false;
    }

    public boolean hasRechargeOrder() {
        return false;
    }

    public boolean hasTransferInOrder() {
        return false;
    }

    public int hashCode() {
        return this.mCardType.hashCode();
    }

    public boolean isBLECarKeyCard() {
        return false;
    }

    public boolean isBalanceValid() {
        return this.mCardBalance != -999;
    }

    public boolean isBankCard() {
        return false;
    }

    public boolean isCanSwipe() {
        return true;
    }

    public boolean isCardActive() {
        return this.mStatus == Status.ACTIVE;
    }

    public boolean isCardId(String str) {
        String cardId = getCardId();
        return !TextUtils.isEmpty(cardId) && TextUtils.equals(str, cardId);
    }

    public boolean isDCEPCard() {
        return false;
    }

    public boolean isDeletable() {
        return this.isDeletable;
    }

    public boolean isDigitalCarKeyCard() {
        return false;
    }

    public boolean isHasChildren() {
        return this.mHasChildren;
    }

    public boolean isHide() {
        if (TextUtils.isEmpty(this.mExtra)) {
            return false;
        }
        CardInfoExtra cardInfoExtra = CardInfoExtra.get(this.mExtra);
        return cardInfoExtra.isNotShowInCardList() || (!this.mHasIssue && cardInfoExtra.isNotShowWhenUnissued());
    }

    public boolean isICCOACarKeyCard() {
        return false;
    }

    public boolean isKeepActivated() {
        return this.mIsKeepActivated;
    }

    public boolean isLocalCard() {
        return this.isLocalCard;
    }

    public boolean isMiFareCard() {
        return false;
    }

    public boolean isOwner() {
        return this.mIsOwner;
    }

    public boolean isQrBankCard() {
        return false;
    }

    public boolean isRechargeServiceAvailable() {
        return this.mRechargeStatus == RechargeStatus.available;
    }

    public boolean isReturning() {
        return TextUtils.equals(this.mTransferCardStatus, CARD_STATUS_RETURNING) && TransferExtra.get(this.mTransferExtra).isReturnable();
    }

    public boolean isSecure() {
        return this.mIsSecure;
    }

    public boolean isServiceAvailable() {
        return this.mServiceStatus == ServiceStatus.active;
    }

    public boolean isServiceStatusActivityClose() {
        return this.mServiceStatus == ServiceStatus.activity_close;
    }

    public boolean isServiceStatusIssued() {
        return this.mServiceStatus == ServiceStatus.issued;
    }

    public boolean isShiftIn() {
        return this.mServiceStatus == ServiceStatus.immediately_shift_in;
    }

    public boolean isShiftable() {
        return TextUtils.equals(this.mTransferCardStatus, "ISSUED") && TransferExtra.get(this.mTransferExtra).isTransferable();
    }

    public boolean isShifting() {
        return TextUtils.equals(this.mTransferCardStatus, CARD_STATUS_SHIFTING_OUT) && TransferExtra.get(this.mTransferExtra).isTransferable();
    }

    public boolean isShowCardName() {
        return false;
    }

    public boolean isSupportDownload() {
        return false;
    }

    public boolean isTraditionalCarKeyCard() {
        return false;
    }

    public boolean isTransCard() {
        return false;
    }

    public boolean isVisibleInSwipingCardActivity() {
        return true;
    }

    public final int matchAid(String str) {
        int i = 3;
        for (String str2 : getAids()) {
            if (TextUtils.equals(str2, str)) {
                return 1;
            }
            if (str2.startsWith(str)) {
                i = 2;
            }
        }
        return i;
    }

    public void parseCardFromJson(JSONObject jSONObject) {
    }

    public void readFromParcel(Parcel parcel) {
        this.mCardName = parcel.readString();
        this.mCardNo = parcel.readString();
        this.mHasIssue = parcel.readByte() == 1;
        this.mIsDefault = parcel.readByte() == 1;
        this.mCardBalance = parcel.readInt();
        this.mCardType = parcel.readString();
        this.mIssuerName = parcel.readString();
        this.mServiceStatus = (ServiceStatus) parcel.readValue(ServiceStatus.class.getClassLoader());
        this.mServiceStatusDesc = parcel.readString();
        this.mRechargeStatus = (RechargeStatus) parcel.readValue(RechargeStatus.class.getClassLoader());
        this.mRechargeStatusDesc = parcel.readString();
        this.mIssueStatus = parcel.readInt();
        this.mIssueStatusDesc = parcel.readString();
        this.mIsPack = parcel.readByte() == 1;
        this.mCardSubName = parcel.readString();
        this.mCardUIInfo = (CardUIInfo) parcel.readParcelable(CardUIInfo.class.getClassLoader());
        this.mIssueFee = parcel.readInt();
        this.mAid = parcel.readString();
        this.mTradeLogs = parcel.readArrayList(TradeLog.class.getClassLoader());
        String string = parcel.readString();
        if (!TextUtils.isEmpty(string)) {
            this.mStatus = Status.valueOf(string);
        }
        this.mStartDate = parcel.readString();
        this.mEndDate = parcel.readString();
        this.mRealCardNo = parcel.readString();
        this.mDataSource = (DataSource) parcel.readValue(DataSource.class.getClassLoader());
        this.mIsSecure = parcel.readByte() == 1;
        this.mIsReadSECorrectly = parcel.readByte() == 1;
        this.mGroupType = parcel.readInt();
        this.mGroupName = parcel.readString();
        this.mSubGroupType = parcel.readInt();
        this.mSubGroupName = parcel.readString();
        this.isLocalCard = parcel.readByte() == 1;
        this.mCardGroupId = parcel.readInt();
        this.mCardDevice = parcel.readString();
        this.mAreaCode = parcel.readString();
        this.mServiceFeeDesc = parcel.readString();
        this.mServiceFeeDetailDesc = parcel.readString();
        this.mExtra = parcel.readString();
        this.mSupportMoveCardReturnCard = parcel.readByte() == 1;
        this.mSupportPhoneReturnCard = parcel.readByte() == 1;
        this.mSupportWearableReturnCard = parcel.readByte() == 1;
        this.mSupportCloudReturnCard = parcel.readByte() == 1;
        this.mIsNeedLockCardBeforeReturn = parcel.readByte() == 1;
        this.mIsShowRefundTicket = parcel.readByte() == 1;
        this.mIsKeepActivated = parcel.readByte() == 1;
        this.mHasChildren = parcel.readByte() == 1;
        this.mOrderId = parcel.readString();
        this.mTransferCardStatus = parcel.readString();
        this.mOpSuggest = parcel.readString();
        this.mTransferExtra = parcel.readString();
        this.mIsOwner = parcel.readByte() == 1;
        this.mTransferOutToken = parcel.readString();
        this.mTechType = parcel.readInt();
        this.isShowBalance = parcel.readByte() == 1;
        this.isDeletable = parcel.readByte() == 1;
        this.mUndeletableDesc = parcel.readString();
        this.mCardArt = parcel.readString();
    }

    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("title", this.mCardName);
            jSONObject.put("card_no", this.mCardNo);
            jSONObject.put("has_issue", this.mHasIssue);
            jSONObject.put(KEY_IS_DEFAULT, this.mIsDefault);
            jSONObject.put("card_balance", this.mCardBalance);
            String str = this.mCardType;
            if (str != null) {
                jSONObject.put("cardName", str.toString());
            }
            jSONObject.put(KEY_ISSUER_NAME, this.mIssuerName);
            jSONObject.put(KEY_CARD_SUB_NAME, this.mCardSubName);
            jSONObject.put(KEY_ISSUEFEE, this.mIssueFee);
            jSONObject.put("aid", this.mAid);
            ServiceStatus serviceStatus = this.mServiceStatus;
            if (serviceStatus != null) {
                jSONObject.put("status", serviceStatus.getId());
            }
            jSONObject.put("statusDesc", this.mServiceStatusDesc);
            RechargeStatus rechargeStatus = this.mRechargeStatus;
            if (rechargeStatus != null) {
                jSONObject.put(KEY_RECHARGE_STATUS, rechargeStatus.getId());
            }
            jSONObject.put(KEY_RECHARGE_STATUS_DESC, this.mRechargeStatusDesc);
            jSONObject.put(KEY_ISSUE_STATUS, this.mIssueStatus);
            jSONObject.put(KEY_ISSUE_STATUS_DESC, this.mIssueStatusDesc);
            CardUIInfo cardUIInfo = this.mCardUIInfo;
            if (cardUIInfo != null) {
                jSONObject.put(CardUIInfo.KEY_CARD_UI_INFO, cardUIInfo.serialize());
            }
            Status status = this.mStatus;
            if (status != null) {
                jSONObject.put(KEY_CARD_STATUS, status.toString());
            }
            String str2 = this.mStartDate;
            if (str2 != null) {
                jSONObject.put(KEY_CARD_START_DATE, str2);
            }
            String str3 = this.mEndDate;
            if (str3 != null) {
                jSONObject.put(KEY_CARD_END_DATE, str3);
            }
            String str4 = this.mRealCardNo;
            if (str4 != null) {
                jSONObject.put(KEY_REAL_CARD_NO, str4);
            }
            jSONObject.put(KEY_SECURE, this.mIsSecure);
            jSONObject.put(KEY_READ_SE_CORRECTLY, this.mIsReadSECorrectly);
            jSONObject.put(KEY_CARD_GROUP, this.mGroupType);
            jSONObject.put(KEY_CARD_GROUP_NAME, this.mGroupName);
            jSONObject.put(KEY_SUB_CARD_GROUP, this.mSubGroupType);
            jSONObject.put(KEY_SUB_CARD_GROUP_NAME, this.mSubGroupName);
            jSONObject.put(KEY_CARD_GROUP_ID, this.mCardGroupId);
            String str5 = this.mCardDevice;
            if (str5 != null) {
                jSONObject.put(KEY_CARD_DEVICE, str5);
            }
            jSONObject.put(KEY_SERVICE_FEE_DESC, this.mServiceFeeDesc);
            jSONObject.put(KEY_ISSUE_FEE_DETAIL_DESC, this.mServiceFeeDetailDesc);
            if (!TextUtils.isEmpty(this.mAreaCode)) {
                jSONObject.put("areaCode", this.mAreaCode);
            }
            if (!TextUtils.isEmpty(this.mOrderId)) {
                jSONObject.put("orderId", this.mOrderId);
            }
            jSONObject.put(KEY_OWNER, this.mIsOwner);
            String str6 = this.mTransferCardStatus;
            if (str6 != null) {
                jSONObject.put(KEY_TRANSFER_CARD_STATUS, str6);
            }
            if (!TextUtils.isEmpty(this.mOpSuggest)) {
                jSONObject.put(KEY_OP_SUGGEST, this.mOpSuggest);
            }
            if (!TextUtils.isEmpty(this.mTransferExtra)) {
                jSONObject.put(KEY_TRANSFER_EXTRA, this.mTransferExtra);
            }
            if (!TextUtils.isEmpty(this.mTransferOutToken)) {
                jSONObject.put(KEY_TRANSFER_OUT_TOKEN, this.mTransferOutToken);
            }
            if (!TextUtils.isEmpty(this.mExtra)) {
                jSONObject.put("extra", this.mExtra);
            }
            jSONObject.put(KEY_KEEP_ACTIVATED, this.mIsKeepActivated);
            jSONObject.put(KEY_TECH_TYPE, this.mTechType);
            jSONObject.put(KEY_HAS_CHILDREN, this.mHasChildren);
            jSONObject.put(KEY_SHOW_BALANCE, this.isShowBalance);
            jSONObject.put(KEY_DELETABLE, this.isDeletable);
            jSONObject.put(KEY_UNDELETABLE_DESC, this.mUndeletableDesc);
            if (!TextUtils.isEmpty(this.mCardArt)) {
                jSONObject.put("cardArt", this.mCardArt);
            }
        } catch (JSONException e) {
            LogUtils.e("serialize cardInfo to JSONObject failed!", e);
        }
        return jSONObject;
    }

    public void setCardName(String str) {
        this.mCardName = str;
    }

    public void setKeepActivated(boolean z) {
        this.mIsKeepActivated = z;
    }

    public void setOrderId(String str) {
        this.mOrderId = str;
    }

    public void setTechType(int i) {
        this.mTechType = i;
    }

    public boolean showBalance() {
        return this.isShowBalance;
    }

    public Boolean updateBackground(Context context) {
        try {
            PersonalCardFaceRequest personalCardFaceRequest = new PersonalCardFaceRequest(this);
            PersonalCardFaceRequest.PersonalCardFaceResponseInfo personalCardFaceResponseInfo = (PersonalCardFaceRequest.PersonalCardFaceResponseInfo) HttpClient.getInstance(context).execute(personalCardFaceRequest).getResult();
            if (personalCardFaceRequest.isSuccess()) {
                this.mCardUIInfo.mPersonalCardFace = personalCardFaceResponseInfo.getPresonalCardFace().getCardFace();
                return Boolean.TRUE;
            }
            if (personalCardFaceResponseInfo != null) {
                LogUtils.d("PersonalCardFaceRequest onFailed, errorCode:" + personalCardFaceResponseInfo.getErrorCode() + ", errorMsg:" + personalCardFaceResponseInfo.getErrorDesc());
            }
            return Boolean.FALSE;
        } catch (IOException e) {
            LogUtils.e("PersonalCardFaceRequest error occurred", e);
        }
    }

    public void updateExtraInfo(Context context, Bundle bundle) {
        try {
            ReflectUtil.callObjectMethod(ReflectUtil.newInstance(CARD_EXTRA, (Class<?>[]) null, new Object[0]), "updateExtraInfo", new Class[]{Context.class, CardInfo.class, Bundle.class}, context, this, bundle);
        } catch (Exception e) {
            LogUtils.e("updateExtraInfo", e);
        }
    }

    public void updateInfo(CardInfo cardInfo) {
        CardUIInfo cardUIInfo;
        this.mCardNo = cardInfo.mCardNo;
        this.mIsDefault = cardInfo.mIsDefault;
        this.mCardBalance = cardInfo.mCardBalance;
        this.mCardSubName = cardInfo.mCardSubName;
        this.mStartDate = cardInfo.mStartDate;
        this.mEndDate = cardInfo.mEndDate;
        this.mRealCardNo = cardInfo.mRealCardNo;
        this.mStatus = cardInfo.mStatus;
        this.mIsReadSECorrectly = cardInfo.mIsReadSECorrectly;
        if (!TextUtils.isEmpty(cardInfo.mCardArt)) {
            this.mCardArt = cardInfo.mCardArt;
        }
        CardUIInfo cardUIInfo2 = cardInfo.mCardUIInfo;
        if (cardUIInfo2 == null || TextUtils.isEmpty(cardUIInfo2.mPersonalCardFace) || (cardUIInfo = this.mCardUIInfo) == null) {
            return;
        }
        cardUIInfo.mPersonalCardFace = cardInfo.mCardUIInfo.mPersonalCardFace;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCardName);
        parcel.writeString(this.mCardNo);
        parcel.writeByte(this.mHasIssue ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsDefault ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mCardBalance);
        parcel.writeString(this.mCardType);
        parcel.writeString(this.mIssuerName);
        parcel.writeValue(this.mServiceStatus);
        parcel.writeString(this.mServiceStatusDesc);
        parcel.writeValue(this.mRechargeStatus);
        parcel.writeString(this.mRechargeStatusDesc);
        parcel.writeInt(this.mIssueStatus);
        parcel.writeString(this.mIssueStatusDesc);
        parcel.writeByte(this.mIsPack ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mCardSubName);
        parcel.writeParcelable(this.mCardUIInfo, i);
        parcel.writeInt(this.mIssueFee);
        parcel.writeString(this.mAid);
        parcel.writeList(this.mTradeLogs);
        Status status = this.mStatus;
        parcel.writeString(status == null ? "" : status.name());
        parcel.writeString(this.mStartDate);
        parcel.writeString(this.mEndDate);
        parcel.writeString(this.mRealCardNo);
        parcel.writeValue(this.mDataSource);
        parcel.writeByte(this.mIsSecure ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsReadSECorrectly ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mGroupType);
        parcel.writeString(this.mGroupName);
        parcel.writeInt(this.mSubGroupType);
        parcel.writeString(this.mSubGroupName);
        parcel.writeByte(this.isLocalCard ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mCardGroupId);
        parcel.writeString(this.mCardDevice);
        parcel.writeString(this.mAreaCode);
        parcel.writeString(this.mServiceFeeDesc);
        parcel.writeString(this.mServiceFeeDetailDesc);
        parcel.writeString(this.mExtra);
        parcel.writeByte(this.mSupportMoveCardReturnCard ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mSupportPhoneReturnCard ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mSupportWearableReturnCard ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mSupportCloudReturnCard ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsNeedLockCardBeforeReturn ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsShowRefundTicket ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsKeepActivated ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mHasChildren ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mOrderId);
        parcel.writeString(this.mTransferCardStatus);
        parcel.writeString(this.mOpSuggest);
        parcel.writeString(this.mTransferExtra);
        parcel.writeByte(this.mIsOwner ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mTransferOutToken);
        parcel.writeInt(this.mTechType);
        parcel.writeByte(this.isShowBalance ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDeletable ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mUndeletableDesc);
        parcel.writeString(this.mCardArt);
    }

    @Override // com.miui.tsmclient.entity.ObjectParser
    public CardInfo parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mCardName = jSONObject.optString("title");
            if (jSONObject.has("card_no")) {
                this.mCardNo = jSONObject.optString("card_no");
            }
            if (jSONObject.has("has_issue")) {
                this.mHasIssue = jSONObject.optBoolean("has_issue");
            }
            this.mIsDefault = jSONObject.optBoolean(KEY_IS_DEFAULT);
            if (jSONObject.has("card_balance")) {
                this.mCardBalance = jSONObject.optInt("card_balance");
            }
            if (jSONObject.has("cardName")) {
                this.mCardType = jSONObject.optString("cardName");
            }
            if (jSONObject.has(KEY_ISSUER_NAME)) {
                this.mIssuerName = jSONObject.optString(KEY_ISSUER_NAME);
            }
            if (jSONObject.has(KEY_CARD_SUB_NAME)) {
                this.mCardSubName = jSONObject.optString(KEY_CARD_SUB_NAME);
            }
            this.mIssueFee = jSONObject.optInt(KEY_ISSUEFEE);
            this.mAid = jSONObject.optString("aid");
            this.mServiceStatus = ServiceStatus.getInstance(jSONObject.optInt("status", -1));
            this.mServiceStatusDesc = jSONObject.optString("statusDesc");
            this.mRechargeStatus = RechargeStatus.getInstance(jSONObject.optInt(KEY_RECHARGE_STATUS));
            this.mRechargeStatusDesc = jSONObject.optString(KEY_RECHARGE_STATUS_DESC);
            this.mIssueStatusDesc = jSONObject.optString(KEY_ISSUE_STATUS_DESC);
            if (jSONObject.has(KEY_ISSUE_STATUS)) {
                this.mIssueStatus = jSONObject.optInt(KEY_ISSUE_STATUS);
            }
            CardUIInfo cardUIInfo = new CardUIInfo();
            this.mCardUIInfo = cardUIInfo;
            cardUIInfo.parse(jSONObject);
            if (jSONObject.has(KEY_CARD_STATUS)) {
                this.mStatus = Status.valueOf(jSONObject.optString(KEY_CARD_STATUS));
            }
            if (jSONObject.has(KEY_CARD_START_DATE)) {
                this.mStartDate = jSONObject.optString(KEY_CARD_START_DATE);
            }
            if (jSONObject.has(KEY_CARD_END_DATE)) {
                this.mEndDate = jSONObject.optString(KEY_CARD_END_DATE);
            }
            if (jSONObject.has(KEY_REAL_CARD_NO)) {
                this.mRealCardNo = jSONObject.optString(KEY_REAL_CARD_NO);
            }
            if (jSONObject.has(KEY_SECURE)) {
                this.mIsSecure = jSONObject.optBoolean(KEY_SECURE);
            }
            this.mIsReadSECorrectly = jSONObject.optBoolean(KEY_READ_SE_CORRECTLY);
            this.mGroupType = jSONObject.optInt(KEY_CARD_GROUP, -1);
            this.mGroupName = jSONObject.optString(KEY_CARD_GROUP_NAME);
            this.mSubGroupType = jSONObject.optInt(KEY_SUB_CARD_GROUP, 0);
            this.mSubGroupName = jSONObject.optString(KEY_SUB_CARD_GROUP_NAME, "");
            if (jSONObject.has(KEY_CARD_GROUP_ID)) {
                this.mCardGroupId = jSONObject.optInt(KEY_CARD_GROUP_ID);
            }
            if (jSONObject.has(KEY_CARD_DEVICE)) {
                this.mCardDevice = jSONObject.optString(KEY_CARD_DEVICE);
            }
            if (jSONObject.has("areaCode")) {
                this.mAreaCode = jSONObject.optString("areaCode");
            }
            if (jSONObject.has(KEY_SERVICE_FEE_DESC)) {
                this.mServiceFeeDesc = jSONObject.optString(KEY_SERVICE_FEE_DESC);
            }
            if (jSONObject.has(KEY_ISSUE_FEE_DETAIL_DESC)) {
                this.mServiceFeeDetailDesc = jSONObject.optString(KEY_ISSUE_FEE_DETAIL_DESC);
            }
            if (jSONObject.has("orderId")) {
                this.mOrderId = jSONObject.optString("orderId");
            }
            this.mIsOwner = jSONObject.optBoolean(KEY_OWNER);
            if (jSONObject.has(KEY_TRANSFER_CARD_STATUS)) {
                this.mTransferCardStatus = jSONObject.optString(KEY_TRANSFER_CARD_STATUS);
            }
            if (jSONObject.has(KEY_OP_SUGGEST)) {
                this.mOpSuggest = jSONObject.optString(KEY_OP_SUGGEST);
            }
            if (jSONObject.has(KEY_TRANSFER_EXTRA)) {
                this.mTransferExtra = jSONObject.optString(KEY_TRANSFER_EXTRA);
            }
            if (jSONObject.has(KEY_TRANSFER_OUT_TOKEN)) {
                this.mTransferOutToken = jSONObject.optString(KEY_TRANSFER_OUT_TOKEN);
            }
            if (jSONObject.has("extra")) {
                this.mExtra = jSONObject.optString("extra");
                updateCardFromExtra();
            }
            this.mIsKeepActivated = jSONObject.optBoolean(KEY_KEEP_ACTIVATED);
            this.mTechType = jSONObject.optInt(KEY_TECH_TYPE, 1);
            this.mHasChildren = jSONObject.optBoolean(KEY_HAS_CHILDREN);
            this.isShowBalance = jSONObject.optBoolean(KEY_SHOW_BALANCE);
            if (jSONObject.has(KEY_DELETABLE)) {
                this.isDeletable = jSONObject.optBoolean(KEY_DELETABLE);
            }
            if (jSONObject.has(KEY_UNDELETABLE_DESC)) {
                this.mUndeletableDesc = jSONObject.optString(KEY_UNDELETABLE_DESC);
            }
            if (jSONObject.has("cardArt")) {
                this.mCardArt = jSONObject.optString("cardArt");
            }
        }
        return this;
    }

    public CardInfo(String str) {
        this(str, false);
    }

    public CardInfo(String str, boolean z) {
        this.mIsPack = false;
        this.mStatus = null;
        this.mDataSource = DataSource.Unknown;
        this.mTechType = 1;
        this.mCardArt = "";
        this.isDeletable = true;
        this.mCardType = str;
        this.mIsSecure = z;
        this.mCardDevice = CardEnvironmentConfig.getDefaultDevice();
    }
}
