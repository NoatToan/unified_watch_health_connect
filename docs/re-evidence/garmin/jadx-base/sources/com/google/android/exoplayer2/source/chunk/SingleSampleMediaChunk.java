package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;

/* JADX INFO: loaded from: classes14.dex */
public final class SingleSampleMediaChunk extends BaseMediaChunk {
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final Format sampleFormat;
    private final int trackType;

    public SingleSampleMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i14, Object obj, long j8, long j14, long j15, int i15, Format format2) {
        super(dataSource, dataSpec, format, i14, obj, j8, j14, C.TIME_UNSET, C.TIME_UNSET, j15);
        this.trackType = i15;
        this.sampleFormat = format2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() {
        BaseMediaChunkOutput output = getOutput();
        output.setSampleOffsetUs(0L);
        int iSampleData = 0;
        TrackOutput trackOutputTrack = output.track(0, this.trackType);
        trackOutputTrack.format(this.sampleFormat);
        try {
            long jOpen = this.dataSource.open(this.dataSpec.subrange(this.nextLoadPosition));
            if (jOpen != -1) {
                jOpen += this.nextLoadPosition;
            }
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(this.dataSource, this.nextLoadPosition, jOpen);
            while (true) {
                long j8 = this.nextLoadPosition;
                if (iSampleData == -1) {
                    trackOutputTrack.sampleMetadata(this.startTimeUs, 1, (int) j8, 0, null);
                    DataSourceUtil.closeQuietly(this.dataSource);
                    this.loadCompleted = true;
                    return;
                }
                this.nextLoadPosition = j8 + ((long) iSampleData);
                iSampleData = trackOutputTrack.sampleData((DataReader) defaultExtractorInput, Integer.MAX_VALUE, true);
            }
        } catch (Throwable th3) {
            DataSourceUtil.closeQuietly(this.dataSource);
            throw th3;
        }
    }
}
