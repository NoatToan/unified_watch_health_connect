package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class TransRecord implements Parcelable {
    public static final Parcelable.Creator<TransRecord> CREATOR = new a();
    private String a;
    private String b;
    private String c;
    private String d;

    public static class a implements Parcelable.Creator<TransRecord> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransRecord createFromParcel(Parcel parcel) {
            return new TransRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TransRecord[] newArray(int i) {
            return new TransRecord[i];
        }
    }

    public TransRecord() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getMerchantName() {
        return this.b;
    }

    public String getTransAmount() {
        return this.d;
    }

    public String getTransTime() {
        return this.a;
    }

    public String getTransType() {
        return this.c;
    }

    public void setMerchantName(String str) {
        this.b = str;
    }

    public void setTransAmount(String str) {
        this.d = str;
    }

    public void setTransTime(String str) {
        this.a = str;
    }

    public void setTransType(String str) {
        this.c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public TransRecord(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
