package com.huami.watch.notification.data;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.watch.transport.SafeParcelable;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationKeyData implements SafeParcelable {
    public static final Parcelable.Creator<NotificationKeyData> CREATOR = new a();
    public int id;
    public String key;
    public String pkg;
    public String tag;
    public String targetPkg;

    public class a implements Parcelable.Creator<NotificationKeyData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NotificationKeyData createFromParcel(Parcel parcel) {
            return new NotificationKeyData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NotificationKeyData[] newArray(int i) {
            return new NotificationKeyData[i];
        }
    }

    public /* synthetic */ NotificationKeyData(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static NotificationKeyData from(StatusBarNotificationData statusBarNotificationData) {
        NotificationKeyData notificationKeyData = new NotificationKeyData();
        notificationKeyData.pkg = statusBarNotificationData.pkg;
        notificationKeyData.id = statusBarNotificationData.id;
        notificationKeyData.tag = statusBarNotificationData.tag;
        if (!TextUtils.isEmpty(statusBarNotificationData.key)) {
            notificationKeyData.key = statusBarNotificationData.key;
        }
        notificationKeyData.targetPkg = statusBarNotificationData.targetPkg;
        return notificationKeyData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof NotificationKeyData)) {
            return false;
        }
        NotificationKeyData notificationKeyData = (NotificationKeyData) obj;
        String str = this.key;
        if (str != null) {
            return str.equals(notificationKeyData.key);
        }
        return (this.pkg + AESEncryptionHelper.SEPARATOR + this.id + AESEncryptionHelper.SEPARATOR + this.tag).equals(notificationKeyData.pkg + AESEncryptionHelper.SEPARATOR + notificationKeyData.id + AESEncryptionHelper.SEPARATOR + notificationKeyData.tag);
    }

    public String toString() {
        return "<Pkg: '" + this.pkg + "', Id: " + this.id + ", Tag: '" + this.tag + "', Key: '" + this.key + "', TargetPkg: '" + this.targetPkg + '\'' + Typography.greater;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pkg);
        parcel.writeInt(this.id);
        parcel.writeString(this.tag);
        parcel.writeString(this.key);
        parcel.writeString(this.targetPkg);
    }

    private NotificationKeyData() {
    }

    private NotificationKeyData(Parcel parcel) {
        this.pkg = parcel.readString();
        this.id = parcel.readInt();
        this.tag = parcel.readString();
        this.key = parcel.readString();
        this.targetPkg = parcel.readString();
    }

    public static NotificationKeyData from(StatusBarNotification statusBarNotification) {
        NotificationKeyData notificationKeyData = new NotificationKeyData();
        notificationKeyData.pkg = statusBarNotification.getPackageName();
        notificationKeyData.id = statusBarNotification.getId();
        notificationKeyData.tag = statusBarNotification.getTag();
        if (Build.VERSION.SDK_INT >= 20) {
            notificationKeyData.key = statusBarNotification.getKey();
        }
        if (MiPushSupport.isFromMiPush(notificationKeyData.pkg)) {
            notificationKeyData.targetPkg = MiPushSupport.retrieveTargetPkgName(statusBarNotification.getNotification());
        }
        return notificationKeyData;
    }

    public static NotificationKeyData from(String str, int i, String str2, String str3, String str4) {
        NotificationKeyData notificationKeyData = new NotificationKeyData();
        notificationKeyData.pkg = str;
        notificationKeyData.id = i;
        notificationKeyData.tag = str2;
        if (!TextUtils.isEmpty(str3)) {
            notificationKeyData.key = str3;
        }
        notificationKeyData.targetPkg = str4;
        return notificationKeyData;
    }
}
