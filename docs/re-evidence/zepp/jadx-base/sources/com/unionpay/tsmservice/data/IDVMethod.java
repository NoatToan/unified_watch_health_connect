package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class IDVMethod implements Parcelable {
    public static final Parcelable.Creator<IDVMethod> CREATOR = new a();
    private String a;

    public static class a implements Parcelable.Creator<IDVMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IDVMethod createFromParcel(Parcel parcel) {
            return new IDVMethod(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IDVMethod[] newArray(int i) {
            return new IDVMethod[i];
        }
    }

    public IDVMethod(Parcel parcel) {
        this.a = "";
        this.a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getActiveType() {
        return this.a;
    }

    public void setActiveType(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public IDVMethod(String str) {
        this.a = "";
        this.a = str;
    }
}
