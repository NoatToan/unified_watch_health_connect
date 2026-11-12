package com.ingenic.iwds.remotebroadcast;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.content.RemoteIntent;

/* JADX INFO: loaded from: classes18.dex */
class RemoteIntentInfo extends com.ingenic.iwds.remotebroadcast.a implements Parcelable {
    public static final Parcelable.Creator<RemoteIntentInfo> CREATOR = new a();
    private RemoteIntent c;

    public static class a implements Parcelable.Creator<RemoteIntentInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteIntentInfo createFromParcel(Parcel parcel) {
            return new RemoteIntentInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoteIntentInfo[] newArray(int i) {
            return new RemoteIntentInfo[i];
        }
    }

    public RemoteIntentInfo(int i, int i2, RemoteIntent remoteIntent) {
        this.a = i;
        this.b = i2;
        this.c = remoteIntent;
    }

    public RemoteIntent c() {
        return this.c;
    }

    public void d(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        if (parcel.readInt() != 0) {
            this.c = RemoteIntent.CREATOR.createFromParcel(parcel);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        RemoteIntent remoteIntent = this.c;
        if (remoteIntent != null) {
            return remoteIntent.describeContents();
        }
        return 0;
    }

    public String toString() {
        return "RemoteIntentInfo[-id" + this.b + "-Intent:" + this.c + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        if (this.c == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            this.c.writeToParcel(parcel, i);
        }
    }

    public RemoteIntentInfo(Parcel parcel) {
        d(parcel);
    }
}
