package androidx.media3.transformer;

import android.content.Context;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
final class Mp4Info {
    public final Format audioFormat;
    public final long durationUs;
    public final long firstSyncSampleTimestampUsAfterTimeUs;
    public final long lastSyncSampleTimestampUs;
    public final Format videoFormat;

    private Mp4Info(long j, long j2, long j3, Format format, Format format2) {
        this.durationUs = j;
        this.lastSyncSampleTimestampUs = j2;
        this.firstSyncSampleTimestampUsAfterTimeUs = j3;
        this.videoFormat = format;
        this.audioFormat = format2;
    }

    public static Mp4Info create(Context context, String str) throws IOException {
        return create(context, str, C.TIME_UNSET);
    }

    public static Mp4Info create(Context context, String str, long j) throws IOException {
        Format format;
        long j2;
        long j3;
        long j4;
        PositionHolder positionHolder;
        Mp4Extractor mp4Extractor = new Mp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 16);
        ExtractorOutputImpl extractorOutputImpl = new ExtractorOutputImpl();
        DefaultDataSource defaultDataSource = new DefaultDataSource(context, false);
        try {
            long jOpen = defaultDataSource.open(new DataSpec.Builder().setUri(str).build());
            Assertions.checkState(jOpen != 0);
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(defaultDataSource, 0L, jOpen);
            Assertions.checkState(mp4Extractor.sniff(defaultExtractorInput), "The MP4 file is invalid");
            mp4Extractor.init(extractorOutputImpl);
            PositionHolder positionHolder2 = new PositionHolder();
            while (!extractorOutputImpl.seekMapInitialized) {
                int i = mp4Extractor.read(defaultExtractorInput, positionHolder2);
                if (i == 1) {
                    defaultDataSource.close();
                    long jOpen2 = defaultDataSource.open(new DataSpec.Builder().setUri(str).setPosition(positionHolder2.position).build());
                    if (jOpen2 != -1) {
                        jOpen2 += positionHolder2.position;
                    }
                    positionHolder = positionHolder2;
                    defaultExtractorInput = new DefaultExtractorInput(defaultDataSource, positionHolder2.position, jOpen2);
                } else {
                    positionHolder = positionHolder2;
                    if (i == -1 && !extractorOutputImpl.seekMapInitialized) {
                        throw new IllegalStateException("The MP4 file is invalid");
                    }
                }
                positionHolder2 = positionHolder;
            }
            long durationUs = mp4Extractor.getDurationUs();
            if (extractorOutputImpl.videoTrackId != -1) {
                format = (Format) Assertions.checkNotNull(((ExtractorOutputImpl.TrackOutputImpl) Assertions.checkNotNull(extractorOutputImpl.trackTypeToTrackOutput.get(2))).format);
                Assertions.checkState(durationUs != C.TIME_UNSET);
                long j5 = mp4Extractor.getSeekPoints(durationUs, extractorOutputImpl.videoTrackId).first.timeUs;
                if (j != C.TIME_UNSET) {
                    SeekMap.SeekPoints seekPoints = mp4Extractor.getSeekPoints(j, extractorOutputImpl.videoTrackId);
                    if (j == seekPoints.first.timeUs) {
                        j4 = seekPoints.first.timeUs;
                    } else {
                        j4 = j <= seekPoints.second.timeUs ? seekPoints.second.timeUs : Long.MIN_VALUE;
                    }
                    j3 = j4;
                } else {
                    j3 = -9223372036854775807L;
                }
                j2 = j5;
            } else {
                format = null;
                j2 = -9223372036854775807L;
                j3 = -9223372036854775807L;
            }
            Mp4Info mp4Info = new Mp4Info(durationUs, j2, j3, format, extractorOutputImpl.audioTrackId != -1 ? (Format) Assertions.checkNotNull(((ExtractorOutputImpl.TrackOutputImpl) Assertions.checkNotNull(extractorOutputImpl.trackTypeToTrackOutput.get(1))).format) : null);
            DataSourceUtil.closeQuietly(defaultDataSource);
            mp4Extractor.release();
            return mp4Info;
        } catch (Throwable th) {
            DataSourceUtil.closeQuietly(defaultDataSource);
            mp4Extractor.release();
            throw th;
        }
    }

    static final class ExtractorOutputImpl implements ExtractorOutput {
        public boolean seekMapInitialized;
        public int videoTrackId = -1;
        public int audioTrackId = -1;
        final Map<Integer, TrackOutputImpl> trackTypeToTrackOutput = new HashMap();

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public TrackOutput track(int i, int i2) {
            if (i2 == 2) {
                this.videoTrackId = i;
            } else if (i2 == 1) {
                this.audioTrackId = i;
            }
            TrackOutputImpl trackOutputImpl = this.trackTypeToTrackOutput.get(Integer.valueOf(i2));
            if (trackOutputImpl != null) {
                return trackOutputImpl;
            }
            TrackOutputImpl trackOutputImpl2 = new TrackOutputImpl();
            this.trackTypeToTrackOutput.put(Integer.valueOf(i2), trackOutputImpl2);
            return trackOutputImpl2;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            this.seekMapInitialized = true;
        }

        static final class TrackOutputImpl implements TrackOutput {
            private static final int FIXED_BYTE_ARRAY_SIZE = 16000;
            private final byte[] byteArray = new byte[16000];
            public Format format;

            @Override // androidx.media3.extractor.TrackOutput
            public void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
            }

            @Override // androidx.media3.extractor.TrackOutput
            public void format(Format format) {
                this.format = format;
            }

            @Override // androidx.media3.extractor.TrackOutput
            public int sampleData(DataReader dataReader, int i, boolean z, int i2) throws IOException {
                int i3 = i;
                while (i3 > 0) {
                    boolean z2 = false;
                    int i4 = dataReader.read(this.byteArray, 0, Math.min(i3, this.byteArray.length));
                    if (i4 != -1) {
                        z2 = true;
                    }
                    Assertions.checkState(z2);
                    i3 -= i4;
                }
                return i;
            }

            @Override // androidx.media3.extractor.TrackOutput
            public void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
                while (i > 0) {
                    int iMin = Math.min(i, this.byteArray.length);
                    parsableByteArray.readBytes(this.byteArray, 0, iMin);
                    i -= iMin;
                }
            }
        }
    }
}
