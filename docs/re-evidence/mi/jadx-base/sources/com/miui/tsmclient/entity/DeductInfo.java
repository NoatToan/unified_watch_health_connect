package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes6.dex */
public class DeductInfo implements Parcelable {
    public static final Parcelable.Creator<DeductInfo> CREATOR = new Parcelable.Creator<DeductInfo>() { // from class: com.miui.tsmclient.entity.DeductInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeductInfo createFromParcel(Parcel parcel) {
            return new DeductInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeductInfo[] newArray(int i) {
            return new DeductInfo[0];
        }
    };
    private static final int FLAG_RESP_CODE = 200;

    @SerializedName(TSMAuthContants.PARAM_VALID)
    private boolean mAutoRechargeValid;

    @SerializedName(TSMAuthContants.PARAM_THRESHOLD)
    private int mBalanceThreshold;

    @SerializedName("bankShortName")
    private String mBankShortName;

    @SerializedName("cardTailNum")
    private String mCardTailNum;

    @SerializedName("deductAmount")
    private int mDeductAmount;

    @SerializedName("deductChannel")
    private String mDeductChannel;

    @SerializedName("deductChannelChs")
    private String mDeductChannelChs;

    @SerializedName(TSMAuthContants.PARAM_DEDUCT_ID)
    private String mDeductId;

    @SerializedName(TSMAuthContants.PARAM_FEEID)
    private int mFeeId;

    @SerializedName("merchantName")
    private String mMerchantName;

    @SerializedName("isServiceAvailable")
    private boolean mServiceAvailable;

    @SerializedName("contractStatus")
    private int mStatusCode;

    @SerializedName("suggestToShow")
    private boolean mSuggestToShow;

    private boolean isSuggestToShow() {
        return this.mSuggestToShow;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof DeductInfo)) {
            return false;
        }
        DeductInfo deductInfo = (DeductInfo) obj;
        return this.mAutoRechargeValid == deductInfo.isAutoRechargeValid() && this.mBalanceThreshold == deductInfo.getBalanceThreshold() && this.mFeeId == deductInfo.getFeeId() && TextUtils.equals(this.mCardTailNum, deductInfo.getCardTailNum()) && TextUtils.equals(this.mBankShortName, deductInfo.getBankShortName()) && this.mStatusCode == deductInfo.getStatusCode() && TextUtils.equals(this.mDeductId, deductInfo.getDeductId()) && this.mServiceAvailable == deductInfo.isServiceAvailable() && this.mSuggestToShow == deductInfo.isSuggestToShow() && this.mDeductChannel == deductInfo.getDeductChannel() && this.mDeductChannelChs == deductInfo.getDeductChannelChs() && this.mMerchantName == deductInfo.getMerchantName() && this.mDeductAmount == deductInfo.getDeductAmount();
    }

    public int getBalanceThreshold() {
        return this.mBalanceThreshold;
    }

    public String getBankShortName() {
        return this.mBankShortName;
    }

    public String getCardTailNum() {
        return this.mCardTailNum;
    }

    public int getDeductAmount() {
        return this.mDeductAmount;
    }

    public String getDeductChannel() {
        return this.mDeductChannel;
    }

    public String getDeductChannelChs() {
        return this.mDeductChannelChs;
    }

    public String getDeductId() {
        return this.mDeductId;
    }

    public int getFeeId() {
        return this.mFeeId;
    }

    public String getMerchantName() {
        return this.mMerchantName;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public boolean isAutoRechargeClosed() {
        return isDeductible() && !isAutoRechargeValid() && this.mFeeId > 0 && isServiceAvailable();
    }

    public boolean isAutoRechargeServiceOpen() {
        return isDeductible() && isAutoRechargeValid() && this.mFeeId > 0 && isServiceAvailable();
    }

    public boolean isAutoRechargeValid() {
        return this.mAutoRechargeValid;
    }

    public boolean isBalanceValid() {
        return this.mBalanceThreshold > 0;
    }

    public boolean isBankInfoValid() {
        return isSuggestToShow() && isDeductible() && !TextUtils.isEmpty(this.mBankShortName) && !TextUtils.isEmpty(this.mCardTailNum);
    }

    public boolean isDeductible() {
        return this.mStatusCode == 200;
    }

    public boolean isServiceAvailable() {
        return this.mServiceAvailable;
    }

    public void readFromParcel(Parcel parcel) {
        this.mAutoRechargeValid = parcel.readByte() == 1;
        this.mBalanceThreshold = parcel.readInt();
        this.mFeeId = parcel.readInt();
        this.mCardTailNum = parcel.readString();
        this.mBankShortName = parcel.readString();
        this.mStatusCode = parcel.readInt();
        this.mDeductId = parcel.readString();
        this.mServiceAvailable = parcel.readByte() == 1;
        this.mSuggestToShow = parcel.readByte() == 1;
        this.mDeductChannel = parcel.readString();
        this.mDeductChannelChs = parcel.readString();
        this.mMerchantName = parcel.readString();
        this.mDeductAmount = parcel.readInt();
    }

    public void setBalanceThreshold(int i) {
        this.mBalanceThreshold = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mAutoRechargeValid ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mBalanceThreshold);
        parcel.writeInt(this.mFeeId);
        parcel.writeString(this.mCardTailNum);
        parcel.writeString(this.mBankShortName);
        parcel.writeInt(this.mStatusCode);
        parcel.writeString(this.mDeductId);
        parcel.writeByte(this.mServiceAvailable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mSuggestToShow ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mDeductChannel);
        parcel.writeString(this.mDeductChannelChs);
        parcel.writeString(this.mMerchantName);
        parcel.writeInt(this.mDeductAmount);
    }

    public DeductInfo() {
    }

    private DeductInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
