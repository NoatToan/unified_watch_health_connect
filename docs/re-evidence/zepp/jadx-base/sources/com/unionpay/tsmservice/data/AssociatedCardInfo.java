package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class AssociatedCardInfo implements Parcelable {
    public static final Parcelable.Creator<AssociatedCardInfo> CREATOR = new a();
    private String a;
    private String b;

    public static class a implements Parcelable.Creator<AssociatedCardInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AssociatedCardInfo createFromParcel(Parcel parcel) {
            return new AssociatedCardInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AssociatedCardInfo[] newArray(int i) {
            return new AssociatedCardInfo[i];
        }
    }

    public AssociatedCardInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCardNo() {
        return this.b;
    }

    public String getCardType() {
        return this.a;
    }

    public void setCardNo(String str) {
        this.b = str;
    }

    public void setCardType(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public AssociatedCardInfo(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
