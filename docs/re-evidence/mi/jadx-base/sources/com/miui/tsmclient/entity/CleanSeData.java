package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class CleanSeData implements Parcelable {
    public static final Parcelable.Creator<CleanSeData> CREATOR = new Parcelable.Creator<CleanSeData>() { // from class: com.miui.tsmclient.entity.CleanSeData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CleanSeData createFromParcel(Parcel parcel) {
            return new CleanSeData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CleanSeData[] newArray(int i) {
            return new CleanSeData[i];
        }
    };
    private CardInfo mCardInfo;
    private CleanSeStatus mCleanSeStatus;
    private String mMsg;

    public enum CleanSeStatus {
        SUCCESS,
        FAIL,
        PROCESSING
    }

    public CleanSeData(CardInfo cardInfo, String str) {
        this.mCardInfo = cardInfo;
        this.mMsg = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CardInfo getCardInfo() {
        return this.mCardInfo;
    }

    public CleanSeStatus getCleanSeStatus() {
        return this.mCleanSeStatus;
    }

    public String getMsg() {
        return this.mMsg;
    }

    public boolean isFail() {
        return getCleanSeStatus() != CleanSeStatus.SUCCESS;
    }

    public boolean isSuccess() {
        return getCleanSeStatus() == CleanSeStatus.SUCCESS;
    }

    public void setCardInfo(CardInfo cardInfo) {
        this.mCardInfo = cardInfo;
    }

    public void setCleanSeStatus(CleanSeStatus cleanSeStatus) {
        this.mCleanSeStatus = cleanSeStatus;
    }

    public void setMsg(String str) {
        this.mMsg = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mCardInfo, i);
        parcel.writeString(this.mMsg);
        parcel.writeValue(this.mCleanSeStatus);
    }

    public CleanSeData(Parcel parcel) {
        this.mCardInfo = (CardInfo) parcel.readParcelable(CardInfo.class.getClassLoader());
        this.mMsg = parcel.readString();
        this.mCleanSeStatus = (CleanSeStatus) parcel.readValue(CleanSeStatus.class.getClassLoader());
    }
}
