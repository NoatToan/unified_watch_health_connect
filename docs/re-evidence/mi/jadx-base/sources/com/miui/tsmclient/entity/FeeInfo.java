package com.miui.tsmclient.entity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class FeeInfo implements Parcelable, JSONSerializable, ObjectParser<FeeInfo> {
    public static final Parcelable.Creator<FeeInfo> CREATOR = new Parcelable.Creator<FeeInfo>() { // from class: com.miui.tsmclient.entity.FeeInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FeeInfo createFromParcel(Parcel parcel) {
            return new FeeInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FeeInfo[] newArray(int i) {
            return new FeeInfo[i];
        }
    };
    private static final String KEY_ACTIONTYPE = "actionType";
    private static final String KEY_AMOUNT = "amount";
    private static final String KEY_DISPLAYFEE = "displayFee";
    private static final String KEY_EXTRA = "extra";
    private static final String KEY_FEEID = "feeId";
    private static final String KEY_MSG = "msg";
    private static final String KEY_PAYFEE = "payFee";
    private static final String KEY_RECHARGEFEE = "rechargeFee";
    private static final String KEY_RECOMMEND = "recommend";
    private static final String KEY_SUGGESTED = "suggested";
    private static final String KEY_USE_COUPON = "useCoupon";
    public ActionType mActionType;
    private CouponInfo mCouponInfo;
    public int mDisplayFee;
    private String mExtra;
    private boolean mHasCoupon;
    public int mId;
    private boolean mIsRecommend;
    public String mMsg;
    public int mPayFee;
    public int mQuantity;
    public int mRechargeFee;
    private boolean mSuggested;

    public enum ActionType {
        unknown(0),
        issue(1),
        recharge(2),
        withdraw(3),
        issueAndRecharge(12);

        private int mId;

        ActionType(int i) {
            this.mId = i;
        }

        public static ActionType newInstance(int i) {
            for (ActionType actionType : values()) {
                if (actionType.mId == i) {
                    return actionType;
                }
            }
            return unknown;
        }

        public int getId() {
            return this.mId;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof FeeInfo) && ((FeeInfo) obj).mId == this.mId;
    }

    public CouponInfo getCouponInfo() {
        return this.mCouponInfo;
    }

    public Bundle getCustomFeeExtra(PayableCardInfo payableCardInfo) {
        return Bundle.EMPTY;
    }

    public int getDiscountIssueFee() {
        CouponInfo couponInfo = this.mCouponInfo;
        return couponInfo != null ? couponInfo.getIssuePayFee() : getIssueFee();
    }

    public int getDiscountPayFee() {
        CouponInfo couponInfo = this.mCouponInfo;
        return couponInfo != null ? couponInfo.getTotalPayFee() : getPayFee();
    }

    public String getExtra() {
        return this.mExtra;
    }

    public int getIssueFee() {
        return getPayFee() - getRechargeFee();
    }

    public int getPayFee() {
        return this.mPayFee;
    }

    public int getRechargeFee() {
        return this.mRechargeFee;
    }

    public String getRechargeFeeYuan() {
        return StringUtils.covertFloatToString(getRechargeFee() / 100.0f);
    }

    public boolean hasCoupon() {
        return this.mHasCoupon;
    }

    public boolean hasDiscountIssueFee(int i) {
        return i != getIssueFee();
    }

    public int hashCode() {
        return this.mId;
    }

    public boolean isCustomFee() {
        return false;
    }

    public boolean isRecommend() {
        return this.mIsRecommend;
    }

    public boolean isSuggested() {
        return this.mSuggested;
    }

    public boolean isValidRechargeFee() {
        return this.mRechargeFee >= 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.mId = parcel.readInt();
        this.mDisplayFee = parcel.readInt();
        this.mPayFee = parcel.readInt();
        this.mRechargeFee = parcel.readInt();
        this.mQuantity = parcel.readInt();
        this.mMsg = parcel.readString();
        this.mActionType = (ActionType) parcel.readValue(ActionType.class.getClassLoader());
        this.mSuggested = parcel.readByte() != 0;
        this.mHasCoupon = parcel.readByte() != 0;
        this.mIsRecommend = parcel.readByte() != 0;
        this.mExtra = parcel.readString();
    }

    public void restoreIssueFee() {
    }

    public void restoreRechargeFee() {
    }

    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feeId", this.mId);
            jSONObject.put(KEY_DISPLAYFEE, this.mDisplayFee);
            jSONObject.put("payFee", this.mPayFee);
            jSONObject.put(KEY_RECHARGEFEE, this.mRechargeFee);
            jSONObject.put(KEY_AMOUNT, this.mQuantity);
            jSONObject.put("msg", this.mMsg);
            jSONObject.put("actionType", this.mActionType.getId());
            jSONObject.put(KEY_SUGGESTED, this.mSuggested);
            jSONObject.put(KEY_USE_COUPON, this.mHasCoupon);
            jSONObject.put(KEY_RECOMMEND, this.mIsRecommend);
            if (!TextUtils.isEmpty(this.mExtra)) {
                jSONObject.put("extra", this.mExtra);
            }
        } catch (JSONException e) {
            LogUtils.e("serialize fee info failed.", e);
        }
        return jSONObject;
    }

    public void setCouponInfo(CouponInfo couponInfo) {
        this.mCouponInfo = couponInfo;
    }

    public void setRechargeFee(int i) {
        this.mRechargeFee = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mId);
        parcel.writeInt(this.mDisplayFee);
        parcel.writeInt(this.mPayFee);
        parcel.writeInt(this.mRechargeFee);
        parcel.writeInt(this.mQuantity);
        parcel.writeString(this.mMsg);
        parcel.writeValue(this.mActionType);
        parcel.writeByte(this.mSuggested ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mHasCoupon ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsRecommend ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mExtra);
    }

    public FeeInfo() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.entity.ObjectParser
    public FeeInfo parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mId = jSONObject.optInt("feeId");
            this.mDisplayFee = jSONObject.optInt(KEY_DISPLAYFEE);
            this.mPayFee = jSONObject.optInt("payFee");
            this.mRechargeFee = jSONObject.optInt(KEY_RECHARGEFEE);
            this.mQuantity = jSONObject.optInt(KEY_AMOUNT);
            this.mMsg = jSONObject.optString("msg");
            this.mActionType = ActionType.newInstance(jSONObject.optInt("actionType"));
            this.mSuggested = jSONObject.optBoolean(KEY_SUGGESTED);
            this.mHasCoupon = jSONObject.optBoolean(KEY_USE_COUPON);
            this.mIsRecommend = jSONObject.optBoolean(KEY_RECOMMEND);
            if (jSONObject.has("extra")) {
                this.mExtra = jSONObject.optString("extra");
            }
        }
        return this;
    }

    private FeeInfo(Parcel parcel) {
        readFromParcel(parcel);
    }

    public int getDiscountPayFee(CardInfo cardInfo) {
        CouponInfo couponInfo = this.mCouponInfo;
        if (couponInfo != null) {
            return couponInfo.getTotalPayFee();
        }
        return getPayFee();
    }
}
