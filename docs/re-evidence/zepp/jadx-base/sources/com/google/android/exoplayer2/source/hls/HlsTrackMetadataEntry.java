package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();

    @Nullable
    public final String groupId;

    @Nullable
    public final String name;
    public final List<VariantInfo> variantInfos;

    public class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry createFromParcel(Parcel in) {
            return new HlsTrackMetadataEntry(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry[] newArray(int size) {
            return new HlsTrackMetadataEntry[size];
        }
    }

    public HlsTrackMetadataEntry(@Nullable String groupId, @Nullable String name, List<VariantInfo> variantInfos) {
        this.groupId = groupId;
        this.name = name;
        this.variantInfos = Collections.unmodifiableList(new ArrayList(variantInfos));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || HlsTrackMetadataEntry.class != other.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) other;
        return TextUtils.equals(this.groupId, hlsTrackMetadataEntry.groupId) && TextUtils.equals(this.name, hlsTrackMetadataEntry.name) && this.variantInfos.equals(hlsTrackMetadataEntry.variantInfos);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return com.google.android.exoplayer2.metadata.a.a(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format getWrappedMetadataFormat() {
        return com.google.android.exoplayer2.metadata.a.b(this);
    }

    public int hashCode() {
        String str = this.groupId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.variantInfos.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        com.google.android.exoplayer2.metadata.a.c(this, builder);
    }

    public String toString() {
        String string;
        String str = this.groupId;
        if (str != null) {
            String str2 = this.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
            sb.append(" [");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "";
        }
        String strValueOf = String.valueOf(string);
        return strValueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(strValueOf) : new String("HlsTrackMetadataEntry");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.groupId);
        dest.writeString(this.name);
        int size = this.variantInfos.size();
        dest.writeInt(size);
        for (int i = 0; i < size; i++) {
            dest.writeParcelable(this.variantInfos.get(i), 0);
        }
    }

    public HlsTrackMetadataEntry(Parcel in) {
        this.groupId = in.readString();
        this.name = in.readString();
        int i = in.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((VariantInfo) in.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.variantInfos = Collections.unmodifiableList(arrayList);
    }

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        @Nullable
        public final String audioGroupId;
        public final int averageBitrate;

        @Nullable
        public final String captionGroupId;
        public final int peakBitrate;

        @Nullable
        public final String subtitleGroupId;

        @Nullable
        public final String videoGroupId;

        public class a implements Parcelable.Creator<VariantInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public VariantInfo createFromParcel(Parcel in) {
                return new VariantInfo(in);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public VariantInfo[] newArray(int size) {
                return new VariantInfo[size];
            }
        }

        public VariantInfo(int averageBitrate, int peakBitrate, @Nullable String videoGroupId, @Nullable String audioGroupId, @Nullable String subtitleGroupId, @Nullable String captionGroupId) {
            this.averageBitrate = averageBitrate;
            this.peakBitrate = peakBitrate;
            this.videoGroupId = videoGroupId;
            this.audioGroupId = audioGroupId;
            this.subtitleGroupId = subtitleGroupId;
            this.captionGroupId = captionGroupId;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || VariantInfo.class != other.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) other;
            return this.averageBitrate == variantInfo.averageBitrate && this.peakBitrate == variantInfo.peakBitrate && TextUtils.equals(this.videoGroupId, variantInfo.videoGroupId) && TextUtils.equals(this.audioGroupId, variantInfo.audioGroupId) && TextUtils.equals(this.subtitleGroupId, variantInfo.subtitleGroupId) && TextUtils.equals(this.captionGroupId, variantInfo.captionGroupId);
        }

        public int hashCode() {
            int i = ((this.averageBitrate * 31) + this.peakBitrate) * 31;
            String str = this.videoGroupId;
            int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.audioGroupId;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.subtitleGroupId;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.captionGroupId;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.averageBitrate);
            dest.writeInt(this.peakBitrate);
            dest.writeString(this.videoGroupId);
            dest.writeString(this.audioGroupId);
            dest.writeString(this.subtitleGroupId);
            dest.writeString(this.captionGroupId);
        }

        public VariantInfo(Parcel in) {
            this.averageBitrate = in.readInt();
            this.peakBitrate = in.readInt();
            this.videoGroupId = in.readString();
            this.audioGroupId = in.readString();
            this.subtitleGroupId = in.readString();
            this.captionGroupId = in.readString();
        }
    }
}
