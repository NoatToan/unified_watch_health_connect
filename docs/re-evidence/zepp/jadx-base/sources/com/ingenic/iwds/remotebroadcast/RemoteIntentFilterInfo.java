package com.ingenic.iwds.remotebroadcast;

import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
class RemoteIntentFilterInfo extends com.ingenic.iwds.remotebroadcast.a implements Parcelable {
    public static final Parcelable.Creator<RemoteIntentFilterInfo> CREATOR = new a();
    private IntentFilter c;
    private String d;

    public static class a implements Parcelable.Creator<RemoteIntentFilterInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteIntentFilterInfo createFromParcel(Parcel parcel) {
            return new RemoteIntentFilterInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoteIntentFilterInfo[] newArray(int i) {
            return new RemoteIntentFilterInfo[i];
        }
    }

    public RemoteIntentFilterInfo(int i, int i2, IntentFilter intentFilter, String str) {
        this.a = i;
        this.b = i2;
        this.c = intentFilter;
        this.d = str;
    }

    public IntentFilter c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        if (parcel.readInt() != 0) {
            this.c = (IntentFilter) IntentFilter.CREATOR.createFromParcel(parcel);
        }
        this.d = parcel.readString();
    }

    public String toString() {
        return "RemoteIntentFilterInfo[id:" + this.b + "-IntentFilter:" + this.c + "-permission:" + this.d + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        if (this.c != null) {
            parcel.writeInt(1);
            this.c.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.d);
    }

    public RemoteIntentFilterInfo(Parcel parcel) {
        e(parcel);
    }
}
