package com.ingenic.iwds.remotedevice;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteProcessInfo implements Parcelable {
    public static final Parcelable.Creator<RemoteProcessInfo> CREATOR = new a();
    public int memSize;
    public int pid;
    public String processName;
    public int uid;

    public static class a implements Parcelable.Creator<RemoteProcessInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteProcessInfo createFromParcel(Parcel parcel) {
            return new RemoteProcessInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoteProcessInfo[] newArray(int i) {
            return new RemoteProcessInfo[i];
        }
    }

    public /* synthetic */ RemoteProcessInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    public void a(Parcel parcel) {
        this.processName = parcel.readString();
        this.pid = parcel.readInt();
        this.uid = parcel.readInt();
        this.memSize = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.processName);
        parcel.writeInt(this.pid);
        parcel.writeInt(this.uid);
        parcel.writeInt(this.memSize);
    }

    public RemoteProcessInfo(String str, int i, int i2, int i3) {
        this.processName = str;
        this.pid = i;
        this.uid = i2;
        this.memSize = i3;
    }

    private RemoteProcessInfo(Parcel parcel) {
        a(parcel);
    }
}
