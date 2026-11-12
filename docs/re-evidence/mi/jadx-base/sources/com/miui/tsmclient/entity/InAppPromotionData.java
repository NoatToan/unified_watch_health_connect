package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class InAppPromotionData implements Parcelable {
    public static final Parcelable.Creator<InAppPromotionData> CREATOR = new Parcelable.Creator<InAppPromotionData>() { // from class: com.miui.tsmclient.entity.InAppPromotionData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InAppPromotionData createFromParcel(Parcel parcel) {
            return new InAppPromotionData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InAppPromotionData[] newArray(int i) {
            return new InAppPromotionData[i];
        }
    };
    private static final String PROMOTION_AVAILABLE = "0";
    private static final String PROMOTION_NOT_AVAILABLE = "-1";

    @SerializedName("discount_value")
    private long mPromotionAmount;

    @SerializedName("available")
    private String mPromotionAvailable;

    @SerializedName("value")
    private String mPromotionId;

    @SerializedName("label")
    private String mPromotionTitle;

    @SerializedName("rel_value")
    private long mRealPayAmount;

    public InAppPromotionData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getPromotionAmount() {
        return this.mPromotionAmount;
    }

    public String getPromotionId() {
        return this.mPromotionId;
    }

    public String getPromotionTitle() {
        return this.mPromotionTitle;
    }

    public long getRealPayAmount() {
        return this.mRealPayAmount;
    }

    public boolean isPromotionAvailable() {
        return TextUtils.equals(this.mPromotionAvailable, "0");
    }

    public void setPromotionAmount(long j) {
        this.mPromotionAmount = j;
    }

    public void setPromotionAvailable(boolean z) {
        this.mPromotionAvailable = z ? "0" : "-1";
    }

    public void setPromotionId(String str) {
        this.mPromotionId = str;
    }

    public void setPromotionTitle(String str) {
        this.mPromotionTitle = str;
    }

    public void setRealPayAmount(long j) {
        this.mRealPayAmount = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPromotionTitle);
        parcel.writeString(this.mPromotionId);
        parcel.writeString(this.mPromotionAvailable);
        parcel.writeLong(this.mRealPayAmount);
        parcel.writeLong(this.mPromotionAmount);
    }

    public InAppPromotionData(Parcel parcel) {
        this.mPromotionTitle = parcel.readString();
        this.mPromotionId = parcel.readString();
        this.mPromotionAvailable = parcel.readString();
        this.mRealPayAmount = parcel.readLong();
        this.mPromotionAmount = parcel.readLong();
    }
}
