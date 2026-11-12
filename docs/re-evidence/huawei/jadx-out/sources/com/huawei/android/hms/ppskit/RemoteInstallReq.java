package com.huawei.android.hms.ppskit;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteInstallReq implements Parcelable {
    public static final Parcelable.Creator<RemoteInstallReq> CREATOR = new Parcelable.Creator<RemoteInstallReq>() { // from class: com.huawei.android.hms.ppskit.RemoteInstallReq.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteInstallReq[] newArray(int i) {
            return new RemoteInstallReq[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteInstallReq createFromParcel(Parcel parcel) {
            return new RemoteInstallReq(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5124c;
    private String d;
    private String e;
    private int f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5122a);
        parcel.writeString(this.f5123b);
        parcel.writeString(this.f5124c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }

    private void a(Parcel parcel) {
        this.f5122a = parcel.readString();
        this.f5123b = parcel.readString();
        this.f5124c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readInt();
    }

    public RemoteInstallReq(String str, String str2, String str3, String str4, String str5, int i) {
        this.f5122a = str;
        this.f5123b = str2;
        this.f5124c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
    }

    protected RemoteInstallReq(Parcel parcel) {
        a(parcel);
    }

    public RemoteInstallReq() {
    }
}
