package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class RefundAuthorizationInfo implements Parcelable {
    public static final Parcelable.Creator<RefundAuthorizationInfo> CREATOR = new Parcelable.Creator<RefundAuthorizationInfo>() { // from class: com.miui.tsmclient.entity.RefundAuthorizationInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RefundAuthorizationInfo createFromParcel(Parcel parcel) {
            return new RefundAuthorizationInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RefundAuthorizationInfo[] newArray(int i) {
            return new RefundAuthorizationInfo[i];
        }
    };

    @SerializedName("authorizationInfo")
    private String mAuthorizationInfo;

    public RefundAuthorizationInfo(Parcel parcel) {
        this.mAuthorizationInfo = parcel.readString();
    }

    public static RefundAuthorizationInfo fromJson(String str) {
        return (RefundAuthorizationInfo) new Gson().fromJson(str, RefundAuthorizationInfo.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAuthorizationInfo() {
        return this.mAuthorizationInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAuthorizationInfo);
    }
}
