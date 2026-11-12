package com.xiaomi.continuity.channel;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h64;
import defpackage.mkh;

/* JADX INFO: loaded from: classes7.dex */
public class ConfirmInfoV2 implements Parcelable {
    public static final Parcelable.Creator<ConfirmInfoV2> CREATOR = new a();
    private static final int localVer = 1;
    private static final int verAddSystemData = 1;
    private String mAppPackage;
    private String mAppSignature;
    private String mComparisonNumber;
    private int mDevicePlatformType;
    private int mMediumType;
    private byte[] mSystemData;
    private int mTrustLevel;
    private String mUserData;

    public class a implements Parcelable.Creator<ConfirmInfoV2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConfirmInfoV2 createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            int iDataPosition = parcel.dataPosition();
            ConfirmInfoV2 confirmInfoV2 = new ConfirmInfoV2(parcel, parcel.readInt());
            parcel.setDataPosition(iDataPosition + i);
            return confirmInfoV2;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ConfirmInfoV2[] newArray(int i) {
            return new ConfirmInfoV2[i];
        }
    }

    public ConfirmInfoV2() {
    }

    public ConfirmInfoV2(int i, String str, String str2, String str3, int i2, int i3, String str4, byte[] bArr) {
        this.mTrustLevel = i;
        this.mComparisonNumber = str;
        this.mAppPackage = str2;
        this.mAppSignature = str3;
        this.mDevicePlatformType = i2;
        this.mMediumType = i3;
        this.mUserData = str4;
        this.mSystemData = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$writeToParcel$0(Parcel parcel, Parcel parcel2, int i) {
        parcel.writeInt(1);
        parcel.writeInt(this.mTrustLevel);
        parcel.writeString(this.mComparisonNumber);
        parcel.writeString(this.mAppPackage);
        parcel.writeString(this.mAppSignature);
        parcel.writeInt(this.mDevicePlatformType);
        parcel.writeInt(this.mMediumType);
        parcel.writeString(this.mUserData);
        parcel.writeByteArray(this.mSystemData);
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

    public String getUserData() {
        return this.mUserData;
    }

    public ConfirmInfo toConfirmInfo() {
        return new ConfirmInfo(this.mTrustLevel, this.mComparisonNumber, this.mAppPackage, this.mAppSignature, this.mDevicePlatformType, this.mMediumType);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(final Parcel parcel, int i) {
        mkh.a(parcel, i, new h64() { // from class: od4
            @Override // defpackage.h64
            public final void a(Parcel parcel2, int i2) {
                this.f29030a.lambda$writeToParcel$0(parcel, parcel2, i2);
            }
        });
    }

    public ConfirmInfoV2(Parcel parcel, int i) {
        this.mTrustLevel = parcel.readInt();
        this.mComparisonNumber = parcel.readString();
        this.mAppPackage = parcel.readString();
        this.mAppSignature = parcel.readString();
        this.mDevicePlatformType = parcel.readInt();
        this.mMediumType = parcel.readInt();
        this.mUserData = parcel.readString();
        if (i >= 1) {
            this.mSystemData = parcel.createByteArray();
        }
    }
}
