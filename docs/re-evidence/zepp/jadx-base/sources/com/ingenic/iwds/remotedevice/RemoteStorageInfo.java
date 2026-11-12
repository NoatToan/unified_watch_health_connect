package com.ingenic.iwds.remotedevice;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteStorageInfo implements Parcelable {
    public static final Parcelable.Creator<RemoteStorageInfo> CREATOR = new a();
    public long availExternalSize;
    public long availInternalSize;
    public boolean hasExternalStorage;
    public long totalExternalSize;
    public long totalInternalSize;

    public static class a implements Parcelable.Creator<RemoteStorageInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteStorageInfo createFromParcel(Parcel parcel) {
            return new RemoteStorageInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoteStorageInfo[] newArray(int i) {
            return new RemoteStorageInfo[i];
        }
    }

    public /* synthetic */ RemoteStorageInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.availInternalSize);
        parcel.writeLong(this.totalInternalSize);
        parcel.writeInt(this.hasExternalStorage ? 1 : 0);
        parcel.writeLong(this.availExternalSize);
        parcel.writeLong(this.totalExternalSize);
    }

    public RemoteStorageInfo(long j, long j2, boolean z, long j3, long j4) {
        this.availInternalSize = j;
        this.totalInternalSize = j2;
        this.hasExternalStorage = z;
        this.availExternalSize = j3;
        this.totalExternalSize = j4;
    }

    private RemoteStorageInfo(Parcel parcel) {
        this.availInternalSize = parcel.readLong();
        this.totalInternalSize = parcel.readLong();
        this.hasExternalStorage = parcel.readInt() == 1;
        this.availExternalSize = parcel.readLong();
        this.totalExternalSize = parcel.readLong();
    }
}
