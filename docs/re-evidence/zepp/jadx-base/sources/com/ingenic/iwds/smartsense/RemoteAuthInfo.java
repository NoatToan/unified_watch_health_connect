package com.ingenic.iwds.smartsense;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.utils.IwdsAssert;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteAuthInfo implements Parcelable {
    public static final Parcelable.Creator<RemoteAuthInfo> CREATOR = new Parcelable.Creator<RemoteAuthInfo>() { // from class: com.ingenic.iwds.smartsense.RemoteAuthInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteAuthInfo createFromParcel(Parcel parcel) {
            RemoteAuthInfo remoteAuthInfo = new RemoteAuthInfo(parcel.readString());
            remoteAuthInfo.model = parcel.readString();
            remoteAuthInfo.manufacture = parcel.readString();
            remoteAuthInfo.serialNo = parcel.readString();
            return remoteAuthInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteAuthInfo[] newArray(int i) {
            return new RemoteAuthInfo[i];
        }
    };
    public String manufacture;
    public String model;
    public String packageName;
    public String serialNo;

    public RemoteAuthInfo(String str, String str2, String str3, String str4) {
        IwdsAssert.dieIf(this, str == null, "Device model is null");
        IwdsAssert.dieIf(this, str2 == null, "Device manufacture is null");
        IwdsAssert.dieIf(this, str3 == null, "Device seril number is null");
        IwdsAssert.dieIf(this, str4 == null, "Application package name is null");
        this.model = str;
        this.manufacture = str2;
        this.serialNo = str3;
        this.packageName = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RemoteAuthInfo)) {
            return false;
        }
        RemoteAuthInfo remoteAuthInfo = (RemoteAuthInfo) obj;
        String str = this.packageName;
        if (str == null) {
            if (remoteAuthInfo.packageName != null) {
                return false;
            }
        } else if (!str.equals(remoteAuthInfo.packageName)) {
            return false;
        }
        String str2 = this.model;
        if (str2 == null) {
            if (remoteAuthInfo.model != null) {
                return false;
            }
        } else if (!str2.equals(remoteAuthInfo.model)) {
            return false;
        }
        String str3 = this.manufacture;
        if (str3 == null) {
            if (remoteAuthInfo.manufacture != null) {
                return false;
            }
        } else if (!str3.equals(remoteAuthInfo.manufacture)) {
            return false;
        }
        String str4 = this.serialNo;
        if (str4 == null) {
            if (remoteAuthInfo.serialNo != null) {
                return false;
            }
        } else if (!str4.equals(remoteAuthInfo.serialNo)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.manufacture;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.model;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serialNo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.packageName;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "RemoteDeivceAuthInfo [model=" + this.model + ", manufacture=" + this.manufacture + ", serialNo=" + this.serialNo + ", packageName=" + this.packageName + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.packageName);
        parcel.writeString(this.model);
        parcel.writeString(this.manufacture);
        parcel.writeString(this.serialNo);
    }

    public RemoteAuthInfo(String str) {
        IwdsAssert.dieIf(this, str == null, "Application package name is null");
        this.model = Build.MODEL;
        this.manufacture = Build.MANUFACTURER;
        this.serialNo = Build.SERIAL;
        this.packageName = str;
    }
}
