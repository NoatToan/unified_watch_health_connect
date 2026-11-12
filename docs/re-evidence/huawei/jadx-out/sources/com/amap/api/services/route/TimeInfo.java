package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TimeInfo implements Parcelable {
    public static final Parcelable.Creator<TimeInfo> CREATOR = new Parcelable.Creator<TimeInfo>() { // from class: com.amap.api.services.route.TimeInfo.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TimeInfo[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeInfo createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static TimeInfo a(Parcel parcel) {
            return new TimeInfo(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f3835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<TimeInfosElement> f3836b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getStartTime() {
        return this.f3835a;
    }

    public void setStartTime(long j) {
        this.f3835a = j;
    }

    public List<TimeInfosElement> getElements() {
        return this.f3836b;
    }

    public void setElements(List<TimeInfosElement> list) {
        this.f3836b = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3835a);
        parcel.writeTypedList(this.f3836b);
    }

    public TimeInfo(Parcel parcel) {
        this.f3836b = new ArrayList();
        this.f3835a = parcel.readInt();
        this.f3836b = parcel.createTypedArrayList(TimeInfosElement.CREATOR);
    }

    public TimeInfo() {
        this.f3836b = new ArrayList();
    }
}
