package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.Longs;
import j20.x;

/* JADX INFO: loaded from: classes13.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new Parcelable.Creator<MotionPhotoMetadata>() { // from class: com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata[] newArray(int i14) {
            return new MotionPhotoMetadata[i14];
        }
    };
    public final long photoPresentationTimestampUs;
    public final long photoSize;
    public final long photoStartPosition;
    public final long videoSize;
    public final long videoStartPosition;

    private MotionPhotoMetadata(Parcel parcel) {
        this.photoStartPosition = parcel.readLong();
        this.photoSize = parcel.readLong();
        this.photoPresentationTimestampUs = parcel.readLong();
        this.videoStartPosition = parcel.readLong();
        this.videoSize = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MotionPhotoMetadata.class == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.photoStartPosition == motionPhotoMetadata.photoStartPosition && this.photoSize == motionPhotoMetadata.photoSize && this.photoPresentationTimestampUs == motionPhotoMetadata.photoPresentationTimestampUs && this.videoStartPosition == motionPhotoMetadata.videoStartPosition && this.videoSize == motionPhotoMetadata.videoSize) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Longs.hashCode(this.videoSize) + ((Longs.hashCode(this.videoStartPosition) + ((Longs.hashCode(this.photoPresentationTimestampUs) + ((Longs.hashCode(this.photoSize) + ((Longs.hashCode(this.photoStartPosition) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        long j8 = this.photoStartPosition;
        long j14 = this.photoSize;
        long j15 = this.photoPresentationTimestampUs;
        long j16 = this.videoStartPosition;
        long j17 = this.videoSize;
        StringBuilder sb3 = new StringBuilder(218);
        sb3.append("Motion photo metadata: photoStartPosition=");
        sb3.append(j8);
        sb3.append(", photoSize=");
        sb3.append(j14);
        x.j(j15, ", photoPresentationTimestampUs=", ", videoStartPosition=", sb3);
        sb3.append(j16);
        sb3.append(", videoSize=");
        sb3.append(j17);
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.photoStartPosition);
        parcel.writeLong(this.photoSize);
        parcel.writeLong(this.photoPresentationTimestampUs);
        parcel.writeLong(this.videoStartPosition);
        parcel.writeLong(this.videoSize);
    }

    public MotionPhotoMetadata(long j8, long j14, long j15, long j16, long j17) {
        this.photoStartPosition = j8;
        this.photoSize = j14;
        this.photoPresentationTimestampUs = j15;
        this.videoStartPosition = j16;
        this.videoSize = j17;
    }
}
