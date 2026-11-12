package com.xiaomi.continuity.channel;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class ConfirmInfo implements Parcelable {
    public static final Parcelable.Creator<ConfirmInfo> CREATOR = new a();
    private String mAppPackage;
    private String mAppSignature;
    private String mComparisonNumber;
    private int mDevicePlatformType;
    private int mMediumType;
    private int mTrustLevel;

    public class a implements Parcelable.Creator<ConfirmInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConfirmInfo createFromParcel(Parcel parcel) {
            return new ConfirmInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ConfirmInfo[] newArray(int i) {
            return new ConfirmInfo[i];
        }
    }

    public ConfirmInfo() {
    }

    public ConfirmInfo(int i, String str, String str2, String str3, int i2, int i3) {
        this.mTrustLevel = i;
        this.mComparisonNumber = str;
        this.mAppPackage = str2;
        this.mAppSignature = str3;
        this.mDevicePlatformType = i2;
        this.mMediumType = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppPackage() {
        return this.mAppPackage;
    }

    public String getAppSignature() {
        return this.mAppSignature;
    }

    public String getComparisonNumber() {
        return this.mComparisonNumber;
    }

    public int getDevicePlatformType() {
        return this.mDevicePlatformType;
    }

    public int getMediumType() {
        return this.mMediumType;
    }

    public int getTrustLevel() {
        return this.mTrustLevel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mTrustLevel);
        parcel.writeString(this.mComparisonNumber);
        parcel.writeString(this.mAppPackage);
        parcel.writeString(this.mAppSignature);
        parcel.writeInt(this.mDevicePlatformType);
        parcel.writeInt(this.mMediumType);
    }

    public ConfirmInfo(Parcel parcel) {
        this.mTrustLevel = parcel.readInt();
        this.mComparisonNumber = parcel.readString();
        this.mAppPackage = parcel.readString();
        this.mAppSignature = parcel.readString();
        this.mDevicePlatformType = parcel.readInt();
        this.mMediumType = parcel.readInt();
    }
}
