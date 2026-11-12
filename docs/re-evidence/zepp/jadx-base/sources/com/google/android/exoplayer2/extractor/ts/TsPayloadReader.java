package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface TsPayloadReader {
    public static final int FLAG_DATA_ALIGNMENT_INDICATOR = 4;
    public static final int FLAG_PAYLOAD_UNIT_START_INDICATOR = 1;
    public static final int FLAG_RANDOM_ACCESS_INDICATOR = 2;

    public static final class DvbSubtitleInfo {
        public final byte[] initializationData;
        public final String language;
        public final int type;

        public DvbSubtitleInfo(String language, int type, byte[] initializationData) {
            this.language = language;
            this.type = type;
            this.initializationData = initializationData;
        }
    }

    public static final class EsInfo {
        public final byte[] descriptorBytes;
        public final List<DvbSubtitleInfo> dvbSubtitleInfos;

        @Nullable
        public final String language;
        public final int streamType;

        public EsInfo(int streamType, @Nullable String language, @Nullable List<DvbSubtitleInfo> dvbSubtitleInfos, byte[] descriptorBytes) {
            this.streamType = streamType;
            this.language = language;
            this.dvbSubtitleInfos = dvbSubtitleInfos == null ? Collections.emptyList() : Collections.unmodifiableList(dvbSubtitleInfos);
            this.descriptorBytes = descriptorBytes;
        }
    }

    public interface Factory {
        SparseArray<TsPayloadReader> createInitialPayloadReaders();

        @Nullable
        TsPayloadReader createPayloadReader(int streamType, EsInfo esInfo);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class TrackIdGenerator {
        private static final int f = Integer.MIN_VALUE;
        private final String a;
        private final int b;
        private final int c;
        private int d;
        private String e;

        public TrackIdGenerator(int firstTrackId, int trackIdIncrement) {
            this(Integer.MIN_VALUE, firstTrackId, trackIdIncrement);
        }

        private void a() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void generateNewId() {
            int i = this.d;
            int i2 = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.d = i2;
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
            sb.append(str);
            sb.append(i2);
            this.e = sb.toString();
        }

        public String getFormatId() {
            a();
            return this.e;
        }

        public int getTrackId() {
            a();
            return this.d;
        }

        public TrackIdGenerator(int programNumber, int firstTrackId, int trackIdIncrement) {
            String string;
            if (programNumber != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(12);
                sb.append(programNumber);
                sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                string = sb.toString();
            } else {
                string = "";
            }
            this.a = string;
            this.b = firstTrackId;
            this.c = trackIdIncrement;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
    }

    void consume(ParsableByteArray data, int flags) throws ParserException;

    void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TrackIdGenerator idGenerator);

    void seek();
}
