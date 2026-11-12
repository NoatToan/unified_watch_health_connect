package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.pay.OrderInfo;

/* JADX INFO: loaded from: classes6.dex */
public class TransferOutOrderInfo implements Parcelable {
    public static final Parcelable.Creator<TransferOutOrderInfo> CREATOR = new Parcelable.Creator<TransferOutOrderInfo>() { // from class: com.miui.tsmclient.entity.TransferOutOrderInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransferOutOrderInfo createFromParcel(Parcel parcel) {
            return new TransferOutOrderInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransferOutOrderInfo[] newArray(int i) {
            return new TransferOutOrderInfo[i];
        }
    };
    public static final String ORDER_TYPE_RETURN = "RETURN";
    public static final String ORDER_TYPE_TRANSFER = "TRANSFER";

    @SerializedName("cardName")
    private String mCardType;

    @SerializedName("cplc")
    private String mCplc;

    @SerializedName("createTime")
    private String mCreateTime;

    @SerializedName("deviceModel")
    private String mDeviceModel;

    @SerializedName(OrderInfo.KEY_NEED_PAY)
    private boolean mNeedPay;

    @SerializedName("orderId")
    private String mOrderId;

    @SerializedName("paid")
    private boolean mPaid;

    @SerializedName("payDesc")
    private String mPayDesc;

    @SerializedName(CardInfo.KEY_TRANSFER_OUT_TOKEN)
    private String mTransferOutToken;

    @SerializedName("transferStatus")
    private String mTransferStatus;

    @SerializedName("typeCode")
    private String mType;

    @SerializedName("userId")
    private String mUserId;

    private void readFromParcel(Parcel parcel) {
        this.mUserId = parcel.readString();
        this.mOrderId = parcel.readString();
        this.mCardType = parcel.readString();
        this.mCplc = parcel.readString();
        this.mDeviceModel = parcel.readString();
        this.mCreateTime = parcel.readString();
        this.mTransferStatus = parcel.readString();
        this.mTransferOutToken = parcel.readString();
        this.mPayDesc = parcel.readString();
        this.mNeedPay = parcel.readByte() != 0;
        this.mPaid = parcel.readByte() != 0;
        this.mType = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCardType() {
        return this.mCardType;
    }

    public String getCplc() {
        return this.mCplc;
    }

    public String getCreateTime() {
        return this.mCreateTime;
    }

    public String getDeviceModel() {
        return this.mDeviceModel;
    }

    public String getOrderId() {
        return this.mOrderId;
    }

    public String getOrderType() {
        return this.mType;
    }

    public String getPayDesc() {
        return this.mPayDesc;
    }

    public String getTransferOutToken() {
        return this.mTransferOutToken;
    }

    public String getTransferStatus() {
        return this.mTransferStatus;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public boolean isNeedPay() {
        return this.mNeedPay;
    }

    public boolean isPaid() {
        return this.mPaid;
    }

    public boolean isReturn() {
        return "RETURN".equals(this.mType);
    }

    public boolean isTransfer() {
        return ORDER_TYPE_TRANSFER.endsWith(this.mType);
    }

    public void setCardType(String str) {
        this.mCardType = str;
    }

    public void setCplc(String str) {
        this.mCplc = str;
    }

    public void setCreateTime(String str) {
        this.mCreateTime = str;
    }

    public void setDeviceModel(String str) {
        this.mDeviceModel = str;
    }

    public void setNeedPay(boolean z) {
        this.mNeedPay = z;
    }

    public void setOrderId(String str) {
        this.mOrderId = str;
    }

    public void setOrderType(String str) {
        this.mType = str;
    }

    public void setPaid(boolean z) {
        this.mPaid = z;
    }

    public void setPayDesc(String str) {
        this.mPayDesc = str;
    }

    public void setTransferOutToken(String str) {
        this.mTransferOutToken = str;
    }

    public void setTransferStatus(String str) {
        this.mTransferStatus = str;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUserId);
        parcel.writeString(this.mOrderId);
        parcel.writeString(this.mCardType);
        parcel.writeString(this.mCplc);
        parcel.writeString(this.mDeviceModel);
        parcel.writeString(this.mCreateTime);
        parcel.writeString(this.mTransferStatus);
        parcel.writeString(this.mTransferOutToken);
        parcel.writeString(this.mPayDesc);
        parcel.writeByte(this.mNeedPay ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mPaid ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mType);
    }

    private TransferOutOrderInfo(Parcel parcel) {
        this.mType = ORDER_TYPE_TRANSFER;
        readFromParcel(parcel);
    }

    public TransferOutOrderInfo() {
        this.mType = ORDER_TYPE_TRANSFER;
    }
}
