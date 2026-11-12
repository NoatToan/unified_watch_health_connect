package com.xiaomi.youpin.login.entity.account;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class RefreshServiceTokenResult implements Parcelable {
    public static final Parcelable.Creator<RefreshServiceTokenResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14490b;
    public String c;
    public String d;
    public String e;
    public long f;

    public class a implements Parcelable.Creator<RefreshServiceTokenResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RefreshServiceTokenResult createFromParcel(Parcel parcel) {
            return new RefreshServiceTokenResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RefreshServiceTokenResult[] newArray(int i) {
            return new RefreshServiceTokenResult[i];
        }
    }

    public RefreshServiceTokenResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14489a);
        parcel.writeString(this.f14490b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
    }

    public RefreshServiceTokenResult(Parcel parcel) {
        this.f14489a = parcel.readString();
        this.f14490b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readLong();
    }
}
