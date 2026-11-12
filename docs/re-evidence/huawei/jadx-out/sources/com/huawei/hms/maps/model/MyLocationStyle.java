package com.huawei.hms.maps.model;

import android.graphics.Color;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes10.dex */
public class MyLocationStyle implements Parcelable {
    public static final Parcelable.Creator<MyLocationStyle> CREATOR = new maa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f14268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f14269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BitmapDescriptor f14270c;
    private int d;

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MyLocationStyle createFromParcel(Parcel parcel) {
            return new MyLocationStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MyLocationStyle[] newArray(int i) {
            return new MyLocationStyle[i];
        }

        maa() {
        }
    }

    public MyLocationStyle() {
        this.f14268a = 0.5f;
        this.f14269b = 0.5f;
        this.d = Color.argb(56, 117, 112, 255);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected MyLocationStyle(Parcel parcel) {
        this.f14268a = 0.5f;
        this.f14269b = 0.5f;
        this.d = Color.argb(56, 117, 112, 255);
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f14268a = parcelReader.readFloat(2, 0.0f);
        this.f14269b = parcelReader.readFloat(3, 0.0f);
        IBinder iBinder = parcelReader.readIBinder(4, null);
        if (iBinder != null) {
            this.f14270c = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.d = parcelReader.readInt(5, 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeFloat(2, this.f14268a);
        parcelWrite.writeFloat(3, this.f14269b);
        BitmapDescriptor bitmapDescriptor = this.f14270c;
        parcelWrite.writeIBinder(4, bitmapDescriptor != null ? bitmapDescriptor.getObject().asBinder() : null, true);
        parcelWrite.writeInt(5, this.d);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public MyLocationStyle radiusFillColor(int i) {
        this.d = i;
        return this;
    }

    public MyLocationStyle myLocationIcon(BitmapDescriptor bitmapDescriptor) {
        this.f14270c = bitmapDescriptor;
        return this;
    }

    public int getRadiusFillColor() {
        return this.d;
    }

    public BitmapDescriptor getMyLocationIcon() {
        return this.f14270c;
    }

    public float getAnchorV() {
        return this.f14269b;
    }

    public float getAnchorU() {
        return this.f14268a;
    }

    public MyLocationStyle anchor(float f, float f2) {
        this.f14268a = f;
        this.f14269b = f2;
        return this;
    }
}
