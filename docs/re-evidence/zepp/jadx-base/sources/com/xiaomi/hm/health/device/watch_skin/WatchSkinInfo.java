package com.xiaomi.hm.health.device.watch_skin;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public class WatchSkinInfo implements Parcelable {
    public static final Parcelable.Creator<WatchSkinInfo> CREATOR = new a();
    public String deviceType;
    public int downloads;
    public String fwVersion;
    public int id;
    public String name;
    public String skinBin;
    public String skinSize;
    public String[] thumbnails;

    public class a implements Parcelable.Creator<WatchSkinInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchSkinInfo createFromParcel(Parcel parcel) {
            return new WatchSkinInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WatchSkinInfo[] newArray(int i) {
            return new WatchSkinInfo[i];
        }
    }

    public WatchSkinInfo() {
        this.fwVersion = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "id: " + this.id + "\ndeviceType: " + this.deviceType + "\ndownloads: " + this.downloads + "\nname: " + this.name + "\nskinBin: " + this.skinBin + "\nskinSize: " + this.skinSize + "\nthumbnails: " + Arrays.toString(this.thumbnails) + "\nfwVersion: " + this.fwVersion;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.deviceType);
        parcel.writeInt(this.downloads);
        parcel.writeString(this.name);
        parcel.writeString(this.skinBin);
        parcel.writeString(this.skinSize);
        String[] strArr = this.thumbnails;
        if (strArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(strArr.length);
            parcel.writeStringArray(this.thumbnails);
        }
        parcel.writeString(this.fwVersion);
    }

    private WatchSkinInfo(Parcel parcel) {
        this.fwVersion = null;
        this.id = parcel.readInt();
        this.deviceType = parcel.readString();
        this.downloads = parcel.readInt();
        this.name = parcel.readString();
        this.skinBin = parcel.readString();
        this.skinSize = parcel.readString();
        int i = parcel.readInt();
        if (i > 0) {
            String[] strArr = new String[i];
            this.thumbnails = strArr;
            parcel.readStringArray(strArr);
        }
        this.fwVersion = parcel.readString();
    }
}
