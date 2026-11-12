package com.duokan.airkan.common.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class ParcelService implements Parcelable {
    public static final Parcelable.Creator<ParcelService> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7038b;
    public int c;
    public String[] d;
    public String e;
    public String f;

    public class a implements Parcelable.Creator<ParcelService> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelService createFromParcel(Parcel parcel) {
            return new ParcelService(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelService[] newArray(int i) {
            return new ParcelService[i];
        }
    }

    public /* synthetic */ ParcelService(Parcel parcel, a aVar) {
        this(parcel);
    }

    public final void a(Parcel parcel) {
        this.f7037a = parcel.readString();
        this.f7038b = parcel.readString();
        this.c = parcel.readInt();
        this.e = parcel.readString();
        String[] strArr = new String[parcel.readInt()];
        this.d = strArr;
        parcel.readStringArray(strArr);
        this.f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7037a);
        parcel.writeString(this.f7038b);
        parcel.writeInt(this.c);
        parcel.writeString(this.e);
        parcel.writeInt(this.d.length);
        parcel.writeStringArray(this.d);
        parcel.writeString(this.f);
    }

    public ParcelService() {
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public ParcelService(Parcel parcel) {
        this.d = null;
        this.e = null;
        this.f = null;
        a(parcel);
    }
}
