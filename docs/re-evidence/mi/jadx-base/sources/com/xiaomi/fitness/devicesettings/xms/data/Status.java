package com.xiaomi.fitness.devicesettings.xms.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class Status implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12057a;
    public static final Status RESULT_SUCCESS = new Status(0);
    public static final Status RESULT_CANCELLED = new Status(-1);
    public static final Status RESULT_TIMEOUT = new Status(-2);
    public static final Status RESULT_INTERRUPTED = new Status(-3);
    public static final Status RESULT_DISCONNECTED = new Status(-4);
    public static final Status RESULT_PACKAGE_NOT_INSTALLED = new Status(-5);
    public static final Status RESULT_SIGNATURE_VERIFY_FAILED = new Status(-6);
    public static final Status RESULT_PERMISSION_DENIED = new Status(-7);
    public static final Parcelable.Creator<Status> CREATOR = new a();

    public class a implements Parcelable.Creator<Status> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status createFromParcel(Parcel parcel) {
            return new Status(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Status[] newArray(int i) {
            return new Status[i];
        }
    }

    public Status(int i) {
        this.f12057a = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12057a);
    }

    public Status(Parcel parcel) {
        this.f12057a = parcel.readInt();
    }
}
