package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ChunkExtractor {

    public interface Factory {
        @Nullable
        ChunkExtractor createProgressiveMediaExtractor(int primaryTrackType, Format representationFormat, boolean enableEventMessageTrack, List<Format> closedCaptionFormats, @Nullable TrackOutput playerEmsgTrackOutput);
    }

    public interface TrackOutputProvider {
        TrackOutput track(int id, int type);
    }

    @Nullable
    ChunkIndex getChunkIndex();

    @Nullable
    Format[] getSampleFormats();

    void init(@Nullable TrackOutputProvider trackOutputProvider, long startTimeUs, long endTimeUs);

    boolean read(ExtractorInput input) throws IOException;

    void release();
}
