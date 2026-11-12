package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.v;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public interface TsPayloadReader {
    public static final int FLAG_DATA_ALIGNMENT_INDICATOR = 4;
    public static final int FLAG_PAYLOAD_UNIT_START_INDICATOR = 1;
    public static final int FLAG_RANDOM_ACCESS_INDICATOR = 2;

    public static final class DvbSubtitleInfo {
        public final byte[] initializationData;
        public final String language;
        public final int type;

        public DvbSubtitleInfo(String str, int i14, byte[] bArr) {
            this.language = str;
            this.type = i14;
            this.initializationData = bArr;
        }
    }

    public static final class EsInfo {
        public final byte[] descriptorBytes;
        public final List<DvbSubtitleInfo> dvbSubtitleInfos;
        public final String language;
        public final int streamType;

        public EsInfo(int i14, String str, List<DvbSubtitleInfo> list, byte[] bArr) {
            this.streamType = i14;
            this.language = str;
            this.dvbSubtitleInfos = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.descriptorBytes = bArr;
        }
    }

    public interface Factory {
        SparseArray<TsPayloadReader> createInitialPayloadReaders();

        TsPayloadReader createPayloadReader(int i14, EsInfo esInfo);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    void consume(ParsableByteArray parsableByteArray, int i14);

    void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TrackIdGenerator trackIdGenerator);

    void seek();

    public static final class TrackIdGenerator {
        private static final int ID_UNSET = Integer.MIN_VALUE;
        private final int firstTrackId;
        private String formatId;
        private final String formatIdPrefix;
        private int trackId;
        private final int trackIdIncrement;

        public TrackIdGenerator(int i14, int i15, int i16) {
            String string;
            if (i14 != Integer.MIN_VALUE) {
                StringBuilder sb3 = new StringBuilder(12);
                sb3.append(i14);
                sb3.append("/");
                string = sb3.toString();
            } else {
                string = "";
            }
            this.formatIdPrefix = string;
            this.firstTrackId = i15;
            this.trackIdIncrement = i16;
            this.trackId = Integer.MIN_VALUE;
            this.formatId = "";
        }

        private void maybeThrowUninitializedError() {
            if (this.trackId != Integer.MIN_VALUE) {
                return;
            }
            h.z("generateNewId() must be called before retrieving ids.");
        }

        public void generateNewId() {
            int i14 = this.trackId;
            int i15 = i14 == Integer.MIN_VALUE ? this.firstTrackId : i14 + this.trackIdIncrement;
            this.trackId = i15;
            String str = this.formatIdPrefix;
            this.formatId = v.b(v.a(11, str), i15, str);
        }

        public String getFormatId() {
            maybeThrowUninitializedError();
            return this.formatId;
        }

        public int getTrackId() {
            maybeThrowUninitializedError();
            return this.trackId;
        }

        public TrackIdGenerator(int i14, int i15) {
            this(Integer.MIN_VALUE, i14, i15);
        }
    }
}
