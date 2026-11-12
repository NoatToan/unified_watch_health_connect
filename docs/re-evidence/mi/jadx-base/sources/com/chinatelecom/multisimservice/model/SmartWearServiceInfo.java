package com.chinatelecom.multisimservice.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class SmartWearServiceInfo implements Parcelable {
    public static final Parcelable.Creator<SmartWearServiceInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7015b;

    public class a implements Parcelable.Creator<SmartWearServiceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SmartWearServiceInfo createFromParcel(Parcel parcel) {
            return new SmartWearServiceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SmartWearServiceInfo[] newArray(int i) {
            return new SmartWearServiceInfo[i];
        }
    }

    public SmartWearServiceInfo(Parcel parcel) {
        this.f7014a = parcel.readString();
        this.f7015b = parcel.readString();
    }

    public void a(String str) {
        this.f7014a = str;
    }

    public void c(String str) {
        this.f7015b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7014a);
        parcel.writeString(this.f7015b);
    }
}
