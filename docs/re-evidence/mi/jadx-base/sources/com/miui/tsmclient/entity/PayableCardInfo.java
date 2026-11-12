package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ObjectUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class PayableCardInfo extends CardInfo implements Parcelable {
    public static final Parcelable.Creator<PayableCardInfo> CREATOR = new Parcelable.Creator<PayableCardInfo>() { // from class: com.miui.tsmclient.entity.PayableCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PayableCardInfo createFromParcel(Parcel parcel) {
            PayableCardInfo payableCardInfo = new PayableCardInfo(null);
            payableCardInfo.readFromParcel(parcel);
            return payableCardInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PayableCardInfo[] newArray(int i) {
            return new PayableCardInfo[i];
        }
    };
    public static final int ISSUED_TRANS_CARD_BALANCE_MAX = 100000;
    public static final int ISSUED_TRANS_CARD_BALANCE_MIN = -10000;
    private static final String KEY_CONFIG_ID = "configId";
    private static final String KEY_CUSTOM_INFO = "customInfo";
    private static final String KEY_FEES = "fees";
    private static final String KEY_HAS_UNCOMPLETED_BUSINESS = "hasUncompletedBusiness";
    private static final String KEY_PAN_CODE = "panCode";
    private static final String KEY_PAYMENT_CHANNELS = "paymentChannels";
    private static final String KEY_POST_PAID_CARD_DESC = "postPaidCardDesc";
    private static final String KEY_POST_PAID_CARD_STATUS = "postPaidCardStatus";
    private static final String KEY_UWB_PROPERTIES = "uwbProperties";
    private static final int MASK_FIRA_APPLET_SUCCESS = 2;
    private static final int MASK_SUPPORT_UWB = 1;
    private static final int TRANSFER_OUT_BALANCE_AMOUNT_DEFAULT = 0;
    protected Map<FeeInfo.ActionType, List<FeeInfo>> mActionType2FeeInfoListMap;
    protected List<FeeInfo> mActiveFeeInfos;
    private long mCustomConfigId;
    private CustomFeeInfo mCustomFeeInfo;
    private CustomInfo mCustomInfo;
    private boolean mHasUncompletedBusiness;
    private String mPanCode;
    private String mPhoneNumber;
    private String mPostPaidCardDescription;
    private String mPostPaidCardStatus;
    private UncompletedBusiness mUncompletedBusiness;
    public List<OrderInfo> mUnfinishOrderInfos;
    private TransferOutOrderInfo mUnfinishTransferOutInfo;
    private int mUwbProperties;

    public PayableCardInfo(String str) {
        super(str);
        this.mCardGroupId = CardGroupType.TRANSCARD.getId();
        this.mActionType2FeeInfoListMap = new HashMap();
        this.mUnfinishOrderInfos = new CopyOnWriteArrayList();
    }

    private boolean isIssueAndRechargeOrderAndIssued(OrderInfo orderInfo) {
        return orderInfo.isIssueAndRechargeOrder() && this.mHasIssue;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean canTransferIn() {
        if (this.mHasIssue || !this.mIsReadSECorrectly) {
            return false;
        }
        return hasTransferInOrder();
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
        return TextUtils.equals(this.mCardType, cardInfo.mCardType) && TextUtils.equals(this.mCardDevice, cardInfo.mCardDevice);
    }

    public List<FeeInfo> getActiveFeeInfoList() {
        CustomFeeInfo customFeeInfo;
        if (this.mHasIssue) {
            this.mActiveFeeInfos = this.mActionType2FeeInfoListMap.get(FeeInfo.ActionType.recharge);
        } else {
            List<FeeInfo> list = this.mActionType2FeeInfoListMap.get(FeeInfo.ActionType.issue);
            this.mActiveFeeInfos = list;
            if (list == null) {
                this.mActiveFeeInfos = this.mActionType2FeeInfoListMap.get(FeeInfo.ActionType.issueAndRecharge);
            }
        }
        if (this.mActiveFeeInfos != null && (customFeeInfo = this.mCustomFeeInfo) != null && customFeeInfo.isValid() && !this.mActiveFeeInfos.contains(this.mCustomFeeInfo)) {
            this.mActiveFeeInfos.add(this.mCustomFeeInfo);
        }
        return this.mActiveFeeInfos;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public List<String> getAids() {
        List<String> aids = super.getAids();
        CardConfigManager.CardConfig cardConfig = CardConfigManager.getInstance().getCardConfig(getAid());
        if (cardConfig != null) {
            List<String> memberAidList = cardConfig.getMemberAidList();
            if (!ObjectUtils.isCollectionEmpty(memberAidList)) {
                aids.addAll(memberAidList);
            }
        }
        return aids;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public String getContentDescription(Map<Class<? extends CardInfo>, String> map) {
        String str;
        return (map == null || (str = map.get(getClass())) == null) ? super.getContentDescription(null) : String.format(str, this.mCardName, Float.valueOf(this.mCardBalance / 100.0f));
    }

    public long getCustomConfigId() {
        return this.mCustomConfigId;
    }

    public CustomFeeInfo getCustomFeeInfo() {
        return this.mCustomFeeInfo;
    }

    public FeeInfo getFeeInfo(int i) {
        if (getActiveFeeInfoList() == null || getActiveFeeInfoList().size() <= i) {
            return null;
        }
        return getActiveFeeInfoList().get(i);
    }

    public String getPanCode() {
        return this.mPanCode;
    }

    public List<String> getPaymentChannels() {
        ArrayList arrayList = new ArrayList();
        String extra = getExtra();
        if (TextUtils.isEmpty(extra)) {
            return Collections.emptyList();
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(extra).optJSONArray(KEY_PAYMENT_CHANNELS);
            if (jSONArrayOptJSONArray == null) {
                return Collections.emptyList();
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException unused) {
            LogUtils.d("parse paymentChannels failed");
            return Collections.emptyList();
        }
    }

    public String getPhoneNumber() {
        return this.mPhoneNumber;
    }

    public String getPostPaidCardDescription() {
        return this.mPostPaidCardDescription;
    }

    public String getPostPaidCardStatus() {
        return this.mPostPaidCardStatus;
    }

    public OrderInfo getRechargeOrder() {
        List<OrderInfo> list = this.mUnfinishOrderInfos;
        if (list != null && !list.isEmpty()) {
            for (OrderInfo orderInfo : list) {
                if (orderInfo.isRechargeOrder()) {
                    return orderInfo;
                }
            }
        }
        return null;
    }

    public List<OrderInfo> getRechargeableOrderList() {
        ArrayList arrayList = new ArrayList();
        if (ObjectUtils.isCollectionEmpty(this.mUnfinishOrderInfos)) {
            return arrayList;
        }
        for (OrderInfo orderInfo : this.mUnfinishOrderInfos) {
            if (orderInfo.isRechargeOrder() || orderInfo.isIssueAndRechargeOrder()) {
                arrayList.add(orderInfo);
            }
        }
        return arrayList;
    }

    public OrderInfo getTransferInOrder() {
        if (canTransferIn()) {
            return this.mUnfinishOrderInfos.get(0);
        }
        return null;
    }

    public int getTransferOutBalance() {
        List<ActionToken> list;
        if (canTransferIn() && (list = this.mUnfinishOrderInfos.get(0).mActionTokens) != null && !list.isEmpty()) {
            for (ActionToken actionToken : list) {
                if (actionToken.mType == ActionToken.TokenType.withdraw) {
                    return actionToken.mRechargeAmount;
                }
            }
        }
        return 0;
    }

    public UncompletedBusiness getUncompletedBusiness() {
        return this.mUncompletedBusiness;
    }

    public TransferOutOrderInfo getUnfinishTransferOutInfo() {
        return this.mUnfinishTransferOutInfo;
    }

    public FeeInfo getWithdrawFeeInfo() {
        List<FeeInfo> list;
        if (canTransferIn() && (list = this.mActionType2FeeInfoListMap.get(FeeInfo.ActionType.withdraw)) != null && !list.isEmpty()) {
            for (FeeInfo feeInfo : list) {
                if (feeInfo.mActionType == FeeInfo.ActionType.withdraw) {
                    return feeInfo;
                }
            }
        }
        return null;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean hasIssueOrder() {
        List<OrderInfo> list = this.mUnfinishOrderInfos;
        if (list == null) {
            return false;
        }
        Iterator<OrderInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isIssueOrder()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean hasRechargeOrder() {
        List<OrderInfo> list = this.mUnfinishOrderInfos;
        if (list == null) {
            return false;
        }
        Iterator<OrderInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isRechargeOrder()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean hasTransferInOrder() {
        OrderInfo orderInfo;
        List<ActionToken> list;
        List<OrderInfo> list2 = this.mUnfinishOrderInfos;
        if (list2 != null && !list2.isEmpty() && (orderInfo = this.mUnfinishOrderInfos.get(0)) != null && (list = orderInfo.mActionTokens) != null) {
            Iterator<ActionToken> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().mType == ActionToken.TokenType.withdraw) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasUnfinishedOrder() {
        List<OrderInfo> list = this.mUnfinishOrderInfos;
        return ((list == null || list.isEmpty()) && this.mUnfinishTransferOutInfo == null) ? false : true;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public int hashCode() {
        return this.mCardType.hashCode();
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isCanSwipe() {
        return !isHasUncompletedBusiness();
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isDeletable() {
        TransferExtra transferExtra = TransferExtra.get(getTransferExtra());
        return TextUtils.equals(getTransferCardStatus(), "ISSUED") && transferExtra != null && transferExtra.isDeletable();
    }

    public boolean isFiraAppletSuccess() {
        return (this.mUwbProperties & 2) == 2;
    }

    public boolean isHasUncompletedBusiness() {
        return this.mHasUncompletedBusiness;
    }

    public boolean isSupportUwb() {
        return (this.mUwbProperties & 1) == 1;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isTransCard() {
        return true;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.mActionType2FeeInfoListMap.put(FeeInfo.ActionType.valueOf(parcel.readString()), new CopyOnWriteArrayList(parcel.readArrayList(FeeInfo.class.getClassLoader())));
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.mUnfinishOrderInfos = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(parcel.readArrayList(OrderInfo.class.getClassLoader()));
        this.mPhoneNumber = parcel.readString();
        this.mCustomFeeInfo = (CustomFeeInfo) parcel.readParcelable(CustomFeeInfo.class.getClassLoader());
        this.mCustomInfo = (CustomInfo) parcel.readParcelable(CustomInfo.class.getClassLoader());
        this.mUncompletedBusiness = (UncompletedBusiness) parcel.readParcelable(UncompletedBusiness.class.getClassLoader());
        this.mHasUncompletedBusiness = parcel.readByte() == 1;
        this.mUnfinishTransferOutInfo = (TransferOutOrderInfo) parcel.readParcelable(TransferOutOrderInfo.class.getClassLoader());
        this.mCustomConfigId = parcel.readLong();
        this.mPanCode = parcel.readString();
        this.mPostPaidCardStatus = parcel.readString();
        this.mPostPaidCardDescription = parcel.readString();
        this.mUwbProperties = parcel.readInt();
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObjectSerialize = super.serialize();
        if (jSONObjectSerialize != null) {
            try {
                if (this.mActionType2FeeInfoListMap != null) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FeeInfo.ActionType> it = this.mActionType2FeeInfoListMap.keySet().iterator();
                    while (it.hasNext()) {
                        Iterator<FeeInfo> it2 = this.mActionType2FeeInfoListMap.get(it.next()).iterator();
                        while (it2.hasNext()) {
                            jSONArray.put(it2.next().serialize());
                        }
                    }
                    jSONObjectSerialize.put(KEY_FEES, jSONArray);
                    CustomInfo customInfo = this.mCustomInfo;
                    if (customInfo != null) {
                        jSONObjectSerialize.put(KEY_CUSTOM_INFO, customInfo.serialize());
                    }
                }
                jSONObjectSerialize.put(KEY_HAS_UNCOMPLETED_BUSINESS, this.mHasUncompletedBusiness);
                jSONObjectSerialize.put("configId", this.mCustomConfigId);
                jSONObjectSerialize.put(KEY_PAN_CODE, this.mPanCode);
                jSONObjectSerialize.put(KEY_POST_PAID_CARD_STATUS, this.mPostPaidCardStatus);
                jSONObjectSerialize.put(KEY_POST_PAID_CARD_DESC, this.mPostPaidCardDescription);
                jSONObjectSerialize.put(KEY_UWB_PROPERTIES, this.mUwbProperties);
            } catch (JSONException e) {
                LogUtils.e("serialize fee info list failed.", e);
            }
        }
        return jSONObjectSerialize;
    }

    public void setHasUncompletedBusiness(boolean z) {
        this.mHasUncompletedBusiness = z;
    }

    public void setPanCode(String str) {
        this.mPanCode = str;
    }

    public void setPhoneNumber(String str) {
        this.mPhoneNumber = str;
    }

    public void setPostPaidCardDescription(String str) {
        this.mPostPaidCardDescription = str;
    }

    public void setPostPaidCardStatus(String str) {
        this.mPostPaidCardStatus = str;
    }

    public void setUncompletedBusiness(UncompletedBusiness uncompletedBusiness) {
        setHasUncompletedBusiness(uncompletedBusiness != null);
        if (uncompletedBusiness == null) {
            return;
        }
        this.mUncompletedBusiness = uncompletedBusiness;
        OrderInfo orderInfo = uncompletedBusiness.getOrderInfo();
        if (orderInfo != null) {
            setHasUncompletedBusiness(true ^ isIssueAndRechargeOrderAndIssued(orderInfo));
            updateOrderInfo(orderInfo);
        }
        TransferOutOrderInfo transferOutOrderInfo = this.mUncompletedBusiness.getTransferOutOrderInfo();
        if (transferOutOrderInfo != null) {
            setUnfinishTransferOutInfo(transferOutOrderInfo);
        }
    }

    public void setUnfinishTransferOutInfo(TransferOutOrderInfo transferOutOrderInfo) {
        this.mUnfinishTransferOutInfo = transferOutOrderInfo;
    }

    public void setUwbProperties(int i) {
        this.mUwbProperties = i;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean showBalance() {
        return this.mCardBalance != -999 && ((CardInfoExtra.get(getExtra()) != null && CardInfoExtra.get(getExtra()).isBalanceCard()) || (TransferExtra.get(getTransferExtra()) != null && TransferExtra.get(getTransferExtra()).isShowBalance()));
    }

    public void updateCustomFeeInfo(CustomFeeInfo customFeeInfo) {
        List<FeeInfo> list;
        int iIndexOf;
        if (customFeeInfo == null || (list = this.mActiveFeeInfos) == null || (iIndexOf = list.indexOf(customFeeInfo)) < 0) {
            return;
        }
        this.mActiveFeeInfos.set(iIndexOf, customFeeInfo);
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public void updateInfo(CardInfo cardInfo) {
        super.updateInfo(cardInfo);
        this.mUwbProperties = ((PayableCardInfo) cardInfo).mUwbProperties;
    }

    public PayableCardInfo updateOrderInfo(OrderInfo orderInfo) {
        if (orderInfo != null && orderInfo.isPaid()) {
            List<OrderInfo> list = this.mUnfinishOrderInfos;
            if (list != null) {
                list.clear();
            } else {
                this.mUnfinishOrderInfos = new CopyOnWriteArrayList();
            }
            this.mUnfinishOrderInfos.add(orderInfo);
        }
        return this;
    }

    @Override // com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        Map<FeeInfo.ActionType, List<FeeInfo>> map = this.mActionType2FeeInfoListMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(map.size());
            for (FeeInfo.ActionType actionType : this.mActionType2FeeInfoListMap.keySet()) {
                parcel.writeString(actionType.name());
                parcel.writeList(this.mActionType2FeeInfoListMap.get(actionType));
            }
        }
        parcel.writeList(this.mUnfinishOrderInfos);
        parcel.writeString(this.mPhoneNumber);
        parcel.writeParcelable(this.mCustomFeeInfo, i);
        parcel.writeParcelable(this.mCustomInfo, i);
        parcel.writeParcelable(this.mUncompletedBusiness, i);
        parcel.writeByte(this.mHasUncompletedBusiness ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mUnfinishTransferOutInfo, i);
        parcel.writeLong(this.mCustomConfigId);
        parcel.writeString(this.mPanCode);
        parcel.writeString(this.mPostPaidCardStatus);
        parcel.writeString(this.mPostPaidCardDescription);
        parcel.writeInt(this.mUwbProperties);
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.entity.ObjectParser
    public CardInfo parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        if (jSONObject == null) {
            return this;
        }
        if (jSONObject.has(KEY_FEES)) {
            try {
                Map<FeeInfo.ActionType, List<FeeInfo>> map = this.mActionType2FeeInfoListMap;
                if (map != null) {
                    map.clear();
                }
                JSONArray jSONArray = jSONObject.getJSONArray(KEY_FEES);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    FeeInfo feeInfo = new FeeInfo();
                    feeInfo.parse(jSONObject2);
                    if (this.mActionType2FeeInfoListMap.get(feeInfo.mActionType) == null) {
                        this.mActionType2FeeInfoListMap.put(feeInfo.mActionType, new ArrayList());
                    }
                    this.mActionType2FeeInfoListMap.get(feeInfo.mActionType).add(feeInfo);
                }
            } catch (JSONException e) {
                LogUtils.e("parse fee info list failed. parse object:" + jSONObject.toString(), e);
            }
        }
        if (jSONObject.has(KEY_CUSTOM_INFO)) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject(KEY_CUSTOM_INFO);
                CustomInfo customInfo = new CustomInfo();
                this.mCustomInfo = customInfo;
                customInfo.parse(jSONObject3);
                if (jSONObject.has("configId")) {
                    this.mCustomInfo.setCustomConfigId(jSONObject.optLong("configId"));
                }
                this.mCustomFeeInfo = new CustomFeeInfo(this.mCustomInfo);
            } catch (JSONException e2) {
                LogUtils.e("parse customInfo info list failed. parse object:" + jSONObject.toString(), e2);
            }
        }
        this.mHasUncompletedBusiness = jSONObject.optBoolean(KEY_HAS_UNCOMPLETED_BUSINESS);
        this.mCustomConfigId = jSONObject.optLong("configId");
        if (jSONObject.has(KEY_PAN_CODE)) {
            this.mPanCode = jSONObject.optString(KEY_PAN_CODE);
        }
        if (jSONObject.has(KEY_POST_PAID_CARD_STATUS)) {
            this.mPostPaidCardStatus = jSONObject.optString(KEY_POST_PAID_CARD_STATUS);
        }
        if (jSONObject.has(KEY_POST_PAID_CARD_DESC)) {
            this.mPostPaidCardDescription = jSONObject.optString(KEY_POST_PAID_CARD_DESC);
        }
        if (jSONObject.has(KEY_UWB_PROPERTIES)) {
            this.mUwbProperties = jSONObject.optInt(KEY_UWB_PROPERTIES);
        }
        return this;
    }
}
