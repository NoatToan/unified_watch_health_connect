package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;

/* JADX INFO: loaded from: classes6.dex */
public class CouponInfo implements Parcelable {
    public static final Parcelable.Creator<CouponInfo> CREATOR = new Parcelable.Creator<CouponInfo>() { // from class: com.miui.tsmclient.entity.CouponInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CouponInfo createFromParcel(Parcel parcel) {
            return new CouponInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CouponInfo[] newArray(int i) {
            return new CouponInfo[0];
        }
    };

    @SerializedName(TSMAuthContants.PARAM_COUPON_ID)
    private long mCouponId;

    @SerializedName("name")
    private String mCouponName;

    @SerializedName("desc")
    private String mDesc;

    @SerializedName("extra")
    private String mExtra;

    @SerializedName("issueDiscount")
    private int mIssueDiscount;

    @SerializedName("issuePayFee")
    private int mIssuePayFee;

    @SerializedName("rechargeDiscount")
    private int mRechargeDiscount;

    @SerializedName("rechargePayFee")
    private int mRechargePayFee;

    @SerializedName("totalDiscount")
    private int mTotalDiscount;

    @SerializedName("totalPayFee")
    private int mTotalPayFee;

    @SerializedName(TSMAuthContants.PARAM_VALID)
    private boolean mValid;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCouponId() {
        return this.mCouponId;
    }

    public String getCouponName() {
        return this.mCouponName;
    }

    public String getDesc() {
        return this.mDesc;
    }

    public String getExtra() {
        return this.mExtra;
    }

    public int getIssueDiscount() {
        return this.mIssueDiscount;
    }

    public int getIssuePayFee() {
        return this.mIssuePayFee;
    }

    public int getRechargeDiscount() {
        return this.mRechargeDiscount;
    }

    public int getRechargePayFee() {
        return this.mRechargePayFee;
    }

    public int getTotalDiscount() {
        return this.mTotalDiscount;
    }

    public int getTotalPayFee() {
        return this.mTotalPayFee;
    }

    public boolean isValid() {
        return this.mValid;
    }

    public void readFromParcel(Parcel parcel) {
        this.mCouponId = parcel.readLong();
        this.mCouponName = parcel.readString();
        this.mIssueDiscount = parcel.readInt();
        this.mRechargeDiscount = parcel.readInt();
        this.mTotalDiscount = parcel.readInt();
        this.mIssuePayFee = parcel.readInt();
        this.mRechargePayFee = parcel.readInt();
        this.mTotalPayFee = parcel.readInt();
        this.mValid = parcel.readByte() == 1;
        this.mDesc = parcel.readString();
        this.mExtra = parcel.readString();
    }

    public void setCouponName(String str) {
        this.mCouponName = str;
    }

    public void setValid(boolean z) {
        this.mValid = z;
    }

    public String toString() {
        return new Gson().toJson(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mCouponId);
        parcel.writeString(this.mCouponName);
        parcel.writeInt(this.mIssueDiscount);
        parcel.writeInt(this.mRechargeDiscount);
        parcel.writeInt(this.mTotalDiscount);
        parcel.writeInt(this.mIssuePayFee);
        parcel.writeInt(this.mRechargePayFee);
        parcel.writeInt(this.mTotalPayFee);
        parcel.writeByte(this.mValid ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mDesc);
        parcel.writeString(this.mExtra);
    }

    public CouponInfo() {
    }

    private CouponInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
