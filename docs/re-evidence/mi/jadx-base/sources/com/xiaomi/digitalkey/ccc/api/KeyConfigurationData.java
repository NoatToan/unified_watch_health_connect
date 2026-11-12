package com.xiaomi.digitalkey.ccc.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDateTime;

/* JADX INFO: loaded from: classes7.dex */
public class KeyConfigurationData implements Parcelable {
    public static final Parcelable.Creator<KeyConfigurationData> CREATOR = new Parcelable.Creator<KeyConfigurationData>() { // from class: com.xiaomi.digitalkey.ccc.api.KeyConfigurationData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public KeyConfigurationData createFromParcel(Parcel parcel) {
            return new KeyConfigurationData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public KeyConfigurationData[] newArray(int i) {
            return new KeyConfigurationData[i];
        }
    };
    DigitalKeyAccessProfile mDKAccessProfile;
    String mFriendlyName;
    LocalDateTime mNotAfter;
    LocalDateTime mNotBefore;

    public static class Builder {
        private DigitalKeyAccessProfile mDKAccessProfile = new DigitalKeyAccessProfile(0);
        private String mFriendlyName;
        private LocalDateTime mNotAfterTime;
        private LocalDateTime mNotBeforeTime;

        public KeyConfigurationData build() {
            KeyConfigurationData keyConfigurationData = new KeyConfigurationData();
            keyConfigurationData.mDKAccessProfile = this.mDKAccessProfile;
            keyConfigurationData.mFriendlyName = this.mFriendlyName;
            keyConfigurationData.mNotAfter = this.mNotAfterTime;
            keyConfigurationData.mNotBefore = this.mNotBeforeTime;
            return keyConfigurationData;
        }

        public Builder setAccessProfile(int i) {
            this.mDKAccessProfile = new DigitalKeyAccessProfile(i);
            return this;
        }

        public Builder setFriendlyName(String str) {
            this.mFriendlyName = str;
            return this;
        }

        public Builder setNotAfterTime(LocalDateTime localDateTime) {
            this.mNotAfterTime = localDateTime;
            return this;
        }

        public Builder setNotBeforeTime(LocalDateTime localDateTime) {
            this.mNotBeforeTime = localDateTime;
            return this;
        }

        public Builder setAccessProfile(byte[] bArr) {
            this.mDKAccessProfile = new DigitalKeyAccessProfile(bArr);
            return this;
        }
    }

    private KeyConfigurationData() {
    }

    public KeyConfigurationData(Parcel parcel) {
        this.mDKAccessProfile = (DigitalKeyAccessProfile) parcel.readParcelable(DigitalKeyAccessProfile.class.getClassLoader());
        this.mFriendlyName = parcel.readString();
        this.mNotAfter = (LocalDateTime) parcel.readSerializable();
        this.mNotBefore = (LocalDateTime) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DigitalKeyAccessProfile getAccessProfile() {
        return this.mDKAccessProfile;
    }

    public String getFriendlyName() {
        return this.mFriendlyName;
    }

    public LocalDateTime getNotAfterTime() {
        return this.mNotAfter;
    }

    public LocalDateTime getNotBeforeTime() {
        return this.mNotBefore;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mDKAccessProfile, i);
        parcel.writeString(this.mFriendlyName);
        parcel.writeSerializable(this.mNotAfter);
        parcel.writeSerializable(this.mNotBefore);
    }
}
