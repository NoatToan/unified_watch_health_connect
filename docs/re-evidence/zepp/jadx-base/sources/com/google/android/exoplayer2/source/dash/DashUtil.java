package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DashUtil {
    private DashUtil() {
    }

    @Nullable
    private static Representation a(Period period, int type) {
        int adaptationSetIndex = period.getAdaptationSetIndex(type);
        if (adaptationSetIndex == -1) {
            return null;
        }
        List<Representation> list = period.adaptationSets.get(adaptationSetIndex).representations;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static void b(ChunkExtractor chunkExtractor, DataSource dataSource, Representation representation, int baseUrlIndex, boolean loadIndex) throws IOException {
        RangedUri rangedUri = (RangedUri) Assertions.checkNotNull(representation.getInitializationUri());
        if (loadIndex) {
            RangedUri indexUri = representation.getIndexUri();
            if (indexUri == null) {
                return;
            }
            RangedUri rangedUriAttemptMerge = rangedUri.attemptMerge(indexUri, representation.baseUrls.get(baseUrlIndex).url);
            if (rangedUriAttemptMerge == null) {
                c(dataSource, representation, baseUrlIndex, chunkExtractor, rangedUri);
                rangedUri = indexUri;
            } else {
                rangedUri = rangedUriAttemptMerge;
            }
        }
        c(dataSource, representation, baseUrlIndex, chunkExtractor, rangedUri);
    }

    public static DataSpec buildDataSpec(String baseUrl, RangedUri requestUri, @Nullable String cacheKey, int flags) {
        return new DataSpec.Builder().setUri(requestUri.resolveUri(baseUrl)).setPosition(requestUri.start).setLength(requestUri.length).setKey(cacheKey).setFlags(flags).build();
    }

    private static void c(DataSource dataSource, Representation representation, int baseUrlIndex, ChunkExtractor chunkExtractor, RangedUri requestUri) throws IOException {
        new InitializationChunk(dataSource, buildDataSpec(representation.baseUrls.get(baseUrlIndex).url, requestUri, representation.getCacheKey(), 0), representation.format, 0, null, chunkExtractor).load();
    }

    private static ChunkExtractor d(int trackType, Format format) {
        String str = format.containerMimeType;
        return new BundledChunkExtractor(str != null && (str.startsWith(MimeTypes.VIDEO_WEBM) || str.startsWith(MimeTypes.AUDIO_WEBM)) ? new MatroskaExtractor() : new FragmentedMp4Extractor(), trackType, format);
    }

    @Nullable
    public static ChunkIndex loadChunkIndex(DataSource dataSource, int trackType, Representation representation, int baseUrlIndex) throws IOException {
        if (representation.getInitializationUri() == null) {
            return null;
        }
        ChunkExtractor chunkExtractorD = d(trackType, representation.format);
        try {
            b(chunkExtractorD, dataSource, representation, baseUrlIndex, true);
            return chunkExtractorD.getChunkIndex();
        } finally {
            chunkExtractorD.release();
        }
    }

    @Nullable
    public static Format loadFormatWithDrmInitData(DataSource dataSource, Period period) throws IOException {
        int i = 2;
        Representation representationA = a(period, 2);
        if (representationA == null) {
            i = 1;
            representationA = a(period, 1);
            if (representationA == null) {
                return null;
            }
        }
        Format format = representationA.format;
        Format formatLoadSampleFormat = loadSampleFormat(dataSource, i, representationA);
        return formatLoadSampleFormat == null ? format : formatLoadSampleFormat.withManifestFormatInfo(format);
    }

    public static void loadInitializationData(ChunkExtractor chunkExtractor, DataSource dataSource, Representation representation, boolean loadIndex) throws IOException {
        b(chunkExtractor, dataSource, representation, 0, loadIndex);
    }

    public static DashManifest loadManifest(DataSource dataSource, Uri uri) throws IOException {
        return (DashManifest) ParsingLoadable.load(dataSource, new DashManifestParser(), uri, 4);
    }

    @Nullable
    public static Format loadSampleFormat(DataSource dataSource, int trackType, Representation representation, int baseUrlIndex) throws IOException {
        if (representation.getInitializationUri() == null) {
            return null;
        }
        ChunkExtractor chunkExtractorD = d(trackType, representation.format);
        try {
            b(chunkExtractorD, dataSource, representation, baseUrlIndex, false);
            return ((Format[]) Assertions.checkStateNotNull(chunkExtractorD.getSampleFormats()))[0];
        } finally {
            chunkExtractorD.release();
        }
    }

    public static DataSpec buildDataSpec(Representation representation, RangedUri requestUri, int flags) {
        return buildDataSpec(representation.baseUrls.get(0).url, requestUri, representation.getCacheKey(), flags);
    }

    @Nullable
    public static ChunkIndex loadChunkIndex(DataSource dataSource, int trackType, Representation representation) throws IOException {
        return loadChunkIndex(dataSource, trackType, representation, 0);
    }

    @Nullable
    public static Format loadSampleFormat(DataSource dataSource, int trackType, Representation representation) throws IOException {
        return loadSampleFormat(dataSource, trackType, representation, 0);
    }
}
