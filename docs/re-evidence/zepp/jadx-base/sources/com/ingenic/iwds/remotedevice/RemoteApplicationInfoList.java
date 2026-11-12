package com.ingenic.iwds.remotedevice;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
class RemoteApplicationInfoList implements Parcelable {
    public static final Parcelable.Creator<RemoteApplicationInfoList> CREATOR = new a();
    private List<RemoteApplicationInfo> a;

    public static class a implements Parcelable.Creator<RemoteApplicationInfoList> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteApplicationInfoList createFromParcel(Parcel parcel) {
            return new RemoteApplicationInfoList(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoteApplicationInfoList[] newArray(int i) {
            return new RemoteApplicationInfoList[i];
        }
    }

    public /* synthetic */ RemoteApplicationInfoList(Parcel parcel, a aVar) {
        this(parcel);
    }

    public List<RemoteApplicationInfo> a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }

    public RemoteApplicationInfoList() {
    }

    public RemoteApplicationInfoList(PackageManager packageManager, List<PackageInfo> list) {
        this.a = new ArrayList();
        Iterator<PackageInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            this.a.add(new RemoteApplicationInfo(packageManager, it2.next()));
        }
    }

    private RemoteApplicationInfoList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        parcel.readList(arrayList, RemoteApplicationInfo.class.getClassLoader());
    }
}
