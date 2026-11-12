package com.xiaomi.xms.wearable.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class Permission implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14476a;
    public static final Permission DEVICE_MANAGER = new Permission("data_manager");
    public static final Permission NOTIFY = new Permission("notify");
    public static final Parcelable.Creator<Permission> CREATOR = new a();

    public class a implements Parcelable.Creator<Permission> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Permission createFromParcel(Parcel parcel) {
            return new Permission(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Permission[] newArray(int i) {
            return new Permission[i];
        }
    }

    public Permission(String str) {
        this.f14476a = str;
    }

    public String a() {
        return this.f14476a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14476a);
    }

    public Permission(Parcel parcel) {
        this.f14476a = parcel.readString();
    }
}
