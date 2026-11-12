package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes18.dex */
public class SyncTimeInfo implements Parcelable {
    public static final Parcelable.Creator<SyncTimeInfo> CREATOR = new Parcelable.Creator<SyncTimeInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.SyncTimeInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SyncTimeInfo createFromParcel(Parcel parcel) {
            SyncTimeInfo syncTimeInfo = new SyncTimeInfo();
            syncTimeInfo.currenttime = parcel.readLong();
            syncTimeInfo.timezoneid = parcel.readString();
            return syncTimeInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SyncTimeInfo[] newArray(int i) {
            return new SyncTimeInfo[i];
        }
    };
    public long currenttime = System.currentTimeMillis();
    public String timezoneid = TimeZone.getDefault().getID();

    private String TimetoString(long j) {
        if (j < 0) {
            return null;
        }
        return new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss ").format(new Date(j));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "currenttime = " + TimetoString(this.currenttime) + ", timezoneid =" + this.timezoneid + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.currenttime);
        parcel.writeString(this.timezoneid);
    }
}
