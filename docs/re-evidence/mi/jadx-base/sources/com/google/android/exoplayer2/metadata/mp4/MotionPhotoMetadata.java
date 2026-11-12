package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.dse;

/* JADX INFO: loaded from: classes4.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8014b;
    public final long c;
    public final long d;
    public final long e;

    public class a implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata[] newArray(int i) {
            return new MotionPhotoMetadata[i];
        }
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f8013a == motionPhotoMetadata.f8013a && this.f8014b == motionPhotoMetadata.f8014b && this.c == motionPhotoMetadata.c && this.d == motionPhotoMetadata.d && this.e == motionPhotoMetadata.e;
    }

    public int hashCode() {
        return ((((((((527 + dse.e(this.f8013a)) * 31) + dse.e(this.f8014b)) * 31) + dse.e(this.c)) * 31) + dse.e(this.d)) * 31) + dse.e(this.e);
    }

    public String toString() {
        long j = this.f8013a;
        long j2 = this.f8014b;
        long j3 = this.c;
        long j4 = this.d;
        long j5 = this.e;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j);
        sb.append(", photoSize=");
        sb.append(j2);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j3);
        sb.append(", videoStartPosition=");
        sb.append(j4);
        sb.append(", videoSize=");
        sb.append(j5);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8013a);
        parcel.writeLong(this.f8014b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.f8013a = j;
        this.f8014b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f8013a = parcel.readLong();
        this.f8014b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
    }
}
