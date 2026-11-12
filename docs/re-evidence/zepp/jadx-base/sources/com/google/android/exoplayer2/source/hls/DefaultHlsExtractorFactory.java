package com.google.android.exoplayer2.source.hls;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.ts.Ac4Extractor;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.FileTypes;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultHlsExtractorFactory implements HlsExtractorFactory {
    private static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    private final int a;
    private final boolean b;

    public DefaultHlsExtractorFactory() {
        this(0, true);
    }

    private static void a(int fileType, List<Integer> fileTypes) {
        if (Ints.indexOf(c, fileType) == -1 || fileTypes.contains(Integer.valueOf(fileType))) {
            return;
        }
        fileTypes.add(Integer.valueOf(fileType));
    }

    @Nullable
    @SuppressLint({"SwitchIntDef"})
    private Extractor b(int fileType, Format format, @Nullable List<Format> muxedCaptionFormats, TimestampAdjuster timestampAdjuster) {
        if (fileType == 0) {
            return new Ac3Extractor();
        }
        if (fileType == 1) {
            return new Ac4Extractor();
        }
        if (fileType == 2) {
            return new AdtsExtractor();
        }
        if (fileType == 7) {
            return new Mp3Extractor(0, 0L);
        }
        if (fileType == 8) {
            return c(timestampAdjuster, format, muxedCaptionFormats);
        }
        if (fileType == 11) {
            return d(this.a, this.b, format, muxedCaptionFormats, timestampAdjuster);
        }
        if (fileType != 13) {
            return null;
        }
        return new WebvttExtractor(format.language, timestampAdjuster);
    }

    private static FragmentedMp4Extractor c(TimestampAdjuster timestampAdjuster, Format format, @Nullable List<Format> muxedCaptionFormats) {
        int i = e(format) ? 4 : 0;
        if (muxedCaptionFormats == null) {
            muxedCaptionFormats = Collections.emptyList();
        }
        return new FragmentedMp4Extractor(i, timestampAdjuster, null, muxedCaptionFormats);
    }

    private static TsExtractor d(int userProvidedPayloadReaderFactoryFlags, boolean exposeCea608WhenMissingDeclarations, Format format, @Nullable List<Format> muxedCaptionFormats, TimestampAdjuster timestampAdjuster) {
        int i = userProvidedPayloadReaderFactoryFlags | 16;
        if (muxedCaptionFormats != null) {
            i |= 32;
        } else {
            muxedCaptionFormats = exposeCea608WhenMissingDeclarations ? Collections.singletonList(new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA608).build()) : Collections.emptyList();
        }
        String str = format.codecs;
        if (!TextUtils.isEmpty(str)) {
            if (!MimeTypes.containsCodecsCorrespondingToMimeType(str, MimeTypes.AUDIO_AAC)) {
                i |= 2;
            }
            if (!MimeTypes.containsCodecsCorrespondingToMimeType(str, MimeTypes.VIDEO_H264)) {
                i |= 4;
            }
        }
        return new TsExtractor(2, timestampAdjuster, new DefaultTsPayloadReaderFactory(i, muxedCaptionFormats));
    }

    private static boolean e(Format format) {
        Metadata metadata = format.metadata;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) entry).variantInfos.isEmpty();
            }
        }
        return false;
    }

    private static boolean f(Extractor extractor, ExtractorInput input) throws IOException {
        try {
            return extractor.sniff(input);
        } catch (EOFException unused) {
            return false;
        } finally {
            input.resetPeekPosition();
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
    public /* bridge */ /* synthetic */ HlsMediaChunkExtractor createExtractor(Uri uri, Format format, @Nullable List muxedCaptionFormats, TimestampAdjuster timestampAdjuster, Map responseHeaders, ExtractorInput sniffingExtractorInput) throws IOException {
        return createExtractor(uri, format, (List<Format>) muxedCaptionFormats, timestampAdjuster, (Map<String, List<String>>) responseHeaders, sniffingExtractorInput);
    }

    public DefaultHlsExtractorFactory(int payloadReaderFactoryFlags, boolean exposeCea608WhenMissingDeclarations) {
        this.a = payloadReaderFactoryFlags;
        this.b = exposeCea608WhenMissingDeclarations;
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
    public BundledHlsMediaChunkExtractor createExtractor(Uri uri, Format format, @Nullable List<Format> muxedCaptionFormats, TimestampAdjuster timestampAdjuster, Map<String, List<String>> responseHeaders, ExtractorInput sniffingExtractorInput) throws IOException {
        int iInferFileTypeFromMimeType = FileTypes.inferFileTypeFromMimeType(format.sampleMimeType);
        int iInferFileTypeFromResponseHeaders = FileTypes.inferFileTypeFromResponseHeaders(responseHeaders);
        int iInferFileTypeFromUri = FileTypes.inferFileTypeFromUri(uri);
        int[] iArr = c;
        ArrayList arrayList = new ArrayList(iArr.length);
        a(iInferFileTypeFromMimeType, arrayList);
        a(iInferFileTypeFromResponseHeaders, arrayList);
        a(iInferFileTypeFromUri, arrayList);
        for (int i : iArr) {
            a(i, arrayList);
        }
        Extractor extractor = null;
        sniffingExtractorInput.resetPeekPosition();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            Extractor extractor2 = (Extractor) Assertions.checkNotNull(b(iIntValue, format, muxedCaptionFormats, timestampAdjuster));
            if (f(extractor2, sniffingExtractorInput)) {
                return new BundledHlsMediaChunkExtractor(extractor2, format, timestampAdjuster);
            }
            if (extractor == null && (iIntValue == iInferFileTypeFromMimeType || iIntValue == iInferFileTypeFromResponseHeaders || iIntValue == iInferFileTypeFromUri || iIntValue == 11)) {
                extractor = extractor2;
            }
        }
        return new BundledHlsMediaChunkExtractor((Extractor) Assertions.checkNotNull(extractor), format, timestampAdjuster);
    }
}
