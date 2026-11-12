package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class InitializationChunk extends Chunk {
    private final ChunkExtractor a;
    private ChunkExtractor.TrackOutputProvider b;
    private long c;
    private volatile boolean d;

    public InitializationChunk(DataSource dataSource, DataSpec dataSpec, Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, 2, trackFormat, trackSelectionReason, trackSelectionData, C.TIME_UNSET, C.TIME_UNSET);
        this.a = chunkExtractor;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
        this.d = true;
    }

    public void init(ChunkExtractor.TrackOutputProvider trackOutputProvider) {
        this.b = trackOutputProvider;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws IOException {
        if (this.c == 0) {
            this.a.init(this.b, C.TIME_UNSET, C.TIME_UNSET);
        }
        try {
            DataSpec dataSpecSubrange = this.dataSpec.subrange(this.c);
            StatsDataSource statsDataSource = this.dataSource;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(statsDataSource, dataSpecSubrange.position, statsDataSource.open(dataSpecSubrange));
            while (!this.d && this.a.read(defaultExtractorInput)) {
                try {
                } catch (Throwable th) {
                    this.c = defaultExtractorInput.getPosition() - this.dataSpec.position;
                    throw th;
                }
            }
            this.c = defaultExtractorInput.getPosition() - this.dataSpec.position;
            Util.closeQuietly(this.dataSource);
        } catch (Throwable th2) {
            Util.closeQuietly(this.dataSource);
            throw th2;
        }
    }
}
