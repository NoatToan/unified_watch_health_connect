package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new Parcelable.Creator<StreamKey>() { // from class: com.google.android.exoplayer2.offline.StreamKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey[] newArray(int i14) {
            return new StreamKey[i14];
        }
    };
    public final int groupIndex;
    public final int periodIndex;
    public final int streamIndex;

    @Deprecated
    public final int trackIndex;

    public StreamKey(Parcel parcel) {
        this.periodIndex = parcel.readInt();
        this.groupIndex = parcel.readInt();
        int i14 = parcel.readInt();
        this.streamIndex = i14;
        this.trackIndex = i14;
    }

    @Override // java.lang.Comparable
    public int compareTo(StreamKey streamKey) {
        int i14 = this.periodIndex - streamKey.periodIndex;
        if (i14 != 0) {
            return i14;
        }
        int i15 = this.groupIndex - streamKey.groupIndex;
        return i15 == 0 ? this.streamIndex - streamKey.streamIndex : i15;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.periodIndex == streamKey.periodIndex && this.groupIndex == streamKey.groupIndex && this.streamIndex == streamKey.streamIndex) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.periodIndex * 31) + this.groupIndex) * 31) + this.streamIndex;
    }

    public String toString() {
        int i14 = this.periodIndex;
        int i15 = this.groupIndex;
        int i16 = this.streamIndex;
        StringBuilder sb3 = new StringBuilder(35);
        sb3.append(i14);
        sb3.append(".");
        sb3.append(i15);
        sb3.append(".");
        sb3.append(i16);
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.periodIndex);
        parcel.writeInt(this.groupIndex);
        parcel.writeInt(this.streamIndex);
    }

    public StreamKey(int i14, int i15, int i16) {
        this.periodIndex = i14;
        this.groupIndex = i15;
        this.streamIndex = i16;
        this.trackIndex = i16;
    }

    public StreamKey(int i14, int i15) {
        this(0, i14, i15);
    }
}
