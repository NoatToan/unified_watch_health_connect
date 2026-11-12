package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class AssociatedCardBalance implements Parcelable {
    public static final Parcelable.Creator<AssociatedCardBalance> CREATOR = new a();
    private String a;

    public static class a implements Parcelable.Creator<AssociatedCardBalance> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AssociatedCardBalance createFromParcel(Parcel parcel) {
            return new AssociatedCardBalance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AssociatedCardBalance[] newArray(int i) {
            return new AssociatedCardBalance[i];
        }
    }

    public AssociatedCardBalance() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBalance() {
        return this.a;
    }

    public void setBalance(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public AssociatedCardBalance(Parcel parcel) {
        this.a = parcel.readString();
    }
}
