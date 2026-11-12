package com.garmin.android.apps.connectmobile.badges.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f30585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f30586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30589e;

    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(Parcel parcel) {
        HashMap map = new HashMap();
        this.f30585a = map;
        this.f30586b = new o();
        parcel.readMap(map, g.class.getClassLoader());
        this.f30586b = (o) parcel.readParcelable(g.class.getClassLoader());
        this.f30587c = parcel.readString();
        this.f30588d = parcel.readString();
        this.f30589e = parcel.readInt() == 1;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final g b(String str) {
        return (g) this.f30585a.get(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeMap(this.f30585a);
        parcel.writeParcelable(this.f30586b, 0);
        parcel.writeString(this.f30587c);
        parcel.writeString(this.f30588d);
        parcel.writeInt(this.f30589e ? 1 : 0);
    }

    public i() {
        this.f30585a = new HashMap();
        this.f30586b = new o();
    }
}
