package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class DataBuffer implements Parcelable {
    public static final Parcelable.Creator<DataBuffer> CREATOR = new a();
    public String URI;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bundle f13111b;
    public Bundle header;

    class a implements Parcelable.Creator<DataBuffer> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataBuffer createFromParcel(Parcel parcel) {
            return new DataBuffer(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataBuffer[] newArray(int i) {
            return new DataBuffer[i];
        }

        a() {
        }
    }

    /* synthetic */ DataBuffer(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static ClassLoader a(Class cls) {
        return cls.getClassLoader();
    }

    public DataBuffer addBody(Bundle bundle) {
        this.f13111b = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBody() {
        return this.f13111b;
    }

    public int getBodySize() {
        return this.f13111b == null ? 0 : 1;
    }

    public int getProtocol() {
        return this.f13110a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        parcel.writeInt(this.f13110a);
        parcel.writeString(this.URI);
        parcel.writeBundle(this.header);
        parcel.writeBundle(this.f13111b);
    }

    private DataBuffer(Parcel parcel) {
        this.header = null;
        this.f13110a = 1;
        this.f13111b = null;
        a(parcel);
    }

    private void a(Parcel parcel) {
        this.f13110a = parcel.readInt();
        this.URI = parcel.readString();
        this.header = parcel.readBundle(a(Bundle.class));
        this.f13111b = parcel.readBundle(a(Bundle.class));
    }

    public DataBuffer() {
        this.header = null;
        this.f13110a = 1;
        this.f13111b = null;
    }

    public DataBuffer(String str) {
        this.header = null;
        this.f13110a = 1;
        this.f13111b = null;
        this.URI = str;
    }

    public DataBuffer(String str, int i) {
        this.header = null;
        this.f13111b = null;
        this.URI = str;
        this.f13110a = i;
    }
}
