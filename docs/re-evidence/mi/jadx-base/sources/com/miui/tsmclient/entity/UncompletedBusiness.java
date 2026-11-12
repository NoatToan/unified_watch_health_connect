package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.pay.OrderInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class UncompletedBusiness implements Parcelable {
    public static final Parcelable.Creator<UncompletedBusiness> CREATOR = new Parcelable.Creator<UncompletedBusiness>() { // from class: com.miui.tsmclient.entity.UncompletedBusiness.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UncompletedBusiness createFromParcel(Parcel parcel) {
            return new UncompletedBusiness(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UncompletedBusiness[] newArray(int i) {
            return new UncompletedBusiness[i];
        }
    };
    private static final String SOURCE_TYPE_IN_WALLET = "IN_WALLET";

    @SerializedName("aid")
    private String aid;

    @SerializedName("businessSource")
    private String businessSource;

    @SerializedName("businessStatus")
    private String businessStatus;

    @SerializedName("businessStatusDesc")
    private String businessStatusDesc;

    @SerializedName("businessStatusOtherDesc")
    private String businessStatusOtherDesc;

    @SerializedName("cardName")
    private String cardName;

    @SerializedName("uncompletedMoveInOrderInfo")
    private UncompletedMoveInOrder moveInOrderInfo;

    @SerializedName("uncompletedMoveOutOrderInfo")
    private UncompletedMoveOutOrder moveOutOrderInfo;

    @SerializedName("respDesc")
    private String respDesc;

    @SerializedName("updateTime")
    private long updateTime;

    @SerializedName("userIdMismatchDesc")
    private String userIdMismatchDesc;

    public static class UncompletedMoveInOrder implements Parcelable {
        public static final Parcelable.Creator<UncompletedMoveInOrder> CREATOR = new Parcelable.Creator<UncompletedMoveInOrder>() { // from class: com.miui.tsmclient.entity.UncompletedBusiness.UncompletedMoveInOrder.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public UncompletedMoveInOrder createFromParcel(Parcel parcel) {
                return new UncompletedMoveInOrder(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public UncompletedMoveInOrder[] newArray(int i) {
                return new UncompletedMoveInOrder[i];
            }
        };

        @SerializedName("tokens")
        public List<UncompletedActionToken> mActionTokens;

        @SerializedName("cardName")
        public String mCardType;

        @SerializedName("cityId")
        private String mCityId;

        @SerializedName("orderId")
        public String mOrderId;

        public static class UncompletedActionToken implements Parcelable {
            public static final Parcelable.Creator<UncompletedActionToken> CREATOR = new Parcelable.Creator<UncompletedActionToken>() { // from class: com.miui.tsmclient.entity.UncompletedBusiness.UncompletedMoveInOrder.UncompletedActionToken.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public UncompletedActionToken createFromParcel(Parcel parcel) {
                    return new UncompletedActionToken(parcel);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public UncompletedActionToken[] newArray(int i) {
                    return new UncompletedActionToken[i];
                }
            };

            @SerializedName("token")
            public String mToken;

            @SerializedName("type")
            public int mType;

            public UncompletedActionToken(Parcel parcel) {
                this.mToken = parcel.readString();
                this.mType = parcel.readInt();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.mToken);
                parcel.writeInt(this.mType);
            }
        }

        public UncompletedMoveInOrder(Parcel parcel) {
            this.mOrderId = parcel.readString();
            this.mCardType = parcel.readString();
            this.mCityId = parcel.readString();
            ArrayList arrayList = new ArrayList();
            this.mActionTokens = arrayList;
            parcel.readList(arrayList, UncompletedActionToken.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mOrderId);
            parcel.writeString(this.mCardType);
            parcel.writeString(this.mCityId);
            parcel.writeList(this.mActionTokens);
        }
    }

    public static class UncompletedMoveOutOrder implements Parcelable {
        public static final Parcelable.Creator<UncompletedMoveOutOrder> CREATOR = new Parcelable.Creator<UncompletedMoveOutOrder>() { // from class: com.miui.tsmclient.entity.UncompletedBusiness.UncompletedMoveOutOrder.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public UncompletedMoveOutOrder createFromParcel(Parcel parcel) {
                return new UncompletedMoveOutOrder(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public UncompletedMoveOutOrder[] newArray(int i) {
                return new UncompletedMoveOutOrder[i];
            }
        };

        @SerializedName("cardName")
        public String mCardType;

        @SerializedName("orderId")
        public String mOrderId;

        @SerializedName("source")
        public String mSource;

        @SerializedName("token")
        public String mToken;

        @SerializedName("typeCode")
        public String mTypeCode;

        public UncompletedMoveOutOrder(Parcel parcel) {
            this.mOrderId = parcel.readString();
            this.mCardType = parcel.readString();
            this.mToken = parcel.readString();
            this.mTypeCode = parcel.readString();
            this.mSource = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mOrderId);
            parcel.writeString(this.mCardType);
            parcel.writeString(this.mToken);
            parcel.writeString(this.mTypeCode);
            parcel.writeString(this.mSource);
        }
    }

    public UncompletedBusiness(Parcel parcel) {
        this.cardName = parcel.readString();
        this.aid = parcel.readString();
        this.businessSource = parcel.readString();
        this.businessStatus = parcel.readString();
        this.businessStatusDesc = parcel.readString();
        this.businessStatusOtherDesc = parcel.readString();
        this.updateTime = parcel.readLong();
        this.userIdMismatchDesc = parcel.readString();
        this.respDesc = parcel.readString();
        this.moveInOrderInfo = (UncompletedMoveInOrder) parcel.readParcelable(UncompletedMoveInOrder.class.getClassLoader());
        this.moveOutOrderInfo = (UncompletedMoveOutOrder) parcel.readParcelable(UncompletedMoveOutOrder.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAid() {
        return this.aid;
    }

    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public String getBusinessStatusDesc() {
        return this.businessStatusDesc;
    }

    public String getBusinessStatusOtherDesc() {
        return this.businessStatusOtherDesc;
    }

    public String getCardName() {
        return this.cardName;
    }

    public OrderInfo getOrderInfo() {
        UncompletedMoveInOrder uncompletedMoveInOrder = this.moveInOrderInfo;
        if (uncompletedMoveInOrder == null || uncompletedMoveInOrder.mActionTokens == null) {
            return null;
        }
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.mOrderStatus = OrderInfo.OrderStatus.paid;
        UncompletedMoveInOrder uncompletedMoveInOrder2 = this.moveInOrderInfo;
        orderInfo.mOrderId = uncompletedMoveInOrder2.mOrderId;
        orderInfo.mCardType = uncompletedMoveInOrder2.mCardType;
        orderInfo.mCityId = uncompletedMoveInOrder2.mCityId;
        orderInfo.mActionTokens = new ArrayList();
        for (UncompletedMoveInOrder.UncompletedActionToken uncompletedActionToken : this.moveInOrderInfo.mActionTokens) {
            ActionToken actionToken = new ActionToken();
            actionToken.mToken = uncompletedActionToken.mToken;
            actionToken.mType = ActionToken.TokenType.newInstance(uncompletedActionToken.mType);
            orderInfo.mActionTokens.add(actionToken);
        }
        return orderInfo;
    }

    public String getRechargeToken() {
        OrderInfo orderInfo = getOrderInfo();
        if (orderInfo == null) {
            return null;
        }
        for (ActionToken actionToken : orderInfo.mActionTokens) {
            if (actionToken.isRechargeType()) {
                return actionToken.mToken;
            }
        }
        return null;
    }

    public String getRespDesc() {
        return this.respDesc;
    }

    public String getReturnSource() {
        return this.moveOutOrderInfo.mSource;
    }

    public String getToken() {
        OrderInfo orderInfo = getOrderInfo();
        if (orderInfo != null) {
            for (ActionToken actionToken : orderInfo.mActionTokens) {
                if (!actionToken.isRechargeType()) {
                    return actionToken.mToken;
                }
            }
        }
        TransferOutOrderInfo transferOutOrderInfo = getTransferOutOrderInfo();
        if (transferOutOrderInfo != null) {
            return transferOutOrderInfo.getTransferOutToken();
        }
        return null;
    }

    public TransferOutOrderInfo getTransferOutOrderInfo() {
        if (this.moveOutOrderInfo == null) {
            return null;
        }
        TransferOutOrderInfo transferOutOrderInfo = new TransferOutOrderInfo();
        transferOutOrderInfo.setOrderId(this.moveOutOrderInfo.mOrderId);
        transferOutOrderInfo.setCardType(this.moveOutOrderInfo.mCardType);
        transferOutOrderInfo.setTransferOutToken(this.moveOutOrderInfo.mToken);
        transferOutOrderInfo.setOrderType(this.moveOutOrderInfo.mTypeCode);
        return transferOutOrderInfo;
    }

    public int getType() {
        String str = this.businessStatus;
        str.hashCode();
        switch (str) {
            case "TRANSFER_OUT_ING":
                return 4;
            case "OUT_RETURN":
            case "IN_RETURN":
                return 3;
            case "TRANSFER_IN_ING":
                return 2;
            case "IN_ISSUE":
                return 1;
            default:
                return 0;
        }
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public String getUserIdMismatchDesc() {
        return this.userIdMismatchDesc;
    }

    public boolean isInWalletBusiness() {
        return "IN_WALLET".equals(this.businessSource);
    }

    public boolean isIssueOrTransferIn() {
        return this.moveInOrderInfo != null;
    }

    public boolean isRefundOrTransferOut() {
        return this.moveOutOrderInfo != null;
    }

    public boolean isReturn() {
        UncompletedMoveOutOrder uncompletedMoveOutOrder = this.moveOutOrderInfo;
        return uncompletedMoveOutOrder != null && "RETURN".equals(uncompletedMoveOutOrder.mTypeCode);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardName);
        parcel.writeString(this.aid);
        parcel.writeString(this.businessSource);
        parcel.writeString(this.businessStatus);
        parcel.writeString(this.businessStatusDesc);
        parcel.writeString(this.businessStatusOtherDesc);
        parcel.writeLong(this.updateTime);
        parcel.writeString(this.userIdMismatchDesc);
        parcel.writeString(this.respDesc);
        parcel.writeParcelable(this.moveInOrderInfo, i);
        parcel.writeParcelable(this.moveOutOrderInfo, i);
    }
}
