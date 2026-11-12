package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.DummyExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.collect.ImmutableList;
import com.huami.account.UserLegalInfoManager;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(30)
@SuppressLint({"Override"})
public final class OutputConsumerAdapterV30 implements MediaParser.OutputConsumer {
    private static final String A = "chunk-index-long-us-times";
    private static final Pattern B;
    private static final String u = "OutputConsumerAdapterV30";
    private static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> v;
    private static final String w = "track-type-string";
    private static final String x = "chunk-index-int-sizes";
    private static final String y = "chunk-index-long-offsets";
    private static final String z = "chunk-index-long-us-durations";
    private final ArrayList<TrackOutput> a;
    private final ArrayList<Format> b;
    private final ArrayList<MediaCodec.CryptoInfo> c;
    private final ArrayList<TrackOutput.CryptoData> d;
    private final b e;
    private final boolean f;
    private final int g;

    @Nullable
    private final Format h;
    private ExtractorOutput i;

    @Nullable
    private MediaParser.SeekMap j;

    @Nullable
    private MediaParser.SeekMap k;

    @Nullable
    private String l;

    @Nullable
    private ChunkIndex m;

    @Nullable
    private TimestampAdjuster n;
    private List<Format> o;
    private int p;
    private long q;
    private boolean r;
    private boolean s;
    private boolean t;

    public static final class b implements DataReader {

        @Nullable
        public MediaParser.InputReader a;

        private b() {
        }

        @Override // com.google.android.exoplayer2.upstream.DataReader
        public int read(byte[] buffer, int offset, int length) throws IOException {
            return ((MediaParser.InputReader) Util.castNonNull(this.a)).read(buffer, offset, length);
        }
    }

    public static final class c implements SeekMap {
        private final MediaParser.SeekMap a;

        public c(MediaParser.SeekMap adaptedSeekMap) {
            this.a = adaptedSeekMap;
        }

        private static SeekPoint a(MediaParser.SeekPoint seekPoint) {
            return new SeekPoint(seekPoint.timeMicros, seekPoint.position);
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            long durationMicros = this.a.getDurationMicros();
            return durationMicros != ParserMinimalBase.MIN_INT_L ? durationMicros : C.TIME_UNSET;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long timeUs) {
            Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints = this.a.getSeekPoints(timeUs);
            Object obj = seekPoints.first;
            return obj == seekPoints.second ? new SeekMap.SeekPoints(a((MediaParser.SeekPoint) obj)) : new SeekMap.SeekPoints(a((MediaParser.SeekPoint) obj), a((MediaParser.SeekPoint) seekPoints.second));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return this.a.isSeekable();
        }
    }

    static {
        MediaParser.SeekPoint seekPoint = MediaParser.SeekPoint.START;
        v = Pair.create(seekPoint, seekPoint);
        B = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");
    }

    public OutputConsumerAdapterV30() {
        this(null, 7, false);
    }

    private void a(int trackIndex) {
        for (int size = this.a.size(); size <= trackIndex; size++) {
            this.a.add(null);
            this.b.add(null);
            this.c.add(null);
            this.d.add(null);
        }
    }

    private static byte[] b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Nullable
    private static ColorInfo c(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        byte[] bArrB = byteBuffer != null ? b(byteBuffer) : null;
        int integer = mediaFormat.getInteger("color-transfer", -1);
        int integer2 = mediaFormat.getInteger("color-range", -1);
        int integer3 = mediaFormat.getInteger("color-standard", -1);
        if (bArrB == null && integer == -1 && integer2 == -1 && integer3 == -1) {
            return null;
        }
        return new ColorInfo(integer3, integer2, integer, bArrB);
    }

    private static int d(MediaFormat mediaFormat, String key, int returnValueIfPresent) {
        if (mediaFormat.getInteger(key, 0) != 0) {
            return returnValueIfPresent;
        }
        return 0;
    }

