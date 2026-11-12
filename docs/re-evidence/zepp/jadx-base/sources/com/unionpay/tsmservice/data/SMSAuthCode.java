package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class SMSAuthCode implements Parcelable {
    public static final Parcelable.Creator<SMSAuthCode> CREATOR = new a();
    private String a;

    public static class a implements Parcelable.Creator<SMSAuthCode> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SMSAuthCode createFromParcel(Parcel parcel) {
            return new SMSAuthCode(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SMSAuthCode[] newArray(int i) {
            return new SMSAuthCode[i];
        }
    }

    public SMSAuthCode() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getExpireNote() {
        return this.a;
    }

    public void setExpireNote(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public SMSAuthCode(Parcel parcel) {
        this.a = parcel.readString();
    }
}
