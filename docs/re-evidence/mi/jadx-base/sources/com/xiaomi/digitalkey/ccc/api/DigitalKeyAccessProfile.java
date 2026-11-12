package com.xiaomi.digitalkey.ccc.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class DigitalKeyAccessProfile implements Parcelable {
    public static final Parcelable.Creator<DigitalKeyAccessProfile> CREATOR = new Parcelable.Creator<DigitalKeyAccessProfile>() { // from class: com.xiaomi.digitalkey.ccc.api.DigitalKeyAccessProfile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DigitalKeyAccessProfile createFromParcel(Parcel parcel) {
            return new DigitalKeyAccessProfile(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DigitalKeyAccessProfile[] newArray(int i) {
            return new DigitalKeyAccessProfile[i];
        }
    };
    static final int STD_ACCESS_ONLY = 1;
    static final int STD_CAR_DELIVERY = 3;
    static final int STD_FULL = 0;
    static final int STD_RESTRICTED_ACCESS = 2;
    static final int STD_SERVICE = 5;
    static final int STD_VALET = 4;
    static final int TYPE_PROPRIETARY = 1;
    static final int TYPE_STANDARD = 0;
    int mProfileType;
    byte[] mPropAccessProfile;
    int mStandardAccessProfile;

    public DigitalKeyAccessProfile(int i) {
        this.mPropAccessProfile = new byte[16];
        this.mProfileType = 0;
        this.mStandardAccessProfile = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getProfileType() {
        return this.mProfileType;
    }

    public byte[] getProprietaryAccessProfile() {
        return this.mPropAccessProfile;
    }

    public int getStandardAccessProfile() {
        return this.mStandardAccessProfile;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mProfileType);
        parcel.writeInt(this.mStandardAccessProfile);
        parcel.writeByteArray(this.mPropAccessProfile);
    }

    public DigitalKeyAccessProfile(Parcel parcel) {
        this.mPropAccessProfile = new byte[16];
        this.mProfileType = parcel.readInt();
        this.mStandardAccessProfile = parcel.readInt();
        parcel.readByteArray(this.mPropAccessProfile);
    }

    public DigitalKeyAccessProfile(byte[] bArr) {
        this.mProfileType = 1;
        this.mPropAccessProfile = bArr;
    }
}
