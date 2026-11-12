package com.ingenic.iwds.remotebroadcast;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.content.RemoteIntent;

/* JADX INFO: loaded from: classes18.dex */
class RemoteBroadcast implements Parcelable {
    public static final Parcelable.Creator<RemoteBroadcast> CREATOR = new a();
    private int a;
    private RemoteIntent b;
    private String c;
    private boolean d;
    private boolean e;

    public static class a implements Parcelable.Creator<RemoteBroadcast> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteBroadcast createFromParcel(Parcel parcel) {
            return new RemoteBroadcast(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoteBroadcast[] newArray(int i) {
            return new RemoteBroadcast[i];
        }
    }

    public RemoteBroadcast(int i, Intent intent) {
        this(i, intent, (String) null);
    }

    public int a() {
        return this.a;
    }

    public RemoteIntent b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public boolean d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        RemoteIntent remoteIntent = this.b;
        if (remoteIntent != null) {
            return remoteIntent.describeContents();
        }
        return 0;
    }

    public boolean e() {
        return this.d;
    }

    public void f(Parcel parcel) {
        this.a = parcel.readInt();
        if (parcel.readInt() != 0) {
            this.b = RemoteIntent.CREATOR.createFromParcel(parcel);
        }
        this.c = parcel.readString();
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        if (this.b != null) {
            parcel.writeInt(1);
            this.b.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public RemoteBroadcast(int i, Intent intent, String str) {
        this(i, intent, str, false, false);
    }

    public RemoteBroadcast(int i, Intent intent, String str, boolean z, boolean z2) {
        this(i, RemoteIntent.fromIntent(intent), str, z, z2);
    }

    public RemoteBroadcast(int i, RemoteIntent remoteIntent) {
        this(i, remoteIntent, (String) null);
    }

    public RemoteBroadcast(int i, RemoteIntent remoteIntent, String str) {
        this(i, remoteIntent, str, false, false);
    }

    public RemoteBroadcast(int i, RemoteIntent remoteIntent, String str, boolean z, boolean z2) {
        this.a = i;
        this.b = remoteIntent;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    public RemoteBroadcast(Parcel parcel) {
        f(parcel);
    }
}
