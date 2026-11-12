package com.xiaomi.android.ble.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class Data implements Parcelable {
    public static final int FORMAT_FLOAT = 52;
    public static final int FORMAT_SFLOAT = 50;
    public static final int FORMAT_SINT16 = 34;
    public static final int FORMAT_SINT24 = 35;
    public static final int FORMAT_SINT32 = 36;
    public static final int FORMAT_SINT8 = 33;
    public static final int FORMAT_UINT16 = 18;
    public static final int FORMAT_UINT24 = 19;
    public static final int FORMAT_UINT32 = 20;
    public static final int FORMAT_UINT8 = 17;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f11128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f11127b = "0123456789ABCDEF".toCharArray();
    public static final Parcelable.Creator<Data> CREATOR = new a();

    public class a implements Parcelable.Creator<Data> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Data createFromParcel(Parcel parcel) {
            return new Data(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Data[] newArray(int i) {
            return new Data[i];
        }
    }

    public Data() {
        this.f11128a = null;
    }

    public byte[] a() {
        return this.f11128a;
    }

    public int c() {
        byte[] bArr = this.f11128a;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        if (c() == 0) {
            return "";
        }
        char[] cArr = new char[(this.f11128a.length * 3) - 1];
        int i = 0;
        while (true) {
            byte[] bArr = this.f11128a;
            if (i >= bArr.length) {
                return "(0x) " + new String(cArr);
            }
            byte b2 = bArr[i];
            int i2 = i * 3;
            char[] cArr2 = f11127b;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
            if (i != bArr.length - 1) {
                cArr[i2 + 2] = '-';
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f11128a);
    }

    public Data(byte[] bArr) {
        this.f11128a = bArr;
    }

    public Data(Parcel parcel) {
        this.f11128a = parcel.createByteArray();
    }
}
