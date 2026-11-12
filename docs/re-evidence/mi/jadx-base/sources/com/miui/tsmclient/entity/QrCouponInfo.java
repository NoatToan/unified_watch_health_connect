package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class QrCouponInfo {

    @SerializedName("additionalInfo")
    private String mAdditionalInfo;

    @SerializedName("desc")
    private String mDesc;

    @SerializedName("id")
    private String mId;

    @SerializedName("offsetAmount")
    private long mOffsetAmount;

    @SerializedName("sponserId")
    private String mSponsorId;

    @SerializedName("type")
    private String mType;

    public String getAdditionalInfo() {
        return this.mAdditionalInfo;
    }

    public String getDesc() {
        return this.mDesc;
    }

    public String getId() {
        return this.mId;
    }

    public InAppPromotionData getInAppPromotionData(long j) {
        InAppPromotionData inAppPromotionData = new InAppPromotionData();
        inAppPromotionData.setPromotionTitle(this.mDesc);
        inAppPromotionData.setPromotionId(this.mId);
        inAppPromotionData.setPromotionAmount(this.mOffsetAmount);
        if (j >= inAppPromotionData.getPromotionAmount()) {
            inAppPromotionData.setRealPayAmount(j - inAppPromotionData.getPromotionAmount());
            inAppPromotionData.setPromotionAvailable(true);
        } else {
            inAppPromotionData.setPromotionAvailable(false);
        }
        return inAppPromotionData;
    }

    public long getOffsetAmount() {
        return this.mOffsetAmount;
    }

    public String getSponsorId() {
        return this.mSponsorId;
    }

    public String getType() {
        return this.mType;
    }
}
