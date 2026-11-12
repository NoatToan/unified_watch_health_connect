package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wlq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8453b;
    public final int c;
    public final byte[] d;
    public int e;

    public class a implements Parcelable.Creator<ColorInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ColorInfo[] newArray(int i) {
            return new ColorInfo[i];
        }
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.f8452a = i;
        this.f8453b = i2;
        this.c = i3;
        this.d = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.f8452a == colorInfo.f8452a && this.f8453b == colorInfo.f8453b && this.c == colorInfo.c && Arrays.equals(this.d, colorInfo.d);
    }

    public int hashCode() {
        if (this.e == 0) {
            this.e = ((((((527 + this.f8452a) * 31) + this.f8453b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
        }
        return this.e;
    }

    public String toString() {
        int i = this.f8452a;
        int i2 = this.f8453b;
        int i3 = this.c;
        boolean z = this.d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8452a);
        parcel.writeInt(this.f8453b);
        parcel.writeInt(this.c);
        wlq.X0(parcel, this.d != null);
        byte[] bArr = this.d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(Parcel parcel) {
        this.f8452a = parcel.readInt();
        this.f8453b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = wlq.F0(parcel) ? parcel.createByteArray() : null;
    }
}
