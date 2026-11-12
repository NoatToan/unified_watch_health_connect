package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;

/* JADX INFO: loaded from: classes2.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    private final long a;
    private final ExtractorOutput b;

    public class a implements SeekMap {
        public final /* synthetic */ SeekMap a;

        public a(final SeekMap val$seekMap) {
            this.a = val$seekMap;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.a.getDurationUs();
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long timeUs) {
            SeekMap.SeekPoints seekPoints = this.a.getSeekPoints(timeUs);
            SeekPoint seekPoint = seekPoints.first;
            SeekPoint seekPoint2 = new SeekPoint(seekPoint.timeUs, seekPoint.position + StartOffsetExtractorOutput.this.a);
            SeekPoint seekPoint3 = seekPoints.second;
            return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.timeUs, seekPoint3.position + StartOffsetExtractorOutput.this.a));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return this.a.isSeekable();
        }
    }

    public StartOffsetExtractorOutput(long startOffset, ExtractorOutput extractorOutput) {
        this.a = startOffset;
        this.b = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        this.b.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.b.seekMap(new a(seekMap));
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int id, int type) {
        return this.b.track(id, type);
    }
}
