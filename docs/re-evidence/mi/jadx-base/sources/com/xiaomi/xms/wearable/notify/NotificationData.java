package com.xiaomi.xms.wearable.notify;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationData implements Parcelable {
    public static final Parcelable.Creator<NotificationData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14484b;

    public class a implements Parcelable.Creator<NotificationData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NotificationData createFromParcel(Parcel parcel) {
            return new NotificationData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NotificationData[] newArray(int i) {
            return new NotificationData[i];
        }
    }

    public NotificationData() {
    }

    public String a() {
        return this.f14484b;
    }

    public String c() {
        return this.f14483a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14483a);
        parcel.writeString(this.f14484b);
    }

    public NotificationData(Parcel parcel) {
        this.f14483a = parcel.readString();
        this.f14484b = parcel.readString();
    }
}
