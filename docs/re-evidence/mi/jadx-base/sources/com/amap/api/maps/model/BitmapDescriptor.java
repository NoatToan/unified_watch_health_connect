package com.amap.api.maps.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;
import defpackage.zns;

/* JADX INFO: loaded from: classes4.dex */
@JBindingInclude
public final class BitmapDescriptor implements Parcelable, Cloneable {
    public static final BitmapDescriptorCreator CREATOR = new BitmapDescriptorCreator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f6428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6429b;

    @JBindingInclude
    protected Object mBitmap;

    @JBindingInclude
    private String mId;

    public BitmapDescriptor(Bitmap bitmap, String str) {
        this.f6428a = 0;
        this.f6429b = 0;
        if (bitmap != null) {
            try {
                this.f6428a = bitmap.getWidth();
                this.f6429b = bitmap.getHeight();
                if (bitmap.getConfig() == null) {
                    this.mBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                } else {
                    this.mBitmap = bitmap.copy(bitmap.getConfig(), true);
                }
            } catch (Throwable th) {
                zns.E(th);
                return;
            }
        }
        this.mId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        BitmapDescriptor bitmapDescriptor;
        Object obj2;
        Object obj3 = this.mBitmap;
        if (obj3 == null || ((Bitmap) obj3).isRecycled() || obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (BitmapDescriptor.class == obj.getClass() && (obj2 = (bitmapDescriptor = (BitmapDescriptor) obj).mBitmap) != null && !((Bitmap) obj2).isRecycled() && this.f6428a == bitmapDescriptor.getWidth() && this.f6429b == bitmapDescriptor.getHeight()) {
            try {
                return ((Bitmap) this.mBitmap).sameAs((Bitmap) bitmapDescriptor.mBitmap);
            } catch (Throwable th) {
                zns.E(th);
            }
        }
        return false;
    }

    public final Bitmap getBitmap() {
        return (Bitmap) this.mBitmap;
    }

    public final int getHeight() {
        return this.f6429b;
    }

    public final String getId() {
        return this.mId;
    }

    public final int getWidth() {
        return this.f6428a;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final void recycle() {
        try {
            zns.C((Bitmap) this.mBitmap);
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeParcelable((Bitmap) this.mBitmap, i);
        parcel.writeInt(this.f6428a);
        parcel.writeInt(this.f6429b);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final BitmapDescriptor m82clone() {
        try {
            Object obj = this.mBitmap;
            return new BitmapDescriptor(((Bitmap) obj).copy(((Bitmap) obj).getConfig(), true), this.f6428a, this.f6429b, this.mId);
        } catch (Throwable th) {
            th.printStackTrace();
            zns.E(th);
            return null;
        }
    }

    private BitmapDescriptor(Bitmap bitmap, int i, int i2, String str) {
        this.f6428a = i;
        this.f6429b = i2;
        this.mBitmap = bitmap;
        this.mId = str;
    }
}
