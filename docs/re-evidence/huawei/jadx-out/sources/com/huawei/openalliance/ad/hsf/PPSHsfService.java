package com.huawei.openalliance.ad.hsf;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class PPSHsfService implements Parcelable {
    public static final Parcelable.Creator<PPSHsfService> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder f18910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18911c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18909a);
        parcel.writeStrongBinder(this.f18910b);
        parcel.writeInt(this.f18911c);
    }

    static class a implements Parcelable.Creator<PPSHsfService> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PPSHsfService[] newArray(int i) {
            return new PPSHsfService[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PPSHsfService createFromParcel(Parcel parcel) {
            return new PPSHsfService(parcel.readString(), parcel.readStrongBinder(), parcel.readInt());
        }

        private a() {
        }
    }

    public IBinder b() {
        return this.f18910b;
    }

    public String a() {
        return this.f18909a;
    }

    public PPSHsfService(String str, IBinder iBinder, int i) {
        this.f18909a = str;
        this.f18910b = iBinder;
        this.f18911c = i;
    }
}
