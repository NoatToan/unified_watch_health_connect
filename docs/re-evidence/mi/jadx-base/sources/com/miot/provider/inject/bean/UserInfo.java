package com.miot.provider.inject.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10204b;
    public String c;
    public String d;
    public long e;
    public String f;
    public String g;
    public String h;
    public String i;

    public class a implements Parcelable.Creator<UserInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfo createFromParcel(Parcel parcel) {
            return new UserInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserInfo[] newArray(int i) {
            return new UserInfo[i];
        }
    }

    public UserInfo() {
    }

    public void a(Parcel parcel) {
        this.f10203a = parcel.readString();
        this.f10204b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readLong();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
    }

    public void c(String str, Parcel parcel) {
        if (str == null) {
            parcel.writeString("");
        } else {
            parcel.writeString(str);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        c(this.f10203a, parcel);
        c(this.f10204b, parcel);
        c(this.c, parcel);
        c(this.d, parcel);
        parcel.writeLong(this.e);
        c(this.f, parcel);
        c(this.g, parcel);
        c(this.h, parcel);
        c(this.i, parcel);
    }

    public UserInfo(Parcel parcel) {
        a(parcel);
    }
}
