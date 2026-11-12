package com.huami.watch.transport;

import android.os.Parcel;
import android.os.Parcelable;
import com.twitter.sdk.android.tweetcomposer.g;

/* JADX INFO: loaded from: classes5.dex */
public class Status implements Parcelable {
    public static final int CANCEL_CODE = 0;
    public static final Parcelable.Creator<Status> CREATOR = new a();
    public static final int DEFAULT_CODE = -1;
    public static final int SUCCESS_CODE = 1;
    private int a;

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
        this.a = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Status getStatus() {
        return this;
    }

    public boolean isCanceled() {
        return this.a == 0;
    }

    public boolean isSuccess() {
        return this.a == 1;
    }

    public String toString() {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? " " : "success";
        }
        return g.g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public Status(Parcel parcel) {
        this.a = parcel.readInt();
    }
}
