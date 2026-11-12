package com.xiaomi.phonenum.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class PlainPhoneNumber implements Parcelable {
    public static final Parcelable.Creator<PlainPhoneNumber> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14015b;

    public class a implements Parcelable.Creator<PlainPhoneNumber> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlainPhoneNumber createFromParcel(Parcel parcel) {
            return new PlainPhoneNumber(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlainPhoneNumber[] newArray(int i) {
            return new PlainPhoneNumber[i];
        }
    }

    public PlainPhoneNumber(Parcel parcel) {
        this.f14014a = parcel.readInt();
        this.f14015b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14014a);
        parcel.writeString(this.f14015b);
    }
}
