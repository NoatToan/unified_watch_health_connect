package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.common.CommonConstants;

/* JADX INFO: loaded from: classes6.dex */
public class FmshUserInfo implements Parcelable {
    public static final Parcelable.Creator<FmshUserInfo> CREATOR = new Parcelable.Creator<FmshUserInfo>() { // from class: com.miui.tsmclient.entity.FmshUserInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FmshUserInfo createFromParcel(Parcel parcel) {
            FmshUserInfo fmshUserInfo = new FmshUserInfo();
            fmshUserInfo.mUserName = parcel.readString();
            fmshUserInfo.mPassword = parcel.readString();
            return fmshUserInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FmshUserInfo[] newArray(int i) {
            return new FmshUserInfo[i];
        }
    };

    @SerializedName("bizPass")
    private String mPassword;

    @SerializedName(CommonConstants.KEY_USER_NAME)
    private String mUserName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPassword() {
        return this.mPassword;
    }

    public String getUserName() {
        return this.mUserName;
    }

    public void setPassword(String str) {
        this.mPassword = str;
    }

    public void setUserName(String str) {
        this.mUserName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUserName);
        parcel.writeString(this.mPassword);
    }
}
