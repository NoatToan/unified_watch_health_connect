package com.unionpay.tsmservice.result;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class OpenChannelResult implements Parcelable {
    public static final Parcelable.Creator<OpenChannelResult> CREATOR = new a();
    private String a;
    private String b;

    public static class a implements Parcelable.Creator<OpenChannelResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OpenChannelResult createFromParcel(Parcel parcel) {
            return new OpenChannelResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OpenChannelResult[] newArray(int i) {
            return new OpenChannelResult[i];
        }
    }

    public OpenChannelResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getChannel() {
        return this.b;
    }

    public String getOutHexApdu() {
        return this.a;
    }

    public void setChannel(String str) {
        this.b = str;
    }

    public void setOutHexApdu(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public OpenChannelResult(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
