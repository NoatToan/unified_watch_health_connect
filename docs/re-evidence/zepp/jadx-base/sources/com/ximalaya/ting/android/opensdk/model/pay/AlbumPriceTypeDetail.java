package com.ximalaya.ting.android.opensdk.model.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes22.dex */
public class AlbumPriceTypeDetail implements Parcelable {
    public static final Parcelable.Creator<AlbumPriceTypeDetail> CREATOR = new Parcelable.Creator<AlbumPriceTypeDetail>() { // from class: com.ximalaya.ting.android.opensdk.model.pay.AlbumPriceTypeDetail.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlbumPriceTypeDetail createFromParcel(Parcel parcel) {
            return new AlbumPriceTypeDetail(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlbumPriceTypeDetail[] newArray(int i) {
            return new AlbumPriceTypeDetail[i];
        }
    };

    @SerializedName("discounted_price")
    private double discountedPrice;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private double price;

    @SerializedName("price_type")
    private int priceType;

    @SerializedName("price_unit")
    private String priceUnit;

    public AlbumPriceTypeDetail(Parcel parcel) {
        this.priceType = parcel.readInt();
        this.price = parcel.readDouble();
        this.discountedPrice = parcel.readDouble();
        this.priceUnit = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getDiscountedPrice() {
        return this.discountedPrice;
    }

    public double getPrice() {
        return this.price;
    }

    public int getPriceType() {
        return this.priceType;
    }

    public String getPriceUnit() {
        return this.priceUnit;
    }

    public void setDiscountedPrice(double d) {
        this.discountedPrice = d;
    }

    public void setPrice(double d) {
        this.price = d;
    }

    public void setPriceType(int i) {
        this.priceType = i;
    }

    public void setPriceUnit(String str) {
        this.priceUnit = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.priceType);
        parcel.writeDouble(this.price);
        parcel.writeDouble(this.discountedPrice);
        parcel.writeString(this.priceUnit);
    }
}
