package com.garmin.device.nfc;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50863b;

    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(Parcel parcel) {
        this.f50862a = parcel.readLong();
        this.f50863b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f50862a);
        parcel.writeString(this.f50863b);
    }

    public e() {
        this.f50862a = -1L;
    }

    public e(long j8, String str) {
        this.f50862a = j8;
        this.f50863b = str;
    }
}
