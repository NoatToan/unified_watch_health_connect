package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;

/* JADX INFO: loaded from: classes6.dex */
public class DoorCardGroupInfo extends CommonResponseInfo implements Parcelable {
    public static final Parcelable.Creator<DoorCardGroupInfo> CREATOR = new Parcelable.Creator<DoorCardGroupInfo>() { // from class: com.miui.tsmclient.entity.DoorCardGroupInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DoorCardGroupInfo createFromParcel(Parcel parcel) {
            return new DoorCardGroupInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DoorCardGroupInfo[] newArray(int i) {
            return new DoorCardGroupInfo[i];
        }
    };

    @SerializedName("actionUIText")
    private String mActionUIText;

    @SerializedName("cardType")
    private int mCardType;

    @SerializedName("code")
    private String mCode;

    @SerializedName("descrption")
    private String mDesc;

    @SerializedName(CardUIInfo.KEY_LOGO)
    private String mLogo;

    @SerializedName("title")
    private String mTitle;

    public DoorCardGroupInfo(Parcel parcel) {
        this.mCode = parcel.readString();
        this.mTitle = parcel.readString();
        this.mDesc = parcel.readString();
        this.mCardType = parcel.readInt();
        this.mLogo = parcel.readString();
        this.mActionUIText = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getActionUIText() {
        return this.mActionUIText;
    }

    public int getCardType() {
        return this.mCardType;
    }

    public String getCode() {
        return this.mCode;
    }

    public String getDesc() {
        return this.mDesc;
    }

    public DoorCardProduct getDoorCardProduct() {
        DoorCardProduct doorCardProduct = new DoorCardProduct();
        doorCardProduct.setCardType(this.mCardType);
        doorCardProduct.setProductName(this.mTitle);
        doorCardProduct.setProductDesc(this.mDesc);
        doorCardProduct.setLogo(this.mLogo);
        doorCardProduct.setActionUIText(this.mActionUIText);
        return doorCardProduct;
    }

    public String getLogo() {
        return this.mLogo;
    }

    public String getTitle() {
        return this.mTitle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCode);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mDesc);
        parcel.writeInt(this.mCardType);
        parcel.writeString(this.mLogo);
        parcel.writeString(this.mActionUIText);
    }
}
