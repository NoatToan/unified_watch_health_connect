package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class ErrorInfo implements Parcelable {
    public static final Parcelable.Creator<ErrorInfo> CREATOR = new Parcelable.Creator<ErrorInfo>() { // from class: com.miui.tsmclient.entity.ErrorInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ErrorInfo createFromParcel(Parcel parcel) {
            return new ErrorInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ErrorInfo[] newArray(int i) {
            return new ErrorInfo[i];
        }
    };
    private static final String DIALOGS = "DIALOGS";
    private static final String REDIRECT = "REDIRECT";
    private static final String TOAST = "TOAST";

    @SerializedName("button")
    private String mButton;

    @SerializedName("msg")
    private String mMsg;

    @SerializedName("redirectURL")
    private String mRedirectURL;

    @SerializedName("type")
    private String mType;

    public ErrorInfo(Parcel parcel) {
        this.mMsg = parcel.readString();
        this.mType = parcel.readString();
        this.mRedirectURL = parcel.readString();
        this.mButton = parcel.readString();
    }

    public static ErrorInfo fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (ErrorInfo) new Gson().fromJson(str, ErrorInfo.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getButton() {
        return this.mButton;
    }

    public String getMsg() {
        return this.mMsg;
    }

    public String getRedirectURL() {
        return this.mRedirectURL;
    }

    public String getType() {
        return this.mType;
    }

    public boolean isDialog() {
        return DIALOGS.equals(this.mType);
    }

    public boolean isRedirect() {
        return REDIRECT.equals(this.mType);
    }

    public boolean isToast() {
        return TOAST.equals(this.mType);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mMsg);
        parcel.writeString(this.mType);
        parcel.writeString(this.mRedirectURL);
        parcel.writeString(this.mButton);
    }
}
