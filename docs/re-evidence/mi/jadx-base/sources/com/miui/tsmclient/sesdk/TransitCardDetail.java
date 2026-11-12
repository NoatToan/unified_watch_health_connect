package com.miui.tsmclient.sesdk;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoExtra;
import com.miui.tsmclient.entity.CardUIInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TransitCardDetail implements IJsonSerializer, IJsonDeserializer<TransitCardDetail>, SeCard.IOnlineProperties {
    private static final String KEY_SIMPLE_RIDE_DISCOUNT_DESC = "simpleRideDiscountDesc";
    private static final String KEY_SIMPLE_SUPPORT_AREAS_DESC = "simpleSupportAreasDesc";

    @SerializedName(CardInfo.KEY_CARD_GROUP)
    private int mCardGroup;
    private transient CardInfo mCardInfo;

    @SerializedName("description")
    private String mDescription;

    @SerializedName("descriptions")
    private String mDescriptions;

    @SerializedName("extra")
    private String mExtra;

    @SerializedName(CardInfo.KEY_CARD_GROUP_NAME)
    private String mGroupName;

    @SerializedName("isOwner")
    private boolean mIsOwner;

    @SerializedName("isServiceAvailable")
    private boolean mIsServiceAvailable;

    @SerializedName("isShowRefundTicket")
    private boolean mIsShowRefundTicket;

    @SerializedName(CardInfo.KEY_ISSUE_STATUS)
    private int mIssueStatus;

    @SerializedName(CardInfo.KEY_ISSUE_STATUS_DESC)
    private String mIssueStatusDesc;

    @SerializedName("label")
    private String mLabel;

    @SerializedName(CardInfo.KEY_RECHARGE_STATUS)
    private int mRechargeStatus;

    @SerializedName(CardInfo.KEY_RECHARGE_STATUS_DESC)
    private String mRechargeStatusDesc;

    @SerializedName(CardInfo.KEY_SERVICE_FEE_DESC)
    private String mServiceFeeDesc;

    @SerializedName("serviceStatus")
    private String mServiceStatus;

    @SerializedName(CardUIInfo.KEY_SUBTITILE)
    private String mSubTitle;

    @SerializedName("tips")
    private String mTips;

    public TransitCardDetail(SeCard seCard) {
        CardInfo cardInfo = seCard.mCardInfo;
        this.mCardInfo = cardInfo;
        this.mGroupName = cardInfo.mGroupName;
        this.mServiceFeeDesc = cardInfo.getServiceFeeDesc();
        CardInfo cardInfo2 = this.mCardInfo;
        this.mCardGroup = cardInfo2.mCardGroupId;
        this.mSubTitle = cardInfo2.mCardSubName;
        this.mIssueStatus = cardInfo2.getIssueStatus();
        this.mIssueStatusDesc = this.mCardInfo.getIssueStatusDesc();
        this.mRechargeStatusDesc = this.mCardInfo.getRechargeStatusDesc();
        this.mRechargeStatus = this.mCardInfo.getRechargeStatus();
        CardInfo cardInfo3 = this.mCardInfo;
        this.mIsShowRefundTicket = cardInfo3.mIsShowRefundTicket;
        this.mIsOwner = cardInfo3.isOwner();
        this.mExtra = this.mCardInfo.getExtra();
        CardUIInfo cardUIInfo = this.mCardInfo.mCardUIInfo;
        this.mDescription = cardUIInfo != null ? cardUIInfo.mCardDetailDesc : null;
        JSONObject jSONObject = new JSONObject();
        try {
            CardUIInfo cardUIInfo2 = this.mCardInfo.mCardUIInfo;
            if (cardUIInfo2 != null) {
                jSONObject.put(KEY_SIMPLE_SUPPORT_AREAS_DESC, cardUIInfo2.mSimpleSupportAreasDesc);
                jSONObject.put(KEY_SIMPLE_RIDE_DISCOUNT_DESC, this.mCardInfo.mCardUIInfo.mSimpleRideDiscountDesc);
            }
        } catch (JSONException unused) {
        }
        this.mDescriptions = jSONObject.toString();
        this.mServiceStatus = this.mCardInfo.getServiceStatusDesc();
        this.mIsServiceAvailable = this.mCardInfo.isServiceAvailable();
        this.mTips = null;
        this.mLabel = this.mCardInfo.getLabel();
    }

    public static TransitCardDetail fromJson(String str) {
        return (TransitCardDetail) new Gson().fromJson(str, TransitCardDetail.class);
    }

    public int getCardGroup() {
        return this.mCardGroup;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getDescription() {
        return this.mDescription;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getDescriptions() {
        return this.mDescriptions;
    }

    public String getGroupName() {
        return this.mGroupName;
    }

    public int getIssueStatus() {
        return this.mIssueStatus;
    }

    public String getIssueStatusDesc() {
        return this.mIssueStatusDesc;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getLabel() {
        return this.mLabel;
    }

    public int getRechargeStatus() {
        return this.mRechargeStatus;
    }

    public String getRechargeStatusDesc() {
        return this.mRechargeStatusDesc;
    }

    public String getServiceFeeDesc() {
        return this.mServiceFeeDesc;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getServiceStatus() {
        return this.mServiceStatus;
    }

    public String getSubTitle() {
        return this.mSubTitle;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public String getTips() {
        return this.mTips;
    }

    public boolean isAllowQuerySiteInfo() {
        return CardInfoExtra.get(this.mExtra).isAllowQuerySiteInfo();
    }

    public boolean isOwner() {
        return this.mIsOwner;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard.IOnlineProperties
    public boolean isServiceAvailable() {
        return this.mIsServiceAvailable;
    }

    public boolean isShowRefundTicket() {
        return this.mIsShowRefundTicket;
    }

    public boolean isSupportServiceFeeRefund() {
        return CardInfoExtra.get(this.mExtra).isSupportServiceFeeRefund();
    }

    @Override // com.miui.tsmclient.sesdk.IJsonSerializer
    public String toJson() {
        return new Gson().toJson(this);
    }
}
