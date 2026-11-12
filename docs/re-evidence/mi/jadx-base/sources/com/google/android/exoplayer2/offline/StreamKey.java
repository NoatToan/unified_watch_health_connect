package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8049b;
    public final int c;

    public class a implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    }

    public StreamKey(int i, int i2, int i3) {
        this.f8048a = i;
        this.f8049b = i2;
        this.c = i3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i = this.f8048a - streamKey.f8048a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f8049b - streamKey.f8049b;
        return i2 == 0 ? this.c - streamKey.c : i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f8048a == streamKey.f8048a && this.f8049b == streamKey.f8049b && this.c == streamKey.c;
    }

    public int hashCode() {
        return (((this.f8048a * 31) + this.f8049b) * 31) + this.c;
    }

    public String toString() {
        int i = this.f8048a;
        int i2 = this.f8049b;
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8048a);
        parcel.writeInt(this.f8049b);
        parcel.writeInt(this.c);
    }

    public StreamKey(Parcel parcel) {
        this.f8048a = parcel.readInt();
        this.f8049b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
