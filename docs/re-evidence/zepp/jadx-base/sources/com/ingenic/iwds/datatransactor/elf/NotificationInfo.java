package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class NotificationInfo implements Parcelable {
    public static final Parcelable.Creator<NotificationInfo> CREATOR = new Parcelable.Creator<NotificationInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.NotificationInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NotificationInfo createFromParcel(Parcel parcel) {
            NotificationInfo notificationInfo = new NotificationInfo();
            notificationInfo.id = -1L;
            notificationInfo.appName = parcel.readString();
            notificationInfo.packageName = parcel.readString();
            notificationInfo.title = parcel.readString();
            notificationInfo.content = parcel.readString();
            notificationInfo.updateTime = parcel.readLong();
            notificationInfo.read = -1;
            return notificationInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NotificationInfo[] newArray(int i) {
            return new NotificationInfo[i];
        }
    };
    public String appName;
    public String content;
    public long id;
    public String packageName;
    public int read;
    public String title;
    public long updateTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "NotificationInfo [id=" + this.id + ", appName=" + this.appName + ", packageName=" + this.packageName + ", title=" + this.title + ", content=" + this.content + ", updateTime=" + this.updateTime + ", read=" + this.read + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appName);
        parcel.writeString(this.packageName);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeLong(this.updateTime);
    }
}
