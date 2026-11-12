package com.huami.watch.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.watch.transport.SafeParcelable;

/* JADX INFO: loaded from: classes11.dex */
public class WifiInfo implements SafeParcelable {
    public static final Parcelable.Creator<WifiInfo> CREATOR = new a();
    public String password;
    public String ssid;

    public class a implements Parcelable.Creator<WifiInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WifiInfo createFromParcel(Parcel parcel) {
            return new WifiInfo(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WifiInfo[] newArray(int i) {
            return new WifiInfo[i];
        }
    }

    public /* synthetic */ WifiInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssid);
        parcel.writeString(this.password);
    }

    public WifiInfo(String str, String str2) {
        this.ssid = str;
        this.password = str2 == null ? "" : str2;
    }

    private WifiInfo(Parcel parcel) {
        this.ssid = parcel.readString();
        this.password = parcel.readString();
    }
}
