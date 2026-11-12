package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TimeInfo implements Parcelable {
    public static final Parcelable.Creator<TimeInfo> CREATOR = new Parcelable.Creator<TimeInfo>() { // from class: com.amap.api.services.route.TimeInfo.1
        private static TimeInfo a(Parcel parcel) {
            return new TimeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeInfo createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TimeInfo[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<TimeInfosElement> f6765b;

    public TimeInfo(Parcel parcel) {
        this.f6765b = new ArrayList();
        this.f6764a = parcel.readInt();
        this.f6765b = parcel.createTypedArrayList(TimeInfosElement.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<TimeInfosElement> getElements() {
        return this.f6765b;
    }

    public long getStartTime() {
        return this.f6764a;
    }

    public void setElements(List<TimeInfosElement> list) {
        this.f6765b = list;
    }

    public void setStartTime(long j) {
        this.f6764a = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f6764a);
        parcel.writeTypedList(this.f6765b);
    }

    public TimeInfo() {
        this.f6765b = new ArrayList();
    }
}
