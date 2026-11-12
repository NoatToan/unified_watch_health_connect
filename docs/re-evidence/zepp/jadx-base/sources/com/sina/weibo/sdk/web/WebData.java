package com.sina.weibo.sdk.web;

import android.os.Parcel;
import android.os.Parcelable;
import com.sina.weibo.sdk.auth.AuthInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class WebData implements Parcelable, Serializable {
    public static final Parcelable.Creator<WebData> CREATOR = new Parcelable.Creator<WebData>() { // from class: com.sina.weibo.sdk.web.WebData.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WebData createFromParcel(Parcel parcel) {
            return new WebData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WebData[] newArray(int i) {
            return new WebData[i];
        }
    };
    private static final long serialVersionUID = -4038177938155795889L;
    public AuthInfo at;
    public String au;
    public String i;
    public int type;

    public WebData(AuthInfo authInfo, int i, String str, String str2) {
        this.at = authInfo;
        this.type = i;
        this.i = str;
        this.au = str2;
    }

    public final AuthInfo b() {
        return this.at;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.i;
    }

    public final String v() {
        return this.au;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.at, i);
        parcel.writeInt(this.type);
        parcel.writeString(this.i);
        parcel.writeString(this.au);
    }

    public WebData(Parcel parcel) {
        this.at = (AuthInfo) parcel.readParcelable(AuthInfo.class.getClassLoader());
        this.type = parcel.readInt();
        this.i = parcel.readString();
        this.au = parcel.readString();
    }
}
