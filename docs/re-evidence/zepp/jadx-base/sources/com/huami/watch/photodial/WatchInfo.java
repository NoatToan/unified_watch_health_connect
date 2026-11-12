package com.huami.watch.photodial;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.watch.transport.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
public class WatchInfo implements SafeParcelable {
    public static final Parcelable.Creator<WatchInfo> CREATOR = new a();
    private String a;
    private long b;
    private String c;
    private String d;
    private String e;
    private long f;

    public static class a implements Parcelable.Creator<WatchInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchInfo createFromParcel(Parcel parcel) {
            return new WatchInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WatchInfo[] newArray(int i) {
            return new WatchInfo[i];
        }
    }

    public WatchInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getId() {
        return this.b;
    }

    public String getMd5() {
        return this.a;
    }

    public String getMsg() {
        return this.c;
    }

    public long getSize() {
        return this.f;
    }

    public String getUsWatchFaceName() {
        return this.e;
    }

    public String getWatchfaceName() {
        return this.d;
    }

    public void setId(long j) {
        this.b = j;
    }

    public void setMd5(String str) {
        this.a = str;
    }

    public void setMsg(String str) {
        this.c = str;
    }

    public void setSize(long j) {
        this.f = j;
    }

    public void setUsWatchFaceName(String str) {
        this.e = str;
    }

    public void setWatchfaceName(String str) {
        this.d = str;
    }

    public String toString() {
        return "WatchInfo{md5='" + this.a + "', id=" + this.b + ", msg='" + this.c + "', watchfaceName='" + this.d + "', usWatchFaceName='" + this.e + "', size=" + this.f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
    }

    public WatchInfo(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readLong();
    }
}
