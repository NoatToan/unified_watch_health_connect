package androidx.media3.muxer;

import androidx.media3.common.Metadata;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4OrientationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.XmpData;

/* JADX INFO: loaded from: classes21.dex */
public final class Mp4Utils {
    public static final long UNSIGNED_INT_MAX_VALUE = 4294967295L;

    private Mp4Utils() {
    }

    public static boolean isMetadataSupported(Metadata.Entry entry) {
        if ((entry instanceof Mp4OrientationData) || (entry instanceof Mp4LocationData)) {
            return true;
        }
        if ((entry instanceof Mp4TimestampData) && isMp4TimestampDataSupported((Mp4TimestampData) entry)) {
            return true;
        }
        return ((entry instanceof MdtaMetadataEntry) && isMdtaMetadataEntrySupported((MdtaMetadataEntry) entry)) || (entry instanceof XmpData);
    }

    private static boolean isMdtaMetadataEntrySupported(MdtaMetadataEntry mdtaMetadataEntry) {
        return mdtaMetadataEntry.typeIndicator == 1 || mdtaMetadataEntry.typeIndicator == 23;
    }

    private static boolean isMp4TimestampDataSupported(Mp4TimestampData mp4TimestampData) {
        return mp4TimestampData.creationTimestampSeconds <= UNSIGNED_INT_MAX_VALUE && mp4TimestampData.modificationTimestampSeconds <= UNSIGNED_INT_MAX_VALUE;
    }
}
