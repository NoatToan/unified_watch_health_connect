package com.google.android.exoplayer2.source.hls;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor;
import com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor;
import com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30;
import com.google.android.exoplayer2.source.mediaparser.MediaParserUtil;
import com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.FileTypes;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(30)
public final class MediaParserHlsMediaChunkExtractor implements HlsMediaChunkExtractor {
    public static final HlsExtractorFactory FACTORY = new HlsExtractorFactory() { // from class: dx4
        @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
        public final HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput) {
            return MediaParserHlsMediaChunkExtractor.c(uri, format, list, timestampAdjuster, map, extractorInput);
        }
    };
    private final OutputConsumerAdapterV30 a;
    private final InputReaderAdapterV30 b = new InputReaderAdapterV30();
    private final MediaParser c;
    private final Format d;
    private final boolean e;
    private final ImmutableList<MediaFormat> f;
    private int g;

    public static final class b implements MediaParser.SeekableInputReader {
        private final ExtractorInput a;
        private int b;

        @Override // android.media.MediaParser.InputReader
        public long getLength() {
            return this.a.getLength();
        }

        @Override // android.media.MediaParser.InputReader
        public long getPosition() {
            return this.a.getPeekPosition();
        }

        @Override // android.media.MediaParser.InputReader
        public int read(@NonNull byte[] buffer, int offset, int readLength) throws IOException {
            int iPeek = this.a.peek(buffer, offset, readLength);
            this.b += iPeek;
            return iPeek;
        }

        @Override // android.media.MediaParser.SeekableInputReader
        public void seekToPosition(long position) {
            throw new UnsupportedOperationException();
        }

        private b(ExtractorInput extractorInput) {
            this.a = extractorInput;
        }
    }

    public MediaParserHlsMediaChunkExtractor(MediaParser mediaParser, OutputConsumerAdapterV30 outputConsumerAdapter, Format format, boolean overrideInBandCaptionDeclarations, ImmutableList<MediaFormat> muxedCaptionMediaFormats, int leadingBytesToSkip) {
        this.c = mediaParser;
        this.a = outputConsumerAdapter;
        this.e = overrideInBandCaptionDeclarations;
        this.f = muxedCaptionMediaFormats;
        this.d = format;
        this.g = leadingBytesToSkip;
    }

    @SuppressLint({"WrongConstant"})
    private static MediaParser b(MediaParser.OutputConsumer outputConsumer, Format format, boolean overrideInBandCaptionDeclarations, ImmutableList<MediaFormat> muxedCaptionMediaFormats, String... parserNames) {
        MediaParser mediaParserCreateByName = parserNames.length == 1 ? MediaParser.createByName(parserNames[0], outputConsumer) : MediaParser.create(outputConsumer, parserNames);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_EXPOSE_CAPTION_FORMATS, muxedCaptionMediaFormats);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS, Boolean.valueOf(overrideInBandCaptionDeclarations));
        Boolean bool = Boolean.TRUE;
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, bool);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, bool);
        mediaParserCreateByName.setParameter(MediaParserUtil.PARAMETER_IGNORE_TIMESTAMP_OFFSET, bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreSpliceInfoStream", bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ts.mode", "hls");
        String str = format.codecs;
        if (!TextUtils.isEmpty(str)) {
            if (!MimeTypes.AUDIO_AAC.equals(MimeTypes.getAudioMediaMimeType(str))) {
                mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreAacStream", bool);
            }
            if (!MimeTypes.VIDEO_H264.equals(MimeTypes.getVideoMediaMimeType(str))) {
                mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreAvcStream", bool);
            }
        }
        return mediaParserCreateByName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HlsMediaChunkExtractor c(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput) throws IOException {
        List listOf = list;
        if (FileTypes.inferFileTypeFromMimeType(format.sampleMimeType) == 13) {
            return new BundledHlsMediaChunkExtractor(new WebvttExtractor(format.language, timestampAdjuster), format, timestampAdjuster);
        }
        boolean z = listOf != null;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (listOf != null) {
            for (int i = 0; i < list.size(); i++) {
                builder.add(MediaParserUtil.toCaptionsMediaFormat((Format) list.get(i)));
            }
        } else {
            builder.add(MediaParserUtil.toCaptionsMediaFormat(new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA608).build()));
        }
        ImmutableList immutableListBuild = builder.build();
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30();
        if (listOf == null) {
            listOf = ImmutableList.of();
        }
        outputConsumerAdapterV30.setMuxedCaptionFormats(listOf);
        outputConsumerAdapterV30.setTimestampAdjuster(timestampAdjuster);
        MediaParser mediaParserB = b(outputConsumerAdapterV30, format, z, immutableListBuild, "android.media.mediaparser.FragmentedMp4Parser", "android.media.mediaparser.Ac3Parser", "android.media.mediaparser.Ac4Parser", "android.media.mediaparser.AdtsParser", "android.media.mediaparser.Mp3Parser", "android.media.mediaparser.TsParser");
        b bVar = new b(extractorInput);
        mediaParserB.advance(bVar);
        outputConsumerAdapterV30.setSelectedParserName(mediaParserB.getParserName());
        return new MediaParserHlsMediaChunkExtractor(mediaParserB, outputConsumerAdapterV30, format, z, immutableListBuild, bVar.b);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public void init(ExtractorOutput extractorOutput) {
        this.a.setExtractorOutput(extractorOutput);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public boolean isPackedAudioExtractor() {
        String parserName = this.c.getParserName();
        return "android.media.mediaparser.Ac3Parser".equals(parserName) || "android.media.mediaparser.Ac4Parser".equals(parserName) || "android.media.mediaparser.AdtsParser".equals(parserName) || "android.media.mediaparser.Mp3Parser".equals(parserName);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public boolean isReusable() {
        String parserName = this.c.getParserName();
        return "android.media.mediaparser.FragmentedMp4Parser".equals(parserName) || "android.media.mediaparser.TsParser".equals(parserName);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public void onTruncatedSegmentParsed() {
        this.c.seek(MediaParser.SeekPoint.START);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public boolean read(ExtractorInput extractorInput) throws IOException {
        extractorInput.skipFully(this.g);
        this.g = 0;
        this.b.setDataReader(extractorInput, extractorInput.getLength());
        return this.c.advance(this.b);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public HlsMediaChunkExtractor recreate() {
        Assertions.checkState(!isReusable());
        return new MediaParserHlsMediaChunkExtractor(b(this.a, this.d, this.e, this.f, this.c.getParserName()), this.a, this.d, this.e, this.f, 0);
    }
}
