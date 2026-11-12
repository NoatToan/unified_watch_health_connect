package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclientsdk.MiTsmConstants;

/* JADX INFO: loaded from: classes6.dex */
public class ServiceWhitelist implements Parcelable {
    public static final Parcelable.Creator<ServiceWhitelist> CREATOR = new Parcelable.Creator<ServiceWhitelist>() { // from class: com.miui.tsmclient.entity.ServiceWhitelist.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ServiceWhitelist createFromParcel(Parcel parcel) {
            return new ServiceWhitelist(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ServiceWhitelist[] newArray(int i) {
            return new ServiceWhitelist[i];
        }
    };

    @SerializedName("packageName")
    private String mPackageName;

    @SerializedName(MiTsmConstants.KEY_SIGNATURE)
    private String mSignature;

    public ServiceWhitelist(Parcel parcel) {
        this.mPackageName = parcel.readString();
        this.mSignature = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getSignature() {
        return this.mSignature;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPackageName);
        parcel.writeString(this.mSignature);
    }
}
