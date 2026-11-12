package com.unionpay.tsmservice.data;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class NinePatchInfo implements Parcelable {
    public static final Parcelable.Creator<NinePatchInfo> CREATOR = new a();
    private Bitmap a;
    private Rect b;
    private byte[] c;

    public static class a implements Parcelable.Creator<NinePatchInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NinePatchInfo createFromParcel(Parcel parcel) {
            return new NinePatchInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NinePatchInfo[] newArray(int i) {
            return new NinePatchInfo[i];
        }
    }

    public NinePatchInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bitmap getBitmap() {
        return this.a;
    }

    public byte[] getChunk() {
        return this.c;
    }

    public Rect getPadding() {
        return this.b;
    }

    public void setBitmap(Bitmap bitmap) {
        this.a = bitmap;
    }

    public void setChunk(byte[] bArr) {
        this.c = bArr;
    }

    public void setPadding(Rect rect) {
        this.b = rect;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        byte[] bArr = this.c;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.c);
        }
    }

    public NinePatchInfo(Parcel parcel) {
        this.a = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.b = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        int i = parcel.readInt();
        if (i <= 0) {
            this.c = null;
            return;
        }
        byte[] bArr = new byte[i];
        this.c = bArr;
        parcel.readByteArray(bArr);
    }
}
