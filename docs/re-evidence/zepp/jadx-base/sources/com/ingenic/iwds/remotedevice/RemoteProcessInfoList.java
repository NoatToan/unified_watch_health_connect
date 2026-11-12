package com.ingenic.iwds.remotedevice;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
class RemoteProcessInfoList implements Parcelable {
    public static final Parcelable.Creator<RemoteProcessInfoList> CREATOR = new a();
    public List<RemoteProcessInfo> a;

    public static class a implements Parcelable.Creator<RemoteProcessInfoList> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteProcessInfoList createFromParcel(Parcel parcel) {
            return new RemoteProcessInfoList(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoteProcessInfoList[] newArray(int i) {
            return new RemoteProcessInfoList[i];
        }
    }

    public /* synthetic */ RemoteProcessInfoList(Parcel parcel, a aVar) {
        this(parcel);
    }

    public void a(RemoteProcessInfo remoteProcessInfo) {
        this.a.add(remoteProcessInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }

    public RemoteProcessInfoList() {
        this.a = new ArrayList();
    }

    private RemoteProcessInfoList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        parcel.readList(arrayList, RemoteProcessInfo.class.getClassLoader());
    }
}
