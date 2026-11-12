package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface ChunkExtractor {

    public interface Factory {
        ChunkExtractor createProgressiveMediaExtractor(int i14, Format format, boolean z14, List<Format> list, TrackOutput trackOutput, PlayerId playerId);
    }

    public interface TrackOutputProvider {
        TrackOutput track(int i14, int i15);
    }

    ChunkIndex getChunkIndex();

    Format[] getSampleFormats();

    void init(TrackOutputProvider trackOutputProvider, long j8, long j14);

    boolean read(ExtractorInput extractorInput);

    void release();
}
