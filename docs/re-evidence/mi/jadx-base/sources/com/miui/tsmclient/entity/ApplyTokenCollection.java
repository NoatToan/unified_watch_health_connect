package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ApplyTokenCollection implements Parcelable {
    public static final Parcelable.Creator<ApplyTokenCollection> CREATOR = new Parcelable.Creator<ApplyTokenCollection>() { // from class: com.miui.tsmclient.entity.ApplyTokenCollection.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApplyTokenCollection createFromParcel(Parcel parcel) {
            return new ApplyTokenCollection(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApplyTokenCollection[] newArray(int i) {
            return new ApplyTokenCollection[i];
        }
    };
    private boolean isEnhance;
    private String mEncryptedData;
    private List<String> mEncryptedDataList;
    private String mTRId;
    private String mTokenProdType;
    private String mUserId;

    public ApplyTokenCollection() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getEncryptedData() {
        return this.mEncryptedData;
    }

    public List<String> getEncryptedDataList() {
        return this.mEncryptedDataList;
    }

    public String getTRId() {
        return this.mTRId;
    }

    public String getTokenProdType() {
        return this.mTokenProdType;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public boolean isEnhance() {
        return this.isEnhance;
    }

    public void setEncryptedData(String str) {
        this.mEncryptedData = str;
    }

    public void setEncryptedDataList(List<String> list) {
        this.mEncryptedDataList = list;
    }

    public void setNeedEnhance(boolean z) {
        this.isEnhance = z;
    }

    public void setTRId(String str) {
        this.mTRId = str;
    }

    public void setTokenProdType(String str) {
        this.mTokenProdType = str;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isEnhance ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mEncryptedData);
        parcel.writeStringList(this.mEncryptedDataList);
        parcel.writeString(this.mTRId);
        parcel.writeString(this.mTokenProdType);
        parcel.writeString(this.mUserId);
    }

    public ApplyTokenCollection(Parcel parcel) {
        this.isEnhance = parcel.readByte() != 0;
        this.mEncryptedData = parcel.readString();
        this.mEncryptedDataList = parcel.createStringArrayList();
        this.mTRId = parcel.readString();
        this.mTokenProdType = parcel.readString();
        this.mUserId = parcel.readString();
    }
}
