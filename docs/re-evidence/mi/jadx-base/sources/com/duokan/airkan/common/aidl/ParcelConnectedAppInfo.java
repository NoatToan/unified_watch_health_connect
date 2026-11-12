package com.duokan.airkan.common.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class ParcelConnectedAppInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelConnectedAppInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7032b;

    public class a implements Parcelable.Creator<ParcelConnectedAppInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelConnectedAppInfo createFromParcel(Parcel parcel) {
            return new ParcelConnectedAppInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelConnectedAppInfo[] newArray(int i) {
            return new ParcelConnectedAppInfo[i];
        }
    }

    public /* synthetic */ ParcelConnectedAppInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    public void a(Parcel parcel) {
        this.f7031a = parcel.readString();
        this.f7032b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7031a);
        parcel.writeInt(this.f7032b);
    }

    public ParcelConnectedAppInfo() {
    }

    public ParcelConnectedAppInfo(Parcel parcel) {
        a(parcel);
    }
}
