package com.huami.watch.notification.data;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import com.huami.watch.transport.SafeParcelable;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class StatusBarNotificationData implements SafeParcelable {
    public static final Parcelable.Creator<StatusBarNotificationData> CREATOR = new a();
    public static final String TAG = "Noti-StatusBar-Data";
    public String groupKey;
    public String iOSPkg;
    public byte[] iOSUid;
    public int id;
    public boolean isIOS;
    public String key;
    public NotificationData notification;
    public String pkg;
    public String tag;
    public String targetPkg;

    public class a implements Parcelable.Creator<StatusBarNotificationData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StatusBarNotificationData createFromParcel(Parcel parcel) {
            return new StatusBarNotificationData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StatusBarNotificationData[] newArray(int i) {
            return new StatusBarNotificationData[i];
        }
    }

    public /* synthetic */ StatusBarNotificationData(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static StatusBarNotificationData empty() {
        return new StatusBarNotificationData();
    }

    public static StatusBarNotificationData from(StatusBarNotification statusBarNotification) {
        StatusBarNotificationData statusBarNotificationData = new StatusBarNotificationData();
        statusBarNotificationData.pkg = statusBarNotification.getPackageName();
        statusBarNotificationData.id = statusBarNotification.getId();
        statusBarNotificationData.tag = statusBarNotification.getTag();
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            statusBarNotificationData.key = statusBarNotification.getKey();
        }
        if (i >= 21) {
            statusBarNotificationData.groupKey = statusBarNotification.getGroupKey();
        }
        if (MiPushSupport.isFromMiPush(statusBarNotificationData.pkg)) {
            statusBarNotificationData.targetPkg = MiPushSupport.retrieveTargetPkgName(statusBarNotification.getNotification());
        }
        return statusBarNotificationData;
    }

    public static StatusBarNotificationData fromIOS(String str, byte[] bArr, String str2, String str3, long j) {
        StatusBarNotificationData statusBarNotificationData = new StatusBarNotificationData();
        statusBarNotificationData.iOSPkg = str;
        statusBarNotificationData.iOSUid = bArr;
        statusBarNotificationData.isIOS = true;
        statusBarNotificationData.notification = NotificationData.fromIOS(str, bArr, str2, str3, j);
        return statusBarNotificationData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return super.toString() + SearchCriteria.LT + "Pkg : " + this.pkg + ", Id : " + this.id + ", Tag : " + this.tag + ", Key : " + this.key + ", GroupKey : " + this.groupKey + ", TargetPkg : " + this.targetPkg + SearchCriteria.GT;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pkg);
        parcel.writeInt(this.id);
        parcel.writeString(this.tag);
        parcel.writeString(this.key);
        parcel.writeString(this.groupKey);
        parcel.writeParcelable(this.notification, 0);
        parcel.writeString(this.iOSPkg);
        parcel.writeByteArray(this.iOSUid);
        parcel.writeInt(this.isIOS ? 1 : 0);
        parcel.writeString(this.targetPkg);
    }

    public StatusBarNotificationData() {
    }

    private StatusBarNotificationData(Parcel parcel) {
        this.pkg = parcel.readString();
        this.id = parcel.readInt();
        this.tag = parcel.readString();
        this.key = parcel.readString();
        this.groupKey = parcel.readString();
        this.notification = (NotificationData) parcel.readParcelable(NotificationData.class.getClassLoader());
        this.iOSPkg = parcel.readString();
        this.iOSUid = parcel.createByteArray();
        boolean z = parcel.readInt() != 0;
        this.isIOS = z;
        NotificationData notificationData = this.notification;
        if (notificationData != null) {
            notificationData.isIOS = z;
        }
        String string = parcel.readString();
        this.targetPkg = string;
        NotificationData notificationData2 = this.notification;
        if (notificationData2 != null) {
            notificationData2.key = NotificationKeyData.from(this.pkg, this.id, this.tag, this.key, string);
            this.notification.isLocal = false;
        }
    }

    public static StatusBarNotificationData from(Context context, StatusBarNotification statusBarNotification) {
        return from(context, statusBarNotification, true);
    }

    public static StatusBarNotificationData from(Context context, StatusBarNotification statusBarNotification, boolean z) {
        StatusBarNotificationData statusBarNotificationDataFrom = from(statusBarNotification);
        statusBarNotificationDataFrom.notification = NotificationData.from(context, NotificationKeyData.from(statusBarNotification), statusBarNotification.getNotification(), z);
        return statusBarNotificationDataFrom;
    }
}
