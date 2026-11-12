package com.xiaomi.digitalkey.ccc.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class DigitalKeyData implements Parcelable {
    public static final Parcelable.Creator<DigitalKeyData> CREATOR = new Parcelable.Creator<DigitalKeyData>() { // from class: com.xiaomi.digitalkey.ccc.api.DigitalKeyData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DigitalKeyData createFromParcel(Parcel parcel) {
            return new DigitalKeyData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DigitalKeyData[] newArray(int i) {
            return new DigitalKeyData[i];
        }
    };
    public static final String STATUS_ACTIVE = "dk_active";
    public static final String STATUS_BEFORE_CREATE = "dk_before_create";
    public static final String STATUS_INACTIVE_TRACKED = "dk_inactive_tracked";
    public static final String STATUS_SUSPENDED = "dk_suspend";
    public static final String STATUS_TERMINATED = "dk_terminated";
    public static final String STATUS_UNTRACKED = "dk_untracked";
    DigitalKeyAccessProfile mDKAccessProfile;
    String mFriendlyName;
    String mKeyCardArtUrl;
    String mKeyId;
    String mKeyType;
    String mNotAfter;
    String mNotBefore;
    String[] mSharedDigitalKeyIds;
    String mStatus;
    String mSuspendReason;
    String mUAPolicy;
    String mVehicleBrand;
    String mVehicleBrandId;
    String mVehicleId;
    String mVehicleModel;
    String mVehicleOemId;

    public DigitalKeyData() {
    }

    public DigitalKeyData(Parcel parcel) {
        this.mStatus = parcel.readString();
        this.mKeyId = parcel.readString();
        this.mFriendlyName = parcel.readString();
        this.mKeyType = parcel.readString();
        this.mNotBefore = parcel.readString();
        this.mNotAfter = parcel.readString();
        this.mVehicleId = parcel.readString();
        this.mUAPolicy = parcel.readString();
        this.mSharedDigitalKeyIds = parcel.createStringArray();
        this.mVehicleOemId = parcel.readString();
        this.mVehicleBrandId = parcel.readString();
        this.mSuspendReason = parcel.readString();
        this.mKeyCardArtUrl = parcel.readString();
        this.mVehicleBrand = parcel.readString();
        this.mVehicleModel = parcel.readString();
        this.mDKAccessProfile = (DigitalKeyAccessProfile) parcel.readParcelable(DigitalKeyAccessProfile.class.getClassLoader());
    }

    public String Date2String(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DigitalKeyAccessProfile getAccessProfile() {
        return this.mDKAccessProfile;
    }

    public String getDigitalKeyId() {
        return this.mKeyId;
    }

    public String getFriendlyName() {
        return this.mFriendlyName;
    }

    public String getKeyCardArtUrl() {
        return this.mKeyCardArtUrl;
    }

    public String getKeyType() {
        return this.mKeyType;
    }

    public String getNotAfterTime() {
        return this.mNotAfter;
    }

    public String getNotBeforeTime() {
        return this.mNotBefore;
    }

    public String[] getSharedDigitalKeyIds() {
        return this.mSharedDigitalKeyIds;
    }

    public String getStatus() {
        return this.mStatus;
    }

    public String getSuspendReason() {
        return this.mSuspendReason;
    }

    public String getUserAuthenticationPolicy() {
        return this.mUAPolicy;
    }

    public String getVehicleBrand() {
        return this.mVehicleBrand;
    }

    public String getVehicleBrandId() {
        return this.mVehicleBrandId;
    }

    public String getVehicleId() {
        return this.mVehicleId;
    }

    public String getVehicleModel() {
        return this.mVehicleModel;
    }

    public String getVehicleOemId() {
        return this.mVehicleOemId;
    }

    public void setAccessProfile(DigitalKeyAccessProfile digitalKeyAccessProfile) {
        this.mDKAccessProfile = digitalKeyAccessProfile;
    }

    public void setDigitalKeyId(String str) {
        if (str != null) {
            this.mKeyId = str.toUpperCase();
        }
    }

    public void setFriendlyName(String str) {
        this.mFriendlyName = str;
    }

    public void setKeyCardArtUrl(String str) {
        this.mKeyCardArtUrl = str;
    }

    public void setKeyType(String str) {
        this.mKeyType = str;
    }

    public void setNotAfterTime(Date date) {
        this.mNotAfter = Date2String(date);
    }

    public void setNotBeforeTime(Date date) {
        this.mNotBefore = Date2String(date);
        StringBuilder sb = new StringBuilder();
        sb.append("mNotBefore is: ");
        sb.append(this.mNotBefore);
    }

    public void setSharedDigitalKeyIds(String[] strArr) {
        this.mSharedDigitalKeyIds = strArr;
    }

    public void setStatus(String str) {
        this.mStatus = str;
    }

    public void setSuspendReason(String str) {
        this.mSuspendReason = str;
    }

    public void setUserAuthenticationPolicy(String str) {
        this.mUAPolicy = str;
    }

    public void setVehicleBrand(String str) {
        this.mVehicleBrand = str;
    }

    public void setVehicleBrandId(String str) {
        this.mVehicleBrandId = str;
    }

    public void setVehicleId(String str) {
        if (str != null) {
            this.mVehicleId = str.toUpperCase();
        }
    }

    public void setVehicleModel(String str) {
        this.mVehicleModel = str;
    }

    public void setVehicleOemId(String str) {
        this.mVehicleOemId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mStatus);
        parcel.writeString(this.mKeyId);
        parcel.writeString(this.mFriendlyName);
        parcel.writeString(this.mKeyType);
        parcel.writeString(this.mNotBefore);
        parcel.writeString(this.mNotAfter);
        parcel.writeString(this.mVehicleId);
        parcel.writeString(this.mUAPolicy);
        parcel.writeStringArray(this.mSharedDigitalKeyIds);
        parcel.writeString(this.mVehicleOemId);
        parcel.writeString(this.mVehicleBrandId);
        parcel.writeString(this.mSuspendReason);
        parcel.writeString(this.mKeyCardArtUrl);
        parcel.writeString(this.mVehicleBrand);
        parcel.writeString(this.mVehicleModel);
        parcel.writeParcelable(this.mDKAccessProfile, i);
    }
}