    private static List<byte[]> e(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(b(byteBuffer));
            i = i2;
        }
    }

    private static String f(String parserName) {
        parserName.hashCode();
        switch (parserName) {
            case "android.media.mediaparser.Mp4Parser":
            case "android.media.mediaparser.FragmentedMp4Parser":
                return MimeTypes.VIDEO_MP4;
            case "android.media.mediaparser.OggParser":
                return MimeTypes.AUDIO_OGG;
            case "android.media.mediaparser.TsParser":
                return MimeTypes.VIDEO_MP2T;
            case "android.media.mediaparser.AdtsParser":
                return MimeTypes.AUDIO_AAC;
            case "android.media.mediaparser.WavParser":
                return MimeTypes.AUDIO_RAW;
            case "android.media.mediaparser.PsParser":
                return MimeTypes.VIDEO_PS;
            case "android.media.mediaparser.Ac3Parser":
                return MimeTypes.AUDIO_AC3;
            case "android.media.mediaparser.AmrParser":
                return MimeTypes.AUDIO_AMR;
            case "android.media.mediaparser.FlacParser":
                return MimeTypes.AUDIO_FLAC;
            case "android.media.mediaparser.MatroskaParser":
                return MimeTypes.VIDEO_WEBM;
            case "android.media.mediaparser.Ac4Parser":
                return MimeTypes.AUDIO_AC4;
            case "android.media.mediaparser.Mp3Parser":
                return MimeTypes.AUDIO_MPEG;
            case "android.media.mediaparser.FlvParser":
                return MimeTypes.VIDEO_FLV;
            default:
                throw new IllegalArgumentException(parserName.length() != 0 ? "Illegal parser name: ".concat(parserName) : new String("Illegal parser name: "));
        }
    }

    private static int g(MediaFormat mediaFormat) {
        return d(mediaFormat, "is-forced-subtitle", 2) | d(mediaFormat, "is-autoselect", 4) | 0 | d(mediaFormat, "is-default", 1);
    }

    private void h() {
        if (!this.r || this.s) {
            return;
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (this.a.get(i) == null) {
                return;
            }
        }
        this.i.endTracks();
        this.s = true;
    }

    private boolean i(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(x);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        LongBuffer longBufferAsLongBuffer = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(y))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer2 = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(z))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer3 = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(A))).asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        ChunkIndex chunkIndex = new ChunkIndex(iArr, jArr, jArr2, jArr3);
        this.m = chunkIndex;
        this.i.seekMap(chunkIndex);
        return true;
    }

    @Nullable
    private TrackOutput.CryptoData j(int trackIndex, @Nullable MediaCodec.CryptoInfo cryptoInfo) {
        int i;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.c.get(trackIndex) == cryptoInfo) {
            return (TrackOutput.CryptoData) Assertions.checkNotNull(this.d.get(trackIndex));
        }
        int i2 = 0;
        try {
            Matcher matcher = B.matcher(cryptoInfo.toString());
            matcher.find();
            int i3 = Integer.parseInt((String) Util.castNonNull(matcher.group(1)));
            i = Integer.parseInt((String) Util.castNonNull(matcher.group(2)));
            i2 = i3;
        } catch (RuntimeException e) {
            String strValueOf = String.valueOf(cryptoInfo);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 43);
            sb.append("Unexpected error while parsing CryptoInfo: ");
            sb.append(strValueOf);
            Log.e(u, sb.toString(), e);
            i = 0;
        }
        TrackOutput.CryptoData cryptoData = new TrackOutput.CryptoData(cryptoInfo.mode, cryptoInfo.key, i2, i);
        this.c.set(trackIndex, cryptoInfo);
        this.d.set(trackIndex, cryptoData);
        return cryptoData;
    }

    @Nullable
    private static DrmInitData k(@Nullable String schemeType, @Nullable android.media.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeInitDataCount];
        for (int i = 0; i < schemeInitDataCount; i++) {
            android.media.DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i);
            schemeDataArr[i] = new DrmInitData.SchemeData(schemeInitDataAt.uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new DrmInitData(schemeType, schemeDataArr);
    }

    private Format l(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        Format.Builder accessibilityChannel = new Format.Builder().setDrmInitData(k(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData)).setContainerMimeType(this.l).setPeakBitrate(mediaFormat.getInteger("bitrate", -1)).setChannelCount(mediaFormat.getInteger("channel-count", -1)).setColorInfo(c(mediaFormat)).setSampleMimeType(string).setCodecs(mediaFormat.getString("codecs-string")).setFrameRate(mediaFormat.getFloat("frame-rate", -1.0f)).setWidth(mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, -1)).setHeight(mediaFormat.getInteger("height", -1)).setInitializationData(e(mediaFormat)).setLanguage(mediaFormat.getString(UserLegalInfoManager.KEY_LANGUAGE)).setMaxInputSize(mediaFormat.getInteger("max-input-size", -1)).setPcmEncoding(mediaFormat.getInteger("exo-pcm-encoding", -1)).setRotationDegrees(mediaFormat.getInteger("rotation-degrees", 0)).setSampleRate(mediaFormat.getInteger("sample-rate", -1)).setSelectionFlags(g(mediaFormat)).setEncoderDelay(mediaFormat.getInteger("encoder-delay", 0)).setEncoderPadding(mediaFormat.getInteger("encoder-padding", 0)).setPixelWidthHeightRatio(mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f)).setSubsampleOffsetUs(mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE)).setAccessibilityChannel(integer);
        for (int i = 0; i < this.o.size(); i++) {
            Format format = this.o.get(i);
            if (Util.areEqual(format.sampleMimeType, string) && format.accessibilityChannel == integer) {
                accessibilityChannel.setLanguage(format.language).setRoleFlags(format.roleFlags).setSelectionFlags(format.selectionFlags).setLabel(format.label).setMetadata(format.metadata);
                break;
            }
        }
        return accessibilityChannel.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    private static int m(@Nullable String string) {
        if (string == null) {
            return -1;
        }
        switch (string) {
            case "metadata":
                return 5;
            case "unknown":
                return -1;
            case "text":
                return 3;
            case "audio":
                return 1;
            case "video":
                return 2;
            default:
                return MimeTypes.getTrackType(string);
        }
    }

    public void disableSeeking() {
        this.t = true;
    }

    @Nullable
    public ChunkIndex getChunkIndex() {
        return this.m;
    }

    @Nullable
    public MediaParser.SeekMap getDummySeekMap() {
        return this.j;
    }

    @Nullable
    public Format[] getSampleFormats() {
        if (!this.r) {
            return null;
        }
        Format[] formatArr = new Format[this.b.size()];
        for (int i = 0; i < this.b.size(); i++) {
            formatArr[i] = (Format) Assertions.checkNotNull(this.b.get(i));
        }
        return formatArr;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> getSeekPoints(long seekTimeUs) {
        MediaParser.SeekMap seekMap = this.k;
        return seekMap != null ? seekMap.getSeekPoints(seekTimeUs) : v;
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSampleCompleted(int trackIndex, long timeUs, int flags, int size, int offset, @Nullable MediaCodec.CryptoInfo cryptoInfo) {
        long j = this.q;
        if (j == C.TIME_UNSET || timeUs < j) {
            TimestampAdjuster timestampAdjuster = this.n;
            if (timestampAdjuster != null) {
                timeUs = timestampAdjuster.adjustSampleTimestamp(timeUs);
            }
            ((TrackOutput) Assertions.checkNotNull(this.a.get(trackIndex))).sampleMetadata(timeUs, flags, size, offset, j(trackIndex, cryptoInfo));
        }
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSampleDataFound(int trackIndex, MediaParser.InputReader sampleData) throws IOException {
        a(trackIndex);
        this.e.a = sampleData;
        TrackOutput trackOutputTrack = this.a.get(trackIndex);
        if (trackOutputTrack == null) {
            trackOutputTrack = this.i.track(trackIndex, -1);
            this.a.set(trackIndex, trackOutputTrack);
        }
        trackOutputTrack.sampleData((DataReader) this.e, (int) sampleData.getLength(), true);
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        SeekMap cVar;
        if (this.f && this.j == null) {
            this.j = seekMap;
            return;
        }
        this.k = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        ExtractorOutput extractorOutput = this.i;
        if (this.t) {
            if (durationMicros == ParserMinimalBase.MIN_INT_L) {
                durationMicros = C.TIME_UNSET;
            }
            cVar = new SeekMap.Unseekable(durationMicros);
        } else {
            cVar = new c(seekMap);
        }
        extractorOutput.seekMap(cVar);
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onTrackCountFound(int numberOfTracks) {
        this.r = true;
        h();
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onTrackDataFound(int trackIndex, MediaParser.TrackData trackData) {
        if (i(trackData.mediaFormat)) {
            return;
        }
        a(trackIndex);
        TrackOutput trackOutput = this.a.get(trackIndex);
        if (trackOutput == null) {
            String string = trackData.mediaFormat.getString(w);
            int iM = m(string != null ? string : trackData.mediaFormat.getString("mime"));
            if (iM == this.g) {
                this.p = trackIndex;
            }
            TrackOutput trackOutputTrack = this.i.track(trackIndex, iM);
            this.a.set(trackIndex, trackOutputTrack);
            if (string != null) {
                return;
            } else {
                trackOutput = trackOutputTrack;
            }
        }
        Format formatL = l(trackData);
        Format format = this.h;
        trackOutput.format((format == null || trackIndex != this.p) ? formatL : formatL.withManifestFormatInfo(format));
        this.b.set(trackIndex, formatL);
        h();
    }

    public void setExtractorOutput(ExtractorOutput extractorOutput) {
        this.i = extractorOutput;
    }

    public void setMuxedCaptionFormats(List<Format> muxedCaptionFormats) {
        this.o = muxedCaptionFormats;
    }

    public void setSampleTimestampUpperLimitFilterUs(long sampleTimestampUpperLimitFilterUs) {
        this.q = sampleTimestampUpperLimitFilterUs;
    }

    public void setSelectedParserName(String parserName) {
        this.l = f(parserName);
    }

    public void setTimestampAdjuster(TimestampAdjuster timestampAdjuster) {
        this.n = timestampAdjuster;
    }

    public OutputConsumerAdapterV30(@Nullable Format primaryTrackManifestFormat, int primaryTrackType, boolean expectDummySeekMap) {
        this.f = expectDummySeekMap;
        this.h = primaryTrackManifestFormat;
        this.g = primaryTrackType;
        this.a = new ArrayList<>();
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        this.e = new b();
        this.i = new DummyExtractorOutput();
        this.q = C.TIME_UNSET;
        this.o = ImmutableList.of();
    }
}
