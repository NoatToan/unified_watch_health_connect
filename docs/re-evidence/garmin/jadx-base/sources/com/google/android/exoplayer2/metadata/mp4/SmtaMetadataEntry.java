package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.Floats;

/* JADX INFO: loaded from: classes13.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new Parcelable.Creator<SmtaMetadataEntry>() { // from class: com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SmtaMetadataEntry[] newArray(int i14) {
            return new SmtaMetadataEntry[i14];
        }
    };
    public final float captureFrameRate;
    public final int svcTemporalLayerCount;

    private SmtaMetadataEntry(Parcel parcel) {
        this.captureFrameRate = parcel.readFloat();
        this.svcTemporalLayerCount = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SmtaMetadataEntry.class == obj.getClass()) {
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            if (this.captureFrameRate == smtaMetadataEntry.captureFrameRate && this.svcTemporalLayerCount == smtaMetadataEntry.svcTemporalLayerCount) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Floats.hashCode(this.captureFrameRate) + 527) * 31) + this.svcTemporalLayerCount;
    }

    public String toString() {
        float f14 = this.captureFrameRate;
        int i14 = this.svcTemporalLayerCount;
        StringBuilder sb3 = new StringBuilder(73);
        sb3.append("smta: captureFrameRate=");
        sb3.append(f14);
        sb3.append(", svcTemporalLayerCount=");
        sb3.append(i14);
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeFloat(this.captureFrameRate);
        parcel.writeInt(this.svcTemporalLayerCount);
    }

    public SmtaMetadataEntry(float f14, int i14) {
        this.captureFrameRate = f14;
        this.svcTemporalLayerCount = i14;
    }
}
